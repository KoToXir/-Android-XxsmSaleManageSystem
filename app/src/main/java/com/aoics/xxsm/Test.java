package com.aoics.xxsm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.aoics.xxsm.admin.VP3_stauts;
import com.aoics.xxsm.data.People;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;

public class Test extends AppCompatActivity {

    //String iii;
    ArrayList<String> data = new ArrayList<String> ();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        Button aaa = findViewById(R.id.buttonaaa);

        aaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                List<People> iii = LitePal.findAll(People.class);
                for (People mm: iii){
//                    Log.d("Test",""+mm.getId());
//                    Log.d("Test","工号"+mm.getEmpno());
//                    Log.d("Test","姓名"+mm.getName());
//                    Log.d("Test","密码"+mm.getPsw());
                    data.add(mm.getEmpno()+":"+mm.getName());
                    //data[i]=mm.getEmpno();
                    //i++;
                }
                //Log.d("Test",data[1]);
                ArrayAdapter<String> adapter = new ArrayAdapter<>(Test.this, android.R.layout.simple_list_item_1, data);
                ListView listView = findViewById(R.id.ttlist);
                listView.setAdapter(adapter);
            }

        });


    }
}
