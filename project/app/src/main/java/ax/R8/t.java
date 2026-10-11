/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.g;
import ax.Q8.k;
import ax.Q8.m;
import ax.Q8.q;
import ax.Y8.c;
import ax.Z8.a;
import java.util.Set;

public class t
extends q {
    private g e;
    private byte f;
    private long g;
    private byte[] h;
    private long i;
    private Set<b> j;

    public t() {
    }

    public t(g g8, Set<a> set, Set<k> set2) {
        super(25, g8, m.d0);
        this.e = g8;
        this.f = (byte)c.a.e(set);
        this.g = c.a.e(set2);
    }

    private void p(ax.h9.b b8) {
        if (this.e.j() && this.i != 0L) {
            b8.j((byte)1);
            return;
        }
        b8.j((byte)0);
    }

    private byte[] q(ax.h9.b b8, int n8, int n9) throws a.b {
        if (n9 > 0) {
            b8.T(n8);
            return b8.G(n9);
        }
        return new byte[0];
    }

    @Override
    protected void j(ax.h9.b b8) throws a.b {
        b8.J();
        this.j = c.a.d(b8.J(), b.class);
        this.h = this.q(b8, b8.J(), b8.J());
    }

    @Override
    protected void m(ax.h9.b b8) {
        b8.s(this.c);
        this.p(b8);
        b8.j(this.f);
        b8.u(this.g & 0xFFL);
        b8.Y();
        b8.s(88);
        byte[] byArray = this.h;
        int n8 = byArray != null ? byArray.length : 0;
        b8.s(n8);
        b8.w(this.i);
        byArray = this.h;
        if (byArray != null) {
            b8.o(byArray);
        }
    }

    public byte[] n() {
        return this.h;
    }

    public Set<b> o() {
        return this.j;
    }

    public void r(byte[] byArray) {
        this.h = byArray;
    }

    public static final class a
    extends Enum<a>
    implements c<a> {
        public static final /* enum */ a c0 = new a(1L);
        public static final /* enum */ a d0 = new a(2L);
        private static final a[] e0 = ax.R8.t$a.d();
        private long q;

        private a(long l8) {
            this.q = l8;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }

    public static final class b
    extends Enum<b>
    implements c<b> {
        public static final /* enum */ b c0 = new b(1L);
        public static final /* enum */ b d0 = new b(2L);
        public static final /* enum */ b e0 = new b(4L);
        private static final b[] f0 = ax.R8.t$b.d();
        private long q;

        private b(long l8) {
            this.q = l8;
        }

        private static /* synthetic */ b[] d() {
            return new b[]{c0, d0, e0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }
}

