package com.krystalove.task3.models.shapes

import java.lang.Math.abs

class Rectangle{

    var width:Int
    var height:Int

    constructor(x1:Int, y1:Int, x2:Int, y2:Int){
        this.width = abs(x1-x2)
        this.height = abs(y1-y2)
    }
    constructor(width: Int, height: Int){
        this.width = width
        this.height = height
    }

    fun square() = width*height
    fun perimeter() = 2*(width+height)
}