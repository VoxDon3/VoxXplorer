/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import ax.p5.i;
import ax.q5.f;
import java.util.Arrays;

final class a
extends f {
    private final Iterable<i> a;
    private final byte[] b;

    private a(Iterable<i> iterable, byte[] byArray) {
        this.a = iterable;
        this.b = byArray;
    }

    @Override
    public Iterable<i> b() {
        return this.a;
    }

    @Override
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object object) {
        byte[] byArray;
        if (object == this) {
            return true;
        }
        return object instanceof f && this.a.equals(((f)(object = (f)object)).b()) && Arrays.equals(byArray = this.b, (byte[])(object = object instanceof a ? (Object)((a)object).b : (Object)((f)object).c()));
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BackendRequest{events=");
        stringBuilder.append(this.a);
        stringBuilder.append(", extras=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends f.a {
        private Iterable<i> a;
        private byte[] b;

        b() {
        }

        @Override
        public f a() {
            Object object = this.a;
            CharSequence charSequence = "";
            if (object == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("");
                ((StringBuilder)charSequence).append(" events");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            if (((String)charSequence).isEmpty()) {
                return new a(this.a, this.b);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Missing required properties:");
            ((StringBuilder)object).append((String)charSequence);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        @Override
        public f.a b(Iterable<i> iterable) {
            if (iterable != null) {
                this.a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override
        public f.a c(byte[] byArray) {
            this.b = byArray;
            return this;
        }
    }
}

