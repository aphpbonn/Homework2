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
                            tvDisplay.setText("+" + sum);
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
                            tvDisplay.setText("-" + sum);
                        }
                        break;
                    }
                    case (R.id.buttonOne): {
                        if (!isReady) {
                        } else {
                            if (isAdding) {
                                sum += 1;
                                tvDisplay.setText("+" + sum);
                            } else {
                                if (sum - 1 >= 0) sum -= 1;
                                else sum = 0;
                                tvDisplay.setText("-" + sum);
                            }
                        }
                        break;
                    }
                    case (R.id.buttonThree): {
                        if (!isReady) {
                        } else {
                            if (isAdding) {
                                sum += 3;
                                tvDisplay.setText("+" + sum);
                            } else {
                                if (sum - 3 >= 0) sum -= 3;
                                else sum = 0;
                                tvDisplay.setText("-" + sum);
                            }
                        }
                        break;
                    }
                    case (R.id.buttonFive): {
                        if (!isReady) {
                        } else {
                            if (isAdding) {
                                sum += 5;
                                tvDisplay.setText("+" + sum);
                            } else {
                                if (sum - 5 >= 0) sum -= 5;
                                else sum = 0;
                                tvDisplay.setText("-" + sum);
                            }
                        }
                        break;
                    }
                    case (R.id.buttonSeven): {
                        if (!isReady) {
                        } else {
                            if (isAdding) {
                                sum += 7;
                                tvDisplay.setText("+" + sum);
                            } else {
                                if (sum - 7 >= 0) sum -= 7;
                                else sum = 0;
                                tvDisplay.setText("-" + sum);
                            }
                        }
                        break;
                    }
                    case (R.id.buttonNine): {
                        if (!isReady) {
                        } else {
                            if (isAdding) {
                                sum += 9;
                                tvDisplay.setText("+" + sum);
                            } else {
                                if (sum - 9 >= 0) sum -= 9;
                                else sum = 0;
                                tvDisplay.setText("-" + sum);
                            }
                        }
                        break;
                    }
                    case (R.id.buttonEleven): {
                        if (!isReady) {
                        } else {
                            if (isAdding) {
                                sum += 11;
                                tvDisplay.setText("+" + sum);
                            } else {
                                if (sum - 11 >= 0) sum -= 11;
                                else sum = 0;
                                tvDisplay.setText("-" + sum);
                            }
                        }
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
}
