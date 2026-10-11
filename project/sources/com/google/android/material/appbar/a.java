package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
abstract class a<V extends View> extends c<V> {
    private Runnable d;
    OverScroller e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private VelocityTracker j;

    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    private class RunnableC0547a implements Runnable {
        private final V c0;
        private final CoordinatorLayout q;

        RunnableC0547a(CoordinatorLayout coordinatorLayout, V v) {
            this.q = coordinatorLayout;
            this.c0 = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.c0 == null || (overScroller = a.this.e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.R(this.q, this.c0);
                return;
            }
            a aVar = a.this;
            aVar.T(this.q, this.c0, aVar.e.getCurrY());
            this.c0.postOnAnimation(this);
        }
    }

    public a() {
        this.g = -1;
        this.i = -1;
    }

    private void M() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 1
            r8 = 0
            if (r1 == r7) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.h = r1
            goto L4b
        L2d:
            int r1 = r9.g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r8
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.h
            int r3 = r3 - r1
            r9.h = r1
            int r4 = r9.O(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.S(r1, r2, r3, r4, r5)
        L4b:
            r1 = 0
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.j
            int r3 = r9.g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.P(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.N(r1, r2, r3, r4, r5)
            r1 = 1
            goto L72
        L71:
            r1 = 0
        L72:
            r9.f = r8
            r9.g = r6
            android.view.VelocityTracker r2 = r9.j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.j = r2
        L80:
            android.view.VelocityTracker r2 = r9.j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r8
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean L(V v) {
        return false;
    }

    final boolean N(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v.getContext());
        }
        this.e.fling(0, I(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.e.computeScrollOffset()) {
            R(coordinatorLayout, v);
            return false;
        }
        RunnableC0547a runnableC0547a = new RunnableC0547a(coordinatorLayout, v);
        this.d = runnableC0547a;
        v.postOnAnimation(runnableC0547a);
        return true;
    }

    int O(V v) {
        return -v.getHeight();
    }

    int P(V v) {
        return v.getHeight();
    }

    int Q() {
        return I();
    }

    void R(CoordinatorLayout coordinatorLayout, V v) {
    }

    final int S(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return U(coordinatorLayout, v, Q() - i, i2, i3);
    }

    int T(CoordinatorLayout coordinatorLayout, V v, int i) {
        return U(coordinatorLayout, v, i, Integer.MIN_VALUE, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    int U(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b;
        int I = I();
        if (i2 == 0 || I < i2 || I > i3 || I == (b = ax.W.a.b(i, i2, i3))) {
            return 0;
        }
        K(b);
        return I - b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f) {
            int i = this.g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.h) > this.i) {
                this.h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = L(v) && coordinatorLayout.B(v, x, y2);
            this.f = z;
            if (z) {
                this.h = y2;
                this.g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        this.i = -1;
    }
}
