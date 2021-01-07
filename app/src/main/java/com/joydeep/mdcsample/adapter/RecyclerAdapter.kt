package com.joydeep.mdcsample.adapter

import android.content.Context
import android.graphics.Rect
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Px
import androidx.recyclerview.widget.RecyclerView
import com.joydeep.mdcsample.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {}

    override fun getItemCount(): Int = 10
}

class RecyclerViewHolder(
    parent: ViewGroup
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.custom_viewholder, parent, false)
)

class ItemDecoration(
    private val context: Context, private val left: Int = 0,
    private val top: Int = 0,
    private val right: Int = 0,
    private val bottom: Int = 0
) : RecyclerView.ItemDecoration() {

    @Px
    private fun dpToPx(context: Context, dp: Int) =
        TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp.toFloat(),
            context.resources.displayMetrics
        ).toInt()

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.set(dpToPx(context, left), dpToPx(context, top), dpToPx(context, right), dpToPx(context, bottom))
    }
}