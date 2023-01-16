package com.example.spaceinfo2.view.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.spaceinfo2.data.retrofit.AstronomyPictureOfTheDay
import com.example.spaceinfo2.databinding.RecyclerItemAstronomyPictureOfTheDayBinding

class AstronomyPictureOfTheDayAdapter :
    ListAdapter<AstronomyPictureOfTheDay, AstronomyPictureOfTheDayViewHolder>(
        AstronomyPictureOfTheDayDiffUtil
    ) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AstronomyPictureOfTheDayViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerItemAstronomyPictureOfTheDayBinding.inflate(inflater, parent, false)
        return AstronomyPictureOfTheDayViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AstronomyPictureOfTheDayViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}