/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Gb.g;
import ax.Vb.F;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class s<E> {
    public static final a e = new a(null);
    private static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");
    private static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(s.class, "_state");
    public static final F h = new F("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;
    private final int a;
    private final boolean b;
    private final int c;
    private final AtomicReferenceArray d;

    public s(int n8, boolean bl) {
        int n9;
        this.a = n8;
        this.b = bl;
        this.c = n9 = n8 - 1;
        this.d = new AtomicReferenceArray(n8);
        if (n9 <= 0x3FFFFFFF) {
            if ((n8 & n9) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    private final s<E> b(long l8) {
        int n8;
        s<E> s8 = new s<E>(this.a * 2, this.b);
        int n9 = (int)(0x3FFFFFFFL & l8);
        int n10 = (int)((0xFFFFFFFC0000000L & l8) >> 30);
        while ((n9 & (n8 = this.c)) != (n10 & n8)) {
            Object e8;
            Object object = e8 = this.d.get(n8 & n9);
            if (e8 == null) {
                object = new b(n9);
            }
            s8.d.set(s8.c & n9, object);
            ++n9;
        }
        g.set(s8, e.d(l8, 0x1000000000000000L));
        return s8;
    }

    private final s<E> c(long l8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        s s8;
        while ((s8 = (s)atomicReferenceFieldUpdater.get(this)) == null) {
            ax.D.b.a(f, this, null, this.b(l8));
        }
        return s8;
    }

    private final s<E> e(int n8, E e8) {
        Object e9 = this.d.get(this.c & n8);
        if (e9 instanceof b && ((b)e9).a == n8) {
            this.d.set(n8 & this.c, e8);
            return this;
        }
        return null;
    }

    private final long h() {
        long l8;
        long l9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            if (((l9 = atomicLongFieldUpdater.get(this)) & 0x1000000000000000L) == 0L) continue;
            return l9;
        } while (!atomicLongFieldUpdater.compareAndSet(this, l9, l8 = 0x1000000000000000L | l9));
        return l8;
    }

    private final s<E> k(int n8, int n9) {
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            l8 = atomicLongFieldUpdater.get(this);
            n8 = (int)(0x3FFFFFFFL & l8);
            if ((0x1000000000000000L & l8) == 0L) continue;
            return this.i();
        } while (!g.compareAndSet(this, l8, e.b(l8, n9)));
        this.d.set(this.c & n8, null);
        return null;
    }

    public final int a(E e8) {
        int n8;
        int n9;
        s<E> s8 = g;
        while (true) {
            long l8;
            if ((0x3000000000000000L & (l8 = ((AtomicLongFieldUpdater)((Object)s8)).get(this))) != 0L) {
                return e.a(l8);
            }
            n9 = (int)((0xFFFFFFFC0000000L & l8) >> 30);
            n8 = this.c;
            int n10 = (int)(0x3FFFFFFFL & l8);
            if ((n9 + 2 & n8) == (n10 & n8)) {
                return 1;
            }
            if (!this.b && this.d.get(n9 & n8) != null) {
                n8 = this.a;
                if (n8 >= 1024 && (n9 - n10 & 0x3FFFFFFF) <= n8 >> 1) continue;
                return 1;
            }
            if (g.compareAndSet(this, l8, e.c(l8, n9 + 1 & 0x3FFFFFFF))) break;
        }
        this.d.set(n9 & n8, e8);
        s8 = this;
        while ((g.get(s8) & 0x1000000000000000L) != 0L) {
            s<E> s9;
            s8 = s9 = super.e(n9, e8);
            if (s9 != null) continue;
        }
        return 0;
    }

    public final boolean d() {
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            if (((l8 = atomicLongFieldUpdater.get(this)) & 0x2000000000000000L) != 0L) {
                return true;
            }
            if ((0x1000000000000000L & l8) == 0L) continue;
            return false;
        } while (!atomicLongFieldUpdater.compareAndSet(this, l8, 0x2000000000000000L | l8));
        return true;
    }

    public final int f() {
        long l8 = g.get(this);
        int n8 = (int)(0x3FFFFFFFL & l8);
        return 0x3FFFFFFF & (int)((l8 & 0xFFFFFFFC0000000L) >> 30) - n8;
    }

    public final boolean g() {
        long l8 = g.get(this);
        return (int)(0x3FFFFFFFL & l8) == (int)((l8 & 0xFFFFFFFC0000000L) >> 30);
    }

    public final s<E> i() {
        return this.c(this.h());
    }

    /*
     * Unable to fully structure code
     */
    public final Object j() {
        var6_1 = s.g;
        do lbl-1000:
        // 3 sources

        {
            block5: {
                if ((0x1000000000000000L & (var4_5 = var6_1.get(this))) != 0L) {
                    return s.h;
                }
                var3_4 = (int)((0xFFFFFFFC0000000L & var4_5) >> 30);
                var2_3 = this.c;
                var1_2 = (int)(0x3FFFFFFFL & var4_5);
                if ((var3_4 & var2_3) == (var1_2 & var2_3)) {
                    return null;
                }
                var8_6 = this.d.get(var2_3 & var1_2);
                if (var8_6 != null) break block5;
                if (!this.b) ** GOTO lbl-1000
                return null;
            }
            if (var8_6 instanceof b) {
                return null;
            }
            var2_3 = var1_2 + 1 & 0x3FFFFFFF;
            if (!s.g.compareAndSet(this, var4_5, s.e.b(var4_5, var2_3))) continue;
            this.d.set(this.c & var1_2, null);
            return var8_6;
        } while (!this.b);
        var6_1 = this;
        do {
            var6_1 = var7_7 = super.k(var1_2, var2_3);
        } while (var7_7 != null);
        return var8_6;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final int a(long l8) {
            if ((l8 & 0x2000000000000000L) != 0L) {
                return 2;
            }
            return 1;
        }

        public final long b(long l8, int n8) {
            return this.d(l8, 0x3FFFFFFFL) | (long)n8;
        }

        public final long c(long l8, int n8) {
            return this.d(l8, 0xFFFFFFFC0000000L) | (long)n8 << 30;
        }

        public final long d(long l8, long l9) {
            return l8 & (l9 ^ 0xFFFFFFFFFFFFFFFFL);
        }
    }

    public static final class b {
        public final int a;

        public b(int n8) {
            this.a = n8;
        }
    }
}

