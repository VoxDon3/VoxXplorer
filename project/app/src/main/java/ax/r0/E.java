/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.B;
import ax.r0.S;
import ax.r0.h;
import ax.r0.p;

public class E {
    private static final p e = p.b();
    private h a;
    private p b;
    protected volatile S c;
    private volatile h d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void a(S s8) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            Throwable throwable2;
            block9: {
                try {
                    if (this.c != null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                try {
                    if (this.a != null) {
                        this.c = s8.k().b(this.a, this.b);
                        this.d = this.a;
                    } else {
                        this.c = s8;
                        this.d = h.c0;
                    }
                }
                catch (B b8) {
                    this.c = s8;
                    this.d = h.c0;
                }
                return;
            }
            throw throwable2;
        }
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        h h8 = this.a;
        if (h8 != null) {
            return h8.size();
        }
        if (this.c != null) {
            return this.c.i();
        }
        return 0;
    }

    public S c(S s8) {
        this.a(s8);
        return this.c;
    }

    public S d(S s8) {
        S s9 = this.c;
        this.a = null;
        this.d = null;
        this.c = s8;
        return s9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public h e() {
        if (this.d != null) {
            return this.d;
        }
        h h8 = this.a;
        if (h8 != null) {
            return h8;
        }
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.d != null) {
                        return this.d;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.d = this.c == null ? h.c0 : this.c.h();
                return this.d;
            }
            throw throwable2;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof E)) {
            return false;
        }
        object = (E)object;
        S s8 = this.c;
        S s9 = ((E)object).c;
        if (s8 == null && s9 == null) {
            return this.e().equals(((E)object).e());
        }
        if (s8 != null && s9 != null) {
            return s8.equals(s9);
        }
        if (s8 != null) {
            return s8.equals(((E)object).c(s8.c()));
        }
        return this.c(s9.c()).equals(s9);
    }

    public int hashCode() {
        return 1;
    }
}

