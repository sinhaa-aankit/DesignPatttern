package com.designpattern.carpicker.vehicle.parts.wheel

import com.designpattern.carpicker.vehicle.parts.Part

class Wheel private constructor(
    val type : Type
        ) : Part {
    override val selfPrice: Int
        get() = when(this.type){
            Type.STEEL -> 10000
            Type.ALLOY -> 12000
            Type.CARBONFIBRE -> 20000
        }
    override val totalCost = selfPrice

    enum class Type {STEEL, ALLOY, CARBONFIBRE }

    class Factory(
        val type : Wheel.Type
    ){
        fun createWheel() : Wheel {
            return Wheel(type)
        }
    }
}