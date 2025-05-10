package com.sbsoftwareltd.proanimatedtext;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.sbsoftwareltd.animatedtextpro.Animatedtextpro;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //========

        Animatedtextpro typingTextView = findViewById(R.id.typingTextView);
        typingTextView.setCharacterDelay(100); // প্রতিটি অক্ষরের জন্য বিলম্ব
        typingTextView.setTipDelay(2000); // প্রতিটি টিপসের মাঝে বিলম্ব

        String[] tips = {
                "Welcome to our app!",
                "Enjoy fast performance.",
                "Built with ❤️ by SB Software."
        };

        typingTextView.setTips(tips);

        //===
    }
}