package net.greenrivertech.ramona.block1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonBlue, buttonPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue = (Button) findViewById(R.id.button_blueInvisible);
        buttonBlue.setOnClickListener(this);
        buttonPink = new Button(getApplicationContext());
        buttonPink.setTextColor(Color.BLACK);
        buttonPink.setBackgroundColor(Color.parseColor("#FD9BF3"));
        buttonPink.setText("The Pink Panther's To Do List");
        RelativeLayout rl_mainScreen = (RelativeLayout)findViewById(R.id.relativeLayout_mainScreen);
        // defines the size of the button
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        // defines the position of the new button
        params.addRule(RelativeLayout.BELOW, buttonBlue.getId());
        rl_mainScreen.addView(buttonPink, params);
        buttonPink.setOnClickListener(this);
    }

    public void toDo(View v) {
        if (v.equals(buttonBlue)) {
            // invisibility
            buttonBlue.setVisibility(View.INVISIBLE);
        }
        if (v.equals(buttonPink)) {
            // pop-up
            Toast.makeText(getApplicationContext(),
                    "to do to do to do...",
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        toDo(v);
    }
}
