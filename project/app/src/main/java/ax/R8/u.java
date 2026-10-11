/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.g;
import ax.Q8.i;
import ax.Q8.m;
import ax.Q8.q;
import ax.Y8.c;
import ax.h9.b;
import java.util.Set;

public class u
extends q {
    private final i e;
    private final a f;
    private final ax.L8.b g;
    private final byte[] h;
    private final Set<Object> i;

    public u(g g8, long l8, long l9, a a8, i i8, ax.L8.b b8, Set<Object> set, byte[] byArray) {
        super(33, g8, m.t0, l8, l9);
        this.e = i8;
        this.f = a8;
        this.g = b8;
        if (byArray == null) {
            byArray = new byte[]{};
        }
        this.h = byArray;
        this.i = set;
    }

    @Override
    protected void m(b b8) {
        b8.s(this.c);
        b8.j((byte)this.f.getValue());
        Object object = this.g;
        byte by = object == null ? (byte)0 : (byte)((ax.L8.b)object).getValue();
        b8.j(by);
        b8.u(this.h.length);
        b8.s(96);
        b8.X();
        object = this.i;
        long l8 = object == null ? 0L : c.a.e(object);
        b8.u(l8);
        this.e.b(b8);
        b8.o(this.h);
    }

    public static final class a
    extends Enum<a>
    implements c<a> {
        public static final /* enum */ a c0 = new a(1L);
        public static final /* enum */ a d0 = new a(2L);
        public static final /* enum */ a e0 = new a(3L);
        public static final /* enum */ a f0 = new a(4L);
        private static final a[] g0 = ax.R8.u$a.d();
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

