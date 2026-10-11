/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import ax.O6.a;
import ax.O6.d;
import ax.O6.e;
import ax.O6.f;
import ax.O6.g;
import ax.O6.i;
import ax.O6.j;
import ax.O6.k;
import ax.k6.m;

public class l {
    public static final d m = new j(0.5f);
    e a;
    e b;
    e c;
    e d;
    d e;
    d f;
    d g;
    d h;
    g i;
    g j;
    g k;
    g l;

    public l() {
        this.a = ax.O6.i.b();
        this.b = ax.O6.i.b();
        this.c = ax.O6.i.b();
        this.d = ax.O6.i.b();
        this.e = new a(0.0f);
        this.f = new a(0.0f);
        this.g = new a(0.0f);
        this.h = new a(0.0f);
        this.i = ax.O6.i.c();
        this.j = ax.O6.i.c();
        this.k = ax.O6.i.c();
        this.l = ax.O6.i.c();
    }

    private l(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
        this.e = b8.e;
        this.f = b8.f;
        this.g = b8.g;
        this.h = b8.h;
        this.i = b8.i;
        this.j = b8.j;
        this.k = b8.k;
        this.l = b8.l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int n8, int n9) {
        return ax.O6.l.c(context, n8, n9, 0);
    }

    private static b c(Context context, int n8, int n9, int n10) {
        return ax.O6.l.d(context, n8, n9, new a(n10));
    }

    private static b d(Context context, int n8, int n9, d object) {
        context = new ContextThemeWrapper(context, n8);
        if (n9 != 0) {
            context.getTheme().applyStyle(n9, true);
        }
        context = context.obtainStyledAttributes(ax.k6.m.D4);
        try {
            int n10 = context.getInt(ax.k6.m.E4, 0);
            n8 = context.getInt(ax.k6.m.H4, n10);
            n9 = context.getInt(ax.k6.m.I4, n10);
            int n11 = context.getInt(ax.k6.m.G4, n10);
            n10 = context.getInt(ax.k6.m.F4, n10);
            Object object2 = ax.O6.l.m((TypedArray)context, ax.k6.m.J4, (d)object);
            d d8 = ax.O6.l.m((TypedArray)context, ax.k6.m.M4, (d)object2);
            object = ax.O6.l.m((TypedArray)context, ax.k6.m.N4, (d)object2);
            d d9 = ax.O6.l.m((TypedArray)context, ax.k6.m.L4, (d)object2);
            d d10 = ax.O6.l.m((TypedArray)context, ax.k6.m.K4, (d)object2);
            object2 = new b();
            object = ((b)object2).A(n8, d8).E(n9, (d)object).w(n11, d9).s(n10, d10);
            return object;
        }
        finally {
            context.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int n8, int n9) {
        return ax.O6.l.f(context, attributeSet, n8, n9, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int n8, int n9, int n10) {
        return ax.O6.l.g(context, attributeSet, n8, n9, new a(n10));
    }

    public static b g(Context context, AttributeSet attributeSet, int n8, int n9, d d8) {
        attributeSet = context.obtainStyledAttributes(attributeSet, ax.k6.m.T3, n8, n9);
        n8 = attributeSet.getResourceId(ax.k6.m.U3, 0);
        n9 = attributeSet.getResourceId(ax.k6.m.V3, 0);
        attributeSet.recycle();
        return ax.O6.l.d(context, n8, n9, d8);
    }

    public static d m(TypedArray typedArray, int n8, d d8) {
        TypedValue typedValue = typedArray.peekValue(n8);
        if (typedValue != null) {
            n8 = typedValue.type;
            if (n8 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize((int)typedValue.data, (DisplayMetrics)typedArray.getResources().getDisplayMetrics()));
            }
            if (n8 == 6) {
                return new j(typedValue.getFraction(1.0f, 1.0f));
            }
        }
        return d8;
    }

    public g h() {
        return this.k;
    }

    public e i() {
        return this.d;
    }

    public d j() {
        return this.h;
    }

    public e k() {
        return this.c;
    }

    public d l() {
        return this.g;
    }

    public g n() {
        return this.l;
    }

    public g o() {
        return this.j;
    }

    public g p() {
        return this.i;
    }

    public e q() {
        return this.a;
    }

    public d r() {
        return this.e;
    }

    public e s() {
        return this.b;
    }

    public d t() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.r());
        stringBuilder.append(", ");
        stringBuilder.append(this.t());
        stringBuilder.append(", ");
        stringBuilder.append(this.l());
        stringBuilder.append(", ");
        stringBuilder.append(this.j());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean u() {
        return this.b instanceof k && this.a instanceof k && this.c instanceof k && this.d instanceof k;
    }

