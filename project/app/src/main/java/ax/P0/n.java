/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import ax.S0.a;
import ax.S0.d0;

public final class n {
    public static final n e = new b(0).e();
    private static final String f = d0.G0(0);
    private static final String g = d0.G0(1);
    private static final String h = d0.G0(2);
    private static final String i = d0.G0(3);
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    private n(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        object = (n)object;
        return this.a == ((n)object).a && this.b == ((n)object).b && this.c == ((n)object).c && j.Objects.equals((Object)this.d, (Object)((n)object).d);
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b;
        int n10 = this.c;
        String string = this.d;
        int n11 = string == null ? 0 : string.hashCode();
        return (((527 + n8) * 31 + n9) * 31 + n10) * 31 + n11;
    }

    public static final class b {
        private final int a;
        private int b;
        private int c;
        private String d;

        public b(int n8) {
            this.a = n8;
        }

        public n e() {
            boolean bl = this.b <= this.c;
            ax.S0.a.a(bl);
            return new n(this);
        }

        public b f(int n8) {
            this.c = n8;
            return this;
        }

        public b g(int n8) {
            this.b = n8;
            return this;
        }
    }
}

