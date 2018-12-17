package com.krystalove.task3.models.shapes

class Circle(val radius:Double){

    fun square() = Math.PI * radius * radius
    fun perimeter() = if(square() == 0.0) 2.0 * Math.PI * radius * radius else 0.0
}