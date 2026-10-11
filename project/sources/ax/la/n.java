package ax.la;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class n {
    public static final n d = new a().c(false).d(false).b(null).a();
    private final boolean a;
    private final boolean b;
    private final String c;

    public static a b() {
        return d.d();
    }

    public String a() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public a d() {
        return new a(this.a, this.b, this.c);
    }

    public boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a == nVar.a && this.b == nVar.b) {
            return Objects.equals(this.c, nVar.c);
        }
        return false;
    }

    public int hashCode() {
        int i = (((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public static class a {
        private boolean a;
        private boolean b;
        private String c;

        public n a() {
            return new n(this.a, this.b, this.c);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(boolean z) {
            this.a = z;
            return this;
        }

        private a() {
        }

        private a(boolean z, boolean z2, String str) {
            this.a = z;
            this.b = z2;
            this.c = str;
        }
    }

    private n(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }
}
