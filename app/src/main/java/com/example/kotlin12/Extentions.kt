package com.example.kotlin12

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(context: Context, url: String){
    Glide.with(context).load(url).centerCrop().placeholder(R.drawable.ic_launcher_background).into(this)
}