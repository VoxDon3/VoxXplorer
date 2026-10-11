/*
 * Decompiled with CFR 0.152.
 */
package ax.Ac;

import java.io.IOException;
import java.io.OutputStream;

public abstract class c
extends OutputStream {
    private long c0;
    private final byte[] q = new byte[1];

    protected void a(long l8) {
        if (l8 != -1L) {
            this.c0 += l8;
        }
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.q;
        byArray[0] = (byte)(n8 & 0xFF);
        this.write(byArray, 0, 1);
    }
}

