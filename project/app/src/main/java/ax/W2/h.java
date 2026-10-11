/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.W2.i;
import ax.W2.j;
import java.util.ArrayList;

public abstract class h {
    private a a;
    private c b = ax.W2.h$c.q;
    private long c;

    public h() {
        this.h();
    }

    private void h() {
        this.c = i.b(this);
    }

    public j a() {
        j j8 = this.b();
        j8.o0(this.e());
        this.d();
        return j8;
    }

    protected abstract j b();

    protected boolean c() {
        return false;
    }

    public void d() {
        this.j(ax.W2.h$c.d0);
        this.a = null;
        if (this.c()) {
            this.h();
        }
    }

    public long e() {
        return this.c;
    }

    public a f() {
        return this.a;
    }

    public c g() {
        return this.b;
    }

    public void i(a a8) {
        this.a = a8;
    }

    public void j(c c8) {
        this.b = c8;
    }

    public static interface a {
        public void a(b var1, String var2, String var3, ArrayList<String> var4, Object var5);

        public void b();
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        private static final b[] f0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = new b();
            f0 = ax.W2.h$b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0, e0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        private static final c[] e0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = new c();
            e0 = ax.W2.h$c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0, d0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }
}

