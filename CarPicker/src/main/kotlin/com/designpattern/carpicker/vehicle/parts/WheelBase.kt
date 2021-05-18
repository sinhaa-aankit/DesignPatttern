package com.designpattern.carpicker.vehicle.parts

import com.designpattern.carpicker.vehicle.parts.wheel.Wheel

class WheelBase (
    private val size: WheelBase.Size,
    val chasis: Chasis,
    val wheelFactory: Wheel.Factory

    ) : Part{
    val wheels: List<Wheel> = listOf(
        wheelFactory.createWheel(),
        wheelFactory.createWheel(),
        wheelFactory.createWheel(),
        wheelFactory.createWheel()
    )
    override val selfPrice: Int
        get() = when(this.size){
            Size.SMALL -> 100000
            Size.MEDIUM -> 125000
            Size.BIG -> 150000
        }
    override val totalCost: Int
        get() = selfPrice + chasis.totalCost + wheels.sumBy { it.totalCost }

    enum class Size{SMALL, MEDIUM, BIG}
}