# AnimatedTextPro

[![](https://jitpack.io/v/SBSadek/proAnimatedText.svg)](https://jitpack.io/#SBSadek/proAnimatedText)

**AnimatedTextPro** হলো একটি Android লাইব্রেরি যা টাইপিং-এনিমেশনসহ একাধিক টিপস টেক্সট ঘুরিয়ে দেখাতে সাহায্য করে।

---

## 📦 Installation

### Step 1: Add JitPack repository

Add this to your root `build.gradle` at the end of repositories:
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2: Add the dependency

```gradle
dependencies {
    implementation 'com.github.SBSadek:proAnimatedText:1.2.0'
}
```

---

## 💡 Usage

### In XML
```xml
<com.sbsoftwareltd.animatedtextpro.Animatedtextpro
    android:id="@+id/typingTextView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textSize="18sp"
    android:textColor="#000000" />
```

### In Java
```java
Animatedtextpro typingTextView = findViewById(R.id.typingTextView);
typingTextView.setCharacterDelay(100); // প্রতিটি অক্ষরের জন্য বিলম্ব
typingTextView.setTipDelay(2000); // প্রতিটি টিপসের মাঝে বিলম্ব

String[] tips = {
    "Welcome to our app!",
    "Enjoy fast performance.",
    "Built with ❤️ by SB Software."
};

typingTextView.setTips(tips);
```

---

## ✨ Features

- টাইপিং স্টাইল এনিমেশন
- একাধিক টিপস টেক্সট ঘুরিয়ে দেখানোর ব্যবস্থা
- কাস্টম টাইমিং সাপোর্ট

---

## 📃 License

MIT License

---

## 👨‍💻 Author

**Sadek Ali**  
GitHub: [@SBSadek](https://github.com/SBSadek)
