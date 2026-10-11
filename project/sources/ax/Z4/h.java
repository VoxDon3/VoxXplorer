package ax.Z4;

import ax.T4.g;
import ax.T4.n;
import ax.T4.o;
import ax.T4.p;
import ax.W4.k;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class h extends c {
    private static final byte[] C0 = ax.W4.c.c(true);
    private static final byte[] D0 = ax.W4.c.c(false);
    private static final byte[] E0 = {110, 117, 108, 108};
    private static final byte[] F0 = {116, 114, 117, 101};
    private static final byte[] G0 = {102, 97, 108, 115, 101};
    protected final int A0;
    protected boolean B0;
    protected final OutputStream t0;
    protected byte u0;
    protected byte[] v0;
    protected int w0;
    protected final int x0;
    protected final int y0;
    protected char[] z0;

    public h(ax.W4.e eVar, int i, n nVar, OutputStream outputStream, char c) {
        super(eVar, i, nVar);
        this.t0 = outputStream;
        this.u0 = (byte) c;
        if (c != '\"') {
            this.m0 = ax.W4.c.f(c);
        }
        this.B0 = true;
        byte[] h = eVar.h();
        this.v0 = h;
        int length = h.length;
        this.x0 = length;
        this.y0 = length >> 3;
        char[] d = eVar.d();
        this.z0 = d;
        this.A0 = d.length;
        if (L0(g.a.ESCAPE_NON_ASCII)) {
            d(127);
        }
    }

    private final int a1(int i, int i2) throws IOException {
        byte[] v1 = v1();
        byte[] bArr = this.v0;
        if (i < 55296 || i > 57343) {
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i3 = i2 + 2;
            bArr[i2 + 1] = (byte) (((i >> 6) & 63) | 128);
            int i4 = i2 + 3;
            bArr[i3] = (byte) ((i & 63) | 128);
            return i4;
        }
        bArr[i2] = 92;
        bArr[i2 + 1] = 117;
        bArr[i2 + 2] = v1[(i >> 12) & 15];
        bArr[i2 + 3] = v1[(i >> 8) & 15];
        int i5 = i2 + 5;
        bArr[i2 + 4] = v1[(i >> 4) & 15];
        int i6 = i2 + 6;
        bArr[i5] = v1[i & 15];
        return i6;
    }

    private final int b1(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i >= 55296 && i <= 57343) {
            if (i2 >= i3 || cArr == null) {
                a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)));
            } else {
                c1(i, cArr[i2]);
            }
            return i2 + 1;
        }
        byte[] bArr = this.v0;
        int i4 = this.w0;
        int i5 = 1 + i4;
        this.w0 = i5;
        bArr[i4] = (byte) ((i >> 12) | 224);
        int i6 = i4 + 2;
        this.w0 = i6;
        bArr[i5] = (byte) (((i >> 6) & 63) | 128);
        this.w0 = i4 + 3;
        bArr[i6] = (byte) ((i & 63) | 128);
        return i2;
    }

    private final void f1(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.w0 + length > this.x0) {
            Z0();
            if (length > 512) {
                this.t0.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.v0, this.w0, length);
        this.w0 += length;
    }

    private int g1(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.v0;
        byte[] v1 = v1();
        bArr[i2] = 92;
        int i4 = i2 + 2;
        bArr[i2 + 1] = 117;
        if (i > 255) {
            int i5 = i >> 8;
            int i6 = i2 + 3;
            bArr[i4] = v1[(i5 & 255) >> 4];
            i3 = i2 + 4;
            bArr[i6] = v1[i5 & 15];
            i &= 255;
        } else {
            int i7 = i2 + 3;
            bArr[i4] = 48;
            i3 = i2 + 4;
            bArr[i7] = 48;
        }
        int i8 = i3 + 1;
        bArr[i3] = v1[i >> 4];
        int i9 = i3 + 2;
        bArr[i8] = v1[i & 15];
        return i9;
    }

    private final void h1() throws IOException {
        if (this.w0 + 4 >= this.x0) {
            Z0();
        }
        System.arraycopy(E0, 0, this.v0, this.w0, 4);
        this.w0 += 4;
    }

    private final void j1(long j) throws IOException {
        if (this.w0 + 23 >= this.x0) {
            Z0();
        }
        byte[] bArr = this.v0;
        int i = this.w0;
        int i2 = i + 1;
        this.w0 = i2;
        bArr[i] = this.u0;
        int r = k.r(j, bArr, i2);
        byte[] bArr2 = this.v0;
        this.w0 = r + 1;
        bArr2[r] = this.u0;
    }

    private void k1(char[] cArr, int i, int i2) throws IOException {
        while (i < i2) {
            do {
                char c = cArr[i];
                if (c > 127) {
                    i++;
                    if (c < 2048) {
                        byte[] bArr = this.v0;
                        int i3 = this.w0;
                        int i4 = i3 + 1;
                        this.w0 = i4;
                        bArr[i3] = (byte) ((c >> 6) | 192);
                        this.w0 = i3 + 2;
                        bArr[i4] = (byte) ((c & '?') | 128);
                    } else {
                        i = b1(c, cArr, i, i2);
                    }
                } else {
                    byte[] bArr2 = this.v0;
                    int i5 = this.w0;
                    this.w0 = i5 + 1;
                    bArr2[i5] = (byte) c;
                    i++;
                }
            } while (i < i2);
            return;
        }
    }

    private final void l1(char[] cArr, int i, int i2) throws IOException {
        int i3 = this.x0;
        byte[] bArr = this.v0;
        int i4 = i2 + i;
        while (i < i4) {
            do {
                char c = cArr[i];
                if (c >= 128) {
                    if (this.w0 + 3 >= this.x0) {
                        Z0();
                    }
                    int i5 = i + 1;
                    char c2 = cArr[i];
                    if (c2 < 2048) {
                        int i6 = this.w0;
                        int i7 = i6 + 1;
                        this.w0 = i7;
                        bArr[i6] = (byte) ((c2 >> 6) | 192);
                        this.w0 = i6 + 2;
                        bArr[i7] = (byte) ((c2 & '?') | 128);
                        i = i5;
                    } else {
                        i = b1(c2, cArr, i5, i4);
                    }
                } else {
                    if (this.w0 >= i3) {
                        Z0();
                    }
                    int i8 = this.w0;
                    this.w0 = i8 + 1;
                    bArr[i8] = (byte) c;
                    i++;
                }
            } while (i < i4);
            return;
        }
    }

    private final void m1(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.w0;
        byte[] bArr = this.v0;
        int[] iArr = this.m0;
        while (i < i3) {
            char charAt = str.charAt(i);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i4] = (byte) charAt;
            i++;
            i4++;
        }
        this.w0 = i4;
        if (i < i3) {
            if (this.n0 == 0) {
                o1(str, i, i3);
            } else {
                q1(str, i, i3);
            }
        }
    }

    private final void n1(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.w0;
        byte[] bArr = this.v0;
        int[] iArr = this.m0;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.w0 = i4;
        if (i < i3) {
            if (this.n0 == 0) {
                p1(cArr, i, i3);
            } else {
                r1(cArr, i, i3);
            }
        }
    }

    private final void o1(String str, int i, int i2) throws IOException {
        if (this.w0 + ((i2 - i) * 6) > this.x0) {
            Z0();
        }
        int i3 = this.w0;
        byte[] bArr = this.v0;
        int[] iArr = this.m0;
        while (i < i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                int i5 = iArr[charAt];
                if (i5 == 0) {
                    bArr[i3] = (byte) charAt;
                    i = i4;
                    i3++;
                } else if (i5 > 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = 92;
                    i3 += 2;
                    bArr[i6] = (byte) i5;
                } else {
                    i3 = g1(charAt, i3);
                }
            } else if (charAt <= 2047) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 += 2;
                bArr[i7] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = a1(charAt, i3);
            }
            i = i4;
        }
        this.w0 = i3;
    }

    private final void p1(char[] cArr, int i, int i2) throws IOException {
        if (this.w0 + ((i2 - i) * 6) > this.x0) {
            Z0();
        }
        int i3 = this.w0;
        byte[] bArr = this.v0;
        int[] iArr = this.m0;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i5 = iArr[c];
                if (i5 == 0) {
                    bArr[i3] = (byte) c;
                    i = i4;
                    i3++;
                } else if (i5 > 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = 92;
                    i3 += 2;
                    bArr[i6] = (byte) i5;
                } else {
                    i3 = g1(c, i3);
                }
            } else if (c <= 2047) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 += 2;
                bArr[i7] = (byte) ((c & '?') | 128);
            } else {
                i3 = a1(c, i3);
            }
            i = i4;
        }
        this.w0 = i3;
    }

    private final void q1(String str, int i, int i2) throws IOException {
        if (this.w0 + ((i2 - i) * 6) > this.x0) {
            Z0();
        }
        int i3 = this.w0;
        byte[] bArr = this.v0;
        int[] iArr = this.m0;
        int i4 = this.n0;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                int i6 = iArr[charAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3++;
                } else if (i6 > 0) {
                    int i7 = i3 + 1;
                    bArr[i3] = 92;
                    i3 += 2;
                    bArr[i7] = (byte) i6;
                } else {
                    i3 = g1(charAt, i3);
                }
            } else if (charAt > i4) {
                i3 = g1(charAt, i3);
            } else if (charAt <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 += 2;
                bArr[i8] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = a1(charAt, i3);
            }
            i = i5;
        }
        this.w0 = i3;
    }

    private final void r1(char[] cArr, int i, int i2) throws IOException {
        if (this.w0 + ((i2 - i) * 6) > this.x0) {
            Z0();
        }
        int i3 = this.w0;
        byte[] bArr = this.v0;
        int[] iArr = this.m0;
        int i4 = this.n0;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i6 = iArr[c];
                if (i6 == 0) {
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3++;
                } else if (i6 > 0) {
                    int i7 = i3 + 1;
                    bArr[i3] = 92;
                    i3 += 2;
                    bArr[i7] = (byte) i6;
                } else {
                    i3 = g1(c, i3);
                }
            } else if (c > i4) {
                i3 = g1(c, i3);
            } else if (c <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 += 2;
                bArr[i8] = (byte) ((c & '?') | 128);
            } else {
                i3 = a1(c, i3);
            }
            i = i5;
        }
        this.w0 = i3;
    }

    private final void s1(String str, int i, int i2) throws IOException {
        do {
            int min = Math.min(this.y0, i2);
            if (this.w0 + min > this.x0) {
                Z0();
            }
            m1(str, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private final void t1(String str, boolean z) throws IOException {
        if (z) {
            if (this.w0 >= this.x0) {
                Z0();
            }
            byte[] bArr = this.v0;
            int i = this.w0;
            this.w0 = i + 1;
            bArr[i] = this.u0;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this.y0, length);
            if (this.w0 + min > this.x0) {
                Z0();
            }
            m1(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this.w0 >= this.x0) {
                Z0();
            }
            byte[] bArr2 = this.v0;
            int i3 = this.w0;
            this.w0 = i3 + 1;
            bArr2[i3] = this.u0;
        }
    }

    private final void u1(char[] cArr, int i, int i2) throws IOException {
        do {
            int min = Math.min(this.y0, i2);
            if (this.w0 + min > this.x0) {
                Z0();
            }
            n1(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private byte[] v1() {
        return this.q0 ? C0 : D0;
    }

    @Override // ax.T4.g
    public void A(char c) throws IOException {
        if (this.w0 + 3 >= this.x0) {
            Z0();
        }
        byte[] bArr = this.v0;
        if (c <= 127) {
            int i = this.w0;
            this.w0 = i + 1;
            bArr[i] = (byte) c;
        } else {
            if (c >= 2048) {
                b1(c, null, 0, 0);
                return;
            }
            int i2 = this.w0;
            int i3 = i2 + 1;
            this.w0 = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.w0 = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
        }
    }

    @Override // ax.T4.g
    public void F(p pVar) throws IOException {
        int b = pVar.b(this.v0, this.w0);
        if (b < 0) {
            f1(pVar.c());
        } else {
            this.w0 += b;
        }
    }

    @Override // ax.T4.g
    public void H(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.z0;
        if (length > cArr.length) {
            w1(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            L(cArr, 0, length);
        }
    }

    @Override // ax.T4.g
    public final void L(char[] cArr, int i, int i2) throws IOException {
        A0(cArr, i, i2);
        int i3 = i2 + i2 + i2;
        int i4 = this.w0 + i3;
        int i5 = this.x0;
        if (i4 > i5) {
            if (i5 < i3) {
                l1(cArr, i, i2);
                return;
            }
            Z0();
        }
        int i6 = i2 + i;
        while (i < i6) {
            do {
                char c = cArr[i];
                if (c > 127) {
                    i++;
                    if (c < 2048) {
                        byte[] bArr = this.v0;
                        int i7 = this.w0;
                        int i8 = i7 + 1;
                        this.w0 = i8;
                        bArr[i7] = (byte) ((c >> 6) | 192);
                        this.w0 = i7 + 2;
                        bArr[i8] = (byte) ((c & '?') | 128);
                    } else {
                        i = b1(c, cArr, i, i6);
                    }
                } else {
                    byte[] bArr2 = this.v0;
                    int i9 = this.w0;
                    this.w0 = i9 + 1;
                    bArr2[i9] = (byte) c;
                    i++;
                }
            } while (i < i6);
            return;
        }
    }

    @Override // ax.T4.g
    public final void W() throws IOException {
        e1("start an array");
        this.i0 = this.i0.k();
        o oVar = this.q;
        if (oVar != null) {
            oVar.f(this);
            return;
        }
        if (this.w0 >= this.x0) {
            Z0();
        }
        byte[] bArr = this.v0;
        int i = this.w0;
        this.w0 = i + 1;
        bArr[i] = 91;
    }

    protected final void Z0() throws IOException {
        int i = this.w0;
        if (i > 0) {
            this.w0 = 0;
            this.t0.write(this.v0, 0, i);
        }
    }

    protected final void c1(int i, int i2) throws IOException {
        int F02 = F0(i, i2);
        if (this.w0 + 4 > this.x0) {
            Z0();
        }
        byte[] bArr = this.v0;
        int i3 = this.w0;
        int i4 = i3 + 1;
        this.w0 = i4;
        bArr[i3] = (byte) ((F02 >> 18) | 240);
        int i5 = i3 + 2;
        this.w0 = i5;
        bArr[i4] = (byte) (((F02 >> 12) & 63) | 128);
        int i6 = i3 + 3;
        this.w0 = i6;
        bArr[i5] = (byte) (((F02 >> 6) & 63) | 128);
        this.w0 = i3 + 4;
        bArr[i6] = (byte) ((F02 & 63) | 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005f  */
    @Override // ax.U4.a, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            super.close()
            byte[] r0 = r2.v0     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
            ax.T4.g$a r0 = ax.T4.g.a.AUTO_CLOSE_JSON_CONTENT     // Catch: java.io.IOException -> L1d
            boolean r0 = r2.L0(r0)     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
        Lf:
            ax.T4.l r0 = r2.G0()     // Catch: java.io.IOException -> L1d
            boolean r1 = r0.e()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L1f
            r2.j()     // Catch: java.io.IOException -> L1d
            goto Lf
        L1d:
            r0 = move-exception
            goto L2d
        L1f:
            boolean r0 = r0.f()     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
            r2.m()     // Catch: java.io.IOException -> L1d
            goto Lf
        L29:
            r2.Z0()     // Catch: java.io.IOException -> L1d
            r0 = 0
        L2d:
            r1 = 0
            r2.w0 = r1
            java.io.OutputStream r1 = r2.t0
            if (r1 == 0) goto L63
            ax.W4.e r1 = r2.l0     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            boolean r1 = r1.l()     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            if (r1 != 0) goto L57
            ax.T4.g$a r1 = ax.T4.g.a.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            boolean r1 = r2.L0(r1)     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            if (r1 == 0) goto L45
            goto L57
        L45:
            ax.T4.g$a r1 = ax.T4.g.a.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            boolean r1 = r2.L0(r1)     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            if (r1 == 0) goto L63
            java.io.OutputStream r1 = r2.t0     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            r1.flush()     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            goto L63
        L53:
            r1 = move-exception
            goto L5d
        L55:
            r1 = move-exception
            goto L5d
        L57:
            java.io.OutputStream r1 = r2.t0     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            r1.close()     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            goto L63
        L5d:
            if (r0 == 0) goto L62
            r1.addSuppressed(r0)
        L62:
            throw r1
        L63:
            r2.d1()
            if (r0 != 0) goto L69
            return
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.h.close():void");
    }

    protected void d1() {
        byte[] bArr = this.v0;
        if (bArr != null && this.B0) {
            this.v0 = null;
            this.l0.q(bArr);
        }
        char[] cArr = this.z0;
        if (cArr != null) {
            this.z0 = null;
            this.l0.m(cArr);
        }
    }

    protected final void e1(String str) throws IOException {
        byte b;
        int p = this.i0.p();
        if (this.q != null) {
            T0(str, p);
            return;
        }
        if (p == 1) {
            b = 44;
        } else {
            if (p != 2) {
                if (p != 3) {
                    if (p != 5) {
                        return;
                    }
                    M0(str);
                    return;
                }
                p pVar = this.o0;
                if (pVar != null) {
                    byte[] c = pVar.c();
                    if (c.length > 0) {
                        f1(c);
                        return;
                    }
                    return;
                }
                return;
            }
            b = 58;
        }
        if (this.w0 >= this.x0) {
            Z0();
        }
        byte[] bArr = this.v0;
        int i = this.w0;
        this.w0 = i + 1;
        bArr[i] = b;
    }

    @Override // ax.T4.g, java.io.Flushable
    public void flush() throws IOException {
        Z0();
        if (this.t0 == null || !L0(g.a.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.t0.flush();
    }

    @Override // ax.T4.g
    public void g(boolean z) throws IOException {
        e1("write a boolean value");
        if (this.w0 + 5 >= this.x0) {
            Z0();
        }
        byte[] bArr = z ? F0 : G0;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.v0, this.w0, length);
        this.w0 += length;
    }

    protected final void i1(String str) throws IOException {
        int o = this.i0.o(str);
        if (o == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (o == 1) {
            this.q.h(this);
        } else {
            this.q.a(this);
        }
        if (this.p0) {
            t1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.A0) {
            t1(str, true);
            return;
        }
        if (this.w0 >= this.x0) {
            Z0();
        }
        byte[] bArr = this.v0;
        int i = this.w0;
        this.w0 = i + 1;
        bArr[i] = this.u0;
        str.getChars(0, length, this.z0, 0);
        if (length <= this.y0) {
            if (this.w0 + length > this.x0) {
                Z0();
            }
            n1(this.z0, 0, length);
        } else {
            u1(this.z0, 0, length);
        }
        if (this.w0 >= this.x0) {
            Z0();
        }
        byte[] bArr2 = this.v0;
        int i2 = this.w0;
        this.w0 = i2 + 1;
        bArr2[i2] = this.u0;
    }

    @Override // ax.T4.g
    public final void j() throws IOException {
        if (!this.i0.e()) {
            a("Current context not Array but " + this.i0.h());
        }
        o oVar = this.q;
        if (oVar != null) {
            oVar.b(this, this.i0.c());
        } else {
            if (this.w0 >= this.x0) {
                Z0();
            }
            byte[] bArr = this.v0;
            int i = this.w0;
            this.w0 = i + 1;
            bArr[i] = 93;
        }
        this.i0 = this.i0.j();
    }

    @Override // ax.T4.g
    public final void m() throws IOException {
        if (!this.i0.f()) {
            a("Current context not Object but " + this.i0.h());
        }
        o oVar = this.q;
        if (oVar != null) {
            oVar.c(this, this.i0.c());
        } else {
            if (this.w0 >= this.x0) {
                Z0();
            }
            byte[] bArr = this.v0;
            int i = this.w0;
            this.w0 = i + 1;
            bArr[i] = 125;
        }
        this.i0 = this.i0.j();
    }

    @Override // ax.T4.g
    public void o(String str) throws IOException {
        if (this.q != null) {
            i1(str);
            return;
        }
        int o = this.i0.o(str);
        if (o == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (o == 1) {
            if (this.w0 >= this.x0) {
                Z0();
            }
            byte[] bArr = this.v0;
            int i = this.w0;
            this.w0 = i + 1;
            bArr[i] = 44;
        }
        if (this.p0) {
            t1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.A0) {
            t1(str, true);
            return;
        }
        if (this.w0 >= this.x0) {
            Z0();
        }
        byte[] bArr2 = this.v0;
        int i2 = this.w0;
        int i3 = i2 + 1;
        this.w0 = i3;
        bArr2[i2] = this.u0;
        if (length <= this.y0) {
            if (i3 + length > this.x0) {
                Z0();
            }
            m1(str, 0, length);
        } else {
            s1(str, 0, length);
        }
        if (this.w0 >= this.x0) {
            Z0();
        }
        byte[] bArr3 = this.v0;
        int i4 = this.w0;
        this.w0 = i4 + 1;
        bArr3[i4] = this.u0;
    }

    @Override // ax.T4.g
    public final void o0() throws IOException {
        e1("start an object");
        this.i0 = this.i0.l();
        o oVar = this.q;
        if (oVar != null) {
            oVar.g(this);
            return;
        }
        if (this.w0 >= this.x0) {
            Z0();
        }
        byte[] bArr = this.v0;
        int i = this.w0;
        this.w0 = i + 1;
        bArr[i] = 123;
    }

    @Override // ax.T4.g
    public void p() throws IOException {
        e1("write a null");
        h1();
    }

    @Override // ax.T4.g
    public void q(double d) throws IOException {
        if (this.h0 || (k.o(d) && g.a.QUOTE_NON_NUMERIC_NUMBERS.j(this.g0))) {
            s0(k.t(d, L0(g.a.USE_FAST_DOUBLE_WRITER)));
        } else {
            e1("write a number");
            H(k.t(d, L0(g.a.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // ax.T4.g
    public void s0(String str) throws IOException {
        e1("write a string");
        if (str == null) {
            h1();
            return;
        }
        int length = str.length();
        if (length > this.y0) {
            t1(str, true);
            return;
        }
        if (this.w0 + length >= this.x0) {
            Z0();
        }
        byte[] bArr = this.v0;
        int i = this.w0;
        this.w0 = i + 1;
        bArr[i] = this.u0;
        m1(str, 0, length);
        if (this.w0 >= this.x0) {
            Z0();
        }
        byte[] bArr2 = this.v0;
        int i2 = this.w0;
        this.w0 = i2 + 1;
        bArr2[i2] = this.u0;
    }

    @Override // ax.T4.g
    public void u(long j) throws IOException {
        e1("write a number");
        if (this.h0) {
            j1(j);
            return;
        }
        if (this.w0 + 21 >= this.x0) {
            Z0();
        }
        this.w0 = k.r(j, this.v0, this.w0);
    }

    public void w1(String str, int i, int i2) throws IOException {
        char c;
        C0(str, i, i2);
        char[] cArr = this.z0;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            L(cArr, 0, i2);
            return;
        }
        int i3 = this.x0;
        int min = Math.min(length, (i3 >> 2) + (i3 >> 4));
        int i4 = min * 3;
        while (i2 > 0) {
            int min2 = Math.min(min, i2);
            str.getChars(i, i + min2, cArr, 0);
            if (this.w0 + i4 > this.x0) {
                Z0();
            }
            if (min2 > 1 && (c = cArr[min2 - 1]) >= 55296 && c <= 56319) {
                min2--;
            }
            k1(cArr, 0, min2);
            i += min2;
            i2 -= min2;
        }
    }
}
