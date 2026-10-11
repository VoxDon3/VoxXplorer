/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import ax.J3.g;
import ax.M3.j;
import ax.N3.b;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b<Data>
implements m<byte[], Data> {
    private final b<Data> a;

    public b(b<Data> b8) {
        this.a = b8;
    }

    public m.a<Data> c(byte[] byArray, int n8, int n9, j j8) {
        return new m.a<Data>(ax.j4.a.c(), new c<Data>(byArray, this.a));
    }

    public boolean d(byte[] byArray) {
        return true;
    }

    public static class a
    implements n<byte[], ByteBuffer> {
        @Override
        public m<byte[], ByteBuffer> b(q q8) {
            return new b<ByteBuffer>(new b<ByteBuffer>(this){
                final a a;
                {
                    this.a = a8;
                }

                @Override
                public Class<ByteBuffer> a() {
                    return ByteBuffer.class;
                }

                public ByteBuffer c(byte[] byArray) {
                    return ByteBuffer.wrap(byArray);
                }
            });
        }
    }

    public static interface b<Data> {
        public Class<Data> a();

        public Data b(byte[] var1);
    }

    private static class c<Data>
    implements ax.N3.b<Data> {
        private final b<Data> c0;
        private final byte[] q;

        public c(byte[] byArray, b<Data> b8) {
            this.q = byArray;
            this.c0 = b8;
        }

        @Override
        public Class<Data> a() {
            return this.c0.a();
        }

        @Override
        public void b() {
        }

        @Override
        public void cancel() {
        }

        @Override
        public ax.M3.a d() {
            return ax.M3.a.q;
        }

        @Override
        public void e(g g8, b.a<? super Data> a8) {
            a8.f(this.c0.b(this.q));
        }
    }

    public static class d
    implements n<byte[], InputStream> {
        @Override
        public m<byte[], InputStream> b(q q8) {
            return new b<InputStream>(new b<InputStream>(this){
                final d a;
                {
                    this.a = d8;
                }

                @Override
                public Class<InputStream> a() {
                    return InputStream.class;
                }

                public InputStream c(byte[] byArray) {
                    return new ByteArrayInputStream(byArray);
                }
            });
        }
    }
}

