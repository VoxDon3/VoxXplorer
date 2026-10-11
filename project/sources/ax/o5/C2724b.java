package ax.o5;

import java.io.IOException;

/* renamed from: ax.o5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2724b implements ax.V7.a {
    public static final ax.V7.a a = new C2724b();

    /* renamed from: ax.o5.b$a */
    private static final class a implements ax.U7.d<AbstractC2723a> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC2723a abstractC2723a, ax.U7.e eVar) throws IOException {
            eVar.e(b, abstractC2723a.m());
            eVar.e(c, abstractC2723a.j());
            eVar.e(d, abstractC2723a.f());
            eVar.e(e, abstractC2723a.d());
            eVar.e(f, abstractC2723a.l());
            eVar.e(g, abstractC2723a.k());
            eVar.e(h, abstractC2723a.h());
            eVar.e(i, abstractC2723a.e());
            eVar.e(j, abstractC2723a.g());
            eVar.e(k, abstractC2723a.c());
            eVar.e(l, abstractC2723a.i());
            eVar.e(m, abstractC2723a.b());
        }
    }

    /* renamed from: ax.o5.b$b, reason: collision with other inner class name */
    private static final class C0401b implements ax.U7.d<n> {
        static final C0401b a = new C0401b();
        private static final ax.U7.c b = ax.U7.c.d("logRequest");

        private C0401b() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(n nVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, nVar.c());
        }
    }

    /* renamed from: ax.o5.b$c */
    private static final class c implements ax.U7.d<o> {
        static final c a = new c();
        private static final ax.U7.c b = ax.U7.c.d("clientType");
        private static final ax.U7.c c = ax.U7.c.d("androidClientInfo");

        private c() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o oVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, oVar.c());
            eVar.e(c, oVar.b());
        }
    }

    /* renamed from: ax.o5.b$d */
    private static final class d implements ax.U7.d<p> {
        static final d a = new d();
        private static final ax.U7.c b = ax.U7.c.d("privacyContext");
        private static final ax.U7.c c = ax.U7.c.d("productIdOrigin");

        private d() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, pVar.b());
            eVar.e(c, pVar.c());
        }
    }

    /* renamed from: ax.o5.b$e */
    private static final class e implements ax.U7.d<q> {
        static final e a = new e();
        private static final ax.U7.c b = ax.U7.c.d("clearBlob");
        private static final ax.U7.c c = ax.U7.c.d("encryptedBlob");

        private e() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(q qVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, qVar.b());
            eVar.e(c, qVar.c());
        }
    }

    /* renamed from: ax.o5.b$f */
    private static final class f implements ax.U7.d<r> {
        static final f a = new f();
        private static final ax.U7.c b = ax.U7.c.d("originAssociatedProductId");

        private f() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, rVar.b());
        }
    }

    /* renamed from: ax.o5.b$g */
    private static final class g implements ax.U7.d<s> {
        static final g a = new g();
        private static final ax.U7.c b = ax.U7.c.d("prequest");

        private g() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s sVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, sVar.b());
        }
    }

    /* renamed from: ax.o5.b$h */
    private static final class h implements ax.U7.d<t> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, ax.U7.e eVar) throws IOException {
            eVar.c(b, tVar.d());
            eVar.e(c, tVar.c());
            eVar.e(d, tVar.b());
            eVar.c(e, tVar.e());
            eVar.e(f, tVar.h());
            eVar.e(g, tVar.i());
            eVar.c(h, tVar.j());
            eVar.e(i, tVar.g());
            eVar.e(j, tVar.f());
        }
    }

    /* renamed from: ax.o5.b$i */
    private static final class i implements ax.U7.d<u> {
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

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, ax.U7.e eVar) throws IOException {
            eVar.c(b, uVar.g());
            eVar.c(c, uVar.h());
            eVar.e(d, uVar.b());
            eVar.e(e, uVar.d());
            eVar.e(f, uVar.e());
            eVar.e(g, uVar.c());
            eVar.e(h, uVar.f());
        }
    }

    /* renamed from: ax.o5.b$j */
    private static final class j implements ax.U7.d<w> {
        static final j a = new j();
        private static final ax.U7.c b = ax.U7.c.d("networkType");
        private static final ax.U7.c c = ax.U7.c.d("mobileSubtype");

        private j() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, wVar.c());
            eVar.e(c, wVar.b());
        }
    }

    private C2724b() {
    }

    @Override // ax.V7.a
    public void a(ax.V7.b<?> bVar) {
        C0401b c0401b = C0401b.a;
        bVar.a(n.class, c0401b);
        bVar.a(C2726d.class, c0401b);
        i iVar = i.a;
        bVar.a(u.class, iVar);
        bVar.a(k.class, iVar);
        c cVar = c.a;
        bVar.a(o.class, cVar);
        bVar.a(C2727e.class, cVar);
        a aVar = a.a;
        bVar.a(AbstractC2723a.class, aVar);
        bVar.a(C2725c.class, aVar);
        h hVar = h.a;
        bVar.a(t.class, hVar);
        bVar.a(ax.o5.j.class, hVar);
        d dVar = d.a;
        bVar.a(p.class, dVar);
        bVar.a(ax.o5.f.class, dVar);
        g gVar = g.a;
        bVar.a(s.class, gVar);
        bVar.a(ax.o5.i.class, gVar);
        f fVar = f.a;
        bVar.a(r.class, fVar);
        bVar.a(ax.o5.h.class, fVar);
        j jVar = j.a;
        bVar.a(w.class, jVar);
        bVar.a(m.class, jVar);
        e eVar = e.a;
        bVar.a(q.class, eVar);
        bVar.a(ax.o5.g.class, eVar);
    }
}
