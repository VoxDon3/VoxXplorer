/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.util.Base64;
import ax.J3.g;
import ax.M3.j;
import ax.N3.b;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class e<Data>
implements m<String, Data> {
    private final a<Data> a;

    public e(a<Data> a8) {
        this.a = a8;
    }

    public m.a<Data> c(String string, int n8, int n9, j j8) {
        return new m.a<Data>(new ax.j4.b(string), new b<Data>(string, this.a));
    }

    public boolean d(String string) {
        return string.startsWith("data:image");
    }

    public static interface a<Data> {
        public Class<Data> a();

        public void b(Data var1) throws IOException;

        public Data c(String var1) throws IllegalArgumentException;
    }

    private static final class b<Data>
    implements ax.N3.b<Data> {
        private final a<Data> c0;
        private Data d0;
        private final String q;

        public b(String string, a<Data> a8) {
            this.q = string;
            this.c0 = a8;
        }

        @Override
        public Class<Data> a() {
            return this.c0.a();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void b() {
            try {
                this.c0.b(this.d0);
                return;
            }
            catch (IOException iOException) {
                return;
            }
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
            try {
                g8 = this.c0.c(this.q);
                this.d0 = g8;
                a8.f((Data)((Object)g8));
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                a8.c(illegalArgumentException);
                return;
            }
        }
    }

    public static final class c
    implements n<String, InputStream> {
        private final a<InputStream> a = new a<InputStream>(this){
            final c a;
            {
                this.a = c8;
            }

            @Override
            public Class<InputStream> a() {
                return InputStream.class;
            }

            public void d(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            public InputStream e(String string) {
                if (string.startsWith("data:image")) {
                    int n8 = string.indexOf(44);
                    if (n8 != -1) {
                        if (string.substring(0, n8).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode((String)string.substring(n8 + 1), (int)0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        };

        @Override
        public final m<String, InputStream> b(q q8) {
            return new e<InputStream>(this.a);
        }
    }
}

