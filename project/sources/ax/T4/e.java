package ax.T4;

import ax.T4.g;
import ax.T4.j;
import ax.a5.C1370a;
import ax.b5.C1500a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;

/* loaded from: classes.dex */
public class e extends u implements Serializable {
    protected static final int l0 = a.j();
    protected static final int m0 = j.a.d();
    protected static final int n0 = g.a.d();
    public static final p o0 = ax.b5.e.i0;
    protected final transient C1370a c0;
    protected int d0;
    protected int e0;
    protected int f0;
    protected n g0;
    protected r h0;
    protected p i0;
    protected int j0;
    protected final char k0;
    protected final transient ax.a5.b q;

    public enum a implements ax.b5.g {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true),
        CHARSET_DETECTION(true);

        private final boolean q;

        a(boolean z) {
            this.q = z;
        }

        public static int j() {
            int i = 0;
            for (a aVar : values()) {
                if (aVar.d()) {
                    i |= aVar.h();
                }
            }
            return i;
        }

        @Override // ax.b5.g
        public boolean d() {
            return this.q;
        }

        @Override // ax.b5.g
        public int h() {
            return 1 << ordinal();
        }

        public boolean l(int i) {
            return (i & h()) != 0;
        }
    }

    public e() {
        this(null);
    }

    protected ax.W4.d a(Object obj) {
        return ax.W4.d.i(!n(), obj);
    }

    protected ax.W4.e b(ax.W4.d dVar, boolean z) {
        if (dVar == null) {
            dVar = ax.W4.d.o();
        }
        return new ax.W4.e(this.h0, m(), dVar, z);
    }

    protected g c(Writer writer, ax.W4.e eVar) throws IOException {
        ax.Z4.j jVar = new ax.Z4.j(eVar, this.f0, this.g0, writer, this.k0);
        int i = this.j0;
        if (i > 0) {
            jVar.d(i);
        }
        p pVar = this.i0;
        if (pVar != o0) {
            jVar.Y0(pVar);
        }
        return jVar;
    }

    protected j d(InputStream inputStream, ax.W4.e eVar) throws IOException {
        try {
            return new ax.Z4.a(eVar, inputStream).c(this.e0, this.g0, this.c0, this.q, this.d0);
        } catch (IOException | RuntimeException e) {
            if (!eVar.l()) {
                throw e;
            }
            try {
                inputStream.close();
                throw e;
            } catch (Exception e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    protected j e(Reader reader, ax.W4.e eVar) throws IOException {
        return new ax.Z4.g(eVar, this.e0, reader, this.g0, this.q.n(this.d0));
    }

    protected j f(char[] cArr, int i, int i2, ax.W4.e eVar, boolean z) throws IOException {
        return new ax.Z4.g(eVar, this.e0, null, this.g0, this.q.n(this.d0), cArr, i, i + i2, z);
    }

    protected g g(OutputStream outputStream, ax.W4.e eVar) throws IOException {
        ax.Z4.h hVar = new ax.Z4.h(eVar, this.f0, this.g0, outputStream, this.k0);
        int i = this.j0;
        if (i > 0) {
            hVar.d(i);
        }
        p pVar = this.i0;
        if (pVar != o0) {
            hVar.Y0(pVar);
        }
        return hVar;
    }

    protected Writer h(OutputStream outputStream, d dVar, ax.W4.e eVar) throws IOException {
        return dVar == d.UTF8 ? new ax.W4.n(eVar, outputStream) : new OutputStreamWriter(outputStream, dVar.h());
    }

    public C1500a m() {
        return a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.l(this.d0) ? ax.b5.b.a() : new C1500a();
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return true;
    }

    public g p(OutputStream outputStream) throws IOException {
        return q(outputStream, d.UTF8);
    }

    public g q(OutputStream outputStream, d dVar) throws IOException {
        ax.W4.e b = b(a(outputStream), false);
        b.r(dVar);
        return dVar == d.UTF8 ? g(j(outputStream, b), b) : c(l(h(outputStream, dVar, b), b), b);
    }

    public g r(Writer writer) throws IOException {
        ax.W4.e b = b(a(writer), false);
        return c(l(writer, b), b);
    }

    public j s(InputStream inputStream) throws IOException, i {
        ax.W4.e b = b(a(inputStream), false);
        return d(i(inputStream, b), b);
    }

    public j t(Reader reader) throws IOException, i {
        ax.W4.e b = b(a(reader), false);
        return e(k(reader, b), b);
    }

    public j u(String str) throws IOException, i {
        int length = str.length();
        if (length > 32768 || !o()) {
            return t(new StringReader(str));
        }
        ax.W4.e b = b(a(str), true);
        char[] g = b.g(length);
        str.getChars(0, length, g, 0);
        return f(g, 0, length, b, true);
    }

    public e(n nVar) {
        this.q = ax.a5.b.j();
        this.c0 = C1370a.u();
        this.d0 = l0;
        this.e0 = m0;
        this.f0 = n0;
        this.i0 = o0;
        this.g0 = nVar;
        this.k0 = '\"';
        this.h0 = r.a();
    }

    protected final InputStream i(InputStream inputStream, ax.W4.e eVar) throws IOException {
        return inputStream;
    }

    protected final OutputStream j(OutputStream outputStream, ax.W4.e eVar) throws IOException {
        return outputStream;
    }

    protected final Reader k(Reader reader, ax.W4.e eVar) throws IOException {
        return reader;
    }

    protected final Writer l(Writer writer, ax.W4.e eVar) throws IOException {
        return writer;
    }
}
