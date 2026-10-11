/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.K8.a;
import ax.Q8.t;
import ax.Z8.a;
import java.util.ArrayList;
import java.util.List;

public class h {
    private List<c> a = new ArrayList<c>();

    private void c(t t8, ax.h9.b b8, int n8) throws a.b {
        for (int i8 = 0; i8 < n8 && b8.c() > 0; ++i8) {
            b8.P();
            b8.U(4);
            this.d(t8, b8);
        }
    }

    private void d(t t8, ax.h9.b b8) throws a.b {
        long l8 = t8.m();
        if (l8 == ax.K8.a.t0.getValue()) {
            this.a.add(new b().a(b8));
            return;
        }
        if (l8 == ax.K8.a.k0.getValue()) {
            this.a.add(new d().e(b8));
        }
    }

    public List<c> a() {
        return this.a;
    }

    h b(t t8, ax.h9.b b8) throws a.b {
        b8.U(2);
        byte by = b8.z();
        b8.U(1);
        int n8 = b8.P();
        if (by > 0) {
            this.c(t8, b8, by);
            return this;
        }
        if (n8 > 0) {
            this.d(t8, b8);
            return this;
        }
        if (n8 == 0 && b8.c() > 0) {
            b8.U(1);
        }
        return this;
    }

    public static class b
    implements c {
        private long a;

        private b() {
        }

        public b a(ax.h9.b b8) throws a.b {
            this.a = b8.N();
            return this;
        }
    }

    public static interface c {
    }

    public static class d
    implements c {
        private boolean a;
        private int b;
        private String c;
        private String d;

        private d() {
        }

        private d e(ax.h9.b b8) throws a.b {
            int n8 = b8.P();
            int n9 = b8.S();
            b8.U(4);
            b8.U(4);
            b8.U(2);
            this.b = b8.J();
            int n10 = b8.J();
            int n11 = b8.J();
            int n12 = b8.J();
            int n13 = b8.J();
            boolean bl = b8.N() == 0L;
            this.a = bl;
            this.c = this.f(b8, n10, n11);
            this.d = this.f(b8, n12, n13);
            b8.T(n9 + n8);
            return this;
        }

        private String f(ax.h9.b b8, int n8, int n9) throws a.b {
            String string;
            int n10 = b8.S();
            if (n9 > 0) {
                b8.T(n8 + n10);
                string = b8.H(ax.Y8.b.d, n9 / 2);
            } else {
                string = null;
            }
            b8.T(n10);
            return string;
        }

        public String b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }

        public boolean d() {
            return this.a;
        }
    }
}

