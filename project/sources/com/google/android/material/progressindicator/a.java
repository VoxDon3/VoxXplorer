package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import ax.F6.w;
import ax.m.C2506a;
import ax.w2.AbstractC3330b;
import ax.z6.C3555a;
import com.google.android.material.progressindicator.b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class a<S extends com.google.android.material.progressindicator.b> extends ProgressBar {
    static final int p = ax.k6.l.E;
    S a;
    private int b;
    private boolean c;
    private boolean d;
    private final int e;
    private final int f;
    private long g;
    ax.I6.a h;
    private boolean i;
    private int j;
    boolean k;
    private final Runnable l;
    private final Runnable m;
    private final AbstractC3330b n;
    private final AbstractC3330b o;

    /* renamed from: com.google.android.material.progressindicator.a$a, reason: collision with other inner class name */
    class RunnableC0556a implements Runnable {
        RunnableC0556a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
            a.this.g = -1L;
        }
    }

    class c extends AbstractC3330b {
        c() {
        }

        @Override // ax.w2.AbstractC3330b
        public void b(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.p(aVar.b, a.this.c);
        }
    }

    class d extends AbstractC3330b {
        d() {
        }

        @Override // ax.w2.AbstractC3330b
        public void b(Drawable drawable) {
            super.b(drawable);
            if (a.this.i) {
                return;
            }
            a aVar = a.this;
            aVar.setVisibility(aVar.j);
        }
    }

    protected a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(ax.V6.a.d(context, attributeSet, i, p), attributeSet, i);
        this.g = -1L;
        this.i = false;
        this.j = 4;
        this.l = new RunnableC0556a();
        this.m = new b();
        this.n = new c();
        this.o = new d();
        Context context2 = getContext();
        this.a = i(context2, attributeSet);
        TypedArray i3 = w.i(context2, attributeSet, ax.k6.m.J, i, i2, new int[0]);
        this.e = i3.getInt(ax.k6.m.Q, -1);
        this.f = Math.min(i3.getInt(ax.k6.m.O, -1), 1000);
        i3.recycle();
        this.h = new ax.I6.a();
        this.d = true;
    }

    private i<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().y();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((h) getCurrentDrawable()).s(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f > 0) {
            this.g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    private void n() {
        o();
        if (getProgressDrawable() != null) {
            getProgressDrawable().o(this.o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o(this.o);
        }
    }

    private void q() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u(this.o);
            getIndeterminateDrawable().x().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().u(this.o);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.h;
    }

    public int[] getIndicatorColor() {
        return this.a.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.i;
    }

    public int getShowAnimationBehavior() {
        return this.a.g;
    }

    public int getTrackColor() {
        return this.a.f;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.a.c;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    public int getWaveAmplitude() {
        return this.a.l;
    }

    public int getWaveSpeed() {
        return this.a.m;
    }

    public int getWavelengthDeterminate() {
        return this.a.j;
    }

    public int getWavelengthIndeterminate() {
        return this.a.k;
    }

    protected void h(boolean z) {
        if (this.d) {
            ((h) getCurrentDrawable()).s(r(), false, z);
        }
    }

    abstract S i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    void o() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().x().d(this.n);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (r()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.m);
        removeCallbacks(this.l);
        ((h) getCurrentDrawable()).j();
        q();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        try {
            i<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        h(i == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        h(false);
    }

    public void p(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.c = z;
            this.i = true;
            if (!getIndeterminateDrawable().isVisible() || this.h.a(getContext().getContentResolver()) == 0.0f) {
                this.n.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().x().f();
            }
        }
    }

    boolean r() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && l();
    }

    public void setAnimatorDurationScaleProvider(ax.I6.a aVar) {
        this.h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            h hVar = (h) getCurrentDrawable();
            if (hVar != null) {
                hVar.j();
            }
            super.setIndeterminate(z);
            h hVar2 = (h) getCurrentDrawable();
            if (hVar2 != null) {
                hVar2.s(r(), false, false);
            }
            if ((hVar2 instanceof k) && r()) {
                ((k) hVar2).x().g();
            }
            this.i = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        S s = this.a;
        if (s.n != f) {
            s.n = f;
            getIndeterminateDrawable().x().c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof k) {
            ((h) drawable).j();
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.k) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C3555a.b(getContext(), C2506a.z, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.e = iArr;
        getIndeterminateDrawable().x().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        S s = this.a;
        if (s.i != i) {
            s.i = i;
            s.h();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        p(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof g)) {
            if (this.k) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            g gVar = (g) drawable;
            gVar.j();
            super.setProgressDrawable(gVar);
            gVar.L(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.a;
        if (s.f != i) {
            s.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.a;
        if (s.b != i) {
            s.b = Math.min(i, s.a / 2);
            this.a.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        S s = this.a;
        if (s.c != f) {
            s.c = Math.min(f, 0.5f);
            this.a.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        S s = this.a;
        if (s.a != i) {
            s.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.j = i;
    }

    public void setWaveAmplitude(int i) {
        S s = this.a;
        if (s.l != i) {
            s.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        this.a.m = i;
        getProgressDrawable().J(this.a.m != 0);
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        S s = this.a;
        if (s.j != i) {
            s.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        S s = this.a;
        if (s.k != i) {
            s.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public k<S> getIndeterminateDrawable() {
        return (k) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public g<S> getProgressDrawable() {
        return (g) super.getProgressDrawable();
    }
}
