/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.H;
import ax.be.L;
import ax.be.c;
import ax.be.d;
import ax.be.q;
import ax.je.a;
import ax.je.b;
import ax.je.f;
import ax.je.g;
import java.io.InputStream;

class e
extends d
implements q {
    private final long a;
    private final int b;

    e(long l8, byte[] byArray) throws L {
        this.a = l8;
        int n8 = byArray.length;
        if (n8 == 0) {
            this.b = 0;
            return;
        }
        if (byArray.length == 4) {
            n8 = 0;
            for (int i8 = 0; i8 < 4; ++i8) {
                n8 |= (byArray[i8] & 0xFF) << i8 * 8;
            }
            this.b = n8;
            return;
        }
        throw new L("Unsupported BCJ filter properties");
    }

    @Override
    public InputStream b(InputStream inputStream, c object) {
        long l8 = this.a;
        object = l8 == 4L ? new g(false, this.b) : (l8 == 5L ? new ax.je.d(false, this.b) : (l8 == 6L ? new ax.je.c(false, this.b) : (l8 == 7L ? new a(false, this.b) : (l8 == 8L ? new b(false, this.b) : (l8 == 9L ? new ax.je.e(false, this.b) : null)))));
        return new H(inputStream, (f)object);
    }

    @Override
    public int d() {
        return H.a();
    }
}

