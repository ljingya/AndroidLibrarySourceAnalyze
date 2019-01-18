package com.lijingya.androidlibrarysourceanalyze.eventbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.lijingya.androidlibrarysourceanalyze.R;

/**
 * @author lijingya
 * @description 添加描述
 * @email lijingya@91118.com
 * @createDate 2019/1/18
 * @company 杭州天音
 */
public class EventBusAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_event);
        TextView tvDesc = findViewById(R.id.tv_desc);
    }
}
