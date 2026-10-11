package ax.p5;

import ax.s5.C3048a;
import ax.s5.C3049b;
import ax.s5.C3050c;
import ax.s5.C3051d;
import ax.s5.C3052e;
import java.io.IOException;

/* renamed from: ax.p5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2775a implements ax.V7.a {
    public static final ax.V7.a a = new C2775a();

    /* renamed from: ax.p5.a$a, reason: collision with other inner class name */
    private static final class C0416a implements ax.U7.d<C3048a> {
        static final C0416a a = new C0416a();
        private static final ax.U7.c b = ax.U7.c.a("window").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("logSourceMetrics").b(ax.X7.a.b().c(2).a()).a();
        private static final ax.U7.c d = ax.U7.c.a("globalMetrics").b(ax.X7.a.b().c(3).a()).a();
        private static final ax.U7.c e = ax.U7.c.a("appNamespace").b(ax.X7.a.b().c(4).a()).a();

        private C0416a() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3048a c3048a, ax.U7.e eVar) throws IOException {
            eVar.e(b, c3048a.d());
            eVar.e(c, c3048a.c());
            eVar.e(d, c3048a.b());
            eVar.e(e, c3048a.a());
        }
    }

    /* renamed from: ax.p5.a$b */
    private static final class b implements ax.U7.d<C3049b> {
        static final b a = new b();
        private static final ax.U7.c b = ax.U7.c.a("storageMetrics").b(ax.X7.a.b().c(1).a()).a();

        private b() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3049b c3049b, ax.U7.e eVar) throws IOException {
            eVar.e(b, c3049b.a());
        }
    }

    /* renamed from: ax.p5.a$c */
    private static final class c implements ax.U7.d<C3050c> {
        static final c a = new c();
        private static final ax.U7.c b = ax.U7.c.a("eventsDroppedCount").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("reason").b(ax.X7.a.b().c(3).a()).a();

        private c() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3050c c3050c, ax.U7.e eVar) throws IOException {
            eVar.c(b, c3050c.a());
            eVar.e(c, c3050c.b());
        }
    }

    /* renamed from: ax.p5.a$d */
    private static final class d implements ax.U7.d<C3051d> {
        static final d a = new d();
        private static final ax.U7.c b = ax.U7.c.a("logSource").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("logEventDropped").b(ax.X7.a.b().c(2).a()).a();

        private d() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3051d c3051d, ax.U7.e eVar) throws IOException {
            eVar.e(b, c3051d.b());
            eVar.e(c, c3051d.a());
        }
    }

    /* renamed from: ax.p5.a$e */
    private static final class e implements ax.U7.d<m> {
        static final e a = new e();
        private static final ax.U7.c b = ax.U7.c.d("clientMetrics");

        private e() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m mVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, mVar.b());
        }
    }

    /* renamed from: ax.p5.a$f */
    private static final class f implements ax.U7.d<C3052e> {
        static final f a = new f();
        private static final ax.U7.c b = ax.U7.c.a("currentCacheSizeBytes").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("maxCacheSizeBytes").b(ax.X7.a.b().c(2).a()).a();

        private f() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3052e c3052e, ax.U7.e eVar) throws IOException {
            eVar.c(b, c3052e.a());
            eVar.c(c, c3052e.b());
        }
    }

    /* renamed from: ax.p5.a$g */
    private static final class g implements ax.U7.d<ax.s5.f> {
        static final g a = new g();
        private static final ax.U7.c b = ax.U7.c.a("startMs").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("endMs").b(ax.X7.a.b().c(2).a()).a();

        private g() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ax.s5.f fVar, ax.U7.e eVar) throws IOException {
            eVar.c(b, fVar.b());
            eVar.c(c, fVar.a());
        }
    }

    private C2775a() {
    }

    @Override // ax.V7.a
    public void a(ax.V7.b<?> bVar) {
        bVar.a(m.class, e.a);
        bVar.a(C3048a.class, C0416a.a);
        bVar.a(ax.s5.f.class, g.a);
        bVar.a(C3051d.class, d.a);
        bVar.a(C3050c.class, c.a);
        bVar.a(C3049b.class, b.a);
        bVar.a(C3052e.class, f.a);
    }
}
