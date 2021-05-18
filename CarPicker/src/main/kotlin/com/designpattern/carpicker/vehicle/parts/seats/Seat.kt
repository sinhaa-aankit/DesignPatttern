package com.designpattern.carpicker.vehicle.parts.seats

import com.designpattern.carpicker.vehicle.parts.Part

class Seat : Part {
    override val selfPrice: Int
        get() = 15000
    override val totalCost = selfPrice
}