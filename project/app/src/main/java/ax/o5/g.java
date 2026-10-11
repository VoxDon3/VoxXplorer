/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.q;
import java.util.Arrays;

final class g
extends q {
    private final byte[] a;
    private final byte[] b;

    private g(byte[] byArray, byte[] byArray2) {
        this.a = byArray;
        this.b = byArray2;
    }

    @Override
    public byte[] b() {
        return this.a;
    }

    @Override
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object object) {
        q q8;
        boolean bl;
        byte[] byArray;
        if (object == this) {
            return true;
        }
        return object instanceof q && Arrays.equals(byArray = this.a, (byte[])(object = (bl = (q8 = (q)object) instanceof g) ? (Object)((g)q8).a : (Object)q8.b())) && Arrays.equals(byArray = this.b, (byte[])(object = bl ? (Object)((g)q8).b : (Object)q8.c()));
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExperimentIds{clearBlob=");
        stringBuilder.append(Arrays.toString(this.a));
        stringBuilder.append(", encryptedBlob=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends q.a {
        private byte[] a;
        private byte[] b;

        b() {
        }

        @Override
        public q a() {
            return new g(this.a, this.b);
        }

        @Override
        public q.a b(byte[] byArray) {
            this.a = byArray;
            return this;
        }

        @Override
        public q.a c(byte[] byArray) {
            this.b = byArray;
            return this;
        }
    }
}

