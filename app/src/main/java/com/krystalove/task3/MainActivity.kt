package com.krystalove.task3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.krystalove.task3.models.shapes.Circle
import com.krystalove.task3.view.CircleActivity
import com.krystalove.task3.view.RectangleActivity
import com.krystalove.task3.view.TriangleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private var whatShape = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ArrayAdapter.createFromResource(this,R.array.shapes,android.R.layout.simple_spinner_item).also {
            adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
            }
        spinner.onItemSelectedListener = this

        go_button.setOnClickListener {
            lateinit var intent:Intent
            when(whatShape) {
                "Circle" -> intent = Intent(this,CircleActivity::class.java)
                "Rectangle" -> intent = Intent(this, RectangleActivity::class.java)
                "Triangle" -> intent = Intent(this, TriangleActivity::class.java)
            }
            startActivity(intent)
        }

    }
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        whatShape = parent?.getItemAtPosition(position).toString()
    }

}

