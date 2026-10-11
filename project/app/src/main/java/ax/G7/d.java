/*
 * Decompiled with CFR 0.152.
 */
package ax.G7;

import ax.G7.a;
import ax.G7.c;
import ax.G7.g;
import ax.G7.h;
import ax.L7.F;
import ax.L7.G;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class d
implements a {
    private static final h c = new b();
    private final ax.a8.a<a> a;
    private final AtomicReference<a> b = new AtomicReference<Object>(null);

    public d(ax.a8.a<a> a8) {
        this.a = a8;
        a8.a(new ax.G7.b(this));
    }

    public static /* synthetic */ void e(String string, String string2, long l8, G g8, ax.a8.b b8) {
        ((a)b8.get()).d(string, string2, l8, g8);
    }

    public static /* synthetic */ void f(d d8, ax.a8.b b8) {
        d8.getClass();
        g.f().b("Crashlytics native component now available.");
        d8.b.set((a)b8.get());
    }

    @Override
    public h a(String string) {
        a a8 = this.b.get();
        if (a8 == null) {
            return c;
        }
        return a8.a(string);
    }

    @Override
    public boolean b() {
        a a8 = this.b.get();
        return a8 != null && a8.b();
    }

    @Override
    public boolean c(String string) {
        a a8 = this.b.get();
        return a8 != null && a8.c(string);
    }

    @Override
    public void d(String string, String string2, long l8, G g8) {
        g g9 = g.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Deferring native open session: ");
        stringBuilder.append(string);
        g9.i(stringBuilder.toString());
        this.a.a(new c(string, string2, l8, g8));
    }

    private static final class b
    implements h {
        private b() {
        }

        @Override
        public File a() {
            return null;
        }

        @Override
        public File b() {
            return null;
        }

        @Override
        public File c() {
            return null;
        }

        @Override
        public F.a d() {
            return null;
        }

        @Override
        public File e() {
            return null;
        }

        @Override
        public File f() {
            return null;
        }

        @Override
        public File g() {
            return null;
        }
    }
}

