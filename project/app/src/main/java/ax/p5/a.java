/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.p5.m;
import java.io.IOException;

public final class a
implements ax.V7.a {
    public static final ax.V7.a a = new a();

    private a() {
    }

    @Override
    public void a(ax.V7.b<?> b8) {
        b8.a(m.class, e.a);
        b8.a(ax.s5.a.class, ax.p5.a$a.a);
        b8.a(ax.s5.f.class, g.a);
        b8.a(ax.s5.d.class, d.a);
        b8.a(ax.s5.c.class, c.a);
        b8.a(ax.s5.b.class, b.a);
        b8.a(ax.s5.e.class, f.a);
    }

    private static final class a
    implements ax.U7.d<ax.s5.a> {
        static final a a = new a();
        private static final ax.U7.c b = ax.U7.c.a("window").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("logSourceMetrics").b(ax.X7.a.b().c(2).a()).a();
        private static final ax.U7.c d = ax.U7.c.a("globalMetrics").b(ax.X7.a.b().c(3).a()).a();
        private static final ax.U7.c e = ax.U7.c.a("appNamespace").b(ax.X7.a.b().c(4).a()).a();

        private a() {
        }

        public void b(ax.s5.a a8, ax.U7.e e8) throws IOException {
            e8.e(b, a8.d());
            e8.e(c, a8.c());
            e8.e(d, a8.b());
            e8.e(e, a8.a());
        }
    }

    private static final class b
    implements ax.U7.d<ax.s5.b> {
        static final b a = new b();
        private static final ax.U7.c b = ax.U7.c.a("storageMetrics").b(ax.X7.a.b().c(1).a()).a();

        private b() {
        }

        public void b(ax.s5.b b8, ax.U7.e e8) throws IOException {
            e8.e(b, b8.a());
        }
    }

    private static final class c
    implements ax.U7.d<ax.s5.c> {
        static final c a = new c();
        private static final ax.U7.c b = ax.U7.c.a("eventsDroppedCount").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("reason").b(ax.X7.a.b().c(3).a()).a();

        private c() {
        }

        public void b(ax.s5.c c8, ax.U7.e e8) throws IOException {
            e8.c(b, c8.a());
            e8.e(c, c8.b());
        }
    }

    private static final class d
    implements ax.U7.d<ax.s5.d> {
        static final d a = new d();
        private static final ax.U7.c b = ax.U7.c.a("logSource").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("logEventDropped").b(ax.X7.a.b().c(2).a()).a();

        private d() {
        }

        public void b(ax.s5.d d8, ax.U7.e e8) throws IOException {
            e8.e(b, d8.b());
            e8.e(c, d8.a());
        }
    }

    private static final class e
    implements ax.U7.d<m> {
        static final e a = new e();
        private static final ax.U7.c b = ax.U7.c.d("clientMetrics");

        private e() {
        }

        public void b(m m8, ax.U7.e e8) throws IOException {
            e8.e(b, m8.b());
        }
    }

    private static final class f
    implements ax.U7.d<ax.s5.e> {
        static final f a = new f();
        private static final ax.U7.c b = ax.U7.c.a("currentCacheSizeBytes").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("maxCacheSizeBytes").b(ax.X7.a.b().c(2).a()).a();

        private f() {
        }

        public void b(ax.s5.e e8, ax.U7.e e9) throws IOException {
            e9.c(b, e8.a());
            e9.c(c, e8.b());
        }
    }

    private static final class g
    implements ax.U7.d<ax.s5.f> {
        static final g a = new g();
        private static final ax.U7.c b = ax.U7.c.a("startMs").b(ax.X7.a.b().c(1).a()).a();
        private static final ax.U7.c c = ax.U7.c.a("endMs").b(ax.X7.a.b().c(2).a()).a();

        private g() {
        }

        public void b(ax.s5.f f8, ax.U7.e e8) throws IOException {
            e8.c(b, f8.b());
            e8.c(c, f8.a());
        }
    }
}

