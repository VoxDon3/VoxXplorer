/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.Arrays;

final class g
extends F.d.b {
    private final String a;
    private final byte[] b;

    private g(String string, byte[] byArray) {
        this.a = string;
        this.b = byArray;
    }

    @Override
    public byte[] b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.a;
    }

    public boolean equals(Object object) {
        byte[] byArray;
        if (object == this) {
            return true;
        }
        return object instanceof F.d.b && this.a.equals(((F.d.b)(object = (F.d.b)object)).c()) && Arrays.equals(byArray = this.b, (byte[])(object = object instanceof g ? (Object)((g)object).b : (Object)((F.d.b)object).b()));
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File{filename=");
        stringBuilder.append(this.a);
        stringBuilder.append(", contents=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.d.b.a {
        private String a;
        private byte[] b;

        b() {
        }

        @Override
        public F.d.b a() {
            Object object;
            CharSequence charSequence = this.a;
            if (charSequence != null && (object = this.b) != null) {
                return new g((String)charSequence, (byte[])object);
            }
            object = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)object).append(" filename");
            }
            if (this.b == null) {
                ((StringBuilder)object).append(" contents");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append(object);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.d.b.a b(byte[] byArray) {
            if (byArray != null) {
                this.b = byArray;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override
        public F.d.b.a c(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }
}

