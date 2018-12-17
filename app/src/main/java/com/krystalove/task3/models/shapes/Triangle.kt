package com.krystalove.task3.models.shapes

import kotlin.math.sqrt

class Triangle(val a:Int, val b:Int, val c:Int){
    private val perimeter:Int = a+b+c
    private val halfPerimeter:Double = (perimeter/2).toDouble()

    fun square():Double = sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c))
    fun perimeter() = if(square() != 0.0) perimeter else 0.0
}