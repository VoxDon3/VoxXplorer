/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class d
extends F.a.a {
    private final String a;
    private final String b;
    private final String c;

    private d(String string, String string2, String string3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof F.a.a && this.a.equals(((F.a.a)(object = (F.a.a)object)).b()) && this.b.equals(((F.a.a)object).d()) && this.c.equals(((F.a.a)object).c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BuildIdMappingForArch{arch=");
        stringBuilder.append(this.a);
        stringBuilder.append(", libraryName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", buildId=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.a.a.a {
        private String a;
        private String b;
        private String c;

        b() {
        }

        @Override
        public F.a.a a() {
            CharSequence charSequence;
            CharSequence charSequence2;
            String string = this.a;
            if (string != null && (charSequence2 = this.b) != null && (charSequence = this.c) != null) {
                return new d(string, (String)charSequence2, (String)charSequence);
            }
            charSequence2 = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)charSequence2).append(" arch");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence2).append(" libraryName");
            }
            if (this.c == null) {
                ((StringBuilder)charSequence2).append(" buildId");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((Object)charSequence2);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.a.a.a b(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override
        public F.a.a.a c(String string) {
            if (string != null) {
                this.c = string;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override
        public F.a.a.a d(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }
}

