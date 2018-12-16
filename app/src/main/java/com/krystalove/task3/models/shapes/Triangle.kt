package com.krystalove.task3.models.shapes

import kotlin.math.sqrt

class Triangle(val a:Int, val b:Int, val c:Int){
    private val perimetr:Int = a+b+c
    private val halfPerimetr:Double = (perimetr/2).toDouble()

    fun square():Double = sqrt(halfPerimetr*(halfPerimetr-a)*(halfPerimetr-b)*(halfPerimetr-c))
    fun perimeter() = perimetr
}