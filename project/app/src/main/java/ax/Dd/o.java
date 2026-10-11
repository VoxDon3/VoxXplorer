/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Dd.c;
import ax.Dd.p;
import java.security.SecureRandom;

public final class o
extends c {
    private final byte[] b;

    public o(SecureRandom secureRandom) {
        super(true);
        byte[] byArray = new byte[56];
        this.b = byArray;
        ax.Id.c.d(secureRandom, byArray);
    }

    public p a() {
        byte[] byArray = new byte[56];
        ax.Id.c.e(this.b, 0, byArray, 0);
        return new p(byArray, 0);
    }

    public void b(p p8, byte[] byArray, int n8) {
        byte[] byArray2 = new byte[56];
        p8.a(byArray2, 0);
        if (ax.Id.c.a(this.b, 0, byArray2, 0, byArray, n8)) {
            return;
        }
        throw new IllegalStateException("X448 agreement failed");
    }
}

