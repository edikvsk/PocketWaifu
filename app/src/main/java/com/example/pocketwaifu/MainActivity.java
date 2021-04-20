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
    TextView tvChooseW, tvStatsInfo1, tvStatsInfo2, tvStatsInfo3, tvStatsInfo4, tvOk;
    ImageView ivArrowRightBlack, ivW1, ivW2, ivW3, ivWaifuOp1;
    int chooseOk = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout chooseLayout = (LinearLayout) findViewById(R.id.chooseLayout);
        HorizontalScrollView scrollView = (HorizontalScrollView) findViewById(R.id.scrollview);

        LinearLayout layoutStats = (LinearLayout) findViewById(R.id.layoutStats);
        layoutStats.setVisibility(View.INVISIBLE);

        LinearLayout layoutStatsInfo = (LinearLayout) findViewById(R.id.layoutStatsInfo);
        layoutStatsInfo.setVisibility(View.INVISIBLE);

        animArrow = AnimationUtils.loadAnimation(this, R.anim.anim_arrow);

        tvChooseW = (TextView) findViewById(R.id.tvChooseW);
        tvOk = (TextView) findViewById(R.id.tvOk);
        tvStatsInfo1 = (TextView) findViewById(R.id.tvStatInfo1);
        tvStatsInfo2 = (TextView) findViewById(R.id.tvStatInfo2);
        tvStatsInfo3 = (TextView) findViewById(R.id.tvStatsInfo3);
        tvStatsInfo4 = (TextView) findViewById(R.id.tvStatsInfo4);

        ivW1 = (ImageView) findViewById(R.id.ivW1);
        ivW2 = (ImageView) findViewById(R.id.ivW2);
        ivW3 = (ImageView) findViewById(R.id.ivW3);
        ivWaifuOp1 = (ImageView) findViewById(R.id.ivWaifuOp1);

        //Button Right
        {
            ivArrowRightBlack = (ImageView) findViewById(R.id.ivArrowRightBlack);

            ivArrowRightBlack.startAnimation(animArrow);
        }

        ivWaifuOp1.setVisibility(View.INVISIBLE);
        tvOk.setVisibility(View.INVISIBLE);

        //OnClickListener
        {
            ivW1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    scrollView.scrollTo(0, 0);
                    ivWaifuOp1.setVisibility(View.VISIBLE);
                    tvOk.setVisibility(View.VISIBLE);
                    ivWaifuOp1.setImageResource(R.drawable.waifu_op);
                    layoutStats.setVisibility(View.VISIBLE);
                    chooseOk = 1;
                    layoutStatsInfo.setVisibility(View.VISIBLE);
                    tvStatsInfo1.setText("166 cm");
                    tvStatsInfo2.setText("51 kg");
                    tvStatsInfo3.setText("B");
                    tvStatsInfo4.setText("Scorpio");

                }
            });

            ivW2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    scrollView.scrollTo(1140, 0);
                    ivWaifuOp1.setVisibility(View.VISIBLE);
                    tvOk.setVisibility(View.VISIBLE);
                    ivWaifuOp1.setImageResource(R.drawable.waifu_op2);
                    layoutStats.setVisibility(View.VISIBLE);
                    chooseOk = 2;
                    layoutStatsInfo.setVisibility(View.VISIBLE);
                    tvStatsInfo1.setText("161 cm");
                    tvStatsInfo2.setText("46 kg");
                    tvStatsInfo3.setText("A");
                    tvStatsInfo4.setText("Libra");

                }
            });

            ivW3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    scrollView.scrollTo(2880, 0);
                    ivWaifuOp1.setVisibility(View.VISIBLE);
                    tvOk.setVisibility(View.VISIBLE);
                    ivWaifuOp1.setImageResource(R.drawable.waifu_op3);
                    layoutStats.setVisibility(View.VISIBLE);
                    chooseOk = 3;
                    layoutStatsInfo.setVisibility(View.VISIBLE);
                    tvStatsInfo1.setText("170 cm");
                    tvStatsInfo2.setText("57 kg");
                    tvStatsInfo3.setText("C");
                    tvStatsInfo4.setText("Leo");

                }
            });
        }


    }
}