package com.example.rafiulislamrafi.bottleflip;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {

    Button flip_button;
    ImageView bottle_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCast();
        buttonClick();
    }

    public void objCast() {

        flip_button = (Button) findViewById(R.id.flipButton);
        bottle_image = (ImageView) findViewById(R.id.bottle);
    }

    public void buttonClick() {

        flip_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RotateAnimation rotateAnimation = new RotateAnimation(0, 2160, RotateAnimation.RELATIVE_TO_SELF, .5f,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                rotateAnimation.setDuration(2000);
                bottle_image.startAnimation(rotateAnimation);

            }
        });

    }
}
