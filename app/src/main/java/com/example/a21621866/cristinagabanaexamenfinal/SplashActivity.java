package com.example.a21621866.cristinagabanaexamenfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;

/**
 * @author crist
 */


public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {
    CircularFillableLoaders imgSplash;
    TextView tvSplash;
    Animation animacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        imgSplash = findViewById(R.id.circularFillableLoaders);
        tvSplash = findViewById(R.id.tvSplash);

        animacion = AnimationUtils.loadAnimation(this,R.anim.translate);

        tvSplash.setAnimation(animacion);

        animacion.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
