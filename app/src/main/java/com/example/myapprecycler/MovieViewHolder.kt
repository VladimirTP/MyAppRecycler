package com.example.myapprecycler

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapprecycler.databinding.MovieItemBinding

class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val binding = MovieItemBinding.bind(itemView)
    fun onBind(movie: MovieData) = with(binding){
        Glide.with(itemView.context).load(movie.imageUrl).into(poster)
        name.text = movie.name
        rating.text = movie.rating
        oscar.isVisible = movie.trueOscar
    }
}