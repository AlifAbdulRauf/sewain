package com.horehoreteam.sewain_hackathon2023.packages.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.model.Package

class MyPackageAdapter(private val listPackage: List<Package>) :
    RecyclerView.Adapter<MyPackageAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val subtitle: TextView
        val foodServiceCount: TextView
        val wardrobeServiceCount: TextView
        val decorationServiceCount: TextView
        val imageService: ImageView

        init {
            title = view.findViewById(R.id.actv_package_title)
            subtitle = view.findViewById(R.id.actv_package_subtitle)
            foodServiceCount = view.findViewById(R.id.actv_package_food_service)
            wardrobeServiceCount = view.findViewById(R.id.actv_package_wardrobe_service)
            decorationServiceCount = view.findViewById(R.id.actv_package_decoration_service)
            imageService = view.findViewById(R.id.aciv_package_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.package_card_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listPackage.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = listPackage[position].title
        holder.subtitle.text = listPackage[position].subtitle
        holder.foodServiceCount.text = listPackage[position].foodServiceCount
        holder.wardrobeServiceCount.text = listPackage[position].wardrobeServiceCount
        holder.decorationServiceCount.text = listPackage[position].decorationServiceCount
        Glide.with(holder.imageService.context).load(listPackage[position].imageService).into(holder.imageService)
    }

}