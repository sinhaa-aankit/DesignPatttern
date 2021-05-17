package com.designpattern.carpicker

import com.designpattern.carpicker.vehicle.Vehicle
import com.designpattern.carpicker.vehicle.parts.Chasis
import com.designpattern.carpicker.vehicle.parts.Engine
import com.designpattern.carpicker.vehicle.parts.Transmission
import com.designpattern.carpicker.vehicle.parts.WheelBase

fun main() {
    println("Hello World")
    val hondaCity = Vehicle(
        WheelBase(
            WheelBase.Size.MEDIUM,
            Chasis(Chasis.Type.SEDAN)
        ),
        Engine(
            Engine.Type.DIESEL,
            Transmission(Transmission.Type.FWD)
        )
    )
    val tesla = Vehicle(
        WheelBase(
            WheelBase.Size.MEDIUM,
            Chasis(Chasis.Type.PICKUP)
        ),
        Engine(
            Engine.Type.ELECTRIC,
            Transmission(Transmission.Type.AWD)
        )
    )
    val hondaCityPrice = hondaCity.price
    val teslaPrice = tesla.price
    println("The cost of my car is = $hondaCityPrice" )
    println("The cost of my car is = $teslaPrice" )
}