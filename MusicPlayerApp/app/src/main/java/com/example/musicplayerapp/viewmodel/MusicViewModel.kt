package com.example.musicplayerapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.musicplayerapp.model.Music
import com.example.musicplayerapp.repository.MusicRepository

class MusicViewModel(private val musicRepository: MusicRepository) : ViewModel() {

    private val _musicList = MutableLiveData<List<Music>>()
    val musicList: LiveData<List<Music>> get() = _musicList

    private val _selectedMusic = MutableLiveData<Music?>()
    val selectedMusic: LiveData<Music?> get() = _selectedMusic

    fun searchMusic(query: String) {
        // Call the repository to search for music and update the LiveData
        musicRepository.searchMusic(query) { music ->
            _musicList.postValue(music)
        }
    }

    fun selectMusic(music: Music) {
        _selectedMusic.value = music
    }
}