package ax.r0;

/* renamed from: ax.r0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2908E {
    private static final C2929p e = C2929p.b();
    private AbstractC2921h a;
    private C2929p b;
    protected volatile S c;
    private volatile AbstractC2921h d;

    protected void a(S s) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            try {
                if (this.a != null) {
                    this.c = s.k().b(this.a, this.b);
                    this.d = this.a;
                } else {
                    this.c = s;
                    this.d = AbstractC2921h.c0;
                }
            } catch (C2905B unused) {
                this.c = s;
                this.d = AbstractC2921h.c0;
            }
        }
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        AbstractC2921h abstractC2921h = this.a;
        if (abstractC2921h != null) {
            return abstractC2921h.size();
        }
        if (this.c != null) {
            return this.c.i();
        }
        return 0;
    }

    public S c(S s) {
        a(s);
        return this.c;
    }

    public S d(S s) {
        S s2 = this.c;
        this.a = null;
        this.d = null;
        this.c = s;
        return s2;
    }

    public AbstractC2921h e() {
        if (this.d != null) {
            return this.d;
        }
        AbstractC2921h abstractC2921h = this.a;
        if (abstractC2921h != null) {
            return abstractC2921h;
        }
        synchronized (this) {
            try {
                if (this.d != null) {
                    return this.d;
                }
                if (this.c == null) {
                    this.d = AbstractC2921h.c0;
                } else {
                    this.d = this.c.h();
                }
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2908E)) {
            return false;
        }
        C2908E c2908e = (C2908E) obj;
        S s = this.c;
        S s2 = c2908e.c;
        return (s == null && s2 == null) ? e().equals(c2908e.e()) : (s == null || s2 == null) ? s != null ? s.equals(c2908e.c(s.c())) : c(s2.c()).equals(s2) : s.equals(s2);
    }

    public int hashCode() {
        return 1;
    }
}
