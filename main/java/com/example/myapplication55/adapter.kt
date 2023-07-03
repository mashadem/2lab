package com.example.myapplication55

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication55.databinding.ItemBinding

class adapter(val onclick:(animal:animal)->Unit):RecyclerView.Adapter<adapter.AnimalViewHolder>(){
    private val list=ArrayList<animal>()
    inner class AnimalViewHolder(item: View):RecyclerView.ViewHolder(item) {
        val binding = ItemBinding.bind(item)
        fun binditem(animal:animal) = with(binding) {
            textName.text = animal.name
            text2.text = animal.discription
            Glide.with(binding.root)
                .load(animal.image)
                .centerCrop()
                .into(catIm)
            cv.setOnClickListener {
                onclick(list[adapterPosition])

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {

        holder.binditem(list[position])
    }
    fun set(newList:List<animal>){
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}