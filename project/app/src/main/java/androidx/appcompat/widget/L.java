/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.k;
import ax.S.h;
import ax.o.a;

public class L {
    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private L(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static L t(Context context, int n8, int[] nArray) {
        return new L(context, context.obtainStyledAttributes(n8, nArray));
    }

    public static L u(Context context, AttributeSet attributeSet, int[] nArray) {
        return new L(context, context.obtainStyledAttributes(attributeSet, nArray));
    }

    public static L v(Context context, AttributeSet attributeSet, int[] nArray, int n8, int n9) {
        return new L(context, context.obtainStyledAttributes(attributeSet, nArray, n8, n9));
    }

    public boolean a(int n8, boolean bl) {
        return this.b.getBoolean(n8, bl);
    }

    public int b(int n8, int n9) {
        return this.b.getColor(n8, n9);
    }

    public ColorStateList c(int n8) {
        ColorStateList colorStateList;
        int n9;
        if (this.b.hasValue(n8) && (n9 = this.b.getResourceId(n8, 0)) != 0 && (colorStateList = ax.o.a.a(this.a, n9)) != null) {
            return colorStateList;
        }
        return this.b.getColorStateList(n8);
    }

    public float d(int n8, float f8) {
        return this.b.getDimension(n8, f8);
    }

    public int e(int n8, int n9) {
        return this.b.getDimensionPixelOffset(n8, n9);
    }

    public int f(int n8, int n9) {
        return this.b.getDimensionPixelSize(n8, n9);
    }

    public Drawable g(int n8) {
        int n9;
        if (this.b.hasValue(n8) && (n9 = this.b.getResourceId(n8, 0)) != 0) {
            return ax.o.a.b(this.a, n9);
        }
        return this.b.getDrawable(n8);
    }

    public Drawable h(int n8) {
        if (this.b.hasValue(n8) && (n8 = this.b.getResourceId(n8, 0)) != 0) {
            return k.b().d(this.a, n8, true);
        }
        return null;
    }

    public float i(int n8, float f8) {
        return this.b.getFloat(n8, f8);
    }

    public Typeface j(int n8, int n9, h.e e8) {
        if ((n8 = this.b.getResourceId(n8, 0)) == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return h.h(this.a, n8, this.c, n9, e8);
    }

    public int k(int n8, int n9) {
        return this.b.getInt(n8, n9);
    }

    public int l(int n8, int n9) {
        return this.b.getInteger(n8, n9);
    }

    public int m(int n8, int n9) {
        return this.b.getLayoutDimension(n8, n9);
    }

    public int n(int n8, int n9) {
        return this.b.getResourceId(n8, n9);
    }

    public String o(int n8) {
        return this.b.getString(n8);
    }

    public CharSequence p(int n8) {
        return this.b.getText(n8);
    }

    public CharSequence[] q(int n8) {
        return this.b.getTextArray(n8);
    }

    public TypedArray r() {
        return this.b;
    }

    public boolean s(int n8) {
        return this.b.hasValue(n8);
    }

    public TypedValue w(int n8) {
        return this.b.peekValue(n8);
    }

    public void x() {
        this.b.recycle();
    }
}

