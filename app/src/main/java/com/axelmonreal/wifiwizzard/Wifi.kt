package com.axelmonreal.wifiwizzard

data class Wifi(
    val id: Int,
    val name: String,
    val passsword: String,
    val disponibility: String,
    val win: String,
    val image: String
)
{
    constructor(name: String) : this(0, name, "", "", "","")
}
