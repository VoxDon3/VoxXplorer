/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ax.O6.h;
import ax.O6.l;
import ax.T6.a;

class h
extends ax.O6.h {
    b J;

    private h(b b8) {
        super(b8);
        this.J = b8;
    }

    static h x0(l l8) {
        if (l8 == null) {
            l8 = new l();
        }
        return h.y0(new b(l8, new RectF()));
    }

    private static h y0(b b8) {
        return new c(b8);
    }

    void A0() {
        this.B0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void B0(float f8, float f9, float f10, float f11) {
        if (f8 == ((b)this.J).x.left && f9 == ((b)this.J).x.top && f10 == ((b)this.J).x.right && f11 == ((b)this.J).x.bottom) {
            return;
        }
        this.J.x.set(f8, f9, f10, f11);
        this.invalidateSelf();
    }

    void C0(RectF rectF) {
        this.B0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override
    public Drawable mutate() {
        this.J = new b(this.J);
        return this;
    }

    boolean z0() {
        return this.J.x.isEmpty() ^ true;
    }

    private static final class b
    extends h.c {
        private final RectF x;

        private b(l l8, RectF rectF) {
            super(l8, null);
            this.x = rectF;
        }

        private b(b b8) {
            super(b8);
            this.x = b8.x;
        }

        @Override
        public Drawable newDrawable() {
            h h8 = h.y0(this);
            h8.invalidateSelf();
            return h8;
        }
    }

    private static class c
    extends h {
        c(b b8) {
            super(b8);
        }

        @Override
        protected void w(Canvas canvas) {
            if (this.J.x.isEmpty()) {
                super.w(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                a.a(canvas, this.J.x);
            } else {
                canvas.clipRect(this.J.x, Region.Op.DIFFERENCE);
            }
            super.w(canvas);
            canvas.restore();
        }
    }
}

