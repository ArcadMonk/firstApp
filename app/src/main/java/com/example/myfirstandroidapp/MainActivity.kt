package com.example.myfirstandroidapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

private val TAG = "MyActivity"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_id.setOnClickListener { edited_text_id.text = edited_text_id.text.toString() + "E"}
        val names = listOf("Antoine", "Baptiste ", "Emilie", "Jerome", "Gus")
        names.sortedBy { it.length }
        Log.d( TAG , names.toString())
        namesList_id.text = names.toString()
    }
}
