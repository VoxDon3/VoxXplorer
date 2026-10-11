/*
 * Decompiled with CFR 0.152.
 */
package ax.b4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import ax.M3.m;
import ax.Q3.d;
import ax.b4.g;
import ax.k4.h;
import java.nio.ByteBuffer;

public class c
extends Drawable
implements g.b,
Animatable {
    private final a a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e = true;
    private int f;
    private int g = -1;
    private boolean h;
    private Paint i;
    private Rect j;

    public c(Context context, ax.L3.a a8, d d8, m<Bitmap> m8, int n8, int n9, Bitmap bitmap) {
        this(new a(d8, new g(ax.J3.c.c(context), a8, n8, n9, m8, bitmap)));
    }

    c(a a8) {
        this.a = ax.k4.h.d(a8);
    }

    private Rect c() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private Paint g() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    private void j() {
        this.f = 0;
    }

    private void m() {
        ax.k4.h.a(this.d ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.b.f() == 1) {
            this.invalidateSelf();
            return;
        }
        if (!this.b) {
            this.b = true;
            this.a.b.s(this);
            this.invalidateSelf();
        }
    }

    private void n() {
        this.b = false;
        this.a.b.t(this);
    }

    @Override
    public void a() {
        int n8;
        if (this.getCallback() == null) {
            this.stop();
            this.invalidateSelf();
            return;
        }
        this.invalidateSelf();
        if (this.f() == this.e() - 1) {
            ++this.f;
        }
        if ((n8 = this.g) != -1 && this.f >= n8) {
            this.stop();
        }
    }

    public ByteBuffer b() {
        return this.a.b.b();
    }

    public Bitmap d() {
        return this.a.b.e();
    }

    public void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.h) {
            Gravity.apply((int)119, (int)this.getIntrinsicWidth(), (int)this.getIntrinsicHeight(), (Rect)this.getBounds(), (Rect)this.c());
            this.h = false;
        }
        canvas.drawBitmap(this.a.b.c(), null, this.c(), this.g());
    }

    public int e() {
        return this.a.b.f();
    }

    public int f() {
        return this.a.b.d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public int getIntrinsicHeight() {
        return this.a.b.h();
    }

    public int getIntrinsicWidth() {
        return this.a.b.l();
    }

    public int getOpacity() {
        return -2;
    }

    public int h() {
        return this.a.b.k();
    }

    public void i() {
        this.d = true;
        this.a.b.a();
    }

    public boolean isRunning() {
        return this.b;
    }

    public void k(m<Bitmap> m8, Bitmap bitmap) {
        this.a.b.p(m8, bitmap);
    }

    public void l(int n8) {
        int n9 = -1;
        if (n8 <= 0 && n8 != -1 && n8 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (n8 == 0) {
            n8 = this.a.b.i();
            if (n8 == 0) {
                n8 = n9;
            }
            this.g = n8;
            return;
        }
        this.g = n8;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    public void setAlpha(int n8) {
        this.g().setAlpha(n8);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.g().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        ax.k4.h.a(this.d ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = bl;
        if (!bl) {
            this.n();
        } else if (this.c) {
            this.m();
        }
        return super.setVisible(bl, bl2);
    }

    public void start() {
        this.c = true;
        this.j();
        if (this.e) {
            this.m();
        }
    }

    public void stop() {
        this.c = false;
        this.n();
    }

    static class a
    extends Drawable.ConstantState {
        final d a;
        final g b;

        public a(d d8, g g8) {
            this.a = d8;
            this.b = g8;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return this.newDrawable();
        }
    }
}

