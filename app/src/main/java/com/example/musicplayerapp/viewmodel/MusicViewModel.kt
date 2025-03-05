package com.example.musicplayerapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.musicplayerapp.model.Music
import com.example.musicplayerapp.repository.MusicRepository

class MusicViewModel : ViewModel() {

    private val repository = MusicRepository()
    private val _searchResults = MutableLiveData<List<Music>>()
    val searchResults: LiveData<List<Music>> get() = _searchResults

    fun searchMusic(query: String) {
        // Perform the search and update the search results
        _searchResults.value = repository.searchMusic(query)
    }
}