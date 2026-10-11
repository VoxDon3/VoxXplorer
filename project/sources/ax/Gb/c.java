package ax.Gb;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class c implements ax.Mb.a, Serializable {
    public static final Object h0 = a.q;
    protected final Object c0;
    private final Class d0;
    private final String e0;
    private final String f0;
    private final boolean g0;
    private transient ax.Mb.a q;

    private static class a implements Serializable {
        private static final a q = new a();

        private a() {
        }
    }

    public c() {
        this(h0);
    }

    public ax.Mb.a a() {
        ax.Mb.a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        ax.Mb.a b = b();
        this.q = b;
        return b;
    }

    protected abstract ax.Mb.a b();

    public Object d() {
        return this.c0;
    }

    public String e() {
        return this.e0;
    }

    public ax.Mb.c f() {
        Class cls = this.d0;
        if (cls == null) {
            return null;
        }
        return this.g0 ? w.c(cls) : w.b(cls);
    }

    protected ax.Mb.a h() {
        ax.Mb.a a2 = a();
        if (a2 != this) {
            return a2;
        }
        throw new ax.Eb.b();
    }

    public String k() {
        return this.f0;
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected c(Object obj, Class cls, String str, String str2, boolean z) {
        this.c0 = obj;
        this.d0 = cls;
        this.e0 = str;
        this.f0 = str2;
        this.g0 = z;
    }
}
