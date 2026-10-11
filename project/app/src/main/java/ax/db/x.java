/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import java.util.Arrays;

public final class x {
    public static final x b = x.b((byte)0);
    private final byte a;

    private x(byte by) {
        this.a = by;
    }

    public static b a() {
        return new b(0);
    }

    public static x b(byte by) {
        return new x(by);
    }

    private boolean c(int n8) {
        return (n8 & this.a) != 0;
    }

    public boolean d() {
        return this.c(1);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof x)) {
            return false;
        }
        object = (x)object;
        return this.a == ((x)object).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new byte[]{this.a});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TraceOptions{sampled=");
        stringBuilder.append(this.d());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b {
        private byte a;

        private b(byte by) {
            this.a = by;
        }

        public x a() {
            return x.b(this.a);
        }

        public b b(boolean bl) {
            if (bl) {
                this.a = (byte)(this.a | 1);
                return this;
            }
            this.a = (byte)(this.a & 0xFFFFFFFE);
            return this;
        }
    }
}

