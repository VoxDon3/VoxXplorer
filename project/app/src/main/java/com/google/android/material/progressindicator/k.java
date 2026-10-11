/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ax.I6.a;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.c;
import com.google.android.material.progressindicator.d;
import com.google.android.material.progressindicator.e;
import com.google.android.material.progressindicator.f;
import com.google.android.material.progressindicator.h;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.j;
import com.google.android.material.progressindicator.l;
import com.google.android.material.progressindicator.m;
import com.google.android.material.progressindicator.n;
import com.google.android.material.progressindicator.o;

public final class k<S extends b>
extends h {
    private i<S> r;
    private j<ObjectAnimator> s;
    private Drawable t;

    k(Context context, b b8, i<S> i8, j<ObjectAnimator> j8) {
        super(context, b8);
        this.B(i8);
        this.A(j8);
    }

    static k<f> v(Context context, f object, c c8) {
        j j8 = ((f)object).o == 1 ? new e(context, (f)object) : new d((f)object);
        object = new k<f>(context, (b)object, c8, j8);
        ((k)((Object)object)).C(ax.w2.j.b(context.getResources(), ax.k6.f.c, null));
        return object;
    }

    static k<o> w(Context context, o o8, l l8) {
        j j8 = o8.o == 0 ? new m(o8) : new n(context, o8);
        return new k<o>(context, o8, l8, j8);
    }

    private boolean z() {
        a a8 = this.c;
        return a8 != null && a8.a(this.a.getContentResolver()) == 0.0f;
    }

    void A(j<ObjectAnimator> j8) {
        this.s = j8;
        j8.e(this);
    }

    void B(i<S> i8) {
        this.r = i8;
    }

    public void C(Drawable drawable) {
        this.t = drawable;
    }

    public void draw(Canvas canvas) {
        if (!this.getBounds().isEmpty() && this.isVisible() && canvas.getClipBounds(this.p)) {
            i<S> i8;
            Object object;
            boolean bl = this.z();
            int n8 = 0;
            if (bl && (object = this.t) != null) {
                object.setBounds(this.getBounds());
                this.t.setTint(this.b.e[0]);
                this.t.draw(canvas);
                return;
            }
            canvas.save();
            this.r.h(canvas, this.getBounds(), this.h(), this.m(), this.l());
            int n9 = this.b.i;
            int n10 = this.getAlpha();
            object = this.b;
            boolean bl2 = object instanceof o || object instanceof f && ((f)object).s;
            boolean bl3 = bl2 && n9 == 0 && !((b)object).b(false);
            if (bl3) {
                this.r.d(canvas, this.n, 0.0f, 1.0f, this.b.f, n10, 0);
            } else if (bl2) {
                object = this.s.b.get(0);
                i8 = this.s.b;
                i.a a8 = i8.get(i8.size() - 1);
                i8 = this.r;
                if (i8 instanceof l) {
                    Paint paint = this.n;
                    float f8 = ((i.a)object).a;
                    int n11 = this.b.f;
                    i8.d(canvas, paint, 0.0f, f8, n11, n10, n9);
                    this.r.d(canvas, this.n, a8.b, 1.0f, this.b.f, n10, n9);
                } else {
                    canvas.save();
                    canvas.rotate(a8.g);
                    this.r.d(canvas, this.n, a8.b, ((i.a)object).a + 1.0f, this.b.f, n10, n9);
                    canvas.restore();
                }
            }
            while (n8 < this.s.b.size()) {
                object = this.s.b.get(n8);
                ((i.a)object).f = this.i();
                this.r.c(canvas, this.n, (i.a)object, this.getAlpha());
                if (n8 > 0 && !bl3 && bl2) {
                    i8 = this.s.b.get(n8 - 1);
                    this.r.d(canvas, this.n, ((i.a)((Object)i8)).b, ((i.a)object).a, this.b.f, n10, n9);
                }
                ++n8;
            }
            canvas.restore();
        }
    }

    public int getIntrinsicHeight() {
        return this.r.e();
    }

    public int getIntrinsicWidth() {
        return this.r.f();
    }

    @Override
    boolean t(boolean bl, boolean bl2, boolean bl3) {
        Drawable drawable;
        boolean bl4 = super.t(bl, bl2, bl3);
        if (this.z() && (drawable = this.t) != null) {
            return drawable.setVisible(bl, bl2);
        }
        if (!this.isRunning()) {
            this.s.a();
        }
        if (bl && (bl3 || Build.VERSION.SDK_INT <= 22 && !this.z())) {
            this.s.g();
        }
        return bl4;
    }

    j<ObjectAnimator> x() {
        return this.s;
    }

    i<S> y() {
        return this.r;
    }
}

