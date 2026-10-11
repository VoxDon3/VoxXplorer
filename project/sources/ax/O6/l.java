package ax.O6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes3.dex */
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

    public interface c {
        d a(d dVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    private static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new ax.O6.a(i3));
    }

    private static b d(Context context, int i, int i2, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ax.k6.m.D4);
        try {
            int i3 = obtainStyledAttributes.getInt(ax.k6.m.E4, 0);
            int i4 = obtainStyledAttributes.getInt(ax.k6.m.H4, i3);
            int i5 = obtainStyledAttributes.getInt(ax.k6.m.I4, i3);
            int i6 = obtainStyledAttributes.getInt(ax.k6.m.G4, i3);
            int i7 = obtainStyledAttributes.getInt(ax.k6.m.F4, i3);
            d m2 = m(obtainStyledAttributes, ax.k6.m.J4, dVar);
            d m3 = m(obtainStyledAttributes, ax.k6.m.M4, m2);
            d m4 = m(obtainStyledAttributes, ax.k6.m.N4, m2);
            d m5 = m(obtainStyledAttributes, ax.k6.m.L4, m2);
            return new b().A(i4, m3).E(i5, m4).w(i6, m5).s(i7, m(obtainStyledAttributes, ax.k6.m.K4, m2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new ax.O6.a(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.k6.m.T3, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(ax.k6.m.U3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(ax.k6.m.V3, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    public static d m(TypedArray typedArray, int i, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new ax.O6.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new j(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
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
        return "[" + r() + ", " + t() + ", " + l() + ", " + j() + "]";
    }

    public boolean u() {
        return (this.b instanceof k) && (this.a instanceof k) && (this.c instanceof k) && (this.d instanceof k);
    }

    public boolean v(RectF rectF) {
        boolean z = this.l.getClass().equals(g.class) && this.j.getClass().equals(g.class) && this.i.getClass().equals(g.class) && this.k.getClass().equals(g.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && u();
    }

    public b w() {
        return new b(this);
    }

    public l x(float f) {
        return w().o(f).m();
    }

    public l y(d dVar) {
        return w().p(dVar).m();
    }

    public l z(c cVar) {
        return w().D(cVar.a(r())).H(cVar.a(t())).v(cVar.a(j())).z(cVar.a(l())).m();
    }

    private l(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    public static final class b {
        private e a;
        private e b;
        private e c;
        private e d;
        private d e;
        private d f;
        private d g;
        private d h;
        private g i;
        private g j;
        private g k;
        private g l;

        public b() {
            this.a = i.b();
            this.b = i.b();
            this.c = i.b();
            this.d = i.b();
            this.e = new ax.O6.a(0.0f);
            this.f = new ax.O6.a(0.0f);
            this.g = new ax.O6.a(0.0f);
            this.h = new ax.O6.a(0.0f);
            this.i = i.c();
            this.j = i.c();
            this.k = i.c();
            this.l = i.c();
        }

        private static float n(e eVar) {
            if (eVar instanceof k) {
                return ((k) eVar).a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).a;
            }
            return -1.0f;
        }

        public b A(int i, d dVar) {
            return B(i.a(i)).D(dVar);
        }

        public b B(e eVar) {
            this.a = eVar;
            float n = n(eVar);
            if (n != -1.0f) {
                C(n);
            }
            return this;
        }

        public b C(float f) {
            this.e = new ax.O6.a(f);
            return this;
        }

        public b D(d dVar) {
            this.e = dVar;
            return this;
        }

        public b E(int i, d dVar) {
            return F(i.a(i)).H(dVar);
        }

        public b F(e eVar) {
            this.b = eVar;
            float n = n(eVar);
            if (n != -1.0f) {
                G(n);
            }
            return this;
        }

        public b G(float f) {
            this.f = new ax.O6.a(f);
            return this;
        }

        public b H(d dVar) {
            this.f = dVar;
            return this;
        }

        public l m() {
            return new l(this);
        }

        public b o(float f) {
            return C(f).G(f).y(f).u(f);
        }

        public b p(d dVar) {
            return D(dVar).H(dVar).z(dVar).v(dVar);
        }

        public b q(int i, float f) {
            return r(i.a(i)).o(f);
        }

        public b r(e eVar) {
            return B(eVar).F(eVar).x(eVar).t(eVar);
        }

        public b s(int i, d dVar) {
            return t(i.a(i)).v(dVar);
        }

        public b t(e eVar) {
            this.d = eVar;
            float n = n(eVar);
            if (n != -1.0f) {
                u(n);
            }
            return this;
        }

        public b u(float f) {
            this.h = new ax.O6.a(f);
            return this;
        }

        public b v(d dVar) {
            this.h = dVar;
            return this;
        }

        public b w(int i, d dVar) {
            return x(i.a(i)).z(dVar);
        }

        public b x(e eVar) {
            this.c = eVar;
            float n = n(eVar);
            if (n != -1.0f) {
                y(n);
            }
            return this;
        }

        public b y(float f) {
            this.g = new ax.O6.a(f);
            return this;
        }

        public b z(d dVar) {
            this.g = dVar;
            return this;
        }

        public b(l lVar) {
            this.a = i.b();
            this.b = i.b();
            this.c = i.b();
            this.d = i.b();
            this.e = new ax.O6.a(0.0f);
            this.f = new ax.O6.a(0.0f);
            this.g = new ax.O6.a(0.0f);
            this.h = new ax.O6.a(0.0f);
            this.i = i.c();
            this.j = i.c();
            this.k = i.c();
            this.l = i.c();
            this.a = lVar.a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.d = lVar.d;
            this.e = lVar.e;
            this.f = lVar.f;
            this.g = lVar.g;
            this.h = lVar.h;
            this.i = lVar.i;
            this.j = lVar.j;
            this.k = lVar.k;
            this.l = lVar.l;
        }
    }

    public l() {
        this.a = i.b();
        this.b = i.b();
        this.c = i.b();
        this.d = i.b();
        this.e = new ax.O6.a(0.0f);
        this.f = new ax.O6.a(0.0f);
        this.g = new ax.O6.a(0.0f);
        this.h = new ax.O6.a(0.0f);
        this.i = i.c();
        this.j = i.c();
        this.k = i.c();
        this.l = i.c();
    }
}
