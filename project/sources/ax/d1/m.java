package ax.d1;

import android.net.Uri;
import ax.i1.N;
import ax.m1.m;
import java.io.IOException;

/* loaded from: classes.dex */
public interface m {

    public interface a {
        m a(ax.c1.d dVar, ax.m1.m mVar, l lVar, ax.m1.f fVar);
    }

    public interface b {
        void f();

        boolean h(Uri uri, m.c cVar, boolean z);
    }

    public static final class c extends IOException {
        public final Uri q;

        public c(Uri uri) {
            this.q = uri;
        }
    }

    public static final class d extends IOException {
        public final Uri q;

        public d(Uri uri) {
            this.q = uri;
        }
    }

    public interface e {
        void f(f fVar);
    }

    boolean a(Uri uri);

    void b(Uri uri);

    void c(Uri uri) throws IOException;

    void d(Uri uri, N.a aVar, e eVar);

    long e();

    void f(b bVar);

    boolean g();

    i h();

    boolean i(Uri uri, long j);

    void l() throws IOException;

    void m(Uri uri);

    f n(Uri uri, boolean z);

    void o(b bVar);

    void stop();
}
