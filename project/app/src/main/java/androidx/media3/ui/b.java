/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.G;
import ax.S0.a;
import ax.S0.d0;
import ax.a2.F;
import ax.a2.c;
import ax.a2.d;
import ax.a2.e;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class b
extends View
implements G {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;
    private final Rect a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Drawable k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final StringBuilder u;
    private final Formatter v;
    private final Runnable w;
    private final CopyOnWriteArraySet<G.a> x;
    private final Point y;
    private final float z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b(Context object, AttributeSet attributeSet, int n8, AttributeSet attributeSet2, int n9) {
        block6: {
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            Paint paint;
            Paint paint2;
            Paint paint3;
            Paint paint4;
            Paint paint5;
            block5: {
                Throwable throwable2;
                block4: {
                    block3: {
                        float f8;
                        super(object, attributeSet, n8);
                        this.a = new Rect();
                        this.b = new Rect();
                        this.c = new Rect();
                        this.d = new Rect();
                        this.e = paint5 = new Paint();
                        this.f = paint4 = new Paint();
                        this.g = paint3 = new Paint();
                        this.h = paint2 = new Paint();
                        this.i = paint = new Paint();
                        attributeSet = new Paint();
                        this.j = attributeSet;
                        attributeSet.setAntiAlias(true);
                        this.x = new CopyOnWriteArraySet();
                        this.y = new Point();
                        this.z = f8 = object.getResources().getDisplayMetrics().density;
                        this.t = androidx.media3.ui.b.e(f8, -50);
                        n15 = androidx.media3.ui.b.e(f8, 4);
                        n14 = androidx.media3.ui.b.e(f8, 26);
                        n13 = androidx.media3.ui.b.e(f8, 4);
                        n12 = androidx.media3.ui.b.e(f8, 12);
                        n11 = androidx.media3.ui.b.e(f8, 0);
                        n10 = androidx.media3.ui.b.e(f8, 16);
                        if (attributeSet2 == null) break block5;
                        object = object.getTheme().obtainStyledAttributes(attributeSet2, ax.a2.F.e, n8, n9);
                        try {
                            attributeSet2 = object.getDrawable(ax.a2.F.p);
                            this.k = attributeSet2;
                            n8 = n14;
                            if (attributeSet2 == null) break block3;
                            this.o((Drawable)attributeSet2);
                            n8 = Math.max(attributeSet2.getMinimumHeight(), n14);
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    this.l = object.getDimensionPixelSize(ax.a2.F.i, n15);
                    this.m = object.getDimensionPixelSize(ax.a2.F.r, n8);
                    this.n = object.getInt(ax.a2.F.h, 0);
                    this.o = object.getDimensionPixelSize(ax.a2.F.g, n13);
                    this.p = object.getDimensionPixelSize(ax.a2.F.q, n12);
                    this.q = object.getDimensionPixelSize(ax.a2.F.n, n11);
                    this.r = object.getDimensionPixelSize(ax.a2.F.o, n10);
                    n14 = object.getInt(ax.a2.F.l, -1);
                    n11 = object.getInt(ax.a2.F.m, -1);
                    n9 = object.getInt(ax.a2.F.j, -855638017);
                    n10 = object.getInt(ax.a2.F.s, 0x33FFFFFF);
                    n15 = object.getInt(ax.a2.F.f, -1291845888);
                    n8 = object.getInt(ax.a2.F.k, 0x33FFFF00);
                    paint5.setColor(n14);
                    attributeSet.setColor(n11);
                    paint4.setColor(n9);
                    paint3.setColor(n10);
                    paint2.setColor(n15);
                    paint.setColor(n8);
                    object.recycle();
                    break block6;
                }
                object.recycle();
                throw throwable2;
            }
            this.l = n15;
            this.m = n14;
            this.n = 0;
            this.o = n13;
            this.p = n12;
            this.q = n11;
            this.r = n10;
            paint5.setColor(-1);
            attributeSet.setColor(-1);
            paint4.setColor(-855638017);
            paint3.setColor(0x33FFFFFF);
            paint2.setColor(-1291845888);
            paint.setColor(0x33FFFF00);
            this.k = null;
        }
        object = new StringBuilder();
        this.u = object;
        this.v = new Formatter((Appendable)object, Locale.getDefault());
        this.w = new d(this);
        object = this.k;
        this.s = object != null ? (object.getMinimumWidth() + 1) / 2 : (Math.max(this.q, Math.max(this.p, this.r)) + 1) / 2;
        this.F = 1.0f;
        object = new ValueAnimator();
        this.E = object;
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new e(this));
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        this.setFocusable(true);
        if (this.getImportantForAccessibility() == 0) {
            this.setImportantForAccessibility(1);
        }
    }

    public static /* synthetic */ void c(b b8, ValueAnimator valueAnimator) {
        b8.getClass();
        b8.F = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        b8.invalidate(b8.a);
    }

    public static /* synthetic */ void d(b b8) {
        b8.u(false);
    }

    private static int e(float f8, int n8) {
        return (int)((float)n8 * f8 + 0.5f);
    }

    private void f(Canvas canvas) {
        if (this.J <= 0L) {
            return;
        }
        Rect rect = this.d;
        int n8 = d0.p(rect.right, rect.left, this.b.right);
        int n9 = this.d.centerY();
        rect = this.k;
        if (rect == null) {
            int n10 = !this.H && !this.isFocused() ? (this.isEnabled() ? this.p : this.q) : this.r;
            n10 = (int)((float)n10 * this.F / 2.0f);
            canvas.drawCircle((float)n8, (float)n9, (float)n10, this.j);
            return;
        }
        int n11 = (int)((float)rect.getIntrinsicWidth() * this.F);
        int n12 = (int)((float)this.k.getIntrinsicHeight() * this.F);
        rect = this.k;
        rect.setBounds(n8 - (n11 /= 2), n9 - (n12 /= 2), n8 + n11, n9 + n12);
        this.k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int n8;
        int n9 = this.b.height();
        int n10 = this.b.centerY() - n9 / 2;
        int n11 = n9 + n10;
        if (this.J <= 0L) {
            Rect rect = this.b;
            canvas.drawRect((float)rect.left, (float)n10, (float)rect.right, (float)n11, this.g);
            return;
        }
        Rect rect = this.c;
        int n12 = rect.left;
        n9 = rect.right;
        int n13 = Math.max(Math.max(this.b.left, n9), this.d.right);
        if (n13 < (n8 = this.b.right)) {
            canvas.drawRect((float)n13, (float)n10, (float)n8, (float)n11, this.g);
        }
        if (n9 > (n8 = Math.max(n12, this.d.right))) {
            canvas.drawRect((float)n8, (float)n10, (float)n9, (float)n11, this.f);
        }
        if (this.d.width() > 0) {
            rect = this.d;
            canvas.drawRect((float)rect.left, (float)n10, (float)rect.right, (float)n11, this.e);
        }
        if (this.M != 0) {
            long[] lArray = ax.S0.a.e(this.N);
            boolean[] blArray = ax.S0.a.e(this.O);
            n8 = this.o / 2;
            for (n9 = 0; n9 < this.M; ++n9) {
                long l8 = d0.q(lArray[n9], 0L, this.J);
                n12 = (int)((long)this.b.width() * l8 / this.J);
                rect = this.b;
                n12 = rect.left + Math.min(rect.width() - this.o, Math.max(0, n12 - n8));
                rect = blArray[n9] ? this.i : this.h;
                canvas.drawRect((float)n12, (float)n10, (float)(n12 + this.o), (float)n11, (Paint)rect);
            }
        }
    }

    private long getPositionIncrement() {
        long l8;
        long l9 = l8 = this.B;
        if (l8 == -9223372036854775807L) {
            l9 = this.J;
            if (l9 == -9223372036854775807L) {
                return 0L;
            }
            l9 /= (long)this.A;
        }
        return l9;
    }

    private String getProgressText() {
        return d0.q0(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        if (this.b.width() > 0 && this.J != -9223372036854775807L) {
            return (long)this.d.width() * this.J / (long)this.b.width();
        }
        return 0L;
    }

    private boolean j(float f8, float f9) {
        return this.a.contains((int)f8, (int)f9);
    }

    private void k(float f8) {
        Rect rect = this.d;
        int n8 = (int)f8;
        Rect rect2 = this.b;
        rect.right = d0.p(n8, rect2.left, rect2.right);
    }

    private static int l(float f8, int n8) {
        return (int)((float)n8 / f8);
    }

    private Point m(MotionEvent motionEvent) {
        this.y.set((int)motionEvent.getX(), (int)motionEvent.getY());
        return this.y;
    }

    private boolean n(long l8) {
        long l9 = this.J;
        if (l9 <= 0L) {
            return false;
        }
        long l10 = this.H ? this.I : this.K;
        l8 = d0.q(l10 + l8, 0L, l9);
        if (l8 == l10) {
            return false;
        }
        if (!this.H) {
            this.t(l8);
        } else {
            this.x(l8);
        }
        this.v();
        return true;
    }

    private boolean o(Drawable drawable) {
        return Build.VERSION.SDK_INT >= 23 && androidx.media3.ui.b.p(drawable, this.getLayoutDirection());
    }

    private static boolean p(Drawable drawable, int n8) {
        return Build.VERSION.SDK_INT >= 23 && ax.a2.b.a(drawable, n8);
    }

    private void q(int n8, int n9) {
        Rect rect = this.D;
        if (rect != null && rect.width() == n8 && this.D.height() == n9) {
            return;
        }
        this.D = rect = new Rect(0, 0, n8, n9);
        ax.a2.c.a(this, Collections.singletonList(rect));
    }

    private void t(long l8) {
        this.I = l8;
        this.H = true;
        this.setPressed(true);
        Object object = this.getParent();
        if (object != null) {
            object.requestDisallowInterceptTouchEvent(true);
        }
        object = this.x.iterator();
        while (object.hasNext()) {
            ((G.a)object.next()).G(this, l8);
        }
    }

    private void u(boolean bl) {
        this.removeCallbacks(this.w);
        this.H = false;
        this.setPressed(false);
        Object object = this.getParent();
        if (object != null) {
            object.requestDisallowInterceptTouchEvent(false);
        }
        this.invalidate();
        object = this.x.iterator();
        while (object.hasNext()) {
            ((G.a)object.next()).M(this, this.I, bl);
        }
    }

    private void v() {
        this.c.set(this.b);
        this.d.set(this.b);
        long l8 = this.H ? this.I : this.K;
        if (this.J > 0L) {
            int n8 = (int)((long)this.b.width() * this.L / this.J);
            Rect rect = this.c;
            Rect rect2 = this.b;
            rect.right = Math.min(rect2.left + n8, rect2.right);
            n8 = (int)((long)this.b.width() * l8 / this.J);
            rect = this.d;
            rect2 = this.b;
            rect.right = Math.min(rect2.left + n8, rect2.right);
        } else {
            int n9;
            Rect rect = this.c;
            rect.right = n9 = this.b.left;
            this.d.right = n9;
        }
        this.invalidate(this.a);
    }

    private void w() {
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && this.k.setState(this.getDrawableState())) {
            this.invalidate();
        }
    }

    private void x(long l8) {
        if (this.I != l8) {
            this.I = l8;
            Iterator<G.a> iterator = this.x.iterator();
            while (iterator.hasNext()) {
                iterator.next().K(this, l8);
            }
        }
    }

    @Override
    public void a(G.a a8) {
        ax.S0.a.e(a8);
        this.x.add(a8);
    }

    @Override
    public void b(long[] lArray, boolean[] blArray, int n8) {
        boolean bl = n8 == 0 || lArray != null && blArray != null;
        ax.S0.a.a(bl);
        this.M = n8;
        this.N = lArray;
        this.O = blArray;
        this.v();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.w();
    }

    @Override
    public long getPreferredUpdateDelay() {
        long l8;
        int n8 = androidx.media3.ui.b.l(this.z, this.b.width());
        if (n8 != 0 && (l8 = this.J) != 0L && l8 != -9223372036854775807L) {
            return l8 / (long)n8;
        }
        return Long.MAX_VALUE;
    }

    public void h(long l8) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.E.setFloatValues(new float[]{this.F, 0.0f});
        this.E.setDuration(l8);
        this.E.start();
    }

    public void i(boolean bl) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = bl;
        this.F = 0.0f;
        this.invalidate(this.a);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        this.g(canvas);
        this.f(canvas);
        canvas.restore();
    }

    protected void onFocusChanged(boolean bl, int n8, Rect rect) {
        super.onFocusChanged(bl, n8, rect);
        if (this.H && !bl) {
            this.u(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(this.getProgressText());
        }
        accessibilityEvent.setClassName((CharSequence)"android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription((CharSequence)this.getProgressText());
        if (this.J <= 0L) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        if (!this.isEnabled()) return super.onKeyDown(n8, keyEvent);
        long l8 = this.getPositionIncrement();
        if (n8 != 66) {
            long l9 = l8;
            switch (n8) {
                default: {
                    return super.onKeyDown(n8, keyEvent);
                }
                case 21: {
                    l9 = -l8;
                }
                case 22: {
                    if (!this.n(l9)) return super.onKeyDown(n8, keyEvent);
                    this.removeCallbacks(this.w);
                    this.postDelayed(this.w, 1000L);
                    return true;
                }
                case 23: 
            }
        }
        if (!this.H) return super.onKeyDown(n8, keyEvent);
        this.u(false);
        return true;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        int n12 = n10 - n8;
        int n13 = n11 - n9;
        int n14 = this.getPaddingLeft();
        n11 = this.getPaddingRight();
        n8 = this.G ? 0 : this.s;
        if (this.n == 1) {
            n10 = n13 - this.getPaddingBottom() - this.m;
            n9 = this.getPaddingBottom();
            int n15 = this.l;
            n9 = n13 - n9 - n15 - Math.max(n8 - n15 / 2, 0);
        } else {
            n10 = (n13 - this.m) / 2;
            n9 = (n13 - this.l) / 2;
        }
        this.a.set(n14, n10, n12 - n11, this.m + n10);
        Rect rect = this.b;
        Rect rect2 = this.a;
        rect.set(rect2.left + n8, n9, rect2.right - n8, this.l + n9);
        if (Build.VERSION.SDK_INT >= 29) {
            this.q(n12, n13);
        }
        this.v();
    }

    protected void onMeasure(int n8, int n9) {
        int n10 = View.MeasureSpec.getMode((int)n9);
        n9 = View.MeasureSpec.getSize((int)n9);
        if (n10 == 0) {
            n9 = this.m;
        } else if (n10 != 0x40000000) {
            n9 = Math.min(this.m, n9);
        }
        this.setMeasuredDimension(View.MeasureSpec.getSize((int)n8), n9);
        this.w();
    }

    public void onRtlPropertiesChanged(int n8) {
        Drawable drawable = this.k;
        if (drawable != null && androidx.media3.ui.b.p(drawable, n8)) {
            this.invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        block6: {
            int n8;
            int n9;
            block7: {
                boolean bl;
                block8: {
                    block9: {
                        boolean bl2 = this.isEnabled();
                        bl = false;
                        if (!bl2 || this.J <= 0L) break block6;
                        Point point = this.m(motionEvent);
                        n9 = point.x;
                        n8 = point.y;
                        int n10 = motionEvent.getAction();
                        if (n10 == 0) break block7;
                        if (n10 == 1) break block8;
                        if (n10 == 2) break block9;
                        if (n10 == 3) break block8;
                        break block6;
                    }
                    if (this.H) {
                        if (n8 < this.t) {
                            n8 = this.C;
                            this.k(n8 + (n9 - n8) / 3);
                        } else {
                            this.C = n9;
                            this.k(n9);
                        }
                        this.x(this.getScrubberPosition());
                        this.v();
                        this.invalidate();
                        return true;
                    }
                    break block6;
                }
                if (this.H) {
                    if (motionEvent.getAction() == 3) {
                        bl = true;
                    }
                    this.u(bl);
                    return true;
                }
                break block6;
            }
            float f8 = n9;
            if (this.j(f8, n8)) {
                this.k(f8);
                this.t(this.getScrubberPosition());
                this.v();
                this.invalidate();
                return true;
            }
        }
        return false;
    }

    public boolean performAccessibilityAction(int n8, Bundle bundle) {
        block10: {
            block9: {
                block8: {
                    if (super.performAccessibilityAction(n8, bundle)) {
                        return true;
                    }
                    if (this.J <= 0L) {
                        return false;
                    }
                    if (n8 != 8192) break block8;
                    if (this.n(-this.getPositionIncrement())) {
                        this.u(false);
                    }
                    break block9;
                }
                if (n8 != 4096) break block10;
                if (this.n(this.getPositionIncrement())) {
                    this.u(false);
                }
            }
            this.sendAccessibilityEvent(4);
            return true;
        }
        return false;
    }

    public void r() {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.F = 1.0f;
        this.invalidate(this.a);
    }

    public void s(long l8) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.E.setFloatValues(new float[]{this.F, 1.0f});
        this.E.setDuration(l8);
        this.E.start();
    }

    public void setAdMarkerColor(int n8) {
        this.h.setColor(n8);
        this.invalidate(this.a);
    }

    public void setBufferedColor(int n8) {
        this.f.setColor(n8);
        this.invalidate(this.a);
    }

    @Override
    public void setBufferedPosition(long l8) {
        if (this.L == l8) {
            return;
        }
        this.L = l8;
        this.v();
    }

    @Override
    public void setDuration(long l8) {
        if (this.J == l8) {
            return;
        }
        this.J = l8;
        if (this.H && l8 == -9223372036854775807L) {
            this.u(true);
        }
        this.v();
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        if (this.H && !bl) {
            this.u(true);
        }
    }

    public void setKeyCountIncrement(int n8) {
        boolean bl = n8 > 0;
        ax.S0.a.a(bl);
        this.A = n8;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long l8) {
        boolean bl = l8 > 0L;
        ax.S0.a.a(bl);
        this.A = -1;
        this.B = l8;
    }

    public void setPlayedAdMarkerColor(int n8) {
        this.i.setColor(n8);
        this.invalidate(this.a);
    }

    public void setPlayedColor(int n8) {
        this.e.setColor(n8);
        this.invalidate(this.a);
    }

    @Override
    public void setPosition(long l8) {
        if (this.K == l8) {
            return;
        }
        this.K = l8;
        this.setContentDescription(this.getProgressText());
        this.v();
    }

    public void setScrubberColor(int n8) {
        this.j.setColor(n8);
        this.invalidate(this.a);
    }

    public void setUnplayedColor(int n8) {
        this.g.setColor(n8);
        this.invalidate(this.a);
    }
}

