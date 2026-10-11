/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class i
extends F.e.a {
    private final String a;
    private final String b;
    private final String c;
    private final F.e.a.b d;
    private final String e;
    private final String f;
    private final String g;

    private i(String string, String string2, String string3, F.e.a.b b8, String string4, String string5, String string6) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = b8;
        this.e = string4;
        this.f = string5;
        this.g = string6;
    }

    @Override
    public String b() {
        return this.f;
    }

    @Override
    public String c() {
        return this.g;
    }

    @Override
    public String d() {
        return this.c;
    }

    @Override
    public String e() {
        return this.a;
    }

    public boolean equals(Object object) {
        Object object2;
        if (object == this) {
            return true;
        }
        return object instanceof F.e.a && this.a.equals(((F.e.a)(object = (F.e.a)object)).e()) && this.b.equals(((F.e.a)object).h()) && ((object2 = this.c) == null ? ((F.e.a)object).d() == null : ((String)object2).equals(((F.e.a)object).d())) && ((object2 = this.d) == null ? ((F.e.a)object).g() == null : object2.equals(((F.e.a)object).g())) && ((object2 = this.e) == null ? ((F.e.a)object).f() == null : ((String)object2).equals(((F.e.a)object).f())) && ((object2 = this.f) == null ? ((F.e.a)object).b() == null : ((String)object2).equals(((F.e.a)object).b())) && ((object2 = this.g) == null ? ((F.e.a)object).c() == null : ((String)object2).equals(((F.e.a)object).c()));
    }

    @Override
    public String f() {
        return this.e;
    }

    @Override
    public F.e.a.b g() {
        return this.d;
    }

    @Override
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        Object object = this.c;
        int n10 = 0;
        int n11 = object == null ? 0 : ((String)object).hashCode();
        object = this.d;
        int n12 = object == null ? 0 : object.hashCode();
        object = this.e;
        int n13 = object == null ? 0 : ((String)object).hashCode();
        object = this.f;
        int n14 = object == null ? 0 : ((String)object).hashCode();
        object = this.g;
        if (object != null) {
            n10 = ((String)object).hashCode();
        }
        return ((((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application{identifier=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        stringBuilder.append(this.b);
        stringBuilder.append(", displayVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", organization=");
        stringBuilder.append(this.d);
        stringBuilder.append(", installationUuid=");
        stringBuilder.append(this.e);
        stringBuilder.append(", developmentPlatform=");
        stringBuilder.append(this.f);
        stringBuilder.append(", developmentPlatformVersion=");
        stringBuilder.append(this.g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.a.a {
        private String a;
        private String b;
        private String c;
        private F.e.a.b d;
        private String e;
        private String f;
        private String g;

        b() {
        }

        @Override
        public F.e.a a() {
            CharSequence charSequence;
            CharSequence charSequence2 = this.a;
            if (charSequence2 != null && (charSequence = this.b) != null) {
                return new i((String)charSequence2, (String)charSequence, this.c, this.d, this.e, this.f, this.g);
            }
            charSequence2 = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)charSequence2).append(" identifier");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence2).append(" version");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((Object)charSequence2);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.a.a b(String string) {
            this.f = string;
            return this;
        }

        @Override
        public F.e.a.a c(String string) {
            this.g = string;
            return this;
        }

        @Override
        public F.e.a.a d(String string) {
            this.c = string;
            return this;
        }

        @Override
        public F.e.a.a e(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override
        public F.e.a.a f(String string) {
            this.e = string;
            return this;
        }

        @Override
        public F.e.a.a g(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }
}

