package com.designpattern.carpicker.vehicle.parts.seats

import com.designpattern.carpicker.vehicle.parts.Part

class Seat private constructor(
    val upholstery: Upholstery
) : Part {
    override val selfPrice: Int
        get() = when(this.upholstery){
            Upholstery.CLOTH -> 10000
            Upholstery.REXINE -> 15000
            Upholstery.Leather -> 20000
        }
    override val totalCost = selfPrice

    enum class Upholstery { CLOTH, REXINE, Leather }

    class Factory (val upholstery: Upholstery){
        fun createSeat(): Seat {
            return Seat(upholstery)
        }
    }
}