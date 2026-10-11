/*
 * Decompiled with CFR 0.152.
 */
package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ax.y.a;

@Deprecated
public class BrowserActionsFallbackMenuView
extends LinearLayout {
    private final int a = this.getResources().getDimensionPixelOffset(ax.y.a.b);
    private final int b = this.getResources().getDimensionPixelOffset(ax.y.a.a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)Math.min(this.getResources().getDisplayMetrics().widthPixels - this.a * 2, this.b), (int)0x40000000), n9);
    }
}

