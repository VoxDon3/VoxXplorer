/*
 * Decompiled with CFR 0.152.
 */
package ax.m8;

import ax.m8.d;

final class b
extends d {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;

    private b(String string, String string2, String string3, String string4, long l8) {
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = l8;
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public String c() {
        return this.e;
    }

    @Override
    public String d() {
        return this.b;
    }

    @Override
    public long e() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof d && this.b.equals(((d)(object = (d)object)).d()) && this.c.equals(((d)object).f()) && this.d.equals(((d)object).b()) && this.e.equals(((d)object).c()) && this.f == ((d)object).e();
    }

    @Override
    public String f() {
        return this.c;
    }

    public int hashCode() {
        int n8 = this.b.hashCode();
        int n9 = this.c.hashCode();
        int n10 = this.d.hashCode();
        int n11 = this.e.hashCode();
        long l8 = this.f;
        return ((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RolloutAssignment{rolloutId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", variantId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", parameterKey=");
        stringBuilder.append(this.d);
        stringBuilder.append(", parameterValue=");
        stringBuilder.append(this.e);
        stringBuilder.append(", templateVersion=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends d.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private long e;
        private byte f;

        b() {
        }

        @Override
        public d a() {
            if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
                return new b(this.a, this.b, this.c, this.d, this.e);
            }
            StringBuilder stringBuilder = new StringBuilder();
            if (this.a == null) {
                stringBuilder.append(" rolloutId");
            }
            if (this.b == null) {
                stringBuilder.append(" variantId");
            }
            if (this.c == null) {
                stringBuilder.append(" parameterKey");
            }
            if (this.d == null) {
                stringBuilder.append(" parameterValue");
            }
            if ((1 & this.f) == 0) {
                stringBuilder.append(" templateVersion");
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append((Object)stringBuilder);
            throw new IllegalStateException(stringBuilder2.toString());
        }

        @Override
        public d.a b(String string) {
            if (string != null) {
                this.c = string;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override
        public d.a c(String string) {
            if (string != null) {
                this.d = string;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override
        public d.a d(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override
        public d.a e(long l8) {
            this.e = l8;
            this.f = (byte)(this.f | 1);
            return this;
        }

        @Override
        public d.a f(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }
}

