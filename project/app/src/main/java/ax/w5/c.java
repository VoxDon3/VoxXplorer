/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import ax.w5.f;
import java.util.Set;

final class c
extends f.b {
    private final long a;
    private final long b;
    private final Set<f.c> c;

    private c(long l8, long l9, Set<f.c> set) {
        this.a = l8;
        this.b = l9;
        this.c = set;
    }

    @Override
    long b() {
        return this.a;
    }

    @Override
    Set<f.c> c() {
        return this.c;
    }

    @Override
    long d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof f.b && this.a == ((f.b)(object = (f.b)object)).b() && this.b == ((f.b)object).d() && this.c.equals(((f.b)object).c());
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        int n9 = (int)(l8 ^ l8 >>> 32);
        return this.c.hashCode() ^ ((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConfigValue{delta=");
        stringBuilder.append(this.a);
        stringBuilder.append(", maxAllowedDelay=");
        stringBuilder.append(this.b);
        stringBuilder.append(", flags=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends f.b.a {
        private Long a;
        private Long b;
        private Set<f.c> c;

        b() {
        }

        @Override
        public f.b a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("");
                ((StringBuilder)object).append(" delta");
                object2 = ((StringBuilder)object).toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" maxAllowedDelay");
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" flags");
                object2 = ((StringBuilder)object2).toString();
            }
            if (((String)object2).isEmpty()) {
                return new c(this.a, this.b, this.c);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Missing required properties:");
            ((StringBuilder)object).append((String)object2);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        @Override
        public f.b.a b(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public f.b.a c(Set<f.c> set) {
            if (set != null) {
                this.c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override
        public f.b.a d(long l8) {
            this.b = l8;
            return this;
        }
    }
}

