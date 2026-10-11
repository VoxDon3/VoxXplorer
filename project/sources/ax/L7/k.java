package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class k extends F.e.c {
    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    static final class b extends F.e.c.a {
        private int a;
        private String b;
        private int c;
        private long d;
        private long e;
        private boolean f;
        private int g;
        private String h;
        private String i;
        private byte j;

        b() {
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.j == 63 && (str = this.b) != null && (str2 = this.h) != null && (str3 = this.i) != null) {
                return new k(this.a, str, this.c, this.d, this.e, this.f, this.g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.b == null) {
                sb.append(" model");
            }
            if ((this.j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.j & 32) == 0) {
                sb.append(" state");
            }
            if (this.h == null) {
                sb.append(" manufacturer");
            }
            if (this.i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a b(int i) {
            this.a = i;
            this.j = (byte) (this.j | 1);
            return this;
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a c(int i) {
            this.c = i;
            this.j = (byte) (this.j | 2);
            return this;
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a d(long j) {
            this.e = j;
            this.j = (byte) (this.j | 8);
            return this;
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.h = str;
            return this;
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.b = str;
            return this;
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.i = str;
            return this;
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a h(long j) {
            this.d = j;
            this.j = (byte) (this.j | 4);
            return this;
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a i(boolean z) {
            this.f = z;
            this.j = (byte) (this.j | 16);
            return this;
        }

        @Override // ax.L7.F.e.c.a
        public F.e.c.a j(int i) {
            this.g = i;
            this.j = (byte) (this.j | 32);
            return this;
        }
    }

    @Override // ax.L7.F.e.c
    public int b() {
        return this.a;
    }

    @Override // ax.L7.F.e.c
    public int c() {
        return this.c;
    }

    @Override // ax.L7.F.e.c
    public long d() {
        return this.e;
    }

    @Override // ax.L7.F.e.c
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.c) {
            F.e.c cVar = (F.e.c) obj;
            if (this.a == cVar.b() && this.b.equals(cVar.f()) && this.c == cVar.c() && this.d == cVar.h() && this.e == cVar.d() && this.f == cVar.j() && this.g == cVar.i() && this.h.equals(cVar.e()) && this.i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.F.e.c
    public String f() {
        return this.b;
    }

    @Override // ax.L7.F.e.c
    public String g() {
        return this.i;
    }

    @Override // ax.L7.F.e.c
    public long h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // ax.L7.F.e.c
    public int i() {
        return this.g;
    }

    @Override // ax.L7.F.e.c
    public boolean j() {
        return this.f;
    }

    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.d + ", diskSpace=" + this.e + ", simulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }

    private k(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }
}
