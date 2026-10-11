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
import ax.b4.g;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {
    private final a a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;

    static class a extends Drawable.ConstantState {
        final ax.Q3.d a;
        final g b;

        public a(ax.Q3.d dVar, g gVar) {
            this.a = dVar;
            this.b = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, ax.L3.a aVar, ax.Q3.d dVar, m<Bitmap> mVar, int i, int i2, Bitmap bitmap) {
        this(new a(dVar, new g(ax.J3.c.c(context), aVar, i, i2, mVar, bitmap)));
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
        ax.k4.h.a(!this.d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.b.f() == 1) {
            invalidateSelf();
        } else {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.b.s(this);
            invalidateSelf();
        }
    }

    private void n() {
        this.b = false;
        this.a.b.t(this);
    }

    @Override // ax.b4.g.b
    public void a() {
        if (getCallback() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (f() == e() - 1) {
            this.f++;
        }
        int i = this.g;
        if (i == -1 || this.f < i) {
            return;
        }
        stop();
    }

    public ByteBuffer b() {
        return this.a.b.b();
    }

    public Bitmap d() {
        return this.a.b.e();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), c());
            this.h = false;
        }
        canvas.drawBitmap(this.a.b.c(), (Rect) null, c(), g());
    }

    public int e() {
        return this.a.b.f();
    }

    public int f() {
        return this.a.b.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.b.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.b.l();
    }

    @Override // android.graphics.drawable.Drawable
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

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b;
    }

    public void k(m<Bitmap> mVar, Bitmap bitmap) {
        this.a.b.p(mVar, bitmap);
    }

    public void l(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i != 0) {
            this.g = i;
        } else {
            int i2 = this.a.b.i();
            this.g = i2 != 0 ? i2 : -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        g().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        g().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        ax.k4.h.a(!this.d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            n();
        } else if (this.c) {
            m();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.c = true;
        j();
        if (this.e) {
            m();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.c = false;
        n();
    }

    c(a aVar) {
        this.e = true;
        this.g = -1;
        this.a = (a) ax.k4.h.d(aVar);
    }
}
