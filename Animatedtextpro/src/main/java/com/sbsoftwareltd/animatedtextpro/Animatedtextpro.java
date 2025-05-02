package com.sbsoftwareltd.animatedtextpro;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class Animatedtextpro extends AppCompatTextView {

    private String[] tips = {};
    private int currentTipIndex = 0;

    private CharSequence currentText;
    private int charIndex = 0;

    private long charDelay = 100;     // প্রতি অক্ষরের টাইমিং (ms)
    private long tipDelay = 2000;     // একটি টিপ শেষ হলে পরের টিপ শুরু হওয়ার বিলম্ব (ms)

    private final Handler handler = new Handler();

    public Animatedtextpro(Context context) {
        super(context);
    }

    public Animatedtextpro(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Animatedtextpro(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /** অক্ষর টাইমিং সেট করুন */
    public void setCharacterDelay(long millis) {
        this.charDelay = millis;
    }

    /** প্রতিটি টিপসের মধ্যে বিলম্ব সেট করুন */
    public void setTipDelay(long millis) {
        this.tipDelay = millis;
    }

    /** একাধিক টিপ সেট করুন */
    public void setTips(String[] tipsArray) {
        this.tips = tipsArray;
        currentTipIndex = 0;
        showNextTip();
    }

    /** পরবর্তী টিপ টাইপ শুরু করুন */
    private void showNextTip() {
        if (tips.length == 0) return;

        currentText = tips[currentTipIndex];
        charIndex = 0;
        setText("");
        handler.removeCallbacks(characterAdder);
        handler.postDelayed(characterAdder, charDelay);
    }

    /** টাইপিং এনিমেশন চালানো হচ্ছে */
    private final Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            if (charIndex <= currentText.length()) {
                setText(currentText.subSequence(0, charIndex++));
                handler.postDelayed(this, charDelay);
            } else {
                handler.postDelayed(() -> {
                    currentTipIndex = (currentTipIndex + 1) % tips.length;
                    showNextTip();
                }, tipDelay);
            }
        }
    };
}


