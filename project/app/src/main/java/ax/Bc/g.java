/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.a;
import ax.Bc.h;
import ax.Bc.j;
import ax.Bc.k;
import ax.Bc.p;
import ax.Kc.m;
import ax.be.E;
import ax.be.G;
import ax.be.M;
import ax.be.r;
import ax.be.t;
import ax.be.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

class g {
    private static final Map<p, ax.Bc.f> a = new HashMap<p, ax.Bc.f>(){
        {
            ((AbstractMap)this).put(p.c0, new d());
            ((AbstractMap)this).put(p.d0, new k());
            ((AbstractMap)this).put(p.e0, new j());
            ((AbstractMap)this).put(p.f0, new f());
            ((AbstractMap)this).put(p.g0, new e());
            ((AbstractMap)this).put(p.h0, new c());
            ((AbstractMap)this).put(p.i0, new a());
            ((AbstractMap)this).put(p.j0, new b(new M()));
            ((AbstractMap)this).put(p.k0, new b(new E()));
            ((AbstractMap)this).put(p.l0, new b(new u()));
            ((AbstractMap)this).put(p.m0, new b(new ax.be.a()));
            ((AbstractMap)this).put(p.n0, new b(new ax.be.b()));
            ((AbstractMap)this).put(p.o0, new b(new G()));
            ((AbstractMap)this).put(p.p0, new h());
        }
    };

    static InputStream a(String string, InputStream object, long l8, ax.Bc.e e8, byte[] byArray, int n8) throws IOException {
        ax.Bc.f f8 = g.c(p.d(e8.a));
        if (f8 != null) {
            return f8.b(string, (InputStream)object, l8, e8, byArray, n8);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unsupported compression method ");
        ((StringBuilder)object).append(Arrays.toString(e8.a));
        ((StringBuilder)object).append(" used in ");
        ((StringBuilder)object).append(string);
        throw new IOException(((StringBuilder)object).toString());
    }

    static OutputStream b(OutputStream object, p p8, Object object2) throws IOException {
        ax.Bc.f f8 = g.c(p8);
        if (f8 != null) {
            return f8.c((OutputStream)object, object2);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unsupported compression method ");
        ((StringBuilder)object).append((Object)p8);
        throw new IOException(((StringBuilder)object).toString());
    }

    static ax.Bc.f c(p p8) {
        return a.get((Object)p8);
    }

    static class b
    extends ax.Bc.f {
        private final r b;

        b(r r8) {
            super(new Class[0]);
            this.b = r8;
        }

        @Override
        InputStream b(String string, InputStream object, long l8, ax.Bc.e e8, byte[] byArray, int n8) throws IOException {
            try {
                object = this.b.b((InputStream)object);
                return object;
            }
            catch (AssertionError assertionError) {
                object = new StringBuilder();
                ((StringBuilder)object).append("BCJ filter used in ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z");
                throw new IOException(((StringBuilder)object).toString(), (Throwable)((Object)assertionError));
            }
        }

        @Override
        OutputStream c(OutputStream outputStream, Object object) {
            return new m(this.b.d(new t(outputStream)));
        }
    }

    static class c
    extends ax.Bc.f {
        c() {
            super(Number.class);
        }

        @Override
        InputStream b(String string, InputStream inputStream, long l8, ax.Bc.e e8, byte[] byArray, int n8) throws IOException {
            return new ax.Fc.a(inputStream);
        }

        @Override
        OutputStream c(OutputStream outputStream, Object object) throws IOException {
            return new ax.Fc.b(outputStream, ax.Bc.f.f(object, 9));
        }
    }

    static class d
    extends ax.Bc.f {
        d() {
            super(new Class[0]);
        }

        @Override
        InputStream b(String string, InputStream inputStream, long l8, ax.Bc.e e8, byte[] byArray, int n8) throws IOException {
            return inputStream;
        }

        @Override
        OutputStream c(OutputStream outputStream, Object object) {
            return outputStream;
        }
    }

    static class e
    extends ax.Bc.f {
        e() {
            super(Number.class);
        }

        @Override
        InputStream b(String string, InputStream inputStream, long l8, ax.Bc.e e8, byte[] byArray, int n8) throws IOException {
            return new ax.Gc.a(inputStream);
        }
    }

    static class f
    extends ax.Bc.f {
        private static final byte[] b = new byte[1];

        f() {
            super(Number.class);
        }

        @Override
        InputStream b(String object, InputStream inputStream, long l8, ax.Bc.e e8, byte[] byArray, int n8) throws IOException {
            object = new Inflater(true);
            return new a(new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(b)), (Inflater)object), (Inflater)object);
        }

        @Override
        OutputStream c(OutputStream outputStream, Object object) {
            object = new Deflater(ax.Bc.f.f(object, 9), true);
            return new b(new DeflaterOutputStream(outputStream, (Deflater)object), (Deflater)object);
        }

        static class a
        extends InputStream
        implements j.InputStreamRetargetInterface,
        AutoCloseable {
            Inflater c0;
            final InflaterInputStream q;

            public a(InflaterInputStream inflaterInputStream, Inflater inflater) {
                this.q = inflaterInputStream;
                this.c0 = inflater;
            }

            @Override
            public void close() throws IOException {
                try {
                    this.q.close();
                    return;
                }
                finally {
                    this.c0.end();
                }
            }

            @Override
            public int read() throws IOException {
                return this.q.read();
            }

            @Override
            public int read(byte[] byArray) throws IOException {
                return ((InputStream)this.q).read(byArray);
            }

            @Override
            public int read(byte[] byArray, int n8, int n9) throws IOException {
                return this.q.read(byArray, n8, n9);
            }

            @Override
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
            }
        }

        static class b
        extends OutputStream
        implements AutoCloseable {
            Deflater c0;
            final DeflaterOutputStream q;

            public b(DeflaterOutputStream deflaterOutputStream, Deflater deflater) {
                this.q = deflaterOutputStream;
                this.c0 = deflater;
            }

            @Override
            public void close() throws IOException {
                try {
                    this.q.close();
                    return;
                }
                finally {
                    this.c0.end();
                }
            }

            @Override
            public void write(int n8) throws IOException {
                this.q.write(n8);
            }

            @Override
            public void write(byte[] byArray) throws IOException {
                ((OutputStream)this.q).write(byArray);
            }

            @Override
            public void write(byte[] byArray, int n8, int n9) throws IOException {
                this.q.write(byArray, n8, n9);
            }
        }
    }
}

