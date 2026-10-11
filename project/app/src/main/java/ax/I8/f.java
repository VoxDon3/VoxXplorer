/*
 * Decompiled with CFR 0.152.
 */
package ax.I8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class f {
    private String a;
    private int b;
    private EnumSet<a> c;
    private List<ax.I8.a> d = new ArrayList<ax.I8.a>();

    public f(String string) {
        this.a = string;
    }

    public List<ax.I8.a> a() {
        return this.d;
    }

    public Set<a> b() {
        return this.c;
    }

    public int c() {
        if (!this.d.isEmpty()) {
            return this.d.get(0).i();
        }
        return 0;
    }

    public void d(b b8) throws a.b {
        this.b = b8.J();
        int n8 = b8.J();
        this.c = c.a.d(b8.P(), a.class);
        for (int i8 = 0; i8 < n8; ++i8) {
            ax.I8.a a8 = ax.I8.a.a(b8);
            if (a8.b() == null) {
                a8.m(this.a);
            }
            this.d.add(a8);
        }
    }

    public static final class a
    extends Enum<a>
    implements c<a> {
        public static final /* enum */ a c0 = new a(1L);
        public static final /* enum */ a d0 = new a(2L);
        public static final /* enum */ a e0 = new a(4L);
        private static final a[] f0 = ax.I8.f$a.d();
        private long q;

        private a(long l8) {
            this.q = l8;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0, d0, e0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])f0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }
}

