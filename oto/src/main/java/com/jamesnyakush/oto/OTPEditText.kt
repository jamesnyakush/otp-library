package com.jamesnyakush.oto

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputConnectionWrapper
import android.widget.EditText

import java.util.Random

class OTPEditText : EditText {
    private val r = Random()

    var onDeleteKeyClick: OnDeleteKeyClick? = null

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context) : super(context)

    fun setRandomBackgroundColor() {
        setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r
                .nextInt(256)))
    }

    override fun onCreateInputConnection(outAttrs: EditorInfo): InputConnection {
        return OTPInputConnection(super.onCreateInputConnection(outAttrs),
                true)
    }

    private inner class OTPInputConnection(target: InputConnection, mutable: Boolean) : InputConnectionWrapper(target, mutable) {

        override fun sendKeyEvent(event: KeyEvent): Boolean {
            if (event.action == KeyEvent.ACTION_DOWN && event.keyCode == KeyEvent.KEYCODE_DEL) {
                try {
                    onDeleteKeyClick!!.onDeleteKeyClick(true)
                } catch (ignored: Exception) {
                }

            }
            return super.sendKeyEvent(event)
        }

        override fun deleteSurroundingText(beforeLength: Int, afterLength: Int): Boolean {
            return if (beforeLength == 1 && afterLength == 0) {
                sendKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL)) && sendKeyEvent(KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_DEL))
            } else super.deleteSurroundingText(beforeLength, afterLength)
        }
    }

    interface OnDeleteKeyClick {
        fun onDeleteKeyClick(isPressed: Boolean)
    }
}
