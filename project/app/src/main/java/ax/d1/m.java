/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

import android.net.Uri;
import ax.d1.f;
import ax.d1.i;
import ax.d1.l;
import ax.i1.N;
import ax.m1.m;
import java.io.IOException;

public interface m {
    public boolean a(Uri var1);

    public void b(Uri var1);

    public void c(Uri var1) throws IOException;

    public void d(Uri var1, N.a var2, e var3);

    public long e();

    public void f(b var1);

    public boolean g();

    public i h();

    public boolean i(Uri var1, long var2);

    public void l() throws IOException;

    public void m(Uri var1);

    public f n(Uri var1, boolean var2);

    public void o(b var1);

    public void stop();

    public static interface a {
        public m a(ax.c1.d var1, ax.m1.m var2, l var3, ax.m1.f var4);
    }

    public static interface b {
        public void f();

        public boolean h(Uri var1, m.c var2, boolean var3);
    }

    public static final class c
    extends IOException {
        public final Uri q;

        public c(Uri uri) {
            this.q = uri;
        }
    }

    public static final class d
    extends IOException {
        public final Uri q;

        public d(Uri uri) {
            this.q = uri;
        }
    }

    public static interface e {
        public void f(f var1);
    }
}

