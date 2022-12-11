package com.zyp.padccourse

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zyp.padccourse.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity(R.layout.activity_first) {

    private lateinit var binding: ActivityFirstBinding

    companion object {
        val IE_DATA_TO_RETURN = "DATA_TO_RETURN"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Kotlin Android Extensions is deprecated,
//        which means that using Kotlin synthetics for view binding is no longer supported.
//        setContentView(R.layout.activity_first)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnClickMe.setOnClickListener {
//            Toast.makeText(this, "Welcome To Activity", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)

//            startActivity(SecondActivity.newIntent(this))

//            startActivity(SecondActivity.newIntent(this, "Hello, How are you?"))

            startActivityForResult(SecondActivity.newIntent(this, "Hello, How are you?"), 100)

        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == Activity.RESULT_OK && data != null) {
            val dataReturn = data.getStringExtra(IE_DATA_TO_RETURN)
            binding.textView.text = dataReturn
        }

    }

}