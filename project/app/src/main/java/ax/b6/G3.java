/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.J3;
import ax.b6.K3;
import ax.b6.S3;

final class G3 {
    private final S3 a;
    private final byte[] b;

    private G3(int n8) {
        byte[] byArray = new byte[n8];
        this.b = byArray;
        this.a = S3.H(byArray);
    }

    /* synthetic */ G3(int n8, J3 j32) {
        this(n8);
    }

    public final B3 a() {
        this.a.I();
        return new K3(this.b);
    }

    public final S3 b() {
        return this.a;
    }
}

