/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.x;
import ax.m.j;

public class DialogTitle
extends x {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        int n10;
        super.onMeasure(n8, n9);
        Layout layout = this.getLayout();
        if (layout != null && (n10 = layout.getLineCount()) > 0 && layout.getEllipsisCount(n10 - 1) > 0) {
            this.setSingleLine(false);
            this.setMaxLines(2);
            layout = this.getContext().obtainStyledAttributes(null, j.B2, 0x1010041, 16973892);
            n10 = layout.getDimensionPixelSize(j.C2, 0);
            if (n10 != 0) {
                this.setTextSize(0, n10);
            }
            layout.recycle();
            super.onMeasure(n8, n9);
        }
    }
}

