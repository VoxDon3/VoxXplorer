/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class e
extends F.c {
    private final String a;
    private final String b;

    private e(String string, String string2) {
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
        return object instanceof F.c && this.a.equals(((F.c)(object = (F.c)object)).b()) && this.b.equals(((F.c)object).c());
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CustomAttribute{key=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.c.a {
        private String a;
        private String b;

        b() {
        }

        @Override
        public F.c a() {
            CharSequence charSequence;
            CharSequence charSequence2 = this.a;
            if (charSequence2 != null && (charSequence = this.b) != null) {
                return new e((String)charSequence2, (String)charSequence);
            }
            charSequence2 = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)charSequence2).append(" key");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence2).append(" value");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((Object)charSequence2);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.c.a b(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override
        public F.c.a c(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }
}

