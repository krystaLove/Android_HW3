package com.krystalove.task3.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.krystalove.task3.R
import com.krystalove.task3.models.shapes.Triangle
import kotlinx.android.synthetic.main.activity_triangle.*

class TriangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        calculate_button.setOnClickListener {
            if(!a_et.text.isEmpty()&&!b_et.text.isEmpty()&&!c_et.text.isEmpty()){
                val a = a_et.text.toString().toInt()
                val b = b_et.text.toString().toInt()
                val c = c_et.text.toString().toInt()
                Triangle(a,b,c).also {
                    square_text.text = "Square: " + "%.2f".format(it.square())
                    perimeter_text.text = "Perimeter: "+"%.2f".format(it.perimeter())
                }
            }
        }
    }
}
