/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.G0;
import ax.Wc.I0;
import ax.Wc.J;
import ax.Wc.N0;
import ax.Wc.P0;
import ax.Wc.R0;
import ax.Wc.T0;
import ax.Wc.U;
import ax.Wc.U0;
import ax.Wc.V0;
import ax.Wc.W;
import ax.Wc.Y0;
import ax.Wc.Z;
import ax.Wc.b0;
import ax.Wc.d0;
import ax.Wc.f0;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.j;
import ax.Wc.m0;
import ax.Wc.p;
import ax.Wc.u0;
import java.io.IOException;
import java.io.InputStream;

public class F {
    private final InputStream a;
    private final int b;
    private final byte[][] c;

    F(InputStream inputStream, int n8, byte[][] byArray) {
        this.a = inputStream;
        this.b = n8;
        this.c = byArray;
    }

    private void i(boolean bl) {
        InputStream inputStream = this.a;
        if (inputStream instanceof V0) {
            ((V0)inputStream).d(bl);
        }
    }

    g a(int n8) throws IOException {
        boolean bl = false;
        this.i(false);
        int n9 = p.o(this.a, n8);
        Object object = this.a;
        int n10 = this.b;
        boolean bl2 = n9 == 3 || n9 == 4 || n9 == 16 || n9 == 17 || n9 == 8;
        n10 = p.j((InputStream)object, n10, bl2);
        if (n10 < 0) {
            if ((n8 & 0x20) != 0) {
                object = new F(new V0(this.a, this.b), this.b, this.c);
                if ((n8 &= 0xC0) != 0) {
                    if (64 == n8) {
                        return new U(n9, (F)object);
                    }
                    return new f0(n8, n9, (F)object);
                }
                return ((F)object).e(n9);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        object = new T0(this.a, n10, this.b);
        if ((n8 & 0xE0) == 0) {
            return this.f(n9, (T0)object);
        }
        object = new F((InputStream)object, ((Y0)object).a(), this.c);
        n10 = n8 & 0xC0;
        if (n10 != 0) {
            bl2 = bl;
            if ((n8 & 0x20) != 0) {
                bl2 = true;
            }
            if (64 == n10) {
                return (G0)((F)object).b(n10, n9, bl2);
            }
            return new R0(n10, n9, bl2, (F)object);
        }
        return ((F)object).d(n9);
    }

    A b(int n8, int n9, boolean bl) throws IOException {
        if (!bl) {
            return J.E(n8, n9, ((T0)this.a).e());
        }
        return J.C(n8, n9, this.h());
    }

    A c(int n8, int n9) throws IOException {
        return J.D(n8, n9, this.h());
    }

    g d(int n8) throws IOException {
        if (n8 != 3) {
            if (n8 != 4) {
                if (n8 != 8) {
                    if (n8 != 16) {
                        if (n8 == 17) {
                            return new P0(this);
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unknown DL object encountered: 0x");
                        stringBuilder.append(Integer.toHexString(n8));
                        throw new j(stringBuilder.toString());
                    }
                    return new N0(this);
                }
                return new m0(this);
            }
            return new Z(this);
        }
        return new W(this);
    }

    g e(int n8) throws IOException {
        if (n8 != 3) {
            if (n8 != 4) {
                if (n8 != 8) {
                    if (n8 != 16) {
                        if (n8 == 17) {
                            return new d0(this);
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unknown BER object encountered: 0x");
                        stringBuilder.append(Integer.toHexString(n8));
                        throw new j(stringBuilder.toString());
                    }
                    return new b0(this);
                }
                return new m0(this);
            }
            return new Z(this);
        }
        return new W(this);
    }

    g f(int n8, T0 object) throws IOException {
        if (n8 != 3) {
            if (n8 != 4) {
                if (n8 != 8) {
                    if (n8 != 16) {
                        if (n8 != 17) {
                            try {
                                object = p.d(n8, (T0)object, this.c);
                                return object;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw new j("corrupted stream detected", illegalArgumentException);
                            }
                        }
                        throw new j("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
                    }
                    throw new j("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
                }
                throw new j("externals must use constructed encoding (see X.690 8.18)");
            }
            return new u0((T0)object);
        }
        return new I0((T0)object);
    }

    public g g() throws IOException {
        int n8 = this.a.read();
        if (n8 < 0) {
            return null;
        }
        return this.a(n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    h h() throws IOException {
        int n8;
        int n9 = this.a.read();
        if (n9 < 0) {
            return new h(0);
        }
        h h8 = new h();
        do {
            g g8;
            g8 = (g8 = this.a(n9)) instanceof U0 ? ((U0)((Object)g8)).l() : g8.g();
            h8.a(g8);
            n9 = n8 = this.a.read();
        } while (n8 >= 0);
        return h8;
    }
}

