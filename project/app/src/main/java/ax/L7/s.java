/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class s
extends F.e.d.a.b.e.b {
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    private s(long l8, String string, String string2, long l9, int n8) {
        this.a = l8;
        this.b = string;
        this.c = string2;
        this.d = l9;
        this.e = n8;
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public long d() {
        return this.d;
    }

    @Override
    public long e() {
        return this.a;
    }

    public boolean equals(Object object) {
        F.e.d.a.b.e.b b8;
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.a.b.e.b && this.a == (b8 = (F.e.d.a.b.e.b)object).e() && this.b.equals(b8.f()) && ((object = this.c) == null ? b8.b() == null : ((String)object).equals(b8.b())) && this.d == b8.d() && this.e == b8.c();
    }

    @Override
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        int n9 = this.b.hashCode();
        String string = this.c;
        int n10 = string == null ? 0 : string.hashCode();
        l8 = this.d;
        int n11 = (int)(l8 ^ l8 >>> 32);
        return this.e ^ ((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Frame{pc=");
        stringBuilder.append(this.a);
        stringBuilder.append(", symbol=");
        stringBuilder.append(this.b);
        stringBuilder.append(", file=");
        stringBuilder.append(this.c);
        stringBuilder.append(", offset=");
        stringBuilder.append(this.d);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.a.b.e.b.a {
        private long a;
        private String b;
        private String c;
        private long d;
        private int e;
        private byte f;

        b() {
        }

        @Override
        public F.e.d.a.b.e.b a() {
            CharSequence charSequence;
            if (this.f == 7 && (charSequence = this.b) != null) {
                return new s(this.a, (String)charSequence, this.c, this.d, this.e);
            }
            charSequence = new StringBuilder();
            if ((this.f & 1) == 0) {
                ((StringBuilder)charSequence).append(" pc");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence).append(" symbol");
            }
            if ((this.f & 2) == 0) {
                ((StringBuilder)charSequence).append(" offset");
            }
            if ((this.f & 4) == 0) {
                ((StringBuilder)charSequence).append(" importance");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing required properties:");
            stringBuilder.append((Object)charSequence);
            throw new IllegalStateException(stringBuilder.toString());
        }

        @Override
        public F.e.d.a.b.e.b.a b(String string) {
            this.c = string;
            return this;
        }

        @Override
        public F.e.d.a.b.e.b.a c(int n8) {
            this.e = n8;
            this.f = (byte)(this.f | 4);
            return this;
        }

        @Override
        public F.e.d.a.b.e.b.a d(long l8) {
            this.d = l8;
            this.f = (byte)(this.f | 2);
            return this;
        }

        @Override
        public F.e.d.a.b.e.b.a e(long l8) {
            this.a = l8;
            this.f = (byte)(this.f | 1);
            return this;
        }

        @Override
        public F.e.d.a.b.e.b.a f(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }
}

