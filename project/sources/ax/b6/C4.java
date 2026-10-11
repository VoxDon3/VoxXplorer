package ax.b6;

/* loaded from: classes3.dex */
public class C4 {
    private volatile U4 a;
    private volatile B3 b;

    private final U4 d(U4 u4) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = u4;
                        this.b = B3.c0;
                    } catch (C1663s4 unused) {
                        this.a = u4;
                        this.b = B3.c0;
                    }
                }
            }
        }
        return this.a;
    }

    public final int a() {
        if (this.b != null) {
            return this.b.s();
        }
        if (this.a != null) {
            return this.a.d();
        }
        return 0;
    }

    public final U4 b(U4 u4) {
        U4 u42 = this.a;
        this.b = null;
        this.a = u4;
        return u42;
    }

    public final B3 c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = B3.c0;
                } else {
                    this.b = this.a.b();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4)) {
            return false;
        }
        C4 c4 = (C4) obj;
        U4 u4 = this.a;
        U4 u42 = c4.a;
        return (u4 == null && u42 == null) ? c().equals(c4.c()) : (u4 == null || u42 == null) ? u4 != null ? u4.equals(c4.d(u4.h())) : d(u42.h()).equals(u42) : u4.equals(u42);
    }

    public int hashCode() {
        return 1;
    }
}
