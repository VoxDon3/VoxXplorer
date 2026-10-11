/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import ax.k6.m;
import ax.l6.a;
import com.google.android.material.carousel.c;
import com.google.android.material.carousel.e;
import com.google.android.material.carousel.f;
import com.google.android.material.carousel.g;
import com.google.android.material.carousel.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CarouselLayoutManager
extends RecyclerView.p
implements ax.u6.a,
RecyclerView.A.b {
    private int A = 0;
    private Map<Integer, e> B;
    private com.google.android.material.carousel.b C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F = -1;
    private int G = 0;
    int s;
    int t;
    int u;
    private boolean v = false;
    private final c w = new c();
    private com.google.android.material.carousel.c x;
    private f y;
    private e z;

    public CarouselLayoutManager() {
        this(new h());
    }

    @SuppressLint(value={"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int n8, int n9) {
        this.D = new ax.u6.b(this);
        this.T2(new h());
        this.S2(context, attributeSet);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c c8) {
        this(c8, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c c8, int n8) {
        this.D = new ax.u6.b(this);
        this.T2(c8);
        this.U2(n8);
    }

    private int A2() {
        return this.C.i();
    }

    private int B2() {
        return this.C.j();
    }

    private int C2() {
        if (this.S()) {
            return 0;
        }
        if (this.w2() == 1) {
            return this.i0();
        }
        return this.k0();
    }

    private int D2(int n8, e e8) {
        if (this.G2()) {
            return (int)((float)this.o2() - e8.i().a - (float)n8 * e8.g() - e8.g() / 2.0f);
        }
        return (int)((float)n8 * e8.g() - e8.b().a + e8.g() / 2.0f);
    }

    private int E2(int n8, e e8) {
        Iterator<e.c> iterator = e8.f().iterator();
        int n9 = Integer.MAX_VALUE;
        while (iterator.hasNext()) {
            e.c c8 = iterator.next();
            float f8 = (float)n8 * e8.g() + e8.g() / 2.0f;
            int n10 = this.G2() ? (int)((float)this.o2() - c8.a - f8) : (int)(f8 - c8.a);
            if (Math.abs(n9) <= Math.abs(n10 -= this.s)) continue;
            n9 = n10;
        }
        return n9;
    }

    private static d F2(List<e.c> list, float f8, boolean bl) {
        int n8;
        float f9 = Float.MAX_VALUE;
        float f10 = Float.MAX_VALUE;
        float f11 = Float.MAX_VALUE;
        float f12 = -3.4028235E38f;
        int n9 = -1;
        int n10 = -1;
        int n11 = -1;
        int n12 = -1;
        for (n8 = 0; n8 < list.size(); ++n8) {
            e.c c8 = list.get(n8);
            float f13 = bl ? c8.b : c8.a;
            float f14 = Math.abs(f13 - f8);
            float f15 = f9;
            int n13 = n9;
            if (f13 <= f8) {
                f15 = f9;
                n13 = n9;
                if (f14 <= f9) {
                    n13 = n8;
                    f15 = f14;
                }
            }
            float f16 = f10;
            int n14 = n11;
            if (f13 > f8) {
                f16 = f10;
                n14 = n11;
                if (f14 <= f10) {
                    n14 = n8;
                    f16 = f14;
                }
            }
            f14 = f11;
            if (f13 <= f11) {
                n10 = n8;
                f14 = f13;
            }
            float f17 = f12;
            if (f13 > f12) {
                n12 = n8;
                f17 = f13;
            }
            f9 = f15;
            f10 = f16;
            f11 = f14;
            f12 = f17;
            n9 = n13;
            n11 = n14;
        }
        n8 = n9;
        if (n9 == -1) {
            n8 = n10;
        }
        n10 = n11;
        if (n11 == -1) {
            n10 = n12;
        }
        return new d(list.get(n8), list.get(n10));
    }

    private boolean H2(float f8, d d8) {
        f8 = this.a2(f8, this.u2(f8, d8) / 2.0f);
        if (this.G2()) {
            return f8 < 0.0f;
        }
        return f8 > (float)this.o2();
    }

    private boolean I2(float f8, d d8) {
        f8 = this.Z1(f8, this.u2(f8, d8) / 2.0f);
        if (this.G2()) {
            return f8 > (float)this.o2();
        }
        return f8 < 0.0f;
    }

    private void J2() {
        if (this.v && Log.isLoggable((String)"CarouselLayoutManager", (int)3)) {
            Log.d((String)"CarouselLayoutManager", (String)"internal representation of views on the screen");
            for (int i8 = 0; i8 < this.P(); ++i8) {
                View view = this.O(i8);
                float f8 = this.p2(view);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("item position ");
                stringBuilder.append(this.m0(view));
                stringBuilder.append(", center:");
                stringBuilder.append(f8);
                stringBuilder.append(", child index:");
                stringBuilder.append(i8);
                Log.d((String)"CarouselLayoutManager", (String)stringBuilder.toString());
            }
            Log.d((String)"CarouselLayoutManager", (String)"==============");
        }
    }

    private b K2(RecyclerView.w object, float f8, int n8) {
        View view = ((RecyclerView.w)object).o(n8);
        this.F0(view, 0, 0);
        f8 = this.Z1(f8, this.z.g() / 2.0f);
        object = CarouselLayoutManager.F2(this.z.h(), f8, false);
        return new b(view, f8, this.e2(f8, (d)object), (d)object);
    }

    private float L2(View view, float f8, float f9, Rect rect) {
        float f10 = this.Z1(f8, f9);
        d d8 = CarouselLayoutManager.F2(this.z.h(), f10, false);
        f8 = this.e2(f10, d8);
        super.V(view, rect);
        this.V2(view, f10, d8);
        this.C.m(view, rect, f9, f8);
        return f8;
    }

    private void M2(RecyclerView.w object) {
        object = ((RecyclerView.w)object).o(0);
        this.F0((View)object, 0, 0);
        e e8 = this.x.g(this, (View)object);
        object = e8;
        if (this.G2()) {
            object = e.p(e8, this.o2());
        }
        this.y = f.f(this, (e)object, this.q2(), this.t2(), this.C2(), this.x.e());
    }

    private void N2() {
        this.y = null;
        this.y1();
    }

    private void O2(RecyclerView.w w8) {
        View view;
        float f8;
        while (this.P() > 0 && this.I2(f8 = this.p2(view = this.O(0)), CarouselLayoutManager.F2(this.z.h(), f8, true))) {
            this.r1(view, w8);
        }
        while (this.P() - 1 >= 0 && this.H2(f8 = this.p2(view = this.O(this.P() - 1)), CarouselLayoutManager.F2(this.z.h(), f8, true))) {
            this.r1(view, w8);
        }
    }

    private int P2(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        int n9 = this.P();
        int n10 = 0;
        if (n9 != 0 && n8 != 0) {
            if (this.y == null) {
                this.M2(w8);
            }
            if (this.f() <= this.r2(this.y).n()) {
                return 0;
            }
            n9 = CarouselLayoutManager.i2(n8, this.s, this.t, this.u);
            this.s += n9;
            this.W2(this.y);
            float f8 = this.z.g() / 2.0f;
            float f9 = this.f2(this.m0(this.O(0)));
            Rect rect = new Rect();
            float f10 = this.G2() ? this.z.i().b : this.z.b().b;
            float f11 = Float.MAX_VALUE;
            for (n8 = n10; n8 < this.P(); ++n8) {
                View view = this.O(n8);
                float f12 = Math.abs(f10 - this.L2(view, f9, f8, rect));
                float f13 = f11;
                if (view != null) {
                    f13 = f11;
                    if (f12 < f11) {
                        this.F = this.m0(view);
                        f13 = f12;
                    }
                }
                f9 = this.Z1(f9, this.z.g());
                f11 = f13;
            }
            this.l2(w8, b8);
            return n9;
        }
        return 0;
    }

    private void Q2(RecyclerView recyclerView, int n8) {
        if (this.g()) {
            recyclerView.scrollBy(n8, 0);
            return;
        }
        recyclerView.scrollBy(0, n8);
    }

    public static /* synthetic */ void R1(CarouselLayoutManager carouselLayoutManager) {
        carouselLayoutManager.N2();
    }

    public static /* synthetic */ void S1(CarouselLayoutManager carouselLayoutManager, View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        carouselLayoutManager.getClass();
        if (n10 - n8 == n14 - n12 && n11 - n9 == n15 - n13) {
            return;
        }
        view.post((Runnable)new ax.u6.c(carouselLayoutManager));
    }

    private void S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, m.A0);
            this.R2(context.getInt(m.B0, 0));
            this.U2(context.getInt(ax.h2.d.b, 0));
            context.recycle();
        }
    }

    private void V2(View view, float f8, d d8) {
        if (!(view instanceof g)) {
            return;
        }
        e.c c8 = d8.a;
        float f9 = c8.c;
        e.c c9 = d8.b;
        float f10 = a.b(f9, c9.c, c8.a, c9.a, f8);
        f9 = view.getHeight();
        float f11 = view.getWidth();
        float f12 = a.b(0.0f, f11 / 2.0f, 0.0f, 1.0f, f10);
        f10 = a.b(0.0f, f9 / 2.0f, 0.0f, 1.0f, f10);
        c9 = this.C.e(f9, f11, f10, f12);
        f11 = this.e2(f8, d8);
        f8 = c9.height() / 2.0f;
        f9 = c9.height() / 2.0f;
        d8 = new RectF(f11 - c9.width() / 2.0f, f11 - f8, f11 + c9.width() / 2.0f, f9 + f11);
        c8 = new RectF((float)this.y2(), (float)this.B2(), (float)this.z2(), (float)this.x2());
        if (this.x.e() == c.a.q) {
            this.C.a((RectF)c9, (RectF)d8, (RectF)c8);
        }
        this.C.l((RectF)c9, (RectF)d8, (RectF)c8);
        ((g)view).a((RectF)c9);
    }

    private void W2(f f8) {
        int n8 = this.u;
        int n9 = this.t;
        this.z = n8 <= n9 ? this.r2(f8) : f8.j(this.s, n9, n8);
        this.w.l(this.z.h());
    }

    private void X2() {
        int n8;
        int n9 = this.f();
        if (n9 != (n8 = this.E) && this.y != null) {
            if (this.x.h(this, n8)) {
                this.N2();
            }
            this.E = n9;
        }
    }

    private void Y1(View view, int n8, b b8) {
        float f8 = this.z.g() / 2.0f;
        this.k(view, n8);
        this.F0(view, 0, 0);
        float f9 = b8.c;
        n8 = (int)(f9 - f8);
        int n9 = (int)(f9 + f8);
        this.C.k(view, n8, n9);
        this.V2(view, b8.b, b8.d);
    }

    private void Y2() {
        if (this.v && this.P() >= 1) {
            int n8 = 0;
            while (n8 < this.P() - 1) {
                int n9;
                int n10;
                int n11 = this.m0(this.O(n8));
                if (n11 <= (n10 = this.m0(this.O(n9 = n8 + 1)))) {
                    n8 = n9;
                    continue;
                }
                this.J2();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Detected invalid child order. Child at index [");
                stringBuilder.append(n8);
                stringBuilder.append("] had adapter position [");
                stringBuilder.append(n11);
                stringBuilder.append("] and child at index [");
                stringBuilder.append(n9);
                stringBuilder.append("] had adapter position [");
                stringBuilder.append(n10);
                stringBuilder.append("].");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private float Z1(float f8, float f9) {
        if (this.G2()) {
            return f8 - f9;
        }
        return f8 + f9;
    }

    private float a2(float f8, float f9) {
        if (this.G2()) {
            return f8 + f9;
        }
        return f8 - f9;
    }

    private void b2(RecyclerView.w object, int n8, int n9) {
        if (n8 >= 0 && n8 < this.f()) {
            object = this.K2((RecyclerView.w)object, this.f2(n8), n8);
            this.Y1(((b)object).a, n9, (b)object);
        }
    }

    private void c2(RecyclerView.w w8, RecyclerView.B b8, int n8) {
        d d8;
        float f8;
        float f9;
        float f10 = this.f2(n8);
        while (n8 < b8.b() && !this.H2(f9 = this.e2(f8 = this.Z1(f10, this.z.g() / 2.0f), d8 = CarouselLayoutManager.F2(this.z.h(), f8, false)), d8)) {
            f10 = this.Z1(f10, this.z.g());
            if (!this.I2(f9, d8)) {
                View view = w8.o(n8);
                this.Y1(view, -1, new b(view, f8, f9, d8));
            }
            ++n8;
        }
    }

    private void d2(RecyclerView.w w8, int n8) {
        d d8;
        float f8;
        float f9;
        float f10 = this.f2(n8);
        while (n8 >= 0 && !this.I2(f9 = this.e2(f8 = this.Z1(f10, this.z.g() / 2.0f), d8 = CarouselLayoutManager.F2(this.z.h(), f8, false)), d8)) {
            f10 = this.a2(f10, this.z.g());
            if (!this.H2(f9, d8)) {
                View view = w8.o(n8);
                this.Y1(view, 0, new b(view, f8, f9, d8));
            }
            --n8;
        }
    }

    private float e2(float f8, d object) {
        e.c c8 = ((d)object).a;
        float f9 = c8.b;
        e.c c9 = ((d)object).b;
        f9 = a.b(f9, c9.b, c8.a, c9.a, f8);
        if (((d)object).b != this.z.d() && ((d)object).a != this.z.k()) {
            return f9;
        }
        object = ((d)object).b;
        return f9 + (f8 - ((e.c)object).a) * (1.0f - ((e.c)object).c);
    }

    private float f2(int n8) {
        return this.Z1(this.A2() - this.s, this.z.g() * (float)n8);
    }

    private int g2(RecyclerView.B b8, f object) {
        boolean bl = this.G2();
        object = bl ? ((f)object).l() : ((f)object).h();
        e.c c8 = bl ? ((e)object).b() : ((e)object).i();
        int n8 = b8.b();
        int n9 = 1;
        float f8 = n8 - 1;
        float f9 = ((e)object).g();
        float f10 = bl ? -1.0f : 1.0f;
        float f11 = c8.a;
        float f12 = this.A2();
        if (bl) {
            n9 = -1;
        }
        n9 = (int)(f8 * f9 * f10 - (f11 - f12) + (float)n9 * c8.d / 2.0f);
        if (bl) {
            return Math.min(0, n9);
        }
        return Math.max(0, n9);
    }

    private static int i2(int n8, int n9, int n10, int n11) {
        int n12 = n9 + n8;
        if (n12 < n10) {
            return n10 - n9;
        }
        if (n12 > n11) {
            return n11 - n9;
        }
        return n8;
    }

    private int j2(f object) {
        boolean bl = this.G2();
        object = bl ? ((f)object).h() : ((f)object).l();
        e.c c8 = bl ? ((e)object).i() : ((e)object).b();
        float f8 = this.a2(c8.a, ((e)object).g() / 2.0f);
        return (int)((float)this.A2() - f8);
    }

    private int k2(int n8) {
        int n9 = this.w2();
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 17) {
                    if (n8 != 33) {
                        if (n8 != 66) {
                            if (n8 != 130) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Unknown focus request:");
                                stringBuilder.append(n8);
                                Log.d((String)"CarouselLayoutManager", (String)stringBuilder.toString());
                                return Integer.MIN_VALUE;
                            }
                            if (n9 == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (n9 == 0) {
                            if (this.G2()) {
                                return -1;
                            }
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (n9 == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (n9 == 0) {
                    if (this.G2()) {
                        return 1;
                    }
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return -1;
    }

    private void l2(RecyclerView.w w8, RecyclerView.B b8) {
        this.O2(w8);
        if (this.P() == 0) {
            this.d2(w8, this.A - 1);
            this.c2(w8, b8, this.A);
        } else {
            int n8 = this.m0(this.O(0));
            int n9 = this.m0(this.O(this.P() - 1));
            this.d2(w8, n8 - 1);
            this.c2(w8, b8, n9 + 1);
        }
        this.Y2();
    }

    private View m2() {
        int n8 = this.G2() ? 0 : this.P() - 1;
        return this.O(n8);
    }

    private View n2() {
        int n8 = this.G2() ? this.P() - 1 : 0;
        return this.O(n8);
    }

    private int o2() {
        if (this.g()) {
            return this.a();
        }
        return this.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float p2(View view) {
        int n8;
        Rect rect = new Rect();
        super.V(view, rect);
        if (this.g()) {
            n8 = rect.centerX();
            return n8;
        }
        n8 = rect.centerY();
        return n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int q2() {
        int n8;
        int n9;
        if (this.P() <= 0) return 0;
        RecyclerView.q q8 = (RecyclerView.q)this.O(0).getLayoutParams();
        if (this.C.a == 0) {
            n9 = q8.leftMargin;
            n8 = q8.rightMargin;
            return n9 + n8;
        }
        n9 = q8.topMargin;
        n8 = q8.bottomMargin;
        return n9 + n8;
    }

    private e r2(f f8) {
        if (this.G2()) {
            return f8.h();
        }
        return f8.l();
    }

    private e s2(int n8) {
        Map<Integer, e> map = this.B;
        if (map != null && (map = map.get(ax.W.a.b(n8, 0, Math.max(0, this.f() - 1)))) != null) {
            return map;
        }
        return this.y.g();
    }

    private int t2() {
        if (this.S()) {
            return 0;
        }
        if (this.w2() == 1) {
            return this.l0();
        }
        return this.j0();
    }

    private float u2(float f8, d object) {
        e.c c8 = ((d)object).a;
        float f9 = c8.d;
        object = ((d)object).b;
        return a.b(f9, ((e.c)object).d, c8.b, ((e.c)object).b, f8);
    }

    private int x2() {
        return this.C.f();
    }

    private int y2() {
        return this.C.g();
    }

    private int z2() {
        return this.C.h();
    }

    @Override
    public int A(RecyclerView.B b8) {
        return this.s;
    }

    @Override
    public int B(RecyclerView.B b8) {
        return this.u - this.t;
    }

    @Override
    public int B1(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        if (this.q()) {
            return this.P2(n8, w8, b8);
        }
        return 0;
    }

    @Override
    public void C1(int n8) {
        this.F = n8;
        if (this.y == null) {
            return;
        }
        this.s = this.D2(n8, this.s2(n8));
        this.A = ax.W.a.b(n8, 0, Math.max(0, this.f() - 1));
        this.W2(this.y);
        this.y1();
    }

    @Override
    public int D1(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        if (this.r()) {
            return this.P2(n8, w8, b8);
        }
        return 0;
    }

    @Override
    public void F0(View view, int n8, int n9) {
        if (view instanceof g) {
            RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
            Object object = new Rect();
            this.p(view, (Rect)object);
            int n10 = ((Rect)object).left;
            int n11 = ((Rect)object).right;
            int n12 = ((Rect)object).top;
            int n13 = ((Rect)object).bottom;
            object = this.y;
            float f8 = object != null && this.C.a == 0 ? ((f)object).g().g() : (float)q8.width;
            object = this.y;
            float f9 = object != null && this.C.a == 1 ? ((f)object).g().g() : (float)q8.height;
            view.measure(RecyclerView.p.Q(this.t0(), this.u0(), this.j0() + this.k0() + q8.leftMargin + q8.rightMargin + (n8 + (n10 + n11)), (int)f8, this.q()), RecyclerView.p.Q(this.c0(), this.d0(), this.l0() + this.i0() + q8.topMargin + q8.bottomMargin + (n9 + (n12 + n13)), (int)f9, this.r()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    boolean G2() {
        return this.g() && this.e0() == 1;
    }

    @Override
    public RecyclerView.q J() {
        return new RecyclerView.q(-2, -2);
    }

    @Override
    public void L0(RecyclerView recyclerView) {
        super.L0(recyclerView);
        this.x.f(recyclerView.getContext());
        this.N2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    @Override
    public void N0(RecyclerView recyclerView, RecyclerView.w w8) {
        super.N0(recyclerView, w8);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override
    public void N1(RecyclerView object, RecyclerView.B b8, int n8) {
        object = new l(this, object.getContext()){
            final CarouselLayoutManager q;
            {
                this.q = carouselLayoutManager;
                super(context);
            }

            @Override
            public PointF a(int n8) {
                return this.q.c(n8);
            }

            @Override
            public int t(View view, int n8) {
                if (this.q.y != null && this.q.g()) {
                    CarouselLayoutManager carouselLayoutManager = this.q;
                    return carouselLayoutManager.h2(carouselLayoutManager.m0(view));
                }
                return 0;
            }

            @Override
            public int u(View view, int n8) {
                if (this.q.y != null && !this.q.g()) {
                    CarouselLayoutManager carouselLayoutManager = this.q;
                    return carouselLayoutManager.h2(carouselLayoutManager.m0(view));
                }
                return 0;
            }
        };
        ((RecyclerView.A)object).p(n8);
        this.O1((RecyclerView.A)object);
    }

    @Override
    public View O0(View view, int n8, RecyclerView.w w8, RecyclerView.B b8) {
        if (this.P() == 0) {
            return null;
        }
        if ((n8 = this.k2(n8)) == Integer.MIN_VALUE) {
            return null;
        }
        if (n8 == -1) {
            if (this.m0(view) == 0) {
                return null;
            }
            this.b2(w8, this.m0(this.O(0)) - 1, 0);
            return this.n2();
        }
        if (this.m0(view) == this.f() - 1) {
            return null;
        }
        this.b2(w8, this.m0(this.O(this.P() - 1)) + 1, -1);
        return this.m2();
    }

    @Override
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (this.P() > 0) {
            accessibilityEvent.setFromIndex(this.m0(this.O(0)));
            accessibilityEvent.setToIndex(this.m0(this.O(this.P() - 1)));
        }
    }

    public void R2(int n8) {
        this.G = n8;
        this.N2();
    }

    public void T2(com.google.android.material.carousel.c c8) {
        this.x = c8;
        this.N2();
    }

    public void U2(int n8) {
        if (n8 != 0 && n8 != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid orientation:");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.m(null);
        com.google.android.material.carousel.b b8 = this.C;
        if (b8 != null && n8 == b8.a) {
            return;
        }
        this.C = com.google.android.material.carousel.b.c(this, n8);
        this.N2();
    }

    @Override
    public void V(View view, Rect rect) {
        super.V(view, rect);
        float f8 = rect.centerY();
        if (this.g()) {
            f8 = rect.centerX();
        }
        float f9 = this.u2(f8, CarouselLayoutManager.F2(this.z.h(), f8, true));
        boolean bl = this.g();
        float f10 = 0.0f;
        f8 = bl ? ((float)rect.width() - f9) / 2.0f : 0.0f;
        if (!this.g()) {
            f10 = ((float)rect.height() - f9) / 2.0f;
        }
        rect.set((int)((float)rect.left + f8), (int)((float)rect.top + f10), (int)((float)rect.right - f8), (int)((float)rect.bottom - f10));
    }

    @Override
    public void W0(RecyclerView recyclerView, int n8, int n9) {
        super.W0(recyclerView, n8, n9);
        this.X2();
    }

    @Override
    public void X0(RecyclerView recyclerView) {
        super.X0(recyclerView);
        this.X2();
    }

    @Override
    public void Z0(RecyclerView recyclerView, int n8, int n9) {
        super.Z0(recyclerView, n8, n9);
        this.X2();
    }

    @Override
    public int a() {
        return this.t0();
    }

    @Override
    public int b() {
        return this.c0();
    }

    @Override
    public PointF c(int n8) {
        if (this.y == null) {
            return null;
        }
        n8 = this.v2(n8, this.s2(n8));
        if (this.g()) {
            return new PointF((float)n8, 0.0f);
        }
        return new PointF(0.0f, (float)n8);
    }

    @Override
    public void c1(RecyclerView.w w8, RecyclerView.B b8) {
        if (b8.b() > 0 && !((float)this.o2() <= 0.0f)) {
            boolean bl = this.G2();
            f f8 = this.y;
            int n8 = f8 == null ? 1 : 0;
            if (n8 != 0 || f8.g().a() != this.o2()) {
                this.M2(w8);
            }
            int n9 = this.j2(this.y);
            int n10 = this.g2(b8, this.y);
            int n11 = bl ? n10 : n9;
            this.t = n11;
            if (bl) {
                n10 = n9;
            }
            this.u = n10;
            if (n8 != 0) {
                this.s = n9;
                this.B = this.y.i(this.f(), this.t, this.u, this.G2());
                n8 = this.F;
                if (n8 != -1) {
                    this.s = this.D2(n8, this.s2(n8));
                }
            }
            n8 = this.s;
            this.s = n8 + CarouselLayoutManager.i2(0, n8, this.t, this.u);
            this.A = ax.W.a.b(this.A, 0, b8.b());
            this.W2(this.y);
            this.C(w8);
            this.l2(w8, b8);
            this.E = this.f();
            return;
        }
        this.p1(w8);
        this.A = 0;
    }

    @Override
    public void d1(RecyclerView.B b8) {
        super.d1(b8);
        this.A = this.P() == 0 ? 0 : this.m0(this.O(0));
        this.Y2();
    }

    @Override
    public int e() {
        return this.G;
    }

    @Override
    public boolean g() {
        return this.C.a == 0;
    }

    int h2(int n8) {
        float f8 = this.D2(n8, this.s2(n8));
        return (int)((float)this.s - f8);
    }

    @Override
    public boolean q() {
        return this.g();
    }

    @Override
    public boolean r() {
        return this.g() ^ true;
    }

    int v2(int n8, e e8) {
        return this.D2(n8, e8) - this.s;
    }

    @Override
    public int w(RecyclerView.B b8) {
        if (this.P() != 0 && this.y != null && this.f() > 1) {
            float f8 = this.y.g().g() / (float)this.y(b8);
            return (int)((float)this.t0() * f8);
        }
        return 0;
    }

    public int w2() {
        return this.C.a;
    }

    @Override
    public int x(RecyclerView.B b8) {
        return this.s;
    }

    @Override
    public boolean x0() {
        return true;
    }

    @Override
    public boolean x1(RecyclerView recyclerView, View view, Rect object, boolean bl, boolean bl2) {
        if (this.y == null) {
            return false;
        }
        int n8 = this.E2(this.m0(view), this.s2(this.m0(view)));
        if (n8 == 0) {
            return false;
        }
        n8 = CarouselLayoutManager.i2(n8, this.s, this.t, this.u);
        object = this.y.j(this.s + n8, this.t, this.u);
        this.Q2(recyclerView, this.E2(this.m0(view), (e)object));
        return true;
    }

    @Override
    public int y(RecyclerView.B b8) {
        return this.u - this.t;
    }

    @Override
    public int z(RecyclerView.B b8) {
        if (this.P() != 0 && this.y != null && this.f() > 1) {
            float f8 = this.y.g().g() / (float)this.B(b8);
            return (int)((float)this.c0() * f8);
        }
        return 0;
    }

    private static final class b {
        final View a;
        final float b;
        final float c;
        final d d;

        b(View view, float f8, float f9, d d8) {
            this.a = view;
            this.b = f8;
            this.c = f9;
            this.d = d8;
        }
    }

    private static class c
    extends RecyclerView.o {
        private final Paint a;
        private List<e.c> b;

        c() {
            Paint paint;
            this.a = paint = new Paint();
            this.b = java.util.DesugarCollections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B object2) {
            super.k(canvas, recyclerView, (RecyclerView.B)object2);
            this.a.setStrokeWidth(recyclerView.getResources().getDimension(ax.k6.e.s));
            for (e.c c8 : this.b) {
                this.a.setColor(ax.T.a.c(-65281, -16776961, c8.c));
                if (((CarouselLayoutManager)recyclerView.getLayoutManager()).g()) {
                    canvas.drawLine(c8.b, (float)((CarouselLayoutManager)recyclerView.getLayoutManager()).B2(), c8.b, (float)((CarouselLayoutManager)recyclerView.getLayoutManager()).x2(), this.a);
                    continue;
                }
                canvas.drawLine((float)((CarouselLayoutManager)recyclerView.getLayoutManager()).y2(), c8.b, (float)((CarouselLayoutManager)recyclerView.getLayoutManager()).z2(), c8.b, this.a);
            }
        }

        void l(List<e.c> list) {
            this.b = java.util.DesugarCollections.unmodifiableList(list);
        }
    }

    private static class d {
        final e.c a;
        final e.c b;

        d(e.c c8, e.c c9) {
            boolean bl = c8.a <= c9.a;
            ax.b0.g.a(bl);
            this.a = c8;
            this.b = c9;
        }
    }
}

