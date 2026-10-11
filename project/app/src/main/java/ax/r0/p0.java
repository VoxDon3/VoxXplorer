/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.B;
import ax.r0.U;
import ax.r0.h;
import ax.r0.k;
import ax.r0.u0;
import ax.r0.v0;
import java.io.IOException;
import java.util.Arrays;

public final class p0 {
    private static final p0 f = new p0(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d = -1;
    private boolean e;

    private p0() {
        this(0, new int[8], new Object[8], true);
    }

    private p0(int n8, int[] nArray, Object[] objectArray, boolean bl) {
        this.a = n8;
        this.b = nArray;
        this.c = objectArray;
        this.e = bl;
    }

    private void b() {
        int n8 = this.a;
        int[] nArray = this.b;
        if (n8 == nArray.length) {
            int n9 = n8 < 4 ? 8 : n8 >> 1;
            n9 = n8 + n9;
            this.b = Arrays.copyOf(nArray, n9);
            this.c = Arrays.copyOf(this.c, n9);
        }
    }

    private static boolean c(int[] nArray, int[] nArray2, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (nArray[i8] == nArray2[i8]) continue;
            return false;
        }
        return true;
    }

    private static boolean d(Object[] objectArray, Object[] objectArray2, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (objectArray[i8].equals(objectArray2[i8])) continue;
            return false;
        }
        return true;
    }

    public static p0 e() {
        return f;
    }

    private static int h(int[] nArray, int n8) {
        int n9 = 17;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + nArray[i8];
        }
        return n9;
    }

    private static int i(Object[] objectArray, int n8) {
        int n9 = 17;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + objectArray[i8].hashCode();
        }
        return n9;
    }

    static p0 k(p0 p02, p0 p03) {
        int n8 = p02.a + p03.a;
        int[] nArray = Arrays.copyOf(p02.b, n8);
        System.arraycopy(p03.b, 0, nArray, p02.a, p03.a);
        Object[] objectArray = Arrays.copyOf(p02.c, n8);
        System.arraycopy(p03.c, 0, objectArray, p02.a, p03.a);
        return new p0(n8, nArray, objectArray, true);
    }

    static p0 l() {
        return new p0();
    }

    private static void p(int n8, Object object, v0 v02) throws IOException {
        int n9 = u0.a(n8);
        if ((n8 = u0.b(n8)) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 5) {
                            v02.d(n9, (Integer)object);
                            return;
                        }
                        throw new RuntimeException(B.d());
                    }
                    if (v02.j() == v0.a.q) {
                        v02.t(n9);
                        ((p0)object).q(v02);
                        v02.F(n9);
                        return;
                    }
                    v02.F(n9);
                    ((p0)object).q(v02);
                    v02.t(n9);
                    return;
                }
                v02.r(n9, (h)object);
                return;
            }
            v02.i(n9, (Long)object);
            return;
        }
        v02.o(n9, (Long)object);
    }

    void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof p0)) {
            return false;
        }
        object = (p0)object;
        int n8 = this.a;
        return n8 == ((p0)object).a && p0.c(this.b, ((p0)object).b, n8) && p0.d(this.c, ((p0)object).c, this.a);
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int f() {
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
                        n8 = u0.a(n11);
                        if ((n11 = u0.b(n11)) == 0) break block9;
                        if (n11 == 1) break block10;
                        if (n11 != 2) {
                            if (n11 != 3) {
                                if (n11 != 5) {
                                    throw new IllegalStateException(B.d());
                                }
                                n8 = k.m(n8, (Integer)this.c[n9]);
                                break block8;
                            } else {
                                n8 = k.V(n8) * 2 + ((p0)this.c[n9]).f();
                            }
                            break block8;
                        } else {
                            n8 = k.g(n8, (h)this.c[n9]);
                        }
                        break block8;
                    }
                    n8 = k.o(n8, (Long)this.c[n9]);
                    break block8;
                }
                n8 = k.Y(n8, (Long)this.c[n9]);
            }
            n10 += n8;
            ++n9;
        }
    }

    public int g() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        int n9 = 0;
        for (n8 = 0; n8 < this.a; ++n8) {
            n9 += k.J(u0.a(this.b[n8]), (h)this.c[n8]);
        }
        this.d = n9;
        return n9;
    }

    public int hashCode() {
        int n8 = this.a;
        return ((527 + n8) * 31 + p0.h(this.b, n8)) * 31 + p0.i(this.c, this.a);
    }

    public void j() {
        this.e = false;
    }

    final void m(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < this.a; ++i8) {
            U.c(stringBuilder, n8, String.valueOf(u0.a(this.b[i8])), this.c[i8]);
        }
    }

    void n(int n8, Object object) {
        this.a();
        this.b();
        int[] nArray = this.b;
        int n9 = this.a;
        nArray[n9] = n8;
        this.c[n9] = object;
        this.a = n9 + 1;
    }

    void o(v0 v02) throws IOException {
        if (v02.j() == v0.a.c0) {
            for (int i8 = this.a - 1; i8 >= 0; --i8) {
                v02.c(u0.a(this.b[i8]), this.c[i8]);
            }
        } else {
            for (int i9 = 0; i9 < this.a; ++i9) {
                v02.c(u0.a(this.b[i9]), this.c[i9]);
            }
        }
    }

    public void q(v0 v02) throws IOException {
        block4: {
            if (this.a == 0) break block4;
            if (v02.j() == v0.a.q) {
                for (int i8 = 0; i8 < this.a; ++i8) {
                    p0.p(this.b[i8], this.c[i8], v02);
                }
            } else {
                for (int i9 = this.a - 1; i9 >= 0; --i9) {
                    p0.p(this.b[i9], this.c[i9], v02);
                }
            }
        }
    }
}

