package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class u extends F.e.d.c {
    private final Double a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;

    static final class b extends F.e.d.c.a {
        private Double a;
        private int b;
        private boolean c;
        private int d;
        private long e;
        private long f;
        private byte g;

        b() {
        }

        @Override // ax.L7.F.e.d.c.a
        public F.e.d.c a() {
            if (this.g == 31) {
                return new u(this.a, this.b, this.c, this.d, this.e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.c.a
        public F.e.d.c.a b(Double d) {
            this.a = d;
            return this;
        }

        @Override // ax.L7.F.e.d.c.a
        public F.e.d.c.a c(int i) {
            this.b = i;
            this.g = (byte) (this.g | 1);
            return this;
        }

        @Override // ax.L7.F.e.d.c.a
        public F.e.d.c.a d(long j) {
            this.f = j;
            this.g = (byte) (this.g | 16);
            return this;
        }

        @Override // ax.L7.F.e.d.c.a
        public F.e.d.c.a e(int i) {
            this.d = i;
            this.g = (byte) (this.g | 4);
            return this;
        }

        @Override // ax.L7.F.e.d.c.a
        public F.e.d.c.a f(boolean z) {
            this.c = z;
            this.g = (byte) (this.g | 2);
            return this;
        }

        @Override // ax.L7.F.e.d.c.a
        public F.e.d.c.a g(long j) {
            this.e = j;
            this.g = (byte) (this.g | 8);
            return this;
        }
    }

    @Override // ax.L7.F.e.d.c
    public Double b() {
        return this.a;
    }

    @Override // ax.L7.F.e.d.c
    public int c() {
        return this.b;
    }

    @Override // ax.L7.F.e.d.c
    public long d() {
        return this.f;
    }

    @Override // ax.L7.F.e.d.c
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.c) {
            F.e.d.c cVar = (F.e.d.c) obj;
            Double d = this.a;
            if (d != null ? d.equals(cVar.b()) : cVar.b() == null) {
                if (this.b == cVar.c() && this.c == cVar.g() && this.d == cVar.e() && this.e == cVar.f() && this.f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ax.L7.F.e.d.c
    public long f() {
        return this.e;
    }

    @Override // ax.L7.F.e.d.c
    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d = this.a;
        int hashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }

    private u(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }
}
