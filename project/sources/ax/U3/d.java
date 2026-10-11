package ax.U3;

import android.util.Log;
import ax.N3.b;
import ax.U3.m;
import ax.k4.C2397a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d implements m<File, ByteBuffer> {

    public static class b implements n<File, ByteBuffer> {
        @Override // ax.U3.n
        public m<File, ByteBuffer> b(q qVar) {
            return new d();
        }
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<ByteBuffer> a(File file, int i, int i2, ax.M3.j jVar) {
        return new m.a<>(new ax.j4.b(file), new a(file));
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }

    private static class a implements ax.N3.b<ByteBuffer> {
        private final File q;

        public a(File file) {
            this.q = file;
        }

        @Override // ax.N3.b
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // ax.N3.b
        public ax.M3.a d() {
            return ax.M3.a.LOCAL;
        }

        @Override // ax.N3.b
        public void e(ax.J3.g gVar, b.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(C2397a.a(this.q));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.c(e);
            }
        }

        @Override // ax.N3.b
        public void b() {
        }

        @Override // ax.N3.b
        public void cancel() {
        }
    }
}
