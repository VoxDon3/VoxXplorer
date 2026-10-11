/*
 * Decompiled with CFR 0.152.
 */
package ax.T8;

import ax.W8.i;
import java.util.Random;

public class a {
    private i a;
    private String b;
    private boolean c;
    private boolean d;
    private byte[] e;

    private a() {
    }

    private a(a a8) {
        this.a = a8.a;
        this.b = a8.b;
        this.c = a8.c;
        this.d = a8.d;
        this.e = a8.e;
    }

    static /* synthetic */ i a(a a8, i i8) {
        a8.a = i8;
        return i8;
    }

    static /* synthetic */ boolean b(a a8, boolean bl) {
        a8.c = bl;
        return bl;
    }

    static /* synthetic */ boolean c(a a8, boolean bl) {
        a8.d = bl;
        return bl;
    }

    static /* synthetic */ byte[] e(a a8, byte[] byArray) {
        a8.e = byArray;
        return byArray;
    }

    public static b f(Random random) {
        return new b(random);
    }

    public i g() {
        return this.a;
    }

    public String h() {
        return this.b;
    }

    public boolean i() {
        return this.c;
    }

    public boolean j() {
        return this.d;
    }

    public static class b {
        private a a;

        public b(Random random) {
            a a8;
            this.a = a8 = new a();
            ax.T8.a.a(a8, new i(i.b.d0, i.c.d0, 7600, i.a.c0));
            ax.T8.a.b(this.a, true);
            ax.T8.a.c(this.a, false);
            ax.T8.a.e(this.a, new byte[32]);
            random.nextBytes(this.a.e);
        }

        public a a() {
            return new a(this.a);
        }

        public b b(boolean bl) {
            ax.T8.a.b(this.a, bl);
            return this;
        }
    }
}

