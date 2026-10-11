/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Dd.c;
import ax.Dd.n;
import ax.Id.a;
import java.security.SecureRandom;

public final class m
extends c {
    private final byte[] b;

    public m(SecureRandom secureRandom) {
        super(true);
        byte[] byArray = new byte[32];
        this.b = byArray;
        ax.Id.a.d(secureRandom, byArray);
    }

    public n a() {
        byte[] byArray = new byte[32];
        ax.Id.a.e(this.b, 0, byArray, 0);
        return new n(byArray, 0);
    }

    public void b(n n8, byte[] byArray, int n9) {
        byte[] byArray2 = new byte[32];
        n8.a(byArray2, 0);
        if (ax.Id.a.a(this.b, 0, byArray2, 0, byArray, n9)) {
            return;
        }
        throw new IllegalStateException("X25519 agreement failed");
    }
}

