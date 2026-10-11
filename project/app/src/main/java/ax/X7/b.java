/*
 * Decompiled with CFR 0.152.
 */
package ax.X7;

import java.io.OutputStream;

final class b
extends OutputStream {
    private long q = 0L;

    b() {
    }

    long getLength() {
        return this.q;
    }

    @Override
    public void write(int n8) {
        ++this.q;
    }

    @Override
    public void write(byte[] byArray) {
        this.q += (long)byArray.length;
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) {
        if (n8 >= 0 && n8 <= byArray.length && n9 >= 0 && (n8 += n9) <= byArray.length && n8 >= 0) {
            this.q += (long)n9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

