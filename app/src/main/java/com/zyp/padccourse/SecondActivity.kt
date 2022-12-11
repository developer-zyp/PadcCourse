package com.zyp.padccourse

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import com.zyp.padccourse.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    private val IMAGE_REQUEST_CODE = 100
    private val CAMERA_REQUEST_CODE = 200

    companion object {
        val IE_DATA_TO_SHOW = "DATA_TO_SHOW"
        val IE_DATA_TO_RETURN = "DATA_TO_RETURN"

        fun newIntent(context: Context): Intent {
            return Intent(context, SecondActivity::class.java)
        }

        fun newIntent(context: Context, dataToShow: String): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(IE_DATA_TO_SHOW, dataToShow)
            return intent
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataMessage = intent.getStringExtra(IE_DATA_TO_SHOW)
        binding.tvMessage.text = dataMessage

        binding.btnChooseImage.setOnClickListener {
//            val intent = Intent(Intent.ACTION_GET_CONTENT)
//            intent.type = "image/*"
////            startActivity(intent)
//            startActivityForResult(intent, IMAGE_REQUEST_CODE)

            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, CAMERA_REQUEST_CODE)
        }

        binding.btnGoToYoutube.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(intent)

        }

        binding.btnBackToFirst.setOnClickListener {
            val intent = Intent()
            intent.putExtra(IE_DATA_TO_RETURN, "Fine. Thank you and you?")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == Activity.RESULT_OK && data != null) {
            val image = data.data
            binding.ivSelectedImage.setImageURI(image)
        }

        if (requestCode == CAMERA_REQUEST_CODE && resultCode == Activity.RESULT_OK && data != null) {
            val image = data.extras?.get("data") as Bitmap
            binding.ivSelectedImage.setImageBitmap(image)
        }
    }

}