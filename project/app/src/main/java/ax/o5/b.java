/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.k;
import ax.o5.m;
import ax.o5.n;
import ax.o5.o;
import ax.o5.p;
import ax.o5.q;
import ax.o5.r;
import ax.o5.s;
import ax.o5.t;
import ax.o5.u;
import ax.o5.w;
import java.io.IOException;

public final class b
implements ax.V7.a {
    public static final ax.V7.a a = new b();

    private b() {
    }

    @Override
    public void a(ax.V7.b<?> b8) {
        ax.U7.d<n> d8 = b.a;
        b8.a(n.class, d8);
        b8.a(ax.o5.d.class, d8);
        d8 = i.a;
        b8.a(u.class, d8);
        b8.a(k.class, d8);
        d8 = c.a;
        b8.a(o.class, d8);
        b8.a(ax.o5.e.class, d8);
        d8 = ax.o5.b$a.a;
        b8.a(ax.o5.a.class, d8);
        b8.a(ax.o5.c.class, d8);
        d8 = h.a;
        b8.a(t.class, d8);
        b8.a(ax.o5.j.class, d8);
        d8 = d.a;
        b8.a(p.class, d8);
        b8.a(ax.o5.f.class, d8);
        d8 = g.a;
        b8.a(s.class, d8);
        b8.a(ax.o5.i.class, d8);
        d8 = f.a;
        b8.a(r.class, d8);
        b8.a(ax.o5.h.class, d8);
        d8 = j.a;
        b8.a(w.class, d8);
        b8.a(m.class, d8);
        d8 = e.a;
        b8.a(q.class, d8);
        b8.a(ax.o5.g.class, d8);
    }

    private static final class a
    implements ax.U7.d<ax.o5.a> {
        static final a a = new a();
        private static final ax.U7.c b = ax.U7.c.d("sdkVersion");
        private static final ax.U7.c c = ax.U7.c.d("model");
        private static final ax.U7.c d = ax.U7.c.d("hardware");
        private static final ax.U7.c e = ax.U7.c.d("device");
        private static final ax.U7.c f = ax.U7.c.d("product");
        private static final ax.U7.c g = ax.U7.c.d("osBuild");
        private static final ax.U7.c h = ax.U7.c.d("manufacturer");
        private static final ax.U7.c i = ax.U7.c.d("fingerprint");
        private static final ax.U7.c j = ax.U7.c.d("locale");
        private static final ax.U7.c k = ax.U7.c.d("country");
        private static final ax.U7.c l = ax.U7.c.d("mccMnc");
        private static final ax.U7.c m = ax.U7.c.d("applicationBuild");

        private a() {
        }

        public void b(ax.o5.a a8, ax.U7.e e8) throws IOException {
            e8.e(b, a8.m());
            e8.e(c, a8.j());
            e8.e(d, a8.f());
            e8.e(e, a8.d());
            e8.e(f, a8.l());
            e8.e(g, a8.k());
            e8.e(h, a8.h());
            e8.e(i, a8.e());
            e8.e(j, a8.g());
            e8.e(k, a8.c());
            e8.e(l, a8.i());
            e8.e(m, a8.b());
        }
    }

    private static final class b
    implements ax.U7.d<n> {
        static final b a = new b();
        private static final ax.U7.c b = ax.U7.c.d("logRequest");

        private b() {
        }

        public void b(n n8, ax.U7.e e8) throws IOException {
            e8.e(b, n8.c());
        }
    }

    private static final class c
    implements ax.U7.d<o> {
        static final c a = new c();
        private static final ax.U7.c b = ax.U7.c.d("clientType");
        private static final ax.U7.c c = ax.U7.c.d("androidClientInfo");

        private c() {
        }

        public void b(o o8, ax.U7.e e8) throws IOException {
            e8.e(b, (Object)o8.c());
            e8.e(c, o8.b());
        }
    }

    private static final class d
    implements ax.U7.d<p> {
        static final d a = new d();
        private static final ax.U7.c b = ax.U7.c.d("privacyContext");
        private static final ax.U7.c c = ax.U7.c.d("productIdOrigin");

        private d() {
        }

        public void b(p p8, ax.U7.e e8) throws IOException {
            e8.e(b, p8.b());
            e8.e(c, (Object)p8.c());
        }
    }

    private static final class e
    implements ax.U7.d<q> {
        static final e a = new e();
        private static final ax.U7.c b = ax.U7.c.d("clearBlob");
        private static final ax.U7.c c = ax.U7.c.d("encryptedBlob");

        private e() {
        }

        public void b(q q8, ax.U7.e e8) throws IOException {
            e8.e(b, q8.b());
            e8.e(c, q8.c());
        }
    }

    private static final class f
    implements ax.U7.d<r> {
        static final f a = new f();
        private static final ax.U7.c b = ax.U7.c.d("originAssociatedProductId");

        private f() {
        }

        public void b(r r8, ax.U7.e e8) throws IOException {
            e8.e(b, r8.b());
        }
    }

    private static final class g
    implements ax.U7.d<s> {
        static final g a = new g();
        private static final ax.U7.c b = ax.U7.c.d("prequest");

        private g() {
        }

        public void b(s s8, ax.U7.e e8) throws IOException {
            e8.e(b, s8.b());
        }
    }

    private static final class h
    implements ax.U7.d<t> {
        static final h a = new h();
        private static final ax.U7.c b = ax.U7.c.d("eventTimeMs");
        private static final ax.U7.c c = ax.U7.c.d("eventCode");
        private static final ax.U7.c d = ax.U7.c.d("complianceData");
        private static final ax.U7.c e = ax.U7.c.d("eventUptimeMs");
        private static final ax.U7.c f = ax.U7.c.d("sourceExtension");
        private static final ax.U7.c g = ax.U7.c.d("sourceExtensionJsonProto3");
        private static final ax.U7.c h = ax.U7.c.d("timezoneOffsetSeconds");
        private static final ax.U7.c i = ax.U7.c.d("networkConnectionInfo");
        private static final ax.U7.c j = ax.U7.c.d("experimentIds");

        private h() {
        }

        public void b(t t8, ax.U7.e e8) throws IOException {
            e8.c(b, t8.d());
            e8.e(c, t8.c());
            e8.e(d, t8.b());
            e8.c(e, t8.e());
            e8.e(f, t8.h());
            e8.e(g, t8.i());
            e8.c(h, t8.j());
            e8.e(i, t8.g());
            e8.e(j, t8.f());
        }
    }

    private static final class i
    implements ax.U7.d<u> {
        static final i a = new i();
        private static final ax.U7.c b = ax.U7.c.d("requestTimeMs");
        private static final ax.U7.c c = ax.U7.c.d("requestUptimeMs");
        private static final ax.U7.c d = ax.U7.c.d("clientInfo");
        private static final ax.U7.c e = ax.U7.c.d("logSource");
        private static final ax.U7.c f = ax.U7.c.d("logSourceName");
        private static final ax.U7.c g = ax.U7.c.d("logEvent");
        private static final ax.U7.c h = ax.U7.c.d("qosTier");

        private i() {
        }

        public void b(u u8, ax.U7.e e8) throws IOException {
            e8.c(b, u8.g());
            e8.c(c, u8.h());
            e8.e(d, u8.b());
            e8.e(e, u8.d());
            e8.e(f, u8.e());
            e8.e(g, u8.c());
            e8.e(h, (Object)u8.f());
        }
    }

    private static final class j
    implements ax.U7.d<w> {
        static final j a = new j();
        private static final ax.U7.c b = ax.U7.c.d("networkType");
        private static final ax.U7.c c = ax.U7.c.d("mobileSubtype");

        private j() {
        }

        public void b(w w8, ax.U7.e e8) throws IOException {
            e8.e(b, (Object)w8.c());
            e8.e(c, (Object)w8.b());
        }
    }
}

