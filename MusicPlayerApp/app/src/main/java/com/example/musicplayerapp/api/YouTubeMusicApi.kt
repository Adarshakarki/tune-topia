package com.example.musicplayerapp.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeMusicApi {

    @GET("search")
    fun searchMusic(
        @Query("query") query: String,
        @Query("type") type: String = "song"
    ): Call<MusicSearchResponse>

    @GET("tracks")
    fun getTrackDetails(
        @Query("id") trackId: String
    ): Call<TrackDetailsResponse>
}