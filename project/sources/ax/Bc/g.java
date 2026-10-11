package ax.Bc;

import ax.be.C1733a;
import ax.be.C1734b;
import ax.be.E;
import ax.be.G;
import ax.be.M;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes3.dex */
class g {
    private static final Map<p, ax.Bc.f> a = new a();

    static class a extends HashMap<p, ax.Bc.f> {
        a() {
            put(p.COPY, new d());
            put(p.LZMA, new k());
            put(p.LZMA2, new j());
            put(p.DEFLATE, new f());
            put(p.DEFLATE64, new e());
            put(p.BZIP2, new c());
            put(p.AES256SHA256, new ax.Bc.a());
            put(p.BCJ_X86_FILTER, new b(new M()));
            put(p.BCJ_PPC_FILTER, new b(new E()));
            put(p.BCJ_IA64_FILTER, new b(new ax.be.u()));
            put(p.BCJ_ARM_FILTER, new b(new C1733a()));
            put(p.BCJ_ARM_THUMB_FILTER, new b(new C1734b()));
            put(p.BCJ_SPARC_FILTER, new b(new G()));
            put(p.DELTA_FILTER, new h());
        }
    }

    static class b extends ax.Bc.f {
        private final ax.be.r b;

        b(ax.be.r rVar) {
            super(new Class[0]);
            this.b = rVar;
        }

        @Override // ax.Bc.f
        InputStream b(String str, InputStream inputStream, long j, ax.Bc.e eVar, byte[] bArr, int i) throws IOException {
            try {
                return this.b.b(inputStream);
            } catch (AssertionError e) {
                throw new IOException("BCJ filter used in " + str + " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z", e);
            }
        }

        @Override // ax.Bc.f
        OutputStream c(OutputStream outputStream, Object obj) {
            return new ax.Kc.m(this.b.d(new ax.be.t(outputStream)));
        }
    }

    static class c extends ax.Bc.f {
        c() {
            super(Number.class);
        }

        @Override // ax.Bc.f
        InputStream b(String str, InputStream inputStream, long j, ax.Bc.e eVar, byte[] bArr, int i) throws IOException {
            return new ax.Fc.a(inputStream);
        }

        @Override // ax.Bc.f
        OutputStream c(OutputStream outputStream, Object obj) throws IOException {
            return new ax.Fc.b(outputStream, ax.Bc.f.f(obj, 9));
        }
    }

    static class e extends ax.Bc.f {
        e() {
            super(Number.class);
        }

        @Override // ax.Bc.f
        InputStream b(String str, InputStream inputStream, long j, ax.Bc.e eVar, byte[] bArr, int i) throws IOException {
            return new ax.Gc.a(inputStream);
        }
    }

    static class f extends ax.Bc.f {
        private static final byte[] b = new byte[1];

        static class a extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
            Inflater c0;
            final InflaterInputStream q;

            public a(InflaterInputStream inflaterInputStream, Inflater inflater) {
                this.q = inflaterInputStream;
                this.c0 = inflater;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    this.q.close();
                } finally {
                    this.c0.end();
                }
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                return this.q.read();
            }

            @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return DesugarInputStream.transferTo(this, outputStream);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                return this.q.read(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr) throws IOException {
                return this.q.read(bArr);
            }
        }

        static class b extends OutputStream implements AutoCloseable {
            Deflater c0;
            final DeflaterOutputStream q;

            public b(DeflaterOutputStream deflaterOutputStream, Deflater deflater) {
                this.q = deflaterOutputStream;
                this.c0 = deflater;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    this.q.close();
                } finally {
                    this.c0.end();
                }
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                this.q.write(i);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr) throws IOException {
                this.q.write(bArr);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                this.q.write(bArr, i, i2);
            }
        }

        f() {
            super(Number.class);
        }

        @Override // ax.Bc.f
        InputStream b(String str, InputStream inputStream, long j, ax.Bc.e eVar, byte[] bArr, int i) throws IOException {
            Inflater inflater = new Inflater(true);
            return new a(new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(b)), inflater), inflater);
        }

        @Override // ax.Bc.f
        OutputStream c(OutputStream outputStream, Object obj) {
            Deflater deflater = new Deflater(ax.Bc.f.f(obj, 9), true);
            return new b(new DeflaterOutputStream(outputStream, deflater), deflater);
        }
    }

    static InputStream a(String str, InputStream inputStream, long j, ax.Bc.e eVar, byte[] bArr, int i) throws IOException {
        ax.Bc.f c2 = c(p.d(eVar.a));
        if (c2 != null) {
            return c2.b(str, inputStream, j, eVar, bArr, i);
        }
        throw new IOException("Unsupported compression method " + Arrays.toString(eVar.a) + " used in " + str);
    }

    static OutputStream b(OutputStream outputStream, p pVar, Object obj) throws IOException {
        ax.Bc.f c2 = c(pVar);
        if (c2 != null) {
            return c2.c(outputStream, obj);
        }
        throw new IOException("Unsupported compression method " + pVar);
    }

    static ax.Bc.f c(p pVar) {
        return a.get(pVar);
    }

    static class d extends ax.Bc.f {
        d() {
            super(new Class[0]);
        }

        @Override // ax.Bc.f
        OutputStream c(OutputStream outputStream, Object obj) {
            return outputStream;
        }

        @Override // ax.Bc.f
        InputStream b(String str, InputStream inputStream, long j, ax.Bc.e eVar, byte[] bArr, int i) throws IOException {
            return inputStream;
        }
    }
}
