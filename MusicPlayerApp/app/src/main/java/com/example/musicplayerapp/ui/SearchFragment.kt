package com.example.musicplayerapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayerapp.R
import com.example.musicplayerapp.model.Music
import com.example.musicplayerapp.viewmodel.MusicViewModel
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {

    private lateinit var musicViewModel: MusicViewModel
    private lateinit var musicAdapter: MusicAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        musicViewModel = MusicViewModel() // Initialize your ViewModel
        musicAdapter = MusicAdapter(emptyList()) // Initialize your adapter with an empty list

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = musicAdapter

        searchButton.setOnClickListener {
            val query = searchEditText.text.toString()
            if (query.isNotEmpty()) {
                searchMusic(query)
            }
        }
    }

    private fun searchMusic(query: String) {
        musicViewModel.searchMusic(query).observe(viewLifecycleOwner) { musicList ->
            musicAdapter.updateMusicList(musicList)
        }
    }
}

class MusicAdapter(private var musicList: List<Music>) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = musicList[position]
        holder.bind(music)
    }

    override fun getItemCount(): Int = musicList.size

    fun updateMusicList(newMusicList: List<Music>) {
        musicList = newMusicList
        notifyDataSetChanged()
    }

    class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(music: Music) {
            // Bind music data to the UI components
        }
    }
}