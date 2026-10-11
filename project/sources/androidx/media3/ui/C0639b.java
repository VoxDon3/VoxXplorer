package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.C0639b;
import androidx.media3.ui.G;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.a2.C1315F;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: androidx.media3.ui.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0639b extends View implements G {
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

    public C0639b(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet<>();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = e(f, -50);
        int e = e(f, 4);
        int e2 = e(f, 26);
        int e3 = e(f, 4);
        int e4 = e(f, 12);
        int e5 = e(f, 0);
        int e6 = e(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1315F.e, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C1315F.p);
                this.k = drawable;
                if (drawable != null) {
                    o(drawable);
                    e2 = Math.max(drawable.getMinimumHeight(), e2);
                }
                this.l = obtainStyledAttributes.getDimensionPixelSize(C1315F.i, e);
                this.m = obtainStyledAttributes.getDimensionPixelSize(C1315F.r, e2);
                this.n = obtainStyledAttributes.getInt(C1315F.h, 0);
                this.o = obtainStyledAttributes.getDimensionPixelSize(C1315F.g, e3);
                this.p = obtainStyledAttributes.getDimensionPixelSize(C1315F.q, e4);
                this.q = obtainStyledAttributes.getDimensionPixelSize(C1315F.n, e5);
                this.r = obtainStyledAttributes.getDimensionPixelSize(C1315F.o, e6);
                int i3 = obtainStyledAttributes.getInt(C1315F.l, -1);
                int i4 = obtainStyledAttributes.getInt(C1315F.m, -1);
                int i5 = obtainStyledAttributes.getInt(C1315F.j, -855638017);
                int i6 = obtainStyledAttributes.getInt(C1315F.s, 872415231);
                int i7 = obtainStyledAttributes.getInt(C1315F.f, -1291845888);
                int i8 = obtainStyledAttributes.getInt(C1315F.k, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.l = e;
            this.m = e2;
            this.n = 0;
            this.o = e3;
            this.p = e4;
            this.q = e5;
            this.r = e6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new Runnable() { // from class: ax.a2.d
            @Override // java.lang.Runnable
            public final void run() {
                C0639b.this.u(false);
            }
        };
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            this.s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.s = (Math.max(this.q, Math.max(this.p, this.r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ax.a2.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C0639b.c(C0639b.this, valueAnimator2);
            }
        });
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static /* synthetic */ void c(C0639b c0639b, ValueAnimator valueAnimator) {
        c0639b.getClass();
        c0639b.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c0639b.invalidate(c0639b.a);
    }

    private static int e(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private void f(Canvas canvas) {
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.d;
        int p = d0.p(rect.right, rect.left, this.b.right);
        int centerY = this.d.centerY();
        if (this.k == null) {
            canvas.drawCircle(p, centerY, (int) ((((this.H || isFocused()) ? this.r : isEnabled() ? this.p : this.q) * this.F) / 2.0f), this.j);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.k.getIntrinsicHeight() * this.F)) / 2;
        this.k.setBounds(p - intrinsicWidth, centerY - intrinsicHeight, p + intrinsicWidth, centerY + intrinsicHeight);
        this.k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int height = this.b.height();
        int centerY = this.b.centerY() - (height / 2);
        int i = height + centerY;
        if (this.J <= 0) {
            Rect rect = this.b;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.g);
            return;
        }
        Rect rect2 = this.c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.b.left, i3), this.d.right);
        int i4 = this.b.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.g);
        }
        int max2 = Math.max(i2, this.d.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.f);
        }
        if (this.d.width() > 0) {
            Rect rect3 = this.d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) C0968a.e(this.N);
        boolean[] zArr = (boolean[]) C0968a.e(this.O);
        int i5 = this.o / 2;
        for (int i6 = 0; i6 < this.M; i6++) {
            int width = ((int) ((this.b.width() * d0.q(jArr[i6], 0L, this.J)) / this.J)) - i5;
            Rect rect4 = this.b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.o, Math.max(0, width)), centerY, r10 + this.o, i, zArr[i6] ? this.i : this.h);
        }
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.J;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.A;
    }

    private String getProgressText() {
        return d0.q0(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        if (this.b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (this.d.width() * this.J) / this.b.width();
    }

    private boolean j(float f, float f2) {
        return this.a.contains((int) f, (int) f2);
    }

    private void k(float f) {
        Rect rect = this.d;
        Rect rect2 = this.b;
        rect.right = d0.p((int) f, rect2.left, rect2.right);
    }

    private static int l(float f, int i) {
        return (int) (i / f);
    }

    private Point m(MotionEvent motionEvent) {
        this.y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.y;
    }

    private boolean n(long j) {
        long j2 = this.J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long q = d0.q(j3 + j, 0L, j2);
        if (q == j3) {
            return false;
        }
        if (this.H) {
            x(q);
        } else {
            t(q);
        }
        v();
        return true;
    }

    private boolean o(Drawable drawable) {
        return Build.VERSION.SDK_INT >= 23 && p(drawable, getLayoutDirection());
    }

    private static boolean p(Drawable drawable, int i) {
        boolean layoutDirection;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        layoutDirection = drawable.setLayoutDirection(i);
        return layoutDirection;
    }

    private void q(int i, int i2) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i && this.D.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void t(long j) {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<G.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().G(this, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean z) {
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<G.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().M(this, this.I, z);
        }
    }

    private void v() {
        this.c.set(this.b);
        this.d.set(this.b);
        long j = this.H ? this.I : this.K;
        if (this.J > 0) {
            int width = (int) ((this.b.width() * this.L) / this.J);
            Rect rect = this.c;
            Rect rect2 = this.b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.b.width() * j) / this.J);
            Rect rect3 = this.d;
            Rect rect4 = this.b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.c;
            int i = this.b.left;
            rect5.right = i;
            this.d.right = i;
        }
        invalidate(this.a);
    }

    private void w() {
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && this.k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void x(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        Iterator<G.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().K(this, j);
        }
    }

    @Override // androidx.media3.ui.G
    public void a(G.a aVar) {
        C0968a.e(aVar);
        this.x.add(aVar);
    }

    @Override // androidx.media3.ui.G
    public void b(long[] jArr, boolean[] zArr, int i) {
        C0968a.a(i == 0 || !(jArr == null || zArr == null));
        this.M = i;
        this.N = jArr;
        this.O = zArr;
        v();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        w();
    }

    @Override // androidx.media3.ui.G
    public long getPreferredUpdateDelay() {
        int l = l(this.z, this.b.width());
        if (l == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.J;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / l;
    }

    public void h(long j) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.E.setFloatValues(this.F, 0.0f);
        this.E.setDuration(j);
        this.E.start();
    }

    public void i(boolean z) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = z;
        this.F = 0.0f;
        invalidate(this.a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.H || z) {
            return;
        }
        u(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.n(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.H
            if (r0 == 0) goto L30
            r5 = 0
            r4.u(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C0639b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.G ? 0 : this.s;
        if (this.n == 1) {
            i5 = (i8 - getPaddingBottom()) - this.m;
            int paddingBottom = i8 - getPaddingBottom();
            int i10 = this.l;
            i6 = (paddingBottom - i10) - Math.max(i9 - (i10 / 2), 0);
        } else {
            i5 = (i8 - this.m) / 2;
            i6 = (i8 - this.l) / 2;
        }
        this.a.set(paddingLeft, i5, paddingRight, this.m + i5);
        Rect rect = this.b;
        Rect rect2 = this.a;
        rect.set(rect2.left + i9, i6, rect2.right - i9, this.l + i6);
        if (Build.VERSION.SDK_INT >= 29) {
            q(i7, i8);
        }
        v();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.m;
        } else if (mode != 1073741824) {
            size = Math.min(this.m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        w();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.k;
        if (drawable == null || !p(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.m(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.H
            if (r8 == 0) goto L76
            int r8 = r7.t
            if (r0 >= r8) goto L3a
            int r8 = r7.C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.k(r8)
            goto L40
        L3a:
            r7.C = r2
            float r8 = (float) r2
            r7.k(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.x(r0)
            r7.v()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.H
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = 1
        L59:
            r7.u(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.j(r8, r0)
            if (r0 == 0) goto L76
            r7.k(r8)
            long r0 = r7.getScrubberPosition()
            r7.t(r0)
            r7.v()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C0639b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (n(-getPositionIncrement())) {
                u(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (n(getPositionIncrement())) {
                u(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void r() {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.F = 1.0f;
        invalidate(this.a);
    }

    public void s(long j) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.E.setFloatValues(this.F, 1.0f);
        this.E.setDuration(j);
        this.E.start();
    }

    public void setAdMarkerColor(int i) {
        this.h.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    @Override // androidx.media3.ui.G
    public void setBufferedPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        v();
    }

    @Override // androidx.media3.ui.G
    public void setDuration(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        if (this.H && j == -9223372036854775807L) {
            u(true);
        }
        v();
    }

    @Override // android.view.View, androidx.media3.ui.G
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.H || z) {
            return;
        }
        u(true);
    }

    public void setKeyCountIncrement(int i) {
        C0968a.a(i > 0);
        this.A = i;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        C0968a.a(j > 0);
        this.A = -1;
        this.B = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.a);
    }

    @Override // androidx.media3.ui.G
    public void setPosition(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        setContentDescription(getProgressText());
        v();
    }

    public void setScrubberColor(int i) {
        this.j.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i) {
        this.g.setColor(i);
        invalidate(this.a);
    }
}
