/*
 * Decompiled with CFR 0.152.
 */
package ax.F0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;

@Deprecated
public class a
extends View {
    private static int a(int n8, int n9) {
        int n10 = View.MeasureSpec.getMode((int)n9);
        n9 = View.MeasureSpec.getSize((int)n9);
        if (n10 != Integer.MIN_VALUE) {
            if (n10 != 0x40000000) {
                return n8;
            }
            return n9;
        }
        return Math.min(n8, n9);
    }

    @Deprecated
    @SuppressLint(value={"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Deprecated
    protected void onMeasure(int n8, int n9) {
        this.setMeasuredDimension(a.a(this.getSuggestedMinimumWidth(), n8), a.a(this.getSuggestedMinimumHeight(), n9));
    }
}

