package com.mindorks.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TestActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
        button=findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            var e=Emp()
            var d=0
        })
    }
    class Emp{
        lateinit var str:String
        var s=""
    }
}