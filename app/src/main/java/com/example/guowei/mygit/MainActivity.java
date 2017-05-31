package com.example.guowei.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  private Button btn_feature1,btn_feature2,btn_feature4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_feature1 = (Button) findViewById(R.id.feature1);
        btn_feature2 = (Button) findViewById(R.id.feature2);
        btn_feature4 = (Button) findViewById(R.id.feature4);
    }
    public void feature1(View view){
        if(view.getId()!=0){
            if(btn_feature1.getText().toString().equals("分支功能1")){
                btn_feature1.setText("展示分支功能1");
            }else {
                btn_feature1.setText("分支功能1");
            }
        }
    }
    public void feature2(View view){
        if(view.getId()!=0){
            if(btn_feature2.getText().toString().equals("分支功能2")){
                btn_feature2.setText("展示分支功能2");
            }else {
                btn_feature2.setText("分支功能2");
            }
        }
    }
    public void feature4(View view){
        if(view.getId()!=0){
            if(btn_feature4.getText().toString().equals("分支功能4")){
                btn_feature4.setText("展示分支功能4");
            }else {
                btn_feature4.setText("分支功能4");
            }
        }
    }
}
