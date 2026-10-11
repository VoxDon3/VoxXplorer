/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.g;
import ax.Q8.i;
import ax.Q8.m;
import ax.Q8.p;
import ax.Y8.c;
import ax.h9.b;
import java.util.Set;

public class n
extends p {
    private ax.L8.b f;
    private final Set<a> g;
    private final long h;
    private final i i;
    private final String j;

    public n(g object, long l8, long l9, i i8, ax.L8.b b8, Set<a> set, long l10, String string, int n8) {
        super(33, (g)((Object)object), m.q0, l8, l9, n8);
        this.f = b8;
        this.g = set;
        this.h = l10;
        this.i = i8;
        object = string == null ? "*" : string;
        this.j = object;
    }

    @Override
    protected void m(b b8) {
        b8.s(this.c);
        b8.j((byte)this.f.getValue());
        b8.j((byte)c.a.e(this.g));
        b8.u(this.h);
        this.i.b(b8);
        b8.s(96);
        b8.s(this.j.length() * 2);
        b8.u(Math.min(this.f(), this.d() * 65536));
        b8.Z(this.j);
    }

    public static final class a
    extends Enum<a>
    implements c<a> {
        public static final /* enum */ a c0 = new a(1L);
        public static final /* enum */ a d0 = new a(2L);
        public static final /* enum */ a e0 = new a(4L);
        public static final /* enum */ a f0 = new a(16L);
        private static final a[] g0 = ax.R8.n$a.d();
        private long q;

        private a(long l8) {
            this.q = l8;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0, d0, e0, f0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])g0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }
}

