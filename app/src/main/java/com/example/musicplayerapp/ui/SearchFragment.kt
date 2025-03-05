package com.example.musicplayerapp.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayerapp.R
import com.example.musicplayerapp.viewmodel.MusicViewModel

class SearchFragment : Fragment() {

    private lateinit var musicViewModel: MusicViewModel
    private lateinit var searchBar: EditText
    private lateinit var searchResults: RecyclerView
    private lateinit var searchAdapter: SearchAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        searchBar = view.findViewById(R.id.search_bar)
        searchResults = view.findViewById(R.id.search_results)
        searchResults.layoutManager = LinearLayoutManager(context)
        searchAdapter = SearchAdapter()
        searchResults.adapter = searchAdapter

        musicViewModel = ViewModelProvider(this).get(MusicViewModel::class.java)
        musicViewModel.searchResults.observe(viewLifecycleOwner, Observer { results ->
            searchAdapter.submitList(results)
        })

        searchBar.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                musicViewModel.searchMusic(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        return view
    }
}