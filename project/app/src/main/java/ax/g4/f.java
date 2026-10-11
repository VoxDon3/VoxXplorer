/*
 * Decompiled with CFR 0.152.
 */
package ax.g4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ax.J3.g;
import ax.M3.h;
import ax.M3.j;
import ax.M3.m;
import ax.b4.c;
import ax.j4.a;
import ax.k4.i;
import java.util.HashMap;
import java.util.Map;

public class f
implements Cloneable {
    private float c0 = 1.0f;
    private ax.P3.h d0 = ax.P3.h.e;
    private g e0 = g.d0;
    private Drawable f0;
    private int g0;
    private Drawable h0;
    private int i0;
    private boolean j0 = true;
    private int k0 = -1;
    private int l0 = -1;
    private h m0 = a.c();
    private boolean n0;
    private boolean o0 = true;
    private Drawable p0;
    private int q;
    private int q0;
    private j r0 = new j();
    private Map<Class<?>, m<?>> s0 = new HashMap();
    private Class<?> t0 = Object.class;
    private boolean u0;
    private Resources.Theme v0;
    private boolean w0;
    private boolean x0;
    private boolean y0;
    private boolean z0 = true;

    private boolean J(int n8) {
        return f.K(this.q, n8);
    }

    private static boolean K(int n8, int n9) {
        return (n8 & n9) != 0;
    }

    private f S() {
        if (!this.u0) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    public static f U(h h8) {
        return new f().T(h8);
    }

    public static f h(Class<?> clazz) {
        return new f().f(clazz);
    }

    public static f j(ax.P3.h h8) {
        return new f().i(h8);
    }

    public final h B() {
        return this.m0;
    }

    public final float C() {
        return this.c0;
    }

    public final Resources.Theme D() {
        return this.v0;
    }

    public final Map<Class<?>, m<?>> E() {
        return this.s0;
    }

    public final boolean F() {
        return this.x0;
    }

    public final boolean G() {
        return this.j0;
    }

    public final boolean H() {
        return this.J(8);
    }

    public boolean I() {
        return this.z0;
    }

    public final boolean L() {
        return this.n0;
    }

    public final boolean M() {
        return i.r(this.l0, this.k0);
    }

    public f N() {
        this.u0 = true;
        return this;
    }

    public f O(m<Bitmap> m8) {
        if (this.w0) {
            return this.d().O(m8);
        }
        this.P(Bitmap.class, m8);
        this.P(BitmapDrawable.class, new ax.X3.c(m8));
        this.P(c.class, new ax.b4.f(m8));
        return this.S();
    }

    public <T> f P(Class<T> clazz, m<T> m8) {
        if (this.w0) {
            return this.d().P(clazz, m8);
        }
        ax.k4.h.d(clazz);
        ax.k4.h.d(m8);
        this.s0.put(clazz, m8);
        int n8 = this.q;
        this.o0 = true;
        this.q = n8 | 0x10800;
        this.z0 = false;
        return this.S();
    }

    public f Q(int n8, int n9) {
        if (this.w0) {
            return this.d().Q(n8, n9);
        }
        this.l0 = n8;
        this.k0 = n9;
        this.q |= 0x200;
        return this.S();
    }

    public f R(g g8) {
        if (this.w0) {
            return this.d().R(g8);
        }
        this.e0 = ax.k4.h.d(g8);
        this.q |= 8;
        return this.S();
    }

    public f T(h h8) {
        if (this.w0) {
            return this.d().T(h8);
        }
        this.m0 = ax.k4.h.d(h8);
        this.q |= 0x400;
        return this.S();
    }

    public f V(float f8) {
        if (this.w0) {
            return this.d().V(f8);
        }
        if (!(f8 < 0.0f) && !(f8 > 1.0f)) {
            this.c0 = f8;
            this.q |= 2;
            return this.S();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public f X(boolean bl) {
        if (this.w0) {
            return this.d().X(true);
        }
        this.j0 = bl ^ true;
        this.q |= 0x100;
        return this.S();
    }

    public f Y(m<Bitmap> m8) {
        if (this.w0) {
            return this.d().Y(m8);
        }
        this.O(m8);
        this.n0 = true;
        this.q |= 0x20000;
        return this.S();
    }

    public f b(f f8) {
        if (this.w0) {
            return this.d().b(f8);
        }
        if (f.K(f8.q, 2)) {
            this.c0 = f8.c0;
        }
        if (f.K(f8.q, 262144)) {
            this.x0 = f8.x0;
        }
        if (f.K(f8.q, 4)) {
            this.d0 = f8.d0;
        }
        if (f.K(f8.q, 8)) {
            this.e0 = f8.e0;
        }
        if (f.K(f8.q, 16)) {
            this.f0 = f8.f0;
        }
        if (f.K(f8.q, 32)) {
            this.g0 = f8.g0;
        }
        if (f.K(f8.q, 64)) {
            this.h0 = f8.h0;
        }
        if (f.K(f8.q, 128)) {
            this.i0 = f8.i0;
        }
        if (f.K(f8.q, 256)) {
            this.j0 = f8.j0;
        }
        if (f.K(f8.q, 512)) {
            this.l0 = f8.l0;
            this.k0 = f8.k0;
        }
        if (f.K(f8.q, 1024)) {
            this.m0 = f8.m0;
        }
        if (f.K(f8.q, 4096)) {
            this.t0 = f8.t0;
        }
        if (f.K(f8.q, 8192)) {
            this.p0 = f8.p0;
        }
        if (f.K(f8.q, 16384)) {
            this.q0 = f8.q0;
        }
        if (f.K(f8.q, 32768)) {
            this.v0 = f8.v0;
        }
        if (f.K(f8.q, 65536)) {
            this.o0 = f8.o0;
        }
        if (f.K(f8.q, 131072)) {
            this.n0 = f8.n0;
        }
        if (f.K(f8.q, 2048)) {
            this.s0.putAll(f8.s0);
            this.z0 = f8.z0;
        }
        if (f.K(f8.q, 524288)) {
            this.y0 = f8.y0;
        }
        if (!this.o0) {
            this.s0.clear();
            int n8 = this.q;
            this.n0 = false;
            this.q = n8 & 0xFFFDF7FF;
            this.z0 = true;
        }
        this.q |= f8.q;
        this.r0.d(f8.r0);
        return this.S();
    }

    public f c() {
        if (this.u0 && !this.w0) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.w0 = true;
        return this.N();
    }

    public f d() {
        try {
            f f8 = (f)super.clone();
            HashMap hashMap = new HashMap();
            f8.r0 = hashMap;
            ((j)((Object)hashMap)).d(this.r0);
            hashMap = new HashMap();
            f8.s0 = hashMap;
            hashMap.putAll(this.s0);
            f8.u0 = false;
            f8.w0 = false;
            return f8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public boolean equals(Object object) {
        if (object instanceof f) {
            object = (f)object;
            if (Float.compare(((f)object).c0, this.c0) == 0 && this.g0 == ((f)object).g0 && i.c(this.f0, ((f)object).f0) && this.i0 == ((f)object).i0 && i.c(this.h0, ((f)object).h0) && this.q0 == ((f)object).q0 && i.c(this.p0, ((f)object).p0) && this.j0 == ((f)object).j0 && this.k0 == ((f)object).k0 && this.l0 == ((f)object).l0 && this.n0 == ((f)object).n0 && this.o0 == ((f)object).o0 && this.x0 == ((f)object).x0 && this.y0 == ((f)object).y0 && this.d0.equals(((f)object).d0) && this.e0 == ((f)object).e0 && this.r0.equals(((f)object).r0) && this.s0.equals(((f)object).s0) && this.t0.equals(((f)object).t0) && i.c(this.m0, ((f)object).m0) && i.c(this.v0, ((f)object).v0)) {
                return true;
            }
        }
        return false;
    }

    public f f(Class<?> clazz) {
        if (this.w0) {
            return this.d().f(clazz);
        }
        this.t0 = ax.k4.h.d(clazz);
        this.q |= 0x1000;
        return this.S();
    }

    public int hashCode() {
        int n8 = i.j(this.c0);
        n8 = i.l(this.g0, n8);
        n8 = i.m(this.f0, n8);
        n8 = i.l(this.i0, n8);
        n8 = i.m(this.h0, n8);
        n8 = i.l(this.q0, n8);
        n8 = i.m(this.p0, n8);
        n8 = i.n(this.j0, n8);
        n8 = i.l(this.k0, n8);
        n8 = i.l(this.l0, n8);
        n8 = i.n(this.n0, n8);
        n8 = i.n(this.o0, n8);
        n8 = i.n(this.x0, n8);
        n8 = i.n(this.y0, n8);
        n8 = i.m(this.d0, n8);
        n8 = i.m((Object)this.e0, n8);
        n8 = i.m(this.r0, n8);
        n8 = i.m(this.s0, n8);
        n8 = i.m(this.t0, n8);
        n8 = i.m(this.m0, n8);
        return i.m(this.v0, n8);
    }

    public f i(ax.P3.h h8) {
        if (this.w0) {
            return this.d().i(h8);
        }
        this.d0 = ax.k4.h.d(h8);
        this.q |= 4;
        return this.S();
    }

    public final ax.P3.h k() {
        return this.d0;
    }

    public final int l() {
        return this.g0;
    }

    public final Drawable m() {
        return this.f0;
    }

    public final Drawable n() {
        return this.p0;
    }

    public final int o() {
        return this.q0;
    }

    public final boolean r() {
        return this.y0;
    }

    public final j s() {
        return this.r0;
    }

    public final int t() {
        return this.k0;
    }

    public final int v() {
        return this.l0;
    }

    public final Drawable w() {
        return this.h0;
    }

    public final int x() {
        return this.i0;
    }

    public final g y() {
        return this.e0;
    }

    public final Class<?> z() {
        return this.t0;
    }
}

