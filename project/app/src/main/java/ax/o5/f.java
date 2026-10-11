/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.p;
import ax.o5.s;

final class f
extends p {
    private final s a;
    private final p.b b;

    private f(s s8, p.b b8) {
        this.a = s8;
        this.b = b8;
    }

    @Override
    public s b() {
        return this.a;
    }

    @Override
    public p.b c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof p) {
            object = (p)object;
            Object object2 = this.a;
            if ((object2 == null ? ((p)object).b() == null : object2.equals(((p)object).b())) && ((object2 = this.b) == null ? ((p)object).c() == null : object2.equals((Object)((p)object).c()))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (n9 ^ 0xF4243) * 1000003 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ComplianceData{privacyContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(", productIdOrigin=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends p.a {
        private s a;
        private p.b b;

        b() {
        }

        @Override
        public p a() {
            return new f(this.a, this.b);
        }

        @Override
        public p.a b(s s8) {
            this.a = s8;
            return this;
        }

        @Override
        public p.a c(p.b b8) {
            this.b = b8;
            return this;
        }
    }
}

