package com.example.kotlin.pokedexapp.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: Icons,
    @SerializedName("ultra-sun-ultra-moon") val ultra_sun_ultra_moon: UltraSunUltraMoon
)