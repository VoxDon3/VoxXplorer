/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.net.Uri;
import android.os.Bundle;
import ax.P0.A;
import ax.P0.D;
import ax.P0.L;
import ax.S0.a;
import ax.S0.d0;
import ax.r7.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class y {
    public static final y i = new c().a();
    private static final String j = d0.G0(0);
    private static final String k = d0.G0(1);
    private static final String l = d0.G0(2);
    private static final String m = d0.G0(3);
    private static final String n = d0.G0(4);
    private static final String o = d0.G0(5);
    public final String a;
    public final h b;
    @Deprecated
    public final h c;
    public final g d;
    public final A e;
    public final d f;
    @Deprecated
    public final e g;
    public final i h;

    private y(String string, e e8, h h8, g g8, A a8, i i8) {
        this.a = string;
        this.b = h8;
        this.c = h8;
        this.d = g8;
        this.e = a8;
        this.f = e8;
        this.g = e8;
        this.h = i8;
    }

    public static y b(Uri uri) {
        return new c().f(uri).a();
    }

    public static y c(String string) {
        return new c().g(string).a();
    }

    public c a() {
        return new c(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y)) {
            return false;
        }
        object = (y)object;
        return j.Objects.equals((Object)this.a, (Object)((y)object).a) && this.f.equals(((y)object).f) && j.Objects.equals((Object)this.b, (Object)((y)object).b) && j.Objects.equals((Object)this.d, (Object)((y)object).d) && j.Objects.equals((Object)this.e, (Object)((y)object).e) && j.Objects.equals((Object)this.h, (Object)((y)object).h);
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        h h8 = this.b;
        int n9 = h8 != null ? h8.hashCode() : 0;
        return ((((n8 * 31 + n9) * 31 + this.d.hashCode()) * 31 + this.f.hashCode()) * 31 + this.e.hashCode()) * 31 + this.h.hashCode();
    }

    public static final class b {
    }

    public static final class c {
        private String a;
        private Uri b;
        private String c;
        private d.a d = new d.a();
        private f.a e = new f.a();
        private List<L> f = Collections.EMPTY_LIST;
        private String g;
        private z<k> h = z.z();
        private Object i;
        private long j = -9223372036854775807L;
        private A k;
        private g.a l = new g.a();
        private i m = ax.P0.y$i.d;

        public c() {
        }

        private c(y object) {
            this();
            this.d = ((y)object).f.a();
            this.a = ((y)object).a;
            this.k = ((y)object).e;
            this.l = ((y)object).d.a();
            this.m = ((y)object).h;
            h h8 = ((y)object).b;
            if (h8 != null) {
                this.g = h8.e;
                this.c = h8.b;
                this.b = h8.a;
                this.f = h8.d;
                this.h = h8.f;
                this.i = h8.h;
                object = h8.c;
                object = object != null ? ((f)object).b() : new f.a();
                this.e = object;
                this.j = h8.i;
            }
        }

        public y a() {
            g g8;
            e e8;
            String string;
            Object object;
            Object object2;
            block4: {
                boolean bl = this.e.b == null || this.e.a != null;
                ax.S0.a.g(bl);
                object2 = this.b;
                object = null;
                if (object2 != null) {
                    string = this.c;
                    if (this.e.a != null) {
                        object = this.e.i();
                    }
                    object = new h((Uri)object2, string, (f)object, null, this.f, this.g, this.h, this.i, this.j);
                } else {
                    object = null;
                }
                string = this.a;
                if (string == null) {
                    string = "";
                }
                e8 = this.d.h();
                g8 = this.l.f();
                object2 = this.k;
                if (object2 != null) break block4;
                object2 = A.I;
            }
            return new y(string, e8, (h)object, g8, (A)object2, this.m);
        }

        public c b(g g8) {
            this.l = g8.a();
            return this;
        }

        public c c(String string) {
            this.a = ax.S0.a.e(string);
            return this;
        }

        public c d(List<k> list) {
            this.h = z.u(list);
            return this;
        }

        public c e(Object object) {
            this.i = object;
            return this;
        }

        public c f(Uri uri) {
            this.b = uri;
            return this;
        }

        public c g(String string) {
            string = string == null ? null : Uri.parse((String)string);
            return this.f((Uri)string);
        }
    }

    public static class d {
        public static final d i = new a().g();
        private static final String j = d0.G0(0);
        private static final String k = d0.G0(1);
        private static final String l = d0.G0(2);
        private static final String m = d0.G0(3);
        private static final String n = d0.G0(4);
        static final String o = d0.G0(5);
        static final String p = d0.G0(6);
        private static final String q = d0.G0(7);
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        private d(a a8) {
            this.a = d0.E1(a8.a);
            this.c = d0.E1(a8.b);
            this.b = a8.a;
            this.d = a8.b;
            this.e = a8.c;
            this.f = a8.d;
            this.g = a8.e;
            this.h = a8.f;
        }

        public a a() {
            return new a(this);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof d)) {
                return false;
            }
            object = (d)object;
            return this.b == ((d)object).b && this.d == ((d)object).d && this.e == ((d)object).e && this.f == ((d)object).f && this.g == ((d)object).g && this.h == ((d)object).h;
        }

        public int hashCode() {
            long l8 = this.b;
            int n8 = (int)(l8 ^ l8 >>> 32);
            l8 = this.d;
            return ((((n8 * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h;
        }

        public static final class a {
            private long a;
            private long b;
            private boolean c;
            private boolean d;
            private boolean e;
            private boolean f;

            public a() {
                this.b = Long.MIN_VALUE;
            }

            private a(d d8) {
                this.a = d8.b;
                this.b = d8.d;
                this.c = d8.e;
                this.d = d8.f;
                this.e = d8.g;
                this.f = d8.h;
            }

            public d g() {
                return new d(this);
            }

            @Deprecated
            public e h() {
                return new e(this);
            }
        }
    }

    @Deprecated
    public static final class e
    extends d {
        public static final e r = new d.a().h();

        private e(d.a a8) {
            super(a8);
        }
    }

    public static final class f {
        private static final String l = d0.G0(0);
        private static final String m = d0.G0(1);
        private static final String n = d0.G0(2);
        private static final String o = d0.G0(3);
        static final String p = d0.G0(4);
        private static final String q = d0.G0(5);
        private static final String r = d0.G0(6);
        private static final String s = d0.G0(7);
        public final UUID a;
        @Deprecated
        public final UUID b;
        public final Uri c;
        @Deprecated
        public final ax.r7.A<String, String> d;
        public final ax.r7.A<String, String> e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        @Deprecated
        public final z<Integer> i;
        public final z<Integer> j;
        private final byte[] k;

        private f(a object) {
            UUID uUID;
            boolean bl = !((a)object).f || ((a)object).b != null;
            ax.S0.a.g(bl);
            this.a = uUID = ax.S0.a.e(((a)object).a);
            this.b = uUID;
            this.c = ((a)object).b;
            this.d = ((a)object).c;
            this.e = ((a)object).c;
            this.f = ((a)object).d;
            this.h = ((a)object).f;
            this.g = ((a)object).e;
            this.i = ((a)object).g;
            this.j = ((a)object).g;
            object = ((a)object).h != null ? (Object)Arrays.copyOf(((a)object).h, ((a)object).h.length) : null;
            this.k = (byte[])object;
        }

        public a b() {
            return new a(this);
        }

        public byte[] c() {
            byte[] byArray = this.k;
            if (byArray != null) {
                return Arrays.copyOf(byArray, byArray.length);
            }
            return null;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof f)) {
                return false;
            }
            object = (f)object;
            return this.a.equals(((f)object).a) && j.Objects.equals((Object)this.c, (Object)((f)object).c) && j.Objects.equals(this.e, ((f)object).e) && this.f == ((f)object).f && this.h == ((f)object).h && this.g == ((f)object).g && this.j.equals(((f)object).j) && Arrays.equals(this.k, ((f)object).k);
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            Uri uri = this.c;
            int n9 = uri != null ? uri.hashCode() : 0;
            return ((((((n8 * 31 + n9) * 31 + this.e.hashCode()) * 31 + this.f) * 31 + this.h) * 31 + this.g) * 31 + this.j.hashCode()) * 31 + Arrays.hashCode(this.k);
        }

        public static final class a {
            private UUID a;
            private Uri b;
            private ax.r7.A<String, String> c;
            private boolean d;
            private boolean e;
            private boolean f;
            private z<Integer> g;
            private byte[] h;

            @Deprecated
            private a() {
                this.c = ax.r7.A.k();
                this.e = true;
                this.g = z.z();
            }

            private a(f f8) {
                this.a = f8.a;
                this.b = f8.c;
                this.c = f8.e;
                this.d = f8.f;
                this.e = f8.g;
                this.f = f8.h;
                this.g = f8.j;
                this.h = f8.k;
            }

            public f i() {
                return new f(this);
            }
        }
    }

    public static final class g {
        public static final g f = new a().f();
        private static final String g = d0.G0(0);
        private static final String h = d0.G0(1);
        private static final String i = d0.G0(2);
        private static final String j = d0.G0(3);
        private static final String k = d0.G0(4);
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        @Deprecated
        public g(long l8, long l9, long l10, float f8, float f9) {
            this.a = l8;
            this.b = l9;
            this.c = l10;
            this.d = f8;
            this.e = f9;
        }

        private g(a a8) {
            this(a8.a, a8.b, a8.c, a8.d, a8.e);
        }

        public a a() {
            return new a(this);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof g)) {
                return false;
            }
            object = (g)object;
            return this.a == ((g)object).a && this.b == ((g)object).b && this.c == ((g)object).c && this.d == ((g)object).d && this.e == ((g)object).e;
        }

        public int hashCode() {
            long l8 = this.a;
            int n8 = (int)(l8 ^ l8 >>> 32);
            l8 = this.b;
            int n9 = (int)(l8 ^ l8 >>> 32);
            l8 = this.c;
            int n10 = (int)(l8 ^ l8 >>> 32);
            float f8 = this.d;
            int n11 = 0;
            int n12 = f8 != 0.0f ? Float.floatToIntBits(f8) : 0;
            f8 = this.e;
            if (f8 != 0.0f) {
                n11 = Float.floatToIntBits(f8);
            }
            return (((n8 * 31 + n9) * 31 + n10) * 31 + n12) * 31 + n11;
        }

        public static final class a {
            private long a;
            private long b;
            private long c;
            private float d;
            private float e;

            public a() {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            private a(g g8) {
                this.a = g8.a;
                this.b = g8.b;
                this.c = g8.c;
                this.d = g8.d;
                this.e = g8.e;
            }

            public g f() {
                return new g(this);
            }

            public a g(long l8) {
                this.c = l8;
                return this;
            }

            public a h(float f8) {
                this.e = f8;
                return this;
            }

            public a i(long l8) {
                this.b = l8;
                return this;
            }

            public a j(float f8) {
                this.d = f8;
                return this;
            }

            public a k(long l8) {
                this.a = l8;
                return this;
            }
        }
    }

    public static final class h {
        private static final String j = d0.G0(0);
        private static final String k = d0.G0(1);
        private static final String l = d0.G0(2);
        private static final String m = d0.G0(3);
        private static final String n = d0.G0(4);
        private static final String o = d0.G0(5);
        private static final String p = d0.G0(6);
        private static final String q = d0.G0(7);
        public final Uri a;
        public final String b;
        public final f c;
        public final List<L> d;
        public final String e;
        public final z<k> f;
        @Deprecated
        public final List<j> g;
        public final Object h;
        public final long i;

        private h(Uri object, String string, f f8, b b8, List<L> list, String string2, z<k> z8, Object object2, long l8) {
            this.a = object;
            this.b = D.t(string);
            this.c = f8;
            this.d = list;
            this.e = string2;
            this.f = z8;
            object = z.r();
            for (int i8 = 0; i8 < z8.size(); ++i8) {
                ((z.a)object).h(((k)z8.get(i8)).a().j());
            }
            this.g = ((z.a)object).k();
            this.h = object2;
            this.i = l8;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof h)) {
                return false;
            }
            object = (h)object;
            return this.a.equals((Object)((h)object).a) && j.Objects.equals((Object)this.b, (Object)((h)object).b) && j.Objects.equals((Object)this.c, (Object)((h)object).c) && this.d.equals(((h)object).d) && j.Objects.equals((Object)this.e, (Object)((h)object).e) && this.f.equals(((h)object).f) && j.Objects.equals((Object)this.h, (Object)((h)object).h) && this.i == ((h)object).i;
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            Object object = this.b;
            int n9 = 0;
            int n10 = object == null ? 0 : ((String)object).hashCode();
            object = this.c;
            int n11 = object == null ? 0 : ((f)object).hashCode();
            int n12 = this.d.hashCode();
            object = this.e;
            int n13 = object == null ? 0 : ((String)object).hashCode();
            int n14 = this.f.hashCode();
            object = this.h;
            if (object != null) {
                n9 = object.hashCode();
            }
            return (int)((long)((((((n8 * 31 + n10) * 31 + n11) * 961 + n12) * 31 + n13) * 31 + n14) * 31 + n9) * 31L + this.i);
        }
    }

    public static final class i {
        public static final i d = new a().d();
        private static final String e = d0.G0(0);
        private static final String f = d0.G0(1);
        private static final String g = d0.G0(2);
        public final Uri a;
        public final String b;
        public final Bundle c;

        private i(a a8) {
            this.a = a8.a;
            this.b = a8.b;
            this.c = a8.c;
        }

        public boolean equals(Object object) {
            boolean bl;
            boolean bl2;
            if (this == object) {
                return true;
            }
            if (!(object instanceof i)) {
                return false;
            }
            object = (i)object;
            return j.Objects.equals((Object)this.a, (Object)((i)object).a) && j.Objects.equals((Object)this.b, (Object)((i)object).b) && (bl2 = this.c == null) == (bl = ((i)object).c == null);
        }

        public int hashCode() {
            Object object = this.a;
            int n8 = 0;
            int n9 = object == null ? 0 : object.hashCode();
            object = this.b;
            int n10 = object == null ? 0 : ((String)object).hashCode();
            if (this.c != null) {
                n8 = 1;
            }
            return (n9 * 31 + n10) * 31 + n8;
        }

        public static final class a {
            private Uri a;
            private String b;
            private Bundle c;

            public i d() {
                return new i(this);
            }
        }
    }

    @Deprecated
    public static final class j
    extends k {
        private j(k.a a8) {
            super(a8);
        }
    }

    public static class k {
        private static final String h = d0.G0(0);
        private static final String i = d0.G0(1);
        private static final String j = d0.G0(2);
        private static final String k = d0.G0(3);
        private static final String l = d0.G0(4);
        private static final String m = d0.G0(5);
        private static final String n = d0.G0(6);
        public final Uri a;
        public final String b;
        public final String c;
        public final int d;
        public final int e;
        public final String f;
        public final String g;

        private k(a a8) {
            this.a = a8.a;
            this.b = a8.b;
            this.c = a8.c;
            this.d = a8.d;
            this.e = a8.e;
            this.f = a8.f;
            this.g = a8.g;
        }

        public a a() {
            return new a(this);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof k)) {
                return false;
            }
            object = (k)object;
            return this.a.equals((Object)((k)object).a) && j.Objects.equals((Object)this.b, (Object)((k)object).b) && j.Objects.equals((Object)this.c, (Object)((k)object).c) && this.d == ((k)object).d && this.e == ((k)object).e && j.Objects.equals((Object)this.f, (Object)((k)object).f) && j.Objects.equals((Object)this.g, (Object)((k)object).g);
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            String string = this.b;
            int n9 = 0;
            int n10 = string == null ? 0 : string.hashCode();
            string = this.c;
            int n11 = string == null ? 0 : string.hashCode();
            int n12 = this.d;
            int n13 = this.e;
            string = this.f;
            int n14 = string == null ? 0 : string.hashCode();
            string = this.g;
            if (string != null) {
                n9 = string.hashCode();
            }
            return (((((n8 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n9;
        }

        public static final class a {
            private Uri a;
            private String b;
            private String c;
            private int d;
            private int e;
            private String f;
            private String g;

            public a(Uri uri) {
                this.a = uri;
            }

            private a(k k8) {
                this.a = k8.a;
                this.b = k8.b;
                this.c = k8.c;
                this.d = k8.d;
                this.e = k8.e;
                this.f = k8.f;
                this.g = k8.g;
            }

            private j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            public a k(String string) {
                this.b = D.t(string);
                return this;
            }

            public a l(int n8) {
                this.d = n8;
                return this;
            }
        }
    }
}

