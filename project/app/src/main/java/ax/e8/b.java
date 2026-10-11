/*
 * Decompiled with CFR 0.152.
 */
package ax.e8;

import ax.e8.f;

final class b
extends f {
    private final String a;
    private final long b;
    private final f.b c;

    private b(String string, long l8, f.b b8) {
        this.a = string;
        this.b = l8;
        this.c = b8;
    }

    @Override
    public f.b b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.a;
    }

    @Override
    public long d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            object = (f)object;
            Object object2 = this.a;
            if ((object2 == null ? ((f)object).c() == null : ((String)object2).equals(((f)object).c())) && this.b == ((f)object).d() && ((object2 = this.c) == null ? ((f)object).b() == null : object2.equals((Object)((f)object).b()))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        long l8 = this.b;
        int n10 = (int)(l8 ^ l8 >>> 32);
        object = this.c;
        if (object != null) {
            n8 = object.hashCode();
        }
        return ((n9 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TokenResult{token=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tokenExpirationTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", responseCode=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends f.a {
        private String a;
        private Long b;
        private f.b c;

        b() {
        }

        @Override
        public f a() {
            Comparable<Long> comparable = this.b;
            CharSequence charSequence = "";
            if (comparable == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("");
                ((StringBuilder)charSequence).append(" tokenExpirationTimestamp");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            if (((String)charSequence).isEmpty()) {
                return new b(this.a, this.b, this.c);
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Missing required properties:");
            ((StringBuilder)comparable).append((String)charSequence);
            throw new IllegalStateException(((StringBuilder)comparable).toString());
        }

        @Override
        public f.a b(f.b b8) {
            this.c = b8;
            return this;
        }

        @Override
        public f.a c(String string) {
            this.a = string;
            return this;
        }

        @Override
        public f.a d(long l8) {
            this.b = l8;
            return this;
        }
    }
}

