package ax.Z8;

import ax.Xd.d;
import ax.Xd.f;
import ax.Z8.a;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes3.dex */
public class a<T extends a<T>> {
    private static final d e = f.k(a.class);
    private byte[] a;
    private ax.Z8.b b;
    protected int c;
    protected int d;

    public static class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public static class c extends a<c> {
        public c(ax.Z8.b bVar) {
            super(bVar);
        }

        public c(byte[] bArr, ax.Z8.b bVar) {
            super(bArr, bVar);
        }
    }

    public a(ax.Z8.b bVar) {
        this(256, bVar);
    }

    private String D(Charset charset, ax.Z8.b bVar) throws b {
        String name = charset.name();
        name.getClass();
        switch (name) {
            case "UTF-16":
                return bVar.b(this);
            case "UTF-8":
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte z = z();
                while (z != 0) {
                    byteArrayOutputStream.write(z);
                    z = z();
                }
                return new String(byteArrayOutputStream.toByteArray(), charset);
            case "UTF-16BE":
                return ax.Z8.b.c.b(this);
            case "UTF-16LE":
                return ax.Z8.b.b.b(this);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    private String I(Charset charset, int i, ax.Z8.b bVar) throws b {
        String name = charset.name();
        name.getClass();
        switch (name) {
            case "UTF-16":
                return bVar.h(this, i);
            case "UTF-8":
                return new String(G(i), charset);
            case "UTF-16BE":
                return ax.Z8.b.c.h(this, i);
            case "UTF-16LE":
                return ax.Z8.b.b.h(this, i);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    protected static int g(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
            if (i2 <= 0) {
                throw new IllegalArgumentException("Cannot get next power of 2; " + i + " is too large");
            }
        }
        return i2;
    }

    private a<T> n(String str, Charset charset, ax.Z8.b bVar) {
        String name = charset.name();
        name.getClass();
        switch (name) {
            case "UTF-16":
                bVar.k(this, str);
                return this;
            case "UTF-8":
                o(str.getBytes(charset));
                j((byte) 0);
                return this;
            case "UTF-16BE":
                ax.Z8.b.c.k(this, str);
                return this;
            case "UTF-16LE":
                ax.Z8.b.b.k(this, str);
                return this;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    private a<T> r(String str, Charset charset, ax.Z8.b bVar) {
        String name = charset.name();
        name.getClass();
        switch (name) {
            case "UTF-16":
                bVar.o(this, str);
                return this;
            case "UTF-8":
                o(str.getBytes(charset));
                return this;
            case "UTF-16BE":
                ax.Z8.b.c.o(this, str);
                return this;
            case "UTF-16LE":
                ax.Z8.b.b.o(this, str);
                return this;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    public long A() throws b {
        return B(this.b);
    }

    public long B(ax.Z8.b bVar) throws b {
        return bVar.a(this);
    }

    public String C(Charset charset) throws b {
        return D(charset, this.b);
    }

    public void E(byte[] bArr) throws b {
        F(bArr, 0, bArr.length);
    }

    public void F(byte[] bArr, int i, int i2) throws b {
        d(i2);
        System.arraycopy(this.a, this.c, bArr, i, i2);
        this.c += i2;
    }

    public byte[] G(int i) throws b {
        byte[] bArr = new byte[i];
        E(bArr);
        return bArr;
    }

    public String H(Charset charset, int i) throws b {
        return I(charset, i, this.b);
    }

    public int J() throws b {
        return K(this.b);
    }

    public int K(ax.Z8.b bVar) throws b {
        return bVar.d(this);
    }

    public int L() throws b {
        return M(this.b);
    }

    public int M(ax.Z8.b bVar) throws b {
        return bVar.e(this);
    }

    public long N() throws b {
        return O(this.b);
    }

    public long O(ax.Z8.b bVar) throws b {
        return bVar.f(this);
    }

    public int P() throws b {
        return (int) N();
    }

    public long Q() throws b {
        return R(this.b);
    }

    public long R(ax.Z8.b bVar) throws b {
        return bVar.g(this);
    }

    public int S() {
        return this.c;
    }

    public void T(int i) {
        this.c = i;
    }

    public a<T> U(int i) throws b {
        d(i);
        this.c += i;
        return this;
    }

    public int V() {
        return this.d;
    }

    public byte[] a() {
        return this.a;
    }

    public InputStream b() {
        return new C0232a();
    }

    public int c() {
        return this.d - this.c;
    }

    protected void d(int i) throws b {
        if (c() >= i) {
            return;
        }
        throw new b("Underflow :" + c() + " < " + i);
    }

    public void e(int i) {
        int length = this.a.length;
        int i2 = this.d;
        if (length - i2 < i) {
            byte[] bArr = new byte[g(i2 + i)];
            byte[] bArr2 = this.a;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.a = bArr;
        }
    }

    public byte[] f() {
        int c2 = c();
        if (c2 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[c2];
        System.arraycopy(this.a, this.c, bArr, 0, c2);
        return bArr;
    }

    public a<T> h(boolean z) {
        return j(z ? (byte) 1 : (byte) 0);
    }

    public a<T> i(a<? extends a<?>> aVar) {
        if (aVar != null) {
            int c2 = aVar.c();
            e(c2);
            System.arraycopy(aVar.a, aVar.c, this.a, this.d, c2);
            this.d += c2;
        }
        return this;
    }

    public a<T> j(byte b2) {
        e(1);
        byte[] bArr = this.a;
        int i = this.d;
        this.d = i + 1;
        bArr[i] = b2;
        return this;
    }

    public a<T> k(long j) {
        return l(j, this.b);
    }

    public a<T> l(long j, ax.Z8.b bVar) {
        bVar.j(this, j);
        return this;
    }

    public a<T> m(String str, Charset charset) {
        return n(str, charset, this.b);
    }

    public a<T> o(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public a<T> p(byte[] bArr, int i, int i2) {
        e(i2);
        System.arraycopy(bArr, i, this.a, this.d, i2);
        this.d += i2;
        return this;
    }

    public a<T> q(String str, Charset charset) {
        return r(str, charset, this.b);
    }

    public a<T> s(int i) {
        return t(i, this.b);
    }

    public a<T> t(int i, ax.Z8.b bVar) {
        bVar.l(this, i);
        return this;
    }

    public String toString() {
        return "Buffer [rpos=" + this.c + ", wpos=" + this.d + ", size=" + this.a.length + "]";
    }

    public a<T> u(long j) {
        return v(j, this.b);
    }

    public a<T> v(long j, ax.Z8.b bVar) {
        bVar.m(this, j);
        return this;
    }

    public a<T> w(long j) {
        return x(j, this.b);
    }

    public a<T> x(long j, ax.Z8.b bVar) {
        bVar.n(this, j);
        return this;
    }

    public boolean y() throws b {
        return z() != 0;
    }

    public byte z() throws b {
        d(1);
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        return bArr[i];
    }

    /* renamed from: ax.Z8.a$a, reason: collision with other inner class name */
    class C0232a extends InputStream implements InputStreamRetargetInterface {
        C0232a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return a.this.c();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return a.this.z() & 255;
            } catch (b e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            a.this.T((int) j);
            return j;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            try {
                a.this.E(bArr);
                return bArr.length;
            } catch (b e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            return super.read(bArr, i, i2);
        }
    }

    public a(byte[] bArr, ax.Z8.b bVar) {
        this(bArr, true, bVar);
    }

    public a(int i, ax.Z8.b bVar) {
        this(new byte[g(i)], false, bVar);
    }

    private a(byte[] bArr, boolean z, ax.Z8.b bVar) {
        this.a = bArr;
        this.b = bVar;
        this.c = 0;
        this.d = z ? bArr.length : 0;
    }
}
