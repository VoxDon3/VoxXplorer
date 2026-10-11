/*
 * Decompiled with CFR 0.152.
 */
package ax.l0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import ax.c0.d0;
import java.util.Arrays;

public class c {
    private static final Interpolator x = new Interpolator(){

        public float getInterpolation(float f8) {
            return (f8 -= 1.0f) * f8 * f8 * f8 * f8 + 1.0f;
        }
    };
    private int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private final int p;
    private int q;
    private OverScroller r;
    private final c s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private final Runnable w = new Runnable(this){
        final c q;
        {
            this.q = c8;
        }

        @Override
        public void run() {
            this.q.K(0);
        }
    };

    private c(Context context, ViewGroup viewGroup, c c8) {
        if (viewGroup != null) {
            if (c8 != null) {
                int n8;
                this.v = viewGroup;
                this.s = c8;
                viewGroup = ViewConfiguration.get((Context)context);
                this.p = n8 = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
                this.o = n8;
                this.b = viewGroup.getScaledTouchSlop();
                this.m = viewGroup.getScaledMaximumFlingVelocity();
                this.n = viewGroup.getScaledMinimumFlingVelocity();
                this.r = new OverScroller(context, x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    private boolean D(int n8) {
        if (!this.C(n8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring pointerId=");
            stringBuilder.append(n8);
            stringBuilder.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            Log.e((String)"ViewDragHelper", (String)stringBuilder.toString());
            return false;
        }
        return true;
    }

    private void G() {
        this.l.computeCurrentVelocity(1000, this.m);
        this.p(this.g(this.l.getXVelocity(this.c), this.n, this.m), this.g(this.l.getYVelocity(this.c), this.n, this.m));
    }

    private void H(float f8, float f9, int n8) {
        int n9;
        int n10 = n9 = this.c(f8, f9, n8, 1);
        if (this.c(f9, f8, n8, 4)) {
            n10 = n9 | 4;
        }
        n9 = n10;
        if (this.c(f8, f9, n8, 2)) {
            n9 = n10 | 2;
        }
        n10 = n9;
        if (this.c(f9, f8, n8, 8)) {
            n10 = n9 | 8;
        }
        if (n10 != 0) {
            int[] nArray = this.i;
            nArray[n8] = nArray[n8] | n10;
            this.s.f(n10, n8);
        }
    }

    private void I(float f8, float f9, int n8) {
        this.s(n8);
        float[] fArray = this.d;
        this.f[n8] = f8;
        fArray[n8] = f8;
        fArray = this.e;
        this.g[n8] = f9;
        fArray[n8] = f9;
        this.h[n8] = this.y((int)f8, (int)f9);
        this.k |= 1 << n8;
    }

    private void J(MotionEvent motionEvent) {
        int n8 = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = motionEvent.getPointerId(i8);
            if (!this.D(n9)) continue;
            float f8 = motionEvent.getX(i8);
            float f9 = motionEvent.getY(i8);
            this.f[n9] = f8;
            this.g[n9] = f9;
        }
    }

    private boolean c(float f8, float f9, int n8, int n9) {
        int n10;
        f8 = Math.abs(f8);
        f9 = Math.abs(f9);
        if (!((this.h[n8] & n9) != n9 || (this.q & n9) == 0 || (this.j[n8] & n9) == n9 || (this.i[n8] & n9) == n9 || f8 <= (float)(n10 = this.b) && f9 <= (float)n10)) {
            if (f8 < f9 * 0.5f && this.s.g(n9)) {
                int[] nArray = this.j;
                nArray[n8] = nArray[n8] | n9;
                return false;
            }
            if ((this.i[n8] & n9) == 0 && f8 > (float)this.b) {
                return true;
            }
        }
        return false;
    }

    private boolean f(View view, float f8, float f9) {
        if (view == null) {
            return false;
        }
        int n8 = this.s.d(view) > 0 ? 1 : 0;
        boolean bl = this.s.e(view) > 0;
        if (n8 != 0 && bl) {
            n8 = this.b;
            return f8 * f8 + f9 * f9 > (float)(n8 * n8);
        }
        if (n8 != 0) {
            return Math.abs(f8) > (float)this.b;
        }
        return bl && Math.abs(f9) > (float)this.b;
    }

    private float g(float f8, float f9, float f10) {
        float f11 = Math.abs(f8);
        if (f11 < f9) {
            return 0.0f;
        }
        f9 = f8;
        if (f11 > f10) {
            if (f8 > 0.0f) {
                return f10;
            }
            f9 = -f10;
        }
        return f9;
    }

    private int h(int n8, int n9, int n10) {
        int n11 = Math.abs(n8);
        if (n11 < n9) {
            return 0;
        }
        n9 = n8;
        if (n11 > n10) {
            if (n8 > 0) {
                return n10;
            }
            n9 = -n10;
        }
        return n9;
    }

    private void i() {
        float[] fArray = this.d;
        if (fArray == null) {
            return;
        }
        Arrays.fill(fArray, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    private void j(int n8) {
        if (this.d != null && this.C(n8)) {
            this.d[n8] = 0.0f;
            this.e[n8] = 0.0f;
            this.f[n8] = 0.0f;
            this.g[n8] = 0.0f;
            this.h[n8] = 0;
            this.i[n8] = 0;
            this.j[n8] = 0;
            this.k = ~(1 << n8) & this.k;
        }
    }

    private int k(int n8, int n9, int n10) {
        if (n8 == 0) {
            return 0;
        }
        int n11 = this.v.getWidth();
        int n12 = n11 / 2;
        float f8 = Math.min(1.0f, (float)Math.abs(n8) / (float)n11);
        float f9 = n12;
        f8 = this.q(f8);
        n8 = (n9 = Math.abs(n9)) > 0 ? Math.round(Math.abs((f9 + f8 * f9) / (float)n9) * 1000.0f) * 4 : (int)(((float)Math.abs(n8) / (float)n10 + 1.0f) * 256.0f);
        return Math.min(n8, 600);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int l(View view, int n8, int n9, int n10, int n11) {
        float f8;
        float f9;
        n10 = this.h(n10, (int)this.n, (int)this.m);
        n11 = this.h(n11, (int)this.n, (int)this.m);
        int n12 = Math.abs(n8);
        int n13 = Math.abs(n9);
        int n14 = Math.abs(n10);
        int n15 = Math.abs(n11);
        int n16 = n14 + n15;
        int n17 = n12 + n13;
        if (n10 != 0) {
            f9 = n14;
            f8 = n16;
        } else {
            f9 = n12;
            f8 = n17;
        }
        float f10 = f9 / f8;
        if (n11 != 0) {
            f9 = n15;
            f8 = n16;
        } else {
            f9 = n13;
            f8 = n17;
        }
        f8 = f9 / f8;
        n8 = this.k(n8, n10, this.s.d(view));
        n9 = this.k(n9, n11, this.s.e(view));
        return (int)((float)n8 * f10 + (float)n9 * f8);
    }

    public static c n(ViewGroup object, float f8, c c8) {
        object = ax.l0.c.o(object, c8);
        object.b = (int)((float)object.b * (1.0f / f8));
        return object;
    }

    public static c o(ViewGroup viewGroup, c c8) {
        return new c(viewGroup.getContext(), viewGroup, c8);
    }

    private void p(float f8, float f9) {
        this.u = true;
        this.s.l(this.t, f8, f9);
        this.u = false;
        if (this.a == 1) {
            this.K(0);
        }
    }

    private float q(float f8) {
        return (float)Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    private void r(int n8, int n9, int n10, int n11) {
        int n12 = this.t.getLeft();
        int n13 = this.t.getTop();
        int n14 = n8;
        if (n10 != 0) {
            n14 = this.s.a(this.t, n8, n10);
            d0.V(this.t, n14 - n12);
        }
        n8 = n9;
        if (n11 != 0) {
            n8 = this.s.b(this.t, n9, n11);
            d0.W(this.t, n8 - n13);
        }
        if (n10 == 0 && n11 == 0) {
            return;
        }
        this.s.k(this.t, n14, n8, n14 - n12, n8 - n13);
    }

    private void s(int n8) {
        Object[] objectArray = this.d;
        if (objectArray != null && objectArray.length > n8) {
            return;
        }
        float[] fArray = new float[++n8];
        float[] fArray2 = new float[n8];
        float[] fArray3 = new float[n8];
        float[] fArray4 = new float[n8];
        int[] nArray = new int[n8];
        int[] nArray2 = new int[n8];
        int[] nArray3 = new int[n8];
        if (objectArray != null) {
            System.arraycopy(objectArray, 0, fArray, 0, objectArray.length);
            objectArray = this.e;
            System.arraycopy(objectArray, 0, fArray2, 0, objectArray.length);
            objectArray = this.f;
            System.arraycopy(objectArray, 0, fArray3, 0, objectArray.length);
            objectArray = this.g;
            System.arraycopy(objectArray, 0, fArray4, 0, objectArray.length);
            objectArray = this.h;
            System.arraycopy(objectArray, 0, nArray, 0, objectArray.length);
            objectArray = this.i;
            System.arraycopy(objectArray, 0, nArray2, 0, objectArray.length);
            objectArray = this.j;
            System.arraycopy(objectArray, 0, nArray3, 0, objectArray.length);
        }
        this.d = fArray;
        this.e = fArray2;
        this.f = fArray3;
        this.g = fArray4;
        this.h = nArray;
        this.i = nArray2;
        this.j = nArray3;
    }

    private boolean u(int n8, int n9, int n10, int n11) {
        int n12 = this.t.getLeft();
        int n13 = this.t.getTop();
        if ((n8 -= n12) == 0 && (n9 -= n13) == 0) {
            this.r.abortAnimation();
            this.K(0);
            return false;
        }
        n10 = this.l(this.t, n8, n9, n10, n11);
        this.r.startScroll(n12, n13, n8, n9, n10);
        this.K(2);
        return true;
    }

    private int y(int n8, int n9) {
        int n10 = n8 < this.v.getLeft() + this.o ? 1 : 0;
        int n11 = n10;
        if (n9 < this.v.getTop() + this.o) {
            n11 = n10 | 4;
        }
        n10 = n11;
        if (n8 > this.v.getRight() - this.o) {
            n10 = n11 | 2;
        }
        if (n9 > this.v.getBottom() - this.o) {
            return n10 | 8;
        }
        return n10;
    }

    public int A() {
        return this.a;
    }

    public boolean B(int n8, int n9) {
        return this.E(this.t, n8, n9);
    }

    public boolean C(int n8) {
        return (1 << n8 & this.k) != 0;
    }

    public boolean E(View view, int n8, int n9) {
        if (view == null) {
            return false;
        }
        return n8 >= view.getLeft() && n8 < view.getRight() && n9 >= view.getTop() && n9 < view.getBottom();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void F(MotionEvent motionEvent) {
        int n8;
        int n9 = motionEvent.getActionMasked();
        int n10 = motionEvent.getActionIndex();
        if (n9 == 0) {
            this.a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int n11 = 0;
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 != 5) {
                            if (n9 != 6) return;
                            n11 = motionEvent.getPointerId(n10);
                            if (this.a == 1 && n11 == this.c) {
                                block15: {
                                    n10 = motionEvent.getPointerCount();
                                    for (n8 = 0; n8 < n10; ++n8) {
                                        View view;
                                        float f8;
                                        float f9;
                                        View view2;
                                        n9 = motionEvent.getPointerId(n8);
                                        if (n9 == this.c || (view2 = this.t((int)(f9 = motionEvent.getX(n8)), (int)(f8 = motionEvent.getY(n8)))) != (view = this.t) || !this.R(view, n9)) continue;
                                        n8 = this.c;
                                        break block15;
                                    }
                                    n8 = -1;
                                }
                                if (n8 == -1) {
                                    this.G();
                                }
                            }
                            this.j(n11);
                            return;
                        }
                        n8 = motionEvent.getPointerId(n10);
                        float f10 = motionEvent.getX(n10);
                        float f11 = motionEvent.getY(n10);
                        this.I(f10, f11, n8);
                        if (this.a == 0) {
                            this.R(this.t((int)f10, (int)f11), n8);
                            n10 = this.h[n8];
                            n11 = this.q;
                            if ((n10 & n11) == 0) return;
                            this.s.h(n10 & n11, n8);
                            return;
                        }
                        if (!this.B((int)f10, (int)f11)) return;
                        this.R(this.t, n8);
                        return;
                    }
                    if (this.a == 1) {
                        this.p(0.0f, 0.0f);
                    }
                    this.a();
                    return;
                }
                if (this.a == 1) {
                    if (!this.D(this.c)) return;
                    n8 = motionEvent.findPointerIndex(this.c);
                    float f12 = motionEvent.getX(n8);
                    float f13 = motionEvent.getY(n8);
                    float[] fArray = this.f;
                    n11 = this.c;
                    n8 = (int)(f12 - fArray[n11]);
                    n11 = (int)(f13 - this.g[n11]);
                    this.r(this.t.getLeft() + n8, this.t.getTop() + n11, n8, n11);
                    this.J(motionEvent);
                    return;
                }
                n10 = motionEvent.getPointerCount();
                for (n8 = n11; n8 < n10; ++n8) {
                    View view;
                    n11 = motionEvent.getPointerId(n8);
                    if (!this.D(n11)) continue;
                    float f14 = motionEvent.getX(n8);
                    float f15 = motionEvent.getY(n8);
                    float f16 = f14 - this.d[n11];
                    float f17 = f15 - this.e[n11];
                    this.H(f16, f17, n11);
                    if (this.a == 1 || this.f(view = this.t((int)f14, (int)f15), f16, f17) && this.R(view, n11)) break;
                }
                this.J(motionEvent);
                return;
            }
            if (this.a == 1) {
                this.G();
            }
            this.a();
            return;
        }
        float f18 = motionEvent.getX();
        float f19 = motionEvent.getY();
        n11 = motionEvent.getPointerId(0);
        motionEvent = this.t((int)f18, (int)f19);
        this.I(f18, f19, n11);
        this.R((View)motionEvent, n11);
        n10 = this.h[n11];
        n8 = this.q;
        if ((n10 & n8) == 0) return;
        this.s.h(n10 & n8, n11);
    }

    void K(int n8) {
        this.v.removeCallbacks(this.w);
        if (this.a != n8) {
            this.a = n8;
            this.s.j(n8);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public void L(int n8) {
        this.o = n8;
    }

    public void M(int n8) {
        this.q = n8;
    }

    public void N(float f8) {
        this.n = f8;
    }

    public boolean O(int n8, int n9) {
        if (this.u) {
            return this.u(n8, n9, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean P(MotionEvent motionEvent) {
        block17: {
            int n8;
            int n9;
            int n10;
            block14: {
                block15: {
                    block16: {
                        n10 = motionEvent.getActionMasked();
                        n9 = motionEvent.getActionIndex();
                        if (n10 == 0) {
                            this.a();
                        }
                        if (this.l == null) {
                            this.l = VelocityTracker.obtain();
                        }
                        this.l.addMovement(motionEvent);
                        if (n10 == 0) break block14;
                        if (n10 == 1) break block15;
                        if (n10 == 2) break block16;
                        if (n10 == 3) break block15;
                        if (n10 != 5) {
                            if (n10 == 6) {
                                this.j(motionEvent.getPointerId(n9));
                            }
                        } else {
                            n10 = motionEvent.getPointerId(n9);
                            float f8 = motionEvent.getX(n9);
                            float f9 = motionEvent.getY(n9);
                            this.I(f8, f9, n10);
                            n9 = this.a;
                            if (n9 == 0) {
                                n9 = this.h[n10];
                                int n11 = this.q;
                                if ((n9 & n11) != 0) {
                                    this.s.h(n9 & n11, n10);
                                }
                            } else if (n9 == 2 && (motionEvent = this.t((int)f8, (int)f9)) == this.t) {
                                this.R((View)motionEvent, n10);
                            }
                        }
                        break block17;
                    }
                    if (this.d != null && this.e != null) {
                        int n12 = motionEvent.getPointerCount();
                        for (n10 = 0; n10 < n12; ++n10) {
                            int n13 = motionEvent.getPointerId(n10);
                            if (!this.D(n13)) continue;
                            float f10 = motionEvent.getX(n10);
                            float f11 = motionEvent.getY(n10);
                            float f12 = f10 - this.d[n13];
                            float f13 = f11 - this.e[n13];
                            View view = this.t((int)f10, (int)f11);
                            n9 = view != null && this.f(view, f12, f13) ? 1 : 0;
                            if (n9 != 0) {
                                int n14 = view.getLeft();
                                int n15 = (int)f12;
                                int n16 = this.s.a(view, n14 + n15, n15);
                                n15 = view.getTop();
                                int n17 = (int)f13;
                                int n18 = this.s.b(view, n15 + n17, n17);
                                int n19 = this.s.d(view);
                                n17 = this.s.e(view);
                                if ((n19 == 0 || n19 > 0 && n16 == n14) && (n17 == 0 || n17 > 0 && n18 == n15)) break;
                            }
                            this.H(f12, f13, n13);
                            if (this.a == 1 || n9 != 0 && this.R(view, n13)) break;
                        }
                        this.J(motionEvent);
                    }
                    break block17;
                }
                this.a();
                break block17;
            }
            float f14 = motionEvent.getX();
            float f15 = motionEvent.getY();
            n10 = motionEvent.getPointerId(0);
            this.I(f14, f15, n10);
            motionEvent = this.t((int)f14, (int)f15);
            if (motionEvent == this.t && this.a == 2) {
                this.R((View)motionEvent, n10);
            }
            if (((n8 = this.h[n10]) & (n9 = this.q)) != 0) {
                this.s.h(n8 & n9, n10);
            }
        }
        return this.a == 1;
    }

    public boolean Q(View view, int n8, int n9) {
        this.t = view;
        this.c = -1;
        boolean bl = this.u(n8, n9, 0, 0);
        if (!bl && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return bl;
    }

    boolean R(View view, int n8) {
        if (view == this.t && this.c == n8) {
            return true;
        }
        if (view != null && this.s.m(view, n8)) {
            this.c = n8;
            this.b(view, n8);
            return true;
        }
        return false;
    }

    public void a() {
        this.c = -1;
        this.i();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(View object, int n8) {
        if (object.getParent() == this.v) {
            this.t = object;
            this.c = n8;
            this.s.i((View)object, n8);
            this.K(1);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        ((StringBuilder)object).append(this.v);
        ((StringBuilder)object).append(")");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public boolean d(int n8) {
        int n9 = this.d.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (!this.e(n8, i8)) continue;
            return true;
        }
        return false;
    }

    public boolean e(int n8, int n9) {
        if (!this.C(n9)) {
            return false;
        }
        boolean bl = (n8 & 1) == 1;
        n8 = (n8 & 2) == 2 ? 1 : 0;
        float f8 = this.f[n9] - this.d[n9];
        float f9 = this.g[n9] - this.e[n9];
        if (bl && n8 != 0) {
            n8 = this.b;
            return f8 * f8 + f9 * f9 > (float)(n8 * n8);
        }
        if (bl) {
            return Math.abs(f8) > (float)this.b;
        }
        return n8 != 0 && Math.abs(f9) > (float)this.b;
    }

    public boolean m(boolean bl) {
        if (this.a == 2) {
            boolean bl2 = this.r.computeScrollOffset();
            int n8 = this.r.getCurrX();
            int n9 = this.r.getCurrY();
            int n10 = n8 - this.t.getLeft();
            int n11 = n9 - this.t.getTop();
            if (n10 != 0) {
                d0.V(this.t, n10);
            }
            if (n11 != 0) {
                d0.W(this.t, n11);
            }
            if (n10 != 0 || n11 != 0) {
                this.s.k(this.t, n8, n9, n10, n11);
            }
            boolean bl3 = bl2;
            if (bl2) {
                bl3 = bl2;
                if (n8 == this.r.getFinalX()) {
                    bl3 = bl2;
                    if (n9 == this.r.getFinalY()) {
                        this.r.abortAnimation();
                        bl3 = false;
                    }
                }
            }
            if (!bl3) {
                if (bl) {
                    this.v.post(this.w);
                } else {
                    this.K(0);
                }
            }
        }
        return this.a == 2;
    }

    public View t(int n8, int n9) {
        for (int i8 = this.v.getChildCount() - 1; i8 >= 0; --i8) {
            View view = this.v.getChildAt(this.s.c(i8));
            if (n8 < view.getLeft() || n8 >= view.getRight() || n9 < view.getTop() || n9 >= view.getBottom()) continue;
            return view;
        }
        return null;
    }

    public View v() {
        return this.t;
    }

    public int w() {
        return this.p;
    }

    public int x() {
        return this.o;
    }

    public int z() {
        return this.b;
    }

    public static abstract class c {
        public abstract int a(View var1, int var2, int var3);

        public abstract int b(View var1, int var2, int var3);

        public int c(int n8) {
            return n8;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int n8, int n9) {
        }

        public boolean g(int n8) {
            return false;
        }

        public void h(int n8, int n9) {
        }

        public void i(View view, int n8) {
        }

        public abstract void j(int var1);

        public abstract void k(View var1, int var2, int var3, int var4, int var5);

        public abstract void l(View var1, float var2, float var3);

        public abstract boolean m(View var1, int var2);
    }
}

