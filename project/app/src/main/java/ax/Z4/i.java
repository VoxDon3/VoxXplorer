/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.h;
import ax.T4.j;
import ax.T4.m;
import ax.T4.n;
import ax.U4.b;
import ax.Z4.e;
import ax.a5.a;
import ax.b5.c;
import java.io.IOException;
import java.io.InputStream;

public class i
extends b {
    private static final int e1 = j.a.q0.l();
    private static final int f1 = j.a.k0.l();
    private static final int g1 = j.a.o0.l();
    private static final int h1 = j.a.p0.l();
    private static final int i1 = j.a.h0.l();
    private static final int j1 = j.a.g0.l();
    private static final int k1 = j.a.e0.l();
    private static final int l1 = j.a.f0.l();
    private static final int[] m1 = ax.W4.c.j();
    protected static final int[] n1 = ax.W4.c.h();
    protected n T0;
    protected final a U0;
    protected int[] V0 = new int[16];
    protected boolean W0;
    private int X0;
    protected int Y0;
    protected int Z0;
    protected int a1;
    protected InputStream b1;
    protected byte[] c1;
    protected boolean d1;

    public i(ax.W4.e e8, int n8, InputStream inputStream, n n9, a a8, byte[] byArray, int n10, int n11, int n12, boolean bl) {
        super(e8, n8);
        this.b1 = inputStream;
        this.T0 = n9;
        this.U0 = a8;
        this.c1 = byArray;
        this.r0 = n10;
        this.s0 = n11;
        this.v0 = n10 - n12;
        this.t0 = -n10 + n12;
        this.d1 = bl;
    }

    private final m A2(char[] objectArray, int n8, boolean bl, int n9) throws IOException {
        int n10;
        int n11;
        while (true) {
            if (this.r0 >= this.s0 && !this.m2()) {
                this.B0.w(n8);
                return this.U1(bl, n9);
            }
            Object[] objectArray2 = this.c1;
            n11 = this.r0;
            this.r0 = n11 + 1;
            n10 = objectArray2[n11] & 0xFF;
            if (n10 > 57 || n10 < 48) break;
            objectArray2 = objectArray;
            n11 = n8;
            if (n8 >= objectArray.length) {
                objectArray2 = this.B0.l();
                n11 = 0;
            }
            objectArray2[n11] = (char)n10;
            ++n9;
            n8 = n11 + 1;
            objectArray = objectArray2;
        }
        if (n10 != 46 && n10 != 101 && n10 != 69) {
            this.r0 = n11;
            this.B0.w(n8);
            if (this.z0.g()) {
                this.b3(this.c1[this.r0] & 0xFF);
            }
            return this.U1(bl, n9);
        }
        return this.x2((char[])objectArray, n8, n10, bl, n9);
    }

    private final m B2(boolean bl) throws IOException {
        char[] cArray = this.B0.i();
        int n8 = 1;
        int n9 = 0;
        if (bl) {
            cArray[0] = 45;
            n9 = 1;
        }
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byte[] byArray = this.c1;
        int n10 = this.r0;
        this.r0 = n10 + 1;
        int n11 = byArray[n10] & 0xFF;
        if (n11 <= 48) {
            if (n11 != 48) {
                if (n11 == 46) {
                    return this.y2(bl, true);
                }
                return this.j2(n11, bl, true);
            }
            n10 = this.a3();
        } else {
            n10 = n11;
            if (n11 > 57) {
                return this.j2(n11, bl, true);
            }
        }
        n11 = n9 + 1;
        cArray[n9] = (char)n10;
        int n12 = Math.min(this.s0, this.r0 + cArray.length - n11);
        n9 = n11;
        n10 = n8;
        while (true) {
            if ((n8 = this.r0) >= n12) {
                return this.A2(cArray, n9, bl, n10);
            }
            byArray = this.c1;
            this.r0 = n8 + 1;
            n11 = byArray[n8] & 0xFF;
            if (n11 < 48 || n11 > 57) break;
            ++n10;
            n8 = n9 + 1;
            cArray[n9] = (char)n11;
            n9 = n8;
        }
        if (n11 != 46 && n11 != 101 && n11 != 69) {
            this.r0 = n8;
            this.B0.w(n9);
            if (this.z0.g()) {
                this.b3(n11);
            }
            return this.U1(bl, n10);
        }
        return this.x2(cArray, n9, n11, bl, n10);
    }

    private final void J2() throws IOException {
        int[] nArray = ax.W4.c.g();
        while (true) {
            block6: {
                block7: {
                    int n8;
                    block8: {
                        int n9;
                        block9: {
                            block10: {
                                byte[] byArray;
                                block11: {
                                    block5: {
                                        if (this.r0 >= this.s0 && !this.m2()) break block5;
                                        byArray = this.c1;
                                        n8 = this.r0;
                                        this.r0 = n9 = n8 + 1;
                                        int n10 = nArray[n8 = byArray[n8] & 0xFF];
                                        if (n10 == 0) continue;
                                        if (n10 == 2) break block6;
                                        if (n10 == 3) break block7;
                                        if (n10 == 4) break block8;
                                        if (n10 == 10) break block9;
                                        if (n10 == 13) break block10;
                                        if (n10 != 42) {
                                            this.D2(n8);
                                            continue;
                                        }
                                        if (n9 < this.s0 || this.m2()) break block11;
                                    }
                                    this.M0(" in a comment", null);
                                    return;
                                }
                                byArray = this.c1;
                                n9 = this.r0;
                                if (byArray[n9] != 47) continue;
                                this.r0 = n9 + 1;
                                return;
                            }
                            this.K2();
                            continue;
                        }
                        ++this.u0;
                        this.v0 = n9;
                        continue;
                    }
                    this.S2(n8);
                    continue;
                }
                this.R2();
                continue;
            }
            this.Q2();
        }
    }

    private final int L2() throws IOException {
        int n8;
        int n9;
        byte[] byArray;
        block17: {
            int n10;
            block16: {
                n10 = this.r0;
                if (n10 + 4 >= this.s0) {
                    return this.M2(false);
                }
                byArray = this.c1;
                n9 = byArray[n10];
                if (n9 == 58) {
                    int n11;
                    this.r0 = n11 = n10 + 1;
                    if ((n11 = byArray[n11]) > 32) {
                        if (n11 != 47 && n11 != 35) {
                            this.r0 = n10 + 2;
                            return n11;
                        }
                        return this.M2(true);
                    }
                    if (n11 == 32 || n11 == 9) {
                        this.r0 = n11 = n10 + 2;
                        if ((n11 = byArray[n11]) > 32) {
                            if (n11 != 47 && n11 != 35) {
                                this.r0 = n10 + 3;
                                return n11;
                            }
                            return this.M2(true);
                        }
                    }
                    return this.M2(true);
                }
                if (n9 == 32) break block16;
                n8 = n9;
                if (n9 != 9) break block17;
            }
            this.r0 = n8 = n10 + 1;
            n8 = byArray[n8];
        }
        if (n8 == 58) {
            n8 = this.r0;
            this.r0 = n9 = n8 + 1;
            if ((n9 = byArray[n9]) > 32) {
                if (n9 != 47 && n9 != 35) {
                    this.r0 = n8 + 2;
                    return n9;
                }
                return this.M2(true);
            }
            if (n9 == 32 || n9 == 9) {
                this.r0 = n9 = n8 + 2;
                if ((n9 = byArray[n9]) > 32) {
                    if (n9 != 47 && n9 != 35) {
                        this.r0 = n8 + 3;
                        return n9;
                    }
                    return this.M2(true);
                }
            }
            return this.M2(true);
        }
        return this.M2(false);
    }

    private final int M2(boolean bl) throws IOException {
        while (true) {
            int n8;
            Object object;
            if (this.r0 >= this.s0 && !this.m2()) {
                object = new StringBuilder();
                ((StringBuilder)object).append(" within/between ");
                ((StringBuilder)object).append(this.z0.h());
                ((StringBuilder)object).append(" entries");
                this.M0(((StringBuilder)object).toString(), null);
                return -1;
            }
            object = this.c1;
            int n9 = this.r0;
            this.r0 = n8 = n9 + 1;
            if ((n9 = object[n9] & 0xFF) > 32) {
                if (n9 == 47) {
                    this.N2();
                    continue;
                }
                if (n9 == 35 && this.X2()) continue;
                if (bl) {
                    return n9;
                }
                if (n9 != 58) {
                    this.Z0(n9, "was expecting a colon to separate field name and value");
                }
                bl = true;
                continue;
            }
            if (n9 == 32) continue;
            if (n9 == 10) {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (n9 == 13) {
                this.K2();
                continue;
            }
            if (n9 == 9) continue;
            this.c1(n9);
        }
    }

    private final void N2() throws IOException {
        if ((this.q & k1) == 0) {
            this.Z0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.r0 >= this.s0 && !this.m2()) {
            this.M0(" in a comment", null);
        }
        byte[] byArray = this.c1;
        int n8 = this.r0;
        this.r0 = n8 + 1;
        if ((n8 = byArray[n8] & 0xFF) == 47) {
            this.O2();
            return;
        }
        if (n8 == 42) {
            this.J2();
            return;
        }
        this.Z0(n8, "was expecting either '*' or '/' for a comment");
    }

    private final void O2() throws IOException {
        int[] nArray = ax.W4.c.g();
        while (this.r0 < this.s0 || this.m2()) {
            int n8;
            byte[] byArray = this.c1;
            int n9 = this.r0;
            this.r0 = n8 = n9 + 1;
            int n10 = nArray[n9 = byArray[n9] & 0xFF];
            if (n10 == 0) continue;
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 != 4) {
                        if (n10 != 10) {
                            if (n10 != 13) {
                                if (n10 == 42 || n10 >= 0) continue;
                                this.D2(n9);
                                continue;
                            }
                            this.K2();
                            return;
                        }
                        ++this.u0;
                        this.v0 = n8;
                        return;
                    }
                    this.S2(n9);
                    continue;
                }
                this.R2();
                continue;
            }
            this.Q2();
        }
        return;
    }

    private final void Q2() throws IOException {
        int n8;
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byte[] byArray = this.c1;
        int n9 = this.r0;
        this.r0 = n8 = n9 + 1;
        if (((n9 = byArray[n9]) & 0xC0) != 128) {
            this.G2(n9 & 0xFF, n8);
        }
    }

    private final void R2() throws IOException {
        int n8;
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byte[] byArray = this.c1;
        int n9 = this.r0;
        this.r0 = n8 = n9 + 1;
        if (((n9 = byArray[n9]) & 0xC0) != 128) {
            this.G2(n9 & 0xFF, n8);
        }
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byArray = this.c1;
        n9 = this.r0;
        this.r0 = n8 = n9 + 1;
        if (((n9 = byArray[n9]) & 0xC0) != 128) {
            this.G2(n9 & 0xFF, n8);
        }
    }

    private final void S2(int n8) throws IOException {
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byte[] byArray = this.c1;
        int n9 = this.r0;
        this.r0 = n8 = n9 + 1;
        if (((n9 = byArray[n9]) & 0xC0) != 128) {
            this.G2(n9 & 0xFF, n8);
        }
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byArray = this.c1;
        n9 = this.r0;
        this.r0 = n8 = n9 + 1;
        if (((n9 = byArray[n9]) & 0xC0) != 128) {
            this.G2(n9 & 0xFF, n8);
        }
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byArray = this.c1;
        n9 = this.r0;
        this.r0 = n8 = n9 + 1;
        if (((n9 = byArray[n9]) & 0xC0) != 128) {
            this.G2(n9 & 0xFF, n8);
        }
    }

    private final int T2() throws IOException {
        int n8;
        while ((n8 = this.r0) < this.s0) {
            int n9;
            byte[] byArray = this.c1;
            this.r0 = n9 = n8 + 1;
            int n10 = byArray[n8] & 0xFF;
            if (n10 > 32) {
                if (n10 != 47 && n10 != 35) {
                    return n10;
                }
                this.r0 = n8;
                return this.U2();
            }
            if (n10 == 32) continue;
            if (n10 == 10) {
                ++this.u0;
                this.v0 = n9;
                continue;
            }
            if (n10 == 13) {
                this.K2();
                continue;
            }
            if (n10 == 9) continue;
            this.c1(n10);
        }
        return this.U2();
    }

    private final int U2() throws IOException {
        while (true) {
            int n8;
            Object object;
            if (this.r0 >= this.s0 && !this.m2()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unexpected end-of-input within/between ");
                ((StringBuilder)object).append(this.z0.h());
                ((StringBuilder)object).append(" entries");
                throw this.a(((StringBuilder)object).toString());
            }
            object = this.c1;
            int n9 = this.r0;
            this.r0 = n8 = n9 + 1;
            if ((n9 = object[n9] & 0xFF) > 32) {
                if (n9 == 47) {
                    this.N2();
                    continue;
                }
                if (n9 == 35 && this.X2()) continue;
                return n9;
            }
            if (n9 == 32) continue;
            if (n9 == 10) {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (n9 == 13) {
                this.K2();
                continue;
            }
            if (n9 == 9) continue;
            this.c1(n9);
        }
    }

    private final void V1(String string, int n8, int n9) throws IOException {
        if (Character.isJavaIdentifierPart((char)this.a2(n9))) {
            this.H2(string.substring(0, n8));
        }
    }

    private final int V2() throws IOException {
        int n8;
        if (this.r0 >= this.s0 && !this.m2()) {
            return this.q1();
        }
        byte[] byArray = this.c1;
        int n9 = this.r0;
        this.r0 = n8 = n9 + 1;
        int n10 = byArray[n9] & 0xFF;
        if (n10 > 32) {
            if (n10 != 47 && n10 != 35) {
                return n10;
            }
            this.r0 = n9;
            return this.W2();
        }
        if (n10 != 32) {
            if (n10 == 10) {
                ++this.u0;
                this.v0 = n8;
            } else if (n10 == 13) {
                this.K2();
            } else if (n10 != 9) {
                this.c1(n10);
            }
        }
        while ((n8 = this.r0) < this.s0) {
            byArray = this.c1;
            this.r0 = n10 = n8 + 1;
            n9 = byArray[n8] & 0xFF;
            if (n9 > 32) {
                if (n9 != 47 && n9 != 35) {
                    return n9;
                }
                this.r0 = n8;
                return this.W2();
            }
            if (n9 == 32) continue;
            if (n9 == 10) {
                ++this.u0;
                this.v0 = n10;
                continue;
            }
            if (n9 == 13) {
                this.K2();
                continue;
            }
            if (n9 == 9) continue;
            this.c1(n9);
        }
        return this.W2();
    }

    private final void W1() throws ax.T4.i {
        this.Y2();
        if (!this.z0.e()) {
            this.D1(93, '}');
        }
        this.z0 = this.z0.j();
    }

    private final int W2() throws IOException {
        while (this.r0 < this.s0 || this.m2()) {
            int n8;
            byte[] byArray = this.c1;
            int n9 = this.r0;
            this.r0 = n8 = n9 + 1;
            if ((n9 = byArray[n9] & 0xFF) > 32) {
                if (n9 == 47) {
                    this.N2();
                    continue;
                }
                if (n9 == 35 && this.X2()) continue;
                return n9;
            }
            if (n9 == 32) continue;
            if (n9 == 10) {
                ++this.u0;
                this.v0 = n8;
                continue;
            }
            if (n9 == 13) {
                this.K2();
                continue;
            }
            if (n9 == 9) continue;
            this.c1(n9);
        }
        return this.q1();
    }

    private final void X1() throws ax.T4.i {
        this.Y2();
        if (!this.z0.f()) {
            this.D1(125, ']');
        }
        this.z0 = this.z0.j();
    }

    private final boolean X2() throws IOException {
        if ((this.q & l1) == 0) {
            return false;
        }
        this.O2();
        return true;
    }

    private final m Y1(int n8) throws ax.T4.i {
        m m8;
        if (n8 == 125) {
            m m9;
            this.X1();
            this.d0 = m9 = m.m0;
            return m9;
        }
        this.W1();
        this.d0 = m8 = m.o0;
        return m8;
    }

    private final void Y2() {
        this.x0 = this.u0;
        int n8 = this.r0;
        this.w0 = this.t0 + (long)n8;
        this.y0 = n8 - this.v0;
    }

    private final void Z2() {
        int n8;
        this.Z0 = this.u0;
        this.Y0 = n8 = this.r0;
        this.a1 = n8 - this.v0;
    }

    private final int a3() throws IOException {
        if (this.r0 >= this.s0 && !this.m2()) {
            return 48;
        }
        int n8 = this.c1[this.r0] & 0xFF;
        if (n8 >= 48 && n8 <= 57) {
            if ((this.q & f1) == 0) {
                this.e1("Leading zeroes not allowed");
            }
            ++this.r0;
            if (n8 == 48) {
                block6: {
                    int n9;
                    do {
                        if (this.r0 >= this.s0 && !this.m2()) {
                            return n8;
                        }
                        byte[] byArray = this.c1;
                        n8 = this.r0;
                        n9 = byArray[n8] & 0xFF;
                        if (n9 < 48 || n9 > 57) break block6;
                        this.r0 = n8 + 1;
                        n8 = n9;
                    } while (n9 == 48);
                    return n9;
                }
                return 48;
            }
            return n8;
        }
        return 48;
    }

    private final int b2(int n8) throws IOException {
        int n9;
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byte[] byArray = this.c1;
        int n10 = this.r0;
        this.r0 = n9 = n10 + 1;
        if (((n10 = byArray[n10]) & 0xC0) != 128) {
            this.G2(n10 & 0xFF, n9);
        }
        return (n8 & 0x1F) << 6 | n10 & 0x3F;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void b3(int n8) throws IOException {
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

    private final int c2(int n8) throws IOException {
        int n9;
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byte[] byArray = this.c1;
        int n10 = this.r0;
        this.r0 = n9 = n10 + 1;
        if (((n10 = byArray[n10]) & 0xC0) != 128) {
            this.G2(n10 & 0xFF, n9);
        }
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byArray = this.c1;
        int n11 = this.r0;
        this.r0 = n9 = n11 + 1;
        if (((n11 = byArray[n11]) & 0xC0) != 128) {
            this.G2(n11 & 0xFF, n9);
        }
        return ((n8 & 0xF) << 6 | n10 & 0x3F) << 6 | n11 & 0x3F;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final String c3(int[] var1_1, int var2_2, int var3_3) throws ax.T4.i, ax.V4.b {
        var12_4 = (var2_2 << 2) - 4 + var3_3;
        if (var3_3 < 4) {
            var4_5 = var2_2 - 1;
            var10_6 = var1_1[var4_5];
            var1_1[var4_5] = var10_6 << (4 - var3_3 << 3);
        } else {
            var10_6 = 0;
        }
        var13_7 /* !! */  = this.B0.i();
        var7_8 = 0;
        var4_5 = 0;
        while (var7_8 < var12_4) {
            var6_10 = var1_1[var7_8 >> 2] >> (3 - (var7_8 & 3) << 3);
            var5_9 = var6_10 & 255;
            var9_12 = var7_8 + 1;
            if (var5_9 > 127) {
                if ((var6_10 & 224) == 192) {
                    var6_10 &= 31;
lbl18:
                    // 2 sources

                    while (true) {
                        var5_9 = 1;
                        break;
                    }
                } else if ((var6_10 & 240) == 224) {
                    var6_10 &= 15;
                    var5_9 = 2;
                } else if ((var6_10 & 248) == 240) {
                    var6_10 &= 7;
                    var5_9 = 3;
                } else {
                    this.E2(var5_9);
                    var6_10 = 1;
                    ** continue;
                }
                if (var9_12 + var5_9 > var12_4) {
                    this.M0(" in field name", m.p0);
                }
                var8_11 = var1_1[var9_12 >> 2] >> (3 - (var9_12 & 3) << 3);
                var9_12 = var7_8 + 2;
                if ((var8_11 & 192) != 128) {
                    this.F2(var8_11);
                }
                var8_11 = var6_10 << 6 | var8_11 & 63;
                if (var5_9 > 1) {
                    var9_12 = var1_1[var9_12 >> 2] >> (3 - (var9_12 & 3) << 3);
                    var6_10 = var7_8 + 3;
                    if ((var9_12 & 192) != 128) {
                        this.F2(var9_12);
                    }
                    var8_11 = var9_12 & 63 | var8_11 << 6;
                    if (var5_9 > 2) {
                        var9_12 = var1_1[var6_10 >> 2] >> (3 - (var6_10 & 3) << 3);
                        var6_10 = var7_8 + 4;
                        if ((var9_12 & 192) != 128) {
                            this.F2(var9_12 & 255);
                        }
                        var8_11 = var8_11 << 6 | var9_12 & 63;
                    }
                } else {
                    var6_10 = var9_12;
                }
                var14_14 /* !! */  = var13_7 /* !! */ ;
                var11_13 = var4_5;
                var7_8 = var8_11;
                var9_12 = var6_10;
                if (var5_9 > 2) {
                    var5_9 = var8_11 - 65536;
                    var14_14 /* !! */  = var13_7 /* !! */ ;
                    if (var4_5 >= var13_7 /* !! */ .length) {
                        var14_14 /* !! */  = this.B0.k();
                    }
                    var14_14 /* !! */ [var4_5] = (char)((var5_9 >> 10) + 55296);
                    var7_8 = var5_9 & 1023 | 56320;
                    var11_13 = var4_5 + 1;
                    var9_12 = var6_10;
                }
            } else {
                var14_14 /* !! */  = var13_7 /* !! */ ;
                var11_13 = var4_5;
                var7_8 = var5_9;
            }
            var13_7 /* !! */  = var14_14 /* !! */ ;
            if (var11_13 >= var14_14 /* !! */ .length) {
                var13_7 /* !! */  = this.B0.k();
            }
            var13_7 /* !! */ [var11_13] = (char)var7_8;
            var4_5 = var11_13 + 1;
            var7_8 = var9_12;
        }
        var13_7 /* !! */  = (char[])new String(var13_7 /* !! */ , 0, var4_5);
        if (var3_3 < 4) {
            var1_1[var2_2 - 1] = var10_6;
        }
        return this.U0.p((String)var13_7 /* !! */ , var1_1, var2_2);
    }

    private final int d2(int n8) throws IOException {
        int n9;
        byte[] byArray = this.c1;
        int n10 = this.r0;
        this.r0 = n9 = n10 + 1;
        if (((n10 = byArray[n10]) & 0xC0) != 128) {
            this.G2(n10 & 0xFF, n9);
        }
        byArray = this.c1;
        int n11 = this.r0;
        this.r0 = n9 = n11 + 1;
        if (((n11 = byArray[n11]) & 0xC0) != 128) {
            this.G2(n11 & 0xFF, n9);
        }
        return ((n8 & 0xF) << 6 | n10 & 0x3F) << 6 | n11 & 0x3F;
    }

    private final String d3(int n8, int n9) throws ax.T4.i, ax.V4.b {
        Object object = this.U0.w(n8 = i.v2(n8, n9));
        if (object != null) {
            return object;
        }
        object = this.V0;
        object[0] = n8;
        return this.c3((int[])object, 1, n9);
    }

    private final int e2(int n8) throws IOException {
        int n9;
        int n10;
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byte[] byArray = this.c1;
        int n11 = this.r0;
        this.r0 = n10 = n11 + 1;
        if (((n11 = byArray[n11]) & 0xC0) != 128) {
            this.G2(n11 & 0xFF, n10);
        }
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byArray = this.c1;
        n10 = this.r0;
        this.r0 = n9 = n10 + 1;
        if (((n10 = byArray[n10]) & 0xC0) != 128) {
            this.G2(n10 & 0xFF, n9);
        }
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byArray = this.c1;
        int n12 = this.r0;
        this.r0 = n9 = n12 + 1;
        if (((n12 = byArray[n12]) & 0xC0) != 128) {
            this.G2(n12 & 0xFF, n9);
        }
        return ((((n8 & 7) << 6 | n11 & 0x3F) << 6 | n10 & 0x3F) << 6 | n12 & 0x3F) - 65536;
    }

    private final String e3(int n8, int n9, int n10) throws ax.T4.i, ax.V4.b {
        Object object = this.U0.x(n8, n9 = i.v2(n9, n10));
        if (object != null) {
            return object;
        }
        object = this.V0;
        object[0] = n8;
        object[1] = n9;
        return this.c3((int[])object, 2, n10);
    }

    private final String f3(int n8, int n9, int n10, int n11) throws ax.T4.i, ax.V4.b {
        Object object = this.U0.y(n8, n9, n10 = i.v2(n10, n11));
        if (object != null) {
            return object;
        }
        object = this.V0;
        object[0] = n8;
        object[1] = n9;
        object[2] = i.v2(n10, n11);
        return this.c3((int[])object, 3, n11);
    }

    private final void g2(char[] cArray, int n8) throws IOException {
        int[] nArray = m1;
        byte[] byArray = this.c1;
        block0: while (true) {
            int n9;
            int n10 = n9 = this.r0;
            if (n9 >= this.s0) {
                this.n2();
                n10 = this.r0;
            }
            int n11 = cArray.length;
            int n12 = 0;
            n9 = n8;
            if (n8 >= n11) {
                cArray = this.B0.l();
                n9 = 0;
            }
            n11 = Math.min(this.s0, cArray.length - n9 + n10);
            while (n10 < n11) {
                n8 = n10 + 1;
                int n13 = nArray[n10 = byArray[n10] & 0xFF];
                if (n13 != 0) {
                    this.r0 = n8;
                    if (n10 == 34) {
                        this.B0.w(n9);
                        return;
                    }
                    if (n13 != 1) {
                        if (n13 != 2) {
                            if (n13 != 3) {
                                if (n13 != 4) {
                                    if (n10 < 32) {
                                        this.F1(n10, "string value");
                                        n8 = n10;
                                    } else {
                                        this.D2(n10);
                                        n8 = n10;
                                    }
                                } else {
                                    n10 = this.e2(n10);
                                    n8 = n9 + 1;
                                    cArray[n9] = (char)(n10 >> 10 | 0xD800);
                                    if (n8 >= cArray.length) {
                                        cArray = this.B0.l();
                                        n9 = 0;
                                    } else {
                                        n9 = n8;
                                    }
                                    n8 = n10 & 0x3FF | 0xDC00;
                                }
                            } else {
                                n8 = this.s0 - n8 >= 2 ? this.d2(n10) : this.c2(n10);
                            }
                        } else {
                            n8 = this.b2(n10);
                        }
                    } else {
                        n8 = this.p1();
                    }
                    if (n9 >= cArray.length) {
                        cArray = this.B0.l();
                        n9 = n12;
                    }
                    n10 = n9 + 1;
                    cArray[n9] = (char)n8;
                    n8 = n10;
                    continue block0;
                }
                cArray[n9] = (char)n10;
                n10 = n8;
                ++n9;
            }
            this.r0 = n10;
            n8 = n9;
        }
    }

    private final String g3(int[] object, int n8, int n9, int n10) throws ax.T4.i, ax.V4.b {
        int[] nArray = object;
        if (n8 >= ((int[])object).length) {
            nArray = b.P1(object, ((int[])object).length);
            this.V0 = nArray;
        }
        int n11 = n8 + 1;
        nArray[n8] = i.v2(n9, n10);
        object = this.U0.z(nArray, n11);
        if (object == null) {
            return this.c3(nArray, n11, n10);
        }
        return object;
    }

    private int h3() throws IOException {
        if (this.r0 >= this.s0) {
            this.n2();
        }
        byte[] byArray = this.c1;
        int n8 = this.r0;
        this.r0 = n8 + 1;
        return byArray[n8] & 0xFF;
    }

    private final String m3(int n8, int n9, int n10) throws IOException {
        return this.i3(this.V0, 0, n8, n9, n10);
    }

    private final String n3(int n8, int n9, int n10, int n11) throws IOException {
        int[] nArray = this.V0;
        nArray[0] = n8;
        return this.i3(nArray, 1, n9, n10, n11);
    }

    private final String o3(int n8, int n9, int n10, int n11, int n12) throws IOException {
        int[] nArray = this.V0;
        nArray[0] = n8;
        nArray[1] = n9;
        return this.i3(nArray, 2, n10, n11, n12);
    }

    private final void r2(String string, int n8) throws IOException {
        int n9;
        int n10;
        int n11 = string.length();
        do {
            if (this.r0 >= this.s0 && !this.m2() || this.c1[this.r0] != string.charAt(n8)) {
                this.H2(string.substring(0, n8));
            }
            this.r0 = n9 = this.r0 + 1;
            n8 = n10 = n8 + 1;
        } while (n10 < n11);
        if ((n9 < this.s0 || this.m2()) && (n8 = this.c1[this.r0] & 0xFF) >= 48 && n8 != 93 && n8 != 125) {
            this.V1(string, n10, n8);
        }
    }

    private final m t2() throws IOException {
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

    private final m u2(int n8) throws IOException {
        m m8;
        if (n8 == 34) {
            m m9;
            this.W0 = true;
            this.d0 = m9 = m.r0;
            return m9;
        }
        if (n8 != 43) {
            m m10;
            if (n8 != 91) {
                m m11;
                if (n8 != 102) {
                    m m12;
                    if (n8 != 110) {
                        m m13;
                        if (n8 != 116) {
                            m m14;
                            if (n8 != 123) {
                                m m15;
                                if (n8 != 45) {
                                    m m16;
                                    if (n8 != 46) {
                                        m m17;
                                        switch (n8) {
                                            default: {
                                                m m18;
                                                this.d0 = m18 = this.l2(n8);
                                                return m18;
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
                                            case 57: 
                                        }
                                        this.d0 = m17 = this.C2(n8);
                                        return m17;
                                    }
                                    this.d0 = m16 = this.y2(false, false);
                                    return m16;
                                }
                                this.d0 = m15 = this.B2(true);
                                return m15;
                            }
                            this.N1(this.x0, this.y0);
                            this.d0 = m14 = m.l0;
                            return m14;
                        }
                        this.s2();
                        this.d0 = m13 = m.u0;
                        return m13;
                    }
                    this.p2();
                    this.d0 = m12 = m.w0;
                    return m12;
                }
                this.o2();
                this.d0 = m11 = m.v0;
                return m11;
            }
            this.M1(this.x0, this.y0);
            this.d0 = m10 = m.n0;
            return m10;
        }
        if (!this.A(e.l0.j())) {
            m m19;
            this.d0 = m19 = this.l2(n8);
            return m19;
        }
        this.d0 = m8 = this.B2(false);
        return m8;
    }

    private static final int v2(int n8, int n9) {
        if (n9 == 4) {
            return n8;
        }
        return n8 | -1 << (n9 << 3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final m x2(char[] objectArray, int n8, int n9, boolean bl, int n10) throws IOException {
        boolean var5_18;
        boolean var4_17;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        block25: {
            int n16;
            int n17;
            int n18;
            int n19;
            block27: {
                Object var1_8;
                block26: {
                    Object var13_33;
                    block24: {
                        n15 = 0;
                        if (n19 != 46) {
                            n14 = 0;
                            n13 = 0;
                            n18 = n19;
                            n16 = n17;
                            Object[] objectArray2 = objectArray;
                            n17 = n13;
                        } else {
                            Object var1_3;
                            block23: {
                                Object var13_22;
                                Object[] objectArray3 = objectArray;
                                n16 = n17;
                                if (n17 >= objectArray.length) {
                                    char[] cArray = this.B0.l();
                                    n16 = 0;
                                }
                                var13_22[n16] = (char)n19;
                                n17 = n16 + 1;
                                n13 = 0;
                                n12 = n19;
                                n19 = n17;
                                void var1_2 = var13_22;
                                while (true) {
                                    Object var13_27;
                                    if (this.r0 >= this.s0 && !this.m2()) {
                                        n11 = 1;
                                        break block23;
                                    }
                                    byte[] byArray = this.c1;
                                    n17 = this.r0;
                                    this.r0 = n17 + 1;
                                    n12 = byArray[n17] & 0xFF;
                                    if (n12 < 48 || n12 > 57) break;
                                    ++n13;
                                    void var13_25 = var1_3;
                                    n17 = n19;
                                    if (n19 >= ((void)var1_3).length) {
                                        char[] cArray = this.B0.l();
                                        n17 = 0;
                                    }
                                    var13_27[n17] = (char)n12;
                                    n19 = n17 + 1;
                                    void var1_4 = var13_27;
                                }
                                n11 = 0;
                            }
                            n14 = n13;
                            n17 = n11;
                            void var13_29 = var1_3;
                            n16 = n19;
                            n18 = n12;
                            if (n13 == 0) {
                                n14 = n13;
                                n17 = n11;
                                void var13_30 = var1_3;
                                n16 = n19;
                                n18 = n12;
                                if (!this.A(e.n0.j())) {
                                    this.a1(n12, "Decimal point not followed by a digit");
                                    n14 = n13;
                                    n17 = n11;
                                    void var13_31 = var1_3;
                                    n16 = n19;
                                    n18 = n12;
                                }
                            }
                        }
                        if (n18 == 101) break block24;
                        n13 = n15;
                        n11 = n17;
                        n12 = n16;
                        n15 = n18;
                        if (n18 != 69) break block25;
                    }
                    void var1_6 = var13_33;
                    n19 = n16;
                    if (n16 >= ((void)var13_33).length) {
                        char[] cArray = this.B0.l();
                        n19 = 0;
                    }
                    n13 = n19 + 1;
                    var1_8[n19] = (char)n18;
                    if (this.r0 >= this.s0) {
                        this.n2();
                    }
                    byte[] byArray = this.c1;
                    n19 = this.r0;
                    this.r0 = n19 + 1;
                    n18 = byArray[n19] & 0xFF;
                    if (n18 == 45) break block26;
                    n19 = n13;
                    void var13_35 = var1_8;
                    n16 = n18;
                    if (n18 != 43) break block27;
                }
                n19 = n13;
                void var13_38 = var1_8;
                if (n13 >= ((void)var1_8).length) {
                    char[] cArray = this.B0.l();
                    n19 = 0;
                }
                var13_40[n19] = (char)n18;
                if (this.r0 >= this.s0) {
                    this.n2();
                }
                byte[] byArray = this.c1;
                n16 = this.r0;
                this.r0 = n16 + 1;
                n16 = byArray[n16] & 0xFF;
                ++n19;
            }
            n18 = 0;
            while (n16 >= 48 && n16 <= 57) {
                Object var1_14;
                Object var13_41;
                ++n18;
                n13 = n19;
                void var1_12 = var13_41;
                if (n19 >= ((void)var13_41).length) {
                    char[] cArray = this.B0.l();
                    n13 = 0;
                }
                n19 = n13 + 1;
                var1_14[n13] = (char)n16;
                if (this.r0 >= this.s0 && !this.m2()) {
                    n17 = 1;
                    break;
                }
                byte[] byArray = this.c1;
                n16 = this.r0;
                this.r0 = n16 + 1;
                n16 = byArray[n16] & 0xFF;
                void var13_43 = var1_14;
            }
            n13 = n18;
            n11 = n17;
            n12 = n19;
            n15 = n16;
            if (n18 == 0) {
                this.a1(n16, "Exponent indicator not followed by a digit");
                n15 = n16;
                n12 = n19;
                n11 = n17;
                n13 = n18;
            }
        }
        if (n11 == 0) {
            --this.r0;
            if (this.z0.g()) {
                this.b3(n15);
            }
        }
        this.B0.w(n12);
        return this.T1((boolean)var4_17, (int)var5_18, n14, n13);
    }

    @Override
    protected void C1() throws IOException {
        byte[] byArray;
        byte[] byArray2;
        super.C1();
        this.U0.G();
        if (this.d1 && (byArray2 = this.c1) != null && byArray2 != (byArray = ax.U4.c.e0)) {
            this.c1 = byArray;
            this.o0.o(byArray2);
        }
    }

    protected m C2(int n8) throws IOException {
        int n9;
        int n10;
        char[] cArray = this.B0.i();
        int n11 = n8;
        if (n8 == 48) {
            n11 = this.a3();
        }
        cArray[0] = (char)n11;
        int n12 = Math.min(this.s0, this.r0 + cArray.length - 1);
        n11 = 1;
        n8 = 1;
        while (true) {
            if ((n10 = this.r0) >= n12) {
                return this.A2(cArray, n11, false, n8);
            }
            byte[] byArray = this.c1;
            this.r0 = n10 + 1;
            n9 = byArray[n10] & 0xFF;
            if (n9 < 48 || n9 > 57) break;
            ++n8;
            cArray[n11] = (char)n9;
            ++n11;
        }
        if (n9 != 46 && n9 != 101 && n9 != 69) {
            this.r0 = n10;
            this.B0.w(n11);
            if (this.z0.g()) {
                this.b3(n9);
            }
            return this.U1(false, n8);
        }
        return this.x2(cArray, n11, n9, false, n8);
    }

    protected void D2(int n8) throws ax.T4.i {
        if (n8 < 32) {
            this.c1(n8);
        }
        this.E2(n8);
    }

    protected void E2(int n8) throws ax.T4.i {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid UTF-8 start byte 0x");
        stringBuilder.append(Integer.toHexString(n8));
        this.C0(stringBuilder.toString());
    }

    protected void F2(int n8) throws ax.T4.i {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid UTF-8 middle byte 0x");
        stringBuilder.append(Integer.toHexString(n8));
        this.C0(stringBuilder.toString());
    }

    protected void G2(int n8, int n9) throws ax.T4.i {
        this.r0 = n9;
        this.F2(n8);
    }

    @Override
    public m H() throws IOException {
        int n8;
        m m8;
        Object object;
        block30: {
            int n9;
            block31: {
                object = this.d0;
                m8 = m.p0;
                if (object == m8) {
                    return this.t2();
                }
                this.G0 = 0;
                if (this.W0) {
                    this.P2();
                }
                if ((n9 = this.V2()) < 0) {
                    this.close();
                    this.d0 = null;
                    return null;
                }
                this.F0 = null;
                if (n9 == 93) {
                    this.W1();
                    this.d0 = m8 = m.o0;
                    return m8;
                }
                if (n9 == 125) {
                    this.X1();
                    this.d0 = m8 = m.m0;
                    return m8;
                }
                n8 = n9;
                if (!this.z0.n()) break block30;
                if (n9 != 44) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("was expecting comma to separate ");
                    ((StringBuilder)object).append(this.z0.h());
                    ((StringBuilder)object).append(" entries");
                    this.Z0(n9, ((StringBuilder)object).toString());
                }
                n8 = n9 = this.T2();
                if ((this.q & e1) == 0) break block30;
                if (n9 == 93) break block31;
                n8 = n9;
                if (n9 != 125) break block30;
            }
            return this.Y1(n9);
        }
        if (!this.z0.f()) {
            this.Y2();
            return this.u2(n8);
        }
        this.Z2();
        object = this.z2(n8);
        this.z0.q((String)object);
        this.d0 = m8;
        n8 = this.L2();
        this.Y2();
        if (n8 == 34) {
            this.W0 = true;
            this.A0 = m.r0;
            return this.d0;
        }
        if (n8 != 43) {
            if (n8 != 91) {
                if (n8 != 102) {
                    if (n8 != 110) {
                        if (n8 != 116) {
                            if (n8 != 123) {
                                if (n8 != 45) {
                                    if (n8 != 46) {
                                        switch (n8) {
                                            default: {
                                                m8 = this.l2(n8);
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
                                                m8 = this.C2(n8);
                                                break;
                                            }
                                        }
                                    } else {
                                        m8 = this.y2(false, false);
                                    }
                                } else {
                                    m8 = this.B2(true);
                                }
                            } else {
                                m8 = m.l0;
                            }
                        } else {
                            this.s2();
                            m8 = m.u0;
                        }
                    } else {
                        this.p2();
                        m8 = m.w0;
                    }
                } else {
                    this.o2();
                    m8 = m.v0;
                }
            } else {
                m8 = m.n0;
            }
        } else {
            m8 = this.A(e.l0.j()) ? this.B2(false) : this.l2(n8);
        }
        this.A0 = m8;
        return this.d0;
    }

    protected void H2(String string) throws IOException {
        this.I2(string, this.G1());
    }

    protected void I2(String charSequence, String string) throws IOException {
        charSequence = new StringBuilder((String)charSequence);
        while (this.r0 < this.s0 || this.m2()) {
            byte[] byArray = this.c1;
            int n8 = this.r0;
            this.r0 = n8 + 1;
            char c8 = (char)this.a2(byArray[n8]);
            if (!Character.isJavaIdentifierPart(c8)) break;
            ((StringBuilder)charSequence).append(c8);
            if (((StringBuilder)charSequence).length() < 256) continue;
            ((StringBuilder)charSequence).append("...");
            break;
        }
        this.F0("Unrecognized token '%s': was expecting %s", charSequence, string);
    }

    protected final void K2() throws IOException {
        int n8;
        byte[] byArray;
        if ((this.r0 < this.s0 || this.m2()) && (byArray = this.c1)[n8 = this.r0] == 10) {
            this.r0 = n8 + 1;
        }
        ++this.u0;
        this.v0 = this.r0;
    }

    protected void P2() throws IOException {
        this.W0 = false;
        int[] nArray = m1;
        byte[] byArray = this.c1;
        block0: while (true) {
            int n8 = this.r0;
            int n9 = this.s0;
            int n10 = n8;
            int n11 = n9;
            if (n8 >= n9) {
                this.n2();
                n10 = this.r0;
                n11 = this.s0;
            }
            while (n10 < n11) {
                n9 = n10 + 1;
                n8 = byArray[n10] & 0xFF;
                if ((n10 = nArray[n8]) != 0) {
                    this.r0 = n9;
                    if (n8 == 34) {
                        return;
                    }
                    if (n10 != 1) {
                        if (n10 != 2) {
                            if (n10 != 3) {
                                if (n10 != 4) {
                                    if (n8 < 32) {
                                        this.F1(n8, "string value");
                                        continue block0;
                                    }
                                    this.D2(n8);
                                    continue block0;
                                }
                                this.S2(n8);
                                continue block0;
                            }
                            this.R2();
                            continue block0;
                        }
                        this.Q2();
                        continue block0;
                    }
                    this.p1();
                    continue block0;
                }
                n10 = n9;
            }
            this.r0 = n10;
        }
    }

    protected final byte[] Z1(ax.T4.a a8) throws IOException {
        Object object = this.t1();
        while (true) {
            int n8;
            if (this.r0 >= this.s0) {
                this.n2();
            }
            byte[] byArray = this.c1;
            int n9 = this.r0;
            this.r0 = n9 + 1;
            int n10 = byArray[n9] & 0xFF;
            if (n10 <= 32) continue;
            n9 = n8 = a8.g(n10);
            if (n8 < 0) {
                if (n10 == 34) {
                    return ((c)object).m();
                }
                n9 = n8 = this.o1(a8, n10, 0);
                if (n8 < 0) continue;
            }
            if (this.r0 >= this.s0) {
                this.n2();
            }
            byArray = this.c1;
            n8 = this.r0;
            this.r0 = n8 + 1;
            int n11 = byArray[n8] & 0xFF;
            n8 = n10 = a8.g(n11);
            if (n10 < 0) {
                n8 = this.o1(a8, n11, 1);
            }
            n11 = n9 << 6 | n8;
            if (this.r0 >= this.s0) {
                this.n2();
            }
            byArray = this.c1;
            n9 = this.r0;
            this.r0 = n9 + 1;
            int n12 = byArray[n9] & 0xFF;
            n10 = n8 = a8.g(n12);
            if (n8 < 0) {
                n9 = n8;
                if (n8 != -2) {
                    if (n12 == 34) {
                        ((c)object).b(n11 >> 4);
                        if (a8.k()) {
                            --this.r0;
                            this.w1(a8);
                        }
                        return ((c)object).m();
                    }
                    n9 = this.o1(a8, n12, 2);
                }
                n10 = n9;
                if (n9 == -2) {
                    if (this.r0 >= this.s0) {
                        this.n2();
                    }
                    byArray = this.c1;
                    n9 = this.r0;
                    this.r0 = n9 + 1;
                    if (!a8.n(n9 = byArray[n9] & 0xFF) && this.o1(a8, n9, 3) != -2) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("expected padding character '");
                        ((StringBuilder)object).append(a8.i());
                        ((StringBuilder)object).append("'");
                        throw this.R1(a8, n9, 3, ((StringBuilder)object).toString());
                    }
                    ((c)object).b(n11 >> 4);
                    continue;
                }
            }
            n11 = n11 << 6 | n10;
            if (this.r0 >= this.s0) {
                this.n2();
            }
            byArray = this.c1;
            n9 = this.r0;
            this.r0 = n9 + 1;
            n12 = byArray[n9] & 0xFF;
            n10 = n8 = a8.g(n12);
            if (n8 < 0) {
                n9 = n8;
                if (n8 != -2) {
                    if (n12 == 34) {
                        ((c)object).d(n11 >> 2);
                        if (a8.k()) {
                            --this.r0;
                            this.w1(a8);
                        }
                        return ((c)object).m();
                    }
                    n9 = this.o1(a8, n12, 3);
                }
                n10 = n9;
                if (n9 == -2) {
                    ((c)object).d(n11 >> 2);
                    continue;
                }
            }
            ((c)object).c(n11 << 6 | n10);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected int a2(int var1_1) throws IOException {
        var2_3 = var3_2 = var1_1 & 255;
        if (var3_2 > 127) {
            if ((var1_1 & 224) == 192) {
                var2_3 = var1_1 & 31;
lbl5:
                // 2 sources

                while (true) {
                    var1_1 = 1;
                    break;
                }
            } else if ((var1_1 & 240) == 224) {
                var2_3 = var1_1 & 15;
                var1_1 = 2;
            } else if ((var1_1 & 248) == 240) {
                var2_3 = var1_1 & 7;
                var1_1 = 3;
            } else {
                this.E2(var1_1 & 255);
                var2_3 = var3_2;
                ** continue;
            }
            var3_2 = this.h3();
            if ((var3_2 & 192) != 128) {
                this.F2(var3_2 & 255);
            }
            var2_3 = var3_2 = var2_3 << 6 | var3_2 & 63;
            if (var1_1 > 1) {
                var2_3 = this.h3();
                if ((var2_3 & 192) != 128) {
                    this.F2(var2_3 & 255);
                }
                var2_3 = var3_2 = var3_2 << 6 | var2_3 & 63;
                if (var1_1 > 2) {
                    var1_1 = this.h3();
                    if ((var1_1 & 192) != 128) {
                        this.F2(var1_1 & 255);
                    }
                    return var1_1 & 63 | var3_2 << 6;
                }
            }
        }
        return var2_3;
    }

    @Override
    public byte[] d(ax.T4.a a8) throws IOException {
        Object object = this.d0;
        if (object != m.r0 && (object != m.q0 || this.F0 == null)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Current token (");
            ((StringBuilder)object).append((Object)this.d0);
            ((StringBuilder)object).append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            this.C0(((StringBuilder)object).toString());
        }
        if (this.W0) {
            try {
                this.F0 = this.Z1(a8);
                this.W0 = false;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to decode VALUE_STRING as base64 (");
                stringBuilder.append(a8);
                stringBuilder.append("): ");
                stringBuilder.append(illegalArgumentException.getMessage());
                throw this.a(stringBuilder.toString());
            }
        } else if (this.F0 == null) {
            object = this.t1();
            this.d0(this.u(), (c)object, a8);
            this.F0 = ((c)object).m();
        }
        return this.F0;
    }

    @Override
    public h f() {
        int n8 = this.r0;
        int n9 = this.v0;
        return new h(this.m1(), this.t0 + (long)this.r0, -1L, this.u0, n8 - n9 + 1);
    }

    protected String f2() throws IOException {
        int n8;
        int n9 = n8 = this.r0;
        if (n8 >= this.s0) {
            this.n2();
            n9 = this.r0;
        }
        char[] cArray = this.B0.i();
        int[] nArray = m1;
        int n10 = Math.min(this.s0, cArray.length + n9);
        byte[] byArray = this.c1;
        n8 = 0;
        while (n9 < n10) {
            int n11 = byArray[n9] & 0xFF;
            if (nArray[n11] != 0) {
                if (n11 != 34) break;
                this.r0 = n9 + 1;
                return this.B0.v(n8);
            }
            ++n9;
            cArray[n8] = (char)n11;
            ++n8;
        }
        this.r0 = n9;
        this.g2(cArray, n8);
        return this.B0.h();
    }

    protected final String h2(m m8) throws IOException {
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

    protected m i2() throws IOException {
        char[] cArray = this.B0.i();
        int[] nArray = m1;
        byte[] byArray = this.c1;
        int n8 = 0;
        block0: while (true) {
            if (this.r0 >= this.s0) {
                this.n2();
            }
            char[] cArray2 = cArray;
            int n9 = n8;
            if (n8 >= cArray.length) {
                cArray2 = this.B0.l();
                n9 = 0;
            }
            n8 = this.s0;
            int n10 = this.r0 + (cArray2.length - n9);
            int n11 = n9;
            int n12 = n8;
            if (n10 < n8) {
                n12 = n10;
                n11 = n9;
            }
            while (true) {
                n10 = this.r0;
                cArray = cArray2;
                n8 = n11;
                if (n10 >= n12) continue block0;
                this.r0 = n9 = n10 + 1;
                n8 = byArray[n10] & 0xFF;
                if (n8 == 39) {
                    this.B0.w(n11);
                    return m.r0;
                }
                n10 = nArray[n8];
                if (n10 != 0 && n8 != 34) {
                    if (n10 != 1) {
                        if (n10 != 2) {
                            if (n10 != 3) {
                                if (n10 != 4) {
                                    if (n8 < 32) {
                                        this.F1(n8, "string value");
                                    }
                                    this.D2(n8);
                                    cArray = cArray2;
                                } else {
                                    n9 = this.e2(n8);
                                    n8 = n11 + 1;
                                    cArray2[n11] = (char)(n9 >> 10 | 0xD800);
                                    if (n8 >= cArray2.length) {
                                        cArray2 = this.B0.l();
                                        n11 = 0;
                                    } else {
                                        n11 = n8;
                                    }
                                    n8 = 0xDC00 | n9 & 0x3FF;
                                    cArray = cArray2;
                                }
                            } else if (this.s0 - n9 >= 2) {
                                n8 = this.d2(n8);
                                cArray = cArray2;
                            } else {
                                n8 = this.c2(n8);
                                cArray = cArray2;
                            }
                        } else {
                            n8 = this.b2(n8);
                            cArray = cArray2;
                        }
                    } else {
                        n8 = this.p1();
                        cArray = cArray2;
                    }
                    cArray2 = cArray;
                    n9 = n11;
                    if (n11 >= cArray.length) {
                        cArray2 = this.B0.l();
                        n9 = 0;
                    }
                    cArray2[n9] = (char)n8;
                    n8 = n9 + 1;
                    cArray = cArray2;
                    continue block0;
                }
                cArray2[n11] = (char)n8;
                ++n11;
            }
            break;
        }
    }

    protected final String i3(int[] object, int n8, int n9, int n10, int n11) throws IOException {
        int[] nArray = n1;
        int n12 = n10;
        while (true) {
            Object[] objectArray = object;
            int n13 = n8;
            int n14 = n9;
            n10 = n12;
            int n15 = n11;
            if (nArray[n12] != 0) {
                if (n12 == 34) {
                    objectArray = object;
                    n10 = n8;
                    if (n11 > 0) {
                        objectArray = object;
                        if (n8 >= ((int[])object).length) {
                            objectArray = b.P1(object, ((int[])object).length);
                            this.V0 = objectArray;
                        }
                        objectArray[n8] = i.v2(n9, n11);
                        n10 = n8 + 1;
                    }
                    if ((object = (Object)this.U0.z((int[])objectArray, n10)) == null) {
                        return this.c3((int[])objectArray, n10, n11);
                    }
                    return object;
                }
                if (n12 != 92) {
                    this.F1(n12, "name");
                } else {
                    n12 = this.p1();
                }
                objectArray = object;
                n13 = n8;
                n14 = n9;
                n10 = n12;
                n15 = n11;
                if (n12 > 127) {
                    n14 = 0;
                    objectArray = object;
                    n10 = n8;
                    n15 = n9;
                    n13 = n11;
                    if (n11 >= 4) {
                        objectArray = object;
                        if (n8 >= ((int[])object).length) {
                            objectArray = b.P1(object, ((int[])object).length);
                            this.V0 = objectArray;
                        }
                        objectArray[n8] = n9;
                        n10 = n8 + 1;
                        n15 = 0;
                        n13 = 0;
                    }
                    if (n12 < 2048) {
                        n8 = n15 << 8 | (n12 >> 6 | 0xC0);
                        n9 = n13 + 1;
                        object = objectArray;
                        n13 = n10;
                    } else {
                        n9 = n15 << 8 | (n12 >> 12 | 0xE0);
                        n8 = n13 + 1;
                        if (n8 >= 4) {
                            object = objectArray;
                            if (n10 >= objectArray.length) {
                                object = b.P1(objectArray, objectArray.length);
                                this.V0 = object;
                            }
                            object[n10] = n9;
                            ++n10;
                            n8 = 0;
                            n9 = n14;
                        } else {
                            object = objectArray;
                        }
                        n11 = n9 << 8 | (n12 >> 6 & 0x3F | 0x80);
                        n9 = n8 + 1;
                        n8 = n11;
                        n13 = n10;
                    }
                    n10 = n12 & 0x3F | 0x80;
                    n15 = n9;
                    n14 = n8;
                    objectArray = object;
                }
            }
            if (n15 < 4) {
                n11 = n15 + 1;
                n9 = n14 << 8 | n10;
                object = objectArray;
                n8 = n13;
            } else {
                object = objectArray;
                if (n13 >= objectArray.length) {
                    object = b.P1(objectArray, objectArray.length);
                    this.V0 = object;
                }
                object[n13] = n14;
                n9 = n10;
                n8 = n13 + 1;
                n11 = 1;
            }
            if (this.r0 >= this.s0 && !this.m2()) {
                this.M0(" in field name", m.p0);
            }
            objectArray = this.c1;
            n10 = this.r0;
            this.r0 = n10 + 1;
            n12 = objectArray[n10] & 0xFF;
        }
    }

    protected m j2(int n8, boolean bl, boolean bl2) throws IOException {
        Object object;
        int n9;
        while (true) {
            n9 = n8;
            if (n8 != 73) break;
            if (this.r0 >= this.s0 && !this.m2()) {
                this.T0(m.t0);
            }
            object = this.c1;
            n8 = this.r0;
            this.r0 = n8 + 1;
            if ((n8 = object[n8]) == 78) {
                object = bl ? (Object)"-INF" : (Object)"+INF";
            } else {
                n9 = n8;
                if (n8 != 110) break;
                object = bl ? (Object)"-Infinity" : (Object)"+Infinity";
            }
            this.q2((String)object, 3);
            if ((this.q & g1) != 0) {
                double d8 = bl ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                return this.S1((String)object, d8);
            }
            this.D0("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", object);
        }
        if (!this.A(e.l0.j()) && bl2 && !bl) {
            this.a1(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        object = bl ? (Object)"expected digit (0-9) to follow minus sign, for valid numeric value" : (Object)"expected digit (0-9) for valid numeric value";
        this.a1(n9, (String)object);
        return null;
    }

    protected final String j3(int n8, int n9, int n10) throws IOException {
        int[] nArray = this.V0;
        nArray[0] = this.X0;
        nArray[1] = n9;
        nArray[2] = n10;
        byte[] byArray = this.c1;
        nArray = n1;
        n9 = n8;
        n8 = 3;
        while ((n10 = this.r0) + 4 <= this.s0) {
            int n11;
            this.r0 = n11 = n10 + 1;
            int n12 = byArray[n10] & 0xFF;
            if (nArray[n12] != 0) {
                if (n12 == 34) {
                    return this.g3(this.V0, n8, n9, 1);
                }
                return this.i3(this.V0, n8, n9, n12, 1);
            }
            n12 = n9 << 8 | n12;
            this.r0 = n9 = n10 + 2;
            if (nArray[n11 = byArray[n11] & 0xFF] != 0) {
                if (n11 == 34) {
                    return this.g3(this.V0, n8, n12, 2);
                }
                return this.i3(this.V0, n8, n12, n11, 2);
            }
            n12 = n12 << 8 | n11;
            this.r0 = n11 = n10 + 3;
            if (nArray[n9 = byArray[n9] & 0xFF] != 0) {
                if (n9 == 34) {
                    return this.g3(this.V0, n8, n12, 3);
                }
                return this.i3(this.V0, n8, n12, n9, 3);
            }
            n12 = n12 << 8 | n9;
            this.r0 = n10 + 4;
            n9 = byArray[n11] & 0xFF;
            if (nArray[n9] != 0) {
                if (n9 == 34) {
                    return this.g3(this.V0, n8, n12, 4);
                }
                return this.i3(this.V0, n8, n12, n9, 4);
            }
            int[] nArray2 = this.V0;
            if (n8 >= nArray2.length) {
                this.V0 = b.P1(nArray2, n8);
            }
            this.V0[n8] = n12;
            ++n8;
        }
        return this.i3(this.V0, n8, 0, n9, 0);
    }

    protected String k2(int n8) throws IOException {
        Object object;
        if (n8 == 39 && (this.q & i1) != 0) {
            return this.w2();
        }
        if ((this.q & j1) == 0) {
            this.Z0((char)this.a2(n8), "was expecting double-quote to start field name");
        }
        if ((object = ax.W4.c.k())[n8] != 0) {
            this.Z0(n8, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        Object object2 = this.V0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        while (true) {
            int n12;
            Object[] objectArray;
            if (n9 < 4) {
                n8 |= n11 << 8;
                n11 = ++n9;
            } else {
                objectArray = object2;
                if (n10 >= ((int[])object2).length) {
                    this.V0 = objectArray = b.P1(object2, ((int[])object2).length);
                }
                objectArray[n10] = n11;
                ++n10;
                n11 = 1;
                object2 = objectArray;
            }
            if (this.r0 >= this.s0 && !this.m2()) {
                this.M0(" in field name", m.p0);
            }
            if (object[n12 = (objectArray = (Object[])this.c1)[n9 = this.r0] & 0xFF] != 0) {
                objectArray = object2;
                n9 = n10;
                if (n11 > 0) {
                    objectArray = object2;
                    if (n10 >= ((int[])object2).length) {
                        this.V0 = objectArray = b.P1(object2, ((int[])object2).length);
                    }
                    objectArray[n10] = n8;
                    n9 = n10 + 1;
                }
                object = this.U0.z((int[])objectArray, n9);
                object2 = object;
                if (object == null) {
                    object2 = this.c3((int[])objectArray, n9, n11);
                }
                return object2;
            }
            this.r0 = n9 + 1;
            n9 = n11;
            n11 = n8;
            n8 = n12;
        }
    }

    protected final String k3(int n8) throws IOException {
        int n9;
        byte[] byArray = this.c1;
        int[] nArray = n1;
        int n10 = this.r0;
        this.r0 = n9 = n10 + 1;
        int n11 = byArray[n10] & 0xFF;
        if (nArray[n11] != 0) {
            if (n11 == 34) {
                return this.e3(this.X0, n8, 1);
            }
            return this.n3(this.X0, n8, n11, 1);
        }
        n11 = n8 << 8 | n11;
        this.r0 = n8 = n10 + 2;
        if (nArray[n9 = byArray[n9] & 0xFF] != 0) {
            if (n9 == 34) {
                return this.e3(this.X0, n11, 2);
            }
            return this.n3(this.X0, n11, n9, 2);
        }
        n11 = n11 << 8 | n9;
        this.r0 = n9 = n10 + 3;
        if (nArray[n8 = byArray[n8] & 0xFF] != 0) {
            if (n8 == 34) {
                return this.e3(this.X0, n11, 3);
            }
            return this.n3(this.X0, n11, n8, 3);
        }
        n8 = n11 << 8 | n8;
        this.r0 = n10 + 4;
        n10 = byArray[n9] & 0xFF;
        if (nArray[n10] != 0) {
            if (n10 == 34) {
                return this.e3(this.X0, n8, 4);
            }
            return this.n3(this.X0, n8, n10, 4);
        }
        return this.l3(n10, n8);
    }

    @Override
    protected void l1() throws IOException {
        if (this.b1 != null) {
            if (this.o0.l() || this.A(j.a.d0)) {
                this.b1.close();
            }
            this.b1 = null;
        }
    }

    protected m l2(int n8) throws IOException {
        StringBuilder stringBuilder;
        block15: {
            block8: {
                block9: {
                    block10: {
                        block12: {
                            block14: {
                                block11: {
                                    block13: {
                                        if (n8 == 39) break block8;
                                        if (n8 == 73) break block9;
                                        if (n8 == 78) break block10;
                                        if (n8 == 93) break block11;
                                        if (n8 == 125) break block12;
                                        if (n8 == 43) break block13;
                                        if (n8 == 44) break block14;
                                        break block15;
                                    }
                                    if (this.r0 >= this.s0 && !this.m2()) {
                                        this.T0(m.s0);
                                    }
                                    byte[] byArray = this.c1;
                                    n8 = this.r0;
                                    this.r0 = n8 + 1;
                                    return this.j2(byArray[n8] & 0xFF, false, true);
                                }
                                if (!this.z0.e()) break block15;
                            }
                            if (!this.z0.g() && (this.q & h1) != 0) {
                                --this.r0;
                                return m.w0;
                            }
                        }
                        this.Z0(n8, "expected a value");
                        break block8;
                    }
                    this.q2("NaN", 1);
                    if ((this.q & g1) != 0) {
                        return this.S1("NaN", Double.NaN);
                    }
                    this.C0("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                    break block15;
                }
                this.q2("Infinity", 1);
                if ((this.q & g1) != 0) {
                    return this.S1("Infinity", Double.POSITIVE_INFINITY);
                }
                this.C0("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                break block15;
            }
            if ((this.q & i1) != 0) {
                return this.i2();
            }
        }
        if (Character.isJavaIdentifierStart(n8)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append((char)n8);
            this.I2(stringBuilder.toString(), this.G1());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("expected a valid value ");
        stringBuilder.append(this.H1());
        this.Z0(n8, stringBuilder.toString());
        return null;
    }

    protected final String l3(int n8, int n9) throws IOException {
        int n10;
        byte[] byArray = this.c1;
        int[] nArray = n1;
        int n11 = this.r0;
        this.r0 = n10 = n11 + 1;
        int n12 = byArray[n11] & 0xFF;
        if (nArray[n12] != 0) {
            if (n12 == 34) {
                return this.f3(this.X0, n9, n8, 1);
            }
            return this.o3(this.X0, n9, n8, n12, 1);
        }
        n12 = n8 << 8 | n12;
        this.r0 = n8 = n11 + 2;
        if (nArray[n10 = byArray[n10] & 0xFF] != 0) {
            if (n10 == 34) {
                return this.f3(this.X0, n9, n12, 2);
            }
            return this.o3(this.X0, n9, n12, n10, 2);
        }
        n12 = n12 << 8 | n10;
        this.r0 = n10 = n11 + 3;
        if (nArray[n8 = byArray[n8] & 0xFF] != 0) {
            if (n8 == 34) {
                return this.f3(this.X0, n9, n12, 3);
            }
            return this.o3(this.X0, n9, n12, n8, 3);
        }
        n8 = n12 << 8 | n8;
        this.r0 = n11 + 4;
        n11 = byArray[n10] & 0xFF;
        if (nArray[n11] != 0) {
            if (n11 == 34) {
                return this.f3(this.X0, n9, n8, 4);
            }
            return this.o3(this.X0, n9, n8, n11, 4);
        }
        return this.j3(n11, n9, n8);
    }

    protected final boolean m2() throws IOException {
        InputStream inputStream = this.b1;
        if (inputStream != null) {
            Object object = this.c1;
            int n8 = ((byte[])object).length;
            if (n8 == 0) {
                return false;
            }
            if ((n8 = inputStream.read((byte[])object, 0, n8)) > 0) {
                int n9 = this.s0;
                this.t0 += (long)n9;
                this.v0 -= n9;
                this.Y0 -= n9;
                this.r0 = 0;
                this.s0 = n8;
                return true;
            }
            this.l1();
            if (n8 == 0) {
                object = new StringBuilder();
                object.append("InputStream.read() returned 0 characters when trying to read ");
                object.append(this.c1.length);
                object.append(" bytes");
                throw new IOException(object.toString());
            }
        }
        return false;
    }

    protected void n2() throws IOException {
        if (!this.m2()) {
            this.L0();
        }
    }

    protected final void o2() throws IOException {
        byte[] byArray;
        int n8 = this.r0;
        if (n8 + 4 < this.s0 && (byArray = this.c1)[n8] == 97 && byArray[n8 + 1] == 108 && byArray[n8 + 2] == 115) {
            int n9 = n8 + 4;
            if (byArray[n8 + 3] == 101 && ((n8 = byArray[n9] & 0xFF) < 48 || n8 == 93 || n8 == 125)) {
                this.r0 = n9;
                return;
            }
        }
        this.r2("false", 1);
    }

    @Override
    protected char p1() throws IOException {
        if (this.r0 >= this.s0 && !this.m2()) {
            this.M0(" in character escape sequence", m.r0);
        }
        byte[] byArray = this.c1;
        int n8 = this.r0;
        this.r0 = n8 + 1;
        if ((n8 = byArray[n8]) != 34 && n8 != 47 && n8 != 92) {
            if (n8 != 98) {
                if (n8 != 102) {
                    if (n8 != 110) {
                        if (n8 != 114) {
                            if (n8 != 116) {
                                if (n8 != 117) {
                                    return this.x1((char)this.a2(n8));
                                }
                                int n9 = 0;
                                for (n8 = 0; n8 < 4; ++n8) {
                                    if (this.r0 >= this.s0 && !this.m2()) {
                                        this.M0(" in character escape sequence", m.r0);
                                    }
                                    byArray = this.c1;
                                    int n10 = this.r0;
                                    this.r0 = n10 + 1;
                                    int n11 = ax.W4.c.b(n10 = byArray[n10]);
                                    if (n11 < 0) {
                                        this.Z0(n10 & 0xFF, "expected a hex-digit for character escape sequence");
                                    }
                                    n9 = n9 << 4 | n11;
                                }
                                return (char)n9;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return (char)n8;
    }

    protected final void p2() throws IOException {
        byte[] byArray;
        int n8 = this.r0;
        if (n8 + 3 < this.s0 && (byArray = this.c1)[n8] == 117 && byArray[n8 + 1] == 108) {
            int n9 = n8 + 3;
            if (byArray[n8 + 2] == 108 && ((n8 = byArray[n9] & 0xFF) < 48 || n8 == 93 || n8 == 125)) {
                this.r0 = n9;
                return;
            }
        }
        this.r2("null", 1);
    }

    protected String p3() throws IOException {
        if (this.r0 >= this.s0 && !this.m2()) {
            this.M0(": was expecting closing '\"' for name", m.p0);
        }
        byte[] byArray = this.c1;
        int n8 = this.r0;
        this.r0 = n8 + 1;
        if ((n8 = byArray[n8] & 0xFF) == 34) {
            return "";
        }
        return this.i3(this.V0, 0, 0, n8, 0);
    }

    protected final void q2(String string, int n8) throws IOException {
        int n9;
        int n10 = string.length();
        int n11 = n8;
        if (this.r0 + n10 >= this.s0) {
            this.r2(string, n8);
            return;
        }
        do {
            if (this.c1[this.r0] != string.charAt(n11)) {
                this.H2(string.substring(0, n11));
            }
            this.r0 = n9 = this.r0 + 1;
            n11 = n8 = n11 + 1;
        } while (n8 < n10);
        n11 = this.c1[n9] & 0xFF;
        if (n11 >= 48 && n11 != 93 && n11 != 125) {
            this.V1(string, n8, n11);
        }
    }

    protected final void s2() throws IOException {
        byte[] byArray;
        int n8 = this.r0;
        if (n8 + 3 < this.s0 && (byArray = this.c1)[n8] == 114 && byArray[n8 + 1] == 117) {
            int n9 = n8 + 3;
            if (byArray[n8 + 2] == 101 && ((n8 = byArray[n9] & 0xFF) < 48 || n8 == 93 || n8 == 125)) {
                this.r0 = n9;
                return;
            }
        }
        this.r2("true", 1);
    }

    @Override
    public String u() throws IOException {
        m m8 = this.d0;
        if (m8 == m.r0) {
            if (this.W0) {
                this.W0 = false;
                return this.f2();
            }
            return this.B0.h();
        }
        return this.h2(m8);
    }

    @Override
    public h v() {
        if (this.d0 == m.p0) {
            long l8 = this.t0;
            long l9 = this.Y0 - 1;
            return new h(this.m1(), l8 + l9, -1L, this.Z0, this.a1);
        }
        return new h(this.m1(), this.w0 - 1L, -1L, this.x0, this.y0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    protected String w2() throws IOException {
        if (this.r0 >= this.s0 && !this.m2()) {
            this.M0(": was expecting closing ''' for field name", m.p0);
        }
        byte[] byArray = this.c1;
        int n8 = this.r0;
        this.r0 = n8 + 1;
        int n9 = byArray[n8] & 0xFF;
        if (n9 == 39) {
            return "";
        }
        int[] nArray = this.V0;
        int[] nArray2 = n1;
        int n10 = 0;
        n8 = 0;
        int n11 = 0;
        while (true) {
            Object var10_45;
            int n12;
            Object var9_3;
            if (n9 == 39) {
                Object var9_6;
                Object var10_35;
                String string;
                void var10_31 = var9_3;
                n12 = n8;
                if (n10 > 0) {
                    void var10_32 = var9_3;
                    if (n8 >= ((void)var9_3).length) {
                        int[] nArray3 = b.P1((int[])var9_3, ((void)var9_3).length);
                        this.V0 = nArray3;
                    }
                    var10_34[n8] = i.v2(n11, n10);
                    n12 = n8 + 1;
                }
                String string2 = string = this.U0.z((int[])var10_35, n12);
                if (string == null) {
                    String string3 = this.c3((int[])var10_35, n12, n10);
                }
                return var9_6;
            }
            n12 = n9;
            void var10_36 = var9_3;
            int n13 = n10;
            int n14 = n8;
            int n15 = n11;
            if (nArray2[n9] != 0) {
                n12 = n9;
                void var10_37 = var9_3;
                n13 = n10;
                n14 = n8;
                n15 = n11;
                if (n9 != 34) {
                    if (n9 != 92) {
                        this.F1(n9, "name");
                    } else {
                        n9 = this.p1();
                    }
                    n12 = n9;
                    void var10_38 = var9_3;
                    n13 = n10;
                    n14 = n8;
                    n15 = n11;
                    if (n9 > 127) {
                        Object var9_13;
                        Object var10_43;
                        void var10_39 = var9_3;
                        n15 = n10;
                        n12 = n8;
                        n14 = n11;
                        if (n10 >= 4) {
                            void var10_40 = var9_3;
                            if (n8 >= ((void)var9_3).length) {
                                int[] nArray4 = b.P1((int[])var9_3, ((void)var9_3).length);
                                this.V0 = nArray4;
                            }
                            var10_42[n8] = n11;
                            n12 = n8 + 1;
                            n15 = 0;
                            n14 = 0;
                        }
                        if (n9 < 2048) {
                            n10 = n14 << 8 | (n9 >> 6 | 0xC0);
                            n8 = n15 + 1;
                            void var9_7 = var10_43;
                        } else {
                            n14 = n14 << 8 | (n9 >> 12 | 0xE0);
                            void var9_8 = var10_43;
                            n11 = ++n15;
                            n8 = n12;
                            n10 = n14;
                            if (n15 >= 4) {
                                void var9_9 = var10_43;
                                if (n12 >= ((void)var10_43).length) {
                                    int[] nArray5 = b.P1((int[])var10_43, ((void)var10_43).length);
                                    this.V0 = nArray5;
                                }
                                var9_11[n12] = n14;
                                n8 = n12 + 1;
                                n11 = 0;
                                n10 = 0;
                            }
                            n10 = n10 << 8 | (n9 >> 6 & 0x3F | 0x80);
                            n12 = n8;
                            n8 = ++n11;
                        }
                        n11 = n9 & 0x3F | 0x80;
                        n15 = n10;
                        n14 = n12;
                        n13 = n8;
                        void var10_44 = var9_13;
                        n12 = n11;
                    }
                }
            }
            if (n13 < 4) {
                n10 = n13 + 1;
                n12 |= n15 << 8;
                n8 = n14;
                void var9_15 = var10_45;
            } else {
                void var9_17 = var10_45;
                if (n14 >= ((void)var10_45).length) {
                    int[] nArray6 = b.P1((int[])var10_45, ((void)var10_45).length);
                    this.V0 = nArray6;
                }
                var9_19[n14] = n15;
                n8 = n14 + 1;
                n10 = 1;
            }
            n11 = n12;
            if (this.r0 >= this.s0 && !this.m2()) {
                this.M0(" in field name", m.p0);
            }
            byte[] byArray2 = this.c1;
            n12 = this.r0;
            this.r0 = n12 + 1;
            n9 = byArray2[n12] & 0xFF;
        }
    }

    protected final m y2(boolean bl, boolean bl2) throws IOException {
        int n8;
        if (!this.A(e.m0.j())) {
            return this.l2(46);
        }
        char[] cArray = this.B0.i();
        if (bl) {
            cArray[0] = 45;
            n8 = 1;
        } else {
            n8 = 0;
        }
        return this.x2(cArray, n8, 46, bl, 0);
    }

    protected final String z2(int n8) throws IOException {
        int n9;
        if (n8 != 34) {
            return this.k2(n8);
        }
        n8 = this.r0;
        if (n8 + 13 > this.s0) {
            return this.p3();
        }
        byte[] byArray = this.c1;
        int[] nArray = n1;
        this.r0 = n9 = n8 + 1;
        int n10 = byArray[n8] & 0xFF;
        if (nArray[n10] == 0) {
            int n11;
            this.r0 = n11 = n8 + 2;
            if (nArray[n9 = byArray[n9] & 0xFF] == 0) {
                n9 |= n10 << 8;
                this.r0 = n10 = n8 + 3;
                if (nArray[n11 = byArray[n11] & 0xFF] == 0) {
                    n9 = n9 << 8 | n11;
                    this.r0 = n11 = n8 + 4;
                    if (nArray[n10 = byArray[n10] & 0xFF] == 0) {
                        n10 = n9 << 8 | n10;
                        this.r0 = n8 + 5;
                        n8 = byArray[n11] & 0xFF;
                        if (nArray[n8] == 0) {
                            this.X0 = n10;
                            return this.k3(n8);
                        }
                        if (n8 == 34) {
                            return this.d3(n10, 4);
                        }
                        return this.m3(n10, n8, 4);
                    }
                    if (n10 == 34) {
                        return this.d3(n9, 3);
                    }
                    return this.m3(n9, n10, 3);
                }
                if (n11 == 34) {
                    return this.d3(n9, 2);
                }
                return this.m3(n9, n11, 2);
            }
            if (n9 == 34) {
                return this.d3(n10, 1);
            }
            return this.m3(n10, n9, 1);
        }
        if (n10 == 34) {
            return "";
        }
        return this.m3(0, n10, 0);
    }
}

