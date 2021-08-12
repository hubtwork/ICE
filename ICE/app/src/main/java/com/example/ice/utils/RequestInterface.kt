package com.example.ice.utils

import com.example.ice.models.ResponseData
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface RequestInterface {

    @GET("/aa/")
    fun test(
    )
        : Call<ResponseData>

    @Multipart
    @POST("/aa/")
    fun sendImage(
        @Part image : MultipartBody.Part)
            : Call<ResponseData>
}