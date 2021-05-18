package com.designpattern.carpicker.vehicle.parts.wheel

class WheelFactory (
    val type : Wheel.Type
        ) {

    fun createWheel() : Wheel {
        return Wheel(type)
    }

}