/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.content.Context;
import android.net.Uri;
import ax.S0.d0;
import ax.S0.u;
import ax.U0.A;
import ax.U0.d;
import ax.U0.e;
import ax.U0.g;
import ax.U0.k;
import ax.U0.n;
import ax.U0.q;
import ax.U0.x;
import ax.U0.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class l
implements g {
    private final Context a;
    private final List<z> b;
    private final g c;
    private g d;
    private g e;
    private g f;
    private g g;
    private g h;
    private g i;
    private g j;
    private g k;

    public l(Context context, g g8) {
        this.a = context.getApplicationContext();
        this.c = ax.S0.a.e(g8);
        this.b = new ArrayList<z>();
    }

    private void q(g g8) {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            g8.d(this.b.get(i8));
        }
    }

    private g r() {
        if (this.e == null) {
            ax.U0.a a8 = new ax.U0.a(this.a);
            this.e = a8;
            this.q(a8);
        }
        return this.e;
    }

    private g s() {
        if (this.f == null) {
            d d8 = new d(this.a);
            this.f = d8;
            this.q(d8);
        }
        return this.f;
    }

    private g t() {
        if (this.i == null) {
            e e8 = new e();
            this.i = e8;
            this.q(e8);
        }
        return this.i;
    }

    private g u() {
        if (this.d == null) {
            q q8 = new q();
            this.d = q8;
            this.q(q8);
        }
        return this.d;
    }

    private g v() {
        if (this.j == null) {
            x x8 = new x(this.a);
            this.j = x8;
            this.q(x8);
        }
        return this.j;
    }

    private g w() {
        if (this.g == null) {
            try {
                g g8;
                this.g = g8 = (g)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.q(g8);
            }
            catch (Exception exception) {
                throw new RuntimeException("Error instantiating RTMP extension", exception);
            }
            catch (ClassNotFoundException classNotFoundException) {
                u.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private g x() {
        if (this.h == null) {
            A a8 = new A();
            this.h = a8;
            this.q(a8);
        }
        return this.h;
    }

    private void y(g g8, z z8) {
        if (g8 != null) {
            g8.d(z8);
        }
    }

    @Override
    public Uri b() {
        g g8 = this.k;
        if (g8 == null) {
            return null;
        }
        return g8.b();
    }

    @Override
    public int c(byte[] byArray, int n8, int n9) throws IOException {
        return ax.S0.a.e(this.k).c(byArray, n8, n9);
    }

    @Override
    public void close() throws IOException {
        g g8 = this.k;
        if (g8 != null) {
            try {
                g8.close();
                return;
            }
            finally {
                this.k = null;
            }
        }
    }

    @Override
    public void d(z z8) {
        ax.S0.a.e(z8);
        this.c.d(z8);
        this.b.add(z8);
        this.y(this.d, z8);
        this.y(this.e, z8);
        this.y(this.f, z8);
        this.y(this.g, z8);
        this.y(this.h, z8);
        this.y(this.i, z8);
        this.y(this.j, z8);
    }

    @Override
    public long f(k k8) throws IOException {
        boolean bl = this.k == null;
        ax.S0.a.g(bl);
        String string = k8.a.getScheme();
        this.k = d0.O0(k8.a) ? ((string = k8.a.getPath()) != null && string.startsWith("/android_asset/") ? this.r() : this.u()) : ("asset".equals(string) ? this.r() : ("content".equals(string) ? this.s() : ("rtmp".equals(string) ? this.w() : ("udp".equals(string) ? this.x() : ("data".equals(string) ? this.t() : (!"rawresource".equals(string) && !"android.resource".equals(string) ? this.c : this.v()))))));
        return this.k.f(k8);
    }

    @Override
    public Map<String, List<String>> l() {
        g g8 = this.k;
        if (g8 == null) {
            return Collections.EMPTY_MAP;
        }
        return g8.l();
    }

    public static final class a
    implements g.a {
        private final Context a;
        private final g.a b;
        private z c;

        public a(Context context) {
            this(context, new n.b());
        }

        public a(Context context, g.a a8) {
            this.a = context.getApplicationContext();
            this.b = ax.S0.a.e(a8);
        }

        public l b() {
            l l8 = new l(this.a, this.b.a());
            z z8 = this.c;
            if (z8 != null) {
                l8.d(z8);
            }
            return l8;
        }
    }
}