    public boolean v(RectF rectF) {
        boolean bl = this.l.getClass().equals(g.class) && this.j.getClass().equals(g.class) && this.i.getClass().equals(g.class) && this.k.getClass().equals(g.class);
        float f8 = this.e.a(rectF);
        boolean bl2 = this.f.a(rectF) == f8 && this.h.a(rectF) == f8 && this.g.a(rectF) == f8;
        return bl && bl2 && this.u();
    }

    public b w() {
        return new b(this);
    }

    public l x(float f8) {
        return this.w().o(f8).m();
    }

    public l y(d d8) {
        return this.w().p(d8).m();
    }

    public l z(c c8) {
        return this.w().D(c8.a(this.r())).H(c8.a(this.t())).v(c8.a(this.j())).z(c8.a(this.l())).m();
    }

    public static final class b {
        private e a = ax.O6.i.b();
        private e b = ax.O6.i.b();
        private e c = ax.O6.i.b();
        private e d = ax.O6.i.b();
        private d e = new a(0.0f);
        private d f = new a(0.0f);
        private d g = new a(0.0f);
        private d h = new a(0.0f);
        private g i = ax.O6.i.c();
        private g j = ax.O6.i.c();
        private g k = ax.O6.i.c();
        private g l = ax.O6.i.c();

        public b() {
        }

        public b(l l8) {
            this.a = l8.a;
            this.b = l8.b;
            this.c = l8.c;
            this.d = l8.d;
            this.e = l8.e;
            this.f = l8.f;
            this.g = l8.g;
            this.h = l8.h;
            this.i = l8.i;
            this.j = l8.j;
            this.k = l8.k;
            this.l = l8.l;
        }

        private static float n(e e8) {
            if (e8 instanceof k) {
                return ((k)e8).a;
            }
            if (e8 instanceof f) {
                return ((f)e8).a;
            }
            return -1.0f;
        }

        public b A(int n8, d d8) {
            return this.B(ax.O6.i.a(n8)).D(d8);
        }

        public b B(e e8) {
            this.a = e8;
            float f8 = ax.O6.l$b.n(e8);
            if (f8 != -1.0f) {
                this.C(f8);
            }
            return this;
        }

        public b C(float f8) {
            this.e = new a(f8);
            return this;
        }

        public b D(d d8) {
            this.e = d8;
            return this;
        }

        public b E(int n8, d d8) {
            return this.F(ax.O6.i.a(n8)).H(d8);
        }

        public b F(e e8) {
            this.b = e8;
            float f8 = ax.O6.l$b.n(e8);
            if (f8 != -1.0f) {
                this.G(f8);
            }
            return this;
        }

        public b G(float f8) {
            this.f = new a(f8);
            return this;
        }

        public b H(d d8) {
            this.f = d8;
            return this;
        }

        public l m() {
            return new l(this);
        }

        public b o(float f8) {
            return this.C(f8).G(f8).y(f8).u(f8);
        }

        public b p(d d8) {
            return this.D(d8).H(d8).z(d8).v(d8);
        }

        public b q(int n8, float f8) {
            return this.r(ax.O6.i.a(n8)).o(f8);
        }

        public b r(e e8) {
            return this.B(e8).F(e8).x(e8).t(e8);
        }

        public b s(int n8, d d8) {
            return this.t(ax.O6.i.a(n8)).v(d8);
        }

        public b t(e e8) {
            this.d = e8;
            float f8 = ax.O6.l$b.n(e8);
            if (f8 != -1.0f) {
                this.u(f8);
            }
            return this;
        }

        public b u(float f8) {
            this.h = new a(f8);
            return this;
        }

        public b v(d d8) {
            this.h = d8;
            return this;
        }

        public b w(int n8, d d8) {
            return this.x(ax.O6.i.a(n8)).z(d8);
        }

        public b x(e e8) {
            this.c = e8;
            float f8 = ax.O6.l$b.n(e8);
            if (f8 != -1.0f) {
                this.y(f8);
            }
            return this;
        }

        public b y(float f8) {
            this.g = new a(f8);
            return this;
        }

        public b z(d d8) {
            this.g = d8;
            return this;
        }
    }

    public static interface c {
        public d a(d var1);
    }
}

