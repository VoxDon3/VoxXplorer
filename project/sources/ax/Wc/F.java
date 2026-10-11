package ax.Wc;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class F {
    private final InputStream a;
    private final int b;
    private final byte[][] c;

    F(InputStream inputStream, int i, byte[][] bArr) {
        this.a = inputStream;
        this.b = i;
        this.c = bArr;
    }

    private void i(boolean z) {
        InputStream inputStream = this.a;
        if (inputStream instanceof V0) {
            ((V0) inputStream).d(z);
        }
    }

    InterfaceC1101g a(int i) throws IOException {
        i(false);
        int o = C1119p.o(this.a, i);
        int j = C1119p.j(this.a, this.b, o == 3 || o == 4 || o == 16 || o == 17 || o == 8);
        if (j < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            F f = new F(new V0(this.a, this.b), this.b, this.c);
            int i2 = i & 192;
            return i2 != 0 ? 64 == i2 ? new U(o, f) : new C1100f0(i2, o, f) : f.e(o);
        }
        T0 t0 = new T0(this.a, j, this.b);
        if ((i & 224) == 0) {
            return f(o, t0);
        }
        F f2 = new F(t0, t0.a(), this.c);
        int i3 = i & 192;
        if (i3 == 0) {
            return f2.d(o);
        }
        boolean z = (i & 32) != 0;
        return 64 == i3 ? (G0) f2.b(i3, o, z) : new R0(i3, o, z, f2);
    }

    A b(int i, int i2, boolean z) throws IOException {
        return !z ? J.E(i, i2, ((T0) this.a).e()) : J.C(i, i2, h());
    }

    A c(int i, int i2) throws IOException {
        return J.D(i, i2, h());
    }

    InterfaceC1101g d(int i) throws IOException {
        if (i == 3) {
            return new W(this);
        }
        if (i == 4) {
            return new Z(this);
        }
        if (i == 8) {
            return new C1114m0(this);
        }
        if (i == 16) {
            return new N0(this);
        }
        if (i == 17) {
            return new P0(this);
        }
        throw new C1107j("unknown DL object encountered: 0x" + Integer.toHexString(i));
    }

    InterfaceC1101g e(int i) throws IOException {
        if (i == 3) {
            return new W(this);
        }
        if (i == 4) {
            return new Z(this);
        }
        if (i == 8) {
            return new C1114m0(this);
        }
        if (i == 16) {
            return new C1092b0(this);
        }
        if (i == 17) {
            return new C1096d0(this);
        }
        throw new C1107j("unknown BER object encountered: 0x" + Integer.toHexString(i));
    }

    InterfaceC1101g f(int i, T0 t0) throws IOException {
        if (i == 3) {
            return new I0(t0);
        }
        if (i == 4) {
            return new C1129u0(t0);
        }
        if (i == 8) {
            throw new C1107j("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i == 16) {
            throw new C1107j("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i == 17) {
            throw new C1107j("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return C1119p.d(i, t0, this.c);
        } catch (IllegalArgumentException e) {
            throw new C1107j("corrupted stream detected", e);
        }
    }

    public InterfaceC1101g g() throws IOException {
        int read = this.a.read();
        if (read < 0) {
            return null;
        }
        return a(read);
    }

    C1103h h() throws IOException {
        int read = this.a.read();
        if (read < 0) {
            return new C1103h(0);
        }
        C1103h c1103h = new C1103h();
        do {
            InterfaceC1101g a = a(read);
            c1103h.a(a instanceof U0 ? ((U0) a).l() : a.g());
            read = this.a.read();
        } while (read >= 0);
        return c1103h;
    }
}
