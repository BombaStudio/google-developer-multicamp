package com.necatisozer.multicamp.kotlinoverview

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class HomeFragment : Fragment(R.layout.fragment_home) {
    // private val args by navArgs<HomeFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // textViewGreeting.text = getString(R.string.greeting_with_name, args.username)
    }
}