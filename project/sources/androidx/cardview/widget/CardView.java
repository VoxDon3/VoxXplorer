package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] h = {R.attr.colorBackground};
    private static final c i;
    private boolean a;
    private boolean b;
    int c;
    int d;
    final Rect e;
    final Rect f;
    private final b g;

    class a implements b {
        private Drawable a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void b(int i, int i2, int i3, int i4) {
            CardView.this.f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public void c(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable f() {
            return this.a;
        }

        @Override // androidx.cardview.widget.b
        public View g() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        i = aVar;
        aVar.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.A.a.a);
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

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (i instanceof androidx.cardview.widget.a) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.g)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.g)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        i.m(this.g, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f) {
        i.f(this.g, f);
    }

    public void setMaxCardElevation(float f) {
        i.n(this.g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.d = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.c = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            i.l(this.g);
        }
    }

    public void setRadius(float f) {
        i.b(this.g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            i.e(this.g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.e = rect;
        this.f = new Rect();
        a aVar = new a();
        this.g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.A.d.a, i2, ax.A.c.a);
        int i3 = ax.A.d.d;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(ax.A.b.b) : getResources().getColor(ax.A.b.a));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(ax.A.d.e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(ax.A.d.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(ax.A.d.g, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(ax.A.d.i, false);
        this.b = obtainStyledAttributes.getBoolean(ax.A.d.h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ax.A.d.j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(ax.A.d.l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(ax.A.d.n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(ax.A.d.m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(ax.A.d.k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.c = obtainStyledAttributes.getDimensionPixelSize(ax.A.d.b, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(ax.A.d.c, 0);
        obtainStyledAttributes.recycle();
        i.a(aVar, context, colorStateList, dimension, dimension2, f);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        i.m(this.g, colorStateList);
    }
}
