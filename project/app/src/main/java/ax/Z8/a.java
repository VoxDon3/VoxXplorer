/*
 * Decompiled with CFR 0.152.
 */
package ax.Z8;

import ax.Xd.d;
import ax.Xd.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class a<T extends a<T>> {
    private static final d e = f.k(a.class);
    private byte[] a;
    private ax.Z8.b b;
    protected int c;
    protected int d;

    public a(int n8, ax.Z8.b b8) {
        this(new byte[ax.Z8.a.g(n8)], false, b8);
    }

    public a(ax.Z8.b b8) {
        this(256, b8);
    }

    public a(byte[] byArray, ax.Z8.b b8) {
        this(byArray, true, b8);
    }

    private a(byte[] byArray, boolean bl, ax.Z8.b b8) {
        this.a = byArray;
        this.b = b8;
        int n8 = 0;
        this.c = 0;
        if (bl) {
            n8 = byArray.length;
        }
        this.d = n8;
    }

    private String D(Charset charset, ax.Z8.b object) throws b {
        String string = charset.name();
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1398001380: {
                if (!string.equals("UTF-16LE")) break;
                n8 = 3;
                break;
            }
            case 1398001070: {
                if (!string.equals("UTF-16BE")) break;
                n8 = 2;
                break;
            }
            case 81070450: {
                if (!string.equals("UTF-8")) break;
                n8 = 1;
                break;
            }
            case -1781783509: {
                if (!string.equals("UTF-16")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                throw new UnsupportedCharsetException(charset.name());
            }
            case 3: {
                return ax.Z8.b.b.b(this);
            }
            case 2: {
                return ax.Z8.b.c.b(this);
            }
            case 1: {
                object = new ByteArrayOutputStream();
                n8 = this.z();
                while (n8 != 0) {
                    ((ByteArrayOutputStream)object).write(n8);
                    n8 = this.z();
                }
                return new String(((ByteArrayOutputStream)object).toByteArray(), charset);
            }
            case 0: 
        }
        return ((ax.Z8.b)object).b(this);
    }

    private String I(Charset charset, int n8, ax.Z8.b b8) throws b {
        String string = charset.name();
        string.getClass();
        int n9 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1398001380: {
                if (!string.equals("UTF-16LE")) break;
                n9 = 3;
                break;
            }
            case 1398001070: {
                if (!string.equals("UTF-16BE")) break;
                n9 = 2;
                break;
            }
            case 81070450: {
                if (!string.equals("UTF-8")) break;
                n9 = 1;
                break;
            }
            case -1781783509: {
                if (!string.equals("UTF-16")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                throw new UnsupportedCharsetException(charset.name());
            }
            case 3: {
                return ax.Z8.b.b.h(this, n8);
            }
            case 2: {
                return ax.Z8.b.c.h(this, n8);
            }
            case 1: {
                return new String(this.G(n8), charset);
            }
            case 0: 
        }
        return b8.h(this, n8);
    }

    protected static int g(int n8) {
        int n9 = 1;
        while (n9 < n8) {
            if ((n9 <<= 1) > 0) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot get next power of 2; ");
            stringBuilder.append(n8);
            stringBuilder.append(" is too large");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return n9;
    }

    private a<T> n(String string, Charset charset, ax.Z8.b b8) {
        String string2 = charset.name();
        string2.getClass();
        int n8 = -1;
        switch (string2.hashCode()) {
            default: {
                break;
            }
            case 1398001380: {
                if (!string2.equals("UTF-16LE")) break;
                n8 = 3;
                break;
            }
            case 1398001070: {
                if (!string2.equals("UTF-16BE")) break;
                n8 = 2;
                break;
            }
            case 81070450: {
                if (!string2.equals("UTF-8")) break;
                n8 = 1;
                break;
            }
            case -1781783509: {
                if (!string2.equals("UTF-16")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                throw new UnsupportedCharsetException(charset.name());
            }
            case 3: {
                ax.Z8.b.b.k(this, string);
                return this;
            }
            case 2: {
                ax.Z8.b.c.k(this, string);
                return this;
            }
            case 1: {
                this.o(string.getBytes(charset));
                this.j((byte)0);
                return this;
            }
            case 0: 
        }
        b8.k(this, string);
        return this;
    }

    private a<T> r(String string, Charset charset, ax.Z8.b b8) {
        String string2 = charset.name();
        string2.getClass();
        int n8 = -1;
        switch (string2.hashCode()) {
            default: {
                break;
            }
            case 1398001380: {
                if (!string2.equals("UTF-16LE")) break;
                n8 = 3;
                break;
            }
            case 1398001070: {
                if (!string2.equals("UTF-16BE")) break;
                n8 = 2;
                break;
            }
            case 81070450: {
                if (!string2.equals("UTF-8")) break;
                n8 = 1;
                break;
            }
            case -1781783509: {
                if (!string2.equals("UTF-16")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                throw new UnsupportedCharsetException(charset.name());
            }
            case 3: {
                ax.Z8.b.b.o(this, string);
                return this;
            }
            case 2: {
                ax.Z8.b.c.o(this, string);
                return this;
            }
            case 1: {
                this.o(string.getBytes(charset));
                return this;
            }
            case 0: 
        }
        b8.o(this, string);
        return this;
    }

    public long A() throws b {
        return this.B(this.b);
    }

    public long B(ax.Z8.b b8) throws b {
        return b8.a(this);
    }

    public String C(Charset charset) throws b {
        return this.D(charset, this.b);
    }

    public void E(byte[] byArray) throws b {
        this.F(byArray, 0, byArray.length);
    }

    public void F(byte[] byArray, int n8, int n9) throws b {
        this.d(n9);
        System.arraycopy(this.a, this.c, byArray, n8, n9);
        this.c += n9;
    }

    public byte[] G(int n8) throws b {
        byte[] byArray = new byte[n8];
        this.E(byArray);
        return byArray;
    }

    public String H(Charset charset, int n8) throws b {
        return this.I(charset, n8, this.b);
    }

    public int J() throws b {
        return this.K(this.b);
    }

    public int K(ax.Z8.b b8) throws b {
        return b8.d(this);
    }

    public int L() throws b {
        return this.M(this.b);
    }

    public int M(ax.Z8.b b8) throws b {
        return b8.e(this);
    }

    public long N() throws b {
        return this.O(this.b);
    }

    public long O(ax.Z8.b b8) throws b {
        return b8.f(this);
    }

    public int P() throws b {
        return (int)this.N();
    }

    public long Q() throws b {
        return this.R(this.b);
    }

    public long R(ax.Z8.b b8) throws b {
        return b8.g(this);
    }

    public int S() {
        return this.c;
    }

    public void T(int n8) {
        this.c = n8;
    }

    public a<T> U(int n8) throws b {
        this.d(n8);
        this.c += n8;
        return this;
    }

    public int V() {
        return this.d;
    }

    public byte[] a() {
        return this.a;
    }

    public InputStream b() {
        return new j.InputStreamRetargetInterface(this){
            final a q;
            {
                this.q = a8;
            }

            @Override
            public int available() {
                return this.q.c();
            }

            @Override
            public int read() throws IOException {
                try {
                    byte by = this.q.z();
                    return by & 0xFF;
                }
                catch (b b8) {
                    throw new IOException(b8);
                }
            }

            @Override
            public int read(byte[] byArray) throws IOException {
                try {
                    this.q.E(byArray);
                    int n8 = byArray.length;
                    return n8;
                }
                catch (b b8) {
                    throw new IOException(b8);
                }
            }

            @Override
            public int read(byte[] byArray, int n8, int n9) throws IOException {
                return super.read(byArray, n8, n9);
            }

            @Override
            public long skip(long l8) {
                this.q.T((int)l8);
                return l8;
            }

            @Override
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
            }
        };
    }

    public int c() {
        return this.d - this.c;
    }

    protected void d(int n8) throws b {
        if (this.c() >= n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Underflow :");
        stringBuilder.append(this.c());
        stringBuilder.append(" < ");
        stringBuilder.append(n8);
        throw new b(stringBuilder.toString());
    }

    public void e(int n8) {
        int n9 = this.a.length;
        int n10 = this.d;
        if (n9 - n10 < n8) {
            byte[] byArray = new byte[ax.Z8.a.g(n10 + n8)];
            byte[] byArray2 = this.a;
            System.arraycopy(byArray2, 0, byArray, 0, byArray2.length);
            this.a = byArray;
        }
    }

    public byte[] f() {
        int n8 = this.c();
        if (n8 > 0) {
            byte[] byArray = new byte[n8];
            System.arraycopy(this.a, this.c, byArray, 0, n8);
            return byArray;
        }
        return new byte[0];
    }

    public a<T> h(boolean bl) {
        return this.j((byte)(bl ? 1 : 0));
    }

    public a<T> i(a<? extends a<?>> a8) {
        if (a8 != null) {
            int n8 = a8.c();
            this.e(n8);
            System.arraycopy(a8.a, a8.c, this.a, this.d, n8);
            this.d += n8;
        }
        return this;
    }

    public a<T> j(byte by) {
        this.e(1);
        byte[] byArray = this.a;
        int n8 = this.d;
        this.d = n8 + 1;
        byArray[n8] = by;
        return this;
    }

    public a<T> k(long l8) {
        return this.l(l8, this.b);
    }

    public a<T> l(long l8, ax.Z8.b b8) {
        b8.j(this, l8);
        return this;
    }

    public a<T> m(String string, Charset charset) {
        return this.n(string, charset, this.b);
    }

    public a<T> o(byte[] byArray) {
        return this.p(byArray, 0, byArray.length);
    }

    public a<T> p(byte[] byArray, int n8, int n9) {
        this.e(n9);
        System.arraycopy(byArray, n8, this.a, this.d, n9);
        this.d += n9;
        return this;
    }

    public a<T> q(String string, Charset charset) {
        return this.r(string, charset, this.b);
    }

    public a<T> s(int n8) {
        return this.t(n8, this.b);
    }

    public a<T> t(int n8, ax.Z8.b b8) {
        b8.l(this, n8);
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Buffer [rpos=");
        stringBuilder.append(this.c);
        stringBuilder.append(", wpos=");
        stringBuilder.append(this.d);
        stringBuilder.append(", size=");
        stringBuilder.append(this.a.length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public a<T> u(long l8) {
        return this.v(l8, this.b);
    }

    public a<T> v(long l8, ax.Z8.b b8) {
        b8.m(this, l8);
        return this;
    }

    public a<T> w(long l8) {
        return this.x(l8, this.b);
    }

    public a<T> x(long l8, ax.Z8.b b8) {
        b8.n(this, l8);
        return this;
    }

    public boolean y() throws b {
        return this.z() != 0;
    }

    public byte z() throws b {
        this.d(1);
        byte[] byArray = this.a;
        int n8 = this.c;
        this.c = n8 + 1;
        return byArray[n8];
    }

    public static class b
    extends Exception {
        public b(String string) {
            super(string);
        }
    }

    public static class c
    extends a<c> {
        public c(ax.Z8.b b8) {
            super(b8);
        }

        public c(byte[] byArray, ax.Z8.b b8) {
            super(byArray, b8);
        }
    }
}

