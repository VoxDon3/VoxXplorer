package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import ax.F6.z;
import ax.K6.c;
import ax.O6.h;
import ax.O6.l;
import ax.O6.o;
import ax.O6.q;
import ax.k6.C2402c;
import ax.k6.m;
import ax.u0.C3174l;
import ax.z6.C3555a;

/* loaded from: classes3.dex */
class b {
    private final MaterialButton a;
    private l b;
    private q c;
    private C3174l d;
    private h.d e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private PorterDuff.Mode l;
    private ColorStateList m;
    private ColorStateList n;
    private ColorStateList o;
    private Drawable p;
    private boolean t;
    private LayerDrawable v;
    private int w;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean u = true;

    b(MaterialButton materialButton, l lVar) {
        this.a = materialButton;
        this.b = lVar;
    }

    private void L(int i, int i2) {
        int paddingStart = this.a.getPaddingStart();
        int paddingTop = this.a.getPaddingTop();
        int paddingEnd = this.a.getPaddingEnd();
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            M();
        }
        this.a.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    private void M() {
        this.a.setInternalBackground(a());
        h g = g();
        if (g != null) {
            g.f0(this.w);
            g.setState(this.a.getDrawableState());
        }
    }

    private void N() {
        if (Build.VERSION.SDK_INT < 23 && !this.r) {
            int paddingStart = this.a.getPaddingStart();
            int paddingTop = this.a.getPaddingTop();
            int paddingEnd = this.a.getPaddingEnd();
            int paddingBottom = this.a.getPaddingBottom();
            M();
            this.a.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        h g = g();
        if (g != null) {
            q qVar = this.c;
            if (qVar != null) {
                g.l0(qVar);
            } else {
                g.setShapeAppearanceModel(this.b);
            }
            C3174l c3174l = this.d;
            if (c3174l != null) {
                g.e0(c3174l);
            }
        }
        h p = p();
        if (p != null) {
            q qVar2 = this.c;
            if (qVar2 != null) {
                p.l0(qVar2);
            } else {
                p.setShapeAppearanceModel(this.b);
            }
            C3174l c3174l2 = this.d;
            if (c3174l2 != null) {
                p.e0(c3174l2);
            }
        }
        o f = f();
        if (f != null) {
            f.setShapeAppearanceModel(this.b);
            if (f instanceof h) {
                h hVar = (h) f;
                q qVar3 = this.c;
                if (qVar3 != null) {
                    hVar.l0(qVar3);
                }
                C3174l c3174l3 = this.d;
                if (c3174l3 != null) {
                    hVar.e0(c3174l3);
                }
            }
        }
    }

    private void P() {
        h g = g();
        h p = p();
        if (g != null) {
            g.n0(this.k, this.n);
            if (p != null) {
                p.m0(this.k, this.q ? C3555a.d(this.a, C2402c.i) : 0);
            }
        }
    }

    private InsetDrawable Q(Drawable drawable) {
        return new InsetDrawable(drawable, this.f, this.h, this.g, this.i);
    }

    private Drawable a() {
        h hVar = new h(this.b);
        q qVar = this.c;
        if (qVar != null) {
            hVar.l0(qVar);
        }
        C3174l c3174l = this.d;
        if (c3174l != null) {
            hVar.e0(c3174l);
        }
        h.d dVar = this.e;
        if (dVar != null) {
            hVar.i0(dVar);
        }
        hVar.U(this.a.getContext());
        hVar.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            hVar.setTintMode(mode);
        }
        hVar.n0(this.k, this.n);
        h hVar2 = new h(this.b);
        q qVar2 = this.c;
        if (qVar2 != null) {
            hVar2.l0(qVar2);
        }
        C3174l c3174l2 = this.d;
        if (c3174l2 != null) {
            hVar2.e0(c3174l2);
        }
        hVar2.setTint(0);
        hVar2.m0(this.k, this.q ? C3555a.d(this.a, C2402c.i) : 0);
        h hVar3 = new h(this.b);
        this.p = hVar3;
        q qVar3 = this.c;
        if (qVar3 != null) {
            hVar3.l0(qVar3);
        }
        C3174l c3174l3 = this.d;
        if (c3174l3 != null) {
            ((h) this.p).e0(c3174l3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(ax.L6.a.e(this.o), Q(new LayerDrawable(new Drawable[]{hVar2, hVar})), this.p);
        this.v = rippleDrawable;
        return rippleDrawable;
    }

    private h h(boolean z) {
        LayerDrawable layerDrawable = this.v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    private h p() {
        return h(true);
    }

    public void A(int i) {
        L(this.h, i);
    }

    public void B(int i) {
        L(i, this.i);
    }

    void C(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            if (this.a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.a.getBackground()).setColor(ax.L6.a.e(colorStateList));
            }
        }
    }

    void D(l lVar) {
        this.b = lVar;
        this.c = null;
        N();
    }

    void E(boolean z) {
        this.q = z;
        P();
    }

    void F(q qVar) {
        this.c = qVar;
        N();
    }

    void G(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            P();
        }
    }

