package ax.U6;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.x;
import ax.K6.b;
import ax.K6.c;
import ax.k6.C2402c;
import ax.k6.m;

/* loaded from: classes3.dex */
public class a extends x {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void s(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, m.a4);
        int w = w(getContext(), obtainStyledAttributes, m.d4, m.f4);
        obtainStyledAttributes.recycle();
        if (w >= 0) {
            setLineHeight(w);
        }
    }

    private static boolean t(Context context) {
        return b.b(context, C2402c.f0, true);
    }

    private static int u(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.g4, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(m.h4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void v(AttributeSet attributeSet, int i, int i2) {
        int u;
        Context context = getContext();
        if (t(context)) {
            Resources.Theme theme = context.getTheme();
            if (x(context, theme, attributeSet, i, i2) || (u = u(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            s(theme, u);
        }
    }

    private static int w(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = c.c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private static boolean x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.g4, i, i2);
        int w = w(context, obtainStyledAttributes, m.i4, m.j4);
        obtainStyledAttributes.recycle();
        return w != -1;
    }

    @Override // androidx.appcompat.widget.x, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (t(context)) {
            s(context.getTheme(), i);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(ax.V6.a.d(context, attributeSet, i, 0), attributeSet, i);
        v(attributeSet, i, 0);
    }
}
