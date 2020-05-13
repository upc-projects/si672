package com.upc.wisappwear

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.award_item.view.*


/**
 * Created by Enzo Lizama Paredes on 5/13/20.
 * Contact: lizama.enzo@gmail.com
 */
class WisAdapter(
    val context: Context,
    private val awards: List<Award>,
    private val callback: WisItemCallback
) :
    RecyclerView.Adapter<WisAdapter.WisViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisViewHolder {
        return WisViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.award_item, parent, false)
        )
    }

    override fun getItemCount(): Int = awards.size

    override fun onBindViewHolder(holder: WisViewHolder, position: Int) {
        val artWork = awards[position]
        holder.bind(artWork)
    }

    inner class WisViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.award_name
        val image = view.award_image
        fun bind(award: Award) {
            name.text = award.title
            Picasso.with(context).load(award.image).into(image)
            image.setOnClickListener {
                callback.goToAwardDetailPage(award)
            }
        }
    }
}