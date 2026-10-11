/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

public final class l {
    public static final l d = new b().d();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    private l(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && l.class == object.getClass()) {
            object = (l)object;
            if (this.a == ((l)object).a && this.b == ((l)object).b && this.c == ((l)object).c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a << 2) + (this.b << 1) + this.c;
    }

    public static final class b {
        private boolean a;
        private boolean b;
        private boolean c;

        public l d() {
            if (!this.a && (this.b || this.c)) {
                throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
            }
            return new l(this);
        }

        public b e(boolean bl) {
            this.a = bl;
            return this;
        }

        public b f(boolean bl) {
            this.b = bl;
            return this;
        }

        public b g(boolean bl) {
            this.c = bl;
            return this;
        }
    }
}

