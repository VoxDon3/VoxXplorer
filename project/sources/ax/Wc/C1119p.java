package ax.Wc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.Wc.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1119p extends FilterInputStream implements InputStreamRetargetInterface {
    private final boolean c0;
    private final byte[][] d0;
    private final int q;

    public C1119p(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    static A d(int i, T0 t0, byte[][] bArr) throws IOException {
        switch (i) {
            case 1:
                return C1097e.C(f(t0, bArr));
            case 2:
                return C1121q.C(t0.e());
            case 3:
                return AbstractC1093c.C(t0.e());
            case 4:
                return AbstractC1132w.C(t0.e());
            case 5:
                return r.C(t0.e());
            case 6:
                return C1130v.D(f(t0, bArr), true);
            case 7:
                return C1128u.C(t0.e());
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                throw new IOException("unknown tag " + i + " encountered");
            case 10:
                return C1105i.C(f(t0, bArr), true);
            case 12:
                return M.C(t0.e());
            case 13:
                return C.C(t0.e(), false);
            case 18:
                return AbstractC1124s.C(t0.e());
            case 19:
                return B.C(t0.e());
            case 20:
                return H.C(t0.e());
            case 21:
                return Q.C(t0.e());
            case 22:
                return AbstractC1117o.C(t0.e());
            case 23:
                return L.C(t0.e());
            case 24:
                return C1113m.G(t0.e());
            case 25:
                return AbstractC1115n.C(t0.e());
            case 26:
                return S.C(t0.e());
            case 27:
                return AbstractC1111l.C(t0.e());
            case 28:
                return N.C(t0.e());
            case 30:
                return AbstractC1091b.D(e(t0));
        }
    }

    private static char[] e(T0 t0) throws IOException {
        int c = t0.c();
        if ((c & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i = c / 2;
        char[] cArr = new char[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        int i3 = 0;
        while (c >= 8) {
            if (ax.Pd.a.d(t0, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i3] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i3 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i3 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i3 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i3 += 4;
            c -= 8;
        }
        if (c > 0) {
            if (ax.Pd.a.d(t0, bArr, 0, c) != c) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i4 = i2 + 1;
                int i5 = bArr[i2] << 8;
                i2 += 2;
                cArr[i3] = (char) ((bArr[i4] & 255) | i5);
                i3++;
            } while (i2 < c);
        }
        if (t0.c() == 0 && i == i3) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    private static byte[] f(T0 t0, byte[][] bArr) throws IOException {
        int c = t0.c();
        if (c >= bArr.length) {
            return t0.e();
        }
        byte[] bArr2 = bArr[c];
        if (bArr2 == null) {
            bArr2 = new byte[c];
            bArr[c] = bArr2;
        }
        t0.d(bArr2);
        return bArr2;
    }

    static int j(InputStream inputStream, int i, boolean z) throws IOException {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == read) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i2 = read & 127;
        int i3 = 0;
        int i4 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i3 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i3 = (i3 << 8) + read2;
            i4++;
        } while (i4 < i2);
        if (i3 < i || z) {
            return i3;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i3 + " >= " + i);
    }

    static int o(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        if ((read & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i3 = 0;
        while ((read & 128) != 0) {
            if ((i3 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            i3 = ((read & 127) | i3) << 7;
            read = inputStream.read();
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
        }
        return (read & 127) | i3;
    }

    AbstractC1093c a(C1103h c1103h) throws IOException {
        int f = c1103h.f();
        AbstractC1093c[] abstractC1093cArr = new AbstractC1093c[f];
        for (int i = 0; i != f; i++) {
            InterfaceC1101g d = c1103h.d(i);
            if (!(d instanceof AbstractC1093c)) {
                throw new C1107j("unknown object encountered in constructed BIT STRING: " + d.getClass());
            }
            abstractC1093cArr[i] = (AbstractC1093c) d;
        }
        return new V(abstractC1093cArr);
    }

    AbstractC1132w b(C1103h c1103h) throws IOException {
        int f = c1103h.f();
        AbstractC1132w[] abstractC1132wArr = new AbstractC1132w[f];
        for (int i = 0; i != f; i++) {
            InterfaceC1101g d = c1103h.d(i);
            if (!(d instanceof AbstractC1132w)) {
                throw new C1107j("unknown object encountered in constructed OCTET STRING: " + d.getClass());
            }
            abstractC1132wArr[i] = (AbstractC1132w) d;
        }
        return new Y(abstractC1132wArr);
    }

    protected A c(int i, int i2, int i3) throws IOException {
        T0 t0 = new T0(this, i3, this.q);
        if ((i & 224) == 0) {
            return d(i2, t0, this.d0);
        }
        int i4 = i & 192;
        if (i4 != 0) {
            return p(i4, i2, (i & 32) != 0, t0);
        }
        if (i2 == 3) {
            return a(u(t0));
        }
        if (i2 == 4) {
            return b(u(t0));
        }
        if (i2 == 8) {
            return K0.a(u(t0)).M();
        }
        if (i2 == 16) {
            return t0.c() < 1 ? K0.a : this.c0 ? new X0(t0.e()) : K0.a(u(t0));
        }
        if (i2 == 17) {
            return K0.b(u(t0));
        }
        throw new IOException("unknown tag " + i2 + " encountered");
    }

    protected int g() throws IOException {
        return j(this, this.q, false);
    }

    public A m() throws IOException {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int o = o(this, read);
        int g = g();
        if (g >= 0) {
            try {
                return c(read, o, g);
            } catch (IllegalArgumentException e) {
                throw new C1107j("corrupted stream detected", e);
            }
        }
        if ((read & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        F f = new F(new V0(this, this.q), this.q, this.d0);
        int i = read & 192;
        if (i != 0) {
            return f.c(i, o);
        }
        if (o == 3) {
            return W.a(f);
        }
        if (o == 4) {
            return Z.a(f);
        }
        if (o == 8) {
            return C1114m0.a(f);
        }
        if (o == 16) {
            return C1092b0.a(f);
        }
        if (o == 17) {
            return C1096d0.a(f);
        }
        throw new IOException("unknown BER object encountered");
    }

    A p(int i, int i2, boolean z, T0 t0) throws IOException {
        return !z ? J.E(i, i2, t0.e()) : J.C(i, i2, u(t0));
    }

    C1103h q() throws IOException {
        A m = m();
        if (m == null) {
            return new C1103h(0);
        }
        C1103h c1103h = new C1103h();
        do {
            c1103h.a(m);
            m = m();
        } while (m != null);
        return c1103h;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    C1103h u(T0 t0) throws IOException {
        int c = t0.c();
        return c < 1 ? new C1103h(0) : new C1119p(t0, c, this.c0, this.d0).q();
    }

    public C1119p(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    private C1119p(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.q = i;
        this.c0 = z;
        this.d0 = bArr;
    }

    public C1119p(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C1119p(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }
}
