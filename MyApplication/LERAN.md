## Fragmentとは？

Androidアプリに表示される一つ一つの画面をActivityと呼ぶ。

FragmentとはそのActivityの上に載っている部品のことを指しており、画面の一部分に独立した動きをさせることができる。

Activityが呼び出すFragmentを変えることで、画面の一部のみを変化させることが可能になる。

また、FragmentはActivityとは異なった独自のライフサイクルを持っている。

## ViewBindingを使用することを推奨

> 注: ビュー バインディングを利用できるのは、Android Studio 3.6 Canary 11 以降に限られます。

バインド機能(`TextView`や`Button` など)を操作するにあたり、`DataBinding`が利用されていましたが、
新しく`ViewBinding`がよいされ、これにより、簡単に操作コードを記述できるようになりました。

[公式](https://developer.android.com/topic/libraries/view-binding?hl=ja)からも`DataBinding`より、`ViewBinding`を使用することを推奨しています。

> DataBinding 例<br>
> val diceView = view.findViewById<ImageView>(R.id.imageView)

> ViewBinding 例<br>
> val diceView = binding.imageView
