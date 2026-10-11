/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

import ax.J3.c;
import ax.J3.e;
import ax.J3.g;
import ax.J3.j;
import ax.J3.k;
import ax.g4.a;
import ax.g4.d;
import ax.g4.f;
import ax.k4.h;
import java.io.File;

public class i<TranscodeType>
implements Cloneable {
    protected static final f o0 = new f().i(ax.P3.h.c).R(g.e0).X(true);
    private final j c0;
    private final Class<TranscodeType> d0;
    private final f e0;
    private final c f0;
    protected f g0;
    private k<?, ? super TranscodeType> h0;
    private Object i0;
    private i<TranscodeType> j0;
    private Float k0;
    private boolean l0 = true;
    private boolean m0;
    private boolean n0;
    private final e q;

    protected i(c object, j j8, Class<TranscodeType> clazz) {
        this.f0 = object;
        this.c0 = j8;
        this.q = ((c)object).i();
        this.d0 = clazz;
        this.e0 = object = j8.p();
        this.h0 = j8.q(clazz);
        this.g0 = object;
    }

    private ax.g4.b c(ax.h4.e<TranscodeType> e8) {
        return this.d(e8, null, this.h0, this.g0.y(), this.g0.v(), this.g0.t());
    }

    private ax.g4.b d(ax.h4.e<TranscodeType> object, ax.g4.i i8, k<?, ? super TranscodeType> object2, g g8, int n8, int n9) {
        Object object3 = this.j0;
        if (object3 != null) {
            if (!this.n0) {
                k<?, ? super TranscodeType> k8 = object3.h0;
                if (object3.l0) {
                    k8 = object2;
                }
                object3 = object3.g0.H() ? this.j0.g0.y() : this.i(g8);
                int n10 = this.j0.g0.v();
                int n11 = this.j0.g0.t();
                int n12 = n10;
                int n13 = n11;
                if (ax.k4.i.r(n8, n9)) {
                    n12 = n10;
                    n13 = n11;
                    if (!this.j0.g0.M()) {
                        n12 = this.g0.v();
                        n13 = this.g0.t();
                    }
                }
                i8 = new ax.g4.i(i8);
                object2 = this.n((ax.h4.e<TranscodeType>)object, this.g0, i8, (k<?, ? super TranscodeType>)object2, g8, n8, n9);
                this.n0 = true;
                object = super.d((ax.h4.e<TranscodeType>)object, i8, (k<?, TranscodeType>)k8, (g)((Object)object3), n12, n13);
                this.n0 = false;
                i8.m((ax.g4.b)object2, (ax.g4.b)object);
                return i8;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (this.k0 != null) {
            i8 = new ax.g4.i(i8);
            i8.m(this.n((ax.h4.e<TranscodeType>)object, this.g0, i8, (k<?, ? super TranscodeType>)object2, g8, n8, n9), this.n((ax.h4.e<TranscodeType>)object, this.g0.d().V(this.k0.floatValue()), i8, (k<?, ? super TranscodeType>)object2, this.i(g8), n8, n9));
            return i8;
        }
        return this.n((ax.h4.e<TranscodeType>)object, this.g0, i8, (k<?, ? super TranscodeType>)object2, g8, n8, n9);
    }

    private g i(g object) {
        int n8 = b.b[((Enum)object).ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3 && n8 != 4) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("unknown priority: ");
                    ((StringBuilder)object).append((Object)this.g0.y());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                return g.q;
            }
            return g.c0;
        }
        return g.d0;
    }

    private i<TranscodeType> m(Object object) {
        this.i0 = object;
        this.m0 = true;
        return this;
    }

    private ax.g4.b n(ax.h4.e<TranscodeType> e8, f f8, ax.g4.c c8, k<?, ? super TranscodeType> k8, g g8, int n8, int n9) {
        f8.N();
        e e9 = this.q;
        return ax.g4.h.x(e9, this.i0, this.d0, f8, n8, n9, g8, e8, null, c8, e9.c(), k8.c());
    }

    public i<TranscodeType> b(f f8) {
        h.d(f8);
        this.g0 = this.h().b(f8);
        return this;
    }

    public i<TranscodeType> f() {
        try {
            i i8 = (i)super.clone();
            i8.g0 = i8.g0.d();
            i8.h0 = i8.h0.b();
            return i8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    protected f h() {
        f f8 = this.e0;
        f f9 = this.g0;
        if (f8 == f9) {
            return f9.d();
        }
        return f9;
    }

    public <Y extends ax.h4.e<TranscodeType>> Y j(Y y8) {
        ax.k4.i.b();
        h.d(y8);
        if (this.m0) {
            this.g0.N();
            ax.g4.b b8 = this.c(y8);
            ax.g4.b b9 = y8.k();
            if (b8.d(b9) && (h.d(b9).i() || h.d(b9).isRunning())) {
                b8.recycle();
                if (!h.d(b9).isRunning()) {
                    b9.h();
                }
                return y8;
            }
            this.c0.o(y8);
            y8.e(b8);
            this.c0.u(y8, b8);
            return y8;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public i<TranscodeType> k(File file) {
        return this.m(file);
    }

    public i<TranscodeType> l(Object object) {
        return this.m(object);
    }

    public a<TranscodeType> o() {
        return this.r(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public a<TranscodeType> r(int n8, int n9) {
        d d8 = new d(this.q.e(), n8, n9);
        if (ax.k4.i.o()) {
            this.q.e().post(new Runnable(this, d8){
                final i c0;
                final d q;
                {
                    this.c0 = i8;
                    this.q = d8;
                }

                @Override
                public void run() {
                    if (!this.q.isCancelled()) {
                        this.c0.j(this.q);
                    }
                }
            });
            return d8;
        }
        this.j(d8);
        return d8;
    }
}

