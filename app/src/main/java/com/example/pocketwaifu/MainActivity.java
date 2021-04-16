package com.example.pocketwaifu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation animArrow;
    TextView tvChooseW;
    ImageView ivArrowRightBlack, ivW1, ivW2, ivW3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout chooseLayout = (LinearLayout) findViewById(R.id.chooseLayout);
        HorizontalScrollView scrollView = (HorizontalScrollView) findViewById(R.id.scrollview);

        animArrow = AnimationUtils.loadAnimation(this, R.anim.anim_arrow);

        tvChooseW = (TextView) findViewById(R.id.tvChooseW);

        ivW1 = (ImageView) findViewById(R.id.ivW1);
        ivW2 = (ImageView) findViewById(R.id.ivW2);
        ivW3 = (ImageView) findViewById(R.id.ivW3);

        {
            ivArrowRightBlack = (ImageView) findViewById(R.id.ivArrowRightBlack);

            ivArrowRightBlack.startAnimation(animArrow);
        }//Button Right

        ivW1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollView.scrollTo(10, 0);
            }
        });

        ivW2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollView.scrollTo(1450, 0);
            }
        });


    }
}