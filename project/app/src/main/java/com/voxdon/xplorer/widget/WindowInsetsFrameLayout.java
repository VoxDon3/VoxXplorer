/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ax.T.b;
import ax.c0.F0;

public class WindowInsetsFrameLayout
extends FrameLayout {
    private int a;
    private int b;
    private int c;
    private int d = -16777216;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private b j;
    private Paint k;

    public WindowInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b();
    }

    public static int a(b b8) {
        if (b8.a > 0) {
            return 3;
        }
        if (b8.c > 0) {
            return 5;
        }
        if (b8.b > 0) {
            return 48;
        }
        return 80;
    }

    private void b() {
        this.k = new Paint();
    }

    private void setCutoutGravity(int n8) {
        this.c = n8;
    }

    private void setNavigationGravity(int n8) {
        this.b = n8;
    }

    public void c(int n8, int n9, int n10, int n11) {
        this.f = n8;
        this.g = n9;
        this.h = n10;
        this.i = n11;
        this.setPadding(n8, n9, n10, n11);
    }

    public void d(F0 object, boolean bl) {
        b b8 = ((F0)object).f(F0.m.h());
        b b9 = ((F0)object).f(F0.m.b());
        b8 = ax.T.b.a(b8, b9);
        b b10 = ((F0)object).f(F0.m.f());
        if (!bl) {
            this.c(b8.a, b8.b, b8.c, 0);
            object = b8;
        } else {
            object = ax.T.b.a(b8, ((F0)object).f(F0.m.c()));
            this.c(((b)object).a, ((b)object).b, ((b)object).c, ((b)object).d);
        }
        this.setNavigationGravity(WindowInsetsFrameLayout.a(b10));
        this.setCutoutGravity(WindowInsetsFrameLayout.a(b9));
        this.j = object;
    }

    public b getAppliedInsets() {
        return this.j;
    }

    protected void onDraw(Canvas canvas) {
        int n8;
        this.k.setColor(this.a);
        if (this.g > 0) {
            canvas.drawRect(0.0f, 0.0f, (float)this.getWidth(), (float)this.g, this.k);
        }
        this.k.setColor(this.e);
        if (this.i > 0) {
            canvas.drawRect(0.0f, (float)(this.getHeight() - this.i), (float)this.getWidth(), (float)this.getHeight(), this.k);
        }
        if ((n8 = this.f) > 0 && this.b == 3) {
            canvas.drawRect(0.0f, 0.0f, (float)n8, (float)this.getHeight(), this.k);
        }
        if (this.h > 0 && this.b == 5) {
            canvas.drawRect((float)(this.getWidth() - this.h), 0.0f, (float)this.getWidth(), (float)this.getHeight(), this.k);
        }
        this.k.setColor(this.d);
        n8 = this.f;
        if (n8 > 0 && this.c == 3) {
            canvas.drawRect(0.0f, 0.0f, (float)n8, (float)this.getHeight(), this.k);
        }
        if (this.h > 0 && this.c == 5) {
            canvas.drawRect((float)(this.getWidth() - this.h), 0.0f, (float)this.getWidth(), (float)this.getHeight(), this.k);
        }
    }

    public void setBottomAreaSize(int n8) {
        this.i = n8;
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), n8);
    }

    public void setCutoutColor(int n8) {
        this.d = n8;
    }

    public void setNavigationBarColor(int n8) {
        this.e = n8;
        this.invalidate();
    }

    public void setStatusBarColor(int n8) {
        this.a = n8;
        this.invalidate();
    }
}

