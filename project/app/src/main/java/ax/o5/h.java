/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.r;

final class h
extends r {
    private final Integer a;

    private h(Integer n8) {
        this.a = n8;
    }

    @Override
    public Integer b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof r) {
            Object object2 = (r)object;
            object = this.a;
            object2 = ((r)object2).b();
            if (object == null) {
                return object2 == null;
            }
            return ((Integer)object).equals(object2);
        }
        return false;
    }

    public int hashCode() {
        Integer n8 = this.a;
        int n9 = n8 == null ? 0 : n8.hashCode();
        return n9 ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExternalPRequestContext{originAssociatedProductId=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends r.a {
        private Integer a;

        b() {
        }

        @Override
        public r a() {
            return new h(this.a);
        }

        @Override
        public r.a b(Integer n8) {
            this.a = n8;
            return this;
        }
    }
}

