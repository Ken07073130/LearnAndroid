package com.example.ken.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Ken on 2015/5/28.
 */
public class myAty extends Activity {
    public static final String ACTION="com.example.ken.helloworld.action.intent.myAty";
    private TextView tv;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_aty);
        tv= (TextView) findViewById(R.id.textView2);
        button= (Button) findViewById(R.id.button);
    }
}
