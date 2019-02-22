package com.aoics.xxsm.admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.aoics.xxsm.R;

public class VP3_stauts extends AppCompatActivity {
    private String[] data = {"主服务器：正常","辅服务器：正常","网络上行：正常","网络下行：正常","数据库状态：正常","系统负载：65%","安全警报：无","风险操作：无","今日反馈：5","aa","bb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vp3_stauts);

        Button back = findViewById(R.id.vp3_return1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(VP3_stauts.this, VP3Main.class);
                startActivity(intent);
                finish();
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                VP3_stauts.this, android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.status_list);
        listView.setAdapter(adapter);
    }
}
