package net.greenrivertech.ramona.moduledependency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jdom2.Document;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Document doc = new Document();
    }
}
