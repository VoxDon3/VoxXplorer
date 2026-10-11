/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class v
extends F.e.d.d {
    private final String a;

    private v(String string) {
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
        if (object instanceof F.e.d.d) {
            object = (F.e.d.d)object;
            return this.a.equals(((F.e.d.d)object).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Log{content=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.d.a {
        private String a;

        b() {
        }

        @Override
        public F.e.d.d a() {
            CharSequence charSequence = this.a;
            if (charSequence != null) {
                return new v((String)charSequence);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append(" content");
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.d.d.a b(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }
}

