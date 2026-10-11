/*
 * Decompiled with CFR 0.152.
 */
package ax.F1;

import ax.F1.b;
import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import ax.S0.d0;
import ax.r7.n;
import java.util.Comparator;
import java.util.List;

public final class c
implements C.a {
    public final List<a> a;

    public c(List<a> list) {
        this.a = list;
        ax.S0.a.a(c.d(list) ^ true);
    }

    private static boolean d(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long l8 = list.get((int)0).b;
        for (int i8 = 1; i8 < list.size(); ++i8) {
            if (list.get((int)i8).a < l8) {
                return true;
            }
            l8 = list.get((int)i8).b;
        }
        return false;
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public /* synthetic */ void b(A.b b8) {
        B.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            return this.a.equals(((c)object).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SlowMotion: segments=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public static final class a {
        public static final Comparator<a> d = new b();
        public final long a;
        public final long b;
        public final int c;

        public a(long l8, long l9, int n8) {
            boolean bl = l8 < l9;
            ax.S0.a.a(bl);
            this.a = l8;
            this.b = l9;
            this.c = n8;
        }

        public static /* synthetic */ int a(a a8, a a9) {
            return n.j().e(a8.a, a9.a).e(a8.b, a9.b).d(a8.c, a9.c).i();
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (this.a == ((a)object).a && this.b == ((a)object).b && this.c == ((a)object).c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c});
        }

        public String toString() {
            return d0.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", this.a, this.b, this.c);
        }
    }
}

