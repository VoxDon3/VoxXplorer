/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import ax.P0.v;
import ax.f1.D;
import ax.f1.o;
import ax.f1.t;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface x {
    public void a(Bundle var1);

    public void b(int var1, int var2, ax.V0.c var3, long var4, int var6);

    public void c(int var1, int var2, int var3, long var4, int var6);

    public void d();

    public boolean e();

    public MediaFormat f();

    public void flush();

    public void g();

    public boolean h(c var1);

    public void i(int var1, long var2);

    public int j();

    public void k(d var1, Handler var2);

    public int l(MediaCodec.BufferInfo var1);

    public void m(int var1, boolean var2);

    public void n(int var1);

    public ByteBuffer o(int var1);

    public void p(Surface var1);

    public ByteBuffer q(int var1);

    public static final class a {
        public final D a;
        public final MediaFormat b;
        public final v c;
        public final Surface d;
        public final MediaCrypto e;
        public final t f;

        private a(D d8, MediaFormat mediaFormat, v v8, Surface surface, MediaCrypto mediaCrypto, t t8) {
            this.a = d8;
            this.b = mediaFormat;
            this.c = v8;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = t8;
        }

        public static a a(D d8, MediaFormat mediaFormat, v v8, MediaCrypto mediaCrypto, t t8) {
            return new a(d8, mediaFormat, v8, null, mediaCrypto, t8);
        }

        public static a b(D d8, MediaFormat mediaFormat, v v8, Surface surface, MediaCrypto mediaCrypto) {
            return new a(d8, mediaFormat, v8, surface, mediaCrypto, null);
        }
    }

    public static interface b {
        @Deprecated
        public static final b a = new o();

        public x a(a var1) throws IOException;
    }

    public static interface c {
        public void a();

        public void b();
    }

    public static interface d {
        public void a(x var1, long var2, long var4);
    }
}

