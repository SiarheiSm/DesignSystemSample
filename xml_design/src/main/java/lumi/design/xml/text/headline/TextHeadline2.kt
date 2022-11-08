package lumi.design.xml.text.headline

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView
import lumi.design.xml.R

/**
 * Typography Headline2:
 *  - Size: 20sp
 *  - Font: Batonturbo Bold
 *  - Letter Spacing: -0.005
 *  - Line Spacing Extra: 6dp
 *  - Line Spacing Multiplier: 0.70
 **/
class TextHeadline2 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.fontStyleHeadline2,
) : MaterialTextView(context, attrs, defStyleAttr)