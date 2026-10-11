/*
 * Decompiled with CFR 0.152.
 */
package ax.F8;

import ax.F8.c;
import ax.y8.d;
import ax.y8.e;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class b
extends c<byte[]> {
    public b(ax.C8.c<?> c8, byte[] byArray) {
        super(c8, byArray);
    }

    public b(byte[] byArray) {
        super(ax.C8.c.i, byArray);
    }

    @Override
    protected String h() {
        return Arrays.toString(this.c0);
    }

    public byte[] i() {
        byte[] byArray = this.c0;
        return Arrays.copyOf(byArray, byArray.length);
    }

    public static class a
    extends d<b> {
        public a(ax.z8.a a8) {
            super(a8);
        }

        public b b(ax.C8.c<b> c8, byte[] byArray) throws ax.y8.c {
            return new b(c8, byArray);
        }
    }

    public static class b
    extends e<b> {
        public b(ax.z8.b b8) {
            super(b8);
        }

        public void c(b b8, ax.y8.b b9) throws IOException {
            ((OutputStream)b9).write(b8.c0);
        }

        public int d(b b8) throws IOException {
            return b8.c0.length;
        }
    }
}

