package com.example.chjz.rep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun selectPosition(view: View) {
        val toast1 = Toast.makeText(this, "please complete selectPosition", LENGTH_SHORT)
        toast1.show()
        // write something here
    }
    fun selectDate(view: View) {
        val toast2 = Toast.makeText(this, "please complete selectDate", LENGTH_SHORT)
        toast2.show()
        // write something here
    }
    fun showMore(view: View) {
        val toast3 = Toast.makeText(this, "please complete showMore", LENGTH_SHORT)
        toast3.show()
        // write something here
    }
    fun selectImage(view: View) {
        val toast4 = Toast.makeText(this, "please complete selectImage", LENGTH_SHORT)
        toast4.show()
        // write something here
    }
}
