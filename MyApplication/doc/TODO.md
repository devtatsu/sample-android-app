## 残り、学習すべきこと

### [ ] それぞれのライフサイクルについて

種類を理解し、適切なイベントに処理を実装できるようになる。

### [ ] テスト方法について

テスト方法を理解した上で、実装できる（テストしやすい）ようになる。

- テスト記法（inject、mock など）

### [ ] プロジェクト構成の理解

全体像を理解し、一般敵なLayerを踏まえて、それぞれの責務を理解して、
適切な構成を構築できるようになる。

### [ ] ビルド方法の整理

一般的なビルド方法を理解した上で、適切なビルドバリアントを設定できるようになる。

教材
https://developer.android.com/codelabs/basic-android-kotlin-training-dice-roller-images?hl=ja#6

OpenAPI Generator でAndroid コードを自動生成する
https://qiita.com/warahiko/items/3676f1164f4619e8debc

git
https://github.com/google-developer-training/android-basics-kotlin-dice-roller-with-images-app-solution/tree/master

---

imageView <ImageView>: Insufficient image color contrast ratio

Multiple Gradle daemons might be spawned because the Gradle JDK and JAVA_HOME locations are different. Project 'My Application' is using the following JDK location when running Gradle: 'C:/Program Files/Android/Android Studio/jbr' The system environment variable JAVA_HOME is: 'C:\Program Files\Java\jdk-17' If you dont need to use different paths (or if JAVA_HOME is undefined), youcan avoid spawning multiple daemons by setting JAVA_HOME and the JDK locationto the same path. More info... Select the Gradle JDK location Do not show this warning again

data class ViewHolder(val nameTextView: TextView, val descTextView: TextView, val flowerImgView: ImageView)