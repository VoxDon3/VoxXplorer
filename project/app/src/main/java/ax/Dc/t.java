/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.W;
import ax.Dc.Z;
import java.util.Arrays;

public final class t
implements N {
    private static final W d0 = new W(44225);
    private byte[] c0;
    private byte[] q;

    @Override
    public W b() {
        return d0;
    }

    @Override
    public W c() {
        byte[] byArray = this.q;
        int n8 = byArray == null ? 0 : byArray.length;
        return new W(n8);
    }

    @Override
    public void d(byte[] byArray, int n8, int n9) {
        this.q = Arrays.copyOfRange(byArray, n8, n9 + n8);
    }

    @Override
    public byte[] f() {
        return Z.c(this.q);
    }

    @Override
    public byte[] h() {
        byte[] byArray = this.c0;
        if (byArray == null) {
            return this.f();
        }
        return Z.c(byArray);
    }

    @Override
    public W i() {
        if (this.c0 == null) {
            return this.c();
        }
        return new W(this.c0.length);
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) {
        this.c0 = Arrays.copyOfRange(byArray, n8, n8 + n9);
        if (this.q == null) {
            this.d(byArray, n8, n9);
        }
    }
}

