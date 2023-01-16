package com.example.spaceinfo2.view.recycler

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.spaceinfo2.data.retrofit.AstronomyPictureOfTheDay
import com.example.spaceinfo2.databinding.RecyclerItemAstronomyPictureOfTheDayBinding
import com.squareup.picasso.Picasso

class AstronomyPictureOfTheDayViewHolder(private val binding: RecyclerItemAstronomyPictureOfTheDayBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(apod: AstronomyPictureOfTheDay) {
        binding.recItemTextviewDate.text = apod.date
        binding.recItemTextviewTitle.text = apod.title
        binding.recItemTextviewDescription.text = apod.explanation

        Picasso.get()
            .load(apod.hdurl)
            .into(binding.recItemImageview)
    }
}

object AstronomyPictureOfTheDayDiffUtil : DiffUtil.ItemCallback<AstronomyPictureOfTheDay>() {
    override fun areItemsTheSame(
        oldItem: AstronomyPictureOfTheDay,
        newItem: AstronomyPictureOfTheDay
    ): Boolean {
        return (oldItem.date == newItem.date)
    }

    override fun areContentsTheSame(
        oldItem: AstronomyPictureOfTheDay,
        newItem: AstronomyPictureOfTheDay
    ): Boolean {
        return oldItem == newItem
    }
}