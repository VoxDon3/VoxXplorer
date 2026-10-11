/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.A;
import ax.L7.F;
import java.io.IOException;

public final class a
implements ax.V7.a {
    public static final ax.V7.a a = new a();

    private a() {
    }

    @Override
    public void a(ax.V7.b<?> b8) {
        ax.U7.d<F> d8 = d.a;
        b8.a(F.class, d8);
        b8.a(ax.L7.b.class, d8);
        d8 = j.a;
        b8.a(F.e.class, d8);
        b8.a(ax.L7.h.class, d8);
        d8 = g.a;
        b8.a(F.e.a.class, d8);
        b8.a(ax.L7.i.class, d8);
        d8 = h.a;
        b8.a(F.e.a.b.class, d8);
        b8.a(ax.L7.j.class, d8);
        d8 = z.a;
        b8.a(F.e.f.class, d8);
        b8.a(A.class, d8);
        d8 = y.a;
        b8.a(F.e.e.class, d8);
        b8.a(ax.L7.z.class, d8);
        d8 = i.a;
        b8.a(F.e.c.class, d8);
        b8.a(ax.L7.k.class, d8);
        d8 = t.a;
        b8.a(F.e.d.class, d8);
        b8.a(ax.L7.l.class, d8);
        d8 = k.a;
        b8.a(F.e.d.a.class, d8);
        b8.a(ax.L7.m.class, d8);
        d8 = m.a;
        b8.a(F.e.d.a.b.class, d8);
        b8.a(ax.L7.n.class, d8);
        d8 = p.a;
        b8.a(F.e.d.a.b.e.class, d8);
        b8.a(ax.L7.r.class, d8);
        d8 = q.a;
        b8.a(F.e.d.a.b.e.b.class, d8);
        b8.a(ax.L7.s.class, d8);
        d8 = n.a;
        b8.a(F.e.d.a.b.c.class, d8);
        b8.a(ax.L7.p.class, d8);
        d8 = b.a;
        b8.a(F.a.class, d8);
        b8.a(ax.L7.c.class, d8);
        d8 = ax.L7.a$a.a;
        b8.a(F.a.a.class, d8);
        b8.a(ax.L7.d.class, d8);
        d8 = o.a;
        b8.a(F.e.d.a.b.d.class, d8);
        b8.a(ax.L7.q.class, d8);
        d8 = l.a;
        b8.a(F.e.d.a.b.a.class, d8);
        b8.a(ax.L7.o.class, d8);
        d8 = c.a;
        b8.a(F.c.class, d8);
        b8.a(ax.L7.e.class, d8);
        d8 = r.a;
        b8.a(F.e.d.a.c.class, d8);
        b8.a(ax.L7.t.class, d8);
        d8 = s.a;
        b8.a(F.e.d.c.class, d8);
        b8.a(ax.L7.u.class, d8);
        d8 = u.a;
        b8.a(F.e.d.d.class, d8);
        b8.a(ax.L7.v.class, d8);
        d8 = x.a;
        b8.a(F.e.d.f.class, d8);
        b8.a(ax.L7.y.class, d8);
        d8 = v.a;
        b8.a(F.e.d.e.class, d8);
        b8.a(ax.L7.w.class, d8);
        d8 = w.a;
        b8.a(F.e.d.e.b.class, d8);
        b8.a(ax.L7.x.class, d8);
        d8 = e.a;
        b8.a(F.d.class, d8);
        b8.a(ax.L7.f.class, d8);
        d8 = f.a;
        b8.a(F.d.b.class, d8);
        b8.a(ax.L7.g.class, d8);
    }

    private static final class a
    implements ax.U7.d<F.a.a> {
        static final a a = new a();
        private static final ax.U7.c b = ax.U7.c.d("arch");
        private static final ax.U7.c c = ax.U7.c.d("libraryName");
        private static final ax.U7.c d = ax.U7.c.d("buildId");

        private a() {
        }

        public void b(F.a.a a8, ax.U7.e e8) throws IOException {
            e8.e(b, a8.b());
            e8.e(c, a8.d());
            e8.e(d, a8.c());
        }
    }

    private static final class b
    implements ax.U7.d<F.a> {
        static final b a = new b();
        private static final ax.U7.c b = ax.U7.c.d("pid");
        private static final ax.U7.c c = ax.U7.c.d("processName");
        private static final ax.U7.c d = ax.U7.c.d("reasonCode");
        private static final ax.U7.c e = ax.U7.c.d("importance");
        private static final ax.U7.c f = ax.U7.c.d("pss");
        private static final ax.U7.c g = ax.U7.c.d("rss");
        private static final ax.U7.c h = ax.U7.c.d("timestamp");
        private static final ax.U7.c i = ax.U7.c.d("traceFile");
        private static final ax.U7.c j = ax.U7.c.d("buildIdMappingForArch");

        private b() {
        }

        public void b(F.a a8, ax.U7.e e8) throws IOException {
            e8.b(b, a8.d());
            e8.e(c, a8.e());
            e8.b(d, a8.g());
            e8.b(e, a8.c());
            e8.c(f, a8.f());
            e8.c(g, a8.h());
            e8.c(h, a8.i());
            e8.e(i, a8.j());
            e8.e(j, a8.b());
        }
    }

    private static final class c
    implements ax.U7.d<F.c> {
        static final c a = new c();
        private static final ax.U7.c b = ax.U7.c.d("key");
        private static final ax.U7.c c = ax.U7.c.d("value");

        private c() {
        }

        public void b(F.c c8, ax.U7.e e8) throws IOException {
            e8.e(b, c8.b());
            e8.e(c, c8.c());
        }
    }

    private static final class d
    implements ax.U7.d<F> {
        static final d a = new d();
        private static final ax.U7.c b = ax.U7.c.d("sdkVersion");
        private static final ax.U7.c c = ax.U7.c.d("gmpAppId");
        private static final ax.U7.c d = ax.U7.c.d("platform");
        private static final ax.U7.c e = ax.U7.c.d("installationUuid");
        private static final ax.U7.c f = ax.U7.c.d("firebaseInstallationId");
        private static final ax.U7.c g = ax.U7.c.d("firebaseAuthenticationToken");
        private static final ax.U7.c h = ax.U7.c.d("appQualitySessionId");
        private static final ax.U7.c i = ax.U7.c.d("buildVersion");
        private static final ax.U7.c j = ax.U7.c.d("displayVersion");
        private static final ax.U7.c k = ax.U7.c.d("session");
        private static final ax.U7.c l = ax.U7.c.d("ndkPayload");
        private static final ax.U7.c m = ax.U7.c.d("appExitInfo");

        private d() {
        }

        public void b(F f8, ax.U7.e e8) throws IOException {
            e8.e(b, f8.m());
            e8.e(c, f8.i());
            e8.b(d, f8.l());
            e8.e(e, f8.j());
            e8.e(f, f8.h());
            e8.e(g, f8.g());
            e8.e(h, f8.d());
            e8.e(i, f8.e());
            e8.e(j, f8.f());
            e8.e(k, f8.n());
            e8.e(l, f8.k());
            e8.e(m, f8.c());
        }
    }

    private static final class e
    implements ax.U7.d<F.d> {
        static final e a = new e();
        private static final ax.U7.c b = ax.U7.c.d("files");
        private static final ax.U7.c c = ax.U7.c.d("orgId");

        private e() {
        }

        public void b(F.d d8, ax.U7.e e8) throws IOException {
            e8.e(b, d8.b());
            e8.e(c, d8.c());
        }
    }

    private static final class f
    implements ax.U7.d<F.d.b> {
        static final f a = new f();
        private static final ax.U7.c b = ax.U7.c.d("filename");
        private static final ax.U7.c c = ax.U7.c.d("contents");

        private f() {
        }

        public void b(F.d.b b8, ax.U7.e e8) throws IOException {
            e8.e(b, b8.c());
            e8.e(c, b8.b());
        }
    }

    private static final class g
    implements ax.U7.d<F.e.a> {
        static final g a = new g();
        private static final ax.U7.c b = ax.U7.c.d("identifier");
        private static final ax.U7.c c = ax.U7.c.d("version");
        private static final ax.U7.c d = ax.U7.c.d("displayVersion");
        private static final ax.U7.c e = ax.U7.c.d("organization");
        private static final ax.U7.c f = ax.U7.c.d("installationUuid");
        private static final ax.U7.c g = ax.U7.c.d("developmentPlatform");
        private static final ax.U7.c h = ax.U7.c.d("developmentPlatformVersion");

        private g() {
        }

        public void b(F.e.a a8, ax.U7.e e8) throws IOException {
            e8.e(b, a8.e());
            e8.e(c, a8.h());
            e8.e(d, a8.d());
            e8.e(e, a8.g());
            e8.e(f, a8.f());
            e8.e(g, a8.b());
            e8.e(h, a8.c());
        }
    }

    private static final class h
    implements ax.U7.d<F.e.a.b> {
        static final h a = new h();
        private static final ax.U7.c b = ax.U7.c.d("clsId");

        private h() {
        }

        public void b(F.e.a.b b8, ax.U7.e e8) throws IOException {
            e8.e(b, b8.a());
        }
    }

    private static final class i
    implements ax.U7.d<F.e.c> {
        static final i a = new i();
        private static final ax.U7.c b = ax.U7.c.d("arch");
        private static final ax.U7.c c = ax.U7.c.d("model");
        private static final ax.U7.c d = ax.U7.c.d("cores");
        private static final ax.U7.c e = ax.U7.c.d("ram");
        private static final ax.U7.c f = ax.U7.c.d("diskSpace");
        private static final ax.U7.c g = ax.U7.c.d("simulator");
        private static final ax.U7.c h = ax.U7.c.d("state");
        private static final ax.U7.c i = ax.U7.c.d("manufacturer");
        private static final ax.U7.c j = ax.U7.c.d("modelClass");

        private i() {
        }

        public void b(F.e.c c8, ax.U7.e e8) throws IOException {
            e8.b(b, c8.b());
            e8.e(c, c8.f());
            e8.b(d, c8.c());
            e8.c(e, c8.h());
            e8.c(f, c8.d());
            e8.a(g, c8.j());
            e8.b(h, c8.i());
            e8.e(i, c8.e());
            e8.e(j, c8.g());
        }
    }

    private static final class j
    implements ax.U7.d<F.e> {
        static final j a = new j();
        private static final ax.U7.c b = ax.U7.c.d("generator");
        private static final ax.U7.c c = ax.U7.c.d("identifier");
        private static final ax.U7.c d = ax.U7.c.d("appQualitySessionId");
        private static final ax.U7.c e = ax.U7.c.d("startedAt");
        private static final ax.U7.c f = ax.U7.c.d("endedAt");
        private static final ax.U7.c g = ax.U7.c.d("crashed");
        private static final ax.U7.c h = ax.U7.c.d("app");
        private static final ax.U7.c i = ax.U7.c.d("user");
        private static final ax.U7.c j = ax.U7.c.d("os");
        private static final ax.U7.c k = ax.U7.c.d("device");
        private static final ax.U7.c l = ax.U7.c.d("events");
        private static final ax.U7.c m = ax.U7.c.d("generatorType");

        private j() {
        }

        public void b(F.e e8, ax.U7.e e9) throws IOException {
            e9.e(b, e8.g());
            e9.e(c, e8.j());
            e9.e(d, e8.c());
            e9.c(e, e8.l());
            e9.e(f, e8.e());
            e9.a(g, e8.n());
            e9.e(h, e8.b());
            e9.e(i, e8.m());
            e9.e(j, e8.k());
            e9.e(k, e8.d());
            e9.e(l, e8.f());
            e9.b(m, e8.h());
        }
    }

    private static final class k
    implements ax.U7.d<F.e.d.a> {
        static final k a = new k();
        private static final ax.U7.c b = ax.U7.c.d("execution");
        private static final ax.U7.c c = ax.U7.c.d("customAttributes");
        private static final ax.U7.c d = ax.U7.c.d("internalKeys");
        private static final ax.U7.c e = ax.U7.c.d("background");
        private static final ax.U7.c f = ax.U7.c.d("currentProcessDetails");
        private static final ax.U7.c g = ax.U7.c.d("appProcessDetails");
        private static final ax.U7.c h = ax.U7.c.d("uiOrientation");

        private k() {
        }

        public void b(F.e.d.a a8, ax.U7.e e8) throws IOException {
            e8.e(b, a8.f());
            e8.e(c, a8.e());
            e8.e(d, a8.g());
            e8.e(e, a8.c());
            e8.e(f, a8.d());
            e8.e(g, a8.b());
            e8.b(h, a8.h());
        }
    }

    private static final class l
    implements ax.U7.d<F.e.d.a.b.a> {
        static final l a = new l();
        private static final ax.U7.c b = ax.U7.c.d("baseAddress");
        private static final ax.U7.c c = ax.U7.c.d("size");
        private static final ax.U7.c d = ax.U7.c.d("name");
        private static final ax.U7.c e = ax.U7.c.d("uuid");

        private l() {
        }

        public void b(F.e.d.a.b.a a8, ax.U7.e e8) throws IOException {
            e8.c(b, a8.b());
            e8.c(c, a8.d());
            e8.e(d, a8.c());
            e8.e(e, a8.f());
        }
    }

    private static final class m
    implements ax.U7.d<F.e.d.a.b> {
        static final m a = new m();
        private static final ax.U7.c b = ax.U7.c.d("threads");
        private static final ax.U7.c c = ax.U7.c.d("exception");
        private static final ax.U7.c d = ax.U7.c.d("appExitInfo");
        private static final ax.U7.c e = ax.U7.c.d("signal");
        private static final ax.U7.c f = ax.U7.c.d("binaries");

        private m() {
        }

        public void b(F.e.d.a.b b8, ax.U7.e e8) throws IOException {
            e8.e(b, b8.f());
            e8.e(c, b8.d());
            e8.e(d, b8.b());
            e8.e(e, b8.e());
            e8.e(f, b8.c());
        }
    }

    private static final class n
    implements ax.U7.d<F.e.d.a.b.c> {
        static final n a = new n();
        private static final ax.U7.c b = ax.U7.c.d("type");
        private static final ax.U7.c c = ax.U7.c.d("reason");
        private static final ax.U7.c d = ax.U7.c.d("frames");
        private static final ax.U7.c e = ax.U7.c.d("causedBy");
        private static final ax.U7.c f = ax.U7.c.d("overflowCount");

        private n() {
        }

        public void b(F.e.d.a.b.c c8, ax.U7.e e8) throws IOException {
            e8.e(b, c8.f());
            e8.e(c, c8.e());
            e8.e(d, c8.c());
            e8.e(e, c8.b());
            e8.b(f, c8.d());
        }
    }

    private static final class o
    implements ax.U7.d<F.e.d.a.b.d> {
        static final o a = new o();
        private static final ax.U7.c b = ax.U7.c.d("name");
        private static final ax.U7.c c = ax.U7.c.d("code");
        private static final ax.U7.c d = ax.U7.c.d("address");

        private o() {
        }

        public void b(F.e.d.a.b.d d8, ax.U7.e e8) throws IOException {
            e8.e(b, d8.d());
            e8.e(c, d8.c());
            e8.c(d, d8.b());
        }
    }

    private static final class p
    implements ax.U7.d<F.e.d.a.b.e> {
        static final p a = new p();
        private static final ax.U7.c b = ax.U7.c.d("name");
        private static final ax.U7.c c = ax.U7.c.d("importance");
        private static final ax.U7.c d = ax.U7.c.d("frames");

        private p() {
        }

        public void b(F.e.d.a.b.e e8, ax.U7.e e9) throws IOException {
            e9.e(b, e8.d());
            e9.b(c, e8.c());
            e9.e(d, e8.b());
        }
    }

    private static final class q
    implements ax.U7.d<F.e.d.a.b.e.b> {
        static final q a = new q();
        private static final ax.U7.c b = ax.U7.c.d("pc");
        private static final ax.U7.c c = ax.U7.c.d("symbol");
        private static final ax.U7.c d = ax.U7.c.d("file");
        private static final ax.U7.c e = ax.U7.c.d("offset");
        private static final ax.U7.c f = ax.U7.c.d("importance");

        private q() {
        }

        public void b(F.e.d.a.b.e.b b8, ax.U7.e e8) throws IOException {
            e8.c(b, b8.e());
            e8.e(c, b8.f());
            e8.e(d, b8.b());
            e8.c(e, b8.d());
            e8.b(f, b8.c());
        }
    }

    private static final class r
    implements ax.U7.d<F.e.d.a.c> {
        static final r a = new r();
        private static final ax.U7.c b = ax.U7.c.d("processName");
        private static final ax.U7.c c = ax.U7.c.d("pid");
        private static final ax.U7.c d = ax.U7.c.d("importance");
        private static final ax.U7.c e = ax.U7.c.d("defaultProcess");

        private r() {
        }

        public void b(F.e.d.a.c c8, ax.U7.e e8) throws IOException {
            e8.e(b, c8.d());
            e8.b(c, c8.c());
            e8.b(d, c8.b());
            e8.a(e, c8.e());
        }
    }

    private static final class s
    implements ax.U7.d<F.e.d.c> {
        static final s a = new s();
        private static final ax.U7.c b = ax.U7.c.d("batteryLevel");
        private static final ax.U7.c c = ax.U7.c.d("batteryVelocity");
        private static final ax.U7.c d = ax.U7.c.d("proximityOn");
        private static final ax.U7.c e = ax.U7.c.d("orientation");
        private static final ax.U7.c f = ax.U7.c.d("ramUsed");
        private static final ax.U7.c g = ax.U7.c.d("diskUsed");

        private s() {
        }

        public void b(F.e.d.c c8, ax.U7.e e8) throws IOException {
            e8.e(b, c8.b());
            e8.b(c, c8.c());
            e8.a(d, c8.g());
            e8.b(e, c8.e());
            e8.c(f, c8.f());
            e8.c(g, c8.d());
        }
    }

    private static final class t
    implements ax.U7.d<F.e.d> {
        static final t a = new t();
        private static final ax.U7.c b = ax.U7.c.d("timestamp");
        private static final ax.U7.c c = ax.U7.c.d("type");
        private static final ax.U7.c d = ax.U7.c.d("app");
        private static final ax.U7.c e = ax.U7.c.d("device");
        private static final ax.U7.c f = ax.U7.c.d("log");
        private static final ax.U7.c g = ax.U7.c.d("rollouts");

        private t() {
        }

        public void b(F.e.d d8, ax.U7.e e8) throws IOException {
            e8.c(b, d8.f());
            e8.e(c, d8.g());
            e8.e(d, d8.b());
            e8.e(e, d8.c());
            e8.e(f, d8.d());
            e8.e(g, d8.e());
        }
    }

    private static final class u
    implements ax.U7.d<F.e.d.d> {
        static final u a = new u();
        private static final ax.U7.c b = ax.U7.c.d("content");

        private u() {
        }

        public void b(F.e.d.d d8, ax.U7.e e8) throws IOException {
            e8.e(b, d8.b());
        }
    }

    private static final class v
    implements ax.U7.d<F.e.d.e> {
        static final v a = new v();
        private static final ax.U7.c b = ax.U7.c.d("rolloutVariant");
        private static final ax.U7.c c = ax.U7.c.d("parameterKey");
        private static final ax.U7.c d = ax.U7.c.d("parameterValue");
        private static final ax.U7.c e = ax.U7.c.d("templateVersion");

        private v() {
        }

        public void b(F.e.d.e e8, ax.U7.e e9) throws IOException {
            e9.e(b, e8.d());
            e9.e(c, e8.b());
            e9.e(d, e8.c());
            e9.c(e, e8.e());
        }
    }

    private static final class w
    implements ax.U7.d<F.e.d.e.b> {
        static final w a = new w();
        private static final ax.U7.c b = ax.U7.c.d("rolloutId");
        private static final ax.U7.c c = ax.U7.c.d("variantId");

        private w() {
        }

        public void b(F.e.d.e.b b8, ax.U7.e e8) throws IOException {
            e8.e(b, b8.b());
            e8.e(c, b8.c());
        }
    }

    private static final class x
    implements ax.U7.d<F.e.d.f> {
        static final x a = new x();
        private static final ax.U7.c b = ax.U7.c.d("assignments");

        private x() {
        }

        public void b(F.e.d.f f8, ax.U7.e e8) throws IOException {
            e8.e(b, f8.b());
        }
    }

    private static final class y
    implements ax.U7.d<F.e.e> {
        static final y a = new y();
        private static final ax.U7.c b = ax.U7.c.d("platform");
        private static final ax.U7.c c = ax.U7.c.d("version");
        private static final ax.U7.c d = ax.U7.c.d("buildVersion");
        private static final ax.U7.c e = ax.U7.c.d("jailbroken");

        private y() {
        }

        public void b(F.e.e e8, ax.U7.e e9) throws IOException {
            e9.b(b, e8.c());
            e9.e(c, e8.d());
            e9.e(d, e8.b());
            e9.a(e, e8.e());
        }
    }

    private static final class z
    implements ax.U7.d<F.e.f> {
        static final z a = new z();
        private static final ax.U7.c b = ax.U7.c.d("identifier");

        private z() {
        }

        public void b(F.e.f f8, ax.U7.e e8) throws IOException {
            e8.e(b, f8.b());
        }
    }
}

