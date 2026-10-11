/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Pd.a;
import ax.Wc.Y0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

class T0
extends Y0 {
    private static final byte[] f0 = new byte[0];
    private final int d0;
    private int e0;

    T0(InputStream inputStream, int n8, int n9) {
        super(inputStream, n9);
        if (n8 <= 0) {
            if (n8 >= 0) {
                this.b(true);
            } else {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
        }
        this.d0 = n8;
        this.e0 = n8;
    }

    int c() {
        return this.e0;
    }

    void d(byte[] object) throws IOException {
        int n8 = this.e0;
        if (n8 == ((byte[])object).length) {
            if (n8 == 0) {
                return;
            }
            int n9 = this.e0;
            n8 = this.a();
            if (n9 < n8) {
                this.e0 = n8 = n9 - a.d(this.q, (byte[])object, 0, ((byte[])object).length);
                if (n8 == 0) {
                    this.b(true);
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("DEF length ");
                ((StringBuilder)object).append(this.d0);
                ((StringBuilder)object).append(" object truncated by ");
                ((StringBuilder)object).append(this.e0);
                throw new EOFException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("corrupted stream - out of bounds length found: ");
            ((StringBuilder)object).append(this.e0);
            ((StringBuilder)object).append(" >= ");
            ((StringBuilder)object).append(n8);
            throw new IOException(((StringBuilder)object).toString());
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    byte[] e() throws IOException {
        if (this.e0 == 0) {
            return f0;
        }
        int n8 = this.e0;
        int n9 = this.a();
        if (n8 < n9) {
            Object object = new byte[n8];
            this.e0 = n9 = n8 - a.d(this.q, (byte[])object, 0, n8);
            if (n9 == 0) {
                this.b(true);
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("DEF length ");
            ((StringBuilder)object).append(this.d0);
            ((StringBuilder)object).append(" object truncated by ");
            ((StringBuilder)object).append(this.e0);
            throw new EOFException(((StringBuilder)object).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("corrupted stream - out of bounds length found: ");
        stringBuilder.append(this.e0);
        stringBuilder.append(" >= ");
        stringBuilder.append(n9);
        throw new IOException(stringBuilder.toString());
    }

    @Override
    public int read() throws IOException {
        if (this.e0 == 0) {
            return -1;
        }
        int n8 = this.q.read();
        if (n8 >= 0) {
            int n9;
            this.e0 = n9 = this.e0 - 1;
            if (n9 == 0) {
                this.b(true);
            }
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DEF length ");
        stringBuilder.append(this.d0);
        stringBuilder.append(" object truncated by ");
        stringBuilder.append(this.e0);
        throw new EOFException(stringBuilder.toString());
    }

    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        int n10 = this.e0;
        if (n10 == 0) {
            return -1;
        }
        n9 = Math.min(n9, n10);
        if ((n9 = this.q.read((byte[])object, n8, n9)) >= 0) {
            this.e0 = n8 = this.e0 - n9;
            if (n8 == 0) {
                this.b(true);
            }
            return n9;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("DEF length ");
        ((StringBuilder)object).append(this.d0);
        ((StringBuilder)object).append(" object truncated by ");
        ((StringBuilder)object).append(this.e0);
        throw new EOFException(((StringBuilder)object).toString());
    }
}

