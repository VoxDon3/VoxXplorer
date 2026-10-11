/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.a;
import ax.o5.o;

final class e
extends o {
    private final o.b a;
    private final a b;

    private e(o.b b8, a a8) {
        this.a = b8;
        this.b = a8;
    }

    @Override
    public a b() {
        return this.b;
    }

    @Override
    public o.b c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o) {
            object = (o)object;
            Object object2 = this.a;
            if ((object2 == null ? ((o)object).c() == null : ((Object)object2).equals((Object)((o)object).c())) && ((object2 = this.b) == null ? ((o)object).b() == null : ((Object)object2).equals(((o)object).b()))) {
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
        stringBuilder.append("ClientInfo{clientType=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", androidClientInfo=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends o.a {
        private o.b a;
        private a b;

        b() {
        }

        @Override
        public o a() {
            return new e(this.a, this.b);
        }

        @Override
        public o.a b(a a8) {
            this.b = a8;
            return this;
        }

        @Override
        public o.a c(o.b b8) {
            this.a = b8;
            return this;
        }
    }
}

