/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import java.io.IOException;
import java.io.OutputStream;

final class c
extends OutputStream {
    long q;

    c() {
    }

    @Override
    public void write(int n8) throws IOException {
        ++this.q;
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.q += (long)n9;
    }
}

