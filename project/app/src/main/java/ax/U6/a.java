/*
 * Decompiled with CFR 0.152.
 */
package ax.U6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.x;
import ax.K6.b;
import ax.k6.c;
import ax.k6.m;

public class a
extends x {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public a(Context context, AttributeSet attributeSet, int n8) {
        super(ax.V6.a.d(context, attributeSet, n8, 0), attributeSet, n8);
        this.v(attributeSet, n8, 0);
    }

    private void s(Resources.Theme theme, int n8) {
        theme = theme.obtainStyledAttributes(n8, m.a4);
        n8 = a.w(this.getContext(), (TypedArray)theme, m.d4, m.f4);
        theme.recycle();
        if (n8 >= 0) {
            this.setLineHeight(n8);
        }
    }

    private static boolean t(Context context) {
        return b.b(context, c.f0, true);
    }

    private static int u(Resources.Theme theme, AttributeSet attributeSet, int n8, int n9) {
        theme = theme.obtainStyledAttributes(attributeSet, m.g4, n8, n9);
        n8 = theme.getResourceId(m.h4, -1);
        theme.recycle();
        return n8;
    }

    private void v(AttributeSet attributeSet, int n8, int n9) {
        Resources.Theme theme;
        Context context = this.getContext();
        if (a.t(context) && !a.x(context, theme = context.getTheme(), attributeSet, n8, n9) && (n8 = a.u(theme, attributeSet, n8, n9)) != -1) {
            this.s(theme, n8);
        }
    }

    private static int w(Context context, TypedArray typedArray, int ... nArray) {
        int n8 = -1;
        for (int i8 = 0; i8 < nArray.length && n8 < 0; ++i8) {
            n8 = ax.K6.c.c(context, typedArray, nArray[i8], -1);
        }
        return n8;
    }

    private static boolean x(Context context, Resources.Theme theme, AttributeSet attributeSet, int n8, int n9) {
        theme = theme.obtainStyledAttributes(attributeSet, m.g4, n8, n9);
        n8 = a.w(context, (TypedArray)theme, m.i4, m.j4);
        theme.recycle();
        return n8 != -1;
    }

    @Override
    public void setTextAppearance(Context context, int n8) {
        super.setTextAppearance(context, n8);
        if (a.t(context)) {
            this.s(context.getTheme(), n8);
        }
    }
}

