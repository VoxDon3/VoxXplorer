package ax.L7;

import ax.L7.F;
import java.io.IOException;

/* renamed from: ax.L7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0799a implements ax.V7.a {
    public static final ax.V7.a a = new C0799a();

    /* renamed from: ax.L7.a$a, reason: collision with other inner class name */
    private static final class C0140a implements ax.U7.d<F.a.AbstractC0122a> {
        static final C0140a a = new C0140a();
        private static final ax.U7.c b = ax.U7.c.d("arch");
        private static final ax.U7.c c = ax.U7.c.d("libraryName");
        private static final ax.U7.c d = ax.U7.c.d("buildId");

        private C0140a() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a.AbstractC0122a abstractC0122a, ax.U7.e eVar) throws IOException {
            eVar.e(b, abstractC0122a.b());
            eVar.e(c, abstractC0122a.d());
            eVar.e(d, abstractC0122a.c());
        }
    }

    /* renamed from: ax.L7.a$b */
    private static final class b implements ax.U7.d<F.a> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a aVar, ax.U7.e eVar) throws IOException {
            eVar.b(b, aVar.d());
            eVar.e(c, aVar.e());
            eVar.b(d, aVar.g());
            eVar.b(e, aVar.c());
            eVar.c(f, aVar.f());
            eVar.c(g, aVar.h());
            eVar.c(h, aVar.i());
            eVar.e(i, aVar.j());
            eVar.e(j, aVar.b());
        }
    }

    /* renamed from: ax.L7.a$c */
    private static final class c implements ax.U7.d<F.c> {
        static final c a = new c();
        private static final ax.U7.c b = ax.U7.c.d("key");
        private static final ax.U7.c c = ax.U7.c.d("value");

        private c() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.c cVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, cVar.b());
            eVar.e(c, cVar.c());
        }
    }

    /* renamed from: ax.L7.a$d */
    private static final class d implements ax.U7.d<F> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F f2, ax.U7.e eVar) throws IOException {
            eVar.e(b, f2.m());
            eVar.e(c, f2.i());
            eVar.b(d, f2.l());
            eVar.e(e, f2.j());
            eVar.e(f, f2.h());
            eVar.e(g, f2.g());
            eVar.e(h, f2.d());
            eVar.e(i, f2.e());
            eVar.e(j, f2.f());
            eVar.e(k, f2.n());
            eVar.e(l, f2.k());
            eVar.e(m, f2.c());
        }
    }

    /* renamed from: ax.L7.a$e */
    private static final class e implements ax.U7.d<F.d> {
        static final e a = new e();
        private static final ax.U7.c b = ax.U7.c.d("files");
        private static final ax.U7.c c = ax.U7.c.d("orgId");

        private e() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d dVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, dVar.b());
            eVar.e(c, dVar.c());
        }
    }

    /* renamed from: ax.L7.a$f */
    private static final class f implements ax.U7.d<F.d.b> {
        static final f a = new f();
        private static final ax.U7.c b = ax.U7.c.d("filename");
        private static final ax.U7.c c = ax.U7.c.d("contents");

        private f() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d.b bVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, bVar.c());
            eVar.e(c, bVar.b());
        }
    }

    /* renamed from: ax.L7.a$g */
    private static final class g implements ax.U7.d<F.e.a> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a aVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, aVar.e());
            eVar.e(c, aVar.h());
            eVar.e(d, aVar.d());
            eVar.e(e, aVar.g());
            eVar.e(f, aVar.f());
            eVar.e(g, aVar.b());
            eVar.e(h, aVar.c());
        }
    }

    /* renamed from: ax.L7.a$h */
    private static final class h implements ax.U7.d<F.e.a.b> {
        static final h a = new h();
        private static final ax.U7.c b = ax.U7.c.d("clsId");

        private h() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a.b bVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, bVar.a());
        }
    }

    /* renamed from: ax.L7.a$i */
    private static final class i implements ax.U7.d<F.e.c> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.c cVar, ax.U7.e eVar) throws IOException {
            eVar.b(b, cVar.b());
            eVar.e(c, cVar.f());
            eVar.b(d, cVar.c());
            eVar.c(e, cVar.h());
            eVar.c(f, cVar.d());
            eVar.a(g, cVar.j());
            eVar.b(h, cVar.i());
            eVar.e(i, cVar.e());
            eVar.e(j, cVar.g());
        }
    }

    /* renamed from: ax.L7.a$j */
    private static final class j implements ax.U7.d<F.e> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e eVar, ax.U7.e eVar2) throws IOException {
            eVar2.e(b, eVar.g());
            eVar2.e(c, eVar.j());
            eVar2.e(d, eVar.c());
            eVar2.c(e, eVar.l());
            eVar2.e(f, eVar.e());
            eVar2.a(g, eVar.n());
            eVar2.e(h, eVar.b());
            eVar2.e(i, eVar.m());
            eVar2.e(j, eVar.k());
            eVar2.e(k, eVar.d());
            eVar2.e(l, eVar.f());
            eVar2.b(m, eVar.h());
        }
    }

    /* renamed from: ax.L7.a$k */
    private static final class k implements ax.U7.d<F.e.d.a> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a aVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, aVar.f());
            eVar.e(c, aVar.e());
            eVar.e(d, aVar.g());
            eVar.e(e, aVar.c());
            eVar.e(f, aVar.d());
            eVar.e(g, aVar.b());
            eVar.b(h, aVar.h());
        }
    }

    /* renamed from: ax.L7.a$l */
    private static final class l implements ax.U7.d<F.e.d.a.b.AbstractC0126a> {
        static final l a = new l();
        private static final ax.U7.c b = ax.U7.c.d("baseAddress");
        private static final ax.U7.c c = ax.U7.c.d("size");
        private static final ax.U7.c d = ax.U7.c.d("name");
        private static final ax.U7.c e = ax.U7.c.d("uuid");

        private l() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0126a abstractC0126a, ax.U7.e eVar) throws IOException {
            eVar.c(b, abstractC0126a.b());
            eVar.c(c, abstractC0126a.d());
            eVar.e(d, abstractC0126a.c());
            eVar.e(e, abstractC0126a.f());
        }
    }

    /* renamed from: ax.L7.a$m */
    private static final class m implements ax.U7.d<F.e.d.a.b> {
        static final m a = new m();
        private static final ax.U7.c b = ax.U7.c.d("threads");
        private static final ax.U7.c c = ax.U7.c.d("exception");
        private static final ax.U7.c d = ax.U7.c.d("appExitInfo");
        private static final ax.U7.c e = ax.U7.c.d("signal");
        private static final ax.U7.c f = ax.U7.c.d("binaries");

        private m() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b bVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, bVar.f());
            eVar.e(c, bVar.d());
            eVar.e(d, bVar.b());
            eVar.e(e, bVar.e());
            eVar.e(f, bVar.c());
        }
    }

    /* renamed from: ax.L7.a$n */
    private static final class n implements ax.U7.d<F.e.d.a.b.c> {
        static final n a = new n();
        private static final ax.U7.c b = ax.U7.c.d("type");
        private static final ax.U7.c c = ax.U7.c.d("reason");
        private static final ax.U7.c d = ax.U7.c.d("frames");
        private static final ax.U7.c e = ax.U7.c.d("causedBy");
        private static final ax.U7.c f = ax.U7.c.d("overflowCount");

        private n() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.c cVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, cVar.f());
            eVar.e(c, cVar.e());
            eVar.e(d, cVar.c());
            eVar.e(e, cVar.b());
            eVar.b(f, cVar.d());
        }
    }

    /* renamed from: ax.L7.a$o */
    private static final class o implements ax.U7.d<F.e.d.a.b.AbstractC0130d> {
        static final o a = new o();
        private static final ax.U7.c b = ax.U7.c.d("name");
        private static final ax.U7.c c = ax.U7.c.d("code");
        private static final ax.U7.c d = ax.U7.c.d("address");

        private o() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0130d abstractC0130d, ax.U7.e eVar) throws IOException {
            eVar.e(b, abstractC0130d.d());
            eVar.e(c, abstractC0130d.c());
            eVar.c(d, abstractC0130d.b());
        }
    }

    /* renamed from: ax.L7.a$p */
    private static final class p implements ax.U7.d<F.e.d.a.b.AbstractC0132e> {
        static final p a = new p();
        private static final ax.U7.c b = ax.U7.c.d("name");
        private static final ax.U7.c c = ax.U7.c.d("importance");
        private static final ax.U7.c d = ax.U7.c.d("frames");

        private p() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0132e abstractC0132e, ax.U7.e eVar) throws IOException {
            eVar.e(b, abstractC0132e.d());
            eVar.b(c, abstractC0132e.c());
            eVar.e(d, abstractC0132e.b());
        }
    }

    /* renamed from: ax.L7.a$q */
    private static final class q implements ax.U7.d<F.e.d.a.b.AbstractC0132e.AbstractC0134b> {
        static final q a = new q();
        private static final ax.U7.c b = ax.U7.c.d("pc");
        private static final ax.U7.c c = ax.U7.c.d("symbol");
        private static final ax.U7.c d = ax.U7.c.d("file");
        private static final ax.U7.c e = ax.U7.c.d("offset");
        private static final ax.U7.c f = ax.U7.c.d("importance");

        private q() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0132e.AbstractC0134b abstractC0134b, ax.U7.e eVar) throws IOException {
            eVar.c(b, abstractC0134b.e());
            eVar.e(c, abstractC0134b.f());
            eVar.e(d, abstractC0134b.b());
            eVar.c(e, abstractC0134b.d());
            eVar.b(f, abstractC0134b.c());
        }
    }

    /* renamed from: ax.L7.a$r */
    private static final class r implements ax.U7.d<F.e.d.a.c> {
        static final r a = new r();
        private static final ax.U7.c b = ax.U7.c.d("processName");
        private static final ax.U7.c c = ax.U7.c.d("pid");
        private static final ax.U7.c d = ax.U7.c.d("importance");
        private static final ax.U7.c e = ax.U7.c.d("defaultProcess");

        private r() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.c cVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, cVar.d());
            eVar.b(c, cVar.c());
            eVar.b(d, cVar.b());
            eVar.a(e, cVar.e());
        }
    }

    /* renamed from: ax.L7.a$s */
    private static final class s implements ax.U7.d<F.e.d.c> {
        static final s a = new s();
        private static final ax.U7.c b = ax.U7.c.d("batteryLevel");
        private static final ax.U7.c c = ax.U7.c.d("batteryVelocity");
        private static final ax.U7.c d = ax.U7.c.d("proximityOn");
        private static final ax.U7.c e = ax.U7.c.d("orientation");
        private static final ax.U7.c f = ax.U7.c.d("ramUsed");
        private static final ax.U7.c g = ax.U7.c.d("diskUsed");

        private s() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.c cVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, cVar.b());
            eVar.b(c, cVar.c());
            eVar.a(d, cVar.g());
            eVar.b(e, cVar.e());
            eVar.c(f, cVar.f());
            eVar.c(g, cVar.d());
        }
    }

    /* renamed from: ax.L7.a$t */
    private static final class t implements ax.U7.d<F.e.d> {
        static final t a = new t();
        private static final ax.U7.c b = ax.U7.c.d("timestamp");
        private static final ax.U7.c c = ax.U7.c.d("type");
        private static final ax.U7.c d = ax.U7.c.d("app");
        private static final ax.U7.c e = ax.U7.c.d("device");
        private static final ax.U7.c f = ax.U7.c.d("log");
        private static final ax.U7.c g = ax.U7.c.d("rollouts");

        private t() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d dVar, ax.U7.e eVar) throws IOException {
            eVar.c(b, dVar.f());
            eVar.e(c, dVar.g());
            eVar.e(d, dVar.b());
            eVar.e(e, dVar.c());
            eVar.e(f, dVar.d());
            eVar.e(g, dVar.e());
        }
    }

    /* renamed from: ax.L7.a$u */
    private static final class u implements ax.U7.d<F.e.d.AbstractC0137d> {
        static final u a = new u();
        private static final ax.U7.c b = ax.U7.c.d("content");

        private u() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0137d abstractC0137d, ax.U7.e eVar) throws IOException {
            eVar.e(b, abstractC0137d.b());
        }
    }

    /* renamed from: ax.L7.a$v */
    private static final class v implements ax.U7.d<F.e.d.AbstractC0138e> {
        static final v a = new v();
        private static final ax.U7.c b = ax.U7.c.d("rolloutVariant");
        private static final ax.U7.c c = ax.U7.c.d("parameterKey");
        private static final ax.U7.c d = ax.U7.c.d("parameterValue");
        private static final ax.U7.c e = ax.U7.c.d("templateVersion");

        private v() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0138e abstractC0138e, ax.U7.e eVar) throws IOException {
            eVar.e(b, abstractC0138e.d());
            eVar.e(c, abstractC0138e.b());
            eVar.e(d, abstractC0138e.c());
            eVar.c(e, abstractC0138e.e());
        }
    }

    /* renamed from: ax.L7.a$w */
    private static final class w implements ax.U7.d<F.e.d.AbstractC0138e.b> {
        static final w a = new w();
        private static final ax.U7.c b = ax.U7.c.d("rolloutId");
        private static final ax.U7.c c = ax.U7.c.d("variantId");

        private w() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0138e.b bVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, bVar.b());
            eVar.e(c, bVar.c());
        }
    }

    /* renamed from: ax.L7.a$x */
    private static final class x implements ax.U7.d<F.e.d.f> {
        static final x a = new x();
        private static final ax.U7.c b = ax.U7.c.d("assignments");

        private x() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.f fVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, fVar.b());
        }
    }

    /* renamed from: ax.L7.a$y */
    private static final class y implements ax.U7.d<F.e.AbstractC0139e> {
        static final y a = new y();
        private static final ax.U7.c b = ax.U7.c.d("platform");
        private static final ax.U7.c c = ax.U7.c.d("version");
        private static final ax.U7.c d = ax.U7.c.d("buildVersion");
        private static final ax.U7.c e = ax.U7.c.d("jailbroken");

        private y() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.AbstractC0139e abstractC0139e, ax.U7.e eVar) throws IOException {
            eVar.b(b, abstractC0139e.c());
            eVar.e(c, abstractC0139e.d());
            eVar.e(d, abstractC0139e.b());
            eVar.a(e, abstractC0139e.e());
        }
    }

    /* renamed from: ax.L7.a$z */
    private static final class z implements ax.U7.d<F.e.f> {
        static final z a = new z();
        private static final ax.U7.c b = ax.U7.c.d("identifier");

        private z() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.f fVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, fVar.b());
        }
    }

    private C0799a() {
    }

    @Override // ax.V7.a
    public void a(ax.V7.b<?> bVar) {
        d dVar = d.a;
        bVar.a(F.class, dVar);
        bVar.a(C0800b.class, dVar);
        j jVar = j.a;
        bVar.a(F.e.class, jVar);
        bVar.a(ax.L7.h.class, jVar);
        g gVar = g.a;
        bVar.a(F.e.a.class, gVar);
        bVar.a(ax.L7.i.class, gVar);
        h hVar = h.a;
        bVar.a(F.e.a.b.class, hVar);
        bVar.a(ax.L7.j.class, hVar);
        z zVar = z.a;
        bVar.a(F.e.f.class, zVar);
        bVar.a(A.class, zVar);
        y yVar = y.a;
        bVar.a(F.e.AbstractC0139e.class, yVar);
        bVar.a(ax.L7.z.class, yVar);
        i iVar = i.a;
        bVar.a(F.e.c.class, iVar);
        bVar.a(ax.L7.k.class, iVar);
        t tVar = t.a;
        bVar.a(F.e.d.class, tVar);
        bVar.a(ax.L7.l.class, tVar);
        k kVar = k.a;
        bVar.a(F.e.d.a.class, kVar);
        bVar.a(ax.L7.m.class, kVar);
        m mVar = m.a;
        bVar.a(F.e.d.a.b.class, mVar);
        bVar.a(ax.L7.n.class, mVar);
        p pVar = p.a;
        bVar.a(F.e.d.a.b.AbstractC0132e.class, pVar);
        bVar.a(ax.L7.r.class, pVar);
        q qVar = q.a;
        bVar.a(F.e.d.a.b.AbstractC0132e.AbstractC0134b.class, qVar);
        bVar.a(ax.L7.s.class, qVar);
        n nVar = n.a;
        bVar.a(F.e.d.a.b.c.class, nVar);
        bVar.a(ax.L7.p.class, nVar);
        b bVar2 = b.a;
        bVar.a(F.a.class, bVar2);
        bVar.a(C0801c.class, bVar2);
        C0140a c0140a = C0140a.a;
        bVar.a(F.a.AbstractC0122a.class, c0140a);
        bVar.a(C0802d.class, c0140a);
        o oVar = o.a;
        bVar.a(F.e.d.a.b.AbstractC0130d.class, oVar);
        bVar.a(ax.L7.q.class, oVar);
        l lVar = l.a;
        bVar.a(F.e.d.a.b.AbstractC0126a.class, lVar);
        bVar.a(ax.L7.o.class, lVar);
        c cVar = c.a;
        bVar.a(F.c.class, cVar);
        bVar.a(C0803e.class, cVar);
        r rVar = r.a;
        bVar.a(F.e.d.a.c.class, rVar);
        bVar.a(ax.L7.t.class, rVar);
        s sVar = s.a;
        bVar.a(F.e.d.c.class, sVar);
        bVar.a(ax.L7.u.class, sVar);
        u uVar = u.a;
        bVar.a(F.e.d.AbstractC0137d.class, uVar);
        bVar.a(ax.L7.v.class, uVar);
        x xVar = x.a;
        bVar.a(F.e.d.f.class, xVar);
        bVar.a(ax.L7.y.class, xVar);
        v vVar = v.a;
        bVar.a(F.e.d.AbstractC0138e.class, vVar);
        bVar.a(ax.L7.w.class, vVar);
        w wVar = w.a;
        bVar.a(F.e.d.AbstractC0138e.b.class, wVar);
        bVar.a(ax.L7.x.class, wVar);
        e eVar = e.a;
        bVar.a(F.d.class, eVar);
        bVar.a(C0804f.class, eVar);
        f fVar = f.a;
        bVar.a(F.d.b.class, fVar);
        bVar.a(C0805g.class, fVar);
    }
}
