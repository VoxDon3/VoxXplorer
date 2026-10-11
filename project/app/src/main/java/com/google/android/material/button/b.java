/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import ax.F6.z;
import ax.O6.h;
import ax.O6.o;
import ax.O6.q;
import ax.k6.c;
import ax.k6.m;
import ax.u0.l;
import ax.z6.a;
import com.google.android.material.button.MaterialButton;

class b {
    private final MaterialButton a;
    private ax.O6.l b;
    private q c;
    private l d;
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
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t;
    private boolean u = true;
    private LayerDrawable v;
    private int w;

    b(MaterialButton materialButton, ax.O6.l l8) {
        this.a = materialButton;
        this.b = l8;
    }

    private void L(int n8, int n9) {
        int n10 = this.a.getPaddingStart();
        int n11 = this.a.getPaddingTop();
        int n12 = this.a.getPaddingEnd();
        int n13 = this.a.getPaddingBottom();
        int n14 = this.h;
        int n15 = this.i;
        this.i = n9;
        this.h = n8;
        if (!this.r) {
            this.M();
        }
        this.a.setPaddingRelative(n10, n11 + n8 - n14, n12, n13 + n9 - n15);
    }

    private void M() {
        this.a.setInternalBackground(this.a());
        h h8 = this.g();
        if (h8 != null) {
            h8.f0(this.w);
            h8.setState(this.a.getDrawableState());
        }
    }

    private void N() {
        Object object;
        if (Build.VERSION.SDK_INT < 23 && !this.r) {
            int n8 = this.a.getPaddingStart();
            int n9 = this.a.getPaddingTop();
            int n10 = this.a.getPaddingEnd();
            int n11 = this.a.getPaddingBottom();
            this.M();
            this.a.setPaddingRelative(n8, n9, n10, n11);
            return;
        }
        o o8 = this.g();
        if (o8 != null) {
            object = this.c;
            if (object != null) {
                ((h)o8).l0((q)object);
            } else {
                ((h)o8).setShapeAppearanceModel(this.b);
            }
            object = this.d;
            if (object != null) {
                ((h)o8).e0((l)object);
            }
        }
        if ((o8 = this.p()) != null) {
            object = this.c;
            if (object != null) {
                ((h)o8).l0((q)object);
            } else {
                ((h)o8).setShapeAppearanceModel(this.b);
            }
            object = this.d;
            if (object != null) {
                ((h)o8).e0((l)object);
            }
        }
        if ((o8 = this.f()) != null) {
            o8.setShapeAppearanceModel(this.b);
            if (o8 instanceof h) {
                o8 = (h)o8;
                object = this.c;
                if (object != null) {
                    ((h)o8).l0((q)object);
                }
                if ((object = this.d) != null) {
                    ((h)o8).e0((l)object);
                }
            }
        }
    }

    private void P() {
        h h8 = this.g();
        h h9 = this.p();
        if (h8 != null) {
            h8.n0(this.k, this.n);
            if (h9 != null) {
                float f8 = this.k;
                int n8 = this.q ? ax.z6.a.d((View)this.a, ax.k6.c.i) : 0;
                h9.m0(f8, n8);
            }
        }
    }

    private InsetDrawable Q(Drawable drawable) {
        return new InsetDrawable(drawable, this.f, this.h, this.g, this.i);
    }

    private Drawable a() {
        h h8 = new h(this.b);
        Object object = this.c;
        if (object != null) {
            h8.l0((q)object);
        }
        if ((object = this.d) != null) {
            h8.e0((l)object);
        }
        if ((object = this.e) != null) {
            h8.i0((h.d)object);
        }
        h8.U(this.a.getContext());
        h8.setTintList(this.m);
        object = this.l;
        if (object != null) {
            h8.setTintMode((PorterDuff.Mode)object);
        }
        h8.n0(this.k, this.n);
        object = new h(this.b);
        Object object2 = this.c;
        if (object2 != null) {
            ((h)object).l0((q)object2);
        }
        if ((object2 = this.d) != null) {
            ((h)object).e0((l)object2);
        }
        ((h)object).setTint(0);
        float f8 = this.k;
        int n8 = this.q ? ax.z6.a.d((View)this.a, ax.k6.c.i) : 0;
        ((h)object).m0(f8, n8);
        object2 = new h(this.b);
        this.p = object2;
        q q8 = this.c;
        if (q8 != null) {
            ((h)object2).l0(q8);
        }
        if ((object2 = this.d) != null) {
            ((h)this.p).e0((l)object2);
        }
        this.p.setTint(-1);
        h8 = new RippleDrawable(ax.L6.a.e(this.o), (Drawable)this.Q((Drawable)new LayerDrawable(new Drawable[]{object, h8})), this.p);
        this.v = h8;
        return h8;
    }

