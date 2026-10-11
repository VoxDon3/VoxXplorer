/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.w;

final class m
extends w {
    private final w.c a;
    private final w.b b;

    private m(w.c c8, w.b b8) {
        this.a = c8;
        this.b = b8;
    }

    @Override
    public w.b b() {
        return this.b;
    }

    @Override
    public w.c c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof w) {
            object = (w)object;
            Enum enum_ = this.a;
            if ((enum_ == null ? ((w)object).c() == null : enum_.equals((Object)((w)object).c())) && ((enum_ = this.b) == null ? ((w)object).b() == null : enum_.equals((Object)((w)object).b()))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Enum enum_ = this.a;
        int n8 = 0;
        int n9 = enum_ == null ? 0 : enum_.hashCode();
        enum_ = this.b;
        if (enum_ != null) {
            n8 = enum_.hashCode();
        }
        return (n9 ^ 0xF4243) * 1000003 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetworkConnectionInfo{networkType=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", mobileSubtype=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends w.a {
        private w.c a;
        private w.b b;

        b() {
        }

        @Override
        public w a() {
            return new m(this.a, this.b);
        }

        @Override
        public w.a b(w.b b8) {
            this.b = b8;
            return this;
        }

        @Override
        public w.a c(w.c c8) {
            this.a = c8;
            return this;
        }
    }
}

