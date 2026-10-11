/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import ax.F6.w;
import ax.k6.l;
import ax.k6.m;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.g;
import com.google.android.material.progressindicator.h;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.k;
import java.util.Arrays;

public abstract class a<S extends b>
extends ProgressBar {
    static final int p = ax.k6.l.E;
    S a;
    private int b;
    private boolean c;
    private boolean d;
    private final int e;
    private final int f;
    private long g = -1L;
    ax.I6.a h;
    private boolean i = false;
    private int j = 4;
    boolean k;
    private final Runnable l = new Runnable(this){
        final a q;
        {
            this.q = a8;
        }

        @Override
        public void run() {
            this.q.k();
        }
    };
    private final Runnable m = new Runnable(this){
        final a q;
        {
            this.q = a8;
        }

        @Override
        public void run() {
            this.q.j();
            com.google.android.material.progressindicator.a.c(this.q, -1L);
        }
    };
    private final ax.w2.b n = new ax.w2.b(this){
        final a b;
        {
            this.b = a8;
        }

        @Override
        public void b(Drawable object) {
            this.b.setIndeterminate(false);
            object = this.b;
            ((a)((Object)object)).p(((a)((Object)object)).b, this.b.c);
        }
    };
    private final ax.w2.b o = new ax.w2.b(this){
        final a b;
        {
            this.b = a8;
        }

        @Override
        public void b(Drawable object) {
            super.b((Drawable)object);
            if (!this.b.i) {
                object = this.b;
                object.setVisibility(((a)((Object)object)).j);
            }
        }
    };

    protected a(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(ax.V6.a.d(context, attributeSet, n8, p), attributeSet, n8);
        context = this.getContext();
        this.a = this.i(context, attributeSet);
        context = w.i(context, attributeSet, ax.k6.m.J, n8, n9, new int[0]);
        this.e = context.getInt(ax.k6.m.Q, -1);
        this.f = Math.min(context.getInt(ax.k6.m.O, -1), 1000);
        context.recycle();
        this.h = new ax.I6.a();
        this.d = true;
    }

    static /* synthetic */ long c(a a8, long l8) {
        a8.g = l8;
        return l8;
    }

    private i<S> getCurrentDrawingDelegate() {
        if (this.isIndeterminate()) {
            if (this.getIndeterminateDrawable() == null) {
                return null;
            }
            return this.getIndeterminateDrawable().y();
        }
        if (this.getProgressDrawable() == null) {
            return null;
        }
        return this.getProgressDrawable().D();
    }

    private void j() {
        ((h)this.getCurrentDrawable()).s(false, false, true);
        if (this.m()) {
            this.setVisibility(4);
        }
    }

    private void k() {
        if (this.f > 0) {
            this.g = SystemClock.uptimeMillis();
        }
        this.setVisibility(0);
    }

    private boolean m() {
        return !(this.getProgressDrawable() != null && this.getProgressDrawable().isVisible() || this.getIndeterminateDrawable() != null && this.getIndeterminateDrawable().isVisible());
        {
        }
    }

    private void n() {
        this.o();
        if (this.getProgressDrawable() != null) {
            this.getProgressDrawable().o(this.o);
        }
        if (this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().o(this.o);
        }
    }

    private void q() {
        if (this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().u(this.o);
            this.getIndeterminateDrawable().x().h();
        }
        if (this.getProgressDrawable() != null) {
            this.getProgressDrawable().u(this.o);
        }
    }

    public Drawable getCurrentDrawable() {
        if (this.isIndeterminate()) {
            return this.getIndeterminateDrawable();
        }
        return this.getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return ((b)this.a).h;
    }

    public k<S> getIndeterminateDrawable() {
        return (k)super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return ((b)this.a).e;
    }

    public int getIndicatorTrackGapSize() {
        return ((b)this.a).i;
    }

    public g<S> getProgressDrawable() {
        return (g)super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return ((b)this.a).g;
    }

    public int getTrackColor() {
        return ((b)this.a).f;
    }

    public int getTrackCornerRadius() {
        return ((b)this.a).b;
    }

    public float getTrackCornerRadiusFraction() {
        return ((b)this.a).c;
    }

    public int getTrackThickness() {
        return ((b)this.a).a;
    }

    public int getWaveAmplitude() {
        return ((b)this.a).l;
    }

    public int getWaveSpeed() {
        return ((b)this.a).m;
    }

    public int getWavelengthDeterminate() {
        return ((b)this.a).j;
    }

    public int getWavelengthIndeterminate() {
        return ((b)this.a).k;
    }

    protected void h(boolean bl) {
        if (!this.d) {
            return;
        }
        ((h)this.getCurrentDrawable()).s(this.r(), false, bl);
    }

    abstract S i(Context var1, AttributeSet var2);

    public void invalidate() {
        super.invalidate();
        if (this.getCurrentDrawable() != null) {
            this.getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        a a8 = this;
        while (a8.getVisibility() == 0) {
            if ((a8 = a8.getParent()) == null) {
                return this.getWindowVisibility() == 0;
            }
            if (!(a8 instanceof View)) {
                return true;
            }
            a8 = (View)a8;
        }
        return false;
    }

    void o() {
        if (this.getProgressDrawable() != null && this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().x().d(this.n);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n();
        if (this.r()) {
            this.k();
        }
    }

    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.m);
        this.removeCallbacks(this.l);
        ((h)this.getCurrentDrawable()).j();
        this.q();
        super.onDetachedFromWindow();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                int n8;
                block4: {
                    try {
                        n8 = canvas.save();
                        if (this.getPaddingLeft() == 0 && this.getPaddingTop() == 0) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
                }
                if (this.getPaddingRight() != 0 || this.getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, this.getWidth() - (this.getPaddingLeft() + this.getPaddingRight()), this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom()));
                }
                this.getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(n8);
                return;
            }
            throw throwable2;
        }
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        this.getCurrentDrawingDelegate().g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onMeasure(int n8, int n9) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                i<S> i8;
                block4: {
                    try {
                        i8 = this.getCurrentDrawingDelegate();
                        if (i8 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    return;
                }
                n8 = i8.f() < 0 ? View.getDefaultSize((int)this.getSuggestedMinimumWidth(), (int)n8) : i8.f() + this.getPaddingLeft() + this.getPaddingRight();
                n9 = i8.e() < 0 ? View.getDefaultSize((int)this.getSuggestedMinimumHeight(), (int)n9) : i8.e() + this.getPaddingTop() + this.getPaddingBottom();
                this.setMeasuredDimension(n8, n9);
                return;
            }
            throw throwable2;
        }
    }

    protected void onVisibilityChanged(View view, int n8) {
        super.onVisibilityChanged(view, n8);
        boolean bl = n8 == 0;
        this.h(bl);
    }

    protected void onWindowVisibilityChanged(int n8) {
        super.onWindowVisibilityChanged(n8);
        this.h(false);
    }

    public void p(int n8, boolean bl) {
        if (this.isIndeterminate()) {
            if (this.getProgressDrawable() != null) {
                this.b = n8;
                this.c = bl;
                this.i = true;
                if (this.getIndeterminateDrawable().isVisible() && this.h.a(this.getContext().getContentResolver()) != 0.0f) {
                    this.getIndeterminateDrawable().x().f();
                    return;
                }
                this.n.b(this.getIndeterminateDrawable());
                return;
            }
        } else {
            super.setProgress(n8);
            if (this.getProgressDrawable() != null && !bl) {
                this.getProgressDrawable().jumpToCurrentState();
            }
        }
    }

    boolean r() {
        return this.isAttachedToWindow() && this.getWindowVisibility() == 0 && this.l();
    }

    public void setAnimatorDurationScaleProvider(ax.I6.a a8) {
        this.h = a8;
        if (this.getProgressDrawable() != null) {
            this.getProgressDrawable().c = a8;
        }
        if (this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().c = a8;
        }
    }

    public void setHideAnimationBehavior(int n8) {
        ((b)this.a).h = n8;
        this.invalidate();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setIndeterminate(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    try {
                        boolean bl2 = this.isIndeterminate();
                        if (bl != bl2) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return;
                }
                h h8 = (h)this.getCurrentDrawable();
                if (h8 != null) {
                    h8.j();
                }
                super.setIndeterminate(bl);
                h8 = (h)this.getCurrentDrawable();
                if (h8 != null) {
                    h8.s(this.r(), false, false);
                }
                if (h8 instanceof k && this.r()) {
                    ((k)h8).x().g();
                }
                this.i = false;
                return;
            }
            throw throwable2;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f8) {
        S s8 = this.a;
        if (((b)s8).n != f8) {
            ((b)s8).n = f8;
            this.getIndeterminateDrawable().x().c();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof k) {
            ((h)drawable).j();
            super.setIndeterminateDrawable(drawable);
            return;
        }
        if (!this.k) {
            super.setIndeterminateDrawable(drawable);
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
    }

    public void setIndicatorColor(int ... nArray) {
        int[] nArray2 = nArray;
        if (nArray.length == 0) {
            nArray2 = new int[]{ax.z6.a.b(this.getContext(), ax.m.a.z, -1)};
        }
        if (!Arrays.equals(this.getIndicatorColor(), nArray2)) {
            ((b)this.a).e = nArray2;
            this.getIndeterminateDrawable().x().c();
            this.invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int n8) {
        S s8 = this.a;
        if (((b)s8).i != n8) {
            ((b)s8).i = n8;
            ((b)s8).h();
            this.invalidate();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setProgress(int n8) {
        synchronized (this) {
            boolean bl = this.isIndeterminate();
            if (bl) {
                return;
            }
            this.p(n8, false);
            return;
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof g) {
            drawable = (g)drawable;
            drawable.j();
            super.setProgressDrawable(drawable);
            drawable.L((float)this.getProgress() / (float)this.getMax());
            return;
        }
        if (!this.k) {
            super.setProgressDrawable(drawable);
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
    }

    public void setShowAnimationBehavior(int n8) {
        ((b)this.a).g = n8;
        this.invalidate();
    }

    public void setTrackColor(int n8) {
        S s8 = this.a;
        if (((b)s8).f != n8) {
            ((b)s8).f = n8;
            this.invalidate();
        }
    }

    public void setTrackCornerRadius(int n8) {
        S s8 = this.a;
        if (((b)s8).b != n8) {
            ((b)s8).b = Math.min(n8, ((b)s8).a / 2);
            ((b)this.a).d = false;
            this.invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f8) {
        S s8 = this.a;
        if (((b)s8).c != f8) {
            ((b)s8).c = Math.min(f8, 0.5f);
            ((b)this.a).d = true;
            this.invalidate();
        }
    }

    public void setTrackThickness(int n8) {
        S s8 = this.a;
        if (((b)s8).a != n8) {
            ((b)s8).a = n8;
            this.requestLayout();
        }
    }

    public void setVisibilityAfterHide(int n8) {
        if (n8 != 0 && n8 != 4 && n8 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.j = n8;
    }

    public void setWaveAmplitude(int n8) {
        S s8 = this.a;
        if (((b)s8).l != n8) {
            ((b)s8).l = Math.abs(n8);
            this.requestLayout();
        }
    }

    public void setWaveSpeed(int n8) {
        ((b)this.a).m = n8;
        Drawable drawable = this.getProgressDrawable();
        boolean bl = ((b)this.a).m != 0;
        drawable.J(bl);
    }

    public void setWavelength(int n8) {
        this.setWavelengthDeterminate(n8);
        this.setWavelengthIndeterminate(n8);
    }

    public void setWavelengthDeterminate(int n8) {
        S s8 = this.a;
        if (((b)s8).j != n8) {
            ((b)s8).j = Math.abs(n8);
            if (!this.isIndeterminate()) {
                this.requestLayout();
            }
        }
    }

    public void setWavelengthIndeterminate(int n8) {
        S s8 = this.a;
        if (((b)s8).k != n8) {
            ((b)s8).k = Math.abs(n8);
            if (this.isIndeterminate()) {
                this.requestLayout();
            }
        }
    }
}

