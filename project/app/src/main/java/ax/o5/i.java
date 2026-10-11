/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.r;
import ax.o5.s;

final class i
extends s {
    private final r a;

    private i(r r8) {
        this.a = r8;
    }

    @Override
    public r b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof s) {
            Object object2 = (s)object;
            object = this.a;
            object2 = ((s)object2).b();
            if (object == null) {
                return object2 == null;
            }
            return object.equals(object2);
        }
        return false;
    }

    public int hashCode() {
        r r8 = this.a;
        int n8 = r8 == null ? 0 : r8.hashCode();
        return n8 ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExternalPrivacyContext{prequest=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends s.a {
        private r a;

        b() {
        }

        @Override
        public s a() {
            return new i(this.a);
        }

        @Override
        public s.a b(r r8) {
            this.a = r8;
            return this;
        }
    }
}

