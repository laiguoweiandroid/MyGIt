package com.example.guowei.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  private Button btn_feature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_feature = (Button) findViewById(R.id.feature1);
    }
    public void feature(View view){
        if(view.getId()!=0){
            if(btn_feature.getText().toString().equals("分支功能1")){
                btn_feature.setText("展示分支功能1");
            }else {
                btn_feature.setText("分支功能1");
            }
        }
    }
}
