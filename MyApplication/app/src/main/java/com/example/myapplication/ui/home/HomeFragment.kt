package com.example.myapplication.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.business.usecases.DiceUseCase
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var dice : DiceUseCase

    /**
     *
     * FragmentのメインコンテンツとなるViewを生成して返す必要があるライフサイクルイベント
     * ここではViewを生成して返すだけにとどめる
     *
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    /**
     * FragmentのViewが生成された後に呼び出される(つまり、onCreateViewのあと)
     * Viewの初期化とFragmentの状態の復元はここで行うことを推奨
     *
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        // 画像(サイコロ)セット
        val diceView = binding.imageView
        // 初期面は、1
        diceView.setImageResource(R.drawable.dice_1)

        dice = DiceUseCase()

        dice.setParam(binding)

        // HandlerとRunnableを使用して、サイコロがランダムで面を変えるようにする
        dice.runDice()

        //ボタンクリックイベントリスナー設定
        val clkBtn = binding.button
        clkBtn.setOnClickListener {
            dice.switchStartStopClick()
        }

    }

    /**
     * Viewが破棄される際に実行
     */
    override fun onDestroyView() {
        Log.i("test","test1")
        // handler NullPointerException 対応
        dice.handler.removeCallbacks(dice.timer)
        // status 初期化
        dice.statusflag = false
        super.onDestroyView()
        _binding = null
    }

}
