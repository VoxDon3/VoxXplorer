package ax.V6;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ax.k6.C2402c;
import ax.m.C2506a;
import ax.s.C3036c;

/* loaded from: classes3.dex */
public class a {
    private static final int[] a = {R.attr.theme, C2506a.P};
    private static final int[] b = {C2402c.B};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int[] b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                iArr2[i3] = obtainStyledAttributes.getResourceId(i3, 0);
            }
            obtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    private static int c(Context context, AttributeSet attributeSet, int i, int i2) {
        return b(context, attributeSet, b, i, i2)[0];
    }

    public static Context d(Context context, AttributeSet attributeSet, int i, int i2) {
        return e(context, attributeSet, i, i2, new int[0]);
    }

    public static Context e(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        int c = c(context, attributeSet, i, i2);
        boolean z = (context instanceof C3036c) && ((C3036c) context).c() == c;
        if (c == 0 || z) {
            return context;
        }
        C3036c c3036c = new C3036c(context, c);
        for (int i3 : b(context, attributeSet, iArr, i, i2)) {
            if (i3 != 0) {
                c3036c.getTheme().applyStyle(i3, true);
            }
        }
        int a2 = a(context, attributeSet);
        if (a2 != 0) {
            c3036c.getTheme().applyStyle(a2, true);
        }
        return c3036c;
    }
}
