package com.example.materialui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import com.jamesnyakush.oto.OTPEditText;

public class MainActivity extends AppCompatActivity {
    OTPEditText edit1,edit2,edit3,edit4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.etxt_one);
        edit2 = findViewById(R.id.etxt_two);
        edit3 = findViewById(R.id.etxt_three);
        edit4 = findViewById(R.id.etxt_four);

        otp();
    }

    private void otp() {
//        String one   = edit1.getText().toString().trim();
//        String two   = edit2.getText().toString().trim();
//        String three = edit3.getText().toString().trim();
//        String four  = edit4.getText().toString().trim();

//        edit1.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//                Integer textlength1 = edit1.getText().length();
//
//                if (textlength1 >= 1) {
//                    edit1.setBackgroundResource(R.drawable.circle_white_with_app_edge);
//                    edit2.requestFocus();
//                } else {
//                    edit1.setBackgroundResource(R.drawable.circle_white_with_gray_edge);
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
//
//        edit2.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                Integer textlength2 = edit2.getText().length();
//
//                if (textlength2 >= 1) {
//                    edit2.setBackgroundResource(R.drawable.circle_white_with_app_edge);
//                    edit3.requestFocus();
//                } else {
//                    edit2.setBackgroundResource(R.drawable.circle_white_with_gray_edge);
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

//        edit3.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                Integer textlength3 = edit3.getText().length();
//                if (textlength3 >= 1) {
//                    edit3.setBackgroundResource(R.drawable.circle_white_with_app_edge);
//                    edit4.requestFocus();
//                } else {
//                    edit3.setBackgroundResource(R.drawable.circle_white_with_gray_edge);
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
//        edit4.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                Integer textlength4 = edit4.getText().length();
//                if (textlength4 >= 1) {
//                    edit4.setBackgroundResource(R.drawable.circle_white_with_app_edge);
////                    edit4.requestFocus();
//                } else {
//                    edit4.setBackgroundResource(R.drawable.circle_white_with_gray_edge);
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

//        edit2.setOnDeleteKeyClick(new OTPEditText.OnDeleteKeyClick() {
//            @Override
//            public void onDeleteKeyClick(boolean isPressed) {
//
//                int i = edit2.getText().toString().length();
//                if (i == 0) {
//                    edit1.setText("");
//                    edit1.requestFocus();
//                }
//            }
//        });
//
//        edit3.setOnDeleteKeyClick(new OTPEditText.OnDeleteKeyClick() {
//            @Override
//            public void onDeleteKeyClick(boolean isPressed) {
//
//                int i = edit3.getText().toString().length();
//                if (i == 0) {
//                    edit2.setText("");
//                    edit2.requestFocus();
//                }
//            }
//        });
//        edit4.setOnDeleteKeyClick(new OTPEditText.OnDeleteKeyClick() {
//            @Override
//            public void onDeleteKeyClick(boolean isPressed) {
//
//                int i = edit3.getText().toString().length();
//                if (i == 0) {
//                    edit3.setText("");
//                    edit3.requestFocus();
//                }
//            }
//        });
    }
}
