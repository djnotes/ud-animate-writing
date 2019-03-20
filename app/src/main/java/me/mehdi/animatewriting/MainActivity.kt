package me.mehdi.animatewriting

import androidx.appcompat.app.AppCompatActivity

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var mImage: ImageView
    lateinit var mButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton = findViewById(R.id.start)
        mImage = findViewById(R.id.imageView)

        mButton.setOnClickListener { (mImage.drawable as AnimatedVectorDrawable).start() }
    }
}
