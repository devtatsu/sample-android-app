package com.example.myapplication.ui.notifications

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class RecyclerAdapter:RecyclerView.Adapter<ViewHolderItem>() {
    //５）表示するデータを用意
    //private val nameList = listOf("My Name0","My Name1","My Name2","My Name3","My Name4","My Name5")
    //９）privateは消す
    val nameList = listOf("My Name0","My Name1","My Name2","My Name3","My Name4","My Name5")
    private val messageList = listOf("メッセージ０","メッセージ１","メッセージ２","メッセージ３","メッセージ４","メッセージ５")
    private val imgList = listOf(
        R.drawable.img0, R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5)

    //４）ここで１行分のレイアウト（View）を生成
    //（「２」と「３」を紐づける作業）
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        //「２」のレイアウトを取得（インフレート）
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.row,parent,false)
        return ViewHolderItem(itemXml)
    }

    //５）position番目のデータをレイアウト(xml)に表示するようセット
    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.tvNameHolder.text = nameList[position]
        holder.tvMessageHolder.text = messageList[position]
        holder.ivHolder.setImageResource(imgList[position])

    }

    //６）データが何件あるかをカウントする
    override fun getItemCount(): Int {
        return nameList.size
    }
}
