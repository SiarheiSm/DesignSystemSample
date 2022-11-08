package lumi.design.xml.divider

import android.content.Context
import android.util.AttributeSet
import android.view.View
import lumi.design.xml.R
import lumi.design.xml.extension.dp

class Divider @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.dividerStyle,
) : View(context, attrs, defStyleAttr) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(
            widthMeasureSpec,
            MeasureSpec.makeMeasureSpec(1.dp, MeasureSpec.EXACTLY)
        )
    }
}