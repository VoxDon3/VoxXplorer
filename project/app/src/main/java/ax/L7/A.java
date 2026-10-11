/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class A
extends F.e.f {
    private final String a;

    private A(String string) {
        this.a = string;
    }

    @Override
    public String b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof F.e.f) {
            object = (F.e.f)object;
            return this.a.equals(((F.e.f)object).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User{identifier=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.f.a {
        private String a;

        b() {
        }

        @Override
        public F.e.f a() {
            CharSequence charSequence = this.a;
            if (charSequence != null) {
                return new A((String)charSequence);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append(" identifier");
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.f.a b(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }
}

