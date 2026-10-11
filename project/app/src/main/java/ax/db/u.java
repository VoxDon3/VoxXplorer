/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.cb.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public final class u {
    private static final List<u> c = u.b();
    public static final u d = ax.db.u$a.c0.d();
    public static final u e = ax.db.u$a.d0.d();
    public static final u f = ax.db.u$a.e0.d();
    public static final u g = ax.db.u$a.f0.d();
    public static final u h = ax.db.u$a.g0.d();
    public static final u i = ax.db.u$a.h0.d();
    public static final u j = ax.db.u$a.i0.d();
    public static final u k = ax.db.u$a.j0.d();
    public static final u l = ax.db.u$a.s0.d();
    public static final u m = ax.db.u$a.k0.d();
    public static final u n = ax.db.u$a.l0.d();
    public static final u o = ax.db.u$a.m0.d();
    public static final u p = ax.db.u$a.n0.d();
    public static final u q = ax.db.u$a.o0.d();
    public static final u r = ax.db.u$a.p0.d();
    public static final u s = ax.db.u$a.q0.d();
    public static final u t = ax.db.u$a.r0.d();
    private final a a;
    private final String b;

    private u(a a8, String string) {
        this.a = ax.cb.b.b(a8, "canonicalCode");
        this.b = string;
    }

    private static List<u> b() {
        Serializable serializable = new TreeMap<Integer, u>();
        for (a a8 : ax.db.u$a.values()) {
            u u8 = ((TreeMap)serializable).put(a8.h(), new u(a8, null));
            if (u8 == null) {
                continue;
            }
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Code value duplication between ");
            ((StringBuilder)serializable).append(u8.c().name());
            ((StringBuilder)serializable).append(" & ");
            ((StringBuilder)serializable).append(a8.name());
            throw new IllegalStateException(((StringBuilder)serializable).toString());
        }
        return java.util.DesugarCollections.unmodifiableList(new ArrayList(((TreeMap)serializable).values()));
    }

    public a c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        object = (u)object;
        return this.a == ((u)object).a && ax.cb.b.d(this.b, ((u)object).b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Status{canonicalCode=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", description=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        public static final /* enum */ a i0;
        public static final /* enum */ a j0;
        public static final /* enum */ a k0;
        public static final /* enum */ a l0;
        public static final /* enum */ a m0;
        public static final /* enum */ a n0;
        public static final /* enum */ a o0;
        public static final /* enum */ a p0;
        public static final /* enum */ a q0;
        public static final /* enum */ a r0;
        public static final /* enum */ a s0;
        private static final a[] t0;
        private final int q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            a a15;
            a a16;
            a a17;
            a a18;
            a a19;
            a a20;
            a a21;
            a a22;
            a a23;
            a a24;
            c0 = a24 = new a(0);
            d0 = a23 = new a(1);
            e0 = a22 = new a(2);
            f0 = a21 = new a(3);
            g0 = a20 = new a(4);
            h0 = a19 = new a(5);
            i0 = a18 = new a(6);
            j0 = a17 = new a(7);
            k0 = a16 = new a(8);
            l0 = a15 = new a(9);
            m0 = a14 = new a(10);
            n0 = a13 = new a(11);
            o0 = a12 = new a(12);
            p0 = a11 = new a(13);
            q0 = a10 = new a(14);
            r0 = a9 = new a(15);
            s0 = a8 = new a(16);
            t0 = new a[]{a24, a23, a22, a21, a20, a19, a18, a17, a16, a15, a14, a13, a12, a11, a10, a9, a8};
        }

        private a(int n9) {
            this.q = n9;
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])t0.clone();
        }

        public u d() {
            return (u)c.get(this.q);
        }

        public int h() {
            return this.q;
        }
    }
}

