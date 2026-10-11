/*
 * Decompiled with CFR 0.152.
 */
package ax.K;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.K.a;
import ax.K.g;
import ax.K.h;
import ax.K.i;
import ax.K.l;
import ax.c0.G;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class j
extends ConstraintLayout
implements G {
    public static boolean u0;
    float A;
    private int B;
    int C;
    private int D;
    private boolean E;
    HashMap<View, g> F;
    private long G;
    private float H;
    float I;
    float J;
    private long K;
    float L;
    private boolean M;
    boolean N;
    private d O;
    int P;
    private boolean Q;
    private ax.K.b R;
    boolean S;
    float T;
    float U;
    long V;
    float W;
    private boolean a0;
    private ArrayList<h> b0;
    private ArrayList<h> c0;
    private ArrayList<h> d0;
    private CopyOnWriteArrayList<d> e0;
    private int f0;
    private float g0;
    boolean h0;
    protected boolean i0;
    float j0;
    private boolean k0;
    private c l0;
    private Runnable m0;
    private int[] n0;
    int o0;
    private int p0;
    private boolean q0;
    e r0;
    private boolean s0;
    ArrayList<Integer> t0;
    Interpolator y;
    Interpolator z;

    private void G() {
        Object object;
        if ((this.O != null || (object = this.e0) != null && !((CopyOnWriteArrayList)object).isEmpty()) && this.g0 != this.I) {
            float f8;
            if (this.f0 != -1) {
                object = this.O;
                if (object != null) {
                    object.a(this, this.B, this.D);
                }
                if ((object = this.e0) != null) {
                    object = ((CopyOnWriteArrayList)object).iterator();
                    while (object.hasNext()) {
                        object.next().a(this, this.B, this.D);
                    }
                }
                this.h0 = true;
            }
            this.f0 = -1;
            this.g0 = f8 = this.I;
            object = this.O;
            if (object != null) {
                object.b(this, this.B, this.D, f8);
            }
            if ((object = this.e0) != null) {
                object = ((CopyOnWriteArrayList)object).iterator();
                while (object.hasNext()) {
                    ((d)object.next()).b(this, this.B, this.D, this.I);
                }
            }
            this.h0 = true;
        }
    }

    private void J() {
        List<Object> list;
        if (this.O == null && ((list = this.e0) == null || ((CopyOnWriteArrayList)list).isEmpty())) {
            return;
        }
        int n8 = 0;
        this.h0 = false;
        list = this.t0;
        int n9 = ((ArrayList)list).size();
        block0: while (n8 < n9) {
            Object object = ((ArrayList)list).get(n8);
            int n10 = n8 + 1;
            object = (Integer)object;
            Object object2 = this.O;
            if (object2 != null) {
                object2.c(this, (Integer)object);
            }
            object2 = this.e0;
            n8 = n10;
            if (object2 == null) continue;
            object2 = ((CopyOnWriteArrayList)object2).iterator();
            while (true) {
                n8 = n10;
                if (!object2.hasNext()) continue block0;
                ((d)object2.next()).c(this, (Integer)object);
            }
        }
        this.t0.clear();
    }

    void E(float f8) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void F(boolean bl) {
        int n8;
        int n9;
        int n10;
        int n11;
        float f8;
        block37: {
            float f9;
            float f10;
            float f11;
            Object object;
            long l8;
            float f12;
            block39: {
                block38: {
                    float f13;
                    if (this.K == -1L) {
                        this.K = this.getNanoTime();
                    }
                    if ((f8 = this.J) > 0.0f && f8 < 1.0f) {
                        this.C = -1;
                    }
                    boolean bl2 = this.a0;
                    n11 = 1;
                    n10 = 1;
                    n9 = 0;
                    if (!bl2 && (!this.N || !bl && this.L == f8)) break block37;
                    f12 = Math.signum(this.L - f8);
                    l8 = this.getNanoTime();
                    object = this.y;
                    f11 = !(object instanceof i) ? (float)(l8 - this.K) * f12 * 1.0E-9f / this.H : 0.0f;
                    f8 = this.J + f11;
                    if (this.M) {
                        f8 = this.L;
                    }
                    if ((f10 = (f13 = f12 - 0.0f) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1)) > 0 && f8 >= this.L || f12 <= 0.0f && f8 <= this.L) {
                        f8 = this.L;
                        this.N = false;
                        n8 = 1;
                    } else {
                        n8 = 0;
                    }
                    this.J = f8;
                    this.I = f8;
                    this.K = l8;
                    if (object != null && n8 == 0) {
                        if (this.Q) {
                            f9 = object.getInterpolation((float)(l8 - this.G) * 1.0E-9f);
                            object = this.y;
                            if (object == null) throw null;
                            this.J = f9;
                            this.K = l8;
                            f8 = f9;
                            if (object instanceof i) {
                                float f14;
                                this.A = f14 = ((i)object).a();
                                Math.abs(f14);
                                f11 = f9;
                                if (f14 > 0.0f) {
                                    f11 = f9;
                                    if (f9 >= 1.0f) {
                                        this.J = 1.0f;
                                        this.N = false;
                                        f11 = 1.0f;
                                    }
                                }
                                f8 = f11;
                                if (f14 < 0.0f) {
                                    f8 = f11;
                                    if (f11 <= 0.0f) {
                                        this.J = 0.0f;
                                        this.N = false;
                                        f8 = 0.0f;
                                    }
                                }
                            }
                        } else {
                            f9 = object.getInterpolation(f8);
                            object = this.y;
                            if (object instanceof i) {
                                this.A = ((i)object).a();
                                f8 = f9;
                            } else {
                                this.A = (object.getInterpolation(f8 + f11) - f9) * f12 / f11;
                                f8 = f9;
                            }
                        }
                    } else {
                        this.A = f11;
                    }
                    if (Math.abs(this.A) > 1.0E-5f) {
                        this.setState(e.d0);
                    }
                    if (f10 > 0 && f8 >= this.L) break block38;
                    f11 = f8;
                    if (!(f12 <= 0.0f)) break block39;
                    f11 = f8;
                    if (!(f8 <= this.L)) break block39;
                }
                f11 = this.L;
                this.N = false;
            }
            if (f11 >= 1.0f || f11 <= 0.0f) {
                this.N = false;
                this.setState(e.e0);
            }
            int n12 = this.getChildCount();
            this.a0 = false;
            l8 = this.getNanoTime();
            this.j0 = f11;
            object = this.z;
            f8 = object == null ? f11 : object.getInterpolation(f11);
            object = this.z;
            if (object != null) {
                this.A = f9 = object.getInterpolation(f12 / this.H + f11);
                this.A = f9 - this.z.getInterpolation(f11);
            }
            for (n8 = 0; n8 < n12; ++n8) {
                View view = this.getChildAt(n8);
                object = this.F.get(view);
                if (object == null) continue;
                bl = this.a0;
                this.a0 = ((g)object).c(view, f8, l8, null) | bl;
            }
            n8 = f10 > 0 && f11 >= this.L || f12 <= 0.0f && f11 <= this.L ? 1 : 0;
            if (!this.a0 && !this.N && n8 != 0) {
                this.setState(e.e0);
            }
            if (this.i0) {
                this.requestLayout();
            }
            this.a0 = bl = n8 ^ 1 | this.a0;
            if (f11 <= 0.0f && (n8 = this.B) != -1 && this.C != n8) {
                this.C = n8;
                throw null;
            }
            if ((double)f11 >= 1.0 && (n8 = this.C) != (n12 = this.D)) {
                this.C = n12;
                throw null;
            }
            if (!bl && !this.N) {
                if (f10 > 0 && f11 == 1.0f || f12 < 0.0f && f11 == 0.0f) {
                    this.setState(e.e0);
                }
            } else {
                this.invalidate();
            }
            if (!this.a0 && !this.N && (f10 > 0 && f11 == 1.0f || f12 < 0.0f && f11 == 0.0f)) {
                this.I();
            }
        }
        if ((f8 = this.J) >= 1.0f) {
            n8 = this.C;
            n11 = this.D;
            n8 = n8 != n11 ? n10 : 0;
            this.C = n11;
        } else {
            n8 = n9;
            if (f8 <= 0.0f) {
                n8 = this.C;
                n10 = this.B;
                n8 = n8 != n10 ? n11 : 0;
                this.C = n10;
            }
        }
        this.s0 |= n8;
        if (n8 != 0 && !this.k0) {
            this.requestLayout();
        }
        this.I = this.J;
    }

    protected void H() {
        Object object;
        if ((this.O != null || (object = this.e0) != null && !((CopyOnWriteArrayList)object).isEmpty()) && this.f0 == -1) {
            int n8;
            this.f0 = this.C;
            if (!this.t0.isEmpty()) {
                object = this.t0;
                n8 = ((ArrayList)object).get(((ArrayList)object).size() - 1);
            } else {
                n8 = -1;
            }
            int n9 = this.C;
            if (n8 != n9 && n9 != -1) {
                this.t0.add(n9);
            }
        }
        this.J();
        object = this.m0;
        if (object != null) {
            object.run();
        }
        if ((object = (Object)this.n0) != null && this.o0 > 0) {
            this.O((int)object[0]);
            object = this.n0;
            System.arraycopy(object, 1, object, 0, ((Object)object).length - 1);
            --this.o0;
        }
    }

    void I() {
    }

    public void K(float f8, float f9) {
        if (!this.isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new c(this);
            }
            this.l0.e(f8);
            this.l0.h(f9);
            return;
        }
        this.setProgress(f8);
        this.setState(e.d0);
        this.A = f9;
        float f10 = 1.0f;
        float f11 = f9 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 != false) {
            if (f12 <= 0) {
                f10 = 0.0f;
            }
            this.E(f10);
            return;
        }
        if (f8 != 0.0f && f8 != 1.0f) {
            if (!(f8 > 0.5f)) {
                f10 = 0.0f;
            }
            this.E(f10);
        }
    }

    public void L(int n8, int n9, int n10) {
        this.setState(e.c0);
        this.C = n8;
        this.B = -1;
        this.D = -1;
        androidx.constraintlayout.widget.d d8 = this.k;
        if (d8 != null) {
            d8.d(n8, n9, n10);
        }
    }

    public void M(int n8, int n9) {
        if (!this.isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new c(this);
            }
            this.l0.f(n8);
            this.l0.d(n9);
        }
    }

    public void N() {
        this.E(1.0f);
        this.m0 = null;
    }

    public void O(int n8) {
        if (!this.isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new c(this);
            }
            this.l0.d(n8);
            return;
        }
        this.P(n8, -1, -1);
    }

    public void P(int n8, int n9, int n10) {
        this.Q(n8, n9, n10, -1);
    }

    public void Q(int n8, int n9, int n10, int n11) {
        block11: {
            block8: {
                block10: {
                    block9: {
                        n9 = this.C;
                        if (n9 == n8) break block8;
                        if (this.B != n8) break block9;
                        this.E(0.0f);
                        if (n11 > 0) {
                            this.H = (float)n11 / 1000.0f;
                            return;
                        }
                        break block8;
                    }
                    if (this.D != n8) break block10;
                    this.E(1.0f);
                    if (n11 > 0) {
                        this.H = (float)n11 / 1000.0f;
                        return;
                    }
                    break block8;
                }
                this.D = n8;
                if (n9 == -1) break block11;
                this.M(n9, n8);
                this.E(1.0f);
                this.J = 0.0f;
                this.N();
                if (n11 > 0) {
                    this.H = (float)n11 / 1000.0f;
                }
            }
            return;
        }
        this.Q = false;
        this.L = 1.0f;
        this.I = 0.0f;
        this.J = 0.0f;
        this.K = this.getNanoTime();
        this.G = this.getNanoTime();
        this.M = false;
        this.y = null;
        if (n11 == -1) {
            throw null;
        }
        this.B = -1;
        throw null;
    }

    @Override
    public void b(View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
        if (this.S || n8 != 0 || n9 != 0) {
            nArray[0] = nArray[0] + n10;
            nArray[1] = nArray[1] + n11;
        }
        this.S = false;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.d0;
        if (arrayList != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                h h8 = arrayList.get(i8);
                h8.w(canvas);
            }
        }
        this.F(false);
        super.dispatchDraw(canvas);
    }

    @Override
    public void e(View view, int n8, int n9, int n10, int n11, int n12) {
    }

    @Override
    public boolean f(View view, View view2, int n8, int n9) {
        return false;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.C;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public ax.K.b getDesignTool() {
        if (this.R == null) {
            this.R = new ax.K.b(this);
        }
        return this.R;
    }

    public int getEndState() {
        return this.D;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.J;
    }

    public l getScene() {
        return null;
    }

    public int getStartState() {
        return this.B;
    }

    public float getTargetPosition() {
        return this.L;
    }

    public Bundle getTransitionState() {
        if (this.l0 == null) {
            this.l0 = new c(this);
        }
        this.l0.c();
        return this.l0.b();
    }

    public long getTransitionTimeMs() {
        return (long)(this.H * 1000.0f);
    }

    public float getVelocity() {
        return this.A;
    }

    @Override
    public void h(View view, View view2, int n8, int n9) {
        this.V = this.getNanoTime();
        this.W = 0.0f;
        this.T = 0.0f;
        this.U = 0.0f;
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override
    public void o(View view, int n8) {
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object object = this.getDisplay();
        if (object != null) {
            this.p0 = object.getRotation();
        }
        this.I();
        object = this.l0;
        if (object != null) {
            if (this.q0) {
                this.post(new Runnable(this){
                    final j q;
                    {
                        this.q = j8;
                    }

                    @Override
                    public void run() {
                        this.q.l0.a();
                    }
                });
                return;
            }
            ((c)object).a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        this.k0 = true;
        try {
            super.onLayout(bl, n8, n9, n10, n11);
            return;
        }
        finally {
            this.k0 = false;
        }
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
    }

    public boolean onNestedFling(View view, float f8, float f9, boolean bl) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    public void onRtlPropertiesChanged(int n8) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            view = (h)view;
            if (this.e0 == null) {
                this.e0 = new CopyOnWriteArrayList();
            }
            this.e0.add((d)view);
            if (view.v()) {
                if (this.b0 == null) {
                    this.b0 = new ArrayList();
                }
                this.b0.add((h)view);
            }
            if (view.u()) {
                if (this.c0 == null) {
                    this.c0 = new ArrayList();
                }
                this.c0.add((h)view);
            }
            if (view.t()) {
                if (this.d0 == null) {
                    this.d0 = new ArrayList();
                }
                this.d0.add((h)view);
            }
        }
    }

    @Override
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.b0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        if ((arrayList = this.c0) != null) {
            arrayList.remove(view);
        }
    }

    @Override
    public void p(View view, int n8, int n9, int[] nArray, int n10) {
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
    }

    public void setDebugMode(int n8) {
        this.P = n8;
        this.invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean bl) {
        this.q0 = bl;
    }

    public void setInteractionEnabled(boolean bl) {
        this.E = bl;
    }

    public void setInterpolatedProgress(float f8) {
        this.setProgress(f8);
    }

    public void setOnHide(float f8) {
        ArrayList<h> arrayList = this.c0;
        if (arrayList != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.c0.get(i8).setProgress(f8);
            }
        }
    }

    public void setOnShow(float f8) {
        ArrayList<h> arrayList = this.b0;
        if (arrayList != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.b0.get(i8).setProgress(f8);
            }
        }
    }

    public void setProgress(float f8) {
        float f9 = f8 - 0.0f;
        float f10 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
        if (f10 < 0 || f8 > 1.0f) {
            Log.w((String)"MotionLayout", (String)"Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!this.isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new c(this);
            }
            this.l0.e(f8);
            return;
        }
        if (f10 <= 0) {
            if (this.J == 1.0f && this.C == this.D) {
                this.setState(e.d0);
            }
            this.C = this.B;
            if (this.J == 0.0f) {
                this.setState(e.e0);
            }
        } else if (f8 >= 1.0f) {
            if (this.J == 0.0f && this.C == this.B) {
                this.setState(e.d0);
            }
            this.C = this.D;
            if (this.J == 1.0f) {
                this.setState(e.e0);
            }
        } else {
            this.C = -1;
            this.setState(e.d0);
        }
    }

    public void setScene(l l8) {
        this.r();
        throw null;
    }

    void setStartState(int n8) {
        if (!this.isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new c(this);
            }
            this.l0.f(n8);
            this.l0.d(n8);
            return;
        }
        this.C = n8;
    }

    void setState(e e8) {
        e e9 = e.e0;
        if (e8 != e9 || this.C != -1) {
            int n8;
            e e10 = this.r0;
            this.r0 = e8;
            e e11 = e.d0;
            if (e10 == e11 && e8 == e11) {
                this.G();
            }
            if ((n8 = b.a[e10.ordinal()]) != 1 && n8 != 2) {
                if (n8 == 3 && e8 == e9) {
                    this.H();
                    return;
                }
            } else {
                if (e8 == e11) {
                    this.G();
                }
                if (e8 == e9) {
                    this.H();
                }
            }
        }
    }

    public void setTransition(int n8) {
    }

    protected void setTransition(l.a a8) {
        throw null;
    }

    public void setTransitionDuration(int n8) {
        Log.e((String)"MotionLayout", (String)"MotionScene not defined");
    }

    public void setTransitionListener(d d8) {
        this.O = d8;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.l0 == null) {
            this.l0 = new c(this);
        }
        this.l0.g(bundle);
        if (this.isAttachedToWindow()) {
            this.l0.a();
        }
    }

    @Override
    protected void t(int n8) {
        this.k = null;
    }

    public String toString() {
        Context context = this.getContext();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.a(context, this.B));
        stringBuilder.append("->");
        stringBuilder.append(a.a(context, this.D));
        stringBuilder.append(" (pos:");
        stringBuilder.append(this.J);
        stringBuilder.append(" Dpos/Dt:");
        stringBuilder.append(this.A);
        return stringBuilder.toString();
    }

    class c {
        float a;
        float b;
        int c;
        int d;
        final String e;
        final String f;
        final String g;
        final String h;
        final j i;

        c(j j8) {
            this.i = j8;
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
            this.e = "motion.progress";
            this.f = "motion.velocity";
            this.g = "motion.StartState";
            this.h = "motion.EndState";
        }

        void a() {
            int n8 = this.c;
            if (n8 != -1 || this.d != -1) {
                if (n8 == -1) {
                    this.i.O(this.d);
                } else {
                    int n9 = this.d;
                    if (n9 == -1) {
                        this.i.L(n8, -1, -1);
                    } else {
                        this.i.M(n8, n9);
                    }
                }
                this.i.setState(ax.K.j$e.c0);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                this.i.setProgress(this.a);
                return;
            }
            this.i.K(this.a, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.a);
            bundle.putFloat("motion.velocity", this.b);
            bundle.putInt("motion.StartState", this.c);
            bundle.putInt("motion.EndState", this.d);
            return bundle;
        }

        public void c() {
            this.d = this.i.D;
            this.c = this.i.B;
            this.b = this.i.getVelocity();
            this.a = this.i.getProgress();
        }

        public void d(int n8) {
            this.d = n8;
        }

        public void e(float f8) {
            this.a = f8;
        }

        public void f(int n8) {
            this.c = n8;
        }

        public void g(Bundle bundle) {
            this.a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }

        public void h(float f8) {
            this.b = f8;
        }
    }

    public static interface d {
        public void a(j var1, int var2, int var3);

        public void b(j var1, int var2, int var3, float var4);

        public void c(j var1, int var2);
    }

    static final class e
    extends Enum<e> {
        public static final /* enum */ e c0;
        public static final /* enum */ e d0;
        public static final /* enum */ e e0;
        private static final e[] f0;
        public static final /* enum */ e q;

        static {
            q = new e();
            c0 = new e();
            d0 = new e();
            e0 = new e();
            f0 = e.d();
        }

        private static /* synthetic */ e[] d() {
            return new e[]{q, c0, d0, e0};
        }

        public static e valueOf(String string) {
            return Enum.valueOf(e.class, string);
        }

        public static e[] values() {
            return (e[])f0.clone();
        }
    }
}

