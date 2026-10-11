/*
 * Decompiled with CFR 0.152.
 */
package ax.d8;

import ax.d8.c;
import ax.d8.d;

final class a
extends d {
    private final String b;
    private final c.a c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;

    private a(String string, c.a a8, String string2, String string3, long l8, long l9, String string4) {
        this.b = string;
        this.c = a8;
        this.d = string2;
        this.e = string3;
        this.f = l8;
        this.g = l9;
        this.h = string4;
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public String d() {
        return this.b;
    }

    @Override
    public String e() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            object = (d)object;
            String string = this.b;
            if ((string == null ? ((d)object).d() == null : string.equals(((d)object).d())) && ((Object)((Object)this.c)).equals((Object)((d)object).g()) && ((string = this.d) == null ? ((d)object).b() == null : string.equals(((d)object).b())) && ((string = this.e) == null ? ((d)object).f() == null : string.equals(((d)object).f())) && this.f == ((d)object).c() && this.g == ((d)object).h() && ((string = this.h) == null ? ((d)object).e() == null : string.equals(((d)object).e()))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String f() {
        return this.e;
    }

    @Override
    public c.a g() {
        return this.c;
    }

    @Override
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String string = this.b;
        int n8 = 0;
        int n9 = string == null ? 0 : string.hashCode();
        int n10 = ((Object)((Object)this.c)).hashCode();
        string = this.d;
        int n11 = string == null ? 0 : string.hashCode();
        string = this.e;
        int n12 = string == null ? 0 : string.hashCode();
        long l8 = this.f;
        int n13 = (int)(l8 ^ l8 >>> 32);
        l8 = this.g;
        int n14 = (int)(l8 ^ l8 >>> 32);
        string = this.h;
        if (string != null) {
            n8 = string.hashCode();
        }
        return ((((((n9 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n8;
    }

    @Override
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PersistedInstallationEntry{firebaseInstallationId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", registrationStatus=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.e);
        stringBuilder.append(", expiresInSecs=");
        stringBuilder.append(this.f);
        stringBuilder.append(", tokenCreationEpochInSecs=");
        stringBuilder.append(this.g);
        stringBuilder.append(", fisError=");
        stringBuilder.append(this.h);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends d.a {
        private String a;
        private c.a b;
        private String c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        b() {
        }

        private b(d d8) {
            this.a = d8.d();
            this.b = d8.g();
            this.c = d8.b();
            this.d = d8.f();
            this.e = d8.c();
            this.f = d8.h();
            this.g = d8.e();
        }

        @Override
        public d a() {
            Object object = this.b;
            Object object2 = "";
            if (object == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("");
                ((StringBuilder)object).append(" registrationStatus");
                object2 = ((StringBuilder)object).toString();
            }
            object = object2;
            if (this.e == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" expiresInSecs");
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (this.f == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" tokenCreationEpochInSecs");
                object2 = ((StringBuilder)object2).toString();
            }
            if (((String)object2).isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Missing required properties:");
            ((StringBuilder)object).append((String)object2);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        @Override
        public d.a b(String string) {
            this.c = string;
            return this;
        }

        @Override
        public d.a c(long l8) {
            this.e = l8;
            return this;
        }

        @Override
        public d.a d(String string) {
            this.a = string;
            return this;
        }

        @Override
        public d.a e(String string) {
            this.g = string;
            return this;
        }

        @Override
        public d.a f(String string) {
            this.d = string;
            return this;
        }

        @Override
        public d.a g(c.a a8) {
            if (a8 != null) {
                this.b = a8;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override
        public d.a h(long l8) {
            this.f = l8;
            return this;
        }
    }
}

