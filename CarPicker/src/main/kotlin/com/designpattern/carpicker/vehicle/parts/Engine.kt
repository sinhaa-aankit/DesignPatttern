package com.designpattern.carpicker.vehicle.parts

class Engine (val type : Type) : Part {
    val transmission: Transmission = Transmission()

    override val price: Int
        get() = when(this.type){
            Type.PETROL -> 150000
            Type.DIESEL -> 150000
            Type.HYBRID -> 500000
            Type.ELECTRIC -> 400000
        }

    enum class Type{PETROL, DIESEL, HYBRID, ELECTRIC}
}