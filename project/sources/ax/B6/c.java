package ax.B6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import ax.F6.w;
import ax.k6.C2404e;
import ax.k6.m;

/* loaded from: classes3.dex */
public class c {
    public static Rect a(Context context, int i, int i2) {
        TypedArray i3 = w.i(context, null, m.e2, i, i2, new int[0]);
        int dimensionPixelSize = i3.getDimensionPixelSize(m.h2, context.getResources().getDimensionPixelSize(C2404e.U));
        int dimensionPixelSize2 = i3.getDimensionPixelSize(m.i2, context.getResources().getDimensionPixelSize(C2404e.V));
        int dimensionPixelSize3 = i3.getDimensionPixelSize(m.g2, context.getResources().getDimensionPixelSize(C2404e.T));
        int dimensionPixelSize4 = i3.getDimensionPixelSize(m.f2, context.getResources().getDimensionPixelSize(C2404e.S));
        i3.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int i4 = layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize;
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i4, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }

    public static InsetDrawable b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
