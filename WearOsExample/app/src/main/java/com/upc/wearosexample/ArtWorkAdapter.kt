package com.upc.wearosexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.wear.widget.WearableRecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*

class ArtWorkAdapter(
    val context: Context,
    private val artWorks: List<ArtWork>
) :
    RecyclerView.Adapter<ArtWorkAdapter.ArtWorkViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtWorkViewHolder {
        return ArtWorkViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
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

        fun bind(artWork: ArtWork) {
            artWorkName.text = artWork.name
            artWorkDescription.text = artWork.description
            Glide.with(context).load(artWork.image).centerCrop().placeholder(R.mipmap.ic_launcher)
                .dontAnimate().into(artWorkImage)
        }
    }
}
