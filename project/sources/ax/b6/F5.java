package ax.b6;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class F5 {
    private static final F5 f = new F5(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private F5() {
        this(0, new int[8], new Object[8], true);
    }

    static F5 c(F5 f5, F5 f52) {
        int i = f5.a + f52.a;
        int[] copyOf = Arrays.copyOf(f5.b, i);
        System.arraycopy(f52.b, 0, copyOf, f5.a, f52.a);
        Object[] copyOf2 = Arrays.copyOf(f5.c, i);
        System.arraycopy(f52.c, 0, copyOf2, f5.a, f52.a);
        return new F5(i, copyOf, copyOf2, true);
    }

    private final void d(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    private static void f(int i, Object obj, InterfaceC1529c6 interfaceC1529c6) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            interfaceC1529c6.e(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            interfaceC1529c6.t(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            interfaceC1529c6.M(i2, (B3) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(C1663s4.a());
            }
            interfaceC1529c6.f(i2, ((Integer) obj).intValue());
        } else if (interfaceC1529c6.a() == 1) {
            interfaceC1529c6.m(i2);
            ((F5) obj).j(interfaceC1529c6);
            interfaceC1529c6.d(i2);
        } else {
            interfaceC1529c6.d(i2);
            ((F5) obj).j(interfaceC1529c6);
            interfaceC1529c6.m(i2);
        }
    }

    public static F5 k() {
        return f;
    }

    static F5 l() {
        return new F5();
    }

    private final void n() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int q0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                q0 = S3.q0(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                q0 = S3.T(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 2) {
                q0 = S3.U(i5, (B3) this.c[i3]);
            } else if (i6 == 3) {
                q0 = (S3.w0(i5) << 1) + ((F5) this.c[i3]).a();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(C1663s4.a());
                }
                q0 = S3.l0(i5, ((Integer) this.c[i3]).intValue());
            }
            i2 += q0;
        }
        this.d = i2;
        return i2;
    }

    final F5 b(F5 f5) {
        if (f5.equals(f)) {
            return this;
        }
        n();
        int i = this.a + f5.a;
        d(i);
        System.arraycopy(f5.b, 0, this.b, this.a, f5.a);
        System.arraycopy(f5.c, 0, this.c, this.a, f5.a);
        this.a = i;
        return this;
    }

    final void e(int i, Object obj) {
        n();
        d(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof F5)) {
            return false;
        }
        F5 f5 = (F5) obj;
        int i = this.a;
        if (i == f5.a) {
            int[] iArr = this.b;
            int[] iArr2 = f5.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = f5.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    final void g(InterfaceC1529c6 interfaceC1529c6) throws IOException {
        if (interfaceC1529c6.a() == 2) {
            for (int i = this.a - 1; i >= 0; i--) {
                interfaceC1529c6.k(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            interfaceC1529c6.k(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    final void h(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            V4.d(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int i() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += S3.d0(this.b[i3] >>> 3, (B3) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public final void j(InterfaceC1529c6 interfaceC1529c6) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (interfaceC1529c6.a() == 1) {
            for (int i = 0; i < this.a; i++) {
                f(this.b[i], this.c[i], interfaceC1529c6);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            f(this.b[i2], this.c[i2], interfaceC1529c6);
        }
    }

    public final void m() {
        if (this.e) {
            this.e = false;
        }
    }

    private F5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
