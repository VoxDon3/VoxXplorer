/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class w
extends F.e.d.e {
    private final F.e.d.e.b a;
    private final String b;
    private final String c;
    private final long d;

    private w(F.e.d.e.b b8, String string, String string2, long l8) {
        this.a = b8;
        this.b = string;
        this.c = string2;
        this.d = l8;
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public F.e.d.e.b d() {
        return this.a;
    }

    @Override
    public long e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.e && this.a.equals(((F.e.d.e)(object = (F.e.d.e)object)).d()) && this.b.equals(((F.e.d.e)object).b()) && this.c.equals(((F.e.d.e)object).c()) && this.d == ((F.e.d.e)object).e();
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        int n10 = this.c.hashCode();
        long l8 = this.d;
        return (((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RolloutAssignment{rolloutVariant=");
        stringBuilder.append(this.a);
        stringBuilder.append(", parameterKey=");
        stringBuilder.append(this.b);
        stringBuilder.append(", parameterValue=");
        stringBuilder.append(this.c);
        stringBuilder.append(", templateVersion=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.e.a {
        private F.e.d.e.b a;
        private String b;
        private String c;
        private long d;
        private byte e;

        b() {
        }

        @Override
        public F.e.d.e a() {
            CharSequence charSequence;
            String string;
            Object object;
            if (this.e == 1 && (object = this.a) != null && (string = this.b) != null && (charSequence = this.c) != null) {
                return new w((F.e.d.e.b)object, string, (String)charSequence, this.d);
            }
            object = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)object).append(" rolloutVariant");
            }
            if (this.b == null) {
                ((StringBuilder)object).append(" parameterKey");
            }
            if (this.c == null) {
                ((StringBuilder)object).append(" parameterValue");
            }
            if ((1 & this.e) == 0) {
                ((StringBuilder)object).append(" templateVersion");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append(object);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.d.e.a b(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override
        public F.e.d.e.a c(String string) {
            if (string != null) {
                this.c = string;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override
        public F.e.d.e.a d(F.e.d.e.b b8) {
            if (b8 != null) {
                this.a = b8;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        @Override
        public F.e.d.e.a e(long l8) {
            this.d = l8;
            this.e = (byte)(this.e | 1);
            return this;
        }
    }
}

