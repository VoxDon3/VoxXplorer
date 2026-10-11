package ax.f1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import ax.P0.C0912v;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.f1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2029x {

    /* renamed from: ax.f1.x$a */
    public static final class a {
        public final C2006D a;
        public final MediaFormat b;
        public final C0912v c;
        public final Surface d;
        public final MediaCrypto e;
        public final C2025t f;

        private a(C2006D c2006d, MediaFormat mediaFormat, C0912v c0912v, Surface surface, MediaCrypto mediaCrypto, C2025t c2025t) {
            this.a = c2006d;
            this.b = mediaFormat;
            this.c = c0912v;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = c2025t;
        }

        public static a a(C2006D c2006d, MediaFormat mediaFormat, C0912v c0912v, MediaCrypto mediaCrypto, C2025t c2025t) {
            return new a(c2006d, mediaFormat, c0912v, null, mediaCrypto, c2025t);
        }

        public static a b(C2006D c2006d, MediaFormat mediaFormat, C0912v c0912v, Surface surface, MediaCrypto mediaCrypto) {
            return new a(c2006d, mediaFormat, c0912v, surface, mediaCrypto, null);
        }
    }

    /* renamed from: ax.f1.x$b */
    public interface b {

        @Deprecated
        public static final b a = new C2021o();

        InterfaceC2029x a(a aVar) throws IOException;
    }

    /* renamed from: ax.f1.x$c */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: ax.f1.x$d */
    public interface d {
        void a(InterfaceC2029x interfaceC2029x, long j, long j2);
    }

    void a(Bundle bundle);

    void b(int i, int i2, ax.V0.c cVar, long j, int i3);

    void c(int i, int i2, int i3, long j, int i4);

    void d();

    boolean e();

    MediaFormat f();

    void flush();

    void g();

    boolean h(c cVar);

    void i(int i, long j);

    int j();

    void k(d dVar, Handler handler);

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(int i, boolean z);

    void n(int i);

    ByteBuffer o(int i);

    void p(Surface surface);

    ByteBuffer q(int i);
}
