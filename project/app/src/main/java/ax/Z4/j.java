/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.l;
import ax.T4.n;
import ax.T4.p;
import ax.W4.e;
import ax.W4.k;
import ax.Z4.c;
import java.io.IOException;
import java.io.Writer;

public class j
extends c {
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

    public j(e object, int n8, n n9, Writer writer, char c8) {
        super((e)object, n8, n9);
        this.t0 = writer;
        object = ((e)object).d();
        this.v0 = (char[])object;
        this.y0 = ((Object)object).length;
        this.u0 = c8;
        if (c8 != '\"') {
            this.m0 = ax.W4.c.f(c8);
        }
    }

    private char[] Z0() {
        char[] cArray = new char[14];
        cArray[0] = 92;
        cArray[2] = 92;
        cArray[3] = 117;
        cArray[4] = 48;
        cArray[5] = 48;
        cArray[8] = 92;
        cArray[9] = 117;
        this.z0 = cArray;
        return cArray;
    }

    private int b1(char[] cArray, int n8, int n9, char c8, int n10) throws IOException, f {
        if (n10 >= 0) {
            if (n8 > 1 && n8 < n9) {
                n9 = n8 - 2;
                cArray[n9] = 92;
                cArray[n8 - 1] = (char)n10;
                return n9;
            }
            char[] cArray2 = this.z0;
            cArray = cArray2;
            if (cArray2 == null) {
                cArray = this.Z0();
            }
            cArray[1] = (char)n10;
            this.t0.write(cArray, 0, 2);
            return n8;
        }
        if (n10 != -2) {
            char[] cArray3 = this.p1();
            if (n8 > 5 && n8 < n9) {
                cArray[n8 - 6] = 92;
                n9 = n8 - 4;
                cArray[n8 - 5] = 117;
                if (c8 > '\u00ff') {
                    n10 = c8 >> 8;
                    cArray[n9] = cArray3[(n10 & 0xFF) >> 4];
                    n9 = n8 - 2;
                    cArray[n8 - 3] = cArray3[n10 & 0xF];
                    c8 = (char)(c8 & 0xFF);
                    n8 = n9;
                } else {
                    cArray[n9] = 48;
                    n9 = n8 - 2;
                    cArray[n8 - 3] = 48;
                    n8 = n9;
                }
                cArray[n8] = cArray3[c8 >> 4];
                cArray[n8 + 1] = cArray3[c8 & 0xF];
                return n8 - 4;
            }
            char[] cArray4 = this.z0;
            cArray = cArray4;
            if (cArray4 == null) {
                cArray = this.Z0();
            }
            this.w0 = this.x0;
            if (c8 > '\u00ff') {
                n9 = c8 >> 8;
                cArray[10] = cArray3[(n9 & 0xFF) >> 4];
                cArray[11] = cArray3[n9 & 0xF];
                cArray[12] = cArray3[(c8 & 0xFF) >> 4];
                cArray[13] = cArray3[c8 & 0xF];
                this.t0.write(cArray, 8, 6);
                return n8;
            }
            cArray[6] = cArray3[c8 >> 4];
            cArray[7] = cArray3[c8 & 0xF];
            this.t0.write(cArray, 2, 6);
            return n8;
        }
        this.A0.getClass();
        String string = this.A0.getValue();
        this.A0 = null;
        c8 = (char)string.length();
        if (n8 >= c8 && n8 < n9) {
            string.getChars(0, c8, cArray, n8 -= c8);
            return n8;
        }
        this.t0.write(string);
        return n8;
    }

    private void c1(char c8, int n8) throws IOException, f {
        if (n8 >= 0) {
            char[] cArray;
            c8 = (char)this.x0;
            if (c8 >= '\u0002') {
                int n9;
                this.w0 = n9 = c8 - 2;
                char[] cArray2 = this.v0;
                cArray2[n9] = 92;
                cArray2[c8 - '\u0001'] = (char)n8;
                return;
            }
            char[] cArray3 = cArray = this.z0;
            if (cArray == null) {
                cArray3 = this.Z0();
            }
            this.w0 = this.x0;
            cArray3[1] = (char)n8;
            this.t0.write(cArray3, 0, 2);
            return;
        }
        if (n8 != -2) {
            char[] cArray;
            char[] cArray4 = this.p1();
            n8 = this.x0;
            if (n8 >= 6) {
                int n10;
                char[] cArray5 = this.v0;
                this.w0 = n10 = n8 - 6;
                cArray5[n10] = 92;
                cArray5[n8 - 5] = 117;
                if (c8 > '\u00ff') {
                    n10 = c8 >> 8;
                    cArray5[n8 - 4] = cArray4[(n10 & 0xFF) >> 4];
                    cArray5[n8 -= 3] = cArray4[n10 & 0xF];
                    c8 = (char)(c8 & 0xFF);
                } else {
                    cArray5[n8 - 4] = 48;
                    cArray5[n8 -= 3] = 48;
                }
                cArray5[n8 + 1] = cArray4[c8 >> 4];
                cArray5[n8 + 2] = cArray4[c8 & 0xF];
                return;
            }
            char[] cArray6 = cArray = this.z0;
            if (cArray == null) {
                cArray6 = this.Z0();
            }
            this.w0 = this.x0;
            if (c8 > '\u00ff') {
                n8 = c8 >> 8;
                cArray6[10] = cArray4[(n8 & 0xFF) >> 4];
                cArray6[11] = cArray4[n8 & 0xF];
                cArray6[12] = cArray4[(c8 & 0xFF) >> 4];
                cArray6[13] = cArray4[c8 & 0xF];
                this.t0.write(cArray6, 8, 6);
                return;
            }
            cArray6[6] = cArray4[c8 >> 4];
            cArray6[7] = cArray4[c8 & 0xF];
            this.t0.write(cArray6, 2, 6);
            return;
        }
        this.A0.getClass();
        String string = this.A0.getValue();
        this.A0 = null;
        c8 = (char)string.length();
        n8 = this.x0;
        if (n8 >= c8) {
            this.w0 = n8 -= c8;
            string.getChars(0, c8, this.v0, n8);
            return;
        }
        this.w0 = n8;
        this.t0.write(string);
    }

    private void g1(String string) throws IOException {
        this.a1();
        int n8 = string.length();
        int n9 = 0;
        while (true) {
            int n10;
            int n11 = n10 = this.y0;
            if (n9 + n10 > n8) {
                n11 = n8 - n9;
            }
            n10 = n9 + n11;
            string.getChars(n9, n10, this.v0, 0);
            n9 = this.n0;
            if (n9 != 0) {
                this.l1(n11, n9);
            } else {
                this.k1(n11);
            }
            if (n10 >= n8) {
                return;
            }
            n9 = n10;
        }
    }

    private final void h1() throws IOException {
        if (this.x0 + 4 >= this.y0) {
            this.a1();
        }
        int n8 = this.x0;
        char[] cArray = this.v0;
        cArray[n8] = 110;
        cArray[n8 + 1] = 117;
        cArray[n8 + 2] = 108;
        cArray[n8 + 3] = 108;
        this.x0 = n8 + 4;
    }

    private void j1(long l8) throws IOException {
        int n8;
        if (this.x0 + 23 >= this.y0) {
            this.a1();
        }
        char[] cArray = this.v0;
        int n9 = this.x0;
        this.x0 = n8 = n9 + 1;
        cArray[n9] = this.u0;
        n9 = k.s(l8, cArray, n8);
        cArray = this.v0;
        this.x0 = n9 + 1;
        cArray[n9] = this.u0;
    }

    private void k1(int n8) throws IOException {
        int[] nArray = this.m0;
        int n9 = nArray.length;
        int n10 = 0;
        int n11 = 0;
        while (n10 < n8) {
            int n12;
            char[] cArray;
            char c8;
            while ((c8 = (cArray = this.v0)[n10]) >= n9 || nArray[c8] == 0) {
                n10 = n12 = n10 + 1;
                if (n12 < n8) continue;
                n10 = n12;
                break;
            }
            n12 = n10 - n11;
            if (n12 > 0) {
                this.t0.write(cArray, n11, n12);
                if (n10 >= n8) break;
            }
            n11 = this.b1(this.v0, ++n10, n8, c8, nArray[c8]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l1(int n8, int n9) throws IOException, f {
        int[] nArray = this.m0;
        int n10 = Math.min(nArray.length, n9 + 1);
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        while (n11 < n8) {
            char[] cArray;
            char c8;
            int n14;
            block9: {
                block8: {
                    int n15;
                    n14 = n13;
                    do {
                        if ((c8 = (cArray = this.v0)[n11]) < n10) {
                            n13 = n14 = nArray[c8];
                            if (n14 != 0) {
                                n13 = n14;
                                break block8;
                            }
                        } else {
                            n13 = n14;
                            if (c8 > n9) {
                                n14 = -1;
                                n13 = n11;
                                n11 = n14;
                                break block9;
                            }
                        }
                        n11 = n15 = n11 + 1;
                        n14 = n13;
                    } while (n15 < n8);
                    n11 = n15;
                }
                n14 = n13;
                n13 = n11;
                n11 = n14;
            }
            n14 = n13 - n12;
            if (n14 > 0) {
                this.t0.write(cArray, n12, n14);
                if (n13 >= n8) {
                    return;
                }
            }
            n12 = n13 + 1;
            n14 = this.b1(this.v0, n12, n8, c8, n11);
            n13 = n11;
            n11 = n12;
            n12 = n14;
        }
    }

    private void m1(String string) throws IOException {
        int n8;
        int n9 = string.length();
        if (n9 > (n8 = this.y0)) {
            this.g1(string);
            return;
        }
        if (this.x0 + n9 > n8) {
            this.a1();
        }
        string.getChars(0, n9, this.v0, this.x0);
        n8 = this.n0;
        if (n8 != 0) {
            this.o1(n9, n8);
            return;
        }
        this.n1(n9);
    }

    private void n1(int n8) throws IOException {
        int n9 = this.x0 + n8;
        int[] nArray = this.m0;
        n8 = nArray.length;
        block0: while (this.x0 < n9) {
            int n10;
            do {
                char[] cArray;
                int n11;
                if ((n11 = (cArray = this.v0)[n10 = this.x0]) < n8 && nArray[n11] != 0) {
                    n11 = this.w0;
                    if ((n10 -= n11) > 0) {
                        this.t0.write(cArray, n11, n10);
                    }
                    cArray = this.v0;
                    n10 = this.x0;
                    this.x0 = n10 + 1;
                    char c8 = cArray[n10];
                    this.c1(c8, nArray[c8]);
                    continue block0;
                }
                this.x0 = ++n10;
            } while (n10 < n9);
        }
    }

    private void o1(int n8, int n9) throws IOException, f {
        int n10 = this.x0 + n8;
        int[] nArray = this.m0;
        int n11 = Math.min(nArray.length, n9 + 1);
        block0: while (this.x0 < n10) {
            do {
                int n12;
                block7: {
                    char[] cArray;
                    char c8;
                    block8: {
                        block6: {
                            if ((c8 = (cArray = this.v0)[n12 = this.x0]) >= n11) break block6;
                            n8 = nArray[c8];
                            if (n8 == 0) break block7;
                            break block8;
                        }
                        if (c8 <= n9) break block7;
                        n8 = -1;
                    }
                    int n13 = this.w0;
                    if ((n12 -= n13) > 0) {
                        this.t0.write(cArray, n13, n12);
                    }
                    ++this.x0;
                    this.c1(c8, n8);
                    continue block0;
                }
                this.x0 = n8 = n12 + 1;
            } while (n8 < n10);
        }
    }

    private char[] p1() {
        if (this.q0) {
            return C0;
        }
        return D0;
    }

    private void q1(String string) throws IOException {
        int n8;
        int n9 = this.y0;
        int n10 = this.x0;
        string.getChars(0, n9 -= n10, this.v0, n10);
        this.x0 += n9;
        this.a1();
        for (n10 = string.length() - n9; n10 > (n8 = this.y0); n10 -= n8) {
            int n11 = n9 + n8;
            string.getChars(n9, n11, this.v0, 0);
            this.w0 = 0;
            this.x0 = n8;
            this.a1();
            n9 = n11;
        }
        string.getChars(n9, n9 + n10, this.v0, 0);
        this.w0 = 0;
        this.x0 = n10;
    }

    @Override
    public void A(char c8) throws IOException {
        if (this.x0 >= this.y0) {
            this.a1();
        }
        char[] cArray = this.v0;
        int n8 = this.x0;
        this.x0 = n8 + 1;
        cArray[n8] = c8;
    }

    @Override
    public void F(p p8) throws IOException {
        int n8 = p8.a(this.v0, this.x0);
        if (n8 < 0) {
            this.H(p8.getValue());
            return;
        }
        this.x0 += n8;
    }

    @Override
    public void H(String string) throws IOException {
        int n8;
        int n9 = string.length();
        int n10 = n8 = this.y0 - this.x0;
        if (n8 == 0) {
            this.a1();
            n10 = this.y0 - this.x0;
        }
        if (n10 >= n9) {
            string.getChars(0, n9, this.v0, this.x0);
            this.x0 += n9;
            return;
        }
        this.q1(string);
    }

    @Override
    public void L(char[] cArray, int n8, int n9) throws IOException {
        this.A0(cArray, n8, n9);
        if (n9 < 32) {
            if (n9 > this.y0 - this.x0) {
                this.a1();
            }
            System.arraycopy(cArray, n8, this.v0, this.x0, n9);
            this.x0 += n9;
            return;
        }
        this.a1();
        this.t0.write(cArray, n8, n9);
    }

    @Override
    public void W() throws IOException {
        this.e1("start an array");
        this.i0 = this.i0.k();
        Object object = this.q;
        if (object != null) {
            object.f(this);
            return;
        }
        if (this.x0 >= this.y0) {
            this.a1();
        }
        object = this.v0;
        int n8 = this.x0;
        this.x0 = n8 + 1;
        object[n8] = 91;
    }

    protected void a1() throws IOException {
        int n8 = this.x0;
        int n9 = this.w0;
        if ((n8 -= n9) > 0) {
            this.w0 = 0;
            this.x0 = 0;
            this.t0.write(this.v0, n9, n8);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        l l8;
        block14: {
            block12: {
                block11: {
                    super.close();
                    try {
                        if (this.v0 == null || !this.L0(g.a.e0)) break block11;
                    }
                    catch (IOException iOException) {
                        break block12;
                    }
                    while (true) {
                        if ((l8 = this.G0()).e()) {
                            this.j();
                            continue;
                        }
                        if (!l8.f()) break;
                        this.m();
                    }
                }
                this.a1();
                l8 = null;
            }
            this.w0 = 0;
            this.x0 = 0;
            if (this.t0 != null) {
                RuntimeException var2_5;
                block15: {
                    block13: {
                        try {
                            if (this.l0.l() || this.L0(g.a.d0)) break block13;
                            if (this.L0(g.a.f0)) {
                                this.t0.flush();
                            }
                            break block14;
                        }
                        catch (RuntimeException runtimeException) {
                            break block15;
                        }
                        catch (IOException iOException) {
                            break block15;
                        }
                    }
                    this.t0.close();
                    break block14;
                }
                if (l8 != null) {
                    var2_5.addSuppressed((Throwable)((Object)l8));
                }
                throw var2_5;
            }
        }
        this.d1();
        if (l8 == null) {
            return;
        }
        throw l8;
    }

    protected void d1() {
        char[] cArray = this.v0;
        if (cArray != null) {
            this.v0 = null;
            this.l0.m(cArray);
        }
        if ((cArray = this.B0) != null) {
            this.B0 = null;
            this.l0.n(cArray);
        }
    }

    protected final void e1(String object) throws IOException {
        int n8;
        int n9 = this.i0.p();
        if (this.q != null) {
            this.T0((String)object, n9);
            return;
        }
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 != 3) {
                    if (n9 == 5) {
                        this.M0((String)object);
                        return;
                    }
                } else {
                    object = this.o0;
                    if (object != null) {
                        this.H(object.getValue());
                    }
                }
                return;
            }
            n8 = 58;
        } else {
            n8 = 44;
        }
        if (this.x0 >= this.y0) {
            this.a1();
        }
        object = this.v0;
        n9 = this.x0;
        this.x0 = n9 + 1;
        object[n9] = n8;
    }

    protected final void f1(String object, boolean bl) throws IOException {
        int n8;
        char[] cArray;
        if (this.q != null) {
            this.i1((String)object, bl);
            return;
        }
        if (this.x0 + 1 >= this.y0) {
            this.a1();
        }
        if (bl) {
            cArray = this.v0;
            n8 = this.x0;
            this.x0 = n8 + 1;
            cArray[n8] = 44;
        }
        if (this.p0) {
            this.m1((String)object);
            return;
        }
        cArray = this.v0;
        n8 = this.x0;
        this.x0 = n8 + 1;
        cArray[n8] = this.u0;
        this.m1((String)object);
        if (this.x0 >= this.y0) {
            this.a1();
        }
        object = this.v0;
        n8 = this.x0;
        this.x0 = n8 + 1;
        object[n8] = this.u0;
    }

    @Override
    public void flush() throws IOException {
        this.a1();
        if (this.t0 != null && this.L0(g.a.f0)) {
            this.t0.flush();
        }
    }

    @Override
    public void g(boolean bl) throws IOException {
        this.e1("write a boolean value");
        if (this.x0 + 5 >= this.y0) {
            this.a1();
        }
        int n8 = this.x0;
        char[] cArray = this.v0;
        if (bl) {
            cArray[n8] = 116;
            cArray[n8 + 1] = 114;
            cArray[n8 + 2] = 117;
            cArray[n8 += 3] = 101;
        } else {
            cArray[n8] = 102;
            cArray[n8 + 1] = 97;
            cArray[n8 + 2] = 108;
            cArray[n8 + 3] = 115;
            cArray[n8 += 4] = 101;
        }
        this.x0 = n8 + 1;
    }

    protected final void i1(String object, boolean bl) throws IOException {
        if (bl) {
            this.q.h(this);
        } else {
            this.q.a(this);
        }
        if (this.p0) {
            this.m1((String)object);
            return;
        }
        if (this.x0 >= this.y0) {
            this.a1();
        }
        char[] cArray = this.v0;
        int n8 = this.x0;
        this.x0 = n8 + 1;
        cArray[n8] = this.u0;
        this.m1((String)object);
        if (this.x0 >= this.y0) {
            this.a1();
        }
        object = this.v0;
        n8 = this.x0;
        this.x0 = n8 + 1;
        object[n8] = this.u0;
    }

    @Override
    public void j() throws IOException {
        Object object;
        if (!this.i0.e()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Current context not Array but ");
            ((StringBuilder)object).append(this.i0.h());
            this.a(((StringBuilder)object).toString());
        }
        if ((object = this.q) != null) {
            object.b(this, this.i0.c());
        } else {
            if (this.x0 >= this.y0) {
                this.a1();
            }
            object = this.v0;
            int n8 = this.x0;
            this.x0 = n8 + 1;
            object[n8] = 93;
        }
        this.i0 = this.i0.j();
    }

    @Override
    public void m() throws IOException {
        Object object;
        if (!this.i0.f()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Current context not Object but ");
            ((StringBuilder)object).append(this.i0.h());
            this.a(((StringBuilder)object).toString());
        }
        if ((object = this.q) != null) {
            object.c(this, this.i0.c());
        } else {
            if (this.x0 >= this.y0) {
                this.a1();
            }
            object = this.v0;
            int n8 = this.x0;
            this.x0 = n8 + 1;
            object[n8] = 125;
        }
        this.i0 = this.i0.j();
    }

    @Override
    public void o(String string) throws IOException {
        int n8 = this.i0.o(string);
        if (n8 == 4) {
            this.a("Can not write a field name, expecting a value");
        }
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        this.f1(string, bl);
    }

    @Override
    public void o0() throws IOException {
        this.e1("start an object");
        this.i0 = this.i0.l();
        Object object = this.q;
        if (object != null) {
            object.g(this);
            return;
        }
        if (this.x0 >= this.y0) {
            this.a1();
        }
        object = this.v0;
        int n8 = this.x0;
        this.x0 = n8 + 1;
        object[n8] = 123;
    }

    @Override
    public void p() throws IOException {
        this.e1("write a null");
        this.h1();
    }

    @Override
    public void q(double d8) throws IOException {
        if (!(this.h0 || k.o(d8) && this.L0(g.a.h0))) {
            this.e1("write a number");
            this.H(k.t(d8, this.L0(g.a.n0)));
            return;
        }
        this.s0(k.t(d8, this.L0(g.a.n0)));
    }

    @Override
    public void s0(String object) throws IOException {
        this.e1("write a string");
        if (object == null) {
            this.h1();
            return;
        }
        if (this.x0 >= this.y0) {
            this.a1();
        }
        char[] cArray = this.v0;
        int n8 = this.x0;
        this.x0 = n8 + 1;
        cArray[n8] = this.u0;
        this.m1((String)object);
        if (this.x0 >= this.y0) {
            this.a1();
        }
        object = this.v0;
        n8 = this.x0;
        this.x0 = n8 + 1;
        object[n8] = this.u0;
    }

    @Override
    public void u(long l8) throws IOException {
        this.e1("write a number");
        if (this.h0) {
            this.j1(l8);
            return;
        }
        if (this.x0 + 21 >= this.y0) {
            this.a1();
        }
        this.x0 = k.s(l8, this.v0, this.x0);
    }
}

