package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_1, imageView_2, imageView_3;

    private int imageIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        1주차 과제 원본(네이버 로그인 화면)
//        setContentView(R.layout.activity_main);

//        1주차 과제 보충(갤럭시 메시지 화면)
//        setContentView(R.layout.activity_galaxy_message);

//        1주차 과제 보충(인스타그램 화면 만들기)
        setContentView(R.layout.activity_instagram);

        imageView_1 = findViewById(R.id.captchaPhoto_1);
        imageView_2 = findViewById(R.id.captchaPhoto_2);
        imageView_3 = findViewById(R.id.captchaPhoto_3);
    }

    public void onRefreshButtonClicked(View v) {
        changeImage();
    }

    private void changeImage() {
        switch(imageIndex){
            case 1: imageView_1.setVisibility(View.INVISIBLE);
                    imageView_2.setVisibility(View.VISIBLE);
                    imageView_3.setVisibility(View.INVISIBLE);

                    imageIndex = 2;

                    break;

            case 2: imageView_1.setVisibility(View.INVISIBLE);
                    imageView_2.setVisibility(View.INVISIBLE);
                    imageView_3.setVisibility(View.VISIBLE);

                    imageIndex = 3;

                break;

            case 3: imageView_1.setVisibility(View.VISIBLE);
                    imageView_2.setVisibility(View.INVISIBLE);
                    imageView_3.setVisibility(View.INVISIBLE);

                    imageIndex = 1;

                break;
        }
    }

    public void onSoundButtonClicked(View v) {
        Toast.makeText(this, "아직 음성기능을 지원하지 않습니다.", Toast.LENGTH_SHORT).show();
    }
}
