package net.greenrivertech.ramona.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MYCONST = 614;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doThis();
    }

    private void doThis() {
        MyTextUtil textUtil = new MyTextUtil("Ramona");
        MyTextUtil util2 = new MyTextUtil();
        textUtil.doSomethingElse();

        Intent intent = new Intent();

        Toast.makeText(MainActivity.this, "My message", Toast.LENGTH_SHORT).show();

        Log.i(TAG
                , "doThis: my message");
    }
}
