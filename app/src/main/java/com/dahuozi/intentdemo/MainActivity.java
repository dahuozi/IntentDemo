package com.dahuozi.intentdemo;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        switch (view.getId()){
            case R.id.btn1:
                /*Intent intent = new Intent();
                ComponentName componentName = new ComponentName(MainActivity.this,ResoultActivity.class);
                intent.setComponent(componentName);*/

                /*
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,ResoultActivity.class);*/


                Intent intent = new Intent();
                intent.setClassName(MainActivity.this,ResoultActivity.class.getName());

                startActivity(intent);
                break;
            case R.id.btn2:
                //Uri.parse(String s). Uri 抽象类 调用静态的parse()方法 指定action操作的数据
                Intent intent1 = new Intent(Intent.ACTION_CALL,Uri.parse("tel://10086"));
                startActivity(intent1);
                break;
            case R.id.btn3:
                Intent intent2 = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms://10086"));
                startActivity(intent2);
                break;
            case R.id.btn4:
                Intent intent3 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.dahuozi.com"));
                startActivity(intent3);
                break;
            case R.id.btn5:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                /*
                intent4.setData(Uri.parse("file://"+ Environment.getExternalStorageDirectory().getAbsolutePath()+".mp3"));
                intent4.setType("audio/*");*/
                intent4.setDataAndType(Uri.parse("file://"+Environment.getExternalStorageDirectory().getAbsolutePath()+",mp3"),"audio/*");
                startActivity(intent4);
                break;
        }
    }
}
