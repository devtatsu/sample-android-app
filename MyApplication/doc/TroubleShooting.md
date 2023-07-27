## ビルド結果、`Android StudioでCannot obtain the application ID`が表示された場合

ダイアログに`Error: Run configuration app is not supported in the current project. Cannot obtain the application ID.`が
表示された場合、以下の方法でキャッシュをクリアし、その後に`Android Studio`を再起動してください。

### キャッシュクリア

1. `Android Studio`で以下のダイアログを表示してください。

```agsl
File > Invalidate Caches
```

2. ダイアログの`Clear VCS Log caches and indexes`にチェックする

3. `Invalidate and Restart`を押下する

4. 自動で、`Android Studio`が再起動され、エラーが表示されないことを確認

## FragmentでArrayAdapterを使用した結果、`this`が、`Type mismatch`となり、コードエラーとなる

Fragmentの中で`getContext()`（コード上はcontext）を用いたときの戻り値はContext?型（Null許容型）になります。

これをContext型（Null非許容型）を求める引数に直接与えることはできず、このエラーになってしまう。

そのようなときの代替APIとして、`requireContext()`というものがあります。

> 例）<br>
> val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)<br>
> ↑の場合、`this`が、Context?型（Null許容型）のため、エラーとなってしまう。<br>
> なので、以下のようにすれば、エラーが解消される。<br>
> val arrayAdapter = ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1)
>

### 補足：requireContext()でクラッシュするパターンと対応

https://atsum.in/android/crash-by-require-context/


