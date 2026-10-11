/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Eb.b;
import ax.Gb.w;
import java.io.Serializable;

public abstract class c
implements ax.Mb.a,
Serializable {
    public static final Object h0 = a.a();
    protected final Object c0;
    private final Class d0;
    private final String e0;
    private final String f0;
    private final boolean g0;
    private transient ax.Mb.a q;

    public c() {
        this(h0);
    }

    protected c(Object object) {
        this(object, null, null, null, false);
    }

    protected c(Object object, Class clazz, String string, String string2, boolean bl) {
        this.c0 = object;
        this.d0 = clazz;
        this.e0 = string;
        this.f0 = string2;
        this.g0 = bl;
    }

    public ax.Mb.a a() {
        ax.Mb.a a8;
        ax.Mb.a a9 = a8 = this.q;
        if (a8 == null) {
            this.q = a9 = this.b();
        }
        return a9;
    }

    protected abstract ax.Mb.a b();

    public Object d() {
        return this.c0;
    }

    public String e() {
        return this.e0;
    }

    public ax.Mb.c f() {
        Class clazz = this.d0;
        if (clazz == null) {
            return null;
        }
        if (this.g0) {
            return w.c(clazz);
        }
        return w.b(clazz);
    }

    protected ax.Mb.a h() {
        ax.Mb.a a8 = this.a();
        if (a8 != this) {
            return a8;
        }
        throw new b();
    }

    public String k() {
        return this.f0;
    }

    private static class a
    implements Serializable {
        private static final a q = new a();

        private a() {
        }

        static /* synthetic */ a a() {
            return q;
        }
    }
}

