/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import ax.P0.P;
import ax.P0.v;
import ax.S0.d0;
import ax.r7.z;
import java.util.Arrays;
import java.util.List;

public final class V {
    public static final V b = new V(z.<a>z());
    private static final String c = d0.G0(0);
    private final z<a> a;

    public V(List<a> list) {
        this.a = z.u(list);
    }

    public z<a> a() {
        return this.a;
    }

    public boolean b() {
        return this.a.isEmpty();
    }

    public boolean c(int n8) {
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            a a8 = (a)this.a.get(i8);
            if (!a8.f() || a8.d() != n8) continue;
            return true;
        }
        return false;
    }

    public boolean d(int n8) {
        return this.e(n8, false);
    }

    public boolean e(int n8, boolean bl) {
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            if (((a)this.a.get(i8)).d() != n8 || !((a)this.a.get(i8)).h(bl)) continue;
            return true;
        }
        return false;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && V.class == object.getClass()) {
            object = (V)object;
            return this.a.equals(((V)object).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public static final class a {
        private static final String f = d0.G0(0);
        private static final String g = d0.G0(1);
        private static final String h = d0.G0(3);
        private static final String i = d0.G0(4);
        public final int a;
        private final P b;
        private final boolean c;
        private final int[] d;
        private final boolean[] e;

        public a(P p8, boolean bl, int[] nArray, boolean[] blArray) {
            int n8;
            this.a = n8 = p8.a;
            int n9 = nArray.length;
            boolean bl2 = false;
            boolean bl3 = n8 == n9 && n8 == blArray.length;
            ax.S0.a.a(bl3);
            this.b = p8;
            bl3 = bl2;
            if (bl) {
                bl3 = bl2;
                if (n8 > 1) {
                    bl3 = true;
                }
            }
            this.c = bl3;
            this.d = (int[])nArray.clone();
            this.e = (boolean[])blArray.clone();
        }

        public P a() {
            return this.b;
        }

        public v b(int n8) {
            return this.b.b(n8);
        }

        public int c(int n8) {
            return this.d[n8];
        }

        public int d() {
            return this.b.c;
        }

        public boolean e() {
            return this.c;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (this.c == ((a)object).c && this.b.equals(((a)object).b) && Arrays.equals(this.d, ((a)object).d) && Arrays.equals(this.e, ((a)object).e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return ax.u7.a.a(this.e, true);
        }

        public boolean g() {
            return this.h(false);
        }

        public boolean h(boolean bl) {
            for (int i8 = 0; i8 < this.d.length; ++i8) {
                if (!this.k(i8, bl)) continue;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((this.b.hashCode() * 31 + this.c) * 31 + Arrays.hashCode(this.d)) * 31 + Arrays.hashCode(this.e);
        }

        public boolean i(int n8) {
            return this.e[n8];
        }

        public boolean j(int n8) {
            return this.k(n8, false);
        }

        public boolean k(int n8, boolean bl) {
            return (n8 = this.d[n8]) == 4 || bl && n8 == 3;
            {
            }
        }
    }
}

