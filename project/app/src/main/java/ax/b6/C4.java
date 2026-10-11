/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.U4;
import ax.b6.s4;

public class C4 {
    private volatile U4 a;
    private volatile B3 b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final U4 d(U4 u42) {
        if (this.a != null) return this.a;
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.a != null) {
                        return this.a;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    this.a = u42;
                    this.b = B3.c0;
                }
                catch (s4 s42) {
                    this.a = u42;
                    this.b = B3.c0;
                }
                return this.a;
            }
            throw throwable2;
        }
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

    public final U4 b(U4 u42) {
        U4 u43 = this.a;
        this.b = null;
        this.a = u42;
        return u43;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final B3 c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    if (this.b != null) {
                        return this.b;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.b = this.a == null ? B3.c0 : this.a.b();
                return this.b;
            }
            throw throwable2;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof C4)) {
            return false;
        }
        C4 c42 = (C4)object;
        object = this.a;
        U4 u42 = c42.a;
        if (object == null && u42 == null) {
            return this.c().equals(c42.c());
        }
        if (object != null && u42 != null) {
            return object.equals(u42);
        }
        if (object != null) {
            return object.equals(c42.d(object.h()));
        }
        return this.d(u42.h()).equals(u42);
    }

    public int hashCode() {
        return 1;
    }
}

