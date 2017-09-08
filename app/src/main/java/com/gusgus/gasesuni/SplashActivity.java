package com.gusgus.gasesuni;
import android.os.Handler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends BaseActivity {
    final Handler handler = new Handler();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView() {
        super.initView();
        delayxD();
    }
    public void delayxD(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                irHacia(Gases.class);
                finish();
                // Do something after 5s = 5000ms
                //buttons[inew][jnew].setBackgroundColor(Color.BLACK);
            }
        }, 2500);//TIEMPO PARA DEJAR QUE EL MAPA CARGUE EN LA APLICACION
    }
}
