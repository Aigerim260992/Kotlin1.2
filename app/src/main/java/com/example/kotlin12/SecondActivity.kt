package com.example.kotlin12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val url = intent.getStringExtra("msg")

        if(  intent.getStringExtra("msg") != null){
            url?.let { img_view.loadImage(this, it) }
        } else{
            img_view.loadImage(this, createList())
        }

    }

    private fun createList(): String {
        var image: String
        var images: Array<String> = arrayOf("https://i.pinimg.com/originals/ab/b6/a8/abb6a800ab2193fcedd9bda566b7402c.jpg",
            "https://memax.club/wp-content/uploads/2019/05/55-176.jpg",
            "https://xaxa-net.ru/uploads/posts/2019-07/1562076597_krasivye-foto-leta_xaxa-net.ru-1.jpg",
        "https://i.pinimg.com/736x/d9/86/a9/d986a9476263f1e9399e2f0f6020f6da.jpg",
        "https://st2.depositphotos.com/1273995/7196/i/600/depositphotos_71962361-stock-photo-hands-in-shape-of-love.jpg")
        val random = (0..2).random()
        image = images[random]
        return image
    }




}