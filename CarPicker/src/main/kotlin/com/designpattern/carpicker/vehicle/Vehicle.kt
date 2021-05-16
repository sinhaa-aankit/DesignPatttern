package com.designpattern.carpicker.vehicle

import com.designpattern.carpicker.vehicle.parts.Engine
import com.designpattern.carpicker.vehicle.parts.WheelBase
import kotlin.math.cos

class Vehicle {
    val wheelBase: WheelBase = WheelBase()
    val engine: Engine = Engine()

    val price : Int get() {
        var costs = 0;
        costs += wheelBase.price
        costs += wheelBase.chasis.price
        costs += wheelBase.wheels.sumBy { it.price }
        costs += wheelBase.chasis.seats.sumBy { it.price }
        costs += engine.price
        costs += engine.transmission.price
        return costs
    }

}