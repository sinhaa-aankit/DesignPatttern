package com.designpattern.carpicker.vehicle.parts.wheel

import com.designpattern.carpicker.vehicle.parts.Part

class Wheel : Part {
    override val selfPrice: Int
        get() = 12000
    override val totalCost = selfPrice
}