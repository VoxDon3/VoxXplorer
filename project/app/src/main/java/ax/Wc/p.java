/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Pd.a;
import ax.Wc.A;
import ax.Wc.B;
import ax.Wc.C;
import ax.Wc.F;
import ax.Wc.H;
import ax.Wc.J;
import ax.Wc.K0;
import ax.Wc.L;
import ax.Wc.M;
import ax.Wc.N;
import ax.Wc.Q;
import ax.Wc.S;
import ax.Wc.T0;
import ax.Wc.V;
import ax.Wc.V0;
import ax.Wc.W;
import ax.Wc.X0;
import ax.Wc.Y;
import ax.Wc.Z;
import ax.Wc.b;
import ax.Wc.b0;
import ax.Wc.c;
import ax.Wc.d0;
import ax.Wc.e;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.i;
import ax.Wc.j;
import ax.Wc.l;
import ax.Wc.m;
import ax.Wc.m0;
import ax.Wc.n;
import ax.Wc.o;
import ax.Wc.q;
import ax.Wc.r;
import ax.Wc.s;
import ax.Wc.u;
import ax.Wc.v;
import ax.Wc.w;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class p
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    private final boolean c0;
    private final byte[][] d0;
    private final int q;

    public p(InputStream inputStream, int n8) {
        this(inputStream, n8, false);
    }

    public p(InputStream inputStream, int n8, boolean bl) {
        this(inputStream, n8, bl, new byte[11][]);
    }

    private p(InputStream inputStream, int n8, boolean bl, byte[][] byArray) {
        super(inputStream);
        this.q = n8;
        this.c0 = bl;
        this.d0 = byArray;
    }

    public p(byte[] byArray) {
        this(new ByteArrayInputStream(byArray), byArray.length);
    }

    public p(byte[] byArray, boolean bl) {
        this(new ByteArrayInputStream(byArray), byArray.length, bl);
    }

    static A d(int n8, T0 object, byte[][] byArray) throws IOException {
        switch (n8) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("unknown tag ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(" encountered");
                throw new IOException(((StringBuilder)object).toString());
            }
            case 30: {
                return b.D(p.e((T0)object));
            }
            case 28: {
                return N.C(((T0)object).e());
            }
            case 27: {
                return l.C(((T0)object).e());
            }
            case 26: {
                return S.C(((T0)object).e());
            }
            case 25: {
                return n.C(((T0)object).e());
            }
            case 24: {
                return m.G(((T0)object).e());
            }
            case 23: {
                return L.C(((T0)object).e());
            }
            case 22: {
                return o.C(((T0)object).e());
            }
            case 21: {
                return Q.C(((T0)object).e());
            }
            case 20: {
                return H.C(((T0)object).e());
            }
            case 19: {
                return B.C(((T0)object).e());
            }
            case 18: {
                return s.C(((T0)object).e());
            }
            case 13: {
                return C.C(((T0)object).e(), false);
            }
            case 12: {
                return M.C(((T0)object).e());
            }
            case 10: {
                return i.C(p.f((T0)object, byArray), true);
            }
            case 7: {
                return u.C(((T0)object).e());
            }
            case 6: {
                return v.D(p.f((T0)object, byArray), true);
            }
            case 5: {
                return r.C(((T0)object).e());
            }
            case 4: {
                return w.C(((T0)object).e());
            }
            case 3: {
                return c.C(((T0)object).e());
            }
            case 2: {
                return ax.Wc.q.C(((T0)object).e());
            }
            case 1: 
        }
        return e.C(p.f((T0)object, byArray));
    }

    private static char[] e(T0 t02) throws IOException {
        int n8 = t02.c();
        if ((n8 & 1) == 0) {
            int n9 = n8 / 2;
            char[] cArray = new char[n9];
            byte[] byArray = new byte[8];
            int n10 = 0;
            int n11 = 0;
            while (n8 >= 8) {
                if (a.d(t02, byArray, 0, 8) == 8) {
                    cArray[n11] = (char)(byArray[0] << 8 | byArray[1] & 0xFF);
                    cArray[n11 + 1] = (char)(byArray[2] << 8 | byArray[3] & 0xFF);
                    cArray[n11 + 2] = (char)(byArray[4] << 8 | byArray[5] & 0xFF);
                    cArray[n11 + 3] = (char)(byArray[6] << 8 | byArray[7] & 0xFF);
                    n11 += 4;
                    n8 -= 8;
                    continue;
                }
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            int n12 = n11;
            if (n8 > 0) {
                if (a.d(t02, byArray, 0, n8) == n8) {
                    int n13 = n11;
                    n11 = n10;
                    do {
                        n12 = byArray[n11];
                        n10 = n11 + 2;
                        cArray[n13] = (char)(byArray[n11 + 1] & 0xFF | n12 << 8);
                        n12 = n13 + 1;
                        n11 = n10;
                        n13 = n12;
                    } while (n10 < n8);
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (t02.c() == 0 && n9 == n12) {
                return cArray;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    private static byte[] f(T0 t02, byte[][] byArray) throws IOException {
        byte[] byArray2;
        int n8 = t02.c();
        if (n8 >= byArray.length) {
            return t02.e();
        }
        byte[] byArray3 = byArray2 = byArray[n8];
        if (byArray2 == null) {
            byArray3 = new byte[n8];
            byArray[n8] = byArray3;
        }
        t02.d(byArray3);
        return byArray3;
    }

    static int j(InputStream object, int n8, boolean bl) throws IOException {
        int n9 = ((InputStream)object).read();
        if (n9 >>> 7 == 0) {
            return n9;
        }
        if (128 == n9) {
            return -1;
        }
        if (n9 >= 0) {
            if (255 != n9) {
                int n10;
                int n11 = 0;
                int n12 = 0;
                while ((n10 = ((InputStream)object).read()) >= 0) {
                    if (n11 >>> 23 == 0) {
                        n10 = (n11 << 8) + n10;
                        int n13 = n12 + 1;
                        n11 = n10;
                        n12 = n13;
                        if (n13 < (n9 & 0x7F)) continue;
                        if (n10 >= n8 && !bl) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("corrupted stream - out of bounds length found: ");
                            ((StringBuilder)object).append(n10);
                            ((StringBuilder)object).append(" >= ");
                            ((StringBuilder)object).append(n8);
                            throw new IOException(((StringBuilder)object).toString());
                        }
                        return n10;
                    }
                    throw new IOException("long form definite-length more than 31 bits");
                }
                throw new EOFException("EOF found reading length");
            }
            throw new IOException("invalid long form definite-length 0xFF");
        }
        throw new EOFException("EOF found when length expected");
    }

    static int o(InputStream inputStream, int n8) throws IOException {
        if ((n8 &= 0x1F) == 31) {
            n8 = inputStream.read();
            if (n8 < 31) {
                if (n8 < 0) {
                    throw new EOFException("EOF found inside tag value.");
                }
                throw new IOException("corrupted stream - high tag number < 31 found");
            }
            if ((n8 & 0x7F) != 0) {
                int n9 = 0;
                while ((n8 & 0x80) != 0) {
                    if (n9 >>> 24 == 0) {
                        n9 = (n8 & 0x7F | n9) << 7;
                        n8 = inputStream.read();
                        if (n8 >= 0) continue;
                        throw new EOFException("EOF found inside tag value.");
                    }
                    throw new IOException("Tag number more than 31 bits");
                }
                return n8 & 0x7F | n9;
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return n8;
    }

    c a(h object) throws IOException {
        int n8 = ((h)object).f();
        c[] cArray = new c[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            g g8 = ((h)object).d(i8);
            if (g8 instanceof c) {
                cArray[i8] = (c)g8;
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("unknown object encountered in constructed BIT STRING: ");
            ((StringBuilder)object).append(g8.getClass());
            throw new j(((StringBuilder)object).toString());
        }
        return new V(cArray);
    }

    w b(h object) throws IOException {
        int n8 = ((h)object).f();
        w[] wArray = new w[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            g g8 = ((h)object).d(i8);
            if (g8 instanceof w) {
                wArray[i8] = (w)g8;
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("unknown object encountered in constructed OCTET STRING: ");
            ((StringBuilder)object).append(g8.getClass());
            throw new j(((StringBuilder)object).toString());
        }
        return new Y(wArray);
    }

    protected A c(int n8, int n9, int n10) throws IOException {
        Object object = new T0(this, n10, this.q);
        if ((n8 & 0xE0) == 0) {
            return p.d(n9, (T0)object, this.d0);
        }
        n10 = n8 & 0xC0;
        boolean bl = true;
        if (n10 != 0) {
            if ((n8 & 0x20) == 0) {
                bl = false;
            }
            return this.p(n10, n9, bl, (T0)object);
        }
        if (n9 != 3) {
            if (n9 != 4) {
                if (n9 != 8) {
                    if (n9 != 16) {
                        if (n9 == 17) {
                            return K0.b(this.u((T0)object));
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("unknown tag ");
                        ((StringBuilder)object).append(n9);
                        ((StringBuilder)object).append(" encountered");
                        throw new IOException(((StringBuilder)object).toString());
                    }
                    if (((T0)object).c() < 1) {
                        return K0.a;
                    }
                    if (this.c0) {
                        return new X0(((T0)object).e());
                    }
                    return K0.a(this.u((T0)object));
                }
                return K0.a(this.u((T0)object)).M();
            }
            return this.b(this.u((T0)object));
        }
        return this.a(this.u((T0)object));
    }

    protected int g() throws IOException {
        return p.j(this, this.q, false);
    }

    public A m() throws IOException {
        int n8 = ((InputStream)this).read();
        if (n8 <= 0) {
            if (n8 != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int n9 = p.o(this, n8);
        int n10 = this.g();
        if (n10 >= 0) {
            try {
                A a8 = this.c(n8, n9, n10);
                return a8;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new j("corrupted stream detected", illegalArgumentException);
            }
        }
        if ((n8 & 0x20) != 0) {
            F f8 = new F(new V0(this, this.q), this.q, this.d0);
            if ((n8 &= 0xC0) != 0) {
                return f8.c(n8, n9);
            }
            if (n9 != 3) {
                if (n9 != 4) {
                    if (n9 != 8) {
                        if (n9 != 16) {
                            if (n9 == 17) {
                                return ax.Wc.d0.a(f8);
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return b0.a(f8);
                    }
                    return m0.a(f8);
                }
                return Z.a(f8);
            }
            return W.a(f8);
        }
        throw new IOException("indefinite-length primitive encoding encountered");
    }

    A p(int n8, int n9, boolean bl, T0 t02) throws IOException {
        if (!bl) {
            return J.E(n8, n9, t02.e());
        }
        return J.C(n8, n9, this.u(t02));
    }

    h q() throws IOException {
        A a8;
        A a9 = this.m();
        if (a9 == null) {
            return new h(0);
        }
        h h8 = new h();
        do {
            h8.a(a9);
            a9 = a8 = this.m();
        } while (a8 != null);
        return h8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }

    h u(T0 t02) throws IOException {
        int n8 = t02.c();
        if (n8 < 1) {
            return new h(0);
        }
        return new p(t02, n8, this.c0, this.d0).q();
    }
}

