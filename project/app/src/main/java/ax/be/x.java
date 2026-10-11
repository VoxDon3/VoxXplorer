/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.L;
import ax.be.c;
import ax.be.q;
import ax.be.w;
import ax.be.y;
import java.io.InputStream;

class x
extends w
implements q {
    private int a;

    x(byte[] byArray) throws L {
        byte by;
        if (byArray.length == 1 && ((by = byArray[0]) & 0xFF) <= 37) {
            int n8;
            this.a = n8 = by & 1 | 2;
            this.a = n8 << (by >>> 1) + 11;
            return;
        }
        throw new L("Unsupported LZMA2 properties");
    }

    @Override
    public InputStream b(InputStream inputStream, c c8) {
        return new y(inputStream, this.a, null, c8);
    }

    @Override
    public int d() {
        return y.d(this.a);
    }
}

