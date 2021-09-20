package com.example.photoapitest.model

data class PhotoResponse(
    val hits:List<PhotoHit>
)

data class PhotoHit (
    val id:Int,
    val webformatURL:String,
    val user:String,
    val likes:Int,



)
