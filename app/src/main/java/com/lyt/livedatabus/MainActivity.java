package com.lyt.livedatabus;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lyt.livedatabus.library.LiveDataBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      LiveDataBus.get().with("1",String.class).observe(this, new Observer<String>() {
          @Override
          public void onChanged(@Nullable String s) {
              Log.e("liyunte","收到了");
          }
      });

        LiveDataBus.get().with("1",String.class).observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Log.e("liyunte","收到了");
            }
        });
      startActivity(new Intent(MainActivity.this,TwoActivity.class));

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("liyunte","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("liyunte","onStop");
    }
}
