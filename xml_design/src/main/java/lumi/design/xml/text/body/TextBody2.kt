package lumi.design.xml.text.body

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView
import lumi.design.xml.R

/**
 * Typography Body1, with the following properties:
 *  - Size: 14sp
 *  - Font: Batonturbo Regular
 *  - Letter Spacing: 0
 *  - Line Spacing Extra: 9dp
 *  - Line Spacing Multiplier: 0.75
 **/
class TextBody2 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.fontStyleBody2,
) : MaterialTextView(context, attrs, defStyleAttr)