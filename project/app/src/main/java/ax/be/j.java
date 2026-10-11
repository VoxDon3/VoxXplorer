/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.h;
import java.io.IOException;
import java.io.InputStream;

class j
extends h {
    private long q = 0L;

    public j(InputStream inputStream) {
        super(inputStream);
    }

    public long a() {
        return this.q;
    }

    @Override
    public int read() throws IOException {
        long l8;
        int n8 = this.in.read();
        if (n8 != -1 && (l8 = this.q) >= 0L) {
            this.q = l8 + 1L;
        }
        return n8;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        long l8;
        if ((n8 = this.in.read(byArray, n8, n9)) > 0 && (l8 = this.q) >= 0L) {
            this.q = l8 + (long)n8;
        }
        return n8;
    }
}

