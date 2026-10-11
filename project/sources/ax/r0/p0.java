package ax.r0;

import ax.r0.v0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p0 {
    private static final p0 f = new p0(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private p0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i = this.a;
        int[] iArr = this.b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.b = Arrays.copyOf(iArr, i2);
            this.c = Arrays.copyOf(this.c, i2);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static p0 e() {
        return f;
    }

    private static int h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    static p0 k(p0 p0Var, p0 p0Var2) {
        int i = p0Var.a + p0Var2.a;
        int[] copyOf = Arrays.copyOf(p0Var.b, i);
        System.arraycopy(p0Var2.b, 0, copyOf, p0Var.a, p0Var2.a);
        Object[] copyOf2 = Arrays.copyOf(p0Var.c, i);
        System.arraycopy(p0Var2.c, 0, copyOf2, p0Var.a, p0Var2.a);
        return new p0(i, copyOf, copyOf2, true);
    }

    static p0 l() {
        return new p0();
    }

    private static void p(int i, Object obj, v0 v0Var) throws IOException {
        int a = u0.a(i);
        int b = u0.b(i);
        if (b == 0) {
            v0Var.o(a, ((Long) obj).longValue());
            return;
        }
        if (b == 1) {
            v0Var.i(a, ((Long) obj).longValue());
            return;
        }
        if (b == 2) {
            v0Var.r(a, (AbstractC2921h) obj);
            return;
        }
        if (b != 3) {
            if (b != 5) {
                throw new RuntimeException(C2905B.d());
            }
            v0Var.d(a, ((Integer) obj).intValue());
        } else if (v0Var.j() == v0.a.ASCENDING) {
            v0Var.t(a);
            ((p0) obj).q(v0Var);
            v0Var.F(a);
        } else {
            v0Var.F(a);
            ((p0) obj).q(v0Var);
            v0Var.t(a);
        }
    }

    void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        int i = this.a;
        return i == p0Var.a && c(this.b, p0Var.b, i) && d(this.c, p0Var.c, this.a);
    }

    public int f() {
        int Y;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int a = u0.a(i4);
            int b = u0.b(i4);
            if (b == 0) {
                Y = AbstractC2924k.Y(a, ((Long) this.c[i3]).longValue());
            } else if (b == 1) {
                Y = AbstractC2924k.o(a, ((Long) this.c[i3]).longValue());
            } else if (b == 2) {
                Y = AbstractC2924k.g(a, (AbstractC2921h) this.c[i3]);
            } else if (b == 3) {
                Y = (AbstractC2924k.V(a) * 2) + ((p0) this.c[i3]).f();
            } else {
                if (b != 5) {
                    throw new IllegalStateException(C2905B.d());
                }
                Y = AbstractC2924k.m(a, ((Integer) this.c[i3]).intValue());
            }
            i2 += Y;
        }
        this.d = i2;
        return i2;
    }

    public int g() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += AbstractC2924k.J(u0.a(this.b[i3]), (AbstractC2921h) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + h(this.b, i)) * 31) + i(this.c, this.a);
    }

    public void j() {
        this.e = false;
    }

    final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            U.c(sb, i, String.valueOf(u0.a(this.b[i2])), this.c[i2]);
        }
    }

    void n(int i, Object obj) {
        a();
        b();
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    void o(v0 v0Var) throws IOException {
        if (v0Var.j() == v0.a.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                v0Var.c(u0.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            v0Var.c(u0.a(this.b[i2]), this.c[i2]);
        }
    }

    public void q(v0 v0Var) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (v0Var.j() == v0.a.ASCENDING) {
            for (int i = 0; i < this.a; i++) {
                p(this.b[i], this.c[i], v0Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            p(this.b[i2], this.c[i2], v0Var);
        }
    }

    private p0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
