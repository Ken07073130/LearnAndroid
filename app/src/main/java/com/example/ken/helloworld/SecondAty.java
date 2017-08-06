package com.example.ken.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_aty);

        //接收Intent
        Intent intent=getIntent();
        String strExtraData = intent.getStringExtra("extra_data");
        ((TextView)findViewById(R.id.tvIntentText)).setText(strExtraData);
    }

    @Override
    public void onBackPressed() {
        Intent intent =new Intent();
        intent.putExtra("resultString","111");
        setResult(RESULT_OK,intent);
        super.onBackPressed();
    }
}
