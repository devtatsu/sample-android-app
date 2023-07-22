## シミュレータ作成

Tools > Device Manager > Create device > 任意のCategori 選択 > 任意の機種を選択 > Next > 任意のimageを選択(※1、2)  > Next > AVD Nameは任意の名前 > Finish

※1 imageが未インストールの場合、対象のRelease Name横の`↓`を選択して、先にインストールする。
※2 `HAXM is not installed.`と表示されている場合は、インストールする。

初回確認のため、作成したシミュレータの`Actions`の`▶`を選択し、起動できることを確認する。

## ボタン実装

[参考](https://qiita.com/satona-oinuma/items/82053ee3ed3ac82344a0#3%E3%83%9C%E3%82%BF%E3%83%B3%E3%81%AB%E7%9B%B4%E6%8E%A5%E5%AE%9F%E8%A3%85%E3%81%99%E3%82%8B%E6%96%B9%E6%B3%95)

## トラブルシューティング

### Gradle Build結果、`could not head 'https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar'`となり、ビルドが失敗する

ビルド時に余計な設定などを参照して、失敗している可能性があります。
以下を参考に、`Android Studio`を完全アンインストールして、再度インストールしてからビルドしてみてください。

chrome-extension://efaidnbmnnnibpcajpcglclefindmkaj/https://gihyo.jp/assets/files/book/2021/978-4-297-12138-9/download/AndroidStudio_Delete_20230120.pdf

---

## 教材
https://developer.android.com/codelabs/basic-android-kotlin-training-dice-roller-images?hl=ja#6

## OpenAPI Generator でAndroid コードを自動生成する
https://qiita.com/warahiko/items/3676f1164f4619e8debc

## git
https://github.com/google-developer-training/android-basics-kotlin-dice-roller-with-images-app-solution/tree/master

## ビルド方法

View > Tool Windows > Terminal

---

## 不具合

### imageView <ImageView>: Insufficient image color contrast ratio

コンテキスト メニューあり
