/*
 * Decompiled with CFR 0.152.
 */
package ax.E8;

import ax.E8.f;
import ax.y8.d;
import ax.y8.e;
import java.io.IOException;
import java.io.OutputStream;

public class a
extends f<Boolean> {
    private boolean d0;

    private a(byte[] byArray, boolean bl) {
        super(ax.C8.c.f, byArray);
        this.d0 = bl;
    }

    public Boolean k() {
        return this.d0;
    }

    public static class b
    extends d<a> {
        public b(ax.z8.a a8) {
            super(a8);
        }

        public a b(ax.C8.c<a> c8, byte[] byArray) {
            int n8 = byArray.length;
            boolean bl = false;
            boolean bl2 = n8 == 1;
            ax.G8.a.b(bl2, "Value of ASN1Boolean should have length 1, but was %s", byArray.length);
            bl2 = bl;
            if (byArray[0] != 0) {
                bl2 = true;
            }
            return new a(byArray, bl2);
        }
    }

    public static class c
    extends e<a> {
        public c(ax.z8.b b8) {
            super(b8);
        }

        public void c(a a8, ax.y8.b b8) throws IOException {
            ((OutputStream)b8).write(a8.d0 ? 1 : 0);
        }

        public int d(a a8) {
            return 1;
        }
    }
}

