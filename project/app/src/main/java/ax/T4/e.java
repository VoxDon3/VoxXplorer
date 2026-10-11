/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.T4.d;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.n;
import ax.T4.p;
import ax.T4.r;
import ax.T4.u;
import ax.Z4.c;
import ax.Z4.h;
import ax.b5.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;

public class e
extends u
implements Serializable {
    protected static final int l0 = a.j();
    protected static final int m0 = j.a.d();
    protected static final int n0 = g.a.d();
    public static final p o0 = ax.b5.e.i0;
    protected final transient ax.a5.a c0;
    protected int d0;
    protected int e0;
    protected int f0;
    protected n g0;
    protected r h0;
    protected p i0;
    protected int j0;
    protected final char k0;
    protected final transient ax.a5.b q = ax.a5.b.j();

    public e() {
        this(null);
    }

    public e(n n8) {
        this.c0 = ax.a5.a.u();
        this.d0 = l0;
        this.e0 = m0;
        this.f0 = n0;
        this.i0 = o0;
        this.g0 = n8;
        this.k0 = (char)34;
        this.h0 = r.a();
    }

    protected ax.W4.d a(Object object) {
        return ax.W4.d.i(this.n() ^ true, object);
    }

    protected ax.W4.e b(ax.W4.d d8, boolean bl) {
        ax.W4.d d9 = d8;
        if (d8 == null) {
            d9 = ax.W4.d.o();
        }
        return new ax.W4.e(this.h0, this.m(), d9, bl);
    }

    protected g c(Writer closeable, ax.W4.e object) throws IOException {
        closeable = new ax.Z4.j((ax.W4.e)object, this.f0, this.g0, (Writer)closeable, this.k0);
        int n8 = this.j0;
        if (n8 > 0) {
            ((c)closeable).d(n8);
        }
        if ((object = this.i0) != o0) {
            ((c)closeable).Y0((p)object);
        }
        return closeable;
    }

    /*
     * WARNING - void declaration
     */
    protected j d(InputStream inputStream, ax.W4.e e8) throws IOException {
        RuntimeException var3_6;
        try {
            Object object = new ax.Z4.a(e8, inputStream);
            object = ((ax.Z4.a)object).c(this.e0, this.g0, this.c0, this.q, this.d0);
            return object;
        }
        catch (RuntimeException runtimeException) {
        }
        catch (IOException iOException) {}
        if (e8.l()) {
            try {
                inputStream.close();
            }
            catch (Exception exception) {
                var3_6.addSuppressed(exception);
            }
        }
        throw var3_6;
    }

    protected j e(Reader reader, ax.W4.e e8) throws IOException {
        return new ax.Z4.g(e8, this.e0, reader, this.g0, this.q.n(this.d0));
    }

    protected j f(char[] cArray, int n8, int n9, ax.W4.e e8, boolean bl) throws IOException {
        return new ax.Z4.g(e8, this.e0, null, this.g0, this.q.n(this.d0), cArray, n8, n8 + n9, bl);
    }

    protected g g(OutputStream object, ax.W4.e object2) throws IOException {
        object2 = new h((ax.W4.e)object2, this.f0, this.g0, (OutputStream)object, this.k0);
        int n8 = this.j0;
        if (n8 > 0) {
            ((c)object2).d(n8);
        }
        if ((object = this.i0) != o0) {
            ((c)object2).Y0((p)object);
        }
        return object2;
    }

    protected Writer h(OutputStream outputStream, d d8, ax.W4.e e8) throws IOException {
        if (d8 == d.e0) {
            return new ax.W4.n(e8, outputStream);
        }
        return new OutputStreamWriter(outputStream, d8.h());
    }

    protected final InputStream i(InputStream inputStream, ax.W4.e e8) throws IOException {
        return inputStream;
    }

    protected final OutputStream j(OutputStream outputStream, ax.W4.e e8) throws IOException {
        return outputStream;
    }

    protected final Reader k(Reader reader, ax.W4.e e8) throws IOException {
        return reader;
    }

    protected final Writer l(Writer writer, ax.W4.e e8) throws IOException {
        return writer;
    }

    public ax.b5.a m() {
        if (a.f0.l(this.d0)) {
            return b.a();
        }
        return new ax.b5.a();
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return true;
    }

    public g p(OutputStream outputStream) throws IOException {
        return this.q(outputStream, d.e0);
    }

    public g q(OutputStream outputStream, d d8) throws IOException {
        ax.W4.e e8 = this.b(this.a(outputStream), false);
        e8.r(d8);
        if (d8 == d.e0) {
            return this.g(this.j(outputStream, e8), e8);
        }
        return this.c(this.l(this.h(outputStream, d8, e8), e8), e8);
    }

    public g r(Writer writer) throws IOException {
        ax.W4.e e8 = this.b(this.a(writer), false);
        return this.c(this.l(writer, e8), e8);
    }

    public j s(InputStream inputStream) throws IOException, i {
        ax.W4.e e8 = this.b(this.a(inputStream), false);
        return this.d(this.i(inputStream, e8), e8);
    }

    public j t(Reader reader) throws IOException, i {
        ax.W4.e e8 = this.b(this.a(reader), false);
        return this.e(this.k(reader, e8), e8);
    }

    public j u(String string) throws IOException, i {
        int n8 = string.length();
        if (n8 <= 32768 && this.o()) {
            ax.W4.e e8 = this.b(this.a(string), true);
            char[] cArray = e8.g(n8);
            string.getChars(0, n8, cArray, 0);
            return this.f(cArray, 0, n8, e8, true);
        }
        return this.t(new StringReader(string));
    }

    public static final class a
    extends Enum<a>
    implements ax.b5.g {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        private static final a[] h0;
        private final boolean q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            c0 = a12 = new a(true);
            d0 = a11 = new a(true);
            e0 = a10 = new a(true);
            f0 = a9 = new a(true);
            g0 = a8 = new a(true);
            h0 = new a[]{a12, a11, a10, a9, a8};
        }

        private a(boolean bl) {
            this.q = bl;
        }

        public static int j() {
            a[] aArray = a.values();
            int n8 = aArray.length;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                a a8 = aArray[i8];
                int n10 = n9;
                if (a8.d()) {
                    n10 = n9 | a8.h();
                }
                n9 = n10;
            }
            return n9;
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])h0.clone();
        }

        @Override
        public boolean d() {
            return this.q;
        }

        @Override
        public int h() {
            return 1 << this.ordinal();
        }

        public boolean l(int n8) {
            return (n8 & this.h()) != 0;
        }
    }
}

