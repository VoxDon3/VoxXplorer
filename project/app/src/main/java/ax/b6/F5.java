/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.S3;
import ax.b6.V4;
import ax.b6.c6;
import ax.b6.s4;
import java.io.IOException;
import java.util.Arrays;

public final class F5 {
    private static final F5 f = new F5(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d = -1;
    private boolean e;

    private F5() {
        this(0, new int[8], new Object[8], true);
    }

    private F5(int n8, int[] nArray, Object[] objectArray, boolean bl) {
        this.a = n8;
        this.b = nArray;
        this.c = objectArray;
        this.e = bl;
    }

    static F5 c(F5 f52, F5 f53) {
        int n8 = f52.a + f53.a;
        int[] nArray = Arrays.copyOf(f52.b, n8);
        System.arraycopy(f53.b, 0, nArray, f52.a, f53.a);
        Object[] objectArray = Arrays.copyOf(f52.c, n8);
        System.arraycopy(f53.c, 0, objectArray, f52.a, f53.a);
        return new F5(n8, nArray, objectArray, true);
    }

    private final void d(int n8) {
        int[] nArray = this.b;
        if (n8 > nArray.length) {
            int n9 = this.a;
            if ((n9 += n9 / 2) >= n8) {
                n8 = n9;
            }
            n9 = n8;
            if (n8 < 8) {
                n9 = 8;
            }
            this.b = Arrays.copyOf(nArray, n9);
            this.c = Arrays.copyOf(this.c, n9);
        }
    }

    private static void f(int n8, Object object, c6 c62) throws IOException {
        int n9 = n8 >>> 3;
        if ((n8 &= 7) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 5) {
                            c62.f(n9, (Integer)object);
                            return;
                        }
                        throw new RuntimeException(s4.a());
                    }
                    if (c62.a() == 1) {
                        c62.m(n9);
                        ((F5)object).j(c62);
                        c62.d(n9);
                        return;
                    }
                    c62.d(n9);
                    ((F5)object).j(c62);
                    c62.m(n9);
                    return;
                }
                c62.M(n9, (B3)object);
                return;
            }
            c62.t(n9, (Long)object);
            return;
        }
        c62.e(n9, (Long)object);
    }

    public static F5 k() {
        return f;
    }

    static F5 l() {
        return new F5();
    }

    private final void n() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int a() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        int n9 = 0;
        int n10 = 0;
        while (true) {
            block8: {
                block9: {
                    block10: {
                        if (n9 >= this.a) {
                            this.d = n10;
                            return n10;
                        }
                        int n11 = this.b[n9];
                        n8 = n11 >>> 3;
                        if ((n11 &= 7) == 0) break block9;
                        if (n11 == 1) break block10;
                        if (n11 != 2) {
                            if (n11 != 3) {
                                if (n11 != 5) {
                                    throw new IllegalStateException(s4.a());
                                }
                                n8 = S3.l0(n8, (Integer)this.c[n9]);
                                break block8;
                            } else {
                                n8 = (S3.w0(n8) << 1) + ((F5)this.c[n9]).a();
                            }
                            break block8;
                        } else {
                            n8 = S3.U(n8, (B3)this.c[n9]);
                        }
                        break block8;
                    }
                    n8 = S3.T(n8, (Long)this.c[n9]);
                    break block8;
                }
                n8 = S3.q0(n8, (Long)this.c[n9]);
            }
            n10 += n8;
            ++n9;
        }
    }

    final F5 b(F5 f52) {
        if (f52.equals(f)) {
            return this;
        }
        this.n();
        int n8 = this.a + f52.a;
        this.d(n8);
        System.arraycopy(f52.b, 0, this.b, this.a, f52.a);
        System.arraycopy(f52.c, 0, this.c, this.a, f52.a);
        this.a = n8;
        return this;
    }

    final void e(int n8, Object object) {
        this.n();
        this.d(this.a + 1);
        int[] nArray = this.b;
        int n9 = this.a;
        nArray[n9] = n8;
        this.c[n9] = object;
        this.a = n9 + 1;
    }

    public final boolean equals(Object objectArray) {
        block8: {
            if (this == objectArray) {
                return true;
            }
            if (objectArray == null) {
                return false;
            }
            if (!(objectArray instanceof F5)) {
                return false;
            }
            objectArray = (F5)objectArray;
            int n8 = this.a;
            if (n8 == objectArray.a) {
                int n9;
                int[] nArray = this.b;
                Object[] objectArray2 = objectArray.b;
                for (n9 = 0; n9 < n8; ++n9) {
                    if (nArray[n9] == objectArray2[n9]) {
                        continue;
                    }
                    break block8;
                }
                objectArray2 = this.c;
                objectArray = objectArray.c;
                n8 = this.a;
                for (n9 = 0; n9 < n8; ++n9) {
                    if (objectArray2[n9].equals(objectArray[n9])) {
                        continue;
                    }
                    break block8;
                }
                return true;
            }
        }
        return false;
    }

    final void g(c6 c62) throws IOException {
        if (c62.a() == 2) {
            for (int i8 = this.a - 1; i8 >= 0; --i8) {
                c62.k(this.b[i8] >>> 3, this.c[i8]);
            }
        } else {
            for (int i9 = 0; i9 < this.a; ++i9) {
                c62.k(this.b[i9] >>> 3, this.c[i9]);
            }
        }
    }

    final void h(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < this.a; ++i8) {
            V4.d(stringBuilder, n8, String.valueOf(this.b[i8] >>> 3), this.c[i8]);
        }
    }

    public final int hashCode() {
        int n8;
        int n9 = this.a;
        Object[] objectArray = this.b;
        int n10 = 17;
        int n11 = 0;
        int n12 = 17;
        for (n8 = 0; n8 < n9; ++n8) {
            n12 = n12 * 31 + objectArray[n8];
        }
        objectArray = this.c;
        int n13 = this.a;
        for (n8 = n11; n8 < n13; ++n8) {
            n10 = n10 * 31 + objectArray[n8].hashCode();
        }
        return ((n9 + 527) * 31 + n12) * 31 + n10;
    }

    public final int i() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        n8 = 0;
        for (int i8 = 0; i8 < this.a; ++i8) {
            n8 += S3.d0(this.b[i8] >>> 3, (B3)this.c[i8]);
        }
        this.d = n8;
        return n8;
    }

    public final void j(c6 c62) throws IOException {
        block4: {
            if (this.a == 0) break block4;
            if (c62.a() == 1) {
                for (int i8 = 0; i8 < this.a; ++i8) {
                    F5.f(this.b[i8], this.c[i8], c62);
                }
            } else {
                for (int i9 = this.a - 1; i9 >= 0; --i9) {
                    F5.f(this.b[i9], this.c[i9], c62);
                }
            }
        }
    }

    public final void m() {
        if (this.e) {
            this.e = false;
        }
    }
}

