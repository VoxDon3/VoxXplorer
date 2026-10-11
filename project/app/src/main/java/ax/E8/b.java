/*
 * Decompiled with CFR 0.152.
 */
package ax.E8;

import ax.E8.f;
import ax.y8.d;
import ax.y8.e;
import ax.z8.a;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

public class b
extends f<BigInteger> {
    private final BigInteger d0;

    public b(BigInteger bigInteger) {
        super(ax.C8.c.l);
        this.d0 = bigInteger;
    }

    private b(BigInteger bigInteger, byte[] byArray) {
        super(ax.C8.c.l, byArray);
        this.d0 = bigInteger;
    }

    public BigInteger k() {
        return this.d0;
    }

    public static class b
    extends d<b> {
        public b(a a8) {
            super(a8);
        }

        public b b(ax.C8.c<b> c8, byte[] byArray) throws ax.y8.c {
            return new b(new BigInteger(byArray), byArray);
        }
    }

    public static class c
    extends e<b> {
        public c(ax.z8.b b8) {
            super(b8);
        }

        private void c(b b8) {
            b8.c0 = b8.d0.toByteArray();
        }

        public void d(b b8, ax.y8.b b9) throws IOException {
            if (b8.c0 == null) {
                this.c(b8);
            }
            ((OutputStream)b9).write(b8.c0);
        }

        public int e(b b8) {
            if (b8.c0 == null) {
                this.c(b8);
            }
            return b8.c0.length;
        }
    }
}

