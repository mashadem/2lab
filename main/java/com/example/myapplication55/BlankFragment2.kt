package com.example.myapplication55

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.myapplication55.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment(R.layout.fragment_blank2) {
    private lateinit var binding: FragmentBlank2Binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)
        binding=FragmentBlank2Binding.bind(view)
        val animal=requireArguments().getParcelable<animal>(animals)
        binding.apply {

            textDescription.text=animal?.discription
            Glide.with(binding.root)
                .load(animal?.image)
                .into(im)
            button.setOnClickListener{findNavController().popBackStack()}

        }
    }
    companion object{
        const val animals="animal"
    }
}