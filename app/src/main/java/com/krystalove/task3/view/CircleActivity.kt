package com.krystalove.task3.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.krystalove.task3.R
import com.krystalove.task3.models.shapes.Circle
import kotlinx.android.synthetic.main.activity_circle.*

class CircleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        calculate_button.setOnClickListener {
            if(!radius_et.text.isEmpty()){
                val radius = radius_et.text.toString().toDouble()
                Circle(radius).also {
                    square_text.text = "Square: " + "%.2f".format(it.square())
                    perimeter_text.text = "Perimeter: " + it.perimeter().toString()
                }
            }
        }
    }
}
