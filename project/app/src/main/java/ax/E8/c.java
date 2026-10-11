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

public class c
extends f<BigInteger> {
    private BigInteger d0;

    private c(byte[] byArray, BigInteger bigInteger) {
        super(ax.C8.c.g, byArray);
        this.d0 = bigInteger;
    }

    public BigInteger i() {
        return this.d0;
    }

    public static class b
    extends d<c> {
        public b(a a8) {
            super(a8);
        }

        public c b(ax.C8.c<c> c8, byte[] byArray) {
            return new c(byArray, new BigInteger(byArray));
        }
    }

    public static class c
    extends e<c> {
        public c(ax.z8.b b8) {
            super(b8);
        }

        public void c(c c8, ax.y8.b b8) throws IOException {
            ((OutputStream)b8).write(c8.c0);
        }

        public int d(c c8) {
            return c8.c0.length;
        }
    }
}

