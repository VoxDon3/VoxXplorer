/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class t
extends F.e.d.a.c {
    private final String a;
    private final int b;
    private final int c;
    private final boolean d;

    private t(String string, int n8, int n9, boolean bl) {
        this.a = string;
        this.b = n8;
        this.c = n9;
        this.d = bl;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.a;
    }

    @Override
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.a.c && this.a.equals(((F.e.d.a.c)(object = (F.e.d.a.c)object)).d()) && this.b == ((F.e.d.a.c)object).c() && this.c == ((F.e.d.a.c)object).b() && this.d == ((F.e.d.a.c)object).e();
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b;
        int n10 = this.c;
        int n11 = this.d ? 1231 : 1237;
        return (((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProcessDetails{processName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", pid=");
        stringBuilder.append(this.b);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.c);
        stringBuilder.append(", defaultProcess=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.a.c.a {
        private String a;
        private int b;
        private int c;
        private boolean d;
        private byte e;

        b() {
        }

        @Override
        public F.e.d.a.c a() {
            CharSequence charSequence;
            if (this.e == 7 && (charSequence = this.a) != null) {
                return new t((String)charSequence, this.b, this.c, this.d);
            }
            StringBuilder stringBuilder = new StringBuilder();
            if (this.a == null) {
                stringBuilder.append(" processName");
            }
            if ((this.e & 1) == 0) {
                stringBuilder.append(" pid");
            }
            if ((this.e & 2) == 0) {
                stringBuilder.append(" importance");
            }
            if ((this.e & 4) == 0) {
                stringBuilder.append(" defaultProcess");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((Object)stringBuilder);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.d.a.c.a b(boolean bl) {
            this.d = bl;
            this.e = (byte)(this.e | 4);
            return this;
        }

        @Override
        public F.e.d.a.c.a c(int n8) {
            this.c = n8;
            this.e = (byte)(this.e | 2);
            return this;
        }

        @Override
        public F.e.d.a.c.a d(int n8) {
            this.b = n8;
            this.e = (byte)(this.e | 1);
            return this;
        }

        @Override
        public F.e.d.a.c.a e(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }
}

