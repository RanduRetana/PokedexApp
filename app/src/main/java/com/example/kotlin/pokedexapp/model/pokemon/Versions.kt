package com.example.kotlin.pokedexapp.model.pokemon

import com.google.gson.annotations.SerializedName


data class Versions(
    @SerializedName("generation-i") val generation_i: com.example.kotlin.pokedexapp.model.pokemon.GenerationI,
    @SerializedName("generation-ii") val generation_ii: com.example.kotlin.pokedexapp.model.pokemon.GenerationIi,
    @SerializedName("generation-iii") val generation_iii: com.example.kotlin.pokedexapp.model.pokemon.GenerationIii,
    @SerializedName("generation-iv") val generation_iv: com.example.kotlin.pokedexapp.model.pokemon.GenerationIv,
    @SerializedName("generation-v") val generation_v: com.example.kotlin.pokedexapp.model.pokemon.GenerationV,
    @SerializedName("generation-vi") val generation_vi: com.example.kotlin.pokedexapp.model.pokemon.GenerationVi,
    @SerializedName("generation-vii") val generation_vii: com.example.kotlin.pokedexapp.model.pokemon.GenerationVii,
    @SerializedName("generation-viii") val generation_viii: com.example.kotlin.pokedexapp.model.pokemon.GenerationViii
)