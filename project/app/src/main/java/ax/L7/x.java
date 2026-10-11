/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class x
extends F.e.d.e.b {
    private final String a;
    private final String b;

    private x(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.e.b && this.a.equals(((F.e.d.e.b)(object = (F.e.d.e.b)object)).b()) && this.b.equals(((F.e.d.e.b)object).c());
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RolloutVariant{rolloutId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", variantId=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.e.b.a {
        private String a;
        private String b;

        b() {
        }

        @Override
        public F.e.d.e.b a() {
            CharSequence charSequence;
            CharSequence charSequence2 = this.a;
            if (charSequence2 != null && (charSequence = this.b) != null) {
                return new x((String)charSequence2, (String)charSequence);
            }
            charSequence2 = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)charSequence2).append(" rolloutId");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence2).append(" variantId");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((Object)charSequence2);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.d.e.b.a b(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override
        public F.e.d.e.b.a c(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }
}

