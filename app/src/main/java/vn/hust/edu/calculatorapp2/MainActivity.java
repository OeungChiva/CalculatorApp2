package vn.hust.edu.calculatorapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView calculation, result;
    private String curr, res;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn_Equal, btn_Plus, btn_Plus_Minus, btn_Minus, btn_CE, btn_C, btn_Delete, btn_Dot, btn_Divide, btn_Multiply;
    private boolean dot_inserted, operator_inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculation = (TextView) findViewById(R.id.calculation);
        result = (TextView) findViewById(R.id.result);
        curr = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn_Dot = (Button) findViewById(R.id.btn_Dot);
        btn_Equal = (Button) findViewById(R.id.btn_Equal);
        btn_Plus = (Button) findViewById(R.id.btn_Plus);
        btn_Plus_Minus = (Button) findViewById(R.id.btn_Plus_Minus);
        btn_Minus = (Button) findViewById(R.id.btn_Minus);
        btn_CE = (Button) findViewById(R.id.btn_CE);
        btn_C = (Button) findViewById(R.id.btn_C);
        btn_Delete = (Button) findViewById(R.id.btn_Delete);
        btn_Divide = (Button) findViewById(R.id.btn_Divide);
        btn_Multiply = (Button) findViewById(R.id.btn_Multiply);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "0";
                displayOne();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "1";
                displayOne();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "2";
                displayOne();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "3";
                displayOne();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "4";
                displayOne();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "5";
                displayOne();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "6";
                displayOne();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "7";
                displayOne();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "8";
                displayOne();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "9";
                displayOne();
            }
        });
        btn_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curr.isEmpty()) {
                    curr = "0.";
                    dot_inserted = true;
                }
                if (dot_inserted = false) {
                    curr = curr + ".";
                    dot_inserted = true;
                }
                displayOne();
            }
        });
        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });
        btn_CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });
        btn_Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete();
                displayOne();
            }
        });
        btn_Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        delete();
                    }
                    if (operator_inserted == false) {
                        curr = curr + "/";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });
        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        delete();
                    }
                    if (operator_inserted == false) {
                        curr = curr + "x";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });
        btn_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        delete();
                    }
                    if (operator_inserted == false) {
                        curr = curr + "-";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });
        btn_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        delete();
                    }
                    if (operator_inserted == false) {
                        curr = curr + "+";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });
        btn_Plus_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = "-" + curr;
                displayOne();
            }
        });
        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator_inserted == true && !curr.substring(curr.length()-1, curr.length()).equals(" ")){
                    String [] tokens = curr.split(" ");
                    switch (tokens[1].charAt(0)){
                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case 'x':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '៖':
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });

    }

    public void displayOne() {
        calculation.setText(curr);
    }

    public void displayTwo() {
        result.setText(res);
    }

    public void clear() {
        curr = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;
    }

    public void delete() {
        if (!curr.isEmpty()) {
            if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                dot_inserted = false;
            }
            if (curr.substring(curr.length() - 1, curr.length()).equals(" ")) {
                curr = curr.substring(0, curr.length() - 3);
                operator_inserted = false;
            } else {
                curr = curr.substring(0, curr.length() - 1);
            }

        }

    }
}
