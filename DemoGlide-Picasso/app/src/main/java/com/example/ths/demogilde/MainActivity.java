package com.example.ths.demogilde;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btGlide, btPicasso;
    private ImageView imageView;
    public static final String LINK_URL = "https://lh6.ggpht.com/9SZhHdv4URtBzRmXpnWxZcYhkgTQurFuuQ8OR7WZ3R7fyTmha77dYkVvcuqMu3DLvMQ=w300";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btGilde:
                Glide.with(getApplicationContext()).load(LINK_URL).placeholder(R.drawable.androidify).into(imageView);
                break;
            case R.id.btPicasso:
                Picasso.with(getApplicationContext()).load(LINK_URL).placeholder(R.drawable.androidify).into(imageView);
                break;
            default:
                break;
        }
    }

    private void initView() {
        btGlide = (Button) findViewById(R.id.btGilde);
        btPicasso = (Button) findViewById(R.id.btPicasso);
        imageView = (ImageView) findViewById(R.id.imageView);
        btGlide.setOnClickListener(this);
        btPicasso.setOnClickListener(this);
        imageView = (ImageView) findViewById(R.id.imageView);
    }


}
