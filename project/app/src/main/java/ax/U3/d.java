/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.util.Log;
import ax.J3.g;
import ax.M3.j;
import ax.N3.b;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d
implements m<File, ByteBuffer> {
    public m.a<ByteBuffer> c(File file, int n8, int n9, j j8) {
        return new m.a<ByteBuffer>(new ax.j4.b(file), new a(file));
    }

    public boolean d(File file) {
        return true;
    }

    private static class a
    implements ax.N3.b<ByteBuffer> {
        private final File q;

        public a(File file) {
            this.q = file;
        }

        @Override
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void e(g object, b.a<? super ByteBuffer> a8) {
            try {
                object = ax.k4.a.a(this.q);
                a8.f((ByteBuffer)object);
                return;
            }
            catch (IOException iOException) {
                if (Log.isLoggable((String)"ByteBufferFileLoader", (int)3)) {
                    Log.d((String)"ByteBufferFileLoader", (String)"Failed to obtain ByteBuffer for file", (Throwable)iOException);
                }
                a8.c(iOException);
                return;
            }
        }
    }

    public static class b
    implements n<File, ByteBuffer> {
        @Override
        public m<File, ByteBuffer> b(q q8) {
            return new d();
        }
    }
}

