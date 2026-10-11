/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.A;
import ax.be.K;
import ax.be.L;
import ax.be.c;
import ax.be.r;
import ax.be.s;
import ax.be.y;
import java.io.IOException;
import java.io.InputStream;

public class z
extends r {
    private static final int[] k0 = new int[]{262144, 0x100000, 0x200000, 0x400000, 0x400000, 0x800000, 0x800000, 0x1000000, 0x2000000, 0x4000000};
    private static final int[] l0 = new int[]{4, 8, 24, 48};
    private byte[] c0 = null;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private int q;

    public z() {
        try {
            this.w(6);
            return;
        }
        catch (L l8) {
            throw new RuntimeException();
        }
    }

    @Override
    public InputStream c(InputStream inputStream, c c8) throws IOException {
        return new y(inputStream, this.q, this.c0, c8);
    }

    public Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException();
        }
    }

    @Override
    public s f(s s8, c c8) {
        if (this.g0 == 0) {
            return new K(s8, c8);
        }
        return new A(s8, this, c8);
    }

    public int h() {
        return this.j0;
    }

    public int i() {
        return this.q;
    }

    public int j() {
        return this.d0;
    }

    public int k() {
        return this.e0;
    }

    public int l() {
        return this.i0;
    }

    public int m() {
        return this.g0;
    }

    public int n() {
        return this.h0;
    }

    public int o() {
        return this.f0;
    }

    public byte[] r() {
        return this.c0;
    }

    public void s(int n8) throws L {
        if (n8 >= 4096) {
            if (n8 <= 0x30000000) {
                this.q = n8;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LZMA2 dictionary size must not exceed 768 MiB: ");
            stringBuilder.append(n8);
            stringBuilder.append(" B");
            throw new L(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LZMA2 dictionary size must be at least 4 KiB: ");
        stringBuilder.append(n8);
        stringBuilder.append(" B");
        throw new L(stringBuilder.toString());
    }

    public void t(int n8, int n9) throws L {
        if (n8 >= 0 && n9 >= 0 && n8 <= 4 && n9 <= 4 && n8 + n9 <= 4) {
            this.d0 = n8;
            this.e0 = n9;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lc + lp must not exceed 4: ");
        stringBuilder.append(n8);
        stringBuilder.append(" + ");
        stringBuilder.append(n9);
        throw new L(stringBuilder.toString());
    }

    public void v(int n8) throws L {
        if (n8 >= 0 && n8 <= 4) {
            this.f0 = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pb must not exceed 4: ");
        stringBuilder.append(n8);
        throw new L(stringBuilder.toString());
    }

    public void w(int n8) throws L {
        if (n8 >= 0 && n8 <= 9) {
            this.d0 = 3;
            this.e0 = 0;
            this.f0 = 2;
            this.q = k0[n8];
            if (n8 <= 3) {
                this.g0 = 1;
                this.i0 = 4;
                int n9 = n8 <= 1 ? 128 : 273;
                this.h0 = n9;
                this.j0 = l0[n8];
                return;
            }
            this.g0 = 2;
            this.i0 = 20;
            n8 = n8 == 4 ? 16 : (n8 == 5 ? 32 : 64);
            this.h0 = n8;
            this.j0 = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported preset: ");
        stringBuilder.append(n8);
        throw new L(stringBuilder.toString());
    }
}

