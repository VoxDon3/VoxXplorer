/*
 * Decompiled with CFR 0.152.
 */
package ax.x4;

import ax.p4.j;
import ax.p4.k;
import ax.p4.m;
import ax.p4.n;
import ax.s4.a;
import ax.x4.b;
import ax.x4.d;
import java.util.List;

public class a
extends b {
    public a(m m8, ax.u4.a a8) {
        this(m8, a8, k.e, null, null);
    }

    private a(m m8, ax.u4.a a8, k k8, String string, ax.C4.a a9) {
        super(new a(m8, a8, k8, string, a9));
    }

    public a(m m8, String string) {
        this(m8, string, k.e, null);
    }

    public a(m m8, String string, k k8, String string2) {
        this(m8, new ax.u4.a(string), k8, string2, null);
    }

    a(d d8) {
        super(d8);
    }

    public ax.u4.d c() throws j {
        return this.a.l();
    }

    public a d(ax.C4.a a8) {
        if (a8 != null) {
            return new a(this.a.q(a8));
        }
        throw new IllegalArgumentException("'pathRoot' should not be null");
    }

    private static final class a
    extends d {
        private final ax.u4.a g;

        a(m m8, ax.u4.a a8, k k8, String string, ax.C4.a a9) {
            super(m8, k8, string, a9);
            if (a8 != null) {
                this.g = a8;
                return;
            }
            throw new NullPointerException("credential");
        }

        @Override
        protected void b(List<a.a> list) {
            n.v(list);
            n.a(list, this.g.g());
        }

        @Override
        public boolean c() {
            return this.g.i() != null;
        }

        @Override
        public boolean k() {
            return this.c() && this.g.a();
        }

        @Override
        public ax.u4.d l() throws j {
            this.g.j(this.h());
            return new ax.u4.d(this.g.g(), (this.g.h() - System.currentTimeMillis()) / 1000L);
        }

        @Override
        protected d q(ax.C4.a a8) {
            return new a(this.h(), this.g, this.g(), this.i(), a8);
        }
    }
}

