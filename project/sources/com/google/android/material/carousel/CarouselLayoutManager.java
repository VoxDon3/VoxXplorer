package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import ax.b0.C1446g;
import ax.h2.C2146d;
import ax.k6.C2404e;
import ax.k6.m;
import ax.l6.C2472a;
import ax.u6.InterfaceC3212a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.c;
import com.google.android.material.carousel.e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.p implements InterfaceC3212a, RecyclerView.A.b {
    private int A;
    private Map<Integer, e> B;
    private com.google.android.material.carousel.b C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;
    int s;
    int t;
    int u;
    private boolean v;
    private final c w;
    private com.google.android.material.carousel.c x;
    private f y;
    private e z;

    class a extends l {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.A
        public PointF a(int i) {
            return CarouselLayoutManager.this.c(i);
        }

        @Override // androidx.recyclerview.widget.l
        public int t(View view, int i) {
            if (CarouselLayoutManager.this.y == null || !CarouselLayoutManager.this.g()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.m0(view));
        }

        @Override // androidx.recyclerview.widget.l
        public int u(View view, int i) {
            if (CarouselLayoutManager.this.y == null || CarouselLayoutManager.this.g()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.m0(view));
        }
    }

    private static final class b {
        final View a;
        final float b;
        final float c;
        final d d;

        b(View view, float f, float f2, d dVar) {
            this.a = view;
            this.b = f;
            this.c = f2;
            this.d = dVar;
        }
    }

    private static class c extends RecyclerView.o {
        private final Paint a;
        private List<e.c> b;

        c() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = DesugarCollections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b) {
            super.k(canvas, recyclerView, b);
            this.a.setStrokeWidth(recyclerView.getResources().getDimension(C2404e.s));
            for (e.c cVar : this.b) {
                this.a.setColor(ax.T.a.c(-65281, -16776961, cVar.c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).g()) {
                    canvas.drawLine(cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).B2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), this.a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).z2(), cVar.b, this.a);
                }
            }
        }

        void l(List<e.c> list) {
            this.b = DesugarCollections.unmodifiableList(list);
        }
    }

    private static class d {
        final e.c a;
        final e.c b;

        d(e.c cVar, e.c cVar2) {
            C1446g.a(cVar.a <= cVar2.a);
            this.a = cVar;
            this.b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    private int A2() {
        return this.C.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B2() {
        return this.C.j();
    }

    private int C2() {
        if (S()) {
            return 0;
        }
        return w2() == 1 ? i0() : k0();
    }

    private int D2(int i, e eVar) {
        return G2() ? (int) (((o2() - eVar.i().a) - (i * eVar.g())) - (eVar.g() / 2.0f)) : (int) (((i * eVar.g()) - eVar.b().a) + (eVar.g() / 2.0f));
    }

    private int E2(int i, e eVar) {
        int i2 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (e.c cVar : eVar.f()) {
            float g = (i * eVar.g()) + (eVar.g() / 2.0f);
            int o2 = (G2() ? (int) ((o2() - cVar.a) - g) : (int) (g - cVar.a)) - this.s;
            if (Math.abs(i2) > Math.abs(o2)) {
                i2 = o2;
            }
        }
        return i2;
    }

    private static d F2(List<e.c> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < list.size(); i5++) {
            e.c cVar = list.get(i5);
            float f6 = z ? cVar.b : cVar.a;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f3) {
                i3 = i5;
                f3 = abs;
            }
            if (f6 <= f4) {
                i2 = i5;
                f4 = f6;
            }
            if (f6 > f5) {
                i4 = i5;
                f5 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new d(list.get(i), list.get(i3));
    }

    private boolean H2(float f, d dVar) {
        float a2 = a2(f, u2(f, dVar) / 2.0f);
        return G2() ? a2 < 0.0f : a2 > ((float) o2());
    }

    private boolean I2(float f, d dVar) {
        float Z1 = Z1(f, u2(f, dVar) / 2.0f);
        return G2() ? Z1 > ((float) o2()) : Z1 < 0.0f;
    }

    private void J2() {
        if (this.v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i = 0; i < P(); i++) {
                View O = O(i);
                Log.d("CarouselLayoutManager", "item position " + m0(O) + ", center:" + p2(O) + ", child index:" + i);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b K2(RecyclerView.w wVar, float f, int i) {
        View o = wVar.o(i);
        F0(o, 0, 0);
        float Z1 = Z1(f, this.z.g() / 2.0f);
        d F2 = F2(this.z.h(), Z1, false);
        return new b(o, Z1, e2(Z1, F2), F2);
    }

    private float L2(View view, float f, float f2, Rect rect) {
        float Z1 = Z1(f, f2);
        d F2 = F2(this.z.h(), Z1, false);
        float e2 = e2(Z1, F2);
        super.V(view, rect);
        V2(view, Z1, F2);
        this.C.m(view, rect, f2, e2);
        return e2;
    }

    private void M2(RecyclerView.w wVar) {
        View o = wVar.o(0);
        F0(o, 0, 0);
        e g = this.x.g(this, o);
        if (G2()) {
            g = e.p(g, o2());
        }
        this.y = f.f(this, g, q2(), t2(), C2(), this.x.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.y = null;
        y1();
    }

    private void O2(RecyclerView.w wVar) {
        while (P() > 0) {
            View O = O(0);
            float p2 = p2(O);
            if (!I2(p2, F2(this.z.h(), p2, true))) {
                break;
            } else {
                r1(O, wVar);
            }
        }
        while (P() - 1 >= 0) {
            View O2 = O(P() - 1);
            float p22 = p2(O2);
            if (!H2(p22, F2(this.z.h(), p22, true))) {
                return;
            } else {
                r1(O2, wVar);
            }
        }
    }

    private int P2(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        if (P() == 0 || i == 0) {
            return 0;
        }
        if (this.y == null) {
            M2(wVar);
        }
        if (f() <= r2(this.y).n()) {
            return 0;
        }
        int i2 = i2(i, this.s, this.t, this.u);
        this.s += i2;
        W2(this.y);
        float g = this.z.g() / 2.0f;
        float f2 = f2(m0(O(0)));
        Rect rect = new Rect();
        float f = G2() ? this.z.i().b : this.z.b().b;
        float f3 = Float.MAX_VALUE;
        for (int i3 = 0; i3 < P(); i3++) {
            View O = O(i3);
            float abs = Math.abs(f - L2(O, f2, g, rect));
            if (O != null && abs < f3) {
                this.F = m0(O);
                f3 = abs;
            }
            f2 = Z1(f2, this.z.g());
        }
        l2(wVar, b2);
        return i2;
    }

    private void Q2(RecyclerView recyclerView, int i) {
        if (g()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    public static /* synthetic */ void S1(final CarouselLayoutManager carouselLayoutManager, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        carouselLayoutManager.getClass();
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        view.post(new Runnable() { // from class: ax.u6.c
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.N2();
            }
        });
    }

    private void S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.A0);
            R2(obtainStyledAttributes.getInt(m.B0, 0));
            U2(obtainStyledAttributes.getInt(C2146d.b, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void V2(View view, float f, d dVar) {
        if (view instanceof g) {
            e.c cVar = dVar.a;
            float f2 = cVar.c;
            e.c cVar2 = dVar.b;
            float b2 = C2472a.b(f2, cVar2.c, cVar.a, cVar2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF e = this.C.e(height, width, C2472a.b(0.0f, height / 2.0f, 0.0f, 1.0f, b2), C2472a.b(0.0f, width / 2.0f, 0.0f, 1.0f, b2));
            float e2 = e2(f, dVar);
            RectF rectF = new RectF(e2 - (e.width() / 2.0f), e2 - (e.height() / 2.0f), e2 + (e.width() / 2.0f), (e.height() / 2.0f) + e2);
            RectF rectF2 = new RectF(y2(), B2(), z2(), x2());
            if (this.x.e() == c.a.CONTAINED) {
                this.C.a(e, rectF, rectF2);
            }
            this.C.l(e, rectF, rectF2);
            ((g) view).a(e);
        }
    }

    private void W2(f fVar) {
        int i = this.u;
        int i2 = this.t;
        if (i <= i2) {
            this.z = r2(fVar);
        } else {
            this.z = fVar.j(this.s, i2, i);
        }
        this.w.l(this.z.h());
    }

    private void X2() {
        int f = f();
        int i = this.E;
        if (f == i || this.y == null) {
            return;
        }
        if (this.x.h(this, i)) {
            N2();
        }
        this.E = f;
    }

    private void Y1(View view, int i, b bVar) {
        float g = this.z.g() / 2.0f;
        k(view, i);
        F0(view, 0, 0);
        float f = bVar.c;
        this.C.k(view, (int) (f - g), (int) (f + g));
        V2(view, bVar.b, bVar.d);
    }

    private void Y2() {
        if (!this.v || P() < 1) {
            return;
        }
        int i = 0;
        while (i < P() - 1) {
            int m0 = m0(O(i));
            int i2 = i + 1;
            int m02 = m0(O(i2));
            if (m0 > m02) {
                J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + m0 + "] and child at index [" + i2 + "] had adapter position [" + m02 + "].");
            }
            i = i2;
        }
    }

    private float Z1(float f, float f2) {
        return G2() ? f - f2 : f + f2;
    }

    private float a2(float f, float f2) {
        return G2() ? f + f2 : f - f2;
    }

    private void b2(RecyclerView.w wVar, int i, int i2) {
        if (i < 0 || i >= f()) {
            return;
        }
        b K2 = K2(wVar, f2(i), i);
        Y1(K2.a, i2, K2);
    }

    private void c2(RecyclerView.w wVar, RecyclerView.B b2, int i) {
        float f2 = f2(i);
        while (i < b2.b()) {
            float Z1 = Z1(f2, this.z.g() / 2.0f);
            d F2 = F2(this.z.h(), Z1, false);
            float e2 = e2(Z1, F2);
            if (H2(e2, F2)) {
                return;
            }
            f2 = Z1(f2, this.z.g());
            if (!I2(e2, F2)) {
                View o = wVar.o(i);
                Y1(o, -1, new b(o, Z1, e2, F2));
            }
            i++;
        }
    }

    private void d2(RecyclerView.w wVar, int i) {
        float f2 = f2(i);
        while (i >= 0) {
            float Z1 = Z1(f2, this.z.g() / 2.0f);
            d F2 = F2(this.z.h(), Z1, false);
            float e2 = e2(Z1, F2);
            if (I2(e2, F2)) {
                return;
            }
            f2 = a2(f2, this.z.g());
            if (!H2(e2, F2)) {
                View o = wVar.o(i);
                Y1(o, 0, new b(o, Z1, e2, F2));
            }
            i--;
        }
    }

    private float e2(float f, d dVar) {
        e.c cVar = dVar.a;
        float f2 = cVar.b;
        e.c cVar2 = dVar.b;
        float b2 = C2472a.b(f2, cVar2.b, cVar.a, cVar2.a, f);
        if (dVar.b != this.z.d() && dVar.a != this.z.k()) {
            return b2;
        }
        e.c cVar3 = dVar.b;
        return b2 + ((f - cVar3.a) * (1.0f - cVar3.c));
    }

    private float f2(int i) {
        return Z1(A2() - this.s, this.z.g() * i);
    }

    private int g2(RecyclerView.B b2, f fVar) {
        boolean G2 = G2();
        e l = G2 ? fVar.l() : fVar.h();
        e.c b3 = G2 ? l.b() : l.i();
        int b4 = (int) (((((b2.b() - 1) * l.g()) * (G2 ? -1.0f : 1.0f)) - (b3.a - A2())) + (((G2 ? -1 : 1) * b3.d) / 2.0f));
        return G2 ? Math.min(0, b4) : Math.max(0, b4);
    }

    private static int i2(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private int j2(f fVar) {
        boolean G2 = G2();
        e h = G2 ? fVar.h() : fVar.l();
        return (int) (A2() - a2((G2 ? h.i() : h.b()).a, h.g() / 2.0f));
    }

    private int k2(int i) {
        int w2 = w2();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            if (w2 == 0) {
                return G2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 33) {
            return w2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            if (w2 == 0) {
                return G2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 130) {
            return w2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
        return Integer.MIN_VALUE;
    }

    private void l2(RecyclerView.w wVar, RecyclerView.B b2) {
        O2(wVar);
        if (P() == 0) {
            d2(wVar, this.A - 1);
            c2(wVar, b2, this.A);
        } else {
            int m0 = m0(O(0));
            int m02 = m0(O(P() - 1));
            d2(wVar, m0 - 1);
            c2(wVar, b2, m02 + 1);
        }
        Y2();
    }

    private View m2() {
        return O(G2() ? 0 : P() - 1);
    }

    private View n2() {
        return O(G2() ? P() - 1 : 0);
    }

    private int o2() {
        return g() ? a() : b();
    }

    private float p2(View view) {
        super.V(view, new Rect());
        return g() ? r0.centerX() : r0.centerY();
    }

    private int q2() {
        int i;
        int i2;
        if (P() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) O(0).getLayoutParams();
        if (this.C.a == 0) {
            i = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i + i2;
    }

    private e r2(f fVar) {
        return G2() ? fVar.h() : fVar.l();
    }

    private e s2(int i) {
        e eVar;
        Map<Integer, e> map = this.B;
        return (map == null || (eVar = map.get(Integer.valueOf(ax.W.a.b(i, 0, Math.max(0, f() + (-1)))))) == null) ? this.y.g() : eVar;
    }

    private int t2() {
        if (S()) {
            return 0;
        }
        return w2() == 1 ? l0() : j0();
    }

    private float u2(float f, d dVar) {
        e.c cVar = dVar.a;
        float f2 = cVar.d;
        e.c cVar2 = dVar.b;
        return C2472a.b(f2, cVar2.d, cVar.b, cVar2.b, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.C.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y2() {
        return this.C.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z2() {
        return this.C.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.B b2) {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.B b2) {
        return this.u - this.t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        if (q()) {
            return P2(i, wVar, b2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C1(int i) {
        this.F = i;
        if (this.y == null) {
            return;
        }
        this.s = D2(i, s2(i));
        this.A = ax.W.a.b(i, 0, Math.max(0, f() - 1));
        W2(this.y);
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D1(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        if (r()) {
            return P2(i, wVar, b2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F0(View view, int i, int i2) {
        if (!(view instanceof g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        Rect rect = new Rect();
        p(view, rect);
        int i3 = i + rect.left + rect.right;
        int i4 = i2 + rect.top + rect.bottom;
        f fVar = this.y;
        float g = (fVar == null || this.C.a != 0) ? ((ViewGroup.MarginLayoutParams) qVar).width : fVar.g().g();
        f fVar2 = this.y;
        view.measure(RecyclerView.p.Q(t0(), u0(), j0() + k0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, (int) g, q()), RecyclerView.p.Q(c0(), d0(), l0() + i0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, (int) ((fVar2 == null || this.C.a != 1) ? ((ViewGroup.MarginLayoutParams) qVar).height : fVar2.g().g()), r()));
    }

    boolean G2() {
        return g() && e0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView recyclerView) {
        super.L0(recyclerView);
        this.x.f(recyclerView.getContext());
        N2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.N0(recyclerView, wVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N1(RecyclerView recyclerView, RecyclerView.B b2, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i);
        O1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View O0(View view, int i, RecyclerView.w wVar, RecyclerView.B b2) {
        int k2;
        if (P() == 0 || (k2 = k2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (k2 == -1) {
            if (m0(view) == 0) {
                return null;
            }
            b2(wVar, m0(O(0)) - 1, 0);
            return n2();
        }
        if (m0(view) == f() - 1) {
            return null;
        }
        b2(wVar, m0(O(P() - 1)) + 1, -1);
        return m2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (P() > 0) {
            accessibilityEvent.setFromIndex(m0(O(0)));
            accessibilityEvent.setToIndex(m0(O(P() - 1)));
        }
    }

    public void R2(int i) {
        this.G = i;
        N2();
    }

    public void T2(com.google.android.material.carousel.c cVar) {
        this.x = cVar;
        N2();
    }

    public void U2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        m(null);
        com.google.android.material.carousel.b bVar = this.C;
        if (bVar == null || i != bVar.a) {
            this.C = com.google.android.material.carousel.b.c(this, i);
            N2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V(View view, Rect rect) {
        super.V(view, rect);
        float centerY = rect.centerY();
        if (g()) {
            centerY = rect.centerX();
        }
        float u2 = u2(centerY, F2(this.z.h(), centerY, true));
        float width = g() ? (rect.width() - u2) / 2.0f : 0.0f;
        float height = g() ? 0.0f : (rect.height() - u2) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i, int i2) {
        super.W0(recyclerView, i, i2);
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView) {
        super.X0(recyclerView);
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        super.Z0(recyclerView, i, i2);
        X2();
    }

    @Override // ax.u6.InterfaceC3212a
    public int a() {
        return t0();
    }

    @Override // ax.u6.InterfaceC3212a
    public int b() {
        return c0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i) {
        if (this.y == null) {
            return null;
        }
        int v2 = v2(i, s2(i));
        return g() ? new PointF(v2, 0.0f) : new PointF(0.0f, v2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.w wVar, RecyclerView.B b2) {
        if (b2.b() <= 0 || o2() <= 0.0f) {
            p1(wVar);
            this.A = 0;
            return;
        }
        boolean G2 = G2();
        f fVar = this.y;
        boolean z = fVar == null;
        if (z || fVar.g().a() != o2()) {
            M2(wVar);
        }
        int j2 = j2(this.y);
        int g2 = g2(b2, this.y);
        this.t = G2 ? g2 : j2;
        if (G2) {
            g2 = j2;
        }
        this.u = g2;
        if (z) {
            this.s = j2;
            this.B = this.y.i(f(), this.t, this.u, G2());
            int i = this.F;
            if (i != -1) {
                this.s = D2(i, s2(i));
            }
        }
        int i2 = this.s;
        this.s = i2 + i2(0, i2, this.t, this.u);
        this.A = ax.W.a.b(this.A, 0, b2.b());
        W2(this.y);
        C(wVar);
        l2(wVar, b2);
        this.E = f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView.B b2) {
        super.d1(b2);
        if (P() == 0) {
            this.A = 0;
        } else {
            this.A = m0(O(0));
        }
        Y2();
    }

    @Override // ax.u6.InterfaceC3212a
    public int e() {
        return this.G;
    }

    @Override // ax.u6.InterfaceC3212a
    public boolean g() {
        return this.C.a == 0;
    }

    int h2(int i) {
        return (int) (this.s - D2(i, s2(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r() {
        return !g();
    }

    int v2(int i, e eVar) {
        return D2(i, eVar) - this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b2) {
        if (P() == 0 || this.y == null || f() <= 1) {
            return 0;
        }
        return (int) (t0() * (this.y.g().g() / y(b2)));
    }

    public int w2() {
        return this.C.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.B b2) {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int E2;
        if (this.y == null || (E2 = E2(m0(view), s2(m0(view)))) == 0) {
            return false;
        }
        Q2(recyclerView, E2(m0(view), this.y.j(this.s + i2(E2, this.s, this.t, this.u), this.t, this.u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.B b2) {
        return this.u - this.t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.B b2) {
        if (P() == 0 || this.y == null || f() <= 1) {
            return 0;
        }
        return (int) (c0() * (this.y.g().g() / B(b2)));
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c cVar) {
        this(cVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c cVar, int i) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: ax.u6.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager.S1(CarouselLayoutManager.this, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        T2(cVar);
        U2(i);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: ax.u6.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager.S1(CarouselLayoutManager.this, view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        T2(new h());
        S2(context, attributeSet);
    }
}
