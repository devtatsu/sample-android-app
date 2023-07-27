package com.example.myapplication.ui.notifications

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ViewHolderItem(itemView:View) :RecyclerView.ViewHolder(itemView){
    //３）View(xml)の方から、指定のidを見つけてくる
    val ivHolder :ImageView =itemView.findViewById(R.id.iv)
    val tvNameHolder:TextView =itemView.findViewById(R.id.tvName)
    val tvMessageHolder:TextView =itemView.findViewById(R.id.tvMessage)

    //９）クリック処理(1行分の画面(view)が押されたら～)
    private val recyclerAdapter = RecyclerAdapter()
    private val nameList =recyclerAdapter.nameList

    init {
        itemView.setOnClickListener {
            val position:Int =adapterPosition

            Toast.makeText(itemView.context,"${nameList[position]}さんです",Toast.LENGTH_SHORT).show()
        }
    }
}
