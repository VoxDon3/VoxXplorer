/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class l
extends F.e.d {
    private final long a;
    private final String b;
    private final F.e.d.a c;
    private final F.e.d.c d;
    private final F.e.d.d e;
    private final F.e.d.f f;

    private l(long l8, String string, F.e.d.a a8, F.e.d.c c8, F.e.d.d d8, F.e.d.f f8) {
        this.a = l8;
        this.b = string;
        this.c = a8;
        this.d = c8;
        this.e = d8;
        this.f = f8;
    }

    @Override
    public F.e.d.a b() {
        return this.c;
    }

    @Override
    public F.e.d.c c() {
        return this.d;
    }

    @Override
    public F.e.d.d d() {
        return this.e;
    }

    @Override
    public F.e.d.f e() {
        return this.f;
    }

    public boolean equals(Object object) {
        Object object2;
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d && this.a == ((F.e.d)(object = (F.e.d)object)).f() && this.b.equals(((F.e.d)object).g()) && this.c.equals(((F.e.d)object).b()) && this.d.equals(((F.e.d)object).c()) && ((object2 = this.e) == null ? ((F.e.d)object).d() == null : object2.equals(((F.e.d)object).d())) && ((object2 = this.f) == null ? ((F.e.d)object).e() == null : object2.equals(((F.e.d)object).e()));
    }

    @Override
    public long f() {
        return this.a;
    }

    @Override
    public String g() {
        return this.b;
    }

    @Override
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        int n9 = this.b.hashCode();
        int n10 = this.c.hashCode();
        int n11 = this.d.hashCode();
        Object object = this.e;
        int n12 = 0;
        int n13 = object == null ? 0 : object.hashCode();
        object = this.f;
        if (object != null) {
            n12 = object.hashCode();
        }
        return (((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n13) * 1000003 ^ n12;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{timestamp=");
        stringBuilder.append(this.a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.b);
        stringBuilder.append(", app=");
        stringBuilder.append(this.c);
        stringBuilder.append(", device=");
        stringBuilder.append(this.d);
        stringBuilder.append(", log=");
        stringBuilder.append(this.e);
        stringBuilder.append(", rollouts=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.b {
        private long a;
        private String b;
        private F.e.d.a c;
        private F.e.d.c d;
        private F.e.d.d e;
        private F.e.d.f f;
        private byte g;

        b() {
        }

        private b(F.e.d d8) {
            this.a = d8.f();
            this.b = d8.g();
            this.c = d8.b();
            this.d = d8.c();
            this.e = d8.d();
            this.f = d8.e();
            this.g = 1;
        }

        @Override
        public F.e.d a() {
            Object object;
            Object object2;
            String string;
            if (this.g == 1 && (string = this.b) != null && (object2 = this.c) != null && (object = this.d) != null) {
                return new l(this.a, string, (F.e.d.a)object2, (F.e.d.c)object, this.e, this.f);
            }
            object = new StringBuilder();
            if ((1 & this.g) == 0) {
                ((StringBuilder)object).append(" timestamp");
            }
            if (this.b == null) {
                ((StringBuilder)object).append(" type");
            }
            if (this.c == null) {
                ((StringBuilder)object).append(" app");
            }
            if (this.d == null) {
                ((StringBuilder)object).append(" device");
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Missing required properties:");
            ((StringBuilder)object2).append(object);
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }

        @Override
        public F.e.d.b b(F.e.d.a a8) {
            if (a8 != null) {
                this.c = a8;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override
        public F.e.d.b c(F.e.d.c c8) {
            if (c8 != null) {
                this.d = c8;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override
        public F.e.d.b d(F.e.d.d d8) {
            this.e = d8;
            return this;
        }

        @Override
        public F.e.d.b e(F.e.d.f f8) {
            this.f = f8;
            return this;
        }

        @Override
        public F.e.d.b f(long l8) {
            this.a = l8;
            this.g = (byte)(this.g | 1);
            return this;
        }

        @Override
        public F.e.d.b g(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }
}

