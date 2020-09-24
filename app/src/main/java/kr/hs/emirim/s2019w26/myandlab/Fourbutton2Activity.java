package kr.hs.emirim.s2019w26.myandlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fourbutton2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourbutton2);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()){
            case R.id.button1:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.e-mirim.hs.kr/"));
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(intent);
                break;
            case R.id.button4:
                finish();
                break;
        }
    }
}