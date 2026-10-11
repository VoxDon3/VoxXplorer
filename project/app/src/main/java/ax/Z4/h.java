/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.g;
import ax.T4.l;
import ax.T4.n;
import ax.T4.p;
import ax.W4.e;
import ax.W4.k;
import ax.Z4.c;
import java.io.IOException;
import java.io.OutputStream;

public class h
extends c {
    private static final byte[] C0 = ax.W4.c.c(true);
    private static final byte[] D0 = ax.W4.c.c(false);
    private static final byte[] E0 = new byte[]{110, 117, 108, 108};
    private static final byte[] F0 = new byte[]{116, 114, 117, 101};
    private static final byte[] G0 = new byte[]{102, 97, 108, 115, 101};
    protected final int A0;
    protected boolean B0;
    protected final OutputStream t0;
    protected byte u0;
    protected byte[] v0;
    protected int w0;
    protected final int x0;
    protected final int y0;
    protected char[] z0;

    public h(e object, int n8, n object2, OutputStream outputStream, char c8) {
        super((e)object, n8, (n)object2);
        this.t0 = outputStream;
        this.u0 = (byte)c8;
        if (c8 != '\"') {
            this.m0 = ax.W4.c.f(c8);
        }
        this.B0 = true;
        object2 = ((e)object).h();
        this.v0 = (byte[])object2;
        this.x0 = n8 = ((Object)object2).length;
        this.y0 = n8 >> 3;
        object = ((e)object).d();
        this.z0 = (char[])object;
        this.A0 = ((Object)object).length;
        if (this.L0(g.a.i0)) {
            this.d(127);
        }
    }

    private final int a1(int n8, int n9) throws IOException {
        byte[] byArray = this.v1();
        byte[] byArray2 = this.v0;
        if (n8 >= 55296 && n8 <= 57343) {
            byArray2[n9] = 92;
            byArray2[n9 + 1] = 117;
            byArray2[n9 + 2] = byArray[n8 >> 12 & 0xF];
            byArray2[n9 + 3] = byArray[n8 >> 8 & 0xF];
            byArray2[n9 + 4] = byArray[n8 >> 4 & 0xF];
            byArray2[n9 + 5] = byArray[n8 & 0xF];
            return n9 + 6;
        }
        byArray2[n9] = (byte)(n8 >> 12 | 0xE0);
        byArray2[n9 + 1] = (byte)(n8 >> 6 & 0x3F | 0x80);
        byArray2[n9 + 2] = (byte)(n8 & 0x3F | 0x80);
        return n9 + 3;
    }

    private final int b1(int n8, char[] objectArray, int n9, int n10) throws IOException {
        int n11;
        if (n8 >= 55296 && n8 <= 57343) {
            if (n9 < n10 && objectArray != null) {
                this.c1(n8, objectArray[n9]);
            } else {
                this.a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", n8));
            }
            return n9 + 1;
        }
        objectArray = this.v0;
        int n12 = this.w0;
        this.w0 = n11 = 1 + n12;
        objectArray[n12] = (char)(n8 >> 12 | 0xE0);
        this.w0 = n10 = n12 + 2;
        objectArray[n11] = (char)(n8 >> 6 & 0x3F | 0x80);
        this.w0 = n12 + 3;
        objectArray[n10] = (char)(n8 & 0x3F | 0x80);
        return n9;
    }

    private final void f1(byte[] byArray) throws IOException {
        int n8 = byArray.length;
        if (this.w0 + n8 > this.x0) {
            this.Z0();
            if (n8 > 512) {
                this.t0.write(byArray, 0, n8);
                return;
            }
        }
        System.arraycopy(byArray, 0, this.v0, this.w0, n8);
        this.w0 += n8;
    }

    private int g1(int n8, int n9) throws IOException {
        byte[] byArray = this.v0;
        byte[] byArray2 = this.v1();
        byArray[n9] = 92;
        int n10 = n9 + 2;
        byArray[n9 + 1] = 117;
        if (n8 > 255) {
            int n11 = n8 >> 8;
            byArray[n10] = byArray2[(n11 & 0xFF) >> 4];
            n10 = n9 + 4;
            byArray[n9 + 3] = byArray2[n11 & 0xF];
            n8 &= 0xFF;
            n9 = n10;
        } else {
            byArray[n10] = 48;
            n10 = n9 + 4;
            byArray[n9 + 3] = 48;
            n9 = n10;
        }
        byArray[n9] = byArray2[n8 >> 4];
        byArray[n9 + 1] = byArray2[n8 & 0xF];
        return n9 + 2;
    }

    private final void h1() throws IOException {
        if (this.w0 + 4 >= this.x0) {
            this.Z0();
        }
        System.arraycopy(E0, 0, this.v0, this.w0, 4);
        this.w0 += 4;
    }

    private final void j1(long l8) throws IOException {
        int n8;
        if (this.w0 + 23 >= this.x0) {
            this.Z0();
        }
        byte[] byArray = this.v0;
        int n9 = this.w0;
        this.w0 = n8 = n9 + 1;
        byArray[n9] = this.u0;
        n9 = k.r(l8, byArray, n8);
        byArray = this.v0;
        this.w0 = n9 + 1;
        byArray[n9] = this.u0;
    }

    private void k1(char[] cArray, int n8, int n9) throws IOException {
        block0: while (n8 < n9) {
            int n10;
            do {
                int n11;
                byte[] byArray;
                if ((n10 = cArray[n8]) > 127) {
                    ++n8;
                    if (n10 < 2048) {
                        int n12;
                        byArray = this.v0;
                        n11 = this.w0;
                        this.w0 = n12 = n11 + 1;
                        byArray[n11] = (byte)(n10 >> 6 | 0xC0);
                        this.w0 = n11 + 2;
                        byArray[n12] = (byte)(n10 & 0x3F | 0x80);
                        continue block0;
                    }
                    n8 = this.b1(n10, cArray, n8, n9);
                    continue block0;
                }
                byArray = this.v0;
                n11 = this.w0;
                this.w0 = n11 + 1;
                byArray[n11] = (byte)n10;
                n8 = n10 = n8 + 1;
            } while (n10 < n9);
        }
    }

    private final void l1(char[] cArray, int n8, int n9) throws IOException {
        int n10 = this.x0;
        byte[] byArray = this.v0;
        int n11 = n9 + n8;
        block0: while (n8 < n11) {
            do {
                char c8;
                if ((c8 = cArray[n8]) >= '\u0080') {
                    if (this.w0 + 3 >= this.x0) {
                        this.Z0();
                    }
                    n9 = n8 + 1;
                    c8 = cArray[n8];
                    if (c8 < '\u0800') {
                        int n12 = this.w0;
                        this.w0 = n8 = n12 + 1;
                        byArray[n12] = (byte)(c8 >> 6 | 0xC0);
                        this.w0 = n12 + 2;
                        byArray[n8] = (byte)(c8 & 0x3F | 0x80);
                        n8 = n9;
                        continue block0;
                    }
                    n8 = this.b1(c8, cArray, n9, n11);
                    continue block0;
                }
                if (this.w0 >= n10) {
                    this.Z0();
                }
                n9 = this.w0;
                this.w0 = n9 + 1;
                byArray[n9] = (byte)c8;
                n8 = n9 = n8 + 1;
            } while (n9 < n11);
        }
    }

    private final void m1(String string, int n8, int n9) throws IOException {
        int n10 = n9 + n8;
        int n11 = this.w0;
        byte[] byArray = this.v0;
        int[] nArray = this.m0;
        n9 = n8;
        n8 = n11;
        while (n9 < n10 && (n11 = (int)string.charAt(n9)) <= 127 && nArray[n11] == 0) {
            byArray[n8] = (byte)n11;
            ++n9;
            ++n8;
        }
        this.w0 = n8;
        if (n9 < n10) {
            if (this.n0 == 0) {
                this.o1(string, n9, n10);
                return;
            }
            this.q1(string, n9, n10);
        }
    }

    private final void n1(char[] cArray, int n8, int n9) throws IOException {
        int n10 = n9 + n8;
        int n11 = this.w0;
        byte[] byArray = this.v0;
        int[] nArray = this.m0;
        n9 = n8;
        n8 = n11;
        while (n9 < n10 && (n11 = cArray[n9]) <= 127 && nArray[n11] == 0) {
            byArray[n8] = (byte)n11;
            ++n9;
            ++n8;
        }
        this.w0 = n8;
        if (n9 < n10) {
            if (this.n0 == 0) {
                this.p1(cArray, n9, n10);
                return;
            }
            this.r1(cArray, n9, n10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void o1(String string, int n8, int n9) throws IOException {
        if (this.w0 + (n9 - n8) * 6 > this.x0) {
            this.Z0();
        }
        int n10 = this.w0;
        byte[] byArray = this.v0;
        int[] nArray = this.m0;
        int n11 = n8;
        n8 = n10;
        while (true) {
            if (n11 >= n9) {
                this.w0 = n8;
                return;
            }
            n10 = n11 + 1;
            char c8 = string.charAt(n11);
            if (c8 <= '\u007f') {
                int n12 = nArray[c8];
                if (n12 == 0) {
                    byArray[n8] = (byte)c8;
                    n11 = n10;
                    ++n8;
                    continue;
                }
                if (n12 > 0) {
                    byArray[n8] = 92;
                    n11 = n8 + 2;
                    byArray[n8 + 1] = (byte)n12;
                    n8 = n11;
                } else {
                    n8 = this.g1(c8, n8);
                }
            } else if (c8 <= '\u07ff') {
                byArray[n8] = (byte)(c8 >> 6 | 0xC0);
                n11 = n8 + 2;
                byArray[n8 + 1] = (byte)(c8 & 0x3F | 0x80);
                n8 = n11;
            } else {
                n8 = this.a1(c8, n8);
            }
            n11 = n10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void p1(char[] cArray, int n8, int n9) throws IOException {
        if (this.w0 + (n9 - n8) * 6 > this.x0) {
            this.Z0();
        }
        int n10 = this.w0;
        byte[] byArray = this.v0;
        int[] nArray = this.m0;
        int n11 = n8;
        n8 = n10;
        while (true) {
            if (n11 >= n9) {
                this.w0 = n8;
                return;
            }
            n10 = n11 + 1;
            char c8 = cArray[n11];
            if (c8 <= '\u007f') {
                int n12 = nArray[c8];
                if (n12 == 0) {
                    byArray[n8] = (byte)c8;
                    n11 = n10;
                    ++n8;
                    continue;
                }
                if (n12 > 0) {
                    byArray[n8] = 92;
                    n11 = n8 + 2;
                    byArray[n8 + 1] = (byte)n12;
                    n8 = n11;
                } else {
                    n8 = this.g1(c8, n8);
                }
            } else if (c8 <= '\u07ff') {
                byArray[n8] = (byte)(c8 >> 6 | 0xC0);
                n11 = n8 + 2;
                byArray[n8 + 1] = (byte)(c8 & 0x3F | 0x80);
                n8 = n11;
            } else {
                n8 = this.a1(c8, n8);
            }
            n11 = n10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void q1(String string, int n8, int n9) throws IOException {
        if (this.w0 + (n9 - n8) * 6 > this.x0) {
            this.Z0();
        }
        int n10 = this.w0;
        byte[] byArray = this.v0;
        int[] nArray = this.m0;
        int n11 = this.n0;
        int n12 = n8;
        n8 = n10;
        while (true) {
            if (n12 >= n9) {
                this.w0 = n8;
                return;
            }
            n10 = n12 + 1;
            char c8 = string.charAt(n12);
            if (c8 <= '\u007f') {
                int n13 = nArray[c8];
                if (n13 == 0) {
                    byArray[n8] = (byte)c8;
                    n12 = n10;
                    ++n8;
                    continue;
                }
                if (n13 > 0) {
                    byArray[n8] = 92;
                    n12 = n8 + 2;
                    byArray[n8 + 1] = (byte)n13;
                    n8 = n12;
                } else {
                    n8 = this.g1(c8, n8);
                }
            } else if (c8 > n11) {
                n8 = this.g1(c8, n8);
            } else if (c8 <= '\u07ff') {
                byArray[n8] = (byte)(c8 >> 6 | 0xC0);
                n12 = n8 + 2;
                byArray[n8 + 1] = (byte)(c8 & 0x3F | 0x80);
                n8 = n12;
            } else {
                n8 = this.a1(c8, n8);
            }
            n12 = n10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void r1(char[] cArray, int n8, int n9) throws IOException {
        if (this.w0 + (n9 - n8) * 6 > this.x0) {
            this.Z0();
        }
        int n10 = this.w0;
        byte[] byArray = this.v0;
        int[] nArray = this.m0;
        int n11 = this.n0;
        int n12 = n8;
        n8 = n10;
        while (true) {
            if (n12 >= n9) {
                this.w0 = n8;
                return;
            }
            n10 = n12 + 1;
            char c8 = cArray[n12];
            if (c8 <= '\u007f') {
                int n13 = nArray[c8];
                if (n13 == 0) {
                    byArray[n8] = (byte)c8;
                    n12 = n10;
                    ++n8;
                    continue;
                }
                if (n13 > 0) {
                    byArray[n8] = 92;
                    n12 = n8 + 2;
                    byArray[n8 + 1] = (byte)n13;
                    n8 = n12;
                } else {
                    n8 = this.g1(c8, n8);
                }
            } else if (c8 > n11) {
                n8 = this.g1(c8, n8);
            } else if (c8 <= '\u07ff') {
                byArray[n8] = (byte)(c8 >> 6 | 0xC0);
                n12 = n8 + 2;
                byArray[n8 + 1] = (byte)(c8 & 0x3F | 0x80);
                n8 = n12;
            } else {
                n8 = this.a1(c8, n8);
            }
            n12 = n10;
        }
    }

    private final void s1(String string, int n8, int n9) throws IOException {
        int n10;
        do {
            if (this.w0 + (n10 = Math.min(this.y0, n9)) > this.x0) {
                this.Z0();
            }
            this.m1(string, n8, n10);
            n8 += n10;
            n9 = n10 = n9 - n10;
        } while (n10 > 0);
    }

    private final void t1(String object, boolean bl) throws IOException {
        int n8;
        int n9;
        if (bl) {
            if (this.w0 >= this.x0) {
                this.Z0();
            }
            byte[] byArray = this.v0;
            n9 = this.w0;
            this.w0 = n9 + 1;
            byArray[n9] = this.u0;
        }
        int n10 = 0;
        for (n9 = ((String)object).length(); n9 > 0; n9 -= n8) {
            n8 = Math.min(this.y0, n9);
            if (this.w0 + n8 > this.x0) {
                this.Z0();
            }
            this.m1((String)object, n10, n8);
            n10 += n8;
        }
        if (bl) {
            if (this.w0 >= this.x0) {
                this.Z0();
            }
            object = this.v0;
            n9 = this.w0;
            this.w0 = n9 + 1;
            object[n9] = this.u0;
        }
    }

    private final void u1(char[] cArray, int n8, int n9) throws IOException {
        int n10;
        do {
            if (this.w0 + (n10 = Math.min(this.y0, n9)) > this.x0) {
                this.Z0();
            }
            this.n1(cArray, n8, n10);
            n8 += n10;
            n9 = n10 = n9 - n10;
        } while (n10 > 0);
    }

    private byte[] v1() {
        if (this.q0) {
            return C0;
        }
        return D0;
    }

    @Override
    public void A(char c8) throws IOException {
        if (this.w0 + 3 >= this.x0) {
            this.Z0();
        }
        byte[] byArray = this.v0;
        if (c8 <= '\u007f') {
            int n8 = this.w0;
            this.w0 = n8 + 1;
            byArray[n8] = (byte)c8;
            return;
        }
        if (c8 < '\u0800') {
            int n9;
            int n10 = this.w0;
            this.w0 = n9 = n10 + 1;
            byArray[n10] = (byte)(c8 >> 6 | 0xC0);
            this.w0 = n10 + 2;
            byArray[n9] = (byte)(c8 & 0x3F | 0x80);
            return;
        }
        this.b1(c8, null, 0, 0);
    }

    @Override
    public void F(p p8) throws IOException {
        int n8 = p8.b(this.v0, this.w0);
        if (n8 < 0) {
            this.f1(p8.c());
            return;
        }
        this.w0 += n8;
    }

    @Override
    public void H(String string) throws IOException {
        char[] cArray;
        int n8 = string.length();
        if (n8 <= (cArray = this.z0).length) {
            string.getChars(0, n8, cArray, 0);
            this.L(cArray, 0, n8);
            return;
        }
        this.w1(string, 0, n8);
    }

    @Override
    public final void L(char[] cArray, int n8, int n9) throws IOException {
        this.A0(cArray, n8, n9);
        int n10 = n9 + n9 + n9;
        int n11 = this.w0;
        int n12 = this.x0;
        if (n11 + n10 > n12) {
            if (n12 < n10) {
                this.l1(cArray, n8, n9);
                return;
            }
            this.Z0();
        }
        n10 = n9 + n8;
        block0: while (n8 < n10) {
            do {
                byte[] byArray;
                if ((n9 = cArray[n8]) > 127) {
                    ++n8;
                    if (n9 < 2048) {
                        byArray = this.v0;
                        n12 = this.w0;
                        this.w0 = n11 = n12 + 1;
                        byArray[n12] = (byte)(n9 >> 6 | 0xC0);
                        this.w0 = n12 + 2;
                        byArray[n11] = (byte)(n9 & 0x3F | 0x80);
                        continue block0;
                    }
                    n8 = this.b1(n9, cArray, n8, n10);
                    continue block0;
                }
                byArray = this.v0;
                n11 = this.w0;
                this.w0 = n11 + 1;
                byArray[n11] = (byte)n9;
                n8 = n9 = n8 + 1;
            } while (n9 < n10);
        }
    }

    @Override
    public final void W() throws IOException {
        this.e1("start an array");
        this.i0 = this.i0.k();
        Object object = this.q;
        if (object != null) {
            object.f(this);
            return;
        }
        if (this.w0 >= this.x0) {
            this.Z0();
        }
        object = this.v0;
        int n8 = this.w0;
        this.w0 = n8 + 1;
        object[n8] = 91;
    }

    protected final void Z0() throws IOException {
        int n8 = this.w0;
        if (n8 > 0) {
            this.w0 = 0;
            this.t0.write(this.v0, 0, n8);
        }
    }

    protected final void c1(int n8, int n9) throws IOException {
        int n10;
        int n11 = this.F0(n8, n9);
        if (this.w0 + 4 > this.x0) {
            this.Z0();
        }
        byte[] byArray = this.v0;
        n8 = this.w0;
        this.w0 = n10 = n8 + 1;
        byArray[n8] = (byte)(n11 >> 18 | 0xF0);
        this.w0 = n9 = n8 + 2;
        byArray[n10] = (byte)(n11 >> 12 & 0x3F | 0x80);
        this.w0 = n10 = n8 + 3;
        byArray[n9] = (byte)(n11 >> 6 & 0x3F | 0x80);
        this.w0 = n8 + 4;
        byArray[n10] = (byte)(n11 & 0x3F | 0x80);
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
                this.Z0();
                l8 = null;
            }
            this.w0 = 0;
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
        Object[] objectArray = this.v0;
        if (objectArray != null && this.B0) {
            this.v0 = null;
            this.l0.q((byte[])objectArray);
        }
        if ((objectArray = (Object[])this.z0) != null) {
            this.z0 = null;
            this.l0.m((char[])objectArray);
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
                    if (object != null && ((Object)(object = (Object)object.c())).length > 0) {
                        this.f1((byte[])object);
                    }
                }
                return;
            }
            n8 = 58;
        } else {
            n8 = 44;
        }
        if (this.w0 >= this.x0) {
            this.Z0();
        }
        object = this.v0;
        n9 = this.w0;
        this.w0 = n9 + 1;
        object[n9] = n8;
    }

    @Override
    public void flush() throws IOException {
        this.Z0();
        if (this.t0 != null && this.L0(g.a.f0)) {
            this.t0.flush();
        }
    }

    @Override
    public void g(boolean bl) throws IOException {
        this.e1("write a boolean value");
        if (this.w0 + 5 >= this.x0) {
            this.Z0();
        }
        byte[] byArray = bl ? F0 : G0;
        int n8 = byArray.length;
        System.arraycopy(byArray, 0, this.v0, this.w0, n8);
        this.w0 += n8;
    }

    protected final void i1(String object) throws IOException {
        int n8 = this.i0.o((String)object);
        if (n8 == 4) {
            this.a("Can not write a field name, expecting a value");
        }
        if (n8 == 1) {
            this.q.h(this);
        } else {
            this.q.a(this);
        }
        if (this.p0) {
            this.t1((String)object, false);
            return;
        }
        int n9 = ((String)object).length();
        if (n9 > this.A0) {
            this.t1((String)object, true);
            return;
        }
        if (this.w0 >= this.x0) {
            this.Z0();
        }
        byte[] byArray = this.v0;
        n8 = this.w0;
        this.w0 = n8 + 1;
        byArray[n8] = this.u0;
        ((String)object).getChars(0, n9, this.z0, 0);
        if (n9 <= this.y0) {
            if (this.w0 + n9 > this.x0) {
                this.Z0();
            }
            this.n1(this.z0, 0, n9);
        } else {
            this.u1(this.z0, 0, n9);
        }
        if (this.w0 >= this.x0) {
            this.Z0();
        }
        object = this.v0;
        n8 = this.w0;
        this.w0 = n8 + 1;
        object[n8] = this.u0;
    }

    @Override
    public final void j() throws IOException {
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
            if (this.w0 >= this.x0) {
                this.Z0();
            }
            object = this.v0;
            int n8 = this.w0;
            this.w0 = n8 + 1;
            object[n8] = 93;
        }
        this.i0 = this.i0.j();
    }

    @Override
    public final void m() throws IOException {
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
            if (this.w0 >= this.x0) {
                this.Z0();
            }
            object = this.v0;
            int n8 = this.w0;
            this.w0 = n8 + 1;
            object[n8] = 125;
        }
        this.i0 = this.i0.j();
    }

    @Override
    public void o(String object) throws IOException {
        byte[] byArray;
        if (this.q != null) {
            this.i1((String)object);
            return;
        }
        int n8 = this.i0.o((String)object);
        if (n8 == 4) {
            this.a("Can not write a field name, expecting a value");
        }
        if (n8 == 1) {
            if (this.w0 >= this.x0) {
                this.Z0();
            }
            byArray = this.v0;
            n8 = this.w0;
            this.w0 = n8 + 1;
            byArray[n8] = 44;
        }
        if (this.p0) {
            this.t1((String)object, false);
            return;
        }
        int n9 = ((String)object).length();
        if (n9 > this.A0) {
            this.t1((String)object, true);
            return;
        }
        if (this.w0 >= this.x0) {
            this.Z0();
        }
        byArray = this.v0;
        int n10 = this.w0;
        this.w0 = n8 = n10 + 1;
        byArray[n10] = this.u0;
        if (n9 <= this.y0) {
            if (n8 + n9 > this.x0) {
                this.Z0();
            }
            this.m1((String)object, 0, n9);
        } else {
            this.s1((String)object, 0, n9);
        }
        if (this.w0 >= this.x0) {
            this.Z0();
        }
        object = this.v0;
        n8 = this.w0;
        this.w0 = n8 + 1;
        object[n8] = this.u0;
    }

    @Override
    public final void o0() throws IOException {
        this.e1("start an object");
        this.i0 = this.i0.l();
        Object object = this.q;
        if (object != null) {
            object.g(this);
            return;
        }
        if (this.w0 >= this.x0) {
            this.Z0();
        }
        object = this.v0;
        int n8 = this.w0;
        this.w0 = n8 + 1;
        object[n8] = 123;
    }

    @Override
    public void p() throws IOException {
        this.e1("write a null");
        this.h1();
    }

    @Override
    public void q(double d8) throws IOException {
        if (!(this.h0 || k.o(d8) && g.a.h0.j(this.g0))) {
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
        int n8 = ((String)object).length();
        if (n8 > this.y0) {
            this.t1((String)object, true);
            return;
        }
        if (this.w0 + n8 >= this.x0) {
            this.Z0();
        }
        byte[] byArray = this.v0;
        int n9 = this.w0;
        this.w0 = n9 + 1;
        byArray[n9] = this.u0;
        this.m1((String)object, 0, n8);
        if (this.w0 >= this.x0) {
            this.Z0();
        }
        object = this.v0;
        n9 = this.w0;
        this.w0 = n9 + 1;
        object[n9] = this.u0;
    }

    @Override
    public void u(long l8) throws IOException {
        this.e1("write a number");
        if (this.h0) {
            this.j1(l8);
            return;
        }
        if (this.w0 + 21 >= this.x0) {
            this.Z0();
        }
        this.w0 = k.r(l8, this.v0, this.w0);
    }

    public void w1(String string, int n8, int n9) throws IOException {
        this.C0(string, n8, n9);
        char[] cArray = this.z0;
        int n10 = cArray.length;
        if (n9 <= n10) {
            string.getChars(n8, n8 + n9, cArray, 0);
            this.L(cArray, 0, n9);
            return;
        }
        int n11 = this.x0;
        int n12 = Math.min(n10, (n11 >> 2) + (n11 >> 4));
        while (n9 > 0) {
            n11 = Math.min(n12, n9);
            string.getChars(n8, n8 + n11, cArray, 0);
            if (this.w0 + n12 * 3 > this.x0) {
                this.Z0();
            }
            n10 = n11;
            if (n11 > 1) {
                char c8 = cArray[n11 - 1];
                n10 = n11;
                if (c8 >= '\ud800') {
                    n10 = n11;
                    if (c8 <= '\udbff') {
                        n10 = n11 - 1;
                    }
                }
            }
            this.k1(cArray, 0, n10);
            n8 += n10;
            n9 -= n10;
        }
    }
}

