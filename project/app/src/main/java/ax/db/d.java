/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.n;
import ax.db.u;

final class d
extends n {
    private final boolean b;
    private final u c;

    private d(boolean bl, u u8) {
        this.b = bl;
        this.c = u8;
    }

    @Override
    public boolean b() {
        return this.b;
    }

    @Override
    public u c() {
        return this.c;
    }

    public boolean equals(Object object) {
        u u8;
        if (object == this) {
            return true;
        }
        return object instanceof n && this.b == ((n)(object = (n)object)).b() && ((u8 = this.c) == null ? ((n)object).c() == null : u8.equals(((n)object).c()));
    }

    public int hashCode() {
        int n8 = this.b ? 1231 : 1237;
        u u8 = this.c;
        int n9 = u8 == null ? 0 : u8.hashCode();
        return (n8 ^ 0xF4243) * 1000003 ^ n9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EndSpanOptions{sampleToLocalSpanStore=");
        stringBuilder.append(this.b);
        stringBuilder.append(", status=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends n.a {
        private Boolean a;
        private u b;

        b() {
        }

        @Override
        public n a() {
            Comparable<Boolean> comparable = this.a;
            CharSequence charSequence = "";
            if (comparable == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("");
                ((StringBuilder)charSequence).append(" sampleToLocalSpanStore");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            if (((String)charSequence).isEmpty()) {
                return new d(this.a, this.b);
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Missing required properties:");
            ((StringBuilder)comparable).append((String)charSequence);
            throw new IllegalStateException(((StringBuilder)comparable).toString());
        }

        @Override
        public n.a b(u u8) {
            this.b = u8;
            return this;
        }

        public n.a c(boolean bl) {
            this.a = bl;
            return this;
        }
    }
}

