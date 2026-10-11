/*
 * Decompiled with CFR 0.152.
 */
package ax.la;

import ax.la.o;

public final class n {
    public static final n d = new a(null).c(false).d(false).b(null).a();
    private final boolean a;
    private final boolean b;
    private final String c;

    private n(boolean bl, boolean bl2, String string) {
        this.a = bl;
        this.b = bl2;
        this.c = string;
    }

    /* synthetic */ n(boolean bl, boolean bl2, String string, o o8) {
        this(bl, bl2, string);
    }

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
        return new a(this.a, this.b, this.c, null);
    }

    public boolean e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && n.class == object.getClass()) {
            object = (n)object;
            if (this.a != ((n)object).a) {
                return false;
            }
            if (this.b != ((n)object).b) {
                return false;
            }
            return j.Objects.equals((Object)this.c, (Object)((n)object).c);
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b;
        String string = this.c;
        int n10 = string != null ? string.hashCode() : 0;
        return (n8 * 31 + n9) * 31 + n10;
    }

    public static class a {
        private boolean a;
        private boolean b;
        private String c;

        private a() {
        }

        /* synthetic */ a(o o8) {
            this();
        }

        private a(boolean bl, boolean bl2, String string) {
            this.a = bl;
            this.b = bl2;
            this.c = string;
        }

        /* synthetic */ a(boolean bl, boolean bl2, String string, o o8) {
            this(bl, bl2, string);
        }

        public n a() {
            return new n(this.a, this.b, this.c, null);
        }

        public a b(String string) {
            this.c = string;
            return this;
        }

        public a c(boolean bl) {
            this.b = bl;
            return this;
        }

        public a d(boolean bl) {
            this.a = bl;
            return this;
        }
    }
}

