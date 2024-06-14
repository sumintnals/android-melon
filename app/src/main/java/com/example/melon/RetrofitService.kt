package com.example.melon

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("melon/list/")
    fun getMelonItemList(): Call<ArrayList<MelonItem>>
}

class MelonItem(
    val id: Int, val title: String, val song: String, val thumbnail: String
)