/*
 * Decompiled with CFR 0.152.
 */
package ax.e8;

import ax.e8.d;
import ax.e8.f;

final class a
extends d {
    private final String a;
    private final String b;
    private final String c;
    private final f d;
    private final d.b e;

    private a(String string, String string2, String string3, f f8, d.b b8) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = f8;
        this.e = b8;
    }

    @Override
    public f b() {
        return this.d;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.c;
    }

    @Override
    public d.b e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            object = (d)object;
            Object object2 = this.a;
            if ((object2 == null ? ((d)object).f() == null : ((String)object2).equals(((d)object).f())) && ((object2 = this.b) == null ? ((d)object).c() == null : ((String)object2).equals(((d)object).c())) && ((object2 = this.c) == null ? ((d)object).d() == null : ((String)object2).equals(((d)object).d())) && ((object2 = this.d) == null ? ((d)object).b() == null : object2.equals(((d)object).b())) && ((object2 = this.e) == null ? ((d)object).e() == null : object2.equals((Object)((d)object).e()))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String f() {
        return this.a;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : ((String)object).hashCode();
        object = this.b;
        int n10 = object == null ? 0 : ((String)object).hashCode();
        object = this.c;
        int n11 = object == null ? 0 : ((String)object).hashCode();
        object = this.d;
        int n12 = object == null ? 0 : object.hashCode();
        object = this.e;
        if (object != null) {
            n8 = object.hashCode();
        }
        return ((((n9 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstallationResponse{uri=");
        stringBuilder.append(this.a);
        stringBuilder.append(", fid=");
        stringBuilder.append(this.b);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", responseCode=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends d.a {
        private String a;
        private String b;
        private String c;
        private f d;
        private d.b e;

        b() {
        }

        @Override
        public d a() {
            return new a(this.a, this.b, this.c, this.d, this.e);
        }

        @Override
        public d.a b(f f8) {
            this.d = f8;
            return this;
        }

        @Override
        public d.a c(String string) {
            this.b = string;
            return this;
        }

        @Override
        public d.a d(String string) {
            this.c = string;
            return this;
        }

        @Override
        public d.a e(d.b b8) {
            this.e = b8;
            return this;
        }

        @Override
        public d.a f(String string) {
            this.a = string;
            return this;
        }
    }
}

