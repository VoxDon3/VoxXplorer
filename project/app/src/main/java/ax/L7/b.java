/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class b
extends F {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final F.e k;
    private final F.d l;
    private final F.a m;

    private b(String string, String string2, int n8, String string3, String string4, String string5, String string6, String string7, String string8, F.e e8, F.d d8, F.a a8) {
        this.b = string;
        this.c = string2;
        this.d = n8;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.h = string6;
        this.i = string7;
        this.j = string8;
        this.k = e8;
        this.l = d8;
        this.m = a8;
    }

    @Override
    public F.a c() {
        return this.m;
    }

    @Override
    public String d() {
        return this.h;
    }

    @Override
    public String e() {
        return this.i;
    }

    public boolean equals(Object object) {
        Object object2;
        if (object == this) {
            return true;
        }
        return object instanceof F && this.b.equals(((F)(object = (F)object)).m()) && this.c.equals(((F)object).i()) && this.d == ((F)object).l() && this.e.equals(((F)object).j()) && ((object2 = this.f) == null ? ((F)object).h() == null : ((String)object2).equals(((F)object).h())) && ((object2 = this.g) == null ? ((F)object).g() == null : ((String)object2).equals(((F)object).g())) && ((object2 = this.h) == null ? ((F)object).d() == null : ((String)object2).equals(((F)object).d())) && this.i.equals(((F)object).e()) && this.j.equals(((F)object).f()) && ((object2 = this.k) == null ? ((F)object).n() == null : object2.equals(((F)object).n())) && ((object2 = this.l) == null ? ((F)object).k() == null : object2.equals(((F)object).k())) && ((object2 = this.m) == null ? ((F)object).c() == null : object2.equals(((F)object).c()));
    }

    @Override
    public String f() {
        return this.j;
    }

    @Override
    public String g() {
        return this.g;
    }

    @Override
    public String h() {
        return this.f;
    }

    public int hashCode() {
        int n8 = this.b.hashCode();
        int n9 = this.c.hashCode();
        int n10 = this.d;
        int n11 = this.e.hashCode();
        Object object = this.f;
        int n12 = 0;
        int n13 = object == null ? 0 : ((String)object).hashCode();
        object = this.g;
        int n14 = object == null ? 0 : ((String)object).hashCode();
        object = this.h;
        int n15 = object == null ? 0 : ((String)object).hashCode();
        int n16 = this.i.hashCode();
        int n17 = this.j.hashCode();
        object = this.k;
        int n18 = object == null ? 0 : object.hashCode();
        object = this.l;
        int n19 = object == null ? 0 : object.hashCode();
        object = this.m;
        if (object != null) {
            n12 = object.hashCode();
        }
        return (((((((((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n17) * 1000003 ^ n18) * 1000003 ^ n19) * 1000003 ^ n12;
    }

    @Override
    public String i() {
        return this.c;
    }

    @Override
    public String j() {
        return this.e;
    }

    @Override
    public F.d k() {
        return this.l;
    }

    @Override
    public int l() {
        return this.d;
    }

    @Override
    public String m() {
        return this.b;
    }

    @Override
    public F.e n() {
        return this.k;
    }

    @Override
    protected F.b o() {
        return new b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CrashlyticsReport{sdkVersion=");
        stringBuilder.append(this.b);
        stringBuilder.append(", gmpAppId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.d);
        stringBuilder.append(", installationUuid=");
        stringBuilder.append(this.e);
        stringBuilder.append(", firebaseInstallationId=");
        stringBuilder.append(this.f);
        stringBuilder.append(", firebaseAuthenticationToken=");
        stringBuilder.append(this.g);
        stringBuilder.append(", appQualitySessionId=");
        stringBuilder.append(this.h);
        stringBuilder.append(", buildVersion=");
        stringBuilder.append(this.i);
        stringBuilder.append(", displayVersion=");
        stringBuilder.append(this.j);
        stringBuilder.append(", session=");
        stringBuilder.append(this.k);
        stringBuilder.append(", ndkPayload=");
        stringBuilder.append(this.l);
        stringBuilder.append(", appExitInfo=");
        stringBuilder.append(this.m);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.b {
        private String a;
        private String b;
        private int c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private F.e j;
        private F.d k;
        private F.a l;
        private byte m;

        b() {
        }

        private b(F f8) {
            this.a = f8.m();
            this.b = f8.i();
            this.c = f8.l();
            this.d = f8.j();
            this.e = f8.h();
            this.f = f8.g();
            this.g = f8.d();
            this.h = f8.e();
            this.i = f8.f();
            this.j = f8.n();
            this.k = f8.k();
            this.l = f8.c();
            this.m = 1;
        }

        @Override
        public F a() {
            if (this.m == 1 && this.a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            }
            StringBuilder stringBuilder = new StringBuilder();
            if (this.a == null) {
                stringBuilder.append(" sdkVersion");
            }
            if (this.b == null) {
                stringBuilder.append(" gmpAppId");
            }
            if ((1 & this.m) == 0) {
                stringBuilder.append(" platform");
            }
            if (this.d == null) {
                stringBuilder.append(" installationUuid");
            }
            if (this.h == null) {
                stringBuilder.append(" buildVersion");
            }
            if (this.i == null) {
                stringBuilder.append(" displayVersion");
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append((Object)stringBuilder);
            throw new IllegalStateException(stringBuilder2.toString());
        }

        @Override
        public F.b b(F.a a8) {
            this.l = a8;
            return this;
        }

        @Override
        public F.b c(String string) {
            this.g = string;
            return this;
        }

        @Override
        public F.b d(String string) {
            if (string != null) {
                this.h = string;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override
        public F.b e(String string) {
            if (string != null) {
                this.i = string;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override
        public F.b f(String string) {
            this.f = string;
            return this;
        }

        @Override
        public F.b g(String string) {
            this.e = string;
            return this;
        }

        @Override
        public F.b h(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override
        public F.b i(String string) {
            if (string != null) {
                this.d = string;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override
        public F.b j(F.d d8) {
            this.k = d8;
            return this;
        }

        @Override
        public F.b k(int n8) {
            this.c = n8;
            this.m = (byte)(this.m | 1);
            return this;
        }

        @Override
        public F.b l(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override
        public F.b m(F.e e8) {
            this.j = e8;
            return this;
        }
    }
}

