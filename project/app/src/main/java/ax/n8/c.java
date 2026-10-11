/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.n8.A;
import ax.n8.D;
import ax.n8.v;
import java.io.IOException;

public final class c
implements ax.V7.a {
    public static final ax.V7.a a = new c();

    private c() {
    }

    @Override
    public void a(ax.V7.b<?> b8) {
        b8.a(A.class, e.a);
        b8.a(D.class, f.a);
        b8.a(ax.n8.f.class, c.a);
        b8.a(ax.n8.b.class, b.a);
        b8.a(ax.n8.a.class, ax.n8.c$a.a);
        b8.a(v.class, d.a);
    }

    private static final class a
    implements ax.U7.d<ax.n8.a> {
        static final a a = new a();
        private static final ax.U7.c b = ax.U7.c.d("packageName");
        private static final ax.U7.c c = ax.U7.c.d("versionName");
        private static final ax.U7.c d = ax.U7.c.d("appBuildVersion");
        private static final ax.U7.c e = ax.U7.c.d("deviceManufacturer");
        private static final ax.U7.c f = ax.U7.c.d("currentProcessDetails");
        private static final ax.U7.c g = ax.U7.c.d("appProcessDetails");

        private a() {
        }

        public void b(ax.n8.a a8, ax.U7.e e8) throws IOException {
            e8.e(b, a8.e());
            e8.e(c, a8.f());
            e8.e(d, a8.a());
            e8.e(e, a8.d());
            e8.e(f, a8.c());
            e8.e(g, a8.b());
        }
    }

    private static final class b
    implements ax.U7.d<ax.n8.b> {
        static final b a = new b();
        private static final ax.U7.c b = ax.U7.c.d("appId");
        private static final ax.U7.c c = ax.U7.c.d("deviceModel");
        private static final ax.U7.c d = ax.U7.c.d("sessionSdkVersion");
        private static final ax.U7.c e = ax.U7.c.d("osVersion");
        private static final ax.U7.c f = ax.U7.c.d("logEnvironment");
        private static final ax.U7.c g = ax.U7.c.d("androidAppInfo");

        private b() {
        }

        public void b(ax.n8.b b8, ax.U7.e e8) throws IOException {
            e8.e(b, b8.b());
            e8.e(c, b8.c());
            e8.e(d, b8.f());
            e8.e(e, b8.e());
            e8.e(f, b8.d());
            e8.e(g, b8.a());
        }
    }

    private static final class c
    implements ax.U7.d<ax.n8.f> {
        static final c a = new c();
        private static final ax.U7.c b = ax.U7.c.d("performance");
        private static final ax.U7.c c = ax.U7.c.d("crashlytics");
        private static final ax.U7.c d = ax.U7.c.d("sessionSamplingRate");

        private c() {
        }

        public void b(ax.n8.f f8, ax.U7.e e8) throws IOException {
            e8.e(b, f8.b());
            e8.e(c, f8.a());
            e8.d(d, f8.c());
        }
    }

    private static final class d
    implements ax.U7.d<v> {
        static final d a = new d();
        private static final ax.U7.c b = ax.U7.c.d("processName");
        private static final ax.U7.c c = ax.U7.c.d("pid");
        private static final ax.U7.c d = ax.U7.c.d("importance");
        private static final ax.U7.c e = ax.U7.c.d("defaultProcess");

        private d() {
        }

        public void b(v v8, ax.U7.e e8) throws IOException {
            e8.e(b, v8.c());
            e8.b(c, v8.b());
            e8.b(d, v8.a());
            e8.a(e, v8.d());
        }
    }

    private static final class e
    implements ax.U7.d<A> {
        static final e a = new e();
        private static final ax.U7.c b = ax.U7.c.d("eventType");
        private static final ax.U7.c c = ax.U7.c.d("sessionData");
        private static final ax.U7.c d = ax.U7.c.d("applicationInfo");

        private e() {
        }

        public void b(A a8, ax.U7.e e8) throws IOException {
            e8.e(b, a8.b());
            e8.e(c, a8.c());
            e8.e(d, a8.a());
        }
    }

    private static final class f
    implements ax.U7.d<D> {
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

        public void b(D d8, ax.U7.e e8) throws IOException {
            e8.e(b, d8.f());
            e8.e(c, d8.e());
            e8.b(d, d8.g());
            e8.c(e, d8.b());
            e8.e(f, d8.a());
            e8.e(g, d8.d());
            e8.e(h, d8.c());
        }
    }
}

