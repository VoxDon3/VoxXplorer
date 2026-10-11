/*
 * Decompiled with CFR 0.152.
 */
package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.a;
import androidx.cardview.widget.b;
import androidx.cardview.widget.c;
import ax.A.d;

public class CardView
extends FrameLayout {
    private static final int[] h = new int[]{0x1010031};
    private static final c i;
    private boolean a;
    private boolean b;
    int c;
    int d;
    final Rect e;
    final Rect f;
    private final b g;

    static {
        a a8 = new a();
        i = a8;
        a8.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.A.a.a);
    }

    public CardView(Context context, AttributeSet object, int n8) {
        super(context, object, n8);
        b b8;
        Rect rect;
        this.e = rect = new Rect();
        this.f = new Rect();
        this.g = b8 = new b(this){
            private Drawable a;
            final CardView b;
            {
                this.b = cardView;
            }

            @Override
            public void b(int n8, int n9, int n10, int n11) {
                this.b.f.set(n8, n9, n10, n11);
                CardView cardView = this.b;
                Rect rect = cardView.e;
                CardView.super.setPadding(n8 + rect.left, n9 + rect.top, n10 + rect.right, n11 + rect.bottom);
            }

            @Override
            public void c(Drawable drawable) {
                this.a = drawable;
                this.b.setBackgroundDrawable(drawable);
            }

            @Override
            public boolean d() {
                return this.b.getPreventCornerOverlap();
            }

            @Override
            public boolean e() {
                return this.b.getUseCompatPadding();
            }

            @Override
            public Drawable f() {
                return this.a;
            }

            @Override
            public View g() {
                return this.b;
            }
        };
        TypedArray typedArray = context.obtainStyledAttributes(object, ax.A.d.a, n8, ax.A.c.a);
        n8 = ax.A.d.d;
        if (typedArray.hasValue(n8)) {
            object = typedArray.getColorStateList(n8);
        } else {
            object = this.getContext().obtainStyledAttributes(h);
            n8 = object.getColor(0, 0);
            object.recycle();
            object = new float[3];
            Color.colorToHSV((int)n8, (float[])object);
            n8 = object[2] > 0.5f ? this.getResources().getColor(ax.A.b.b) : this.getResources().getColor(ax.A.b.a);
            object = ColorStateList.valueOf((int)n8);
        }
        float f8 = typedArray.getDimension(ax.A.d.e, 0.0f);
        float f9 = typedArray.getDimension(ax.A.d.f, 0.0f);
        float f10 = typedArray.getDimension(ax.A.d.g, 0.0f);
        this.a = typedArray.getBoolean(ax.A.d.i, false);
        this.b = typedArray.getBoolean(ax.A.d.h, true);
        n8 = typedArray.getDimensionPixelSize(ax.A.d.j, 0);
        rect.left = typedArray.getDimensionPixelSize(ax.A.d.l, n8);
        rect.top = typedArray.getDimensionPixelSize(ax.A.d.n, n8);
        rect.right = typedArray.getDimensionPixelSize(ax.A.d.m, n8);
        rect.bottom = typedArray.getDimensionPixelSize(ax.A.d.k, n8);
        if (f9 > f10) {
            f10 = f9;
        }
        this.c = typedArray.getDimensionPixelSize(ax.A.d.b, 0);
        this.d = typedArray.getDimensionPixelSize(ax.A.d.c, 0);
        typedArray.recycle();
        i.a(b8, context, (ColorStateList)object, f8, f9, f10);
    }

    public ColorStateList getCardBackgroundColor() {
        return i.h(this.g);
    }

    public float getCardElevation() {
        return i.c(this.g);
    }

    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.e.left;
    }

    public int getContentPaddingRight() {
        return this.e.right;
    }

    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return i.g(this.g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return i.d(this.g);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    protected void onMeasure(int n8, int n9) {
        c c8 = i;
        if (!(c8 instanceof a)) {
            int n10 = View.MeasureSpec.getMode((int)n8);
            if (n10 == Integer.MIN_VALUE || n10 == 0x40000000) {
                n8 = View.MeasureSpec.makeMeasureSpec((int)Math.max((int)Math.ceil(c8.k(this.g)), View.MeasureSpec.getSize((int)n8)), (int)n10);
            }
            n10 = View.MeasureSpec.getMode((int)n9);
            if (n10 == Integer.MIN_VALUE || n10 == 0x40000000) {
                n9 = View.MeasureSpec.makeMeasureSpec((int)Math.max((int)Math.ceil(c8.j(this.g)), View.MeasureSpec.getSize((int)n9)), (int)n10);
            }
            super.onMeasure(n8, n9);
            return;
        }
        super.onMeasure(n8, n9);
    }

    public void setCardBackgroundColor(int n8) {
        i.m(this.g, ColorStateList.valueOf((int)n8));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        i.m(this.g, colorStateList);
    }

    public void setCardElevation(float f8) {
        i.f(this.g, f8);
    }

    public void setMaxCardElevation(float f8) {
        i.n(this.g, f8);
    }

    public void setMinimumHeight(int n8) {
        this.d = n8;
        super.setMinimumHeight(n8);
    }

    public void setMinimumWidth(int n8) {
        this.c = n8;
        super.setMinimumWidth(n8);
    }

    public void setPadding(int n8, int n9, int n10, int n11) {
    }

    public void setPaddingRelative(int n8, int n9, int n10, int n11) {
    }

    public void setPreventCornerOverlap(boolean bl) {
        if (bl != this.b) {
            this.b = bl;
            i.l(this.g);
        }
    }

    public void setRadius(float f8) {
        i.b(this.g, f8);
    }

    public void setUseCompatPadding(boolean bl) {
        if (this.a != bl) {
            this.a = bl;
            i.e(this.g);
        }
    }
}

