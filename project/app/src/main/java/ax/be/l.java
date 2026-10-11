/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.L;
import ax.be.c;
import ax.be.k;
import ax.be.m;
import ax.be.q;
import java.io.InputStream;

class l
extends k
implements q {
    private final int a;

    l(byte[] byArray) throws L {
        if (byArray.length == 1) {
            this.a = (byArray[0] & 0xFF) + 1;
            return;
        }
        throw new L("Unsupported Delta filter properties");
    }

    @Override
    public InputStream b(InputStream inputStream, c c8) {
        return new m(inputStream, this.a);
    }

    @Override
    public int d() {
        return 1;
    }
}

