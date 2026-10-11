package ax.n8;

import java.io.IOException;

/* renamed from: ax.n8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2600c implements ax.V7.a {
    public static final ax.V7.a a = new C2600c();

    /* renamed from: ax.n8.c$a */
    private static final class a implements ax.U7.d<C2598a> {
        static final a a = new a();
        private static final ax.U7.c b = ax.U7.c.d("packageName");
        private static final ax.U7.c c = ax.U7.c.d("versionName");
        private static final ax.U7.c d = ax.U7.c.d("appBuildVersion");
        private static final ax.U7.c e = ax.U7.c.d("deviceManufacturer");
        private static final ax.U7.c f = ax.U7.c.d("currentProcessDetails");
        private static final ax.U7.c g = ax.U7.c.d("appProcessDetails");

        private a() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2598a c2598a, ax.U7.e eVar) throws IOException {
            eVar.e(b, c2598a.e());
            eVar.e(c, c2598a.f());
            eVar.e(d, c2598a.a());
            eVar.e(e, c2598a.d());
            eVar.e(f, c2598a.c());
            eVar.e(g, c2598a.b());
        }
    }

    /* renamed from: ax.n8.c$b */
    private static final class b implements ax.U7.d<C2599b> {
        static final b a = new b();
        private static final ax.U7.c b = ax.U7.c.d("appId");
        private static final ax.U7.c c = ax.U7.c.d("deviceModel");
        private static final ax.U7.c d = ax.U7.c.d("sessionSdkVersion");
        private static final ax.U7.c e = ax.U7.c.d("osVersion");
        private static final ax.U7.c f = ax.U7.c.d("logEnvironment");
        private static final ax.U7.c g = ax.U7.c.d("androidAppInfo");

        private b() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2599b c2599b, ax.U7.e eVar) throws IOException {
            eVar.e(b, c2599b.b());
            eVar.e(c, c2599b.c());
            eVar.e(d, c2599b.f());
            eVar.e(e, c2599b.e());
            eVar.e(f, c2599b.d());
            eVar.e(g, c2599b.a());
        }
    }

    /* renamed from: ax.n8.c$c, reason: collision with other inner class name */
    private static final class C0387c implements ax.U7.d<C2603f> {
        static final C0387c a = new C0387c();
        private static final ax.U7.c b = ax.U7.c.d("performance");
        private static final ax.U7.c c = ax.U7.c.d("crashlytics");
        private static final ax.U7.c d = ax.U7.c.d("sessionSamplingRate");

        private C0387c() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2603f c2603f, ax.U7.e eVar) throws IOException {
            eVar.e(b, c2603f.b());
            eVar.e(c, c2603f.a());
            eVar.d(d, c2603f.c());
        }
    }

    /* renamed from: ax.n8.c$d */
    private static final class d implements ax.U7.d<C2619v> {
        static final d a = new d();
        private static final ax.U7.c b = ax.U7.c.d("processName");
        private static final ax.U7.c c = ax.U7.c.d("pid");
        private static final ax.U7.c d = ax.U7.c.d("importance");
        private static final ax.U7.c e = ax.U7.c.d("defaultProcess");

        private d() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2619v c2619v, ax.U7.e eVar) throws IOException {
            eVar.e(b, c2619v.c());
            eVar.b(c, c2619v.b());
            eVar.b(d, c2619v.a());
            eVar.a(e, c2619v.d());
        }
    }

    /* renamed from: ax.n8.c$e */
    private static final class e implements ax.U7.d<C2587A> {
        static final e a = new e();
        private static final ax.U7.c b = ax.U7.c.d("eventType");
        private static final ax.U7.c c = ax.U7.c.d("sessionData");
        private static final ax.U7.c d = ax.U7.c.d("applicationInfo");

        private e() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2587A c2587a, ax.U7.e eVar) throws IOException {
            eVar.e(b, c2587a.b());
            eVar.e(c, c2587a.c());
            eVar.e(d, c2587a.a());
        }
    }

    /* renamed from: ax.n8.c$f */
    private static final class f implements ax.U7.d<C2590D> {
        static final f a = new f();
        private static final ax.U7.c b = ax.U7.c.d("sessionId");
        private static final ax.U7.c c = ax.U7.c.d("firstSessionId");
        private static final ax.U7.c d = ax.U7.c.d("sessionIndex");
        private static final ax.U7.c e = ax.U7.c.d("eventTimestampUs");
        private static final ax.U7.c f = ax.U7.c.d("dataCollectionStatus");
        private static final ax.U7.c g = ax.U7.c.d("firebaseInstallationId");
        private static final ax.U7.c h = ax.U7.c.d("firebaseAuthenticationToken");

        private f() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2590D c2590d, ax.U7.e eVar) throws IOException {
            eVar.e(b, c2590d.f());
            eVar.e(c, c2590d.e());
            eVar.b(d, c2590d.g());
            eVar.c(e, c2590d.b());
            eVar.e(f, c2590d.a());
            eVar.e(g, c2590d.d());
            eVar.e(h, c2590d.c());
        }
    }

    private C2600c() {
    }

    @Override // ax.V7.a
    public void a(ax.V7.b<?> bVar) {
        bVar.a(C2587A.class, e.a);
        bVar.a(C2590D.class, f.a);
        bVar.a(C2603f.class, C0387c.a);
        bVar.a(C2599b.class, b.a);
        bVar.a(C2598a.class, a.a);
        bVar.a(C2619v.class, d.a);
    }
}
