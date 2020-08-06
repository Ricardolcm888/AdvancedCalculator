package example.ixidev.advancedcalculator

import android.text.InputType
import android.widget.EditText

fun EditText.hideKeyBoard() {
    this.setRawInputType(InputType.TYPE_NULL)
}

fun EditText.toText(): String {
    return this.text.toString()
}