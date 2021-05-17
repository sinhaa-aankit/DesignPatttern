package com.designpattern.carpicker.vehicle

import com.designpattern.carpicker.vehicle.parts.Engine
import com.designpattern.carpicker.vehicle.parts.WheelBase

class Vehicle (
    val wheelBase: WheelBase,
    val engine: Engine
        ) {


    val price : Int = wheelBase.totalCost + engine.totalCost

}