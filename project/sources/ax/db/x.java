package ax.db;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x {
    public static final x b = b((byte) 0);
    private final byte a;

    public static final class b {
        private byte a;

        public x a() {
            return x.b(this.a);
        }

        public b b(boolean z) {
            if (z) {
                this.a = (byte) (this.a | 1);
                return this;
            }
            this.a = (byte) (this.a & (-2));
            return this;
        }

        private b(byte b) {
            this.a = b;
        }
    }

    private x(byte b2) {
        this.a = b2;
    }

    public static b a() {
        return new b((byte) 0);
    }

    public static x b(byte b2) {
        return new x(b2);
    }

    private boolean c(int i) {
        return (i & this.a) != 0;
    }

    public boolean d() {
        return c(1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof x) && this.a == ((x) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new byte[]{this.a});
    }

    public String toString() {
        return "TraceOptions{sampled=" + d() + "}";
    }
}
