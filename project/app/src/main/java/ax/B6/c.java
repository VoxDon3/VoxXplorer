/*
 * Decompiled with CFR 0.152.
 */
package ax.B6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import ax.F6.w;
import ax.k6.e;
import ax.k6.m;

public class c {
    public static Rect a(Context context, int n8, int n9) {
        TypedArray typedArray = w.i(context, null, m.e2, n8, n9, new int[0]);
        int n10 = typedArray.getDimensionPixelSize(m.h2, context.getResources().getDimensionPixelSize(e.U));
        int n11 = typedArray.getDimensionPixelSize(m.i2, context.getResources().getDimensionPixelSize(e.V));
        n8 = typedArray.getDimensionPixelSize(m.g2, context.getResources().getDimensionPixelSize(e.T));
        int n12 = typedArray.getDimensionPixelSize(m.f2, context.getResources().getDimensionPixelSize(e.S));
        typedArray.recycle();
        int n13 = context.getResources().getConfiguration().getLayoutDirection();
        n9 = n13 == 1 ? n8 : n10;
        if (n13 == 1) {
            n8 = n10;
        }
        return new Rect(n9, n11, n8, n12);
    }

    public static InsetDrawable b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}

