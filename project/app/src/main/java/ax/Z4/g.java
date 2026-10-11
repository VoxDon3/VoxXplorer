/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.a;
import ax.T4.h;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.T4.n;
import ax.W4.d;
import ax.Z4.e;
import ax.a5.b;
import ax.b5.c;
import ax.b5.l;
import java.io.IOException;
import java.io.Reader;

public class g
extends ax.U4.b {
    private static final int d1 = j.a.q0.l();
    private static final int e1 = j.a.k0.l();
    private static final int f1 = j.a.o0.l();
    private static final int g1 = j.a.p0.l();
    private static final int h1 = j.a.h0.l();
    private static final int i1 = j.a.g0.l();
    private static final int j1 = j.a.e0.l();
    private static final int k1 = j.a.f0.l();
    protected static final int[] l1 = ax.W4.c.h();
    protected Reader T0;
    protected char[] U0;
    protected boolean V0;
    protected n W0;
    protected final b X0;
    protected final int Y0;
    protected boolean Z0;
    protected long a1;
    protected int b1;
    protected int c1;

    public g(ax.W4.e e8, int n8, Reader reader, n n9, b b8) {
        super(e8, n8);
        this.T0 = reader;
        this.U0 = e8.f();
        this.r0 = 0;
        this.s0 = 0;
        this.W0 = n9;
        this.X0 = b8;
        this.Y0 = b8.m();
        this.V0 = true;
    }

    public g(ax.W4.e e8, int n8, Reader reader, n n9, b b8, char[] cArray, int n10, int n11, boolean bl) {
        super(e8, n8);
        this.T0 = reader;
        this.W0 = n9;
        this.U0 = cArray;
        this.r0 = n10;
        this.s0 = n11;
        this.v0 = n10;
        this.t0 = -n10;
        this.X0 = b8;
        this.Y0 = b8.m();
        this.V0 = bl;
    }

    private void A2() throws IOException {
        while (true) {
            int n8;
            int n9;
            block7: {
                char[] cArray;
                block8: {
                    block6: {
                        if (this.r0 >= this.s0 && !this.h2()) break block6;
                        cArray = this.U0;
                        n9 = this.r0;
                        this.r0 = n8 = n9 + 1;
                        if ((n9 = cArray[n9]) > 42) continue;
                        if (n9 != 42) break block7;
                        if (n8 < this.s0 || this.h2()) break block8;
                    }
                    this.M0(" in a comment", null);
                    return;
                }
                cArray = this.U0;
                n8 = this.r0;
                if (cArray[n8] != '/') continue;
                this.r0 = n8 + 1;
                return;
            }
            if (n9 >= 32) continue;
            if (n9 == 10) {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (n9 == 13) {
                this.B2();
                continue;
            }
            if (n9 == 9) continue;
            this.c1(n9);
        }
    }

    private final int C2() throws IOException {
        int n8;
        int n9;
        char[] cArray;
        block17: {
            int n10;
            block16: {
                n10 = this.r0;
                if (n10 + 4 >= this.s0) {
                    return this.D2(false);
                }
                cArray = this.U0;
                n9 = cArray[n10];
                if (n9 == 58) {
                    int n11;
                    this.r0 = n11 = n10 + 1;
                    if ((n11 = cArray[n11]) > 32) {
                        if (n11 != 47 && n11 != 35) {
                            this.r0 = n10 + 2;
                            return n11;
                        }
                        return this.D2(true);
                    }
                    if (n11 == 32 || n11 == 9) {
                        this.r0 = n11 = n10 + 2;
                        if ((n11 = cArray[n11]) > 32) {
                            if (n11 != 47 && n11 != 35) {
                                this.r0 = n10 + 3;
                                return n11;
                            }
                            return this.D2(true);
                        }
                    }
                    return this.D2(true);
                }
                if (n9 == 32) break block16;
                n8 = n9;
                if (n9 != 9) break block17;
            }
            this.r0 = n8 = n10 + 1;
            n8 = cArray[n8];
        }
        if (n8 == 58) {
            n8 = this.r0;
            this.r0 = n9 = n8 + 1;
            if ((n9 = cArray[n9]) > 32) {
                if (n9 != 47 && n9 != 35) {
                    this.r0 = n8 + 2;
                    return n9;
                }
                return this.D2(true);
            }
            if (n9 == 32 || n9 == 9) {
                this.r0 = n9 = n8 + 2;
                if ((n9 = cArray[n9]) > 32) {
                    if (n9 != 47 && n9 != 35) {
                        this.r0 = n8 + 3;
                        return n9;
                    }
                    return this.D2(true);
                }
            }
            return this.D2(true);
        }
        return this.D2(false);
    }

    private final int D2(boolean bl) throws IOException {
        while (true) {
            int n8;
            Object object;
            if (this.r0 >= this.s0 && !this.h2()) {
                object = new StringBuilder();
                ((StringBuilder)object).append(" within/between ");
                ((StringBuilder)object).append(this.z0.h());
                ((StringBuilder)object).append(" entries");
                this.M0(((StringBuilder)object).toString(), null);
                return -1;
            }
            object = this.U0;
            Object object2 = this.r0;
            this.r0 = n8 = object2 + 1;
            if ((object2 = (Object)object[object2]) > 32) {
                if (object2 == 47) {
                    this.F2();
                    continue;
                }
                if (object2 == 35 && this.K2()) continue;
                if (bl) {
                    return object2;
                }
                if (object2 != 58) {
                    this.Z0((int)object2, "was expecting a colon to separate field name and value");
                }
                bl = true;
                continue;
            }
            if (object2 >= 32) continue;
            if (object2 == 10) {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (object2 == 13) {
                this.B2();
                continue;
            }
            if (object2 == 9) continue;
            this.c1((int)object2);
        }
    }

    private final int E2(int n8) throws IOException {
        int n9;
        Object object;
        if (n8 != 44) {
            object = new StringBuilder();
            ((StringBuilder)object).append("was expecting comma to separate ");
            ((StringBuilder)object).append(this.z0.h());
            ((StringBuilder)object).append(" entries");
            this.Z0(n8, ((StringBuilder)object).toString());
        }
        while ((n9 = this.r0) < this.s0) {
            object = this.U0;
            this.r0 = n8 = n9 + 1;
            Object object2 = object[n9];
            if (object2 > 32) {
                if (object2 != 47 && object2 != 35) {
                    return (int)object2;
                }
                this.r0 = n9;
                return this.z2();
            }
            if (object2 >= 32) continue;
            if (object2 == 10) {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (object2 == 13) {
                this.B2();
                continue;
            }
            if (object2 == 9) continue;
            this.c1((int)object2);
        }
        return this.z2();
    }

    private void F2() throws IOException {
        if ((this.q & j1) == 0) {
            this.Z0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.r0 >= this.s0 && !this.h2()) {
            this.M0(" in a comment", null);
        }
        char[] cArray = this.U0;
        int n8 = this.r0;
        this.r0 = n8 + 1;
        if ((n8 = cArray[n8]) == 47) {
            this.G2();
            return;
        }
        if (n8 == 42) {
            this.A2();
            return;
        }
        this.Z0(n8, "was expecting either '*' or '/' for a comment");
    }

    private void G2() throws IOException {
        while (this.r0 < this.s0 || this.h2()) {
            int n8;
            char[] cArray = this.U0;
            int n9 = this.r0;
            this.r0 = n8 = n9 + 1;
            if ((n9 = cArray[n9]) >= 32) continue;
            if (n9 == 10) {
                ++this.u0;
                this.v0 = n8;
                return;
            }
            if (n9 == 13) {
                this.B2();
                return;
            }
            if (n9 == 9) continue;
            this.c1(n9);
        }
        return;
    }

    private final int I2() throws IOException {
        int n8;
        if (this.r0 >= this.s0 && !this.h2()) {
            return this.q1();
        }
        char[] cArray = this.U0;
        int n9 = this.r0;
        this.r0 = n8 = n9 + 1;
        char c8 = cArray[n9];
        if (c8 > ' ') {
            if (c8 != '/' && c8 != '#') {
                return c8;
            }
            this.r0 = n9;
            return this.J2();
        }
        if (c8 != ' ') {
            if (c8 == '\n') {
                ++this.u0;
                this.v0 = n8;
            } else if (c8 == '\r') {
                this.B2();
            } else if (c8 != '\t') {
                this.c1(c8);
            }
        }
        while ((n9 = this.r0) < this.s0) {
            cArray = this.U0;
            this.r0 = n8 = n9 + 1;
            c8 = cArray[n9];
            if (c8 > ' ') {
                if (c8 != '/' && c8 != '#') {
                    return c8;
                }
                this.r0 = n9;
                return this.J2();
            }
            if (c8 == ' ') continue;
            if (c8 == '\n') {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (c8 == '\r') {
                this.B2();
                continue;
            }
            if (c8 == '\t') continue;
            this.c1(c8);
        }
        return this.J2();
    }

    private int J2() throws IOException {
        while (this.r0 < this.s0 || this.h2()) {
            int n8;
            char[] cArray = this.U0;
            int n9 = this.r0;
            this.r0 = n8 = n9 + 1;
            if ((n9 = cArray[n9]) > 32) {
                if (n9 == 47) {
                    this.F2();
                    continue;
                }
                if (n9 == 35 && this.K2()) continue;
                return n9;
            }
            if (n9 == 32) continue;
            if (n9 == 10) {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (n9 == 13) {
                this.B2();
                continue;
            }
            if (n9 == 9) continue;
            this.c1(n9);
        }
        return this.q1();
    }

    private boolean K2() throws IOException {
        if ((this.q & k1) == 0) {
            return false;
        }
        this.G2();
        return true;
    }

    private final void L2() {
        int n8 = this.r0;
        this.w0 = this.t0 + (long)n8;
        this.x0 = this.u0;
        this.y0 = n8 - this.v0;
    }

    private final void M2() {
        int n8 = this.r0;
        this.a1 = n8;
        this.b1 = this.u0;
        this.c1 = n8 - this.v0;
    }

    private char N2() throws IOException {
        if (this.r0 >= this.s0 && !this.h2()) {
            return '0';
        }
        char c8 = this.U0[this.r0];
        if (c8 >= '0' && c8 <= '9') {
            if ((this.q & e1) == 0) {
                this.e1("Leading zeroes not allowed");
            }
            ++this.r0;
            if (c8 == '0') {
                block6: {
                    char c9;
                    do {
                        if (this.r0 >= this.s0 && !this.h2()) {
                            return c8;
                        }
                        char[] cArray = this.U0;
                        int n8 = this.r0;
                        c9 = cArray[n8];
                        if (c9 < '0' || c9 > '9') break block6;
                        this.r0 = n8 + 1;
                        c8 = c9;
                    } while (c9 == '0');
                    return c9;
                }
                return '0';
            }
            return c8;
        }
        return '0';
    }

    private final char O2() throws IOException {
        int n8 = this.r0;
        if (n8 < this.s0 && ((n8 = this.U0[n8]) < 48 || n8 > 57)) {
            return '0';
        }
        return this.N2();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void P2(int n8) throws IOException {
        int n9;
        int n10 = this.r0;
        this.r0 = n9 = n10 + 1;
        if (n8 == 9) return;
        if (n8 != 10) {
            if (n8 != 13) {
                if (n8 == 32) return;
                this.Y0(n8);
                return;
            }
            this.r0 = n10;
            return;
        }
        ++this.u0;
        this.v0 = n9;
    }

    private final void V1(String string, int n8, int n9) throws IOException {
        if (Character.isJavaIdentifierPart((char)n9)) {
            this.x2(string.substring(0, n8));
        }
    }

    private void W1(int n8) throws i {
        if (n8 == 93) {
            this.L2();
            if (!this.z0.e()) {
                this.D1(n8, '}');
            }
            this.z0 = this.z0.j();
            this.d0 = m.o0;
        }
        if (n8 == 125) {
            this.L2();
            if (!this.z0.f()) {
                this.D1(n8, ']');
            }
            this.z0 = this.z0.j();
            this.d0 = m.m0;
        }
    }

    private String f2(int n8, int n9, int[] objectArray) throws IOException {
        this.B0.s(this.U0, n8, this.r0 - n8);
        Object object = this.B0.m();
        n8 = this.B0.n();
        int n10 = objectArray.length;
        while (true) {
            int n11;
            char c8;
            if (this.r0 >= this.s0 && !this.h2() || ((c8 = this.U0[this.r0]) < n10 ? objectArray[c8] != 0 : !Character.isJavaIdentifierPart(c8))) {
                this.B0.w(n8);
                object = this.B0;
                objectArray = object.o();
                n11 = object.p();
                n8 = object.x();
                return this.X0.l((char[])objectArray, n11, n8, n9);
            }
            ++this.r0;
            n9 = n9 * 33 + c8;
            n11 = n8 + 1;
            object[n8] = c8;
            if (n11 >= ((Object)object).length) {
                object = this.B0.l();
                n8 = 0;
                continue;
            }
            n8 = n11;
        }
    }

    private final void j2() throws IOException {
        int n8;
        char[] cArray;
        int n9 = this.r0;
        if (n9 + 4 < this.s0 && (cArray = this.U0)[n9] == 'a' && cArray[n9 + 1] == 'l' && cArray[n9 + 2] == 's' && cArray[n9 + 3] == 'e' && ((n9 = cArray[n8 = n9 + 4]) < 48 || n9 == 93 || n9 == 125)) {
            this.r0 = n8;
            return;
        }
        this.l2("false", 1);
    }

    private final void k2() throws IOException {
        int n8;
        char[] cArray;
        int n9 = this.r0;
        if (n9 + 3 < this.s0 && (cArray = this.U0)[n9] == 'u' && cArray[n9 + 1] == 'l' && cArray[n9 + 2] == 'l' && ((n9 = cArray[n8 = n9 + 3]) < 48 || n9 == 93 || n9 == 125)) {
            this.r0 = n8;
            return;
        }
        this.l2("null", 1);
    }

    private final void m2(String string, int n8) throws IOException {
        int n9;
        int n10;
        int n11 = string.length();
        do {
            if (this.r0 >= this.s0 && !this.h2() || this.U0[this.r0] != string.charAt(n8)) {
                this.x2(string.substring(0, n8));
            }
            this.r0 = n9 = this.r0 + 1;
            n8 = n10 = n8 + 1;
        } while (n10 < n11);
        if ((n9 < this.s0 || this.h2()) && (n8 = this.U0[this.r0]) >= 48 && n8 != 93 && n8 != 125) {
            this.V1(string, n10, n8);
        }
    }

    private final void n2() throws IOException {
        char c8;
        char[] cArray;
        int n8 = this.r0;
        if (n8 + 3 < this.s0 && (cArray = this.U0)[n8] == 'r' && cArray[n8 + 1] == 'u' && cArray[n8 + 2] == 'e' && ((c8 = cArray[n8 += 3]) < '0' || c8 == ']' || c8 == '}')) {
            this.r0 = n8;
            return;
        }
        this.l2("true", 1);
    }

    private final m o2() throws IOException {
        this.D0 = false;
        m m8 = this.A0;
        this.A0 = null;
        if (m8 == m.n0) {
            this.M1(this.x0, this.y0);
        } else if (m8 == m.l0) {
            this.N1(this.x0, this.y0);
        }
        this.d0 = m8;
        return m8;
    }

    private final m q2(int n8, int n9, int n10, boolean bl, int n11) throws IOException {
        int n12;
        int n13;
        int n14;
        int n15;
        block17: {
            char[] cArray;
            int n16;
            int n17;
            int n18;
            block16: {
                n18 = this.s0;
                n15 = 0;
                n17 = 0;
                if (n8 == 46) {
                    n8 = 0;
                    n16 = n10;
                    while (true) {
                        if (n16 >= n18) {
                            return this.u2(bl, n9);
                        }
                        cArray = this.U0;
                        n10 = n16 + 1;
                        if ((n16 = cArray[n16]) < 48 || n16 > 57) break;
                        ++n8;
                        n16 = n10;
                    }
                    if (n8 == 0 && !this.A(e.n0.j())) {
                        this.a1(n16, "Decimal point not followed by a digit");
                    }
                    n14 = n8;
                    n8 = n10;
                    n10 = n16;
                } else {
                    n16 = n10;
                    n14 = 0;
                    n10 = n8;
                    n8 = n16;
                }
                if (n10 == 101) break block16;
                n13 = n8;
                n12 = n10;
                if (n10 != 69) break block17;
            }
            if (n8 >= n18) {
                this.r0 = n9;
                return this.u2(bl, n9);
            }
            cArray = this.U0;
            n10 = n8 + 1;
            n16 = cArray[n8];
            if (n16 != 45 && n16 != 43) {
                n8 = n10;
                n10 = n16;
                n16 = n17;
            } else {
                if (n10 >= n18) {
                    this.r0 = n9;
                    return this.u2(bl, n9);
                }
                n8 += 2;
                n10 = cArray[n10];
                n16 = n17;
            }
            while (n10 <= 57 && n10 >= 48) {
                ++n16;
                if (n8 >= n18) {
                    this.r0 = n9;
                    return this.u2(bl, n9);
                }
                n10 = this.U0[n8];
                ++n8;
            }
            n15 = n16;
            n13 = n8;
            n12 = n10;
            if (n16 == 0) {
                this.a1(n10, "Exponent indicator not followed by a digit");
                n12 = n10;
                n13 = n8;
                n15 = n16;
            }
        }
        this.r0 = n8 = n13 - 1;
        if (this.z0.g()) {
            this.P2(n12);
        }
        this.B0.s(this.U0, n9, n8 - n9);
        return this.T1(bl, n11, n14, n15);
    }

    private String t2(int n8, int n9, int n10) throws IOException {
        this.B0.s(this.U0, n8, this.r0 - n8);
        Object object = this.B0.m();
        n8 = this.B0.n();
        while (true) {
            char c8;
            if (this.r0 >= this.s0 && !this.h2()) {
                this.M0(" in field name", m.p0);
            }
            char[] cArray = this.U0;
            int n11 = this.r0;
            this.r0 = n11 + 1;
            char c9 = c8 = cArray[n11];
            if (c8 <= '\\') {
                if (c8 == '\\') {
                    c9 = this.p1();
                } else {
                    c9 = c8;
                    if (c8 <= n10) {
                        if (c8 == n10) {
                            this.B0.w(n8);
                            object = this.B0;
                            cArray = ((l)object).o();
                            n8 = ((l)object).p();
                            n10 = ((l)object).x();
                            return this.X0.l(cArray, n8, n10, n9);
                        }
                        c9 = c8;
                        if (c8 < ' ') {
                            this.F1(c8, "name");
                            c9 = c8;
                        }
                    }
                }
            }
            n9 = n9 * 33 + c9;
            n11 = n8 + 1;
            object[n8] = c9;
            if (n11 >= ((char[])object).length) {
                object = this.B0.l();
                n8 = 0;
                continue;
            }
            n8 = n11;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final m u2(boolean bl, int n8) throws IOException {
        char c8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        block39: {
            int n14;
            char c9;
            char[] cArray;
            char[] cArray2;
            int n15;
            block42: {
                char c10;
                block41: {
                    block40: {
                        block38: {
                            n15 = n8;
                            if (bl) {
                                n15 = n8 + 1;
                            }
                            this.r0 = n15;
                            cArray2 = this.B0.i();
                            if (bl) {
                                cArray2[0] = 45;
                                n15 = 1;
                            } else {
                                n15 = 0;
                            }
                            n8 = this.r0;
                            if (n8 < this.s0) {
                                cArray = this.U0;
                                this.r0 = n8 + 1;
                                c10 = cArray[n8];
                            } else {
                                c10 = this.Q2("No digit following minus sign", m.s0);
                            }
                            c9 = c10;
                            if (c10 == '0') {
                                c9 = this.O2();
                            }
                            n13 = 0;
                            while (c9 >= '0' && c9 <= '9') {
                                ++n13;
                                n8 = n15;
                                cArray = cArray2;
                                if (n15 >= cArray2.length) {
                                    cArray = this.B0.l();
                                    n8 = 0;
                                }
                                n15 = n8 + 1;
                                cArray[n8] = c9;
                                if (this.r0 >= this.s0 && !this.h2()) {
                                    c9 = '\u0000';
                                    n8 = 1;
                                    n12 = n13;
                                    break block38;
                                }
                                cArray2 = this.U0;
                                n8 = this.r0;
                                this.r0 = n8 + 1;
                                c9 = cArray2[n8];
                                cArray2 = cArray;
                            }
                            n8 = 0;
                            cArray = cArray2;
                            n12 = n13;
                        }
                        if (n12 == 0 && !this.A(e.m0.j())) {
                            return this.c2(c9, bl);
                        }
                        n14 = -1;
                        if (c9 != '.') {
                            n11 = -1;
                            cArray2 = cArray;
                            c10 = c9;
                        } else {
                            n13 = n15;
                            cArray2 = cArray;
                            if (n15 >= cArray.length) {
                                cArray2 = this.B0.l();
                                n13 = 0;
                            }
                            cArray2[n13] = c9;
                            ++n13;
                            n10 = 0;
                            cArray = cArray2;
                            while (true) {
                                if (this.r0 >= this.s0 && !this.h2()) {
                                    n9 = 1;
                                    break;
                                }
                                cArray2 = this.U0;
                                n15 = this.r0;
                                this.r0 = n15 + 1;
                                c9 = c10 = cArray2[n15];
                                n9 = n8;
                                if (c10 < '0') break;
                                if (c10 > '9') {
                                    c9 = c10;
                                    n9 = n8;
                                    break;
                                }
                                ++n10;
                                n15 = n13;
                                cArray2 = cArray;
                                if (n13 >= cArray.length) {
                                    cArray2 = this.B0.l();
                                    n15 = 0;
                                }
                                cArray2[n15] = c10;
                                n13 = n15 + 1;
                                c9 = c10;
                                cArray = cArray2;
                            }
                            n15 = n13;
                            c10 = c9;
                            n8 = n9;
                            n11 = n10;
                            cArray2 = cArray;
                            if (n10 == 0) {
                                n15 = n13;
                                c10 = c9;
                                n8 = n9;
                                n11 = n10;
                                cArray2 = cArray;
                                if (!this.A(e.n0.j())) {
                                    this.a1(c9, "Decimal point not followed by a digit");
                                    n15 = n13;
                                    c10 = c9;
                                    n8 = n9;
                                    n11 = n10;
                                    cArray2 = cArray;
                                }
                            }
                        }
                        if (c10 == 'e') break block40;
                        n10 = n15;
                        c8 = c10;
                        n13 = n8;
                        n9 = n14;
                        if (c10 != 'E') break block39;
                    }
                    n10 = n15;
                    cArray = cArray2;
                    if (n15 >= cArray2.length) {
                        cArray = this.B0.l();
                        n10 = 0;
                    }
                    n13 = n10 + 1;
                    cArray[n10] = c10;
                    n15 = this.r0;
                    if (n15 < this.s0) {
                        cArray2 = this.U0;
                        this.r0 = n15 + 1;
                        c10 = cArray2[n15];
                    } else {
                        c10 = this.Q2("expected a digit for number exponent", m.t0);
                    }
                    if (c10 == '-') break block41;
                    c9 = c10;
                    n15 = n13;
                    cArray2 = cArray;
                    if (c10 != '+') break block42;
                }
                n15 = n13;
                cArray2 = cArray;
                if (n13 >= cArray.length) {
                    cArray2 = this.B0.l();
                    n15 = 0;
                }
                cArray2[n15] = c10;
                n13 = this.r0;
                if (n13 < this.s0) {
                    cArray = this.U0;
                    this.r0 = n13 + 1;
                    c9 = cArray[n13];
                } else {
                    c9 = this.Q2("expected a digit for number exponent", m.t0);
                }
                ++n15;
            }
            n13 = 0;
            while (true) {
                block44: {
                    block43: {
                        if (c9 > '9' || c9 < '0') break block43;
                        ++n13;
                        n10 = n15;
                        cArray = cArray2;
                        if (n15 >= cArray2.length) {
                            cArray = this.B0.l();
                            n10 = 0;
                        }
                        n15 = n10 + 1;
                        cArray[n10] = c9;
                        if (this.r0 < this.s0 || this.h2()) break block44;
                        n8 = 1;
                    }
                    n14 = n13;
                    n10 = n15;
                    c8 = c9;
                    n13 = n8;
                    n9 = n14;
                    if (n14 == 0) {
                        break;
                    }
                    break block39;
                }
                cArray2 = this.U0;
                n10 = this.r0;
                this.r0 = n10 + 1;
                c9 = cArray2[n10];
                cArray2 = cArray;
            }
            this.a1(c9, "Exponent indicator not followed by a digit");
            n9 = n14;
            n13 = n8;
            c8 = c9;
            n10 = n15;
        }
        if (n13 == 0) {
            --this.r0;
            if (this.z0.g()) {
                this.P2(c8);
            }
        }
        this.B0.w(n10);
        if (n11 < 0 && n9 < 0) {
            return this.U1(bl, n12);
        }
        return this.T1(bl, n12, n11, n9);
    }

    private final m v2(boolean bl) throws IOException {
        int n8 = this.r0;
        int n9 = bl ? n8 - 1 : n8;
        int n10 = this.s0;
        if (n8 >= n10) {
            return this.u2(bl, n9);
        }
        char[] cArray = this.U0;
        int n11 = n8 + 1;
        int n12 = cArray[n8];
        n8 = 1;
        if (n12 <= 57 && n12 >= 48) {
            char c8;
            if (n12 == 48) {
                return this.u2(bl, n9);
            }
            while (true) {
                if (n11 >= n10) {
                    return this.u2(bl, n9);
                }
                cArray = this.U0;
                n12 = n11 + 1;
                c8 = cArray[n11];
                if (c8 < '0' || c8 > '9') break;
                ++n8;
                n11 = n12;
            }
            if (c8 != '.' && c8 != 'e' && c8 != 'E') {
                this.r0 = n11;
                if (this.z0.g()) {
                    this.P2(c8);
                }
                this.B0.s(this.U0, n9, n11 - n9);
                return this.U1(bl, n8);
            }
            this.r0 = n12;
            return this.q2(c8, n9, n12, bl, n8);
        }
        this.r0 = n11;
        if (n12 == 46) {
            return this.r2(bl);
        }
        return this.d2(n12, bl, true);
    }

    private final int z2() throws IOException {
        while (true) {
            int n8;
            Object object;
            if (this.r0 >= this.s0 && !this.h2()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unexpected end-of-input within/between ");
                ((StringBuilder)object).append(this.z0.h());
                ((StringBuilder)object).append(" entries");
                throw this.a(((StringBuilder)object).toString());
            }
            object = this.U0;
            Object object2 = this.r0;
            this.r0 = n8 = object2 + 1;
            if ((object2 = (Object)object[object2]) > 32) {
                if (object2 == 47) {
                    this.F2();
                    continue;
                }
                if (object2 == 35 && this.K2()) continue;
                return object2;
            }
            if (object2 >= 32) continue;
            if (object2 == 10) {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (object2 == 13) {
                this.B2();
                continue;
            }
            if (object2 == 9) continue;
            this.c1((int)object2);
        }
    }

    protected final void B2() throws IOException {
        int n8;
        char[] cArray;
        if ((this.r0 < this.s0 || this.h2()) && (cArray = this.U0)[n8 = this.r0] == '\n') {
            this.r0 = n8 + 1;
        }
        ++this.u0;
        this.v0 = this.r0;
    }

    @Override
    protected void C1() throws IOException {
        char[] cArray;
        super.C1();
        this.X0.r();
        if (this.V0 && (cArray = this.U0) != null) {
            this.U0 = null;
            this.o0.p(cArray);
        }
    }

    @Override
    public final m H() throws IOException {
        int n8;
        block17: {
            boolean bl;
            Object object;
            block28: {
                block20: {
                    block21: {
                        block22: {
                            block23: {
                                block24: {
                                    block25: {
                                        block26: {
                                            block27: {
                                                int n9;
                                                m m8;
                                                block18: {
                                                    block19: {
                                                        object = this.d0;
                                                        m8 = m.p0;
                                                        if (object == m8) {
                                                            return this.o2();
                                                        }
                                                        this.G0 = 0;
                                                        if (this.Z0) {
                                                            this.H2();
                                                        }
                                                        if ((n8 = this.I2()) < 0) {
                                                            this.close();
                                                            this.d0 = null;
                                                            return null;
                                                        }
                                                        this.F0 = null;
                                                        if (n8 == 93 || n8 == 125) break block17;
                                                        n9 = n8;
                                                        if (!this.z0.n()) break block18;
                                                        n9 = n8 = this.E2(n8);
                                                        if ((this.q & d1) == 0) break block18;
                                                        if (n8 == 93) break block19;
                                                        n9 = n8;
                                                        if (n8 != 125) break block18;
                                                    }
                                                    this.W1(n8);
                                                    return this.d0;
                                                }
                                                bl = this.z0.f();
                                                n8 = n9;
                                                if (bl) {
                                                    this.M2();
                                                    object = n9 == 34 ? this.s2() : this.e2(n9);
                                                    this.z0.q((String)object);
                                                    this.d0 = m8;
                                                    n8 = this.C2();
                                                }
                                                this.L2();
                                                if (n8 == 34) break block20;
                                                if (n8 == 43) break block21;
                                                if (n8 == 91) break block22;
                                                if (n8 == 102) break block23;
                                                if (n8 == 110) break block24;
                                                if (n8 == 116) break block25;
                                                if (n8 == 123) break block26;
                                                if (n8 == 125) break block27;
                                                if (n8 != 45) {
                                                    if (n8 != 46) {
                                                        switch (n8) {
                                                            default: {
                                                                object = this.g2(n8);
                                                                break;
                                                            }
                                                            case 48: 
                                                            case 49: 
                                                            case 50: 
                                                            case 51: 
                                                            case 52: 
                                                            case 53: 
                                                            case 54: 
                                                            case 55: 
                                                            case 56: 
                                                            case 57: {
                                                                object = this.w2(n8);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        object = this.r2(false);
                                                    }
                                                } else {
                                                    object = this.v2(true);
                                                }
                                                break block28;
                                            }
                                            this.Z0(n8, "expected a value");
                                            break block25;
                                        }
                                        if (!bl) {
                                            this.N1(this.x0, this.y0);
                                        }
                                        object = m.l0;
                                        break block28;
                                    }
                                    this.n2();
                                    object = m.u0;
                                    break block28;
                                }
                                this.k2();
                                object = m.w0;
                                break block28;
                            }
                            this.j2();
                            object = m.v0;
                            break block28;
                        }
                        if (!bl) {
                            this.M1(this.x0, this.y0);
                        }
                        object = m.n0;
                        break block28;
                    }
                    object = this.A(e.l0.j()) ? this.v2(false) : this.g2(n8);
                    break block28;
                }
                this.Z0 = true;
                object = m.r0;
            }
            if (bl) {
                this.A0 = object;
                return this.d0;
            }
            this.d0 = object;
            return object;
        }
        this.W1(n8);
        return this.d0;
    }

    protected final void H2() throws IOException {
        this.Z0 = false;
        int n8 = this.r0;
        int n9 = this.s0;
        char[] cArray = this.U0;
        while (true) {
            int n10 = n8;
            int n11 = n9;
            if (n8 >= n9) {
                this.r0 = n8;
                if (!this.h2()) {
                    this.M0(": was expecting closing quote for a string value", m.r0);
                }
                n10 = this.r0;
                n11 = this.s0;
            }
            n8 = n10 + 1;
            n9 = cArray[n10];
            if (n9 <= 92) {
                if (n9 == 92) {
                    this.r0 = n8;
                    this.p1();
                    n8 = this.r0;
                    n9 = this.s0;
                    continue;
                }
                if (n9 <= 34) {
                    if (n9 == 34) {
                        this.r0 = n8;
                        return;
                    }
                    if (n9 < 32) {
                        this.r0 = n8;
                        this.F1(n9, "string value");
                    }
                }
            }
            n9 = n11;
        }
    }

    protected char Q2(String object, m m8) throws IOException {
        if (this.r0 >= this.s0 && !this.h2()) {
            this.M0((String)object, m8);
        }
        object = this.U0;
        int n8 = this.r0;
        this.r0 = n8 + 1;
        return (char)object[n8];
    }

    protected byte[] X1(a a8) throws IOException {
        Object object = this.t1();
        while (true) {
            int n8;
            int n9;
            if (this.r0 >= this.s0) {
                this.i2();
            }
            char[] cArray = this.U0;
            int n10 = this.r0;
            this.r0 = n10 + 1;
            char c8 = cArray[n10];
            if (c8 <= ' ') continue;
            n10 = n9 = a8.f(c8);
            if (n9 < 0) {
                if (c8 == '\"') {
                    return ((c)object).m();
                }
                n10 = n9 = this.n1(a8, c8, 0);
                if (n9 < 0) continue;
            }
            if (this.r0 >= this.s0) {
                this.i2();
            }
            cArray = this.U0;
            n9 = this.r0;
            this.r0 = n9 + 1;
            c8 = cArray[n9];
            n9 = n8 = a8.f(c8);
            if (n8 < 0) {
                n9 = this.n1(a8, c8, 1);
            }
            int n11 = n10 << 6 | n9;
            if (this.r0 >= this.s0) {
                this.i2();
            }
            cArray = this.U0;
            n10 = this.r0;
            this.r0 = n10 + 1;
            c8 = cArray[n10];
            n8 = n9 = a8.f(c8);
            if (n9 < 0) {
                n10 = n9;
                if (n9 != -2) {
                    if (c8 == '\"') {
                        ((c)object).b(n11 >> 4);
                        if (a8.k()) {
                            --this.r0;
                            this.w1(a8);
                        }
                        return ((c)object).m();
                    }
                    n10 = this.n1(a8, c8, 2);
                }
                n8 = n10;
                if (n10 == -2) {
                    if (this.r0 >= this.s0) {
                        this.i2();
                    }
                    cArray = this.U0;
                    n10 = this.r0;
                    this.r0 = n10 + 1;
                    c8 = cArray[n10];
                    if (!a8.m(c8) && this.n1(a8, c8, 3) != -2) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("expected padding character '");
                        ((StringBuilder)object).append(a8.i());
                        ((StringBuilder)object).append("'");
                        throw this.R1(a8, c8, 3, ((StringBuilder)object).toString());
                    }
                    ((c)object).b(n11 >> 4);
                    continue;
                }
            }
            n11 = n11 << 6 | n8;
            if (this.r0 >= this.s0) {
                this.i2();
            }
            cArray = this.U0;
            n10 = this.r0;
            this.r0 = n10 + 1;
            c8 = cArray[n10];
            n8 = n9 = a8.f(c8);
            if (n9 < 0) {
                n10 = n9;
                if (n9 != -2) {
                    if (c8 == '\"') {
                        ((c)object).d(n11 >> 2);
                        if (a8.k()) {
                            --this.r0;
                            this.w1(a8);
                        }
                        return ((c)object).m();
                    }
                    n10 = this.n1(a8, c8, 3);
                }
                n8 = n10;
                if (n10 == -2) {
                    ((c)object).d(n11 >> 2);
                    continue;
                }
            }
            ((c)object).c(n11 << 6 | n8);
        }
    }

    protected final void Y1() throws IOException {
        Object object;
        Object object2;
        int n8 = this.r0;
        int n9 = this.s0;
        int n10 = n8;
        if (n8 < n9) {
            object2 = l1;
            int n11 = ((int[])object2).length;
            do {
                Object object3;
                if ((object3 = (object = (Object)this.U0)[n8]) < n11 && object2[object3] != 0) {
                    n10 = n8;
                    if (object3 != 34) break;
                    object2 = this.B0;
                    n10 = this.r0;
                    ((l)object2).s((char[])object, n10, n8 - n10);
                    this.r0 = n8 + 1;
                    return;
                }
                n8 = n10 = n8 + 1;
            } while (n10 < n9);
        }
        object = this.B0;
        object2 = this.U0;
        n8 = this.r0;
        ((l)object).r((char[])object2, n8, n10 - n8);
        this.r0 = n10;
        this.Z1();
    }

    protected void Z1() throws IOException {
        char[] cArray = this.B0.m();
        int n8 = this.B0.n();
        int[] nArray = l1;
        int n9 = nArray.length;
        while (true) {
            char c8;
            if (this.r0 >= this.s0 && !this.h2()) {
                this.M0(": was expecting closing quote for a string value", m.r0);
            }
            char[] cArray2 = this.U0;
            int n10 = this.r0;
            this.r0 = n10 + 1;
            char c9 = c8 = cArray2[n10];
            if (c8 < n9) {
                c9 = c8;
                if (nArray[c8] != 0) {
                    if (c8 == '\"') {
                        this.B0.w(n8);
                        return;
                    }
                    if (c8 == '\\') {
                        c9 = this.p1();
                    } else {
                        c9 = c8;
                        if (c8 < ' ') {
                            this.F1(c8, "string value");
                            c9 = c8;
                        }
                    }
                }
            }
            cArray2 = cArray;
            n10 = n8;
            if (n8 >= cArray.length) {
                cArray2 = this.B0.l();
                n10 = 0;
            }
            cArray2[n10] = c9;
            n8 = n10 + 1;
            cArray = cArray2;
        }
    }

    protected final String a2(m m8) throws IOException {
        if (m8 == null) {
            return null;
        }
        int n8 = m8.h();
        if (n8 != 5) {
            if (n8 != 6 && n8 != 7 && n8 != 8) {
                return m8.d();
            }
            return this.B0.h();
        }
        return this.z0.b();
    }

    protected m b2() throws IOException {
        char[] cArray = this.B0.i();
        int n8 = this.B0.n();
        while (true) {
            char c8;
            if (this.r0 >= this.s0 && !this.h2()) {
                this.M0(": was expecting closing quote for a string value", m.r0);
            }
            char[] cArray2 = this.U0;
            int n9 = this.r0;
            this.r0 = n9 + 1;
            char c9 = c8 = cArray2[n9];
            if (c8 <= '\\') {
                if (c8 == '\\') {
                    c9 = this.p1();
                } else {
                    c9 = c8;
                    if (c8 <= '\'') {
                        if (c8 == '\'') {
                            this.B0.w(n8);
                            return m.r0;
                        }
                        c9 = c8;
                        if (c8 < ' ') {
                            this.F1(c8, "string value");
                            c9 = c8;
                        }
                    }
                }
            }
            cArray2 = cArray;
            n9 = n8;
            if (n8 >= cArray.length) {
                cArray2 = this.B0.l();
                n9 = 0;
            }
            cArray2[n9] = c9;
            n8 = n9 + 1;
            cArray = cArray2;
        }
    }

    protected m c2(int n8, boolean bl) throws IOException {
        return this.d2(n8, bl, false);
    }

    @Override
    public byte[] d(a a8) throws IOException {
        Object object;
        Object object2 = this.d0;
        if (object2 == m.q0 && (object = this.F0) != null) {
            return object;
        }
        if (object2 != m.r0) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Current token (");
            ((StringBuilder)object2).append((Object)this.d0);
            ((StringBuilder)object2).append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            this.C0(((StringBuilder)object2).toString());
        }
        if (this.Z0) {
            try {
                this.F0 = this.X1(a8);
                this.Z0 = false;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed to decode VALUE_STRING as base64 (");
                ((StringBuilder)object).append(a8);
                ((StringBuilder)object).append("): ");
                ((StringBuilder)object).append(illegalArgumentException.getMessage());
                throw this.a(((StringBuilder)object).toString());
            }
        } else if (this.F0 == null) {
            object2 = this.t1();
            this.d0(this.u(), (c)object2, a8);
            this.F0 = ((c)object2).m();
        }
        return this.F0;
    }

    protected m d2(int n8, boolean bl, boolean bl2) throws IOException {
        Object object;
        int n9 = n8;
        if (n8 == 73) {
            if (this.r0 >= this.s0 && !this.h2()) {
                this.T0(m.s0);
            }
            object = this.U0;
            n8 = this.r0;
            this.r0 = n8 + 1;
            n8 = object[n8];
            double d8 = Double.POSITIVE_INFINITY;
            if (n8 == 78) {
                object = bl ? (Object)"-INF" : (Object)"+INF";
                this.l2((String)object, 3);
                if ((this.q & f1) != 0) {
                    if (bl) {
                        d8 = Double.NEGATIVE_INFINITY;
                    }
                    return this.S1((String)object, d8);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Non-standard token '");
                stringBuilder.append((String)object);
                stringBuilder.append("': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                this.C0(stringBuilder.toString());
                n9 = n8;
            } else {
                n9 = n8;
                if (n8 == 110) {
                    object = bl ? (Object)"-Infinity" : (Object)"+Infinity";
                    this.l2((String)object, 3);
                    if ((this.q & f1) != 0) {
                        if (bl) {
                            d8 = Double.NEGATIVE_INFINITY;
                        }
                        return this.S1((String)object, d8);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Non-standard token '");
                    stringBuilder.append((String)object);
                    stringBuilder.append("': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                    this.C0(stringBuilder.toString());
                    n9 = n8;
                }
            }
        }
        if (!this.A(e.l0.j()) && bl2 && !bl) {
            this.a1(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        object = bl ? (Object)"expected digit (0-9) to follow minus sign, for valid numeric value" : (Object)"expected digit (0-9) for valid numeric value";
        this.a1(n9, (String)object);
        return null;
    }

    protected String e2(int n8) throws IOException {
        int[] nArray;
        int n9;
        if (n8 == 39 && (this.q & h1) != 0) {
            return this.p2();
        }
        if ((this.q & i1) == 0) {
            this.Z0(n8, "was expecting double-quote to start field name");
        }
        boolean bl = n8 < (n9 = (nArray = ax.W4.c.i()).length) ? nArray[n8] == 0 : Character.isJavaIdentifierPart((char)n8);
        if (!bl) {
            this.Z0(n8, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int n10 = this.r0;
        int n11 = this.Y0;
        int n12 = this.s0;
        int n13 = n11;
        n8 = n10;
        if (n10 < n12) {
            n8 = n10;
            do {
                char[] cArray;
                if ((n13 = (cArray = this.U0)[n8]) < n9) {
                    if (nArray[n13] != 0) {
                        n13 = this.r0 - 1;
                        this.r0 = n8;
                        return this.X0.l(cArray, n13, n8 - n13, n11);
                    }
                } else if (!Character.isJavaIdentifierPart((char)n13)) {
                    n13 = this.r0 - 1;
                    this.r0 = n8;
                    return this.X0.l(this.U0, n13, n8 - n13, n11);
                }
                n13 = n11 * 33 + n13;
                n10 = n8 + 1;
                n11 = n13;
                n8 = n10;
            } while (n10 < n12);
            n8 = n10;
        }
        n11 = this.r0;
        this.r0 = n8;
        return this.f2(n11 - 1, n13, nArray);
    }

    @Override
    public h f() {
        int n8 = this.r0;
        int n9 = this.v0;
        d d8 = this.m1();
        long l8 = this.t0;
        return new h(d8, -1L, (long)this.r0 + l8, this.u0, n8 - n9 + 1);
    }

    protected m g2(int n8) throws IOException {
        StringBuilder stringBuilder;
        block14: {
            block8: {
                block9: {
                    block10: {
                        block13: {
                            block11: {
                                block12: {
                                    if (n8 == 39) break block8;
                                    if (n8 == 73) break block9;
                                    if (n8 == 78) break block10;
                                    if (n8 == 93) break block11;
                                    if (n8 == 43) break block12;
                                    if (n8 == 44) break block13;
                                    break block14;
                                }
                                if (this.r0 >= this.s0 && !this.h2()) {
                                    this.T0(m.s0);
                                }
                                char[] cArray = this.U0;
                                n8 = this.r0;
                                this.r0 = n8 + 1;
                                return this.d2(cArray[n8], false, true);
                            }
                            if (!this.z0.e()) break block14;
                        }
                        if (!this.z0.g() && (this.q & g1) != 0) {
                            --this.r0;
                            return m.w0;
                        }
                        break block14;
                    }
                    this.l2("NaN", 1);
                    if ((this.q & f1) != 0) {
                        return this.S1("NaN", Double.NaN);
                    }
                    this.C0("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                    break block14;
                }
                this.l2("Infinity", 1);
                if ((this.q & f1) != 0) {
                    return this.S1("Infinity", Double.POSITIVE_INFINITY);
                }
                this.C0("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                break block14;
            }
            if ((this.q & h1) != 0) {
                return this.b2();
            }
        }
        if (Character.isJavaIdentifierStart(n8)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append((char)n8);
            this.y2(stringBuilder.toString(), this.G1());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("expected a valid value ");
        stringBuilder.append(this.H1());
        this.Z0(n8, stringBuilder.toString());
        return null;
    }

    protected boolean h2() throws IOException {
        Reader reader = this.T0;
        if (reader != null) {
            Object object = this.U0;
            int n8 = reader.read((char[])object, 0, ((char[])object).length);
            if (n8 > 0) {
                int n9 = this.s0;
                long l8 = this.t0;
                long l9 = n9;
                this.t0 = l8 + l9;
                this.v0 -= n9;
                this.a1 -= l9;
                this.r0 = 0;
                this.s0 = n8;
                return true;
            }
            this.l1();
            if (n8 == 0) {
                object = new StringBuilder();
                object.append("Reader returned 0 characters when trying to read ");
                object.append(this.s0);
                throw new IOException(object.toString());
            }
        }
        return false;
    }

    protected void i2() throws IOException {
        if (!this.h2()) {
            this.L0();
        }
    }

    @Override
    protected void l1() throws IOException {
        if (this.T0 != null) {
            if (this.o0.l() || this.A(j.a.d0)) {
                this.T0.close();
            }
            this.T0 = null;
        }
    }

    protected final void l2(String string, int n8) throws IOException {
        int n9;
        int n10 = string.length();
        int n11 = n8;
        if (this.r0 + n10 >= this.s0) {
            this.m2(string, n8);
            return;
        }
        do {
            if (this.U0[this.r0] != string.charAt(n11)) {
                this.x2(string.substring(0, n11));
            }
            this.r0 = n9 = this.r0 + 1;
            n11 = n8 = n11 + 1;
        } while (n8 < n10);
        n11 = this.U0[n9];
        if (n11 >= 48 && n11 != 93 && n11 != 125) {
            this.V1(string, n8, n11);
        }
    }

    @Override
    protected char p1() throws IOException {
        char c8;
        if (this.r0 >= this.s0 && !this.h2()) {
            this.M0(" in character escape sequence", m.r0);
        }
        char[] cArray = this.U0;
        int n8 = this.r0;
        this.r0 = n8 + 1;
        char c9 = c8 = cArray[n8];
        if (c8 != '\"') {
            c9 = c8;
            if (c8 != '/') {
                c9 = c8;
                if (c8 != '\\') {
                    if (c8 != 'b') {
                        if (c8 != 'f') {
                            if (c8 != 'n') {
                                if (c8 != 'r') {
                                    if (c8 != 't') {
                                        if (c8 != 'u') {
                                            return this.x1(c8);
                                        }
                                        n8 = 0;
                                        for (int i8 = 0; i8 < 4; ++i8) {
                                            if (this.r0 >= this.s0 && !this.h2()) {
                                                this.M0(" in character escape sequence", m.r0);
                                            }
                                            cArray = this.U0;
                                            int n9 = this.r0;
                                            this.r0 = n9 + 1;
                                            char c10 = cArray[n9];
                                            if ((n9 = ax.W4.c.b(c10)) < 0) {
                                                this.Z0(c10, "expected a hex-digit for character escape sequence");
                                            }
                                            n8 = n8 << 4 | n9;
                                        }
                                        return (char)n8;
                                    }
                                    return '\t';
                                }
                                return '\r';
                            }
                            return '\n';
                        }
                        return '\f';
                    }
                    c9 = '\b';
                }
            }
        }
        return c9;
    }

    protected String p2() throws IOException {
        int n8;
        int n9;
        int n10;
        block3: {
            n10 = this.r0;
            int n11 = this.Y0;
            int n12 = this.s0;
            n9 = n10;
            n8 = n11;
            if (n10 < n12) {
                int[] nArray = l1;
                int n13 = nArray.length;
                n8 = n11;
                n9 = n10;
                do {
                    char[] cArray;
                    if ((n10 = (cArray = this.U0)[n9]) == 39) {
                        n10 = this.r0;
                        this.r0 = n9 + 1;
                        return this.X0.l(cArray, n10, n9 - n10, n8);
                    }
                    if (n10 < n13 && nArray[n10] != 0) break block3;
                    n11 = n8 * 33 + n10;
                    n9 = n10 = n9 + 1;
                    n8 = n11;
                } while (n10 < n12);
                n8 = n11;
                n9 = n10;
            }
        }
        n10 = this.r0;
        this.r0 = n9;
        return this.t2(n10, n8, 39);
    }

    protected final m r2(boolean bl) throws IOException {
        if (!this.A(e.m0.j())) {
            return this.g2(46);
        }
        int n8 = this.r0;
        int n9 = n8 - 1;
        if (bl) {
            n9 = n8 - 2;
        }
        return this.q2(46, n9, n8, bl, 0);
    }

    protected final String s2() throws IOException {
        int n8;
        int n9;
        int n10 = this.Y0;
        int[] nArray = l1;
        for (n9 = this.r0; n9 < this.s0; ++n9) {
            char[] cArray = this.U0;
            n8 = cArray[n9];
            if (n8 < nArray.length && nArray[n8] != 0) {
                if (n8 != 34) break;
                n8 = this.r0;
                this.r0 = n9 + 1;
                return this.X0.l(cArray, n8, n9 - n8, n10);
            }
            n10 = n10 * 33 + n8;
        }
        n8 = this.r0;
        this.r0 = n9;
        return this.t2(n8, n10, 34);
    }

    @Override
    public final String u() throws IOException {
        m m8 = this.d0;
        if (m8 == m.r0) {
            if (this.Z0) {
                this.Z0 = false;
                this.Y1();
            }
            return this.B0.h();
        }
        return this.a2(m8);
    }

    @Override
    public h v() {
        if (this.d0 == m.p0) {
            long l8 = this.t0;
            long l9 = this.a1;
            return new h(this.m1(), -1L, l8 + (l9 - 1L), this.b1, this.c1);
        }
        return new h(this.m1(), -1L, this.w0 - 1L, this.x0, this.y0);
    }

    protected final m w2(int n8) throws IOException {
        char c8;
        int n9;
        int n10 = this.r0;
        int n11 = n10 - 1;
        int n12 = this.s0;
        if (n8 == 48) {
            return this.u2(false, n11);
        }
        n8 = 1;
        while (true) {
            if (n10 >= n12) {
                this.r0 = n11;
                return this.u2(false, n11);
            }
            char[] cArray = this.U0;
            n9 = n10 + 1;
            c8 = cArray[n10];
            if (c8 < '0' || c8 > '9') break;
            ++n8;
            n10 = n9;
        }
        if (c8 != '.' && c8 != 'e' && c8 != 'E') {
            this.r0 = n10;
            if (this.z0.g()) {
                this.P2(c8);
            }
            this.B0.s(this.U0, n11, n10 - n11);
            return this.U1(false, n8);
        }
        this.r0 = n9;
        return this.q2(c8, n11, n9, false, n8);
    }

    protected void x2(String string) throws IOException {
        this.y2(string, this.G1());
    }

    protected void y2(String charSequence, String string) throws IOException {
        char c8;
        charSequence = new StringBuilder((String)charSequence);
        while ((this.r0 < this.s0 || this.h2()) && Character.isJavaIdentifierPart(c8 = this.U0[this.r0])) {
            ++this.r0;
            ((StringBuilder)charSequence).append(c8);
            if (((StringBuilder)charSequence).length() < 256) continue;
            ((StringBuilder)charSequence).append("...");
            break;
        }
        this.F0("Unrecognized token '%s': was expecting %s", charSequence, string);
    }
}

