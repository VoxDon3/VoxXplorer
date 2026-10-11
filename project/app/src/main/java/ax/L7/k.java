/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class k
extends F.e.c {
    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    private k(int n8, String string, int n9, long l8, long l9, boolean bl, int n10, String string2, String string3) {
        this.a = n8;
        this.b = string;
        this.c = n9;
        this.d = l8;
        this.e = l9;
        this.f = bl;
        this.g = n10;
        this.h = string2;
        this.i = string3;
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public int c() {
        return this.c;
    }

    @Override
    public long d() {
        return this.e;
    }

    @Override
    public String e() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof F.e.c && this.a == ((F.e.c)(object = (F.e.c)object)).b() && this.b.equals(((F.e.c)object).f()) && this.c == ((F.e.c)object).c() && this.d == ((F.e.c)object).h() && this.e == ((F.e.c)object).d() && this.f == ((F.e.c)object).j() && this.g == ((F.e.c)object).i() && this.h.equals(((F.e.c)object).e()) && this.i.equals(((F.e.c)object).g());
    }

    @Override
    public String f() {
        return this.b;
    }

    @Override
    public String g() {
        return this.i;
    }

    @Override
    public long h() {
        return this.d;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b.hashCode();
        int n10 = this.c;
        long l8 = this.d;
        int n11 = (int)(l8 ^ l8 >>> 32);
        l8 = this.e;
        int n12 = (int)(l8 ^ l8 >>> 32);
        int n13 = this.f ? 1231 : 1237;
        return ((((((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override
    public int i() {
        return this.g;
    }

    @Override
    public boolean j() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device{arch=");
        stringBuilder.append(this.a);
        stringBuilder.append(", model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", cores=");
        stringBuilder.append(this.c);
        stringBuilder.append(", ram=");
        stringBuilder.append(this.d);
        stringBuilder.append(", diskSpace=");
        stringBuilder.append(this.e);
        stringBuilder.append(", simulator=");
        stringBuilder.append(this.f);
        stringBuilder.append(", state=");
        stringBuilder.append(this.g);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.h);
        stringBuilder.append(", modelClass=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.c.a {
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

        @Override
        public F.e.c a() {
            CharSequence charSequence;
            String string;
            CharSequence charSequence2;
            if (this.j == 63 && (charSequence2 = this.b) != null && (string = this.h) != null && (charSequence = this.i) != null) {
                return new k(this.a, (String)charSequence2, this.c, this.d, this.e, this.f, this.g, string, (String)charSequence);
            }
            charSequence = new StringBuilder();
            if ((this.j & 1) == 0) {
                ((StringBuilder)charSequence).append(" arch");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence).append(" model");
            }
            if ((this.j & 2) == 0) {
                ((StringBuilder)charSequence).append(" cores");
            }
            if ((this.j & 4) == 0) {
                ((StringBuilder)charSequence).append(" ram");
            }
            if ((this.j & 8) == 0) {
                ((StringBuilder)charSequence).append(" diskSpace");
            }
            if ((this.j & 0x10) == 0) {
                ((StringBuilder)charSequence).append(" simulator");
            }
            if ((this.j & 0x20) == 0) {
                ((StringBuilder)charSequence).append(" state");
            }
            if (this.h == null) {
                ((StringBuilder)charSequence).append(" manufacturer");
            }
            if (this.i == null) {
                ((StringBuilder)charSequence).append(" modelClass");
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("Missing required properties:");
            ((StringBuilder)charSequence2).append((Object)charSequence);
            throw new IllegalStateException(((StringBuilder)charSequence2).toString());
        }

        @Override
        public F.e.c.a b(int n8) {
            this.a = n8;
            this.j = (byte)(this.j | 1);
            return this;
        }

        @Override
        public F.e.c.a c(int n8) {
            this.c = n8;
            this.j = (byte)(this.j | 2);
            return this;
        }

        @Override
        public F.e.c.a d(long l8) {
            this.e = l8;
            this.j = (byte)(this.j | 8);
            return this;
        }

        @Override
        public F.e.c.a e(String string) {
            if (string != null) {
                this.h = string;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override
        public F.e.c.a f(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override
        public F.e.c.a g(String string) {
            if (string != null) {
                this.i = string;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override
        public F.e.c.a h(long l8) {
            this.d = l8;
            this.j = (byte)(this.j | 4);
            return this;
        }

        @Override
        public F.e.c.a i(boolean bl) {
            this.f = bl;
            this.j = (byte)(this.j | 0x10);
            return this;
        }

        @Override
        public F.e.c.a j(int n8) {
            this.g = n8;
            this.j = (byte)(this.j | 0x20);
            return this;
        }
    }
}

