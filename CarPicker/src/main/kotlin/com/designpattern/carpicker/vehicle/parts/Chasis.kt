package com.designpattern.carpicker.vehicle.parts

import com.designpattern.carpicker.vehicle.parts.seats.Seat

class Chasis (val type : Type) : Part {
    val seats: List<Seat> = listOf(
        Seat(), Seat(), Seat(), Seat()
    )
    override val selfPrice: Int
        get() = when(this.type){
            Type.HATCHBACK -> 150000
            Type.SEDAN -> 200000
            Type.SUV -> 275000
            Type.PICKUP -> 400000
        }
    override val totalCost: Int
        get() = selfPrice + seats.sumBy { it.totalCost }

    enum class Type {HATCHBACK, SEDAN, SUV, PICKUP}
}