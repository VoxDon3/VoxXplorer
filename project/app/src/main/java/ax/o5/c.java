/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.a;

final class c
extends a {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;

    private c(Integer n8, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        this.a = n8;
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        this.g = string6;
        this.h = string7;
        this.i = string8;
        this.j = string9;
        this.k = string10;
        this.l = string11;
    }

    @Override
    public String b() {
        return this.l;
    }

    @Override
    public String c() {
        return this.j;
    }

    @Override
    public String d() {
        return this.d;
    }

    @Override
    public String e() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a) {
            object = (a)object;
            Object object2 = this.a;
            if ((object2 == null ? ((a)object).m() == null : ((Integer)object2).equals(((a)object).m())) && ((object2 = this.b) == null ? ((a)object).j() == null : ((String)object2).equals(((a)object).j())) && ((object2 = this.c) == null ? ((a)object).f() == null : ((String)object2).equals(((a)object).f())) && ((object2 = this.d) == null ? ((a)object).d() == null : ((String)object2).equals(((a)object).d())) && ((object2 = this.e) == null ? ((a)object).l() == null : ((String)object2).equals(((a)object).l())) && ((object2 = this.f) == null ? ((a)object).k() == null : ((String)object2).equals(((a)object).k())) && ((object2 = this.g) == null ? ((a)object).h() == null : ((String)object2).equals(((a)object).h())) && ((object2 = this.h) == null ? ((a)object).e() == null : ((String)object2).equals(((a)object).e())) && ((object2 = this.i) == null ? ((a)object).g() == null : ((String)object2).equals(((a)object).g())) && ((object2 = this.j) == null ? ((a)object).c() == null : ((String)object2).equals(((a)object).c())) && ((object2 = this.k) == null ? ((a)object).i() == null : ((String)object2).equals(((a)object).i())) && ((object2 = this.l) == null ? ((a)object).b() == null : ((String)object2).equals(((a)object).b()))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String f() {
        return this.c;
    }

    @Override
    public String g() {
        return this.i;
    }

    @Override
    public String h() {
        return this.g;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : ((Integer)object).hashCode();
        object = this.b;
        int n10 = object == null ? 0 : ((String)object).hashCode();
        object = this.c;
        int n11 = object == null ? 0 : ((String)object).hashCode();
        object = this.d;
        int n12 = object == null ? 0 : ((String)object).hashCode();
        object = this.e;
        int n13 = object == null ? 0 : ((String)object).hashCode();
        object = this.f;
        int n14 = object == null ? 0 : ((String)object).hashCode();
        object = this.g;
        int n15 = object == null ? 0 : ((String)object).hashCode();
        object = this.h;
        int n16 = object == null ? 0 : ((String)object).hashCode();
        object = this.i;
        int n17 = object == null ? 0 : ((String)object).hashCode();
        object = this.j;
        int n18 = object == null ? 0 : ((String)object).hashCode();
        object = this.k;
        int n19 = object == null ? 0 : ((String)object).hashCode();
        object = this.l;
        if (object != null) {
            n8 = ((String)object).hashCode();
        }
        return (((((((((((n9 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n17) * 1000003 ^ n18) * 1000003 ^ n19) * 1000003 ^ n8;
    }

    @Override
    public String i() {
        return this.k;
    }

    @Override
    public String j() {
        return this.b;
    }

    @Override
    public String k() {
        return this.f;
    }

    @Override
    public String l() {
        return this.e;
    }

    @Override
    public Integer m() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AndroidClientInfo{sdkVersion=");
        stringBuilder.append(this.a);
        stringBuilder.append(", model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hardware=");
        stringBuilder.append(this.c);
        stringBuilder.append(", device=");
        stringBuilder.append(this.d);
        stringBuilder.append(", product=");
        stringBuilder.append(this.e);
        stringBuilder.append(", osBuild=");
        stringBuilder.append(this.f);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.g);
        stringBuilder.append(", fingerprint=");
        stringBuilder.append(this.h);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.i);
        stringBuilder.append(", country=");
        stringBuilder.append(this.j);
        stringBuilder.append(", mccMnc=");
        stringBuilder.append(this.k);
        stringBuilder.append(", applicationBuild=");
        stringBuilder.append(this.l);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends a.a {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;

        b() {
        }

        @Override
        public a a() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override
        public a.a b(String string) {
            this.l = string;
            return this;
        }

        @Override
        public a.a c(String string) {
            this.j = string;
            return this;
        }

        @Override
        public a.a d(String string) {
            this.d = string;
            return this;
        }

        @Override
        public a.a e(String string) {
            this.h = string;
            return this;
        }

        @Override
        public a.a f(String string) {
            this.c = string;
            return this;
        }

        @Override
        public a.a g(String string) {
            this.i = string;
            return this;
        }

        @Override
        public a.a h(String string) {
            this.g = string;
            return this;
        }

        @Override
        public a.a i(String string) {
            this.k = string;
            return this;
        }

        @Override
        public a.a j(String string) {
            this.b = string;
            return this;
        }

        @Override
        public a.a k(String string) {
            this.f = string;
            return this;
        }

        @Override
        public a.a l(String string) {
            this.e = string;
            return this;
        }

        @Override
        public a.a m(Integer n8) {
            this.a = n8;
            return this;
        }
    }
}

