/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class e
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    private static final byte[] d0;
    private static final int e0;
    private static final int f0;
    private int c0;
    private final byte q;

    static {
        int n8;
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[29];
        byArray[0] = -1;
        byArray2[1] = -31;
        byArray2[2] = 0;
        byArray2[3] = 28;
        byArray2[4] = 69;
        byArray2[5] = 120;
        byArray2[6] = 105;
        byArray2[7] = 102;
        byArray2[8] = 0;
        byArray2[9] = 0;
        byArray2[10] = 77;
        byArray2[11] = 77;
        byArray2[12] = 0;
        byArray2[13] = 0;
        byArray2[14] = 0;
        byArray2[15] = 0;
        byArray2[16] = 0;
        byArray2[17] = 8;
        byArray2[18] = 0;
        byArray2[19] = 1;
        byArray2[20] = 1;
        byArray2[21] = 18;
        byArray2[22] = 0;
        byArray2[23] = 2;
        byArray2[24] = 0;
        byArray2[25] = 0;
        byArray2[26] = 0;
        byArray2[27] = 1;
        byArray2[28] = 0;
        d0 = byArray;
        e0 = n8 = byArray.length;
        f0 = n8 + 2;
    }

    public e(InputStream object, int n8) {
        super((InputStream)object);
        if (n8 >= -1 && n8 <= 8) {
            this.q = (byte)n8;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot add invalid orientation: ");
        ((StringBuilder)object).append(n8);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    @Override
    public void mark(int n8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() throws IOException {
        int n8;
        int n9 = this.c0;
        n8 = n9 >= 2 && n9 <= (n8 = f0) ? (n9 == n8 ? (int)this.q : d0[n9 - 2] & 0xFF) : super.read();
        if (n8 != -1) {
            ++this.c0;
        }
        return n8;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        int n10 = this.c0;
        int n11 = f0;
        if (n10 > n11) {
            n8 = super.read(byArray, n8, n9);
        } else if (n10 == n11) {
            byArray[n8] = this.q;
            n8 = 1;
        } else if (n10 < 2) {
            n8 = super.read(byArray, n8, 2 - n10);
        } else {
            n9 = Math.min(n11 - n10, n9);
            System.arraycopy(d0, this.c0 - 2, byArray, n8, n9);
            n8 = n9;
        }
        if (n8 > 0) {
            this.c0 += n8;
        }
        return n8;
    }

    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public long skip(long l8) throws IOException {
        if ((l8 = super.skip(l8)) > 0L) {
            this.c0 = (int)((long)this.c0 + l8);
        }
        return l8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

