package com.krystalove.task3.view

import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.krystalove.task3.models.shapes.Rectangle
import android.view.View
import com.krystalove.task3.R
import kotlinx.android.synthetic.main.activity_rectangle.*

class RectangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        var whatWay = -1
        radioGroup.clearCheck()
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioButtonSides -> {
                    coords_layout.visibility = View.GONE
                    sides_layout.visibility = View.VISIBLE
                    calculate_button.visibility = View.VISIBLE
                    whatWay = 1
                }
                R.id.radioButtonCoords ->{
                    coords_layout.visibility = View.VISIBLE
                    sides_layout.visibility = View.GONE
                    calculate_button.visibility = View.VISIBLE
                    whatWay = 2
                }
                else -> throw IllegalArgumentException("lol")
            }
        }
        calculate_button.setOnClickListener{
            when(whatWay){
                1->{
                    if(!width_et.text.isEmpty()&&!height_et.text.isEmpty()){
                        val width = width_et.text.toString().toInt()
                        val height = height_et.text.toString().toInt()
                        Rectangle(width,height).also {
                            square_text.text = "Square: " + it.square().toString()
                            perimeter_text.text ="Perimeter: " + it.perimeter().toString()
                        }
                    }
                }
                2->{
                    if(!x1_et.text.isEmpty()&&!x2_et.text.isEmpty()&&!y1_et.text.isEmpty()&&!y2_et.text.isEmpty()){
                        val x1 = x1_et.text.toString().toInt()
                        val x2 = x2_et.text.toString().toInt()
                        val y1 = y1_et.text.toString().toInt()
                        val y2 = y2_et.text.toString().toInt()
                        Rectangle(x1,y1,x2,y2).also {
                            square_text.text = "Square: " + it.square().toString()
                            perimeter_text.text = "Perimeter: " + it.perimeter().toString()
                        }
                    }
                }
            }
        }
    }
}
