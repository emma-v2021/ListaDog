package com.ruiz.emanuel.doglist

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getDogsByBreeds(@Url ulr:String):Response<DogsResponse>

}