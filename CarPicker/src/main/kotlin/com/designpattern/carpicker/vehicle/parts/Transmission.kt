package com.designpattern.carpicker.vehicle.parts

class Transmission (val type: Type) : Part {
    override val selfPrice: Int
        get() = when(type){
            Type.RWD -> 90000
            Type.FWD -> 75000
            Type.AWD -> 100000
        }
    override val totalCost = selfPrice

    enum class Type {RWD, FWD, AWD}

}