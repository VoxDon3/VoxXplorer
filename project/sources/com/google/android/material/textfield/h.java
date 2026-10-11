package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ax.O6.h;

/* loaded from: classes3.dex */
class h extends ax.O6.h {
    b J;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // ax.O6.h
        protected void w(Canvas canvas) {
            if (this.J.x.isEmpty()) {
                super.w(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.J.x);
            } else {
                canvas.clipRect(this.J.x, Region.Op.DIFFERENCE);
            }
            super.w(canvas);
            canvas.restore();
        }
    }

    static h x0(ax.O6.l lVar) {
        if (lVar == null) {
            lVar = new ax.O6.l();
        }
        return y0(new b(lVar, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h y0(b bVar) {
        return new c(bVar);
    }

    void A0() {
        B0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void B0(float f, float f2, float f3, float f4) {
        if (f == this.J.x.left && f2 == this.J.x.top && f3 == this.J.x.right && f4 == this.J.x.bottom) {
            return;
        }
        this.J.x.set(f, f2, f3, f4);
        invalidateSelf();
    }

    void C0(RectF rectF) {
        B0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.J = new b(this.J);
        return this;
    }

    boolean z0() {
        return !this.J.x.isEmpty();
    }

    private static final class b extends h.c {
        private final RectF x;

        @Override // ax.O6.h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h y0 = h.y0(this);
            y0.invalidateSelf();
            return y0;
        }

        private b(ax.O6.l lVar, RectF rectF) {
            super(lVar, null);
            this.x = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.x = bVar.x;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.J = bVar;
    }
}
