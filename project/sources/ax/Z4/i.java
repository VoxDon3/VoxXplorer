package ax.Z4;

import ax.T4.j;
import ax.T4.m;
import ax.T4.n;
import ax.a5.C1370a;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class i extends ax.U4.b {
    private static final int e1 = j.a.ALLOW_TRAILING_COMMA.l();
    private static final int f1 = j.a.ALLOW_NUMERIC_LEADING_ZEROS.l();
    private static final int g1 = j.a.ALLOW_NON_NUMERIC_NUMBERS.l();
    private static final int h1 = j.a.ALLOW_MISSING_VALUES.l();
    private static final int i1 = j.a.ALLOW_SINGLE_QUOTES.l();
    private static final int j1 = j.a.ALLOW_UNQUOTED_FIELD_NAMES.l();
    private static final int k1 = j.a.ALLOW_COMMENTS.l();
    private static final int l1 = j.a.ALLOW_YAML_COMMENTS.l();
    private static final int[] m1 = ax.W4.c.j();
    protected static final int[] n1 = ax.W4.c.h();
    protected n T0;
    protected final C1370a U0;
    protected int[] V0;
    protected boolean W0;
    private int X0;
    protected int Y0;
    protected int Z0;
    protected int a1;
    protected InputStream b1;
    protected byte[] c1;
    protected boolean d1;

    public i(ax.W4.e eVar, int i, InputStream inputStream, n nVar, C1370a c1370a, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(eVar, i);
        this.V0 = new int[16];
        this.b1 = inputStream;
        this.T0 = nVar;
        this.U0 = c1370a;
        this.c1 = bArr;
        this.r0 = i2;
        this.s0 = i3;
        this.v0 = i2 - i4;
        this.t0 = (-i2) + i4;
        this.d1 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r3 == 46) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3 == 101) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r3 != 69) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r6.r0 = r8;
        r6.B0.w(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r6.z0.g() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        b3(r6.c1[r6.r0] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        return U1(r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        return x2(r1, r2, r3, r9, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ax.T4.m A2(char[] r7, int r8, boolean r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            r1 = r7
            r2 = r8
            r5 = r10
        L3:
            int r7 = r6.r0
            int r8 = r6.s0
            if (r7 < r8) goto L19
            boolean r7 = r6.m2()
            if (r7 != 0) goto L19
            ax.b5.l r7 = r6.B0
            r7.w(r2)
            ax.T4.m r7 = r6.U1(r9, r5)
            return r7
        L19:
            byte[] r7 = r6.c1
            int r8 = r6.r0
            int r10 = r8 + 1
            r6.r0 = r10
            r7 = r7[r8]
            r3 = r7 & 255(0xff, float:3.57E-43)
            r7 = 57
            if (r3 > r7) goto L42
            r7 = 48
            if (r3 >= r7) goto L2e
            goto L42
        L2e:
            int r7 = r1.length
            if (r2 < r7) goto L39
            ax.b5.l r7 = r6.B0
            char[] r7 = r7.l()
            r2 = 0
            r1 = r7
        L39:
            int r7 = r2 + 1
            char r8 = (char) r3
            r1[r2] = r8
            int r5 = r5 + 1
            r2 = r7
            goto L3
        L42:
            r7 = 46
            if (r3 == r7) goto L4e
            r7 = 101(0x65, float:1.42E-43)
            if (r3 == r7) goto L4e
            r7 = 69
            if (r3 != r7) goto L51
        L4e:
            r0 = r6
            r4 = r9
            goto L70
        L51:
            r6.r0 = r8
            ax.b5.l r7 = r6.B0
            r7.w(r2)
            ax.Z4.d r7 = r6.z0
            boolean r7 = r7.g()
            if (r7 == 0) goto L6b
            byte[] r7 = r6.c1
            int r8 = r6.r0
            r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6.b3(r7)
        L6b:
            ax.T4.m r7 = r6.U1(r9, r5)
            return r7
        L70:
            ax.T4.m r7 = r0.x2(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.i.A2(char[], int, boolean, int):ax.T4.m");
    }

    private final m B2(boolean z) throws IOException {
        int i;
        int i2;
        int i3;
        char[] i4 = this.B0.i();
        int i5 = 1;
        int i6 = 0;
        if (z) {
            i4[0] = '-';
            i6 = 1;
        }
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr = this.c1;
        int i7 = this.r0;
        this.r0 = i7 + 1;
        int i8 = bArr[i7] & 255;
        if (i8 <= 48) {
            if (i8 != 48) {
                return i8 == 46 ? y2(z, true) : j2(i8, z, true);
            }
            i8 = a3();
        } else if (i8 > 57) {
            return j2(i8, z, true);
        }
        int i9 = i6 + 1;
        i4[i6] = (char) i8;
        int min = Math.min(this.s0, (this.r0 + i4.length) - i9);
        while (true) {
            i = i9;
            i2 = this.r0;
            if (i2 >= min) {
                return A2(i4, i, z, i5);
            }
            byte[] bArr2 = this.c1;
            this.r0 = i2 + 1;
            i3 = bArr2[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            i9 = i + 1;
            i4[i] = (char) i3;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return x2(i4, i, i3, z, i5);
        }
        this.r0 = i2;
        this.B0.w(i);
        if (this.z0.g()) {
            b3(i3);
        }
        return U1(z, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        M0(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J2() throws java.io.IOException {
        /*
            r5 = this;
            int[] r0 = ax.W4.c.g()
        L4:
            int r1 = r5.r0
            int r2 = r5.s0
            if (r1 < r2) goto L10
            boolean r1 = r5.m2()
            if (r1 == 0) goto L43
        L10:
            byte[] r1 = r5.c1
            int r2 = r5.r0
            int r3 = r2 + 1
            r5.r0 = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0[r1]
            if (r2 == 0) goto L4
            r4 = 2
            if (r2 == r4) goto L6e
            r4 = 3
            if (r2 == r4) goto L6a
            r4 = 4
            if (r2 == r4) goto L66
            r4 = 10
            if (r2 == r4) goto L5d
            r4 = 13
            if (r2 == r4) goto L59
            r4 = 42
            if (r2 == r4) goto L39
            r5.D2(r1)
            goto L4
        L39:
            int r1 = r5.s0
            if (r3 < r1) goto L4a
            boolean r1 = r5.m2()
            if (r1 != 0) goto L4a
        L43:
            java.lang.String r0 = " in a comment"
            r1 = 0
            r5.M0(r0, r1)
            return
        L4a:
            byte[] r1 = r5.c1
            int r2 = r5.r0
            r1 = r1[r2]
            r3 = 47
            if (r1 != r3) goto L4
            int r2 = r2 + 1
            r5.r0 = r2
            return
        L59:
            r5.K2()
            goto L4
        L5d:
            int r1 = r5.u0
            int r1 = r1 + 1
            r5.u0 = r1
            r5.v0 = r3
            goto L4
        L66:
            r5.S2(r1)
            goto L4
        L6a:
            r5.R2()
            goto L4
        L6e:
            r5.Q2()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.i.J2():void");
    }

    private final int L2() throws IOException {
        int i = this.r0;
        if (i + 4 >= this.s0) {
            return M2(false);
        }
        byte[] bArr = this.c1;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this.r0 = i2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return M2(true);
                }
                this.r0 = i + 2;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                int i3 = i + 2;
                this.r0 = i3;
                byte b3 = bArr[i3];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return M2(true);
                    }
                    this.r0 = i + 3;
                    return b3;
                }
            }
            return M2(true);
        }
        if (b == 32 || b == 9) {
            int i4 = i + 1;
            this.r0 = i4;
            b = bArr[i4];
        }
        if (b != 58) {
            return M2(false);
        }
        int i5 = this.r0;
        int i6 = i5 + 1;
        this.r0 = i6;
        byte b4 = bArr[i6];
        if (b4 > 32) {
            if (b4 == 47 || b4 == 35) {
                return M2(true);
            }
            this.r0 = i5 + 2;
            return b4;
        }
        if (b4 == 32 || b4 == 9) {
            int i7 = i5 + 2;
            this.r0 = i7;
            byte b5 = bArr[i7];
            if (b5 > 32) {
                if (b5 == 47 || b5 == 35) {
                    return M2(true);
                }
                this.r0 = i5 + 3;
                return b5;
            }
        }
        return M2(true);
    }

    private final int M2(boolean z) throws IOException {
        while (true) {
            if (this.r0 >= this.s0 && !m2()) {
                M0(" within/between " + this.z0.h() + " entries", null);
                return -1;
            }
            byte[] bArr = this.c1;
            int i = this.r0;
            int i2 = i + 1;
            this.r0 = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    N2();
                } else if (i3 != 35 || !X2()) {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        Z0(i3, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this.u0++;
                    this.v0 = i2;
                } else if (i3 == 13) {
                    K2();
                } else if (i3 != 9) {
                    c1(i3);
                }
            }
        }
    }

    private final void N2() throws IOException {
        if ((this.q & k1) == 0) {
            Z0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.r0 >= this.s0 && !m2()) {
            M0(" in a comment", null);
        }
        byte[] bArr = this.c1;
        int i = this.r0;
        this.r0 = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            O2();
        } else if (i2 == 42) {
            J2();
        } else {
            Z0(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void O2() throws IOException {
        int[] g = ax.W4.c.g();
        while (true) {
            if (this.r0 >= this.s0 && !m2()) {
                return;
            }
            byte[] bArr = this.c1;
            int i = this.r0;
            int i2 = i + 1;
            this.r0 = i2;
            int i3 = bArr[i] & 255;
            int i4 = g[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    Q2();
                } else if (i4 == 3) {
                    R2();
                } else if (i4 == 4) {
                    S2(i3);
                } else if (i4 == 10) {
                    this.u0++;
                    this.v0 = i2;
                    return;
                } else if (i4 == 13) {
                    K2();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    D2(i3);
                }
            }
        }
    }

    private final void Q2() throws IOException {
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr = this.c1;
        int i = this.r0;
        int i2 = i + 1;
        this.r0 = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            G2(b & 255, i2);
        }
    }

    private final void R2() throws IOException {
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr = this.c1;
        int i = this.r0;
        int i2 = i + 1;
        this.r0 = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            G2(b & 255, i2);
        }
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr2 = this.c1;
        int i3 = this.r0;
        int i4 = i3 + 1;
        this.r0 = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            G2(b2 & 255, i4);
        }
    }

    private final void S2(int i) throws IOException {
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr = this.c1;
        int i2 = this.r0;
        int i3 = i2 + 1;
        this.r0 = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            G2(b & 255, i3);
        }
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr2 = this.c1;
        int i4 = this.r0;
        int i5 = i4 + 1;
        this.r0 = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            G2(b2 & 255, i5);
        }
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr3 = this.c1;
        int i6 = this.r0;
        int i7 = i6 + 1;
        this.r0 = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            G2(b3 & 255, i7);
        }
    }

    private final int T2() throws IOException {
        while (true) {
            int i = this.r0;
            if (i >= this.s0) {
                return U2();
            }
            byte[] bArr = this.c1;
            int i2 = i + 1;
            this.r0 = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 != 47 && i3 != 35) {
                    return i3;
                }
                this.r0 = i;
                return U2();
            }
            if (i3 != 32) {
                if (i3 == 10) {
                    this.u0++;
                    this.v0 = i2;
                } else if (i3 == 13) {
                    K2();
                } else if (i3 != 9) {
                    c1(i3);
                }
            }
        }
    }

    private final int U2() throws IOException {
        int i;
        while (true) {
            if (this.r0 >= this.s0 && !m2()) {
                throw a("Unexpected end-of-input within/between " + this.z0.h() + " entries");
            }
            byte[] bArr = this.c1;
            int i2 = this.r0;
            int i3 = i2 + 1;
            this.r0 = i3;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    N2();
                } else if (i != 35 || !X2()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this.u0++;
                    this.v0 = i3;
                } else if (i == 13) {
                    K2();
                } else if (i != 9) {
                    c1(i);
                }
            }
        }
        return i;
    }

    private final void V1(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) a2(i2))) {
            H2(str.substring(0, i));
        }
    }

    private final int V2() throws IOException {
        if (this.r0 >= this.s0 && !m2()) {
            return q1();
        }
        byte[] bArr = this.c1;
        int i = this.r0;
        int i2 = i + 1;
        this.r0 = i2;
        int i3 = bArr[i] & 255;
        if (i3 > 32) {
            if (i3 != 47 && i3 != 35) {
                return i3;
            }
            this.r0 = i;
            return W2();
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this.u0++;
                this.v0 = i2;
            } else if (i3 == 13) {
                K2();
            } else if (i3 != 9) {
                c1(i3);
            }
        }
        while (true) {
            int i4 = this.r0;
            if (i4 >= this.s0) {
                return W2();
            }
            byte[] bArr2 = this.c1;
            int i5 = i4 + 1;
            this.r0 = i5;
            int i6 = bArr2[i4] & 255;
            if (i6 > 32) {
                if (i6 != 47 && i6 != 35) {
                    return i6;
                }
                this.r0 = i4;
                return W2();
            }
            if (i6 != 32) {
                if (i6 == 10) {
                    this.u0++;
                    this.v0 = i5;
                } else if (i6 == 13) {
                    K2();
                } else if (i6 != 9) {
                    c1(i6);
                }
            }
        }
    }

    private final void W1() throws ax.T4.i {
        Y2();
        if (!this.z0.e()) {
            D1(93, '}');
        }
        this.z0 = this.z0.j();
    }

    private final int W2() throws IOException {
        int i;
        while (true) {
            if (this.r0 >= this.s0 && !m2()) {
                return q1();
            }
            byte[] bArr = this.c1;
            int i2 = this.r0;
            int i3 = i2 + 1;
            this.r0 = i3;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    N2();
                } else if (i != 35 || !X2()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this.u0++;
                    this.v0 = i3;
                } else if (i == 13) {
                    K2();
                } else if (i != 9) {
                    c1(i);
                }
            }
        }
        return i;
    }

    private final void X1() throws ax.T4.i {
        Y2();
        if (!this.z0.f()) {
            D1(ax.m.j.L0, ']');
        }
        this.z0 = this.z0.j();
    }

    private final boolean X2() throws IOException {
        if ((this.q & l1) == 0) {
            return false;
        }
        O2();
        return true;
    }

    private final m Y1(int i) throws ax.T4.i {
        if (i == 125) {
            X1();
            m mVar = m.END_OBJECT;
            this.d0 = mVar;
            return mVar;
        }
        W1();
        m mVar2 = m.END_ARRAY;
        this.d0 = mVar2;
        return mVar2;
    }

    private final void Y2() {
        this.x0 = this.u0;
        int i = this.r0;
        this.w0 = this.t0 + i;
        this.y0 = i - this.v0;
    }

    private final void Z2() {
        this.Z0 = this.u0;
        int i = this.r0;
        this.Y0 = i;
        this.a1 = i - this.v0;
    }

    private final int a3() throws IOException {
        int i;
        if ((this.r0 >= this.s0 && !m2()) || (i = this.c1[this.r0] & 255) < 48 || i > 57) {
            return 48;
        }
        if ((this.q & f1) == 0) {
            e1("Leading zeroes not allowed");
        }
        this.r0++;
        if (i != 48) {
            return i;
        }
        do {
            if (this.r0 >= this.s0 && !m2()) {
                return i;
            }
            byte[] bArr = this.c1;
            int i2 = this.r0;
            i = bArr[i2] & 255;
            if (i < 48 || i > 57) {
                return 48;
            }
            this.r0 = i2 + 1;
        } while (i == 48);
        return i;
    }

    private final int b2(int i) throws IOException {
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr = this.c1;
        int i2 = this.r0;
        int i3 = i2 + 1;
        this.r0 = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            G2(b & 255, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final void b3(int i) throws IOException {
        int i2 = this.r0;
        int i3 = i2 + 1;
        this.r0 = i3;
        if (i != 9) {
            if (i == 10) {
                this.u0++;
                this.v0 = i3;
            } else if (i == 13) {
                this.r0 = i2;
            } else if (i != 32) {
                Y0(i);
            }
        }
    }

    private final int c2(int i) throws IOException {
        if (this.r0 >= this.s0) {
            n2();
        }
        int i2 = i & 15;
        byte[] bArr = this.c1;
        int i3 = this.r0;
        int i4 = i3 + 1;
        this.r0 = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            G2(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr2 = this.c1;
        int i6 = this.r0;
        int i7 = i6 + 1;
        this.r0 = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            G2(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String c3(int[] r18, int r19, int r20) throws ax.T4.i, ax.V4.b {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.i.c3(int[], int, int):java.lang.String");
    }

    private final int d2(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this.c1;
        int i3 = this.r0;
        int i4 = i3 + 1;
        this.r0 = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            G2(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this.c1;
        int i6 = this.r0;
        int i7 = i6 + 1;
        this.r0 = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            G2(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    private final String d3(int i, int i2) throws ax.T4.i, ax.V4.b {
        int v2 = v2(i, i2);
        String w = this.U0.w(v2);
        if (w != null) {
            return w;
        }
        int[] iArr = this.V0;
        iArr[0] = v2;
        return c3(iArr, 1, i2);
    }

    private final int e2(int i) throws IOException {
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr = this.c1;
        int i2 = this.r0;
        int i3 = i2 + 1;
        this.r0 = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            G2(b & 255, i3);
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr2 = this.c1;
        int i5 = this.r0;
        int i6 = i5 + 1;
        this.r0 = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            G2(b2 & 255, i6);
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr3 = this.c1;
        int i8 = this.r0;
        int i9 = i8 + 1;
        this.r0 = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) != 128) {
            G2(b3 & 255, i9);
        }
        return ((i7 << 6) | (b3 & 63)) - 65536;
    }

    private final String e3(int i, int i2, int i3) throws ax.T4.i, ax.V4.b {
        int v2 = v2(i2, i3);
        String x = this.U0.x(i, v2);
        if (x != null) {
            return x;
        }
        int[] iArr = this.V0;
        iArr[0] = i;
        iArr[1] = v2;
        return c3(iArr, 2, i3);
    }

    private final String f3(int i, int i2, int i3, int i4) throws ax.T4.i, ax.V4.b {
        int v2 = v2(i3, i4);
        String y = this.U0.y(i, i2, v2);
        if (y != null) {
            return y;
        }
        int[] iArr = this.V0;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = v2(v2, i4);
        return c3(iArr, 3, i4);
    }

    private final void g2(char[] cArr, int i) throws IOException {
        int[] iArr = m1;
        byte[] bArr = this.c1;
        while (true) {
            int i2 = this.r0;
            if (i2 >= this.s0) {
                n2();
                i2 = this.r0;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.B0.l();
                i = 0;
            }
            int min = Math.min(this.s0, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.r0 = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = iArr[i5];
                if (i6 != 0) {
                    this.r0 = i4;
                    if (i5 == 34) {
                        this.B0.w(i);
                        return;
                    }
                    if (i6 == 1) {
                        i5 = p1();
                    } else if (i6 == 2) {
                        i5 = b2(i5);
                    } else if (i6 == 3) {
                        i5 = this.s0 - i4 >= 2 ? d2(i5) : c2(i5);
                    } else if (i6 == 4) {
                        int e2 = e2(i5);
                        int i7 = i + 1;
                        cArr[i] = (char) ((e2 >> 10) | 55296);
                        if (i7 >= cArr.length) {
                            cArr = this.B0.l();
                            i = 0;
                        } else {
                            i = i7;
                        }
                        i5 = (e2 & 1023) | 56320;
                    } else if (i5 < 32) {
                        F1(i5, "string value");
                    } else {
                        D2(i5);
                    }
                    if (i >= cArr.length) {
                        cArr = this.B0.l();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i5;
                } else {
                    cArr[i] = (char) i5;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    private final String g3(int[] iArr, int i, int i2, int i3) throws ax.T4.i, ax.V4.b {
        if (i >= iArr.length) {
            iArr = ax.U4.b.P1(iArr, iArr.length);
            this.V0 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = v2(i2, i3);
        String z = this.U0.z(iArr, i4);
        return z == null ? c3(iArr, i4, i3) : z;
    }

    private int h3() throws IOException {
        if (this.r0 >= this.s0) {
            n2();
        }
        byte[] bArr = this.c1;
        int i = this.r0;
        this.r0 = i + 1;
        return bArr[i] & 255;
    }

    private final String m3(int i, int i2, int i3) throws IOException {
        return i3(this.V0, 0, i, i2, i3);
    }

    private final String n3(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this.V0;
        iArr[0] = i;
        return i3(iArr, 1, i2, i3, i4);
    }

    private final String o3(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.V0;
        iArr[0] = i;
        iArr[1] = i2;
        return i3(iArr, 2, i3, i4, i5);
    }

    private final void r2(String str, int i) throws IOException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.r0 >= this.s0 && !m2()) || this.c1[this.r0] != str.charAt(i)) {
                H2(str.substring(0, i));
            }
            i2 = this.r0 + 1;
            this.r0 = i2;
            i++;
        } while (i < length);
        if ((i2 < this.s0 || m2()) && (i3 = this.c1[this.r0] & 255) >= 48 && i3 != 93 && i3 != 125) {
            V1(str, i, i3);
        }
    }

    private final m t2() throws IOException {
        this.D0 = false;
        m mVar = this.A0;
        this.A0 = null;
        if (mVar == m.START_ARRAY) {
            M1(this.x0, this.y0);
        } else if (mVar == m.START_OBJECT) {
            N1(this.x0, this.y0);
        }
        this.d0 = mVar;
        return mVar;
    }

    private final m u2(int i) throws IOException {
        if (i == 34) {
            this.W0 = true;
            m mVar = m.VALUE_STRING;
            this.d0 = mVar;
            return mVar;
        }
        if (i == 43) {
            if (A(e.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.j())) {
                m B2 = B2(false);
                this.d0 = B2;
                return B2;
            }
            m l2 = l2(i);
            this.d0 = l2;
            return l2;
        }
        if (i == 91) {
            M1(this.x0, this.y0);
            m mVar2 = m.START_ARRAY;
            this.d0 = mVar2;
            return mVar2;
        }
        if (i == 102) {
            o2();
            m mVar3 = m.VALUE_FALSE;
            this.d0 = mVar3;
            return mVar3;
        }
        if (i == 110) {
            p2();
            m mVar4 = m.VALUE_NULL;
            this.d0 = mVar4;
            return mVar4;
        }
        if (i == 116) {
            s2();
            m mVar5 = m.VALUE_TRUE;
            this.d0 = mVar5;
            return mVar5;
        }
        if (i == 123) {
            N1(this.x0, this.y0);
            m mVar6 = m.START_OBJECT;
            this.d0 = mVar6;
            return mVar6;
        }
        if (i == 45) {
            m B22 = B2(true);
            this.d0 = B22;
            return B22;
        }
        if (i == 46) {
            m y2 = y2(false, false);
            this.d0 = y2;
            return y2;
        }
        switch (i) {
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
                m C2 = C2(i);
                this.d0 = C2;
                return C2;
            default:
                m l22 = l2(i);
                this.d0 = l22;
                return l22;
        }
    }

    private static final int v2(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    private final m x2(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.B0.l();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this.r0 >= this.s0 && !m2()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.c1;
                int i6 = this.r0;
                this.r0 = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this.B0.l();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0 && !A(e.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.j())) {
                a1(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.B0.l();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this.r0 >= this.s0) {
                n2();
            }
            byte[] bArr2 = this.c1;
            int i8 = this.r0;
            this.r0 = i8 + 1;
            int i9 = bArr2[i8] & 255;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.B0.l();
                    i7 = 0;
                }
                int i10 = i7 + 1;
                cArr[i7] = (char) i9;
                if (this.r0 >= this.s0) {
                    n2();
                }
                byte[] bArr3 = this.c1;
                int i11 = this.r0;
                this.r0 = i11 + 1;
                i9 = bArr3[i11] & 255;
                i7 = i10;
            }
            i2 = i9;
            int i12 = 0;
            while (i2 >= 48 && i2 <= 57) {
                i12++;
                if (i7 >= cArr.length) {
                    cArr = this.B0.l();
                    i7 = 0;
                }
                int i13 = i7 + 1;
                cArr[i7] = (char) i2;
                if (this.r0 >= this.s0 && !m2()) {
                    i5 = i12;
                    i = i13;
                    z2 = true;
                    break;
                }
                byte[] bArr4 = this.c1;
                int i14 = this.r0;
                this.r0 = i14 + 1;
                i2 = bArr4[i14] & 255;
                i7 = i13;
            }
            i5 = i12;
            i = i7;
            if (i5 == 0) {
                a1(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.r0--;
            if (this.z0.g()) {
                b3(i2);
            }
        }
        this.B0.w(i);
        return T1(z, i3, i4, i5);
    }

    @Override // ax.U4.b
    protected void C1() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        super.C1();
        this.U0.G();
        if (!this.d1 || (bArr = this.c1) == null || bArr == (bArr2 = ax.U4.c.e0)) {
            return;
        }
        this.c1 = bArr2;
        this.o0.o(bArr);
    }

    protected m C2(int i) throws IOException {
        int i2;
        int i3;
        char[] i4 = this.B0.i();
        if (i == 48) {
            i = a3();
        }
        i4[0] = (char) i;
        int min = Math.min(this.s0, (this.r0 + i4.length) - 1);
        int i5 = 1;
        int i6 = 1;
        while (true) {
            i2 = this.r0;
            if (i2 >= min) {
                return A2(i4, i5, false, i6);
            }
            byte[] bArr = this.c1;
            this.r0 = i2 + 1;
            i3 = bArr[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i6++;
            i4[i5] = (char) i3;
            i5++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return x2(i4, i5, i3, false, i6);
        }
        this.r0 = i2;
        this.B0.w(i5);
        if (this.z0.g()) {
            b3(i3);
        }
        return U1(false, i6);
    }

    protected void D2(int i) throws ax.T4.i {
        if (i < 32) {
            c1(i);
        }
        E2(i);
    }

    protected void E2(int i) throws ax.T4.i {
        C0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    protected void F2(int i) throws ax.T4.i {
        C0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    protected void G2(int i, int i2) throws ax.T4.i {
        this.r0 = i2;
        F2(i);
    }

    @Override // ax.U4.c, ax.T4.j
    public m H() throws IOException {
        m B2;
        m mVar = this.d0;
        m mVar2 = m.FIELD_NAME;
        if (mVar == mVar2) {
            return t2();
        }
        this.G0 = 0;
        if (this.W0) {
            P2();
        }
        int V2 = V2();
        if (V2 < 0) {
            close();
            this.d0 = null;
            return null;
        }
        this.F0 = null;
        if (V2 == 93) {
            W1();
            m mVar3 = m.END_ARRAY;
            this.d0 = mVar3;
            return mVar3;
        }
        if (V2 == 125) {
            X1();
            m mVar4 = m.END_OBJECT;
            this.d0 = mVar4;
            return mVar4;
        }
        if (this.z0.n()) {
            if (V2 != 44) {
                Z0(V2, "was expecting comma to separate " + this.z0.h() + " entries");
            }
            V2 = T2();
            if ((this.q & e1) != 0 && (V2 == 93 || V2 == 125)) {
                return Y1(V2);
            }
        }
        if (!this.z0.f()) {
            Y2();
            return u2(V2);
        }
        Z2();
        this.z0.q(z2(V2));
        this.d0 = mVar2;
        int L2 = L2();
        Y2();
        if (L2 == 34) {
            this.W0 = true;
            this.A0 = m.VALUE_STRING;
            return this.d0;
        }
        if (L2 == 43) {
            B2 = A(e.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.j()) ? B2(false) : l2(L2);
        } else if (L2 == 91) {
            B2 = m.START_ARRAY;
        } else if (L2 == 102) {
            o2();
            B2 = m.VALUE_FALSE;
        } else if (L2 == 110) {
            p2();
            B2 = m.VALUE_NULL;
        } else if (L2 == 116) {
            s2();
            B2 = m.VALUE_TRUE;
        } else if (L2 == 123) {
            B2 = m.START_OBJECT;
        } else if (L2 == 45) {
            B2 = B2(true);
        } else if (L2 != 46) {
            switch (L2) {
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
                    B2 = C2(L2);
                    break;
                default:
                    B2 = l2(L2);
                    break;
            }
        } else {
            B2 = y2(false, false);
        }
        this.A0 = B2;
        return this.d0;
    }

    protected void H2(String str) throws IOException {
        I2(str, G1());
    }

    protected void I2(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.r0 >= this.s0 && !m2()) {
                break;
            }
            byte[] bArr = this.c1;
            int i = this.r0;
            this.r0 = i + 1;
            char a2 = (char) a2(bArr[i]);
            if (!Character.isJavaIdentifierPart(a2)) {
                break;
            }
            sb.append(a2);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        F0("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    protected final void K2() throws IOException {
        if (this.r0 < this.s0 || m2()) {
            byte[] bArr = this.c1;
            int i = this.r0;
            if (bArr[i] == 10) {
                this.r0 = i + 1;
            }
        }
        this.u0++;
        this.v0 = this.r0;
    }

    protected void P2() throws IOException {
        this.W0 = false;
        int[] iArr = m1;
        byte[] bArr = this.c1;
        while (true) {
            int i = this.r0;
            int i2 = this.s0;
            if (i >= i2) {
                n2();
                i = this.r0;
                i2 = this.s0;
            }
            while (true) {
                if (i >= i2) {
                    this.r0 = i;
                    break;
                }
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int i5 = iArr[i4];
                if (i5 != 0) {
                    this.r0 = i3;
                    if (i4 == 34) {
                        return;
                    }
                    if (i5 == 1) {
                        p1();
                    } else if (i5 == 2) {
                        Q2();
                    } else if (i5 == 3) {
                        R2();
                    } else if (i5 == 4) {
                        S2(i4);
                    } else if (i4 < 32) {
                        F1(i4, "string value");
                    } else {
                        D2(i4);
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    protected final byte[] Z1(ax.T4.a aVar) throws IOException {
        ax.b5.c t1 = t1();
        while (true) {
            if (this.r0 >= this.s0) {
                n2();
            }
            byte[] bArr = this.c1;
            int i = this.r0;
            this.r0 = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int g = aVar.g(i2);
                if (g < 0) {
                    if (i2 == 34) {
                        return t1.m();
                    }
                    g = o1(aVar, i2, 0);
                    if (g < 0) {
                        continue;
                    }
                }
                if (this.r0 >= this.s0) {
                    n2();
                }
                byte[] bArr2 = this.c1;
                int i3 = this.r0;
                this.r0 = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int g2 = aVar.g(i4);
                if (g2 < 0) {
                    g2 = o1(aVar, i4, 1);
                }
                int i5 = (g << 6) | g2;
                if (this.r0 >= this.s0) {
                    n2();
                }
                byte[] bArr3 = this.c1;
                int i6 = this.r0;
                this.r0 = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int g3 = aVar.g(i7);
                if (g3 < 0) {
                    if (g3 != -2) {
                        if (i7 == 34) {
                            t1.b(i5 >> 4);
                            if (aVar.k()) {
                                this.r0--;
                                w1(aVar);
                            }
                            return t1.m();
                        }
                        g3 = o1(aVar, i7, 2);
                    }
                    if (g3 == -2) {
                        if (this.r0 >= this.s0) {
                            n2();
                        }
                        byte[] bArr4 = this.c1;
                        int i8 = this.r0;
                        this.r0 = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        if (!aVar.n(i9) && o1(aVar, i9, 3) != -2) {
                            throw R1(aVar, i9, 3, "expected padding character '" + aVar.i() + "'");
                        }
                        t1.b(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | g3;
                if (this.r0 >= this.s0) {
                    n2();
                }
                byte[] bArr5 = this.c1;
                int i11 = this.r0;
                this.r0 = i11 + 1;
                int i12 = bArr5[i11] & 255;
                int g4 = aVar.g(i12);
                if (g4 < 0) {
                    if (g4 != -2) {
                        if (i12 == 34) {
                            t1.d(i10 >> 2);
                            if (aVar.k()) {
                                this.r0--;
                                w1(aVar);
                            }
                            return t1.m();
                        }
                        g4 = o1(aVar, i12, 3);
                    }
                    if (g4 == -2) {
                        t1.d(i10 >> 2);
                    }
                }
                t1.c((i10 << 6) | g4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int a2(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L69
            r1 = r7 & 224(0xe0, float:3.14E-43)
            r2 = 2
            r3 = 1
            r4 = 192(0xc0, float:2.69E-43)
            if (r1 != r4) goto L12
            r0 = r7 & 31
        L10:
            r7 = 1
            goto L2c
        L12:
            r1 = r7 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r1 != r4) goto L1c
            r0 = r7 & 15
            r7 = 2
            goto L2c
        L1c:
            r1 = r7 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r1 != r4) goto L26
            r0 = r7 & 7
            r7 = 3
            goto L2c
        L26:
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6.E2(r7)
            goto L10
        L2c:
            int r1 = r6.h3()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L3b
            r4 = r1 & 255(0xff, float:3.57E-43)
            r6.F2(r4)
        L3b:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r3) goto L69
            int r1 = r6.h3()
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L4f
            r3 = r1 & 255(0xff, float:3.57E-43)
            r6.F2(r3)
        L4f:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r2) goto L69
            int r7 = r6.h3()
            r1 = r7 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L63
            r1 = r7 & 255(0xff, float:3.57E-43)
            r6.F2(r1)
        L63:
            int r0 = r0 << 6
            r7 = r7 & 63
            r7 = r7 | r0
            return r7
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.i.a2(int):int");
    }

    @Override // ax.T4.j
    public byte[] d(ax.T4.a aVar) throws IOException {
        m mVar = this.d0;
        if (mVar != m.VALUE_STRING && (mVar != m.VALUE_EMBEDDED_OBJECT || this.F0 == null)) {
            C0("Current token (" + this.d0 + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.W0) {
            try {
                this.F0 = Z1(aVar);
                this.W0 = false;
            } catch (IllegalArgumentException e) {
                throw a("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e.getMessage());
            }
        } else if (this.F0 == null) {
            ax.b5.c t1 = t1();
            d0(u(), t1, aVar);
            this.F0 = t1.m();
        }
        return this.F0;
    }

    @Override // ax.T4.j
    public ax.T4.h f() {
        return new ax.T4.h(m1(), this.t0 + this.r0, -1L, this.u0, (this.r0 - this.v0) + 1);
    }

    protected String f2() throws IOException {
        int i = this.r0;
        if (i >= this.s0) {
            n2();
            i = this.r0;
        }
        char[] i2 = this.B0.i();
        int[] iArr = m1;
        int min = Math.min(this.s0, i2.length + i);
        byte[] bArr = this.c1;
        int i3 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i4 = bArr[i] & 255;
            if (iArr[i4] == 0) {
                i++;
                i2[i3] = (char) i4;
                i3++;
            } else if (i4 == 34) {
                this.r0 = i + 1;
                return this.B0.v(i3);
            }
        }
        this.r0 = i;
        g2(i2, i3);
        return this.B0.h();
    }

    protected final String h2(m mVar) throws IOException {
        if (mVar == null) {
            return null;
        }
        int h = mVar.h();
        return h != 5 ? (h == 6 || h == 7 || h == 8) ? this.B0.h() : mVar.d() : this.z0.b();
    }

    protected m i2() throws IOException {
        char[] i = this.B0.i();
        int[] iArr = m1;
        byte[] bArr = this.c1;
        int i2 = 0;
        while (true) {
            if (this.r0 >= this.s0) {
                n2();
            }
            if (i2 >= i.length) {
                i = this.B0.l();
                i2 = 0;
            }
            int i3 = this.s0;
            int length = this.r0 + (i.length - i2);
            if (length < i3) {
                i3 = length;
            }
            while (true) {
                int i4 = this.r0;
                if (i4 < i3) {
                    int i5 = i4 + 1;
                    this.r0 = i5;
                    int i6 = bArr[i4] & 255;
                    if (i6 == 39) {
                        this.B0.w(i2);
                        return m.VALUE_STRING;
                    }
                    int i7 = iArr[i6];
                    if (i7 == 0 || i6 == 34) {
                        i[i2] = (char) i6;
                        i2++;
                    } else {
                        if (i7 == 1) {
                            i6 = p1();
                        } else if (i7 == 2) {
                            i6 = b2(i6);
                        } else if (i7 == 3) {
                            i6 = this.s0 - i5 >= 2 ? d2(i6) : c2(i6);
                        } else if (i7 != 4) {
                            if (i6 < 32) {
                                F1(i6, "string value");
                            }
                            D2(i6);
                        } else {
                            int e2 = e2(i6);
                            int i8 = i2 + 1;
                            i[i2] = (char) ((e2 >> 10) | 55296);
                            if (i8 >= i.length) {
                                i = this.B0.l();
                                i2 = 0;
                            } else {
                                i2 = i8;
                            }
                            i6 = 56320 | (e2 & 1023);
                        }
                        if (i2 >= i.length) {
                            i = this.B0.l();
                            i2 = 0;
                        }
                        i[i2] = (char) i6;
                        i2++;
                    }
                }
            }
        }
    }

    protected final String i3(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = n1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    F1(i3, "name");
                } else {
                    i3 = p1();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = ax.U4.b.P1(iArr, iArr.length);
                            this.V0 = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = ax.U4.b.P1(iArr, iArr.length);
                                this.V0 = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = ax.U4.b.P1(iArr, iArr.length);
                    this.V0 = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.r0 >= this.s0 && !m2()) {
                M0(" in field name", m.FIELD_NAME);
            }
            byte[] bArr = this.c1;
            int i8 = this.r0;
            this.r0 = i8 + 1;
            i3 = bArr[i8] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = ax.U4.b.P1(iArr, iArr.length);
                this.V0 = iArr;
            }
            iArr[i] = v2(i2, i4);
            i++;
        }
        String z = this.U0.z(iArr, i);
        return z == null ? c3(iArr, i, i4) : z;
    }

    protected m j2(int i, boolean z, boolean z2) throws IOException {
        String str;
        while (i == 73) {
            if (this.r0 >= this.s0 && !m2()) {
                T0(m.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.c1;
            int i2 = this.r0;
            this.r0 = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            q2(str, 3);
            if ((this.q & g1) != 0) {
                return S1(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            D0("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        if (!A(e.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.j()) && z2 && !z) {
            a1(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        a1(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    protected final String j3(int i, int i2, int i3) throws IOException {
        int[] iArr = this.V0;
        iArr[0] = this.X0;
        int i4 = 1;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this.c1;
        int[] iArr2 = n1;
        int i5 = i;
        int i6 = 3;
        while (true) {
            int i7 = this.r0;
            if (i7 + 4 > this.s0) {
                return i3(this.V0, i6, 0, i5, 0);
            }
            int i8 = i7 + 1;
            this.r0 = i8;
            int i9 = bArr[i7] & 255;
            if (iArr2[i9] != 0) {
                if (i9 == 34) {
                    return g3(this.V0, i6, i5, i4);
                }
                return i3(this.V0, i6, i5, i9, 1);
            }
            int i10 = i6;
            int[] iArr3 = iArr2;
            int i11 = (i5 << 8) | i9;
            int i12 = i7 + 2;
            this.r0 = i12;
            int i13 = bArr[i8] & 255;
            if (iArr3[i13] != 0) {
                return i13 == 34 ? g3(this.V0, i10, i11, 2) : i3(this.V0, i10, i11, i13, 2);
            }
            int i14 = (i11 << 8) | i13;
            int i15 = i7 + 3;
            this.r0 = i15;
            int i16 = bArr[i12] & 255;
            if (iArr3[i16] != 0) {
                return i16 == 34 ? g3(this.V0, i10, i14, 3) : i3(this.V0, i10, i14, i16, 3);
            }
            int i17 = (i14 << 8) | i16;
            this.r0 = i7 + 4;
            int i18 = bArr[i15] & 255;
            if (iArr3[i18] != 0) {
                return i18 == 34 ? g3(this.V0, i10, i17, 4) : i3(this.V0, i10, i17, i18, 4);
            }
            int[] iArr4 = this.V0;
            if (i10 >= iArr4.length) {
                this.V0 = ax.U4.b.P1(iArr4, i10);
            }
            this.V0[i10] = i17;
            i5 = i18;
            iArr2 = iArr3;
            i6 = i10 + 1;
            i4 = 1;
        }
    }

    protected String k2(int i) throws IOException {
        if (i == 39 && (this.q & i1) != 0) {
            return w2();
        }
        if ((this.q & j1) == 0) {
            Z0((char) a2(i), "was expecting double-quote to start field name");
        }
        int[] k = ax.W4.c.k();
        if (k[i] != 0) {
            Z0(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.V0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i |= i4 << 8;
            } else {
                if (i3 >= iArr.length) {
                    iArr = ax.U4.b.P1(iArr, iArr.length);
                    this.V0 = iArr;
                }
                iArr[i3] = i4;
                i3++;
                i2 = 1;
            }
            i4 = i;
            if (this.r0 >= this.s0 && !m2()) {
                M0(" in field name", m.FIELD_NAME);
            }
            byte[] bArr = this.c1;
            int i5 = this.r0;
            i = bArr[i5] & 255;
            if (k[i] != 0) {
                break;
            }
            this.r0 = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                iArr = ax.U4.b.P1(iArr, iArr.length);
                this.V0 = iArr;
            }
            iArr[i3] = i4;
            i3++;
        }
        String z = this.U0.z(iArr, i3);
        return z == null ? c3(iArr, i3, i2) : z;
    }

    protected final String k3(int i) throws IOException {
        byte[] bArr = this.c1;
        int[] iArr = n1;
        int i2 = this.r0;
        int i3 = i2 + 1;
        this.r0 = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? e3(this.X0, i, 1) : n3(this.X0, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = i2 + 2;
        this.r0 = i6;
        int i7 = bArr[i3] & 255;
        if (iArr[i7] != 0) {
            return i7 == 34 ? e3(this.X0, i5, 2) : n3(this.X0, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i2 + 3;
        this.r0 = i9;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            return i10 == 34 ? e3(this.X0, i8, 3) : n3(this.X0, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        this.r0 = i2 + 4;
        int i12 = bArr[i9] & 255;
        return iArr[i12] != 0 ? i12 == 34 ? e3(this.X0, i11, 4) : n3(this.X0, i11, i12, 4) : l3(i12, i11);
    }

    @Override // ax.U4.b
    protected void l1() throws IOException {
        if (this.b1 != null) {
            if (this.o0.l() || A(j.a.AUTO_CLOSE_SOURCE)) {
                this.b1.close();
            }
            this.b1 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r3.z0.g() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if ((r3.q & ax.Z4.i.h1) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r3.r0--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        return ax.T4.m.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (r3.z0.e() == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected ax.T4.m l2(int r4) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.i.l2(int):ax.T4.m");
    }

    protected final String l3(int i, int i2) throws IOException {
        byte[] bArr = this.c1;
        int[] iArr = n1;
        int i3 = this.r0;
        int i4 = i3 + 1;
        this.r0 = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? f3(this.X0, i2, i, 1) : o3(this.X0, i2, i, i5, 1);
        }
        int i6 = (i << 8) | i5;
        int i7 = i3 + 2;
        this.r0 = i7;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            return i8 == 34 ? f3(this.X0, i2, i6, 2) : o3(this.X0, i2, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i3 + 3;
        this.r0 = i10;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            return i11 == 34 ? f3(this.X0, i2, i9, 3) : o3(this.X0, i2, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this.r0 = i3 + 4;
        int i13 = bArr[i10] & 255;
        return iArr[i13] != 0 ? i13 == 34 ? f3(this.X0, i2, i12, 4) : o3(this.X0, i2, i12, i13, 4) : j3(i13, i2, i12);
    }

    protected final boolean m2() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.b1;
        if (inputStream == null || (length = (bArr = this.c1).length) == 0) {
            return false;
        }
        int read = inputStream.read(bArr, 0, length);
        if (read > 0) {
            int i = this.s0;
            this.t0 += i;
            this.v0 -= i;
            this.Y0 -= i;
            this.r0 = 0;
            this.s0 = read;
            return true;
        }
        l1();
        if (read == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.c1.length + " bytes");
        }
        return false;
    }

    protected void n2() throws IOException {
        if (m2()) {
            return;
        }
        L0();
    }

    protected final void o2() throws IOException {
        int i;
        int i2 = this.r0;
        if (i2 + 4 < this.s0) {
            byte[] bArr = this.c1;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this.r0 = i6;
                            return;
                        }
                    }
                }
            }
        }
        r2("false", 1);
    }

    @Override // ax.U4.b
    protected char p1() throws IOException {
        if (this.r0 >= this.s0 && !m2()) {
            M0(" in character escape sequence", m.VALUE_STRING);
        }
        byte[] bArr = this.c1;
        int i = this.r0;
        this.r0 = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            return x1((char) a2(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.r0 >= this.s0 && !m2()) {
                M0(" in character escape sequence", m.VALUE_STRING);
            }
            byte[] bArr2 = this.c1;
            int i4 = this.r0;
            this.r0 = i4 + 1;
            byte b2 = bArr2[i4];
            int b3 = ax.W4.c.b(b2);
            if (b3 < 0) {
                Z0(b2 & 255, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | b3;
        }
        return (char) i2;
    }

    protected final void p2() throws IOException {
        int i;
        int i2 = this.r0;
        if (i2 + 3 < this.s0) {
            byte[] bArr = this.c1;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.r0 = i5;
                        return;
                    }
                }
            }
        }
        r2("null", 1);
    }

    protected String p3() throws IOException {
        if (this.r0 >= this.s0 && !m2()) {
            M0(": was expecting closing '\"' for name", m.FIELD_NAME);
        }
        byte[] bArr = this.c1;
        int i = this.r0;
        this.r0 = i + 1;
        int i2 = bArr[i] & 255;
        return i2 == 34 ? HttpUrl.FRAGMENT_ENCODE_SET : i3(this.V0, 0, 0, i2, 0);
    }

    protected final void q2(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        if (this.r0 + length >= this.s0) {
            r2(str, i);
            return;
        }
        do {
            if (this.c1[this.r0] != str.charAt(i)) {
                H2(str.substring(0, i));
            }
            i2 = this.r0 + 1;
            this.r0 = i2;
            i++;
        } while (i < length);
        int i3 = this.c1[i2] & 255;
        if (i3 < 48 || i3 == 93 || i3 == 125) {
            return;
        }
        V1(str, i, i3);
    }

    protected final void s2() throws IOException {
        int i;
        int i2 = this.r0;
        if (i2 + 3 < this.s0) {
            byte[] bArr = this.c1;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.r0 = i5;
                        return;
                    }
                }
            }
        }
        r2("true", 1);
    }

    @Override // ax.U4.c, ax.T4.j
    public String u() throws IOException {
        m mVar = this.d0;
        if (mVar != m.VALUE_STRING) {
            return h2(mVar);
        }
        if (!this.W0) {
            return this.B0.h();
        }
        this.W0 = false;
        return f2();
    }

    @Override // ax.T4.j
    public ax.T4.h v() {
        if (this.d0 != m.FIELD_NAME) {
            return new ax.T4.h(m1(), this.w0 - 1, -1L, this.x0, this.y0);
        }
        return new ax.T4.h(m1(), this.t0 + (this.Y0 - 1), -1L, this.Z0, this.a1);
    }

    protected String w2() throws IOException {
        if (this.r0 >= this.s0 && !m2()) {
            M0(": was expecting closing ''' for field name", m.FIELD_NAME);
        }
        byte[] bArr = this.c1;
        int i = this.r0;
        this.r0 = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 39) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int[] iArr = this.V0;
        int[] iArr2 = n1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 != 39) {
            if (iArr2[i2] != 0 && i2 != 34) {
                if (i2 != 92) {
                    F1(i2, "name");
                } else {
                    i2 = p1();
                }
                if (i2 > 127) {
                    if (i3 >= 4) {
                        if (i4 >= iArr.length) {
                            iArr = ax.U4.b.P1(iArr, iArr.length);
                            this.V0 = iArr;
                        }
                        iArr[i4] = i5;
                        i4++;
                        i3 = 0;
                        i5 = 0;
                    }
                    if (i2 < 2048) {
                        i5 = (i5 << 8) | (i2 >> 6) | 192;
                        i3++;
                    } else {
                        int i6 = (i5 << 8) | (i2 >> 12) | 224;
                        int i7 = i3 + 1;
                        if (i7 >= 4) {
                            if (i4 >= iArr.length) {
                                iArr = ax.U4.b.P1(iArr, iArr.length);
                                this.V0 = iArr;
                            }
                            iArr[i4] = i6;
                            i4++;
                            i7 = 0;
                            i6 = 0;
                        }
                        i5 = (i6 << 8) | ((i2 >> 6) & 63) | 128;
                        i3 = i7 + 1;
                    }
                    i2 = (i2 & 63) | 128;
                }
            }
            if (i3 < 4) {
                i3++;
                i2 |= i5 << 8;
            } else {
                if (i4 >= iArr.length) {
                    iArr = ax.U4.b.P1(iArr, iArr.length);
                    this.V0 = iArr;
                }
                iArr[i4] = i5;
                i4++;
                i3 = 1;
            }
            i5 = i2;
            if (this.r0 >= this.s0 && !m2()) {
                M0(" in field name", m.FIELD_NAME);
            }
            byte[] bArr2 = this.c1;
            int i8 = this.r0;
            this.r0 = i8 + 1;
            i2 = bArr2[i8] & 255;
        }
        if (i3 > 0) {
            if (i4 >= iArr.length) {
                iArr = ax.U4.b.P1(iArr, iArr.length);
                this.V0 = iArr;
            }
            iArr[i4] = v2(i5, i3);
            i4++;
        }
        String z = this.U0.z(iArr, i4);
        return z == null ? c3(iArr, i4, i3) : z;
    }

    protected final m y2(boolean z, boolean z2) throws IOException {
        int i;
        if (!A(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.j())) {
            return l2(46);
        }
        char[] i2 = this.B0.i();
        if (z) {
            i2[0] = '-';
            i = 1;
        } else {
            i = 0;
        }
        return x2(i2, i, 46, z, 0);
    }

    protected final String z2(int i) throws IOException {
        if (i != 34) {
            return k2(i);
        }
        int i2 = this.r0;
        if (i2 + 13 > this.s0) {
            return p3();
        }
        byte[] bArr = this.c1;
        int[] iArr = n1;
        int i3 = i2 + 1;
        this.r0 = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? HttpUrl.FRAGMENT_ENCODE_SET : m3(0, i4, 0);
        }
        int i5 = i2 + 2;
        this.r0 = i5;
        int i6 = bArr[i3] & 255;
        if (iArr[i6] != 0) {
            return i6 == 34 ? d3(i4, 1) : m3(i4, i6, 1);
        }
        int i7 = i6 | (i4 << 8);
        int i8 = i2 + 3;
        this.r0 = i8;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            return i9 == 34 ? d3(i7, 2) : m3(i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i2 + 4;
        this.r0 = i11;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            return i12 == 34 ? d3(i10, 3) : m3(i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this.r0 = i2 + 5;
        int i14 = bArr[i11] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? d3(i13, 4) : m3(i13, i14, 4);
        }
        this.X0 = i13;
        return k3(i14);
    }
}
