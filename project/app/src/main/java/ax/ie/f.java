/*
 * Decompiled with CFR 0.152.
 */
package ax.ie;

import ax.be.c;
import ax.ie.e;
import java.io.IOException;
import java.io.OutputStream;

public final class f
extends e {
    private final byte[] f;
    private int g;

    public f(int n8, c c8) {
        this.f = c8.a(n8, false);
        this.l();
    }

    @Override
    public int f() {
        try {
            super.f();
            return this.g;
        }
        catch (IOException iOException) {
            throw new Error();
        }
    }

    @Override
    public int j() {
        return this.g + (int)this.c + 4;
    }

    @Override
    public void l() {
        super.l();
        this.g = 0;
    }

    @Override
    void n(int n8) {
        byte[] byArray = this.f;
        int n9 = this.g;
        this.g = n9 + 1;
        byArray[n9] = (byte)n8;
    }

    public void o(c c8) {
        c8.d(this.f);
    }

    public void p(OutputStream outputStream) throws IOException {
        outputStream.write(this.f, 0, this.g);
    }
}

