/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.K7.c;
import ax.K7.h;
import ax.O7.g;
import java.io.File;

public class e {
    private static final b c = new b();
    private final g a;
    private c b;

    public e(g g8) {
        this.a = g8;
        this.b = c;
    }

    public e(g g8, String string) {
        this(g8);
        this.e(string);
    }

    private File d(String string) {
        return this.a.q(string, "userlog");
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    public String c() {
        return this.b.b();
    }

    public final void e(String string) {
        this.b.a();
        this.b = c;
        if (string == null) {
            return;
        }
        this.f(this.d(string), 65536);
    }

    void f(File file, int n8) {
        this.b = new h(file, n8);
    }

    public void g(long l8, String string) {
        this.b.e(l8, string);
    }

    private static final class b
    implements c {
        private b() {
        }

        @Override
        public void a() {
        }

        @Override
        public String b() {
            return null;
        }

        @Override
        public byte[] c() {
            return null;
        }

        @Override
        public void d() {
        }

        @Override
        public void e(long l8, String string) {
        }
    }
}

