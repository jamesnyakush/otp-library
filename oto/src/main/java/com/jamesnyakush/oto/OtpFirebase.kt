package com.jamesnyakush.oto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.otp_firebase.*

class OtpFirebase : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_firebase)

        otp()
    }

    private fun otp() {

        val one   = etxt_one.text.toString().trim()
        val two   = etxt_two.text.toString().trim()
        val three = etxt_three.text.toString().trim()
        val four  = etxt_four.text.toString().trim()


        etxt_one.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                val textlength1 = etxt_one.getText().length

                if (textlength1 >= 1) {
                    etxt_one.setBackgroundResource(R.drawable.circle_white_with_app_edge)
                    etxt_two.requestFocus()
                } else {
                    etxt_one.setBackgroundResource(R.drawable.circle_white_with_gray_edge)
                }
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })

        etxt_two.addTextChangedListener(object :  TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                val textlength1 = etxt_two.getText().length

                if (textlength1 >= 1) {
                    etxt_two.setBackgroundResource(R.drawable.circle_white_with_app_edge)
                    etxt_three.requestFocus()
                } else {
                    etxt_two.setBackgroundResource(R.drawable.circle_white_with_gray_edge)
                }
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })

        etxt_three.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                val textlength1 = etxt_one.getText().length

                if (textlength1 >= 1) {
                    etxt_one.setBackgroundResource(R.drawable.circle_white_with_app_edge)
                    etxt_three.requestFocus()
                } else {
                    etxt_three.setBackgroundResource(R.drawable.circle_white_with_gray_edge)
                }
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })

        etxt_four.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                val textlength1 = etxt_one.getText().length

                if (textlength1 >= 1) {
                    etxt_four.setBackgroundResource(R.drawable.circle_white_with_app_edge)
                    etxt_four.requestFocus()
                } else {
                    etxt_four.setBackgroundResource(R.drawable.circle_white_with_gray_edge)
                }
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })

        etxt_two.onDeleteKeyClick = object : OTPEditText.OnDeleteKeyClick {
            override fun onDeleteKeyClick(isPressed: Boolean) {

                val i = etxt_two.getText().toString().length
                if (i == 0) {
                    etxt_one.setText("")
                    etxt_one.requestFocus()
                }
            }
        }

        etxt_three.onDeleteKeyClick = object : OTPEditText.OnDeleteKeyClick {
            override fun onDeleteKeyClick(isPressed: Boolean) {

                val i = etxt_three.getText().toString().length
                if (i == 0) {
                    etxt_two.setText("")
                    etxt_two.requestFocus()
                }
            }
        }

        etxt_four.onDeleteKeyClick = object : OTPEditText.OnDeleteKeyClick {
            override fun onDeleteKeyClick(isPressed: Boolean) {

                val i = etxt_four.getText().toString().length
                if (i == 0) {
                    etxt_three.setText("")
                    etxt_three.requestFocus()
                }
            }
        }
    }
}
