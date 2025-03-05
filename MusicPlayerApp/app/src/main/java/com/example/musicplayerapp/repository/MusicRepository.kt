package com.example.musicplayerapp.repository

import com.example.musicplayerapp.api.YouTubeMusicApi
import com.example.musicplayerapp.model.Music

class MusicRepository(private val api: YouTubeMusicApi) {

    suspend fun searchMusic(query: String): List<Music> {
        return api.searchMusic(query)
    }

    suspend fun getMusicDetails(musicId: String): Music {
        return api.getMusicDetails(musicId)
    }
}