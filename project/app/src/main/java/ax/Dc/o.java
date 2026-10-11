/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.W;
import java.util.zip.ZipException;

public class o
implements N {
    public static final W e0 = new W(41246);
    private boolean c0;
    private int d0;
    private short q;

    public o() {
    }

    public o(int n8, boolean bl, int n9) {
        if (n8 >= 0 && n8 <= Short.MAX_VALUE) {
            if (n9 >= 0) {
                this.q = (short)n8;
                this.c0 = bl;
                this.d0 = n9;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Padding must not be negative, was: ");
            stringBuilder.append(n9);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Alignment must be between 0 and 0x7fff, was: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean a() {
        return this.c0;
    }

    @Override
    public W b() {
        return e0;
    }

    @Override
    public W c() {
        return new W(this.d0 + 2);
    }

    @Override
    public void d(byte[] byArray, int n8, int n9) throws ZipException {
        this.j(byArray, n8, n9);
        this.d0 = n9 - 2;
    }

    public short e() {
        return this.q;
    }

    @Override
    public byte[] f() {
        byte[] byArray = new byte[this.d0 + 2];
        short s8 = this.q;
        int n8 = this.c0 ? 32768 : 0;
        W.i(s8 | n8, byArray, 0);
        return byArray;
    }

    @Override
    public byte[] h() {
        short s8 = this.q;
        int n8 = this.c0 ? 32768 : 0;
        return W.c(s8 | n8);
    }

    @Override
    public W i() {
        return new W(2);
    }

    @Override
    public void j(byte[] object, int n8, int n9) throws ZipException {
        if (n9 >= 2) {
            n8 = W.h((byte[])object, n8);
            this.q = (short)(n8 & Short.MAX_VALUE);
            boolean bl = (n8 & 0x8000) != 0;
            this.c0 = bl;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Too short content for ResourceAlignmentExtraField (0xa11e): ");
        ((StringBuilder)object).append(n9);
        throw new ZipException(((StringBuilder)object).toString());
    }
}

