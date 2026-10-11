package ax.Z4;

import ax.T4.g;
import ax.T4.n;
import ax.T4.o;
import ax.T4.p;
import ax.W4.k;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public class j extends c {
    protected static final char[] C0 = ax.W4.c.d(true);
    protected static final char[] D0 = ax.W4.c.d(false);
    protected p A0;
    protected char[] B0;
    protected final Writer t0;
    protected char u0;
    protected char[] v0;
    protected int w0;
    protected int x0;
    protected int y0;
    protected char[] z0;

    public j(ax.W4.e eVar, int i, n nVar, Writer writer, char c) {
        super(eVar, i, nVar);
        this.t0 = writer;
        char[] d = eVar.d();
        this.v0 = d;
        this.y0 = d.length;
        this.u0 = c;
        if (c != '\"') {
            this.m0 = ax.W4.c.f(c);
        }
    }

    private char[] Z0() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.z0 = cArr;
        return cArr;
    }

    private int b1(char[] cArr, int i, int i2, char c, int i3) throws IOException, ax.T4.f {
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArr2 = this.z0;
            if (cArr2 == null) {
                cArr2 = Z0();
            }
            cArr2[1] = (char) i3;
            this.t0.write(cArr2, 0, 2);
            return i;
        }
        if (i3 == -2) {
            this.A0.getClass();
            String value = this.A0.getValue();
            this.A0 = null;
            int length = value.length();
            if (i < length || i >= i2) {
                this.t0.write(value);
                return i;
            }
            int i6 = i - length;
            value.getChars(0, length, cArr, i6);
            return i6;
        }
        char[] p1 = p1();
        if (i <= 5 || i >= i2) {
            char[] cArr3 = this.z0;
            if (cArr3 == null) {
                cArr3 = Z0();
            }
            this.w0 = this.x0;
            if (c <= 255) {
                cArr3[6] = p1[c >> 4];
                cArr3[7] = p1[c & 15];
                this.t0.write(cArr3, 2, 6);
                return i;
            }
            int i7 = c >> '\b';
            cArr3[10] = p1[(i7 & 255) >> 4];
            cArr3[11] = p1[i7 & 15];
            cArr3[12] = p1[(c & 255) >> 4];
            cArr3[13] = p1[c & 15];
            this.t0.write(cArr3, 8, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i8 = i - 4;
        cArr[i - 5] = 'u';
        if (c > 255) {
            int i9 = c >> '\b';
            int i10 = i - 3;
            cArr[i8] = p1[(i9 & 255) >> 4];
            i4 = i - 2;
            cArr[i10] = p1[i9 & 15];
            c = (char) (c & 255);
        } else {
            int i11 = i - 3;
            cArr[i8] = '0';
            i4 = i - 2;
            cArr[i11] = '0';
        }
        cArr[i4] = p1[c >> 4];
        cArr[i4 + 1] = p1[c & 15];
        return i4 - 4;
    }

    private void c1(char c, int i) throws IOException, ax.T4.f {
        int i2;
        if (i >= 0) {
            int i3 = this.x0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.w0 = i4;
                char[] cArr = this.v0;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArr2 = this.z0;
            if (cArr2 == null) {
                cArr2 = Z0();
            }
            this.w0 = this.x0;
            cArr2[1] = (char) i;
            this.t0.write(cArr2, 0, 2);
            return;
        }
        if (i == -2) {
            this.A0.getClass();
            String value = this.A0.getValue();
            this.A0 = null;
            int length = value.length();
            int i5 = this.x0;
            if (i5 < length) {
                this.w0 = i5;
                this.t0.write(value);
                return;
            } else {
                int i6 = i5 - length;
                this.w0 = i6;
                value.getChars(0, length, this.v0, i6);
                return;
            }
        }
        char[] p1 = p1();
        int i7 = this.x0;
        if (i7 < 6) {
            char[] cArr3 = this.z0;
            if (cArr3 == null) {
                cArr3 = Z0();
            }
            this.w0 = this.x0;
            if (c <= 255) {
                cArr3[6] = p1[c >> 4];
                cArr3[7] = p1[c & 15];
                this.t0.write(cArr3, 2, 6);
                return;
            } else {
                int i8 = c >> '\b';
                cArr3[10] = p1[(i8 & 255) >> 4];
                cArr3[11] = p1[i8 & 15];
                cArr3[12] = p1[(c & 255) >> 4];
                cArr3[13] = p1[c & 15];
                this.t0.write(cArr3, 8, 6);
                return;
            }
        }
        char[] cArr4 = this.v0;
        int i9 = i7 - 6;
        this.w0 = i9;
        cArr4[i9] = '\\';
        cArr4[i7 - 5] = 'u';
        if (c > 255) {
            int i10 = c >> '\b';
            cArr4[i7 - 4] = p1[(i10 & 255) >> 4];
            i2 = i7 - 3;
            cArr4[i2] = p1[i10 & 15];
            c = (char) (c & 255);
        } else {
            cArr4[i7 - 4] = '0';
            i2 = i7 - 3;
            cArr4[i2] = '0';
        }
        cArr4[i2 + 1] = p1[c >> 4];
        cArr4[i2 + 2] = p1[c & 15];
    }

    private void g1(String str) throws IOException {
        a1();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.y0;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.v0, 0);
            int i4 = this.n0;
            if (i4 != 0) {
                l1(i2, i4);
            } else {
                k1(i2);
            }
            if (i3 >= length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    private final void h1() throws IOException {
        if (this.x0 + 4 >= this.y0) {
            a1();
        }
        int i = this.x0;
        char[] cArr = this.v0;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.x0 = i + 4;
    }

    private void j1(long j) throws IOException {
        if (this.x0 + 23 >= this.y0) {
            a1();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        int i2 = i + 1;
        this.x0 = i2;
        cArr[i] = this.u0;
        int s = k.s(j, cArr, i2);
        char[] cArr2 = this.v0;
        this.x0 = s + 1;
        cArr2[s] = this.u0;
    }

    private void k1(int i) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.m0;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            do {
                cArr = this.v0;
                c = cArr[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i2++;
                }
            } while (i2 < i);
            int i4 = i2 - i3;
            if (i4 > 0) {
                this.t0.write(cArr, i3, i4);
                if (i2 >= i) {
                    return;
                }
            }
            int i5 = i2 + 1;
            i3 = b1(this.v0, i5, i, c, iArr[c]);
            i2 = i5;
        }
    }

    private void l1(int i, int i2) throws IOException, ax.T4.f {
        char[] cArr;
        char c;
        int i3;
        int[] iArr = this.m0;
        int min = Math.min(iArr.length, i2 + 1);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i) {
            do {
                cArr = this.v0;
                c = cArr[i4];
                if (c >= min) {
                    if (c > i2) {
                        i3 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i4++;
            } while (i4 < i);
            i3 = i6;
            int i7 = i4 - i5;
            if (i7 > 0) {
                this.t0.write(cArr, i5, i7);
                if (i4 >= i) {
                    return;
                }
            }
            int i8 = i4 + 1;
            i5 = b1(this.v0, i8, i, c, i3);
            i4 = i8;
            i6 = i3;
        }
    }

    private void m1(String str) throws IOException {
        int length = str.length();
        int i = this.y0;
        if (length > i) {
            g1(str);
            return;
        }
        if (this.x0 + length > i) {
            a1();
        }
        str.getChars(0, length, this.v0, this.x0);
        int i2 = this.n0;
        if (i2 != 0) {
            o1(length, i2);
        } else {
            n1(length);
        }
    }

    private void n1(int i) throws IOException {
        int i2;
        int i3 = this.x0 + i;
        int[] iArr = this.m0;
        int length = iArr.length;
        while (this.x0 < i3) {
            do {
                char[] cArr = this.v0;
                int i4 = this.x0;
                char c = cArr[i4];
                if (c >= length || iArr[c] == 0) {
                    i2 = i4 + 1;
                    this.x0 = i2;
                } else {
                    int i5 = this.w0;
                    int i6 = i4 - i5;
                    if (i6 > 0) {
                        this.t0.write(cArr, i5, i6);
                    }
                    char[] cArr2 = this.v0;
                    int i7 = this.x0;
                    this.x0 = i7 + 1;
                    char c2 = cArr2[i7];
                    c1(c2, iArr[c2]);
                }
            } while (i2 < i3);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o1(int r9, int r10) throws java.io.IOException, ax.T4.f {
        /*
            r8 = this;
            int r0 = r8.x0
            int r0 = r0 + r9
            int[] r9 = r8.m0
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8.x0
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8.v0
            int r3 = r8.x0
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8.w0
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8.t0
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8.x0
            int r2 = r2 + 1
            r8.x0 = r2
            r8.c1(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8.x0 = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.j.o1(int, int):void");
    }

    private char[] p1() {
        return this.q0 ? C0 : D0;
    }

    private void q1(String str) throws IOException {
        int i = this.y0;
        int i2 = this.x0;
        int i3 = i - i2;
        str.getChars(0, i3, this.v0, i2);
        this.x0 += i3;
        a1();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.y0;
            if (length <= i4) {
                str.getChars(i3, i3 + length, this.v0, 0);
                this.w0 = 0;
                this.x0 = length;
                return;
            } else {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.v0, 0);
                this.w0 = 0;
                this.x0 = i4;
                a1();
                length -= i4;
                i3 = i5;
            }
        }
    }

    @Override // ax.T4.g
    public void A(char c) throws IOException {
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = c;
    }

    @Override // ax.T4.g
    public void F(p pVar) throws IOException {
        int a = pVar.a(this.v0, this.x0);
        if (a < 0) {
            H(pVar.getValue());
        } else {
            this.x0 += a;
        }
    }

    @Override // ax.T4.g
    public void H(String str) throws IOException {
        int length = str.length();
        int i = this.y0 - this.x0;
        if (i == 0) {
            a1();
            i = this.y0 - this.x0;
        }
        if (i < length) {
            q1(str);
        } else {
            str.getChars(0, length, this.v0, this.x0);
            this.x0 += length;
        }
    }

    @Override // ax.T4.g
    public void L(char[] cArr, int i, int i2) throws IOException {
        A0(cArr, i, i2);
        if (i2 >= 32) {
            a1();
            this.t0.write(cArr, i, i2);
        } else {
            if (i2 > this.y0 - this.x0) {
                a1();
            }
            System.arraycopy(cArr, i, this.v0, this.x0, i2);
            this.x0 += i2;
        }
    }

    @Override // ax.T4.g
    public void W() throws IOException {
        e1("start an array");
        this.i0 = this.i0.k();
        o oVar = this.q;
        if (oVar != null) {
            oVar.f(this);
            return;
        }
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = '[';
    }

    protected void a1() throws IOException {
        int i = this.x0;
        int i2 = this.w0;
        int i3 = i - i2;
        if (i3 > 0) {
            this.w0 = 0;
            this.x0 = 0;
            this.t0.write(this.v0, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // ax.U4.a, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            super.close()
            char[] r0 = r2.v0     // Catch: java.io.IOException -> L1d
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
            r2.a1()     // Catch: java.io.IOException -> L1d
            r0 = 0
        L2d:
            r1 = 0
            r2.w0 = r1
            r2.x0 = r1
            java.io.Writer r1 = r2.t0
            if (r1 == 0) goto L65
            ax.W4.e r1 = r2.l0     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r1.l()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 != 0) goto L59
            ax.T4.g$a r1 = ax.T4.g.a.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r2.L0(r1)     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 == 0) goto L47
            goto L59
        L47:
            ax.T4.g$a r1 = ax.T4.g.a.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r2.L0(r1)     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 == 0) goto L65
            java.io.Writer r1 = r2.t0     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            r1.flush()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            goto L65
        L55:
            r1 = move-exception
            goto L5f
        L57:
            r1 = move-exception
            goto L5f
        L59:
            java.io.Writer r1 = r2.t0     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            r1.close()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            goto L65
        L5f:
            if (r0 == 0) goto L64
            r1.addSuppressed(r0)
        L64:
            throw r1
        L65:
            r2.d1()
            if (r0 != 0) goto L6b
            return
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.j.close():void");
    }

    protected void d1() {
        char[] cArr = this.v0;
        if (cArr != null) {
            this.v0 = null;
            this.l0.m(cArr);
        }
        char[] cArr2 = this.B0;
        if (cArr2 != null) {
            this.B0 = null;
            this.l0.n(cArr2);
        }
    }

    protected final void e1(String str) throws IOException {
        char c;
        int p = this.i0.p();
        if (this.q != null) {
            T0(str, p);
            return;
        }
        if (p == 1) {
            c = ',';
        } else {
            if (p != 2) {
                if (p != 3) {
                    if (p != 5) {
                        return;
                    }
                    M0(str);
                    return;
                } else {
                    p pVar = this.o0;
                    if (pVar != null) {
                        H(pVar.getValue());
                        return;
                    }
                    return;
                }
            }
            c = ':';
        }
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = c;
    }

    protected final void f1(String str, boolean z) throws IOException {
        if (this.q != null) {
            i1(str, z);
            return;
        }
        if (this.x0 + 1 >= this.y0) {
            a1();
        }
        if (z) {
            char[] cArr = this.v0;
            int i = this.x0;
            this.x0 = i + 1;
            cArr[i] = ',';
        }
        if (this.p0) {
            m1(str);
            return;
        }
        char[] cArr2 = this.v0;
        int i2 = this.x0;
        this.x0 = i2 + 1;
        cArr2[i2] = this.u0;
        m1(str);
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr3 = this.v0;
        int i3 = this.x0;
        this.x0 = i3 + 1;
        cArr3[i3] = this.u0;
    }

    @Override // ax.T4.g, java.io.Flushable
    public void flush() throws IOException {
        a1();
        if (this.t0 == null || !L0(g.a.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.t0.flush();
    }

    @Override // ax.T4.g
    public void g(boolean z) throws IOException {
        int i;
        e1("write a boolean value");
        if (this.x0 + 5 >= this.y0) {
            a1();
        }
        int i2 = this.x0;
        char[] cArr = this.v0;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.x0 = i + 1;
    }

    protected final void i1(String str, boolean z) throws IOException {
        if (z) {
            this.q.h(this);
        } else {
            this.q.a(this);
        }
        if (this.p0) {
            m1(str);
            return;
        }
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = this.u0;
        m1(str);
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr2 = this.v0;
        int i2 = this.x0;
        this.x0 = i2 + 1;
        cArr2[i2] = this.u0;
    }

    @Override // ax.T4.g
    public void j() throws IOException {
        if (!this.i0.e()) {
            a("Current context not Array but " + this.i0.h());
        }
        o oVar = this.q;
        if (oVar != null) {
            oVar.b(this, this.i0.c());
        } else {
            if (this.x0 >= this.y0) {
                a1();
            }
            char[] cArr = this.v0;
            int i = this.x0;
            this.x0 = i + 1;
            cArr[i] = ']';
        }
        this.i0 = this.i0.j();
    }

    @Override // ax.T4.g
    public void m() throws IOException {
        if (!this.i0.f()) {
            a("Current context not Object but " + this.i0.h());
        }
        o oVar = this.q;
        if (oVar != null) {
            oVar.c(this, this.i0.c());
        } else {
            if (this.x0 >= this.y0) {
                a1();
            }
            char[] cArr = this.v0;
            int i = this.x0;
            this.x0 = i + 1;
            cArr[i] = '}';
        }
        this.i0 = this.i0.j();
    }

    @Override // ax.T4.g
    public void o(String str) throws IOException {
        int o = this.i0.o(str);
        if (o == 4) {
            a("Can not write a field name, expecting a value");
        }
        f1(str, o == 1);
    }

    @Override // ax.T4.g
    public void o0() throws IOException {
        e1("start an object");
        this.i0 = this.i0.l();
        o oVar = this.q;
        if (oVar != null) {
            oVar.g(this);
            return;
        }
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = '{';
    }

    @Override // ax.T4.g
    public void p() throws IOException {
        e1("write a null");
        h1();
    }

    @Override // ax.T4.g
    public void q(double d) throws IOException {
        if (this.h0 || (k.o(d) && L0(g.a.QUOTE_NON_NUMERIC_NUMBERS))) {
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
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = this.u0;
        m1(str);
        if (this.x0 >= this.y0) {
            a1();
        }
        char[] cArr2 = this.v0;
        int i2 = this.x0;
        this.x0 = i2 + 1;
        cArr2[i2] = this.u0;
    }

    @Override // ax.T4.g
    public void u(long j) throws IOException {
        e1("write a number");
        if (this.h0) {
            j1(j);
            return;
        }
        if (this.x0 + 21 >= this.y0) {
            a1();
        }
        this.x0 = k.s(j, this.v0, this.x0);
    }
}
