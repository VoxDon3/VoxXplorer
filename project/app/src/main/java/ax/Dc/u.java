/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.W;
import ax.Dc.Z;
import java.util.Arrays;

public class u
implements N {
    private byte[] c0;
    private byte[] d0;
    private W q;

    public void a(byte[] byArray) {
        this.d0 = Z.c(byArray);
    }

    @Override
    public W b() {
        return this.q;
    }

    @Override
    public W c() {
        byte[] byArray = this.c0;
        int n8 = byArray != null ? byArray.length : 0;
        return new W(n8);
    }

    @Override
    public void d(byte[] byArray, int n8, int n9) {
        this.g(Arrays.copyOfRange(byArray, n8, n9 + n8));
    }

    public void e(W w8) {
        this.q = w8;
    }

    @Override
    public byte[] f() {
        return Z.c(this.c0);
    }

    public void g(byte[] byArray) {
        this.c0 = Z.c(byArray);
    }

    @Override
    public byte[] h() {
        byte[] byArray = this.d0;
        if (byArray != null) {
            return Z.c(byArray);
        }
        return this.f();
    }

    @Override
    public W i() {
        if (this.d0 != null) {
            return new W(this.d0.length);
        }
        return this.c();
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) {
        byArray = Arrays.copyOfRange(byArray, n8, n9 + n8);
        this.a(byArray);
        if (this.c0 == null) {
            this.g(byArray);
        }
    }
}

