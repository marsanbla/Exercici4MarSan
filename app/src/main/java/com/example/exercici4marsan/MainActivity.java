package com.example.exercici4marsan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mCount=0;
    private TextView mShowCount;
    int restarcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.lblCompte);
    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this,R.string.toastButtontxt,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void Countup(View view) {

        mCount++;
        if(mShowCount !=null){
            mShowCount.setText(Integer.toString(mCount));
        }


    }


    public void CoundDown(View view) {
        restarcount = mCount-1;
        if(mShowCount !=null){
            mShowCount.setText(Integer.toString(restarcount));
        }
    }
}