package com.example.tngp17_001.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    boolean isReady = false;
    boolean isAdding = true;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonOne = (Button) findViewById(R.id.buttonOne);
        Button buttonThree = (Button) findViewById(R.id.buttonThree);
        Button buttonFive = (Button) findViewById(R.id.buttonFive);
        Button buttonSeven = (Button) findViewById(R.id.buttonSeven);
        Button buttonNine = (Button) findViewById(R.id.buttonNine);
        Button buttonEleven = (Button) findViewById(R.id.buttonEleven);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonAdd: {
                        if (!isReady) {
                            isReady = true;
                            isAdding = true;
                            tvDisplay.setText("+");
                        } else {
                            if (!isAdding) isAdding = true;
                            if(sum==0) tvDisplay.setText("+");
                            else tvDisplay.setText("+" + sum);
                        }
                        break;
                    }
                    case R.id.buttonMinus: {
                        if (!isReady) {
                            isReady = true;
                            isAdding = false;
                            tvDisplay.setText("-");
                        } else {
                            if (isAdding) isAdding = false;
                            if (sum==0) tvDisplay.setText("-");
                            else tvDisplay.setText("-" + sum);
                        }
                        break;
                    }
                    case (R.id.buttonOne): {
                        calculate(tvDisplay,1);
                        break;
                    }
                    case (R.id.buttonThree): {
                        calculate(tvDisplay,3);
                        break;
                    }
                    case (R.id.buttonFive): {
                        calculate(tvDisplay,5);
                        break;
                    }
                    case (R.id.buttonSeven): {
                        calculate(tvDisplay,7);
                        break;
                    }
                    case (R.id.buttonNine): {
                        calculate(tvDisplay,9);
                        break;
                    }
                    case (R.id.buttonEleven): {
                        calculate(tvDisplay,11);
                        break;
                    }
                    case (R.id.buttonClear): {
                        isReady = false;
                        isAdding = true;
                        sum = 0;
                        tvDisplay.setText("");
                        break;
                    }
                }


            }
        };
        buttonAdd.setOnClickListener(myOnClickListener);
        buttonMinus.setOnClickListener(myOnClickListener);
        buttonOne.setOnClickListener(myOnClickListener);
        buttonThree.setOnClickListener(myOnClickListener);
        buttonFive.setOnClickListener(myOnClickListener);
        buttonSeven.setOnClickListener(myOnClickListener);
        buttonNine.setOnClickListener(myOnClickListener);
        buttonEleven.setOnClickListener(myOnClickListener);
        buttonClear.setOnClickListener(myOnClickListener);

    }

    public void calculate(TextView tvDisplay,int input) {
        if (!isReady) {
        } else {
            if (isAdding) {
                sum += input;
                tvDisplay.setText("+" + sum);
            } else {
                if (sum - input >= 0) sum -= input;
                else sum = 0;
                tvDisplay.setText("-" + sum);
            }
        }
    }
}
