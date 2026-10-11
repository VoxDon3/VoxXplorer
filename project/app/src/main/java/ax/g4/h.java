/*
 * Decompiled with CFR 0.152.
 */
package ax.g4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import ax.M3.a;
import ax.P3.i;
import ax.P3.o;
import ax.P3.s;
import ax.g4.c;
import ax.g4.e;
import ax.g4.f;
import ax.g4.g;
import ax.h4.d;
import ax.k4.i;
import ax.l4.a;

public final class h<R>
implements ax.g4.b,
d,
g,
a.f {
    private static final ax.b0.d<h<?>> x0 = ax.l4.a.d(150, new a.d<h<?>>(){

        public h<?> b() {
            return new h();
        }
    });
    private static boolean y0 = true;
    private final ax.l4.b c0;
    private c d0;
    private ax.J3.e e0;
    private Object f0;
    private Class<R> g0;
    private f h0;
    private int i0;
    private int j0;
    private ax.J3.g k0;
    private ax.h4.e<R> l0;
    private ax.P3.i m0;
    private ax.i4.c<? super R> n0;
    private s<R> o0;
    private i.d p0;
    private final String q = String.valueOf(super.hashCode());
    private long q0;
    private b r0;
    private Drawable s0;
    private Drawable t0;
    private Drawable u0;
    private int v0;
    private int w0;

    h() {
        this.c0 = ax.l4.b.a();
    }

    private void A(s<?> s8) {
        this.m0.k(s8);
        this.o0 = null;
    }

    private void B() {
        if (!this.g()) {
            return;
        }
        Drawable drawable = this.f0 == null ? this.n() : null;
        Drawable drawable2 = drawable;
        if (drawable == null) {
            drawable2 = this.m();
        }
        drawable = drawable2;
        if (drawable2 == null) {
            drawable = this.o();
        }
        this.l0.i(drawable);
    }

    private boolean g() {
        c c8 = this.d0;
        return c8 == null || c8.b(this);
        {
        }
    }

    private boolean j() {
        c c8 = this.d0;
        return c8 == null || c8.g(this);
        {
        }
    }

    private Drawable m() {
        if (this.s0 == null) {
            Drawable drawable;
            this.s0 = drawable = this.h0.m();
            if (drawable == null && this.h0.l() > 0) {
                this.s0 = this.r(this.h0.l());
            }
        }
        return this.s0;
    }

    private Drawable n() {
        if (this.u0 == null) {
            Drawable drawable;
            this.u0 = drawable = this.h0.n();
            if (drawable == null && this.h0.o() > 0) {
                this.u0 = this.r(this.h0.o());
            }
        }
        return this.u0;
    }

    private Drawable o() {
        if (this.t0 == null) {
            Drawable drawable;
            this.t0 = drawable = this.h0.w();
            if (drawable == null && this.h0.x() > 0) {
                this.t0 = this.r(this.h0.x());
            }
        }
        return this.t0;
    }

    private void p(ax.J3.e e8, Object object, Class<R> clazz, f f8, int n8, int n9, ax.J3.g g8, ax.h4.e<R> e9, e<R> e10, c c8, ax.P3.i i8, ax.i4.c<? super R> c9) {
        this.e0 = e8;
        this.f0 = object;
        this.g0 = clazz;
        this.h0 = f8;
        this.i0 = n8;
        this.j0 = n9;
        this.k0 = g8;
        this.l0 = e9;
        this.d0 = c8;
        this.m0 = i8;
        this.n0 = c9;
        this.r0 = b.q;
    }

    private boolean q() {
        c c8 = this.d0;
        return c8 == null || !c8.a();
        {
        }
    }

    private Drawable r(int n8) {
        if (y0) {
            return this.t(n8);
        }
        return this.s(n8);
    }

    private Drawable s(int n8) {
        return ax.S.h.e(this.e0.getResources(), n8, this.h0.D());
    }

    private Drawable t(int n8) {
        try {
            Drawable drawable = ax.o.a.b((Context)this.e0, n8);
            return drawable;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            y0 = false;
            return this.s(n8);
        }
    }

    private void u(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" this: ");
        stringBuilder.append(this.q);
        Log.v((String)"Request", (String)stringBuilder.toString());
    }

    private static int v(int n8, float f8) {
        if (n8 == Integer.MIN_VALUE) {
            return n8;
        }
        return Math.round(f8 * (float)n8);
    }

    private void w() {
        c c8 = this.d0;
        if (c8 != null) {
            c8.e(this);
        }
    }

    public static <R> h<R> x(ax.J3.e e8, Object object, Class<R> clazz, f f8, int n8, int n9, ax.J3.g g8, ax.h4.e<R> e9, e<R> e10, c c8, ax.P3.i i8, ax.i4.c<? super R> c9) {
        h<?> h8;
        h<Object> h9 = h8 = x0.b();
        if (h8 == null) {
            h9 = new h<R>();
        }
        super.p(e8, object, clazz, f8, n8, n9, g8, e9, e10, c8, i8, c9);
        return h9;
    }

    private void y(o o8, int n8) {
        this.c0.c();
        int n9 = this.e0.d();
        if (n9 <= n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Load failed for ");
            stringBuilder.append(this.f0);
            stringBuilder.append(" with size [");
            stringBuilder.append(this.v0);
            stringBuilder.append("x");
            stringBuilder.append(this.w0);
            stringBuilder.append("]");
            Log.w((String)"Glide", (String)stringBuilder.toString(), (Throwable)o8);
            if (n9 <= 4) {
                o8.g("Glide");
            }
        }
        this.p0 = null;
        this.r0 = b.f0;
        this.B();
    }

    private void z(s<R> b8, R r8, a a8) {
        boolean bl = this.q();
        this.r0 = b.e0;
        this.o0 = b8;
        if (this.e0.d() <= 3) {
            b8 = new StringBuilder();
            ((StringBuilder)((Object)b8)).append("Finished loading ");
            ((StringBuilder)((Object)b8)).append(r8.getClass().getSimpleName());
            ((StringBuilder)((Object)b8)).append(" from ");
            ((StringBuilder)((Object)b8)).append((Object)a8);
            ((StringBuilder)((Object)b8)).append(" for ");
            ((StringBuilder)((Object)b8)).append(this.f0);
            ((StringBuilder)((Object)b8)).append(" with size [");
            ((StringBuilder)((Object)b8)).append(this.v0);
            ((StringBuilder)((Object)b8)).append("x");
            ((StringBuilder)((Object)b8)).append(this.w0);
            ((StringBuilder)((Object)b8)).append("] in ");
            ((StringBuilder)((Object)b8)).append(ax.k4.d.a(this.q0));
            ((StringBuilder)((Object)b8)).append(" ms");
            Log.d((String)"Glide", (String)((StringBuilder)((Object)b8)).toString());
        }
        b8 = this.n0.a(a8, bl);
        this.l0.c(r8, b8);
        this.w();
    }

    @Override
    public void a(o o8) {
        this.y(o8, 5);
    }

    @Override
    public void b(s<?> object, a object2) {
        this.c0.c();
        this.p0 = null;
        if (object == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Expected to receive a Resource<R> with an object of ");
            ((StringBuilder)object).append(this.g0);
            ((StringBuilder)object).append(" inside, but instead got null.");
            this.a(new o(((StringBuilder)object).toString()));
            return;
        }
        Object obj = object.get();
        if (obj != null && this.g0.isAssignableFrom(obj.getClass())) {
            if (!this.j()) {
                this.A((s<?>)object);
                this.r0 = b.e0;
                return;
            }
            this.z((s<R>)object, (R)obj, (a)((Object)object2));
            return;
        }
        this.A((s<?>)object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected to receive an object of ");
        stringBuilder.append(this.g0);
        stringBuilder.append(" but instead got ");
        String string = "";
        object2 = obj != null ? obj.getClass() : "";
        stringBuilder.append(object2);
        stringBuilder.append("{");
        stringBuilder.append(obj);
        stringBuilder.append("} inside Resource{");
        stringBuilder.append(object);
        stringBuilder.append("}.");
        object = obj != null ? string : " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
        stringBuilder.append((String)object);
        this.a(new o(stringBuilder.toString()));
    }

    @Override
    public boolean c() {
        return this.i();
    }

    @Override
    public void clear() {
        i.b();
        Object object = this.r0;
        b b8 = b.h0;
        if (object == b8) {
            return;
        }
        this.k();
        object = this.o0;
        if (object != null) {
            this.A((s<?>)object);
        }
        if (this.g()) {
            this.l0.l(this.o());
        }
        this.r0 = b8;
    }

    @Override
    public boolean d(ax.g4.b b8) {
        if (b8 instanceof h) {
            b8 = (h)b8;
            if (this.i0 == ((h)b8).i0 && this.j0 == ((h)b8).j0 && i.c(this.f0, ((h)b8).f0) && this.g0.equals(((h)b8).g0) && this.h0.equals(((h)b8).h0) && this.k0 == ((h)b8).k0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void e(int n8, int n9) {
        StringBuilder stringBuilder;
        this.c0.c();
        if (Log.isLoggable((String)"Request", (int)2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Got onSizeReady in ");
            stringBuilder.append(ax.k4.d.a(this.q0));
            this.u(stringBuilder.toString());
        }
        if (this.r0 == b.d0) {
            this.r0 = b.c0;
            float f8 = this.h0.C();
            this.v0 = h.v(n8, f8);
            this.w0 = h.v(n9, f8);
            if (Log.isLoggable((String)"Request", (int)2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("finished setup for calling load in ");
                stringBuilder.append(ax.k4.d.a(this.q0));
                this.u(stringBuilder.toString());
            }
            this.p0 = this.m0.g(this.e0, this.f0, this.h0.B(), this.v0, this.w0, this.h0.z(), this.g0, this.k0, this.h0.k(), this.h0.E(), this.h0.L(), this.h0.I(), this.h0.s(), this.h0.G(), this.h0.F(), this.h0.r(), this);
            if (Log.isLoggable((String)"Request", (int)2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("finished onSizeReady in ");
                stringBuilder.append(ax.k4.d.a(this.q0));
                this.u(stringBuilder.toString());
            }
        }
    }

    @Override
    public void f() {
        this.clear();
        this.r0 = b.i0;
    }

    @Override
    public void h() {
        this.c0.c();
        this.q0 = ax.k4.d.b();
        if (this.f0 == null) {
            if (i.r(this.i0, this.j0)) {
                this.v0 = this.i0;
                this.w0 = this.j0;
            }
            int n8 = this.n() == null ? 5 : 3;
            this.y(new o("Received null model"), n8);
            return;
        }
        b b8 = this.r0;
        Object object = b.c0;
        if (b8 != object) {
            if (b8 == b.e0) {
                this.b(this.o0, a.f0);
                return;
            }
            this.r0 = b8 = b.d0;
            if (i.r(this.i0, this.j0)) {
                this.e(this.i0, this.j0);
            } else {
                this.l0.g(this);
            }
            b b9 = this.r0;
            if ((b9 == object || b9 == b8) && this.g()) {
                this.l0.j(this.o());
            }
            if (Log.isLoggable((String)"Request", (int)2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("finished run method in ");
                ((StringBuilder)object).append(ax.k4.d.a(this.q0));
                this.u(((StringBuilder)object).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot restart a running request");
    }

    @Override
    public boolean i() {
        return this.r0 == b.e0;
    }

    @Override
    public boolean isCancelled() {
        b b8 = this.r0;
        return b8 == b.g0 || b8 == b.h0;
        {
        }
    }

    @Override
    public boolean isRunning() {
        b b8 = this.r0;
        return b8 == b.c0 || b8 == b.d0;
        {
        }
    }

    void k() {
        this.c0.c();
        this.l0.d(this);
        this.r0 = b.g0;
        i.d d8 = this.p0;
        if (d8 != null) {
            d8.a();
            this.p0 = null;
        }
    }

    @Override
    public ax.l4.b l() {
        return this.c0;
    }

    @Override
    public void recycle() {
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = -1;
        this.j0 = -1;
        this.l0 = null;
        this.d0 = null;
        this.n0 = null;
        this.p0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = -1;
        this.w0 = -1;
        x0.a(this);
    }

    private static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        private static final b[] j0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            b b15;
            q = b15 = new b();
            c0 = b14 = new b();
            d0 = b13 = new b();
            e0 = b12 = new b();
            f0 = b11 = new b();
            g0 = b10 = new b();
            h0 = b9 = new b();
            i0 = b8 = new b();
            j0 = new b[]{b15, b14, b13, b12, b11, b10, b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])j0.clone();
        }
    }
}

