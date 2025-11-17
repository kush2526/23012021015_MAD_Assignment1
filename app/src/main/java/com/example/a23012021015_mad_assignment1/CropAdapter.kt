package com.example.a23012021015_mad_assignment1

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class CropAdapter(private val cropList: List<Crop>) :
    RecyclerView.Adapter<CropAdapter.CropViewHolder>() {

    private val cropColors = listOf(
        "#FF6F61", "#6BCB77", "#4D96FF", "#FFD93D", "#FF6EC7"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CropViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_crop, parent, false)
        return CropViewHolder(view)
    }

    override fun getItemCount(): Int = cropList.size

    override fun onBindViewHolder(holder: CropViewHolder, position: Int) {
        val crop = cropList[position]

        // Set crop name
        holder.tvCropName.text = crop.name

        // Set crop icon
        val iconRes = when (crop.name.lowercase()) {
            "wheat" -> R.drawable.ic_wheat
            "rice" -> R.drawable.ic_rice
            "corn" -> R.drawable.ic_corn
            else -> R.drawable.ic_crop_default
        }
        holder.ivCropIcon.setImageResource(iconRes)

        // Set card background color
        holder.cardView.setCardBackgroundColor(Color.parseColor(cropColors[position % cropColors.size]))

        // Smooth fade-in animation
        holder.itemView.alpha = 0f
        holder.itemView.animate().alpha(1f).setDuration(400).start()
    }

    inner class CropViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCropName: TextView = itemView.findViewById(R.id.tvCropName)
        val ivCropIcon: ImageView = itemView.findViewById(R.id.ivCropIcon)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }
}