    void H(int i) {
        if (this.k != i) {
            this.k = i;
            P();
        }
    }

    void I(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            if (g() != null) {
                g().setTintList(this.m);
            }
        }
    }

    void J(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            if (g() == null || this.l == null) {
                return;
            }
            g().setTintMode(this.l);
        }
    }

    void K(boolean z) {
        this.u = z;
    }

    void O(int i, int i2) {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(this.f, this.h, i2 - this.g, i - this.i);
        }
    }

    int b() {
        return this.j;
    }

    C3174l c() {
        return this.d;
    }

    public int d() {
        return this.i;
    }

    public int e() {
        return this.h;
    }

    public o f() {
        LayerDrawable layerDrawable = this.v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.v.getNumberOfLayers() > 2 ? (o) this.v.getDrawable(2) : (o) this.v.getDrawable(1);
    }

    h g() {
        return h(false);
    }

    ColorStateList i() {
        return this.o;
    }

    l j() {
        return this.b;
    }

    q k() {
        return this.c;
    }

    ColorStateList l() {
        return this.n;
    }

    int m() {
        return this.k;
    }

    ColorStateList n() {
        return this.m;
    }

    PorterDuff.Mode o() {
        return this.l;
    }

    boolean q() {
        return this.r;
    }

    boolean r() {
        return this.t;
    }

    boolean s() {
        return this.u;
    }

    void t(TypedArray typedArray) {
        this.f = typedArray.getDimensionPixelOffset(m.w2, 0);
        this.g = typedArray.getDimensionPixelOffset(m.x2, 0);
        this.h = typedArray.getDimensionPixelOffset(m.y2, 0);
        this.i = typedArray.getDimensionPixelOffset(m.z2, 0);
        int i = m.D2;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.j = dimensionPixelSize;
            D(this.b.x(dimensionPixelSize));
            this.s = true;
        }
        this.k = typedArray.getDimensionPixelSize(m.P2, 0);
        this.l = z.i(typedArray.getInt(m.C2, -1), PorterDuff.Mode.SRC_IN);
        this.m = c.a(this.a.getContext(), typedArray, m.B2);
        this.n = c.a(this.a.getContext(), typedArray, m.O2);
        this.o = c.a(this.a.getContext(), typedArray, m.M2);
        this.t = typedArray.getBoolean(m.A2, false);
        this.w = typedArray.getDimensionPixelSize(m.E2, 0);
        this.u = typedArray.getBoolean(m.Q2, true);
        int paddingStart = this.a.getPaddingStart();
        int paddingTop = this.a.getPaddingTop();
        int paddingEnd = this.a.getPaddingEnd();
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(m.u2)) {
            v();
        } else {
            M();
        }
        this.a.setPaddingRelative(paddingStart + this.f, paddingTop + this.h, paddingEnd + this.g, paddingBottom + this.i);
    }

    void u(int i) {
        if (g() != null) {
            g().setTint(i);
        }
    }

    void v() {
        this.r = true;
        this.a.setSupportBackgroundTintList(this.m);
        this.a.setSupportBackgroundTintMode(this.l);
    }

    void w(boolean z) {
        this.t = z;
    }

    void x(int i) {
        if (this.s && this.j == i) {
            return;
        }
        this.j = i;
        this.s = true;
        D(this.b.x(i));
    }

    void y(h.d dVar) {
        this.e = dVar;
        h g = g();
        if (g != null) {
            g.i0(dVar);
        }
    }

    void z(C3174l c3174l) {
        this.d = c3174l;
        if (this.c != null) {
            N();
        }
    }
}
