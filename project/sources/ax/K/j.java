package ax.K;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.K.l;
import ax.c0.G;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class j extends ConstraintLayout implements G {
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

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.l0.a();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c {
        float a = Float.NaN;
        float b = Float.NaN;
        int c = -1;
        int d = -1;
        final String e = "motion.progress";
        final String f = "motion.velocity";
        final String g = "motion.StartState";
        final String h = "motion.EndState";

        c() {
        }

        void a() {
            int i = this.c;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    j.this.O(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        j.this.L(i, -1, -1);
                    } else {
                        j.this.M(i, i2);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                j.this.setProgress(this.a);
            } else {
                j.this.K(this.a, this.b);
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
            }
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
            this.d = j.this.D;
            this.c = j.this.B;
            this.b = j.this.getVelocity();
            this.a = j.this.getProgress();
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(float f) {
            this.a = f;
        }

        public void f(int i) {
            this.c = i;
        }

        public void g(Bundle bundle) {
            this.a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }

        public void h(float f) {
            this.b = f;
        }
    }

    public interface d {
        void a(j jVar, int i, int i2);

        void b(j jVar, int i, int i2, float f);

        void c(j jVar, int i);
    }

    enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void G() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.O == null && ((copyOnWriteArrayList = this.e0) == null || copyOnWriteArrayList.isEmpty())) || this.g0 == this.I) {
            return;
        }
        if (this.f0 != -1) {
            d dVar = this.O;
            if (dVar != null) {
                dVar.a(this, this.B, this.D);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.e0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.B, this.D);
                }
            }
            this.h0 = true;
        }
        this.f0 = -1;
        float f = this.I;
        this.g0 = f;
        d dVar2 = this.O;
        if (dVar2 != null) {
            dVar2.b(this, this.B, this.D, f);
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.e0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<d> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().b(this, this.B, this.D, this.I);
            }
        }
        this.h0 = true;
    }

    private void J() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.O == null && ((copyOnWriteArrayList = this.e0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        int i = 0;
        this.h0 = false;
        ArrayList<Integer> arrayList = this.t0;
        int size = arrayList.size();
        while (i < size) {
            Integer num = arrayList.get(i);
            i++;
            Integer num2 = num;
            d dVar = this.O;
            if (dVar != null) {
                dVar.c(this, num2.intValue());
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.e0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, num2.intValue());
                }
            }
        }
        this.t0.clear();
    }

    void F(boolean z) {
        boolean z2;
        int i;
        float interpolation;
        boolean z3;
        if (this.K == -1) {
            this.K = getNanoTime();
        }
        float f = this.J;
        if (f > 0.0f && f < 1.0f) {
            this.C = -1;
        }
        boolean z4 = false;
        if (this.a0 || (this.N && (z || this.L != f))) {
            float signum = Math.signum(this.L - f);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.y;
            float f2 = !(interpolator instanceof i) ? (((nanoTime - this.K) * signum) * 1.0E-9f) / this.H : 0.0f;
            float f3 = this.J + f2;
            if (this.M) {
                f3 = this.L;
            }
            if ((signum <= 0.0f || f3 < this.L) && (signum > 0.0f || f3 > this.L)) {
                z2 = false;
            } else {
                f3 = this.L;
                this.N = false;
                z2 = true;
            }
            this.J = f3;
            this.I = f3;
            this.K = nanoTime;
            if (interpolator == null || z2) {
                this.A = f2;
            } else {
                if (this.Q) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.G) * 1.0E-9f);
                    Interpolator interpolator2 = this.y;
                    if (interpolator2 == null) {
                        throw null;
                    }
                    this.J = interpolation;
                    this.K = nanoTime;
                    if (interpolator2 instanceof i) {
                        float a2 = ((i) interpolator2).a();
                        this.A = a2;
                        Math.abs(a2);
                        if (a2 > 0.0f && interpolation >= 1.0f) {
                            this.J = 1.0f;
                            this.N = false;
                            interpolation = 1.0f;
                        }
                        if (a2 < 0.0f && interpolation <= 0.0f) {
                            this.J = 0.0f;
                            this.N = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.y;
                    if (interpolator3 instanceof i) {
                        this.A = ((i) interpolator3).a();
                    } else {
                        this.A = ((interpolator3.getInterpolation(f3 + f2) - interpolation) * signum) / f2;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.A) > 1.0E-5f) {
                setState(e.MOVING);
            }
            if ((signum > 0.0f && f3 >= this.L) || (signum <= 0.0f && f3 <= this.L)) {
                f3 = this.L;
                this.N = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.N = false;
                setState(e.FINISHED);
            }
            int childCount = getChildCount();
            this.a0 = false;
            long nanoTime2 = getNanoTime();
            this.j0 = f3;
            Interpolator interpolator4 = this.z;
            float interpolation2 = interpolator4 == null ? f3 : interpolator4.getInterpolation(f3);
            Interpolator interpolator5 = this.z;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((signum / this.H) + f3);
                this.A = interpolation3;
                this.A = interpolation3 - this.z.getInterpolation(f3);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                g gVar = this.F.get(childAt);
                if (gVar != null) {
                    this.a0 = gVar.c(childAt, interpolation2, nanoTime2, null) | this.a0;
                }
            }
            boolean z5 = (signum > 0.0f && f3 >= this.L) || (signum <= 0.0f && f3 <= this.L);
            if (!this.a0 && !this.N && z5) {
                setState(e.FINISHED);
            }
            if (this.i0) {
                requestLayout();
            }
            boolean z6 = (!z5) | this.a0;
            this.a0 = z6;
            if (f3 <= 0.0f && (i = this.B) != -1 && this.C != i) {
                this.C = i;
                throw null;
            }
            if (f3 >= 1.0d) {
                int i3 = this.C;
                int i4 = this.D;
                if (i3 != i4) {
                    this.C = i4;
                    throw null;
                }
            }
            if (z6 || this.N) {
                invalidate();
            } else if ((signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                setState(e.FINISHED);
            }
            if (!this.a0 && !this.N && ((signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f))) {
                I();
            }
        }
        float f4 = this.J;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                int i5 = this.C;
                int i6 = this.B;
                z3 = i5 != i6;
                this.C = i6;
            }
            this.s0 |= z4;
            if (z4 && !this.k0) {
                requestLayout();
            }
            this.I = this.J;
        }
        int i7 = this.C;
        int i8 = this.D;
        z3 = i7 != i8;
        this.C = i8;
        z4 = z3;
        this.s0 |= z4;
        if (z4) {
            requestLayout();
        }
        this.I = this.J;
    }

    protected void H() {
        int i;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.O != null || ((copyOnWriteArrayList = this.e0) != null && !copyOnWriteArrayList.isEmpty())) && this.f0 == -1) {
            this.f0 = this.C;
            if (this.t0.isEmpty()) {
                i = -1;
            } else {
                ArrayList<Integer> arrayList = this.t0;
                i = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i2 = this.C;
            if (i != i2 && i2 != -1) {
                this.t0.add(Integer.valueOf(i2));
            }
        }
        J();
        Runnable runnable = this.m0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.n0;
        if (iArr == null || this.o0 <= 0) {
            return;
        }
        O(iArr[0]);
        int[] iArr2 = this.n0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.o0--;
    }

    public void K(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new c();
            }
            this.l0.e(f);
            this.l0.h(f2);
            return;
        }
        setProgress(f);
        setState(e.MOVING);
        this.A = f2;
        if (f2 != 0.0f) {
            E(f2 <= 0.0f ? 0.0f : 1.0f);
        } else {
            if (f == 0.0f || f == 1.0f) {
                return;
            }
            E(f <= 0.5f ? 0.0f : 1.0f);
        }
    }

    public void L(int i, int i2, int i3) {
        setState(e.SETUP);
        this.C = i;
        this.B = -1;
        this.D = -1;
        androidx.constraintlayout.widget.d dVar = this.k;
        if (dVar != null) {
            dVar.d(i, i2, i3);
        }
    }

    public void M(int i, int i2) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.l0 == null) {
            this.l0 = new c();
        }
        this.l0.f(i);
        this.l0.d(i2);
    }

    public void N() {
        E(1.0f);
        this.m0 = null;
    }

    public void O(int i) {
        if (isAttachedToWindow()) {
            P(i, -1, -1);
            return;
        }
        if (this.l0 == null) {
            this.l0 = new c();
        }
        this.l0.d(i);
    }

    public void P(int i, int i2, int i3) {
        Q(i, i2, i3, -1);
    }

    public void Q(int i, int i2, int i3, int i4) {
        int i5 = this.C;
        if (i5 == i) {
            return;
        }
        if (this.B == i) {
            E(0.0f);
            if (i4 > 0) {
                this.H = i4 / 1000.0f;
                return;
            }
            return;
        }
        if (this.D == i) {
            E(1.0f);
            if (i4 > 0) {
                this.H = i4 / 1000.0f;
                return;
            }
            return;
        }
        this.D = i;
        if (i5 != -1) {
            M(i5, i);
            E(1.0f);
            this.J = 0.0f;
            N();
            if (i4 > 0) {
                this.H = i4 / 1000.0f;
                return;
            }
            return;
        }
        this.Q = false;
        this.L = 1.0f;
        this.I = 0.0f;
        this.J = 0.0f;
        this.K = getNanoTime();
        this.G = getNanoTime();
        this.M = false;
        this.y = null;
        if (i4 == -1) {
            throw null;
        }
        this.B = -1;
        throw null;
    }

    @Override // ax.c0.G
    public void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.S || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.S = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.d0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                h hVar = arrayList.get(i);
                i++;
                hVar.w(canvas);
            }
        }
        F(false);
        super.dispatchDraw(canvas);
    }

    @Override // ax.c0.F
    public boolean f(View view, View view2, int i, int i2) {
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
            this.l0 = new c();
        }
        this.l0.c();
        return this.l0.b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.H * 1000.0f);
    }

    public float getVelocity() {
        return this.A;
    }

    @Override // ax.c0.F
    public void h(View view, View view2, int i, int i2) {
        this.V = getNanoTime();
        this.W = 0.0f;
        this.T = 0.0f;
        this.U = 0.0f;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.p0 = display.getRotation();
        }
        I();
        c cVar = this.l0;
        if (cVar != null) {
            if (this.q0) {
                post(new a());
            } else {
                cVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.k0 = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } finally {
            this.k0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.e0 == null) {
                this.e0 = new CopyOnWriteArrayList<>();
            }
            this.e0.add(hVar);
            if (hVar.v()) {
                if (this.b0 == null) {
                    this.b0 = new ArrayList<>();
                }
                this.b0.add(hVar);
            }
            if (hVar.u()) {
                if (this.c0 == null) {
                    this.c0 = new ArrayList<>();
                }
                this.c0.add(hVar);
            }
            if (hVar.t()) {
                if (this.d0 == null) {
                    this.d0 = new ArrayList<>();
                }
                this.d0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.b0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.c0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.P = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.q0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.E = z;
    }

    public void setInterpolatedProgress(float f) {
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<h> arrayList = this.c0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.c0.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<h> arrayList = this.b0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.b0.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new c();
            }
            this.l0.e(f);
            return;
        }
        if (f <= 0.0f) {
            if (this.J == 1.0f && this.C == this.D) {
                setState(e.MOVING);
            }
            this.C = this.B;
            if (this.J == 0.0f) {
                setState(e.FINISHED);
                return;
            }
            return;
        }
        if (f < 1.0f) {
            this.C = -1;
            setState(e.MOVING);
            return;
        }
        if (this.J == 0.0f && this.C == this.B) {
            setState(e.MOVING);
        }
        this.C = this.D;
        if (this.J == 1.0f) {
            setState(e.FINISHED);
        }
    }

    public void setScene(l lVar) {
        r();
        throw null;
    }

    void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.C = i;
            return;
        }
        if (this.l0 == null) {
            this.l0 = new c();
        }
        this.l0.f(i);
        this.l0.d(i);
    }

    void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.C == -1) {
            return;
        }
        e eVar3 = this.r0;
        this.r0 = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            G();
        }
        int i = b.a[eVar3.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && eVar == eVar2) {
                H();
                return;
            }
            return;
        }
        if (eVar == eVar4) {
            G();
        }
        if (eVar == eVar2) {
            H();
        }
    }

    public void setTransition(int i) {
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.O = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.l0 == null) {
            this.l0 = new c();
        }
        this.l0.g(bundle);
        if (isAttachedToWindow()) {
            this.l0.a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void t(int i) {
        this.k = null;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return ax.K.a.a(context, this.B) + "->" + ax.K.a.a(context, this.D) + " (pos:" + this.J + " Dpos/Dt:" + this.A;
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }

    void I() {
    }

    void E(float f) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
    }

    @Override // ax.c0.F
    public void o(View view, int i) {
    }

    @Override // ax.c0.F
    public void p(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // ax.c0.F
    public void e(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
