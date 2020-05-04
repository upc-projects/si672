package com.upc.pc1.moviles.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.upc.pc1.moviles.R
import com.upc.pc1.moviles.model.ArtWork
import kotlinx.android.synthetic.main.art_work_item.view.*


/**
 * Created by Enzo Lizama Paredes on 4/25/20.
 * Contact: lizama.enzo@gmail.com
 */

class ArtWorkAdapter(
    val context: Context,
    private val artWorks: List<ArtWork>,
    private val callback: ArtItemCallback
) :
    RecyclerView.Adapter<ArtWorkAdapter.ArtWorkViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtWorkViewHolder {
        return ArtWorkViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.art_work_item, parent, false)
        )
    }

    override fun getItemCount(): Int = artWorks.size

    override fun onBindViewHolder(holder: ArtWorkViewHolder, position: Int) {
        val artWork = artWorks[position]
        holder.bind(artWork)
    }

    inner class ArtWorkViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val artWorkName = view.art_work_name
        private val artWorkDescription = view.art_work_description
        private val artWorkImage = view.art_work_ItemImageView
        private val cardArtWork = view.art_work_card
        fun bind(artWork: ArtWork) {
            artWorkName.text = artWork.name
            artWorkDescription.text = artWork.description
            Glide.with(context).load(artWork.image).into(artWorkImage)
            cardArtWork.setOnClickListener {
                callback.goToArtDetailPage(artWork)
            }
        }
    }
}


