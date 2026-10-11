/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.c;

abstract class a<V extends View>
extends c<V> {
    private Runnable d;
    OverScroller e;
    private boolean f;
    private int g = -1;
    private int h;
    private int i = -1;
    private VelocityTracker j;

    public a() {
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void M() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean H(CoordinatorLayout var1_1, V var2_2, MotionEvent var3_3) {
        block10: {
            block7: {
                block9: {
                    block8: {
                        var5_4 = var3_3.getActionMasked();
                        if (var5_4 == 1) break block7;
                        if (var5_4 == 2) break block8;
                        if (var5_4 == 3) ** GOTO lbl-1000
                        if (var5_4 == 6) {
                            var5_4 = var3_3.getActionIndex() == 0 ? 1 : 0;
                            this.g = var3_3.getPointerId(var5_4);
                            this.h = (int)(var3_3.getY(var5_4) + 0.5f);
                        }
                        break block9;
                    }
                    var5_4 = var3_3.findPointerIndex(this.g);
                    if (var5_4 == -1) {
                        return false;
                    }
                    var5_4 = (int)var3_3.getY(var5_4);
                    var6_5 = this.h;
                    this.h = var5_4;
                    this.S(var1_1, var2_2, var6_5 - var5_4, this.O(var2_2), 0);
                }
                var6_5 = 0;
                break block10;
            }
            var7_6 = this.j;
            if (var7_6 != null) {
                var7_6.addMovement(var3_3);
                this.j.computeCurrentVelocity(1000);
                var4_7 = this.j.getYVelocity(this.g);
                this.N(var1_1, var2_2, -this.P(var2_2), 0, var4_7);
                var5_4 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var5_4 = 0;
            }
            this.f = false;
            this.g = -1;
            var1_1 = this.j;
            var6_5 = var5_4;
            if (var1_1 != null) {
                var1_1.recycle();
                this.j = null;
                var6_5 = var5_4;
            }
        }
        var1_1 = this.j;
        if (var1_1 != null) {
            var1_1.addMovement(var3_3);
        }
        return this.f || var6_5 != 0;
        {
        }
    }

    boolean L(V v8) {
        return false;
    }

    final boolean N(CoordinatorLayout object, V v8, int n8, int n9, float f8) {
        Runnable runnable2 = this.d;
        if (runnable2 != null) {
            v8.removeCallbacks(runnable2);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v8.getContext());
        }
        this.e.fling(0, this.I(), 0, Math.round(f8), 0, 0, n8, n9);
        if (this.e.computeScrollOffset()) {
            this.d = object = new a(this, (CoordinatorLayout)object, v8);
            v8.postOnAnimation((Runnable)object);
            return true;
        }
        this.R((CoordinatorLayout)object, v8);
        return false;
    }

    int O(V v8) {
        return -v8.getHeight();
    }

    int P(V v8) {
        return v8.getHeight();
    }

    int Q() {
        return this.I();
    }

    void R(CoordinatorLayout coordinatorLayout, V v8) {
    }

    final int S(CoordinatorLayout coordinatorLayout, V v8, int n8, int n9, int n10) {
        return this.U(coordinatorLayout, v8, this.Q() - n8, n9, n10);
    }

    int T(CoordinatorLayout coordinatorLayout, V v8, int n8) {
        return this.U(coordinatorLayout, v8, n8, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int U(CoordinatorLayout coordinatorLayout, V v8, int n8, int n9, int n10) {
        int n11 = this.I();
        if (n9 != 0 && n11 >= n9 && n11 <= n10 && n11 != (n8 = ax.W.a.b(n8, n9, n10))) {
            this.K(n8);
            return n11 - n8;
        }
        return 0;
    }

    @Override
    public boolean o(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        int n8;
        if (this.i < 0) {
            this.i = ViewConfiguration.get((Context)coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f) {
            n8 = this.g;
            if (n8 == -1) {
                return false;
            }
            if ((n8 = motionEvent.findPointerIndex(n8)) == -1) {
                return false;
            }
            if (Math.abs((n8 = (int)motionEvent.getY(n8)) - this.h) > this.i) {
                this.h = n8;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = -1;
            n8 = (int)motionEvent.getX();
            int n9 = (int)motionEvent.getY();
            boolean bl = this.L(v8) && coordinatorLayout.B((View)v8, n8, n9);
            this.f = bl;
            if (bl) {
                this.h = n9;
                this.g = motionEvent.getPointerId(0);
                this.M();
                coordinatorLayout = this.e;
                if (coordinatorLayout != null && !coordinatorLayout.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        if ((coordinatorLayout = this.j) != null) {
            coordinatorLayout.addMovement(motionEvent);
        }
        return false;
    }

    private class a
    implements Runnable {
        private final V c0;
        final a d0;
        private final CoordinatorLayout q;

        a(CoordinatorLayout coordinatorLayout, V v8) {
            this.d0 = var1_1;
            this.q = coordinatorLayout;
            this.c0 = v8;
        }

        @Override
        public void run() {
            Object object;
            if (this.c0 != null && (object = this.d0.e) != null) {
                if (object.computeScrollOffset()) {
                    object = this.d0;
                    ((a)object).T(this.q, this.c0, ((a)object).e.getCurrY());
                    this.c0.postOnAnimation((Runnable)this);
                    return;
                }
                this.d0.R(this.q, this.c0);
            }
        }
    }
}