    private h h(boolean bl) {
        LayerDrawable layerDrawable = this.v;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            return (h)((LayerDrawable)((InsetDrawable)this.v.getDrawable(0)).getDrawable()).getDrawable(bl ^ 1);
        }
        return null;
    }

    private h p() {
        return this.h(true);
    }

    public void A(int n8) {
        this.L(this.h, n8);
    }

    public void B(int n8) {
        this.L(n8, this.i);
    }

    void C(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            if (this.a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable)this.a.getBackground()).setColor(ax.L6.a.e(colorStateList));
            }
        }
    }

    void D(ax.O6.l l8) {
        this.b = l8;
        this.c = null;
        this.N();
    }

    void E(boolean bl) {
        this.q = bl;
        this.P();
    }

    void F(q q8) {
        this.c = q8;
        this.N();
    }

    void G(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            this.P();
        }
    }

    void H(int n8) {
        if (this.k != n8) {
            this.k = n8;
            this.P();
        }
    }

    void I(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            if (this.g() != null) {
                this.g().setTintList(this.m);
            }
        }
    }

    void J(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            if (this.g() != null && this.l != null) {
                this.g().setTintMode(this.l);
            }
        }
    }

    void K(boolean bl) {
        this.u = bl;
    }

    void O(int n8, int n9) {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(this.f, this.h, n9 - this.g, n8 - this.i);
        }
    }

    int b() {
        return this.j;
    }

    l c() {
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
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.v.getNumberOfLayers() > 2) {
                return (o)this.v.getDrawable(2);
            }
            return (o)this.v.getDrawable(1);
        }
        return null;
    }

    h g() {
        return this.h(false);
    }

    ColorStateList i() {
        return this.o;
    }

    ax.O6.l j() {
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
        this.f = typedArray.getDimensionPixelOffset(ax.k6.m.w2, 0);
        this.g = typedArray.getDimensionPixelOffset(ax.k6.m.x2, 0);
        this.h = typedArray.getDimensionPixelOffset(ax.k6.m.y2, 0);
        this.i = typedArray.getDimensionPixelOffset(ax.k6.m.z2, 0);
        int n8 = ax.k6.m.D2;
        if (typedArray.hasValue(n8)) {
            this.j = n8 = typedArray.getDimensionPixelSize(n8, -1);
            this.D(this.b.x(n8));
            this.s = true;
        }
        this.k = typedArray.getDimensionPixelSize(ax.k6.m.P2, 0);
        this.l = z.i(typedArray.getInt(ax.k6.m.C2, -1), PorterDuff.Mode.SRC_IN);
        this.m = ax.K6.c.a(this.a.getContext(), typedArray, ax.k6.m.B2);
        this.n = ax.K6.c.a(this.a.getContext(), typedArray, ax.k6.m.O2);
        this.o = ax.K6.c.a(this.a.getContext(), typedArray, ax.k6.m.M2);
        this.t = typedArray.getBoolean(ax.k6.m.A2, false);
        this.w = typedArray.getDimensionPixelSize(ax.k6.m.E2, 0);
        this.u = typedArray.getBoolean(ax.k6.m.Q2, true);
        n8 = this.a.getPaddingStart();
        int n9 = this.a.getPaddingTop();
        int n10 = this.a.getPaddingEnd();
        int n11 = this.a.getPaddingBottom();
        if (typedArray.hasValue(ax.k6.m.u2)) {
            this.v();
        } else {
            this.M();
        }
        this.a.setPaddingRelative(n8 + this.f, n9 + this.h, n10 + this.g, n11 + this.i);
    }

    void u(int n8) {
        if (this.g() != null) {
            this.g().setTint(n8);
        }
    }

    void v() {
        this.r = true;
        this.a.setSupportBackgroundTintList(this.m);
        this.a.setSupportBackgroundTintMode(this.l);
    }

    void w(boolean bl) {
        this.t = bl;
    }

    void x(int n8) {
        if (this.s && this.j == n8) {
            return;
        }
        this.j = n8;
        this.s = true;
        this.D(this.b.x(n8));
    }

    void y(h.d d8) {
        this.e = d8;
        h h8 = this.g();
        if (h8 != null) {
            h8.i0(d8);
        }
    }

    void z(l l8) {
        this.d = l8;
        if (this.c != null) {
            this.N();
        }
    }
}

