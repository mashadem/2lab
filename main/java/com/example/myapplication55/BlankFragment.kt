package com.example.myapplication55

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.myapplication55.databinding.FragmentBlankBinding

class BlankFragment : Fragment(R.layout.fragment_blank) {
    private lateinit var binding: FragmentBlankBinding
    private lateinit var adapter: adapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentBlankBinding.bind(view)
        adapter = adapter {
            findNavController().navigate(
                R.id.action_blankFragment_to_blankFragment2,
                bundleOf(BlankFragment2.animals to it)
            )
        }
        adapter.set(createanimal())
        binding.rv.adapter = adapter

    }
    fun createanimal():List<animal>{
        return listOf(animal(getString(R.string.ara),getString(R.string.infAra),getString(R.string.imara)),
            animal(getString(R.string.cat),getString(R.string.infCat),getString(R.string.imcat)),
            animal(getString(R.string.haski),getString(R.string.infHaski),getString(R.string.imhaski)),

            animal(getString(R.string.hom),getString(R.string.infhom),getString(R.string.imhom)),
            animal(getString(R.string.el),getString(R.string.infel),getString(R.string.imel)),
            animal(getString(R.string.fish),getString(R.string.inffish),getString(R.string.imfish)),

        )
    }

}