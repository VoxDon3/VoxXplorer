package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class z extends F.e.AbstractC0139e {
    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    static final class b extends F.e.AbstractC0139e.a {
        private int a;
        private String b;
        private String c;
        private boolean d;
        private byte e;

        b() {
        }

        @Override // ax.L7.F.e.AbstractC0139e.a
        public F.e.AbstractC0139e a() {
            String str;
            String str2;
            if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
                return new z(this.a, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.b == null) {
                sb.append(" version");
            }
            if (this.c == null) {
                sb.append(" buildVersion");
            }
            if ((this.e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.AbstractC0139e.a
        public F.e.AbstractC0139e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.c = str;
            return this;
        }

        @Override // ax.L7.F.e.AbstractC0139e.a
        public F.e.AbstractC0139e.a c(boolean z) {
            this.d = z;
            this.e = (byte) (this.e | 2);
            return this;
        }

        @Override // ax.L7.F.e.AbstractC0139e.a
        public F.e.AbstractC0139e.a d(int i) {
            this.a = i;
            this.e = (byte) (this.e | 1);
            return this;
        }

        @Override // ax.L7.F.e.AbstractC0139e.a
        public F.e.AbstractC0139e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.AbstractC0139e
    public String b() {
        return this.c;
    }

    @Override // ax.L7.F.e.AbstractC0139e
    public int c() {
        return this.a;
    }

    @Override // ax.L7.F.e.AbstractC0139e
    public String d() {
        return this.b;
    }

    @Override // ax.L7.F.e.AbstractC0139e
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.AbstractC0139e) {
            F.e.AbstractC0139e abstractC0139e = (F.e.AbstractC0139e) obj;
            if (this.a == abstractC0139e.c() && this.b.equals(abstractC0139e.d()) && this.c.equals(abstractC0139e.b()) && this.d == abstractC0139e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }

    private z(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
