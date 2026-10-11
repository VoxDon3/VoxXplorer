/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class o
extends F.e.d.a.b.a {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    private o(long l8, long l9, String string, String string2) {
        this.a = l8;
        this.b = l9;
        this.c = string;
        this.d = string2;
    }

    @Override
    public long b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public long d() {
        return this.b;
    }

    @Override
    public String e() {
        return this.d;
    }

    public boolean equals(Object object) {
        F.e.d.a.b.a a8;
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.a.b.a && this.a == (a8 = (F.e.d.a.b.a)object).b() && this.b == a8.d() && this.c.equals(a8.c()) && ((object = this.d) == null ? a8.e() == null : ((String)object).equals(a8.e()));
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        int n9 = (int)(l8 ^ l8 >>> 32);
        int n10 = this.c.hashCode();
        String string = this.d;
        int n11 = string == null ? 0 : string.hashCode();
        return n11 ^ (((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BinaryImage{baseAddress=");
        stringBuilder.append(this.a);
        stringBuilder.append(", size=");
        stringBuilder.append(this.b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.c);
        stringBuilder.append(", uuid=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.a.b.a.a {
        private long a;
        private long b;
        private String c;
        private String d;
        private byte e;

        b() {
        }

        @Override
        public F.e.d.a.b.a a() {
            CharSequence charSequence;
            if (this.e == 3 && (charSequence = this.c) != null) {
                return new o(this.a, this.b, (String)charSequence, this.d);
            }
            charSequence = new StringBuilder();
            if ((this.e & 1) == 0) {
                ((StringBuilder)charSequence).append(" baseAddress");
            }
            if ((this.e & 2) == 0) {
                ((StringBuilder)charSequence).append(" size");
            }
            if (this.c == null) {
                ((StringBuilder)charSequence).append(" name");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing required properties:");
            stringBuilder.append((Object)charSequence);
            throw new IllegalStateException(stringBuilder.toString());
        }

        @Override
        public F.e.d.a.b.a.a b(long l8) {
            this.a = l8;
            this.e = (byte)(this.e | 1);
            return this;
        }

        @Override
        public F.e.d.a.b.a.a c(String string) {
            if (string != null) {
                this.c = string;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override
        public F.e.d.a.b.a.a d(long l8) {
            this.b = l8;
            this.e = (byte)(this.e | 2);
            return this;
        }

        @Override
        public F.e.d.a.b.a.a e(String string) {
            this.d = string;
            return this;
        }
    }
}

