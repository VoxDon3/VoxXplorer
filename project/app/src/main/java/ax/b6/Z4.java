/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.F5;
import ax.b6.G5;
import ax.b6.U4;
import ax.b6.Y3;
import ax.b6.Y5;
import ax.b6.c6;
import ax.b6.f4;
import ax.b6.i5;
import ax.b6.k4;
import ax.b6.l5;
import ax.b6.n5;
import ax.b6.s4;
import ax.b6.v3;
import ax.b6.w3;
import ax.b6.w4;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class Z4<T>
implements l5<T> {
    private final U4 a;
    private final G5<?, ?> b;
    private final boolean c;
    private final Y3<?> d;

    private Z4(G5<?, ?> g52, Y3<?> y32, U4 u42) {
        this.b = g52;
        this.c = y32.e(u42);
        this.d = y32;
        this.a = u42;
    }

    static <T> Z4<T> j(G5<?, ?> g52, Y3<?> y32, U4 u42) {
        return new Z4<T>(g52, y32, u42);
    }

    @Override
    public final T a() {
        U4 u42 = this.a;
        if (u42 instanceof k4) {
            return (T)((k4)u42).B();
        }
        return (T)u42.j().p();
    }

    @Override
    public final int b(T t8) {
        int n8;
        G5<?, ?> g52 = this.b;
        int n9 = n8 = g52.e(g52.k(t8));
        if (this.c) {
            n9 = n8 + this.d.b(t8).a();
        }
        return n9;
    }

    @Override
    public final void c(T t8, c6 c62) throws IOException {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> iterator = this.d.b(t8).p();
        while (iterator.hasNext()) {
            entry = iterator.next();
            f4 f42 = (f4)entry.getKey();
            if (f42.c() == Y5.j0 && !f42.f() && !f42.e()) {
                if (entry instanceof w4) {
                    c62.k(f42.a(), ((w4)entry).a().c());
                    continue;
                }
                c62.k(f42.a(), entry.getValue());
                continue;
            }
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
        entry = this.b;
        ((G5)((Object)entry)).d(((G5)((Object)entry)).k(t8), c62);
    }

    @Override
    public final boolean d(T t8) {
        return this.d.b(t8).s();
    }

    @Override
    public final void e(T t8) {
        this.b.l(t8);
        this.d.g(t8);
    }

    @Override
    public final int f(T t8) {
        int n8;
        int n9 = n8 = this.b.k(t8).hashCode();
        if (this.c) {
            n9 = n8 * 53 + this.d.b(t8).hashCode();
        }
        return n9;
    }

    @Override
    public final void g(T t8, T t9) {
        n5.n(this.b, t8, t9);
        if (this.c) {
            n5.l(this.d, t8, t9);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void h(T object, byte[] byArray, int n8, int n9, v3 v32) throws IOException {
        k4 k42 = (k4)object;
        Object object2 = k42.zzb;
        F5 f52 = object2;
        if (object2 == F5.k()) {
            k42.zzb = f52 = F5.l();
        }
        ((k4.d)object).I();
        object = null;
        while (true) {
            int n10;
            if (n8 < n9) {
                n8 = w3.p(byArray, n8, v32);
                n10 = v32.a;
                if (n10 != 11) {
                    if ((n10 & 7) == 2) {
                        object = (k4.f)this.d.c(v32.d, this.a, n10 >>> 3);
                        if (object != null) {
                            i5.a();
                            throw new NoSuchMethodError();
                        }
                        n8 = w3.d(n10, byArray, n8, n9, f52, v32);
                        continue;
                    }
                    n8 = w3.b(n10, byArray, n8, n9, v32);
                    continue;
                }
                n10 = 0;
                object2 = null;
            } else {
                if (n8 == n9) {
                    return;
                }
                throw s4.e();
            }
            while (n8 < n9) {
                int n11 = w3.p(byArray, n8, v32);
                int n12 = v32.a;
                int n13 = n12 >>> 3;
                n8 = n12 & 7;
                if (n13 != 2) {
                    if (n13 == 3) {
                        if (object != null) {
                            i5.a();
                            throw new NoSuchMethodError();
                        }
                        if (n8 == 2) {
                            n8 = w3.k(byArray, n11, v32);
                            object2 = (B3)v32.c;
                            continue;
                        }
                    }
                } else if (n8 == 0) {
                    n8 = w3.p(byArray, n11, v32);
                    n10 = v32.a;
                    object = (k4.f)this.d.c(v32.d, this.a, n10);
                    continue;
                }
                n8 = n11;
                if (n12 == 12) break;
                n8 = w3.b(n12, byArray, n11, n9, v32);
            }
            if (object2 == null) continue;
            f52.e(n10 << 3 | 2, object2);
        }
    }

    @Override
    public final boolean i(T t8, T t9) {
        if (!this.b.k(t8).equals(this.b.k(t9))) {
            return false;
        }
        if (this.c) {
            return this.d.b(t8).equals(this.d.b(t9));
        }
        return true;
    }
}

