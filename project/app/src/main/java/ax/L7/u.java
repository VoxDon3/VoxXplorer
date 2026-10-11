/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class u
extends F.e.d.c {
    private final Double a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;

    private u(Double d8, int n8, boolean bl, int n9, long l8, long l9) {
        this.a = d8;
        this.b = n8;
        this.c = bl;
        this.d = n9;
        this.e = l8;
        this.f = l9;
    }

    @Override
    public Double b() {
        return this.a;
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public long d() {
        return this.f;
    }

    @Override
    public int e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof F.e.d.c) {
            F.e.d.c c8 = (F.e.d.c)object;
            object = this.a;
            if ((object == null ? c8.b() == null : ((Double)object).equals(c8.b())) && this.b == c8.c() && this.c == c8.g() && this.d == c8.e() && this.e == c8.f() && this.f == c8.d()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public long f() {
        return this.e;
    }

    @Override
    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d8 = this.a;
        int n8 = d8 == null ? 0 : d8.hashCode();
        int n9 = this.b;
        int n10 = this.c ? 1231 : 1237;
        int n11 = this.d;
        long l8 = this.e;
        int n12 = (int)(l8 ^ l8 >>> 32);
        l8 = this.f;
        return (((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device{batteryLevel=");
        stringBuilder.append(this.a);
        stringBuilder.append(", batteryVelocity=");
        stringBuilder.append(this.b);
        stringBuilder.append(", proximityOn=");
        stringBuilder.append(this.c);
        stringBuilder.append(", orientation=");
        stringBuilder.append(this.d);
        stringBuilder.append(", ramUsed=");
        stringBuilder.append(this.e);
        stringBuilder.append(", diskUsed=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.c.a {
        private Double a;
        private int b;
        private boolean c;
        private int d;
        private long e;
        private long f;
        private byte g;

        b() {
        }

        @Override
        public F.e.d.c a() {
            if (this.g != 31) {
                StringBuilder stringBuilder = new StringBuilder();
                if ((this.g & 1) == 0) {
                    stringBuilder.append(" batteryVelocity");
                }
                if ((this.g & 2) == 0) {
                    stringBuilder.append(" proximityOn");
                }
                if ((this.g & 4) == 0) {
                    stringBuilder.append(" orientation");
                }
                if ((this.g & 8) == 0) {
                    stringBuilder.append(" ramUsed");
                }
                if ((this.g & 0x10) == 0) {
                    stringBuilder.append(" diskUsed");
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Missing required properties:");
                stringBuilder2.append((Object)stringBuilder);
                throw new IllegalStateException(stringBuilder2.toString());
            }
            return new u(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        @Override
        public F.e.d.c.a b(Double d8) {
            this.a = d8;
            return this;
        }

        @Override
        public F.e.d.c.a c(int n8) {
            this.b = n8;
            this.g = (byte)(this.g | 1);
            return this;
        }

        @Override
        public F.e.d.c.a d(long l8) {
            this.f = l8;
            this.g = (byte)(this.g | 0x10);
            return this;
        }

        @Override
        public F.e.d.c.a e(int n8) {
            this.d = n8;
            this.g = (byte)(this.g | 4);
            return this;
        }

        @Override
        public F.e.d.c.a f(boolean bl) {
            this.c = bl;
            this.g = (byte)(this.g | 2);
            return this;
        }

        @Override
        public F.e.d.c.a g(long l8) {
            this.e = l8;
            this.g = (byte)(this.g | 8);
            return this;
        }
    }
}

