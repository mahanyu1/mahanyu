package com.example.demo_zuoye01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yc.video.player.VideoPlayer;
import com.yc.video.ui.view.BasisVideoController;

public class MainActivity extends AppCompatActivity {



    private VideoPlayer viedo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        viedo = (VideoPlayer) findViewById(R.id.viedo);
        //创建基础视频播放器，一般播放器的功能
        BasisVideoController controller = new BasisVideoController(this);
//设置控制器
        viedo.setController(controller);
//设置视频播放链接地址
        viedo.setUrl("http://yun918.cn/video/1578640184375179.mp4");
//开始播放
        viedo.postDelayed(new Runnable() {
            @Override
            public void run() {
                viedo.start();
            }
        },2000);
    }
}