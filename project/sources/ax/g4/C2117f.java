package ax.g4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ax.M3.j;
import ax.M3.m;
import ax.j4.C2312a;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.g4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2117f implements Cloneable {
    private Drawable f0;
    private int g0;
    private Drawable h0;
    private int i0;
    private boolean n0;
    private Drawable p0;
    private int q;
    private int q0;
    private boolean u0;
    private Resources.Theme v0;
    private boolean w0;
    private boolean x0;
    private boolean y0;
    private float c0 = 1.0f;
    private ax.P3.h d0 = ax.P3.h.e;
    private ax.J3.g e0 = ax.J3.g.NORMAL;
    private boolean j0 = true;
    private int k0 = -1;
    private int l0 = -1;
    private ax.M3.h m0 = C2312a.c();
    private boolean o0 = true;
    private j r0 = new j();
    private Map<Class<?>, m<?>> s0 = new HashMap();
    private Class<?> t0 = Object.class;
    private boolean z0 = true;

    private boolean J(int i) {
        return K(this.q, i);
    }

    private static boolean K(int i, int i2) {
        return (i & i2) != 0;
    }

    private C2117f S() {
        if (this.u0) {
            throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
        }
        return this;
    }

    public static C2117f U(ax.M3.h hVar) {
        return new C2117f().T(hVar);
    }

    public static C2117f h(Class<?> cls) {
        return new C2117f().f(cls);
    }

    public static C2117f j(ax.P3.h hVar) {
        return new C2117f().i(hVar);
    }

    public final ax.M3.h B() {
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
        return J(8);
    }

    public boolean I() {
        return this.z0;
    }

    public final boolean L() {
        return this.n0;
    }

    public final boolean M() {
        return ax.k4.i.r(this.l0, this.k0);
    }

    public C2117f N() {
        this.u0 = true;
        return this;
    }

    public C2117f O(m<Bitmap> mVar) {
        if (this.w0) {
            return clone().O(mVar);
        }
        P(Bitmap.class, mVar);
        P(BitmapDrawable.class, new ax.X3.c(mVar));
        P(ax.b4.c.class, new ax.b4.f(mVar));
        return S();
    }

    public <T> C2117f P(Class<T> cls, m<T> mVar) {
        if (this.w0) {
            return clone().P(cls, mVar);
        }
        ax.k4.h.d(cls);
        ax.k4.h.d(mVar);
        this.s0.put(cls, mVar);
        int i = this.q;
        this.o0 = true;
        this.q = i | 67584;
        this.z0 = false;
        return S();
    }

    public C2117f Q(int i, int i2) {
        if (this.w0) {
            return clone().Q(i, i2);
        }
        this.l0 = i;
        this.k0 = i2;
        this.q |= 512;
        return S();
    }

    public C2117f R(ax.J3.g gVar) {
        if (this.w0) {
            return clone().R(gVar);
        }
        this.e0 = (ax.J3.g) ax.k4.h.d(gVar);
        this.q |= 8;
        return S();
    }

    public C2117f T(ax.M3.h hVar) {
        if (this.w0) {
            return clone().T(hVar);
        }
        this.m0 = (ax.M3.h) ax.k4.h.d(hVar);
        this.q |= 1024;
        return S();
    }

    public C2117f V(float f) {
        if (this.w0) {
            return clone().V(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.c0 = f;
        this.q |= 2;
        return S();
    }

    public C2117f X(boolean z) {
        if (this.w0) {
            return clone().X(true);
        }
        this.j0 = !z;
        this.q |= 256;
        return S();
    }

    public C2117f Y(m<Bitmap> mVar) {
        if (this.w0) {
            return clone().Y(mVar);
        }
        O(mVar);
        this.n0 = true;
        this.q |= 131072;
        return S();
    }

    public C2117f b(C2117f c2117f) {
        if (this.w0) {
            return clone().b(c2117f);
        }
        if (K(c2117f.q, 2)) {
            this.c0 = c2117f.c0;
        }
        if (K(c2117f.q, 262144)) {
            this.x0 = c2117f.x0;
        }
        if (K(c2117f.q, 4)) {
            this.d0 = c2117f.d0;
        }
        if (K(c2117f.q, 8)) {
            this.e0 = c2117f.e0;
        }
        if (K(c2117f.q, 16)) {
            this.f0 = c2117f.f0;
        }
        if (K(c2117f.q, 32)) {
            this.g0 = c2117f.g0;
        }
        if (K(c2117f.q, 64)) {
            this.h0 = c2117f.h0;
        }
        if (K(c2117f.q, 128)) {
            this.i0 = c2117f.i0;
        }
        if (K(c2117f.q, 256)) {
            this.j0 = c2117f.j0;
        }
        if (K(c2117f.q, 512)) {
            this.l0 = c2117f.l0;
            this.k0 = c2117f.k0;
        }
        if (K(c2117f.q, 1024)) {
            this.m0 = c2117f.m0;
        }
        if (K(c2117f.q, 4096)) {
            this.t0 = c2117f.t0;
        }
        if (K(c2117f.q, 8192)) {
            this.p0 = c2117f.p0;
        }
        if (K(c2117f.q, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.q0 = c2117f.q0;
        }
        if (K(c2117f.q, 32768)) {
            this.v0 = c2117f.v0;
        }
        if (K(c2117f.q, 65536)) {
            this.o0 = c2117f.o0;
        }
        if (K(c2117f.q, 131072)) {
            this.n0 = c2117f.n0;
        }
        if (K(c2117f.q, 2048)) {
            this.s0.putAll(c2117f.s0);
            this.z0 = c2117f.z0;
        }
        if (K(c2117f.q, 524288)) {
            this.y0 = c2117f.y0;
        }
        if (!this.o0) {
            this.s0.clear();
            int i = this.q;
            this.n0 = false;
            this.q = i & (-133121);
            this.z0 = true;
        }
        this.q |= c2117f.q;
        this.r0.d(c2117f.r0);
        return S();
    }

    public C2117f c() {
        if (this.u0 && !this.w0) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.w0 = true;
        return N();
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C2117f clone() {
        try {
            C2117f c2117f = (C2117f) super.clone();
            j jVar = new j();
            c2117f.r0 = jVar;
            jVar.d(this.r0);
            HashMap hashMap = new HashMap();
            c2117f.s0 = hashMap;
            hashMap.putAll(this.s0);
            c2117f.u0 = false;
            c2117f.w0 = false;
            return c2117f;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2117f) {
            C2117f c2117f = (C2117f) obj;
            if (Float.compare(c2117f.c0, this.c0) == 0 && this.g0 == c2117f.g0 && ax.k4.i.c(this.f0, c2117f.f0) && this.i0 == c2117f.i0 && ax.k4.i.c(this.h0, c2117f.h0) && this.q0 == c2117f.q0 && ax.k4.i.c(this.p0, c2117f.p0) && this.j0 == c2117f.j0 && this.k0 == c2117f.k0 && this.l0 == c2117f.l0 && this.n0 == c2117f.n0 && this.o0 == c2117f.o0 && this.x0 == c2117f.x0 && this.y0 == c2117f.y0 && this.d0.equals(c2117f.d0) && this.e0 == c2117f.e0 && this.r0.equals(c2117f.r0) && this.s0.equals(c2117f.s0) && this.t0.equals(c2117f.t0) && ax.k4.i.c(this.m0, c2117f.m0) && ax.k4.i.c(this.v0, c2117f.v0)) {
                return true;
            }
        }
        return false;
    }

    public C2117f f(Class<?> cls) {
        if (this.w0) {
            return clone().f(cls);
        }
        this.t0 = (Class) ax.k4.h.d(cls);
        this.q |= 4096;
        return S();
    }

    public int hashCode() {
        return ax.k4.i.m(this.v0, ax.k4.i.m(this.m0, ax.k4.i.m(this.t0, ax.k4.i.m(this.s0, ax.k4.i.m(this.r0, ax.k4.i.m(this.e0, ax.k4.i.m(this.d0, ax.k4.i.n(this.y0, ax.k4.i.n(this.x0, ax.k4.i.n(this.o0, ax.k4.i.n(this.n0, ax.k4.i.l(this.l0, ax.k4.i.l(this.k0, ax.k4.i.n(this.j0, ax.k4.i.m(this.p0, ax.k4.i.l(this.q0, ax.k4.i.m(this.h0, ax.k4.i.l(this.i0, ax.k4.i.m(this.f0, ax.k4.i.l(this.g0, ax.k4.i.j(this.c0)))))))))))))))))))));
    }

    public C2117f i(ax.P3.h hVar) {
        if (this.w0) {
            return clone().i(hVar);
        }
        this.d0 = (ax.P3.h) ax.k4.h.d(hVar);
        this.q |= 4;
        return S();
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

    public final ax.J3.g y() {
        return this.e0;
    }

    public final Class<?> z() {
        return this.t0;
    }
}
