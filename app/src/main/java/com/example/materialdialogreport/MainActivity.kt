package com.example.materialdialogreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.launch_bottom_sheet_button).setOnClickListener {
            BottomSheetDialog().show(supportFragmentManager, "bottom_sheet_dialog")
        }
    }
}