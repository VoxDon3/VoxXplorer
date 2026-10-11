package ax.u;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.L;
import ax.c0.C1760d0;

/* renamed from: ax.u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3160e extends C3157b {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    C3160e(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    private void f() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable r = ax.U.a.r(drawable.mutate());
                this.e = r;
                if (this.h) {
                    ax.U.a.o(r, this.f);
                }
                if (this.i) {
                    ax.U.a.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    @Override // ax.u.C3157b
    void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        Context context = this.d.getContext();
        int[] iArr = ax.m.j.T;
        L v = L.v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.d;
        C1760d0.j0(seekBar, seekBar.getContext(), iArr, attributeSet, v.r(), i, 0);
        Drawable h = v.h(ax.m.j.U);
        if (h != null) {
            this.d.setThumb(h);
        }
        j(v.g(ax.m.j.V));
        int i2 = ax.m.j.X;
        if (v.s(i2)) {
            this.g = androidx.appcompat.widget.A.e(v.k(i2, -1), this.g);
            this.i = true;
        }
        int i3 = ax.m.j.W;
        if (v.s(i3)) {
            this.f = v.c(i3);
            this.h = true;
        }
        v.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            ax.U.a.m(drawable, this.d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }
}
