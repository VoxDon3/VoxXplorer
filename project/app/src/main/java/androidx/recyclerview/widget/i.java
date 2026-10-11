/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ax.c0.d0;
import ax.c0.s;
import ax.h2.b;
import java.util.ArrayList;
import java.util.List;

public class i
extends RecyclerView.o
implements RecyclerView.r {
    private f A;
    private final RecyclerView.t B;
    private Rect C;
    private long D;
    final List<View> a = new ArrayList<View>();
    private final float[] b = new float[2];
    RecyclerView.F c = null;
    float d;
    float e;
    private float f;
    private float g;
    float h;
    float i;
    private float j;
    private float k;
    int l = -1;
    e m;
    private int n = 0;
    int o;
    List<g> p = new ArrayList<g>();
    private int q;
    RecyclerView r;
    final Runnable s = new Runnable(this){
        final i q;
        {
            this.q = i8;
        }

        @Override
        public void run() {
            Object object = this.q;
            if (((i)object).c != null && ((i)object).E()) {
                i i8 = this.q;
                object = i8.c;
                if (object != null) {
                    i8.z((RecyclerView.F)object);
                }
                object = this.q;
                ((i)object).r.removeCallbacks(((i)object).s);
                d0.d0((View)this.q.r, this);
            }
        }
    };
    VelocityTracker t;
    private List<RecyclerView.F> u;
    private List<Integer> v;
    private RecyclerView.k w = null;
    View x = null;
    int y = -1;
    s z;

    public i(e e8) {
        this.B = new RecyclerView.t(this){
            final i a;
            {
                this.a = i8;
            }

            @Override
            public void b(RecyclerView object, MotionEvent motionEvent) {
                block8: {
                    block7: {
                        RecyclerView.F f8;
                        int n8;
                        block9: {
                            block10: {
                                this.a.z.a(motionEvent);
                                object = this.a.t;
                                if (object != null) {
                                    object.addMovement(motionEvent);
                                }
                                if (this.a.l == -1) break block7;
                                int n9 = motionEvent.getActionMasked();
                                n8 = motionEvent.findPointerIndex(this.a.l);
                                if (n8 >= 0) {
                                    this.a.o(n9, motionEvent, n8);
                                }
                                object = this.a;
                                f8 = ((i)object).c;
                                if (f8 == null) break block7;
                                int n10 = 0;
                                if (n9 == 1) break block8;
                                if (n9 == 2) break block9;
                                if (n9 == 3) break block10;
                                if (n9 == 6) {
                                    n8 = motionEvent.getActionIndex();
                                    n9 = motionEvent.getPointerId(n8);
                                    object = this.a;
                                    if (n9 == ((i)object).l) {
                                        if (n8 == 0) {
                                            n10 = 1;
                                        }
                                        ((i)object).l = motionEvent.getPointerId(n10);
                                        object = this.a;
                                        ((i)object).L(motionEvent, ((i)object).o, n8);
                                        return;
                                    }
                                }
                                break block7;
                            }
                            object = ((i)object).t;
                            if (object != null) {
                                object.clear();
                            }
                            break block8;
                        }
                        if (n8 >= 0) {
                            ((i)object).L(motionEvent, ((i)object).o, n8);
                            this.a.z(f8);
                            object = this.a;
                            ((i)object).r.removeCallbacks(((i)object).s);
                            this.a.s.run();
                            this.a.r.invalidate();
                        }
                    }
                    return;
                }
                this.a.F(null, 0);
                this.a.l = -1;
            }

            @Override
            public boolean c(RecyclerView object, MotionEvent motionEvent) {
                this.a.z.a(motionEvent);
                int n8 = motionEvent.getActionMasked();
                if (n8 == 0) {
                    this.a.l = motionEvent.getPointerId(0);
                    this.a.d = motionEvent.getX();
                    this.a.e = motionEvent.getY();
                    this.a.A();
                    object = this.a;
                    if (((i)object).c == null && (object = ((i)object).s(motionEvent)) != null) {
                        i i8 = this.a;
                        i8.d -= ((g)object).j;
                        i8.e -= ((g)object).k;
                        i8.r(((g)object).e, true);
                        if (this.a.a.remove(((g)object).e.a)) {
                            i8 = this.a;
                            i8.m.c(i8.r, ((g)object).e);
                        }
                        this.a.F(((g)object).e, ((g)object).f);
                        object = this.a;
                        ((i)object).L(motionEvent, ((i)object).o, 0);
                    }
                } else if (n8 != 3 && n8 != 1) {
                    int n9 = this.a.l;
                    if (n9 != -1 && (n9 = motionEvent.findPointerIndex(n9)) >= 0) {
                        this.a.o(n8, motionEvent, n9);
                    }
                } else {
                    object = this.a;
                    ((i)object).l = -1;
                    ((i)object).F(null, 0);
                }
                if ((object = this.a.t) != null) {
                    object.addMovement(motionEvent);
                }
                return this.a.c != null;
            }

            @Override
            public void e(boolean bl) {
                if (!bl) {
                    return;
                }
                this.a.F(null, 0);
            }
        };
        this.m = e8;
    }

    private void C() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private void G() {
        this.q = ViewConfiguration.get((Context)this.r.getContext()).getScaledTouchSlop();
        this.r.j(this);
        this.r.m(this.B);
        this.r.l(this);
        this.I();
    }

    private void I() {
        this.A = new f(this);
        this.z = new s(this.r.getContext(), (GestureDetector.OnGestureListener)this.A);
    }

    private void J() {
        f f8 = this.A;
        if (f8 != null) {
            f8.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    private int K(RecyclerView.F f8) {
        if (this.n == 2) {
            return 0;
        }
        int n8 = this.m.k(this.r, f8);
        int n9 = (this.m.d(n8, d0.B((View)this.r)) & 0xFF00) >> 8;
        if (n9 == 0) {
            return 0;
        }
        int n10 = (n8 & 0xFF00) >> 8;
        if (Math.abs(this.h) > Math.abs(this.i)) {
            n8 = this.n(f8, n9);
            if (n8 > 0) {
                if ((n10 & n8) == 0) {
                    return androidx.recyclerview.widget.i$e.e(n8, d0.B((View)this.r));
                }
                return n8;
            }
            if ((n9 = this.p(f8, n9)) > 0) {
                return n9;
            }
        } else {
            n8 = this.p(f8, n9);
            if (n8 > 0) {
                return n8;
            }
            n8 = this.n(f8, n9);
            if (n8 > 0) {
                n9 = n8;
                if ((n10 & n8) == 0) {
                    n9 = androidx.recyclerview.widget.i$e.e(n8, d0.B((View)this.r));
                }
                return n9;
            }
        }
        return 0;
    }

    private void l() {
    }

    private int n(RecyclerView.F f8, int n8) {
        if ((n8 & 0xC) != 0) {
            float f9;
            float f10 = this.h;
            int n9 = 4;
            int n10 = f10 > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.m.n(this.g));
                f9 = this.t.getXVelocity(this.l);
                f10 = this.t.getYVelocity(this.l);
                if (f9 > 0.0f) {
                    n9 = 8;
                }
                f9 = Math.abs(f9);
                if ((n9 & n8) != 0 && n10 == n9 && f9 >= this.m.l(this.f) && f9 > Math.abs(f10)) {
                    return n9;
                }
            }
            f9 = this.r.getWidth();
            f10 = this.m.m(f8);
            if ((n8 & n10) != 0 && Math.abs(this.h) > f9 * f10) {
                return n10;
            }
        }
        return 0;
    }

    private int p(RecyclerView.F f8, int n8) {
        if ((n8 & 3) != 0) {
            float f9;
            float f10 = this.i;
            int n9 = 1;
            int n10 = f10 > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.m.n(this.g));
                f10 = this.t.getXVelocity(this.l);
                f9 = this.t.getYVelocity(this.l);
                if (f9 > 0.0f) {
                    n9 = 2;
                }
                f9 = Math.abs(f9);
                if ((n9 & n8) != 0 && n9 == n10 && f9 >= this.m.l(this.f) && f9 > Math.abs(f10)) {
                    return n9;
                }
            }
            f9 = this.r.getHeight();
            f10 = this.m.m(f8);
            if ((n8 & n10) != 0 && Math.abs(this.i) > f9 * f10) {
                return n10;
            }
        }
        return 0;
    }

    private void q() {
        this.r.k1(this);
        this.r.m1(this.B);
        this.r.l1(this);
        for (int i8 = this.p.size() - 1; i8 >= 0; --i8) {
            g g8 = this.p.get(0);
            g8.a();
            this.m.c(this.r, g8.e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        this.C();
        this.J();
    }

    private List<RecyclerView.F> u(RecyclerView.F f8) {
        List<RecyclerView.F> list = this.u;
        if (list == null) {
            this.u = new ArrayList<RecyclerView.F>();
            this.v = new ArrayList<Integer>();
        } else {
            list.clear();
            this.v.clear();
        }
        int n8 = this.m.h();
        int n9 = Math.round(this.j + this.h) - n8;
        int n10 = Math.round(this.k + this.i) - n8;
        int n11 = f8.a.getWidth();
        int n12 = n11 + n9 + (n8 *= 2);
        int n13 = f8.a.getHeight() + n10 + n8;
        int n14 = (n9 + n12) / 2;
        int n15 = (n10 + n13) / 2;
        RecyclerView.p p8 = this.r.getLayoutManager();
        int n16 = p8.P();
        for (n8 = 0; n8 < n16; ++n8) {
            View view = p8.O(n8);
            if (view == f8.a || view.getBottom() < n10 || view.getTop() > n13 || view.getRight() < n9 || view.getLeft() > n12 || !this.m.a(this.r, this.c, (RecyclerView.F)((Object)(list = this.r.m0(view))))) continue;
            int n17 = Math.abs(n14 - (view.getLeft() + view.getRight()) / 2);
            n11 = Math.abs(n15 - (view.getTop() + view.getBottom()) / 2);
            int n18 = n17 * n17 + n11 * n11;
            int n19 = this.u.size();
            n17 = 0;
            for (n11 = 0; n11 < n19 && n18 > this.v.get(n11); ++n11) {
                ++n17;
            }
            this.u.add(n17, (RecyclerView.F)((Object)list));
            this.v.add(n17, n18);
        }
        return this.u;
    }

    private RecyclerView.F v(MotionEvent motionEvent) {
        RecyclerView.p p8 = this.r.getLayoutManager();
        int n8 = this.l;
        if (n8 == -1) {
            return null;
        }
        n8 = motionEvent.findPointerIndex(n8);
        float f8 = motionEvent.getX(n8);
        float f9 = this.d;
        float f10 = motionEvent.getY(n8);
        float f11 = this.e;
        f8 = Math.abs(f8 - f9);
        f10 = Math.abs(f10 - f11);
        n8 = this.q;
        if (f8 < (float)n8 && f10 < (float)n8) {
            return null;
        }
        if (f8 > f10 && p8.q()) {
            return null;
        }
        if (f10 > f8 && p8.r()) {
            return null;
        }
        if ((motionEvent = this.t(motionEvent)) == null) {
            return null;
        }
        return this.r.m0((View)motionEvent);
    }

    private void w(float[] fArray) {
        fArray[0] = (this.o & 0xC) != 0 ? this.j + this.h - (float)this.c.a.getLeft() : this.c.a.getTranslationX();
        if ((this.o & 3) != 0) {
            fArray[1] = this.k + this.i - (float)this.c.a.getTop();
            return;
        }
        fArray[1] = this.c.a.getTranslationY();
    }

    private static boolean y(View view, float f8, float f9, float f10, float f11) {
        return f8 >= f10 && f8 <= f10 + (float)view.getWidth() && f9 >= f11 && f9 <= f11 + (float)view.getHeight();
    }

    void A() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    void B(g g8, int n8) {
        this.r.post(new Runnable(this, g8, n8){
            final int c0;
            final i d0;
            final g q;
            {
                this.d0 = i8;
                this.q = g8;
                this.c0 = n8;
            }

            @Override
            public void run() {
                Object object = this.d0.r;
                if (object != null && ((RecyclerView)object).isAttachedToWindow()) {
                    object = this.q;
                    if (!((g)object).l && ((g)object).e.j() != -1) {
                        object = this.d0.r.getItemAnimator();
                        if (!(object != null && ((RecyclerView.m)object).q(null) || this.d0.x())) {
                            this.d0.m.B(this.q.e, this.c0);
                            return;
                        }
                        this.d0.r.post(this);
                    }
                }
            }
        });
    }

    void D(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    boolean E() {
        block13: {
            block12: {
                if (this.c == null) {
                    this.D = -9223372036854775808L;
                    return false;
                }
                var7_1 = System.currentTimeMillis();
                var5_2 = this.D;
                var5_2 = var5_2 == -9223372036854775808L ? 0L : var7_1 - var5_2;
                var9_3 = this.r.getLayoutManager();
                if (this.C == null) {
                    this.C = new Rect();
                }
                var9_3.p(this.c.a, this.C);
                if (!var9_3.q()) ** GOTO lbl20
                var3_4 = (int)(this.j + this.h);
                var2_5 = var3_4 - this.C.left - this.r.getPaddingLeft();
                var1_6 = this.h;
                if (var1_6 < 0.0f && var2_5 < 0) {
                    while (true) {
                        var3_4 = var2_5;
                        break;
                    }
                } else {
                    if (var1_6 > 0.0f && (var2_5 = var3_4 + this.c.a.getWidth() + this.C.right - (this.r.getWidth() - this.r.getPaddingRight())) > 0) ** continue;
lbl20:
                    // 2 sources

                    var3_4 = 0;
                }
                if (!var9_3.r()) break block12;
                var4_7 = (int)(this.k + this.i);
                var2_5 = var4_7 - this.C.top - this.r.getPaddingTop();
                var1_6 = this.i;
                if (var1_6 < 0.0f && var2_5 < 0 || var1_6 > 0.0f && (var2_5 = var4_7 + this.c.a.getHeight() + this.C.bottom - (this.r.getHeight() - this.r.getPaddingBottom())) > 0) break block13;
            }
            var2_5 = 0;
        }
        var4_7 = var3_4;
        if (var3_4 != 0) {
            var4_7 = this.m.p(this.r, this.c.a.getWidth(), var3_4, this.r.getWidth(), var5_2);
        }
        if (var2_5 != 0) {
            var2_5 = this.m.p(this.r, this.c.a.getHeight(), var2_5, this.r.getHeight(), var5_2);
        }
        if (var4_7 == 0 && var2_5 == 0) {
            this.D = -9223372036854775808L;
            return false;
        }
        if (this.D == -9223372036854775808L) {
            this.D = var7_1;
        }
        this.r.scrollBy(var4_7, var2_5);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    void F(RecyclerView.F f8, int n8) {
        int n9;
        Object object;
        if (f8 == this.c && n8 == this.n) {
            return;
        }
        this.D = Long.MIN_VALUE;
        int n10 = this.n;
        this.r(f8, true);
        this.n = n8;
        if (n8 == 2) {
            if (f8 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.x = f8.a;
            this.l();
        }
        if ((object = this.c) != null) {
            if (((RecyclerView.F)object).a.getParent() != null) {
                float f9;
                float f10;
                int n11 = n10 == 2 ? 0 : this.K((RecyclerView.F)object);
                this.C();
                n9 = 4;
                if (n11 != 1 && n11 != 2) {
                    f10 = n11 != 4 && n11 != 8 && n11 != 16 && n11 != 32 ? 0.0f : Math.signum(this.h) * (float)this.r.getWidth();
                    f9 = 0.0f;
                } else {
                    f9 = Math.signum(this.i) * (float)this.r.getHeight();
                    f10 = 0.0f;
                }
                if (n10 == 2) {
                    n9 = 8;
                } else if (n11 > 0) {
                    n9 = 2;
                }
                this.w(this.b);
                float[] fArray = this.b;
                float f11 = fArray[0];
                float f12 = fArray[1];
                object = new g(this, (RecyclerView.F)object, n9, n10, f11, f12, f10, f9, n11, (RecyclerView.F)object){
                    final int o;
                    final RecyclerView.F p;
                    final i q;
                    {
                        this.q = i8;
                        this.o = n10;
                        this.p = f13;
                        super(f8, n8, n9, f9, f10, f11, f12);
                    }

                    @Override
                    public void onAnimationEnd(Animator object) {
                        super.onAnimationEnd((Animator)object);
                        if (!this.l) {
                            if (this.o <= 0) {
                                object = this.q;
                                object.m.c(object.r, this.p);
                            } else {
                                this.q.a.add(this.p.a);
                                this.i = true;
                                int n8 = this.o;
                                if (n8 > 0) {
                                    this.q.B(this, n8);
                                }
                            }
                            i i8 = this.q;
                            View view = i8.x;
                            object = this.p.a;
                            if (view == object) {
                                i8.D((View)object);
                            }
                        }
                    }
                };
                ((g)object).b(this.m.g(this.r, n9, f10 - f11, f9 - f12));
                this.p.add((g)object);
                ((g)object).d();
                n9 = 1;
            } else {
                this.D(((RecyclerView.F)object).a);
                this.m.c(this.r, (RecyclerView.F)object);
                n9 = 0;
            }
            this.c = null;
        } else {
            n9 = 0;
        }
        boolean bl = false;
        if (f8 != null) {
            this.o = (this.m.f(this.r, f8) & (1 << n8 * 8 + 8) - 1) >> this.n * 8;
            this.j = f8.a.getLeft();
            this.k = f8.a.getTop();
            this.c = f8;
            if (n8 == 2) {
                f8.a.performHapticFeedback(0);
            }
        }
        if ((f8 = this.r.getParent()) != null) {
            if (this.c != null) {
                bl = true;
            }
            f8.requestDisallowInterceptTouchEvent(bl);
        }
        if (n9 == 0) {
            this.r.getLayoutManager().z1();
        }
        this.m.A(this.c, this.n);
        this.r.invalidate();
    }

    public void H(RecyclerView.F f8) {
        if (!this.m.o(this.r, f8)) {
            Log.e((String)"ItemTouchHelper", (String)"Start drag has been called but dragging is not enabled");
            return;
        }
        if (f8.a.getParent() != this.r) {
            Log.e((String)"ItemTouchHelper", (String)"Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        this.A();
        this.i = 0.0f;
        this.h = 0.0f;
        this.F(f8, 2);
    }

    void L(MotionEvent motionEvent, int n8, int n9) {
        float f8 = motionEvent.getX(n9);
        float f9 = motionEvent.getY(n9);
        this.h = f8 -= this.d;
        this.i = f9 - this.e;
        if ((n8 & 4) == 0) {
            this.h = Math.max(0.0f, f8);
        }
        if ((n8 & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((n8 & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((n8 & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override
    public void a(View object) {
        this.D((View)object);
        object = this.r.m0((View)object);
        if (object != null) {
            RecyclerView.F f8 = this.c;
            if (f8 != null && object == f8) {
                this.F(null, 0);
                return;
            }
            this.r((RecyclerView.F)object, false);
            if (this.a.remove(object.a)) {
                this.m.c(this.r, (RecyclerView.F)object);
            }
        }
    }

    @Override
    public void d(View view) {
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b8) {
        rect.setEmpty();
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B object) {
        Object object2;
        Object object3;
        this.y = -1;
        if (this.c != null) {
            this.w(this.b);
            object = this.b;
            object3 = object[0];
            object2 = object[1];
        } else {
            object3 = 0.0f;
            object2 = 0.0f;
        }
        this.m.w(canvas, recyclerView, this.c, this.p, this.n, (float)object3, (float)object2);
    }

    @Override
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B object) {
        Object object2;
        Object object3;
        if (this.c != null) {
            this.w(this.b);
            object = this.b;
            object3 = object[0];
            object2 = object[1];
        } else {
            object3 = 0.0f;
            object2 = 0.0f;
        }
        this.m.x(canvas, recyclerView, this.c, this.p, this.n, (float)object3, (float)object2);
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                this.q();
            }
            this.r = recyclerView;
            if (recyclerView != null) {
                recyclerView = recyclerView.getResources();
                this.f = recyclerView.getDimension(ax.h2.b.f);
                this.g = recyclerView.getDimension(ax.h2.b.e);
                this.G();
            }
        }
    }

    void o(int n8, MotionEvent motionEvent, int n9) {
        RecyclerView.F f8;
        if (this.c == null && n8 == 2 && this.n != 2 && this.m.q() && this.r.getScrollState() != 1 && (f8 = this.v(motionEvent)) != null && (n8 = (this.m.f(this.r, f8) & 0xFF00) >> 8) != 0) {
            float f9 = motionEvent.getX(n9);
            float f10 = motionEvent.getY(n9);
            float f11 = Math.abs(f9 -= this.d);
            float f12 = Math.abs(f10 -= this.e);
            n9 = this.q;
            if (!(f11 < (float)n9 && f12 < (float)n9 || (f11 > f12 ? f9 < 0.0f && (n8 & 4) == 0 || f9 > 0.0f && (n8 & 8) == 0 : f10 < 0.0f && (n8 & 1) == 0 || f10 > 0.0f && (n8 & 2) == 0))) {
                this.i = 0.0f;
                this.h = 0.0f;
                this.l = motionEvent.getPointerId(0);
                this.F(f8, 1);
            }
        }
    }

    void r(RecyclerView.F f8, boolean bl) {
        for (int i8 = this.p.size() - 1; i8 >= 0; --i8) {
            g g8 = this.p.get(i8);
            if (g8.e != f8) continue;
            g8.l |= bl;
            if (!g8.m) {
                g8.a();
            }
            this.p.remove(i8);
            return;
        }
    }

    g s(MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        motionEvent = this.t(motionEvent);
        for (int i8 = this.p.size() - 1; i8 >= 0; --i8) {
            g g8 = this.p.get(i8);
            if (g8.e.a != motionEvent) continue;
            return g8;
        }
        return null;
    }

    View t(MotionEvent object) {
        float f8 = object.getX();
        float f9 = object.getY();
        object = this.c;
        if (object != null && androidx.recyclerview.widget.i.y((View)(object = object.a), f8, f9, this.j + this.h, this.k + this.i)) {
            return object;
        }
        for (int i8 = this.p.size() - 1; i8 >= 0; --i8) {
            g g8 = this.p.get(i8);
            object = g8.e.a;
            if (!androidx.recyclerview.widget.i.y((View)object, f8, f9, g8.j, g8.k)) continue;
            return object;
        }
        return this.r.X(f8, f9);
    }

    boolean x() {
        int n8 = this.p.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.p.get((int)i8).m) continue;
            return true;
        }
        return false;
    }

    void z(RecyclerView.F f8) {
        if (!this.r.isLayoutRequested() && this.n == 2) {
            Object object;
            float f9 = this.m.j(f8);
            int n8 = (int)(this.j + this.h);
            int n9 = (int)(this.k + this.i);
            if (!((float)Math.abs(n9 - f8.a.getTop()) < (float)f8.a.getHeight() * f9 && (float)Math.abs(n8 - f8.a.getLeft()) < (float)f8.a.getWidth() * f9 || (object = this.u(f8)).size() == 0)) {
                if ((object = this.m.b(f8, (List<RecyclerView.F>)object, n8, n9)) == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                int n10 = ((RecyclerView.F)object).j();
                int n11 = f8.j();
                if (this.m.y(this.r, f8, (RecyclerView.F)object)) {
                    this.m.z(this.r, f8, n11, (RecyclerView.F)object, n10, n8, n9);
                }
            }
        }
    }

    public static abstract class e {
        private static final Interpolator b = new Interpolator(){

            public float getInterpolation(float f8) {
                return f8 * f8 * f8 * f8 * f8;
            }
        };
        private static final Interpolator c = new Interpolator(){

            public float getInterpolation(float f8) {
                return (f8 -= 1.0f) * f8 * f8 * f8 * f8 + 1.0f;
            }
        };
        private int a = -1;

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static int e(int n8, int n9) {
            int n10 = n8 & 0xC0C0C;
            if (n10 == 0) {
                return n8;
            }
            int n11 = n8 & ~n10;
            if (n9 == 0) {
                n8 = n10 << 2;
                n9 = n11;
                return n9 | n8;
            }
            n8 = n10 << 1;
            n9 = n11 | 0xFFF3F3F3 & n8;
            n8 = (n8 & 0xC0C0C) << 2;
            return n9 | n8;
        }

        private int i(RecyclerView recyclerView) {
            if (this.a == -1) {
                this.a = recyclerView.getResources().getDimensionPixelSize(ax.h2.b.d);
            }
            return this.a;
        }

        public static int s(int n8, int n9) {
            return n9 << n8 * 8;
        }

        public static int t(int n8, int n9) {
            int n10 = androidx.recyclerview.widget.i$e.s(0, n9 | n8);
            n9 = androidx.recyclerview.widget.i$e.s(1, n9);
            return androidx.recyclerview.widget.i$e.s(2, n8) | (n9 | n10);
        }

        public void A(RecyclerView.F f8, int n8) {
            if (f8 != null) {
                androidx.recyclerview.widget.j.a.b(f8.a);
            }
        }

        public abstract void B(RecyclerView.F var1, int var2);

        public boolean a(RecyclerView recyclerView, RecyclerView.F f8, RecyclerView.F f9) {
            return true;
        }

        @SuppressLint(value={"UnknownNullness"})
        public RecyclerView.F b(RecyclerView.F f8, List<RecyclerView.F> list, int n8, int n9) {
            int n10 = f8.a.getWidth();
            int n11 = f8.a.getHeight();
            int n12 = n8 - f8.a.getLeft();
            int n13 = n9 - f8.a.getTop();
            int n14 = list.size();
            RecyclerView.F f9 = null;
            int n15 = -1;
            for (int i8 = 0; i8 < n14; ++i8) {
                int n16;
                RecyclerView.F f10 = list.get(i8);
                RecyclerView.F f11 = f9;
                int n17 = n15;
                if (n12 > 0) {
                    n16 = f10.a.getRight() - (n10 + n8);
                    f11 = f9;
                    n17 = n15;
                    if (n16 < 0) {
                        f11 = f9;
                        n17 = n15;
                        if (f10.a.getRight() > f8.a.getRight()) {
                            n16 = Math.abs(n16);
                            f11 = f9;
                            n17 = n15;
                            if (n16 > n15) {
                                f11 = f10;
                                n17 = n16;
                            }
                        }
                    }
                }
                f9 = f11;
                n15 = n17;
                if (n12 < 0) {
                    n16 = f10.a.getLeft() - n8;
                    f9 = f11;
                    n15 = n17;
                    if (n16 > 0) {
                        f9 = f11;
                        n15 = n17;
                        if (f10.a.getLeft() < f8.a.getLeft()) {
                            n16 = Math.abs(n16);
                            f9 = f11;
                            n15 = n17;
                            if (n16 > n17) {
                                f9 = f10;
                                n15 = n16;
                            }
                        }
                    }
                }
                f11 = f9;
                n17 = n15;
                if (n13 < 0) {
                    n16 = f10.a.getTop() - n9;
                    f11 = f9;
                    n17 = n15;
                    if (n16 > 0) {
                        f11 = f9;
                        n17 = n15;
                        if (f10.a.getTop() < f8.a.getTop()) {
                            n16 = Math.abs(n16);
                            f11 = f9;
                            n17 = n15;
                            if (n16 > n15) {
                                f11 = f10;
                                n17 = n16;
                            }
                        }
                    }
                }
                f9 = f11;
                n15 = n17;
                if (n13 <= 0) continue;
                n16 = f10.a.getBottom() - (n9 + n11);
                f9 = f11;
                n15 = n17;
                if (n16 >= 0) continue;
                f9 = f11;
                n15 = n17;
                if (f10.a.getBottom() <= f8.a.getBottom()) continue;
                n16 = Math.abs(n16);
                f9 = f11;
                n15 = n17;
                if (n16 <= n17) continue;
                n15 = n16;
                f9 = f10;
            }
            return f9;
        }

        public void c(RecyclerView recyclerView, RecyclerView.F f8) {
            androidx.recyclerview.widget.j.a.a(f8.a);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public int d(int n8, int n9) {
            int n10 = n8 & 0x303030;
            if (n10 == 0) {
                return n8;
            }
            int n11 = n8 & ~n10;
            if (n9 == 0) {
                n8 = n10 >> 2;
                n9 = n11;
                return n9 | n8;
            }
            n8 = n10 >> 1;
            n9 = n11 | 0xFFCFCFCF & n8;
            n8 = (n8 & 0x303030) >> 2;
            return n9 | n8;
        }

        final int f(RecyclerView recyclerView, RecyclerView.F f8) {
            return this.d(this.k(recyclerView, f8), d0.B((View)recyclerView));
        }

        public long g(RecyclerView object, int n8, float f8, float f9) {
            if ((object = ((RecyclerView)object).getItemAnimator()) == null) {
                if (n8 == 8) {
                    return 200L;
                }
                return 250L;
            }
            if (n8 == 8) {
                return ((RecyclerView.m)object).n();
            }
            return ((RecyclerView.m)object).o();
        }

        public int h() {
            return 0;
        }

        public float j(RecyclerView.F f8) {
            return 0.5f;
        }

        public abstract int k(RecyclerView var1, RecyclerView.F var2);

        public float l(float f8) {
            return f8;
        }

        public float m(RecyclerView.F f8) {
            return 0.5f;
        }

        public float n(float f8) {
            return f8;
        }

        boolean o(RecyclerView recyclerView, RecyclerView.F f8) {
            return (this.f(recyclerView, f8) & 0xFF0000) != 0;
        }

        public int p(RecyclerView recyclerView, int n8, int n9, int n10, long l8) {
            int n11 = this.i(recyclerView);
            n10 = Math.abs(n9);
            int n12 = (int)Math.signum(n9);
            float f8 = n10;
            float f9 = 1.0f;
            f8 = Math.min(1.0f, f8 * 1.0f / (float)n8);
            n8 = (int)((float)(n12 * n11) * c.getInterpolation(f8));
            if (l8 <= 2000L) {
                f9 = (float)l8 / 2000.0f;
            }
            n8 = n10 = (int)((float)n8 * b.getInterpolation(f9));
            if (n10 == 0) {
                if (n9 > 0) {
                    return 1;
                }
                n8 = -1;
            }
            return n8;
        }

        public abstract boolean q();

        public abstract boolean r();

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f8, float f9, float f10, int n8, boolean bl) {
            androidx.recyclerview.widget.j.a.d(canvas, recyclerView, f8.a, f9, f10, n8, bl);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, @SuppressLint(value={"UnknownNullness"}) RecyclerView.F f8, float f9, float f10, int n8, boolean bl) {
            androidx.recyclerview.widget.j.a.c(canvas, recyclerView, f8.a, f9, f10, n8, bl);
        }

        void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f8, List<g> list, int n8, float f9, float f10) {
            int n9;
            int n10 = list.size();
            for (n9 = 0; n9 < n10; ++n9) {
                g g8 = list.get(n9);
                g8.e();
                int n11 = canvas.save();
                this.u(canvas, recyclerView, g8.e, g8.j, g8.k, g8.f, false);
                canvas.restoreToCount(n11);
            }
            if (f8 != null) {
                n9 = canvas.save();
                this.u(canvas, recyclerView, f8, f9, f10, n8, true);
                canvas.restoreToCount(n9);
            }
        }

        void x(Canvas object, RecyclerView recyclerView, RecyclerView.F f8, List<g> list, int n8, float f9, float f10) {
            int n9;
            int n10 = list.size();
            int n11 = 0;
            for (n9 = 0; n9 < n10; ++n9) {
                g g8 = list.get(n9);
                int n12 = object.save();
                this.v((Canvas)object, recyclerView, g8.e, g8.j, g8.k, g8.f, false);
                object.restoreToCount(n12);
            }
            if (f8 != null) {
                n9 = object.save();
                this.v((Canvas)object, recyclerView, f8, f9, f10, n8, true);
                object.restoreToCount(n9);
            }
            n9 = n11;
            for (n8 = n10 - 1; n8 >= 0; --n8) {
                object = list.get(n8);
                boolean bl = object.m;
                if (bl && !object.i) {
                    list.remove(n8);
                    continue;
                }
                if (bl) continue;
                n9 = 1;
            }
            if (n9 != 0) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(RecyclerView var1, RecyclerView.F var2, RecyclerView.F var3);

        public void z(RecyclerView recyclerView, RecyclerView.F f8, int n8, RecyclerView.F f9, int n9, int n10, int n11) {
            RecyclerView.p p8 = recyclerView.getLayoutManager();
            if (p8 instanceof h) {
                ((h)((Object)p8)).d(f8.a, f9.a, n10, n11);
                return;
            }
            if (p8.q()) {
                if (p8.W(f9.a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.w1(n9);
                }
                if (p8.Z(f9.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.w1(n9);
                }
            }
            if (p8.r()) {
                if (p8.a0(f9.a) <= recyclerView.getPaddingTop()) {
                    recyclerView.w1(n9);
                }
                if (p8.U(f9.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.w1(n9);
                }
            }
        }
    }

    private class f
    extends GestureDetector.SimpleOnGestureListener {
        private boolean a;
        final i b;

        f(i i8) {
            this.b = i8;
            this.a = true;
        }

        void a() {
            this.a = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent object) {
            Object object2;
            if (this.a && (object2 = this.b.t((MotionEvent)object)) != null && (object2 = this.b.r.m0((View)object2)) != null) {
                int n8;
                int n9;
                i i8 = this.b;
                if (i8.m.o(i8.r, (RecyclerView.F)object2) && (n9 = object.getPointerId(0)) == (n8 = this.b.l)) {
                    n8 = object.findPointerIndex(n8);
                    float f8 = object.getX(n8);
                    float f9 = object.getY(n8);
                    object = this.b;
                    object.d = f8;
                    object.e = f9;
                    object.i = 0.0f;
                    object.h = 0.0f;
                    if (object.m.r()) {
                        this.b.F((RecyclerView.F)object2, 2);
                    }
                }
            }
        }
    }

    static class g
    implements Animator.AnimatorListener {
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

        g(RecyclerView.F f8, int n8, int n9, float f9, float f10, float f11, float f12) {
            ValueAnimator valueAnimator;
            this.f = n9;
            this.h = n8;
            this.e = f8;
            this.a = f9;
            this.b = f10;
            this.c = f11;
            this.d = f12;
            this.g = valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
                final g a;
                {
                    this.a = g8;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.c(valueAnimator.getAnimatedFraction());
                }
            });
            valueAnimator.setTarget((Object)f8.a);
            valueAnimator.addListener((Animator.AnimatorListener)this);
            this.c(0.0f);
        }

        public void a() {
            this.g.cancel();
        }

        public void b(long l8) {
            this.g.setDuration(l8);
        }

        public void c(float f8) {
            this.n = f8;
        }

        public void d() {
            this.e.H(false);
            this.g.start();
        }

        public void e() {
            float f8 = this.a;
            float f9 = this.c;
            this.j = f8 == f9 ? this.e.a.getTranslationX() : f8 + this.n * (f9 - f8);
            f9 = this.b;
            f8 = this.d;
            if (f9 == f8) {
                this.k = this.e.a.getTranslationY();
                return;
            }
            this.k = f9 + this.n * (f8 - f9);
        }

        public void onAnimationCancel(Animator animator) {
            this.c(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.m) {
                this.e.H(true);
            }
            this.m = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public static interface h {
        public void d(View var1, View var2, int var3, int var4);
    }
}

