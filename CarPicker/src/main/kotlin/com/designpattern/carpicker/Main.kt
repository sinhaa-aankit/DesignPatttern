package com.designpattern.carpicker

import com.designpattern.carpicker.vehicle.Vehicle
import com.designpattern.carpicker.vehicle.parts.Chasis
import com.designpattern.carpicker.vehicle.parts.Engine
import com.designpattern.carpicker.vehicle.parts.Transmission
import com.designpattern.carpicker.vehicle.parts.WheelBase
import com.designpattern.carpicker.vehicle.parts.seats.Seat
import com.designpattern.carpicker.vehicle.parts.wheel.Wheel

fun main() {
    println("Hello World")
    val hondaCity = Vehicle(
        WheelBase(
            WheelBase.Size.MEDIUM,
            Chasis(Chasis.Type.SEDAN,
            Seat.Factory(Seat.Upholstery.CLOTH)
                ),
            Wheel.Factory(Wheel.Type.STEEL)
        ),
        Engine(
            Engine.Type.DIESEL,
            Transmission(Transmission.Type.FWD)
        )
    )
    val tesla = Vehicle(
        WheelBase(
            WheelBase.Size.MEDIUM,
            Chasis(Chasis.Type.PICKUP,
                Seat.Factory(Seat.Upholstery.Leather)
            ),
            Wheel.Factory(Wheel.Type.CARBONFIBRE)
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