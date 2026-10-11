/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.Y0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

class V0
extends Y0 {
    private int d0;
    private int e0;
    private boolean f0 = false;
    private boolean g0 = true;

    V0(InputStream inputStream, int n8) throws IOException {
        super(inputStream, n8);
        this.d0 = inputStream.read();
        this.e0 = n8 = inputStream.read();
        if (n8 >= 0) {
            this.c();
            return;
        }
        throw new EOFException();
    }

    private boolean c() {
        if (!this.f0 && this.g0 && this.d0 == 0 && this.e0 == 0) {
            this.f0 = true;
            this.b(true);
        }
        return this.f0;
    }

    void d(boolean bl) {
        this.g0 = bl;
        this.c();
    }

    @Override
    public int read() throws IOException {
        if (this.c()) {
            return -1;
        }
        int n8 = this.q.read();
        if (n8 >= 0) {
            int n9 = this.d0;
            this.d0 = this.e0;
            this.e0 = n8;
            return n9;
        }
        throw new EOFException();
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (!this.g0 && n9 >= 3) {
            if (this.f0) {
                return -1;
            }
            if ((n9 = this.q.read(byArray, n8 + 2, n9 - 2)) >= 0) {
                byArray[n8] = (byte)this.d0;
                byArray[n8 + 1] = (byte)this.e0;
                this.d0 = this.q.read();
                this.e0 = n8 = this.q.read();
                if (n8 >= 0) {
                    return n9 + 2;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        return super.read(byArray, n8, n9);
    }
}

