package com.voxdon.xplorer.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ax.T.b;
import ax.c0.F0;

/* loaded from: classes.dex */
public class WindowInsetsFrameLayout extends FrameLayout {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private b j;
    private Paint k;

    public WindowInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -16777216;
        b();
    }

    public static int a(b bVar) {
        if (bVar.a > 0) {
            return 3;
        }
        if (bVar.c > 0) {
            return 5;
        }
        return bVar.b > 0 ? 48 : 80;
    }

    private void b() {
        this.k = new Paint();
    }

    private void setCutoutGravity(int i) {
        this.c = i;
    }

    private void setNavigationGravity(int i) {
        this.b = i;
    }

    public void c(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        setPadding(i, i2, i3, i4);
    }

    public void d(F0 f0, boolean z) {
        b f = f0.f(F0.m.h());
        b f2 = f0.f(F0.m.b());
        b a = b.a(f, f2);
        b f3 = f0.f(F0.m.f());
        if (z) {
            a = b.a(a, f0.f(F0.m.c()));
            c(a.a, a.b, a.c, a.d);
        } else {
            c(a.a, a.b, a.c, 0);
        }
        setNavigationGravity(a(f3));
        setCutoutGravity(a(f2));
        this.j = a;
    }

    public b getAppliedInsets() {
        return this.j;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        this.k.setColor(this.a);
        if (this.g > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.g, this.k);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        this.k.setColor(this.e);
        if (this.i > 0) {
            canvas2.drawRect(0.0f, getHeight() - this.i, getWidth(), getHeight(), this.k);
        }
        int i = this.f;
        if (i > 0 && this.b == 3) {
            canvas2.drawRect(0.0f, 0.0f, i, getHeight(), this.k);
        }
        if (this.h > 0 && this.b == 5) {
            canvas2.drawRect(getWidth() - this.h, 0.0f, getWidth(), getHeight(), this.k);
        }
        this.k.setColor(this.d);
        int i2 = this.f;
        if (i2 > 0 && this.c == 3) {
            canvas2.drawRect(0.0f, 0.0f, i2, getHeight(), this.k);
        }
        if (this.h <= 0 || this.c != 5) {
            return;
        }
        canvas2.drawRect(getWidth() - this.h, 0.0f, getWidth(), getHeight(), this.k);
    }

    public void setBottomAreaSize(int i) {
        this.i = i;
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
    }

    public void setCutoutColor(int i) {
        this.d = i;
    }

    public void setNavigationBarColor(int i) {
        this.e = i;
        invalidate();
    }

    public void setStatusBarColor(int i) {
        this.a = i;
        invalidate();
    }
}
