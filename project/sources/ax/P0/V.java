package ax.P0;

import ax.S0.C0968a;
import ax.S0.d0;
import ax.r7.AbstractC2991z;
import ax.u7.C3213a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class V {
    public static final V b = new V(AbstractC2991z.z());
    private static final String c = d0.G0(0);
    private final AbstractC2991z<a> a;

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

        public a(P p, boolean z, int[] iArr, boolean[] zArr) {
            int i2 = p.a;
            this.a = i2;
            boolean z2 = false;
            C0968a.a(i2 == iArr.length && i2 == zArr.length);
            this.b = p;
            if (z && i2 > 1) {
                z2 = true;
            }
            this.c = z2;
            this.d = (int[]) iArr.clone();
            this.e = (boolean[]) zArr.clone();
        }

        public P a() {
            return this.b;
        }

        public C0912v b(int i2) {
            return this.b.b(i2);
        }

        public int c(int i2) {
            return this.d[i2];
        }

        public int d() {
            return this.b.c;
        }

        public boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.c == aVar.c && this.b.equals(aVar.b) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return C3213a.a(this.e, true);
        }

        public boolean g() {
            return h(false);
        }

        public boolean h(boolean z) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                if (k(i2, z)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
        }

        public boolean i(int i2) {
            return this.e[i2];
        }

        public boolean j(int i2) {
            return k(i2, false);
        }

        public boolean k(int i2, boolean z) {
            int i3 = this.d[i2];
            if (i3 != 4) {
                return z && i3 == 3;
            }
            return true;
        }
    }

    public V(List<a> list) {
        this.a = AbstractC2991z.u(list);
    }

    public AbstractC2991z<a> a() {
        return this.a;
    }

    public boolean b() {
        return this.a.isEmpty();
    }

    public boolean c(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            a aVar = this.a.get(i2);
            if (aVar.f() && aVar.d() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean d(int i) {
        return e(i, false);
    }

    public boolean e(int i, boolean z) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (this.a.get(i2).d() == i && this.a.get(i2).h(z)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((V) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
