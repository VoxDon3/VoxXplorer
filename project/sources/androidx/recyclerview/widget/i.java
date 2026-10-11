package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import ax.c0.C1760d0;
import ax.c0.C1788s;
import ax.h2.C2144b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i extends RecyclerView.o implements RecyclerView.r {
    private f A;
    private Rect C;
    private long D;
    float d;
    float e;
    private float f;
    private float g;
    float h;
    float i;
    private float j;
    private float k;
    e m;
    int o;
    private int q;
    RecyclerView r;
    VelocityTracker t;
    private List<RecyclerView.F> u;
    private List<Integer> v;
    C1788s z;
    final List<View> a = new ArrayList();
    private final float[] b = new float[2];
    RecyclerView.F c = null;
    int l = -1;
    private int n = 0;
    List<g> p = new ArrayList();
    final Runnable s = new a();
    private RecyclerView.k w = null;
    View x = null;
    int y = -1;
    private final RecyclerView.t B = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            if (iVar.c == null || !iVar.E()) {
                return;
            }
            i iVar2 = i.this;
            RecyclerView.F f = iVar2.c;
            if (f != null) {
                iVar2.z(f);
            }
            i iVar3 = i.this;
            iVar3.r.removeCallbacks(iVar3.s);
            C1760d0.d0(i.this.r, this);
        }
    }

    class b implements RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
            i.this.z.a(motionEvent);
            VelocityTracker velocityTracker = i.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (i.this.l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(i.this.l);
            if (findPointerIndex >= 0) {
                i.this.o(actionMasked, motionEvent, findPointerIndex);
            }
            i iVar = i.this;
            RecyclerView.F f = iVar.c;
            if (f == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        iVar.L(motionEvent, iVar.o, findPointerIndex);
                        i.this.z(f);
                        i iVar2 = i.this;
                        iVar2.r.removeCallbacks(iVar2.s);
                        i.this.s.run();
                        i.this.r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    i iVar3 = i.this;
                    if (pointerId == iVar3.l) {
                        iVar3.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        i iVar4 = i.this;
                        iVar4.L(motionEvent, iVar4.o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = iVar.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            i.this.F(null, 0);
            i.this.l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            g s;
            i.this.z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                i.this.l = motionEvent.getPointerId(0);
                i.this.d = motionEvent.getX();
                i.this.e = motionEvent.getY();
                i.this.A();
                i iVar = i.this;
                if (iVar.c == null && (s = iVar.s(motionEvent)) != null) {
                    i iVar2 = i.this;
                    iVar2.d -= s.j;
                    iVar2.e -= s.k;
                    iVar2.r(s.e, true);
                    if (i.this.a.remove(s.e.a)) {
                        i iVar3 = i.this;
                        iVar3.m.c(iVar3.r, s.e);
                    }
                    i.this.F(s.e, s.f);
                    i iVar4 = i.this;
                    iVar4.L(motionEvent, iVar4.o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                i iVar5 = i.this;
                iVar5.l = -1;
                iVar5.F(null, 0);
            } else {
                int i = i.this.l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    i.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = i.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return i.this.c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z) {
            if (z) {
                i.this.F(null, 0);
            }
        }
    }

    class c extends g {
        final /* synthetic */ int o;
        final /* synthetic */ RecyclerView.F p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.F f, int i, int i2, float f2, float f3, float f4, float f5, int i3, RecyclerView.F f6) {
            super(f, i, i2, f2, f3, f4, f5);
            this.o = i3;
            this.p = f6;
        }

        @Override // androidx.recyclerview.widget.i.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.l) {
                return;
            }
            if (this.o <= 0) {
                i iVar = i.this;
                iVar.m.c(iVar.r, this.p);
            } else {
                i.this.a.add(this.p.a);
                this.i = true;
                int i = this.o;
                if (i > 0) {
                    i.this.B(this, i);
                }
            }
            i iVar2 = i.this;
            View view = iVar2.x;
            View view2 = this.p.a;
            if (view == view2) {
                iVar2.D(view2);
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ int c0;
        final /* synthetic */ g q;

        d(g gVar, int i) {
            this.q = gVar;
            this.c0 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = i.this.r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.q;
            if (gVar.l || gVar.e.j() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = i.this.r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !i.this.x()) {
                i.this.m.B(this.q.e, this.c0);
            } else {
                i.this.r.post(this);
            }
        }
    }

    public static abstract class e {
        private static final Interpolator b = new a();
        private static final Interpolator c = new b();
        private int a = -1;

        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int e(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        private int i(RecyclerView recyclerView) {
            if (this.a == -1) {
                this.a = recyclerView.getResources().getDimensionPixelSize(C2144b.d);
            }
            return this.a;
        }

        public static int s(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int t(int i, int i2) {
            return s(2, i) | s(1, i2) | s(0, i2 | i);
        }

        public void A(RecyclerView.F f, int i) {
            if (f != null) {
                j.a.b(f.a);
            }
        }

        public abstract void B(RecyclerView.F f, int i);

        public boolean a(RecyclerView recyclerView, RecyclerView.F f, RecyclerView.F f2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.F b(RecyclerView.F f, List<RecyclerView.F> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = f.a.getWidth() + i;
            int height = i2 + f.a.getHeight();
            int left2 = i - f.a.getLeft();
            int top2 = i2 - f.a.getTop();
            int size = list.size();
            RecyclerView.F f2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.F f3 = list.get(i4);
                if (left2 > 0 && (right = f3.a.getRight() - width) < 0 && f3.a.getRight() > f.a.getRight() && (abs4 = Math.abs(right)) > i3) {
                    f2 = f3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = f3.a.getLeft() - i) > 0 && f3.a.getLeft() < f.a.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    f2 = f3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = f3.a.getTop() - i2) > 0 && f3.a.getTop() < f.a.getTop() && (abs2 = Math.abs(top)) > i3) {
                    f2 = f3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = f3.a.getBottom() - height) < 0 && f3.a.getBottom() > f.a.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    f2 = f3;
                    i3 = abs;
                }
            }
            return f2;
        }

        public void c(RecyclerView recyclerView, RecyclerView.F f) {
            j.a.a(f.a);
        }

        public int d(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        final int f(RecyclerView recyclerView, RecyclerView.F f) {
            return d(k(recyclerView, f), C1760d0.B(recyclerView));
        }

        public long g(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int h() {
            return 0;
        }

        public float j(RecyclerView.F f) {
            return 0.5f;
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.F f);

        public float l(float f) {
            return f;
        }

        public float m(RecyclerView.F f) {
            return 0.5f;
        }

        public float n(float f) {
            return f;
        }

        boolean o(RecyclerView recyclerView, RecyclerView.F f) {
            return (f(recyclerView, f) & 16711680) != 0;
        }

        public int p(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int signum = (int) (((int) (((int) Math.signum(i2)) * i(recyclerView) * c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
            return signum == 0 ? i2 > 0 ? 1 : -1 : signum;
        }

        public abstract boolean q();

        public abstract boolean r();

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f, float f2, float f3, int i, boolean z) {
            j.a.d(canvas, recyclerView, f.a, f2, f3, i, z);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.F f, float f2, float f3, int i, boolean z) {
            j.a.c(canvas, recyclerView, f.a, f2, f3, i, z);
        }

        void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f, List<g> list, int i, float f2, float f3) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = list.get(i2);
                gVar.e();
                int save = canvas.save();
                u(canvas, recyclerView, gVar.e, gVar.j, gVar.k, gVar.f, false);
                canvas.restoreToCount(save);
            }
            if (f != null) {
                int save2 = canvas.save();
                u(canvas, recyclerView, f, f2, f3, i, true);
                canvas.restoreToCount(save2);
            }
        }

        void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f, List<g> list, int i, float f2, float f3) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = list.get(i2);
                int save = canvas.save();
                v(canvas, recyclerView, gVar.e, gVar.j, gVar.k, gVar.f, false);
                canvas.restoreToCount(save);
            }
            if (f != null) {
                int save2 = canvas.save();
                v(canvas, recyclerView, f, f2, f3, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                g gVar2 = list.get(i3);
                boolean z2 = gVar2.m;
                if (z2 && !gVar2.i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.F f, RecyclerView.F f2);

        /* JADX WARN: Multi-variable type inference failed */
        public void z(RecyclerView recyclerView, RecyclerView.F f, int i, RecyclerView.F f2, int i2, int i3, int i4) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).d(f.a, f2.a, i3, i4);
                return;
            }
            if (layoutManager.q()) {
                if (layoutManager.W(f2.a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.w1(i2);
                }
                if (layoutManager.Z(f2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.w1(i2);
                }
            }
            if (layoutManager.r()) {
                if (layoutManager.a0(f2.a) <= recyclerView.getPaddingTop()) {
                    recyclerView.w1(i2);
                }
                if (layoutManager.U(f2.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.w1(i2);
                }
            }
        }
    }

    private class f extends GestureDetector.SimpleOnGestureListener {
        private boolean a = true;

        f() {
        }

        void a() {
            this.a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View t;
            RecyclerView.F m0;
            if (!this.a || (t = i.this.t(motionEvent)) == null || (m0 = i.this.r.m0(t)) == null) {
                return;
            }
            i iVar = i.this;
            if (iVar.m.o(iVar.r, m0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = i.this.l;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    i iVar2 = i.this;
                    iVar2.d = x;
                    iVar2.e = y;
                    iVar2.i = 0.0f;
                    iVar2.h = 0.0f;
                    if (iVar2.m.r()) {
                        i.this.F(m0, 2);
                    }
                }
            }
        }
    }

    static class g implements Animator.AnimatorListener {
        final float a;
        final float b;
        final float c;
        final float d;
        final RecyclerView.F e;
        final int f;
        final ValueAnimator g;
        final int h;
        boolean i;
        float j;
        float k;
        boolean l = false;
        boolean m = false;
        private float n;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        g(RecyclerView.F f, int i, int i2, float f2, float f3, float f4, float f5) {
            this.f = i2;
            this.h = i;
            this.e = f;
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.d = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(f.a);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.g.cancel();
        }

        public void b(long j) {
            this.g.setDuration(j);
        }

        public void c(float f) {
            this.n = f;
        }

        public void d() {
            this.e.H(false);
            this.g.start();
        }

        public void e() {
            float f = this.a;
            float f2 = this.c;
            if (f == f2) {
                this.j = this.e.a.getTranslationX();
            } else {
                this.j = f + (this.n * (f2 - f));
            }
            float f3 = this.b;
            float f4 = this.d;
            if (f3 == f4) {
                this.k = this.e.a.getTranslationY();
            } else {
                this.k = f3 + (this.n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.m) {
                this.e.H(true);
            }
            this.m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface h {
        void d(View view, View view2, int i, int i2);
    }

    public i(e eVar) {
        this.m = eVar;
    }

    private void C() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private void G() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.j(this);
        this.r.m(this.B);
        this.r.l(this);
        I();
    }

    private void I() {
        this.A = new f();
        this.z = new C1788s(this.r.getContext(), this.A);
    }

    private void J() {
        f fVar = this.A;
        if (fVar != null) {
            fVar.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    private int K(RecyclerView.F f2) {
        if (this.n == 2) {
            return 0;
        }
        int k = this.m.k(this.r, f2);
        int d2 = (this.m.d(k, C1760d0.B(this.r)) & 65280) >> 8;
        if (d2 == 0) {
            return 0;
        }
        int i = (k & 65280) >> 8;
        if (Math.abs(this.h) > Math.abs(this.i)) {
            int n = n(f2, d2);
            if (n > 0) {
                return (i & n) == 0 ? e.e(n, C1760d0.B(this.r)) : n;
            }
            int p = p(f2, d2);
            if (p > 0) {
                return p;
            }
        } else {
            int p2 = p(f2, d2);
            if (p2 > 0) {
                return p2;
            }
            int n2 = n(f2, d2);
            if (n2 > 0) {
                return (i & n2) == 0 ? e.e(n2, C1760d0.B(this.r)) : n2;
            }
        }
        return 0;
    }

    private void l() {
    }

    private int n(RecyclerView.F f2, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.m.n(this.g));
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.m.l(this.f) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.r.getWidth() * this.m.m(f2);
        if ((i & i2) == 0 || Math.abs(this.h) <= width) {
            return 0;
        }
        return i2;
    }

    private int p(RecyclerView.F f2, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.m.n(this.g));
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.m.l(this.f) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.r.getHeight() * this.m.m(f2);
        if ((i & i2) == 0 || Math.abs(this.i) <= height) {
            return 0;
        }
        return i2;
    }

    private void q() {
        this.r.k1(this);
        this.r.m1(this.B);
        this.r.l1(this);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            g gVar = this.p.get(0);
            gVar.a();
            this.m.c(this.r, gVar.e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        C();
        J();
    }

    private List<RecyclerView.F> u(RecyclerView.F f2) {
        RecyclerView.F f3 = f2;
        List<RecyclerView.F> list = this.u;
        if (list == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        } else {
            list.clear();
            this.v.clear();
        }
        int h2 = this.m.h();
        int round = Math.round(this.j + this.h) - h2;
        int round2 = Math.round(this.k + this.i) - h2;
        int i = h2 * 2;
        int width = f3.a.getWidth() + round + i;
        int height = f3.a.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.p layoutManager = this.r.getLayoutManager();
        int P = layoutManager.P();
        int i4 = 0;
        while (i4 < P) {
            View O = layoutManager.O(i4);
            if (O != f3.a && O.getBottom() >= round2 && O.getTop() <= height && O.getRight() >= round && O.getLeft() <= width) {
                RecyclerView.F m0 = this.r.m0(O);
                if (this.m.a(this.r, this.c, m0)) {
                    int abs = Math.abs(i2 - ((O.getLeft() + O.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((O.getTop() + O.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.u.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.v.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.u.add(i6, m0);
                    this.v.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            f3 = f2;
        }
        return this.u;
    }

    private RecyclerView.F v(MotionEvent motionEvent) {
        View t;
        RecyclerView.p layoutManager = this.r.getLayoutManager();
        int i = this.l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(findPointerIndex) - this.d;
        float y = motionEvent.getY(findPointerIndex) - this.e;
        float abs = Math.abs(x);
        float abs2 = Math.abs(y);
        int i2 = this.q;
        if (abs < i2 && abs2 < i2) {
            return null;
        }
        if (abs > abs2 && layoutManager.q()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.r()) && (t = t(motionEvent)) != null) {
            return this.r.m0(t);
        }
        return null;
    }

    private void w(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    private static boolean y(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    void A() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    void B(g gVar, int i) {
        this.r.post(new d(gVar, i));
    }

    void D(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r6 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r6 > 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean E() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.E():boolean");
    }

    void F(RecyclerView.F f2, int i) {
        boolean z;
        boolean z2;
        float signum;
        float f3;
        if (f2 == this.c && i == this.n) {
            return;
        }
        this.D = Long.MIN_VALUE;
        int i2 = this.n;
        r(f2, true);
        this.n = i;
        if (i == 2) {
            if (f2 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.x = f2.a;
            l();
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        RecyclerView.F f4 = this.c;
        if (f4 != null) {
            if (f4.a.getParent() != null) {
                int K = i2 == 2 ? 0 : K(f4);
                C();
                int i4 = 4;
                if (K == 1 || K == 2) {
                    signum = Math.signum(this.i) * this.r.getHeight();
                    f3 = 0.0f;
                } else {
                    f3 = (K == 4 || K == 8 || K == 16 || K == 32) ? Math.signum(this.h) * this.r.getWidth() : 0.0f;
                    signum = 0.0f;
                }
                if (i2 == 2) {
                    i4 = 8;
                } else if (K > 0) {
                    i4 = 2;
                }
                w(this.b);
                float[] fArr = this.b;
                float f5 = fArr[0];
                float f6 = fArr[1];
                z = false;
                c cVar = new c(f4, i4, i2, f5, f6, f3, signum, K, f4);
                cVar.b(this.m.g(this.r, i4, f3 - f5, signum - f6));
                this.p.add(cVar);
                cVar.d();
                z2 = true;
            } else {
                z = false;
                D(f4.a);
                this.m.c(this.r, f4);
                z2 = false;
            }
            this.c = null;
        } else {
            z = false;
            z2 = false;
        }
        if (f2 != null) {
            this.o = (this.m.f(this.r, f2) & i3) >> (this.n * 8);
            this.j = f2.a.getLeft();
            this.k = f2.a.getTop();
            this.c = f2;
            if (i == 2) {
                f2.a.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.r.getParent();
        if (parent != null) {
            if (this.c != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.r.getLayoutManager().z1();
        }
        this.m.A(this.c, this.n);
        this.r.invalidate();
    }

    public void H(RecyclerView.F f2) {
        if (!this.m.o(this.r, f2)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (f2.a.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        A();
        this.i = 0.0f;
        this.h = 0.0f;
        F(f2, 2);
    }

    void L(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f2 = x - this.d;
        this.h = f2;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = Math.max(0.0f, f2);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(View view) {
        D(view);
        RecyclerView.F m0 = this.r.m0(view);
        if (m0 == null) {
            return;
        }
        RecyclerView.F f2 = this.c;
        if (f2 != null && m0 == f2) {
            F(null, 0);
            return;
        }
        r(m0, false);
        if (this.a.remove(m0.a)) {
            this.m.c(this.r, m0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b2) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b2) {
        float f2;
        float f3;
        this.y = -1;
        if (this.c != null) {
            w(this.b);
            float[] fArr = this.b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.w(canvas, recyclerView, this.c, this.p, this.n, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b2) {
        float f2;
        float f3;
        if (this.c != null) {
            w(this.b);
            float[] fArr = this.b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.x(canvas, recyclerView, this.c, this.p, this.n, f2, f3);
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(C2144b.f);
            this.g = resources.getDimension(C2144b.e);
            G();
        }
    }

    void o(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.F v;
        int f2;
        if (this.c != null || i != 2 || this.n == 2 || !this.m.q() || this.r.getScrollState() == 1 || (v = v(motionEvent)) == null || (f2 = (this.m.f(this.r, v) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f3 = x - this.d;
        float f4 = y - this.e;
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        int i3 = this.q;
        if (abs >= i3 || abs2 >= i3) {
            if (abs > abs2) {
                if (f3 < 0.0f && (f2 & 4) == 0) {
                    return;
                }
                if (f3 > 0.0f && (f2 & 8) == 0) {
                    return;
                }
            } else {
                if (f4 < 0.0f && (f2 & 1) == 0) {
                    return;
                }
                if (f4 > 0.0f && (f2 & 2) == 0) {
                    return;
                }
            }
            this.i = 0.0f;
            this.h = 0.0f;
            this.l = motionEvent.getPointerId(0);
            F(v, 1);
        }
    }

    void r(RecyclerView.F f2, boolean z) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            g gVar = this.p.get(size);
            if (gVar.e == f2) {
                gVar.l |= z;
                if (!gVar.m) {
                    gVar.a();
                }
                this.p.remove(size);
                return;
            }
        }
    }

    g s(MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        View t = t(motionEvent);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            g gVar = this.p.get(size);
            if (gVar.e.a == t) {
                return gVar;
            }
        }
        return null;
    }

    View t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.F f2 = this.c;
        if (f2 != null) {
            View view = f2.a;
            if (y(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            g gVar = this.p.get(size);
            View view2 = gVar.e.a;
            if (y(view2, x, y, gVar.j, gVar.k)) {
                return view2;
            }
        }
        return this.r.X(x, y);
    }

    boolean x() {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (!this.p.get(i).m) {
                return true;
            }
        }
        return false;
    }

    void z(RecyclerView.F f2) {
        if (!this.r.isLayoutRequested() && this.n == 2) {
            float j = this.m.j(f2);
            int i = (int) (this.j + this.h);
            int i2 = (int) (this.k + this.i);
            if (Math.abs(i2 - f2.a.getTop()) >= f2.a.getHeight() * j || Math.abs(i - f2.a.getLeft()) >= f2.a.getWidth() * j) {
                List<RecyclerView.F> u = u(f2);
                if (u.size() == 0) {
                    return;
                }
                RecyclerView.F b2 = this.m.b(f2, u, i, i2);
                if (b2 == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                int j2 = b2.j();
                int j3 = f2.j();
                if (this.m.y(this.r, f2, b2)) {
                    this.m.z(this.r, f2, j3, b2, j2, i, i2);
                }
            }
        }
    }
}
