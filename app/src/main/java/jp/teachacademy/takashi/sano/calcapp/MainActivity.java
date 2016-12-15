package jp.teachacademy.takashi.sano.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static jp.teachacademy.takashi.sano.calcapp.R.id.editText1;
import static jp.teachacademy.takashi.sano.calcapp.R.id.editText2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText editText1 = (EditText)findViewById(R.id.editText1);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        double a = Integer.parseInt(editText1.getText().toString());
        double b = Integer.parseInt(editText2.getText().toString());
        Log.d("四則a",String.valueOf(a));
        Log.d("四則b",String.valueOf(b));

        if(v.getId() == R.id.button1) {
            Intent intent = new Intent(this, SecondActivity.class);
            Log.d("四則a2",String.valueOf(a));
            intent.putExtra("VALUE",a+b);
            Log.d("四則a+b",String.valueOf(a+b));
            startActivity(intent);
            Log.d("四則a+b2",String.valueOf(a+b));
        }else if(v.getId()== R.id.button2){
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE",a-b);
            startActivity(intent);
        }else if(v.getId()== R.id.button3){
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE",a*b);
            startActivity(intent);
        }else if(v.getId()== R.id.button4){
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE",a/b);
            startActivity(intent);
        }
    }
}
