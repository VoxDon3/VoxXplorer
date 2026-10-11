/*
 * Decompiled with CFR 0.152.
 */
package ax.E8;

import ax.C8.c;
import ax.E8.f;
import ax.y8.e;
import java.io.IOException;

public class d
extends f<Void> {
    private static final byte[] d0 = new byte[0];

    public d() {
        super(c.j, d0);
    }

    public Void i() {
        return null;
    }

    public static class a
    extends ax.y8.d<d> {
        public a(ax.z8.a a8) {
            super(a8);
        }

        public d b(c<d> c8, byte[] byArray) {
            boolean bl = byArray.length == 0;
            ax.G8.a.b(bl, "ASN.1 NULL can not have a value", new Object[0]);
            return new d();
        }
    }

    public static class b
    extends e<d> {
        public b(ax.z8.b b8) {
            super(b8);
        }

        public void c(d d8, ax.y8.b b8) throws IOException {
        }

        public int d(d d8) {
            return 0;
        }
    }
}

