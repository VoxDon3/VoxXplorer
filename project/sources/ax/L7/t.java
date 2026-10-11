package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class t extends F.e.d.a.c {
    private final String a;
    private final int b;
    private final int c;
    private final boolean d;

    static final class b extends F.e.d.a.c.AbstractC0136a {
        private String a;
        private int b;
        private int c;
        private boolean d;
        private byte e;

        b() {
        }

        @Override // ax.L7.F.e.d.a.c.AbstractC0136a
        public F.e.d.a.c a() {
            String str;
            if (this.e == 7 && (str = this.a) != null) {
                return new t(str, this.b, this.c, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" processName");
            }
            if ((this.e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.a.c.AbstractC0136a
        public F.e.d.a.c.AbstractC0136a b(boolean z) {
            this.d = z;
            this.e = (byte) (this.e | 4);
            return this;
        }

        @Override // ax.L7.F.e.d.a.c.AbstractC0136a
        public F.e.d.a.c.AbstractC0136a c(int i) {
            this.c = i;
            this.e = (byte) (this.e | 2);
            return this;
        }

        @Override // ax.L7.F.e.d.a.c.AbstractC0136a
        public F.e.d.a.c.AbstractC0136a d(int i) {
            this.b = i;
            this.e = (byte) (this.e | 1);
            return this;
        }

        @Override // ax.L7.F.e.d.a.c.AbstractC0136a
        public F.e.d.a.c.AbstractC0136a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.a = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.a.c
    public int b() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.a.c
    public int c() {
        return this.b;
    }

    @Override // ax.L7.F.e.d.a.c
    public String d() {
        return this.a;
    }

    @Override // ax.L7.F.e.d.a.c
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.c) {
            F.e.d.a.c cVar = (F.e.d.a.c) obj;
            if (this.a.equals(cVar.d()) && this.b == cVar.c() && this.c == cVar.b() && this.d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }

    private t(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
