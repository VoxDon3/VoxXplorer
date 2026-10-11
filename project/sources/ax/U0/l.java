package ax.U0;

import android.content.Context;
import android.net.Uri;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements g {
    private final Context a;
    private final List<z> b = new ArrayList();
    private final g c;
    private g d;
    private g e;
    private g f;
    private g g;
    private g h;
    private g i;
    private g j;
    private g k;

    public static final class a implements g.a {
        private final Context a;
        private final g.a b;
        private z c;

        public a(Context context) {
            this(context, new n.b());
        }

        @Override // ax.U0.g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a() {
            l lVar = new l(this.a, this.b.a());
            z zVar = this.c;
            if (zVar != null) {
                lVar.d(zVar);
            }
            return lVar;
        }

        public a(Context context, g.a aVar) {
            this.a = context.getApplicationContext();
            this.b = (g.a) C0968a.e(aVar);
        }
    }

    public l(Context context, g gVar) {
        this.a = context.getApplicationContext();
        this.c = (g) C0968a.e(gVar);
    }

    private void q(g gVar) {
        for (int i = 0; i < this.b.size(); i++) {
            gVar.d(this.b.get(i));
        }
    }

    private g r() {
        if (this.e == null) {
            C0993a c0993a = new C0993a(this.a);
            this.e = c0993a;
            q(c0993a);
        }
        return this.e;
    }

    private g s() {
        if (this.f == null) {
            d dVar = new d(this.a);
            this.f = dVar;
            q(dVar);
        }
        return this.f;
    }

    private g t() {
        if (this.i == null) {
            e eVar = new e();
            this.i = eVar;
            q(eVar);
        }
        return this.i;
    }

    private g u() {
        if (this.d == null) {
            q qVar = new q();
            this.d = qVar;
            q(qVar);
        }
        return this.d;
    }

    private g v() {
        if (this.j == null) {
            x xVar = new x(this.a);
            this.j = xVar;
            q(xVar);
        }
        return this.j;
    }

    private g w() {
        if (this.g == null) {
            try {
                g gVar = (g) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.g = gVar;
                q(gVar);
            } catch (ClassNotFoundException unused) {
                C0987u.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private g x() {
        if (this.h == null) {
            A a2 = new A();
            this.h = a2;
            q(a2);
        }
        return this.h;
    }

    private void y(g gVar, z zVar) {
        if (gVar != null) {
            gVar.d(zVar);
        }
    }

    @Override // ax.U0.g
    public Uri b() {
        g gVar = this.k;
        if (gVar == null) {
            return null;
        }
        return gVar.b();
    }

    @Override // ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws IOException {
        return ((g) C0968a.e(this.k)).c(bArr, i, i2);
    }

    @Override // ax.U0.g
    public void close() throws IOException {
        g gVar = this.k;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // ax.U0.g
    public void d(z zVar) {
        C0968a.e(zVar);
        this.c.d(zVar);
        this.b.add(zVar);
        y(this.d, zVar);
        y(this.e, zVar);
        y(this.f, zVar);
        y(this.g, zVar);
        y(this.h, zVar);
        y(this.i, zVar);
        y(this.j, zVar);
    }

    @Override // ax.U0.g
    public long f(k kVar) throws IOException {
        C0968a.g(this.k == null);
        String scheme = kVar.a.getScheme();
        if (d0.O0(kVar.a)) {
            String path = kVar.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.k = u();
            } else {
                this.k = r();
            }
        } else if ("asset".equals(scheme)) {
            this.k = r();
        } else if ("content".equals(scheme)) {
            this.k = s();
        } else if ("rtmp".equals(scheme)) {
            this.k = w();
        } else if ("udp".equals(scheme)) {
            this.k = x();
        } else if ("data".equals(scheme)) {
            this.k = t();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.k = v();
        } else {
            this.k = this.c;
        }
        return this.k.f(kVar);
    }

    @Override // ax.U0.g
    public Map<String, List<String>> l() {
        g gVar = this.k;
        return gVar == null ? Collections.EMPTY_MAP : gVar.l();
    }
}
