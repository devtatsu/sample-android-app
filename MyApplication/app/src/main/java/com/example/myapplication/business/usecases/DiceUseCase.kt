package com.example.myapplication.business.usecases

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.ImageView
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentHomeBinding

//class DiceUseCase(private val numSides: Int) {
class DiceUseCase {

    private var fhb : FragmentHomeBinding? = null

    var timer = Runnable{}

    var statusflag : Boolean = false

    val handler = Handler(Looper.getMainLooper())

    var diceNo : Int = 0

    /**
     * 定数定義
     */
    companion object {
        // 画面更新速度 0.01秒
        private const val TERM_MILLISECOND: Long = 10
    }

    fun setParam(pFhb : FragmentHomeBinding) {
        fhb = pFhb
    }

    fun runDice() {

        var time = 0L

        // HandlerとRunnableを使用して、サイコロがランダムで面を変えるようにする
        timer = object : Runnable {
            override fun run() {
                // timeに0.1秒を追加
                time += TERM_MILLISECOND
                // ランダムでサイコロの面をセット
                fhb?.let { rollDice(it) }
                // 0.01秒で再度呼ばれるようにする
                handler.postDelayed(this, TERM_MILLISECOND)
            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun switchStartStopClick() : Int {

        val btn = fhb?.button

        if(!statusflag) {
            btn?.text = "STOP"
            handler.post(timer)
            statusflag = true
            diceNo = 0
        } else {
            btn?.text = "START"
            handler.removeCallbacks(timer)
            statusflag = false
        }

        return diceNo

    }

    /**
     * Do a random dice roll and return the result.
     */
    private fun roll(): Int {
        return (1..6).random()
    }

    private fun rollDice(fhb : FragmentHomeBinding) {

        val diceRoll = roll()

        // Find the ImageView in the layout
        val diceImage: ImageView = fhb.imageView

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceNo = diceRoll

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }

}
