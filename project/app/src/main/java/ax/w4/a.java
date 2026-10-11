/*
 * Decompiled with CFR 0.152.
 */
package ax.w4;

import ax.w4.b;
import ax.w4.f;

public abstract class a {
    public abstract a a(String var1);

    public abstract a b();

    public abstract a c(String var1);

    public a d(b b8) {
        if (b8 == null) {
            this.f("null");
            return this;
        }
        this.c(b8.b());
        b8.a(this);
        this.b();
        return this;
    }

    public a e(String string) {
        if (string == null) {
            this.f("null");
            return this;
        }
        this.f(f.f(string));
        return this;
    }

    public abstract a f(String var1);

    public static final class a
    extends a {
        private StringBuilder a;
        private boolean b = false;

        public a(StringBuilder stringBuilder) {
            this.a = stringBuilder;
        }

        private void g() {
            if (this.b) {
                this.a.append(", ");
                return;
            }
            this.b = true;
        }

        @Override
        public a a(String string) {
            this.g();
            StringBuilder stringBuilder = this.a;
            stringBuilder.append(string);
            stringBuilder.append('=');
            this.b = false;
            return this;
        }

        @Override
        public a b() {
            this.a.append(")");
            this.b = true;
            return this;
        }

        @Override
        public a c(String string) {
            if (string != null) {
                this.a.append(string);
            }
            this.a.append("(");
            this.b = false;
            return this;
        }

        @Override
        public a f(String string) {
            this.g();
            this.a.append(string);
            return this;
        }
    }
}

