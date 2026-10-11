/*
 * Decompiled with CFR 0.152.
 */
package ax.X7;

import ax.X7.d;
import java.lang.annotation.Annotation;

public final class a {
    private int a;
    private d.a b = d.a.q;

    public static a b() {
        return new a();
    }

    public d a() {
        return new a(this.a, this.b);
    }

    public a c(int n8) {
        this.a = n8;
        return this;
    }

    private static final class a
    implements d {
        private final int a;
        private final d.a b;

        a(int n8, d.a a8) {
            this.a = n8;
            this.b = a8;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof d)) {
                return false;
            }
            return this.a == (object = (d)object).tag() && ((Object)((Object)this.b)).equals((Object)object.intEncoding());
        }

        @Override
        public int hashCode() {
            return (0xDE0D66 ^ this.a) + (((Object)((Object)this.b)).hashCode() ^ 0x79AD669E);
        }

        @Override
        public d.a intEncoding() {
            return this.b;
        }

        @Override
        public int tag() {
            return this.a;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
            stringBuilder.append('(');
            stringBuilder.append("tag=");
            stringBuilder.append(this.a);
            stringBuilder.append("intEncoding=");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}

