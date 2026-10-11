/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class q
extends F.e.d.a.b.d {
    private final String a;
    private final String b;
    private final long c;

    private q(String string, String string2, long l8) {
        this.a = string;
        this.b = string2;
        this.c = l8;
    }

    @Override
    public long b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.a.b.d && this.a.equals(((F.e.d.a.b.d)(object = (F.e.d.a.b.d)object)).d()) && this.b.equals(((F.e.d.a.b.d)object).c()) && this.c == ((F.e.d.a.b.d)object).b();
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        long l8 = this.c;
        return ((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Signal{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", address=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.a.b.d.a {
        private String a;
        private String b;
        private long c;
        private byte d;

        b() {
        }

        @Override
        public F.e.d.a.b.d a() {
            CharSequence charSequence;
            CharSequence charSequence2;
            if (this.d == 1 && (charSequence2 = this.a) != null && (charSequence = this.b) != null) {
                return new q((String)charSequence2, (String)charSequence, this.c);
            }
            charSequence = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)charSequence).append(" name");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence).append(" code");
            }
            if ((1 & this.d) == 0) {
                ((StringBuilder)charSequence).append(" address");
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("Missing required properties:");
            ((StringBuilder)charSequence2).append((Object)charSequence);
            throw new IllegalStateException(((StringBuilder)charSequence2).toString());
        }

        @Override
        public F.e.d.a.b.d.a b(long l8) {
            this.c = l8;
            this.d = (byte)(this.d | 1);
            return this;
        }

        @Override
        public F.e.d.a.b.d.a c(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override
        public F.e.d.a.b.d.a d(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }
}

