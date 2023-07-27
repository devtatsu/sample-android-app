package com.example.myapplication.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.myapplication.R

class DiceRollResultListAdapter(context: Context, diceResults: ArrayList<DiceRollData>) : ArrayAdapter<DiceRollData>(context, 0, diceResults) {

    private val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view  = convertView
//        var aaa : DiceRollData

        if (view == null) {
            // 一行分のレイアウトを生成
            view  = LayoutInflater.from(context).inflate(R.layout.row_view, parent, false)
//            view = layoutInflater.inflate(R.layout.row_view, parent, false)
//            aaa = DiceRollData(
//                view?.findViewById<TextView>(R.id.textView2).toString(),
//                view?.findViewById<TextView>(R.id.textView2).toString()
//            )
//            view.tag = aaa
//        } else {
////            aaa = view.tag as ViewHolder
//            aaa = view.tag as DiceRollData
        }

        // 一行分のデータを取得
        val data = getItem(position)

//        data?.no?.let { Log.i("test2", it) }
//        data?.rollResult?.let { Log.i("test2", it) }

        // 一行分のレイアウトに取得したdataの情報をセットする
        val txt = view?.findViewById<TextView>(R.id.textView)
        txt?.text = data?.no.toString()

        val txt2 = view?.findViewById<TextView>(R.id.textView2)
        txt2?.text = data?.rollResult.toString()

//        aaa.no = data?.no.toString()
//        aaa.rollResult = data?.rollResult.toString()

        return view!!
    }

}
