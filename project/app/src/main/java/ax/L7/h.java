/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.List;

final class h
extends F.e {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final Long e;
    private final boolean f;
    private final F.e.a g;
    private final F.e.f h;
    private final F.e.e i;
    private final F.e.c j;
    private final List<F.e.d> k;
    private final int l;

    private h(String string, String string2, String string3, long l8, Long l9, boolean bl, F.e.a a8, F.e.f f8, F.e.e e8, F.e.c c8, List<F.e.d> list, int n8) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = l8;
        this.e = l9;
        this.f = bl;
        this.g = a8;
        this.h = f8;
        this.i = e8;
        this.j = c8;
        this.k = list;
        this.l = n8;
    }

    @Override
    public F.e.a b() {
        return this.g;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public F.e.c d() {
        return this.j;
    }

    @Override
    public Long e() {
        return this.e;
    }

    public boolean equals(Object object) {
        List<F.e.d> list;
        if (object == this) {
            return true;
        }
        return object instanceof F.e && this.a.equals(((F.e)(object = (F.e)object)).g()) && this.b.equals(((F.e)object).i()) && ((list = this.c) == null ? ((F.e)object).c() == null : ((String)((Object)list)).equals(((F.e)object).c())) && this.d == ((F.e)object).l() && ((list = this.e) == null ? ((F.e)object).e() == null : ((Long)((Object)list)).equals(((F.e)object).e())) && this.f == ((F.e)object).n() && this.g.equals(((F.e)object).b()) && ((list = this.h) == null ? ((F.e)object).m() == null : ((Object)list).equals(((F.e)object).m())) && ((list = this.i) == null ? ((F.e)object).k() == null : ((Object)list).equals(((F.e)object).k())) && ((list = this.j) == null ? ((F.e)object).d() == null : ((Object)list).equals(((F.e)object).d())) && ((list = this.k) == null ? ((F.e)object).f() == null : list.equals(((F.e)object).f())) && this.l == ((F.e)object).h();
    }

    @Override
    public List<F.e.d> f() {
        return this.k;
    }

    @Override
    public String g() {
        return this.a;
    }

    @Override
    public int h() {
        return this.l;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        List<F.e.d> list = this.c;
        int n10 = 0;
        int n11 = list == null ? 0 : ((String)((Object)list)).hashCode();
        long l8 = this.d;
        int n12 = (int)(l8 ^ l8 >>> 32);
        list = this.e;
        int n13 = list == null ? 0 : ((Long)((Object)list)).hashCode();
        int n14 = this.f ? 1231 : 1237;
        int n15 = this.g.hashCode();
        list = this.h;
        int n16 = list == null ? 0 : ((Object)list).hashCode();
        list = this.i;
        int n17 = list == null ? 0 : ((Object)list).hashCode();
        list = this.j;
        int n18 = list == null ? 0 : ((Object)list).hashCode();
        list = this.k;
        if (list != null) {
            n10 = list.hashCode();
        }
        return (((((((((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n17) * 1000003 ^ n18) * 1000003 ^ n10) * 1000003 ^ this.l;
    }

    @Override
    public String i() {
        return this.b;
    }

    @Override
    public F.e.e k() {
        return this.i;
    }

    @Override
    public long l() {
        return this.d;
    }

    @Override
    public F.e.f m() {
        return this.h;
    }

    @Override
    public boolean n() {
        return this.f;
    }

    @Override
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Session{generator=");
        stringBuilder.append(this.a);
        stringBuilder.append(", identifier=");
        stringBuilder.append(this.b);
        stringBuilder.append(", appQualitySessionId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", startedAt=");
        stringBuilder.append(this.d);
        stringBuilder.append(", endedAt=");
        stringBuilder.append(this.e);
        stringBuilder.append(", crashed=");
        stringBuilder.append(this.f);
        stringBuilder.append(", app=");
        stringBuilder.append(this.g);
        stringBuilder.append(", user=");
        stringBuilder.append(this.h);
        stringBuilder.append(", os=");
        stringBuilder.append(this.i);
        stringBuilder.append(", device=");
        stringBuilder.append(this.j);
        stringBuilder.append(", events=");
        stringBuilder.append(this.k);
        stringBuilder.append(", generatorType=");
        stringBuilder.append(this.l);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.b {
        private String a;
        private String b;
        private String c;
        private long d;
        private Long e;
        private boolean f;
        private F.e.a g;
        private F.e.f h;
        private F.e.e i;
        private F.e.c j;
        private List<F.e.d> k;
        private int l;
        private byte m;

        b() {
        }

        private b(F.e e8) {
            this.a = e8.g();
            this.b = e8.i();
            this.c = e8.c();
            this.d = e8.l();
            this.e = e8.e();
            this.f = e8.n();
            this.g = e8.b();
            this.h = e8.m();
            this.i = e8.k();
            this.j = e8.d();
            this.k = e8.f();
            this.l = e8.h();
            this.m = (byte)7;
        }

        @Override
        public F.e a() {
            Object object;
            String string;
            CharSequence charSequence;
            if (this.m == 7 && (charSequence = this.a) != null && (string = this.b) != null && (object = this.g) != null) {
                return new h((String)charSequence, string, this.c, this.d, this.e, this.f, (F.e.a)object, this.h, this.i, this.j, this.k, this.l);
            }
            object = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)object).append(" generator");
            }
            if (this.b == null) {
                ((StringBuilder)object).append(" identifier");
            }
            if ((this.m & 1) == 0) {
                ((StringBuilder)object).append(" startedAt");
            }
            if ((this.m & 2) == 0) {
                ((StringBuilder)object).append(" crashed");
            }
            if (this.g == null) {
                ((StringBuilder)object).append(" app");
            }
            if ((this.m & 4) == 0) {
                ((StringBuilder)object).append(" generatorType");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append(object);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.b b(F.e.a a8) {
            if (a8 != null) {
                this.g = a8;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override
        public F.e.b c(String string) {
            this.c = string;
            return this;
        }

        @Override
        public F.e.b d(boolean bl) {
            this.f = bl;
            this.m = (byte)(this.m | 2);
            return this;
        }

        @Override
        public F.e.b e(F.e.c c8) {
            this.j = c8;
            return this;
        }

        @Override
        public F.e.b f(Long l8) {
            this.e = l8;
            return this;
        }

        @Override
        public F.e.b g(List<F.e.d> list) {
            this.k = list;
            return this;
        }

        @Override
        public F.e.b h(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override
        public F.e.b i(int n8) {
            this.l = n8;
            this.m = (byte)(this.m | 4);
            return this;
        }

        @Override
        public F.e.b j(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override
        public F.e.b l(F.e.e e8) {
            this.i = e8;
            return this;
        }

        @Override
        public F.e.b m(long l8) {
            this.d = l8;
            this.m = (byte)(this.m | 1);
            return this;
        }

        @Override
        public F.e.b n(F.e.f f8) {
            this.h = f8;
            return this;
        }
    }
}

