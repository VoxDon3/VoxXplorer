/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class z
extends F.e.e {
    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    private z(int n8, String string, String string2, boolean bl) {
        this.a = n8;
        this.b = string;
        this.c = string2;
        this.d = bl;
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.a;
    }

    @Override
    public String d() {
        return this.b;
    }

    @Override
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof F.e.e && this.a == ((F.e.e)(object = (F.e.e)object)).c() && this.b.equals(((F.e.e)object).d()) && this.c.equals(((F.e.e)object).b()) && this.d == ((F.e.e)object).e();
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b.hashCode();
        int n10 = this.c.hashCode();
        int n11 = this.d ? 1231 : 1237;
        return (((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OperatingSystem{platform=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        stringBuilder.append(this.b);
        stringBuilder.append(", buildVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", jailbroken=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.e.a {
        private int a;
        private String b;
        private String c;
        private boolean d;
        private byte e;

        b() {
        }

        @Override
        public F.e.e a() {
            CharSequence charSequence;
            CharSequence charSequence2;
            if (this.e == 3 && (charSequence2 = this.b) != null && (charSequence = this.c) != null) {
                return new z(this.a, (String)charSequence2, (String)charSequence, this.d);
            }
            charSequence2 = new StringBuilder();
            if ((this.e & 1) == 0) {
                ((StringBuilder)charSequence2).append(" platform");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence2).append(" version");
            }
            if (this.c == null) {
                ((StringBuilder)charSequence2).append(" buildVersion");
            }
            if ((this.e & 2) == 0) {
                ((StringBuilder)charSequence2).append(" jailbroken");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((Object)charSequence2);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.e.a b(String string) {
            if (string != null) {
                this.c = string;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override
        public F.e.e.a c(boolean bl) {
            this.d = bl;
            this.e = (byte)(this.e | 2);
            return this;
        }

        @Override
        public F.e.e.a d(int n8) {
            this.a = n8;
            this.e = (byte)(this.e | 1);
            return this;
        }

        @Override
        public F.e.e.a e(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }
}

