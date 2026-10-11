/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.b3.a;
import ax.c3.H;
import ax.g3.i;
import ax.u3.c;
import java.io.IOException;
import java.io.InputStream;

public class e0
extends H {
    long c0;
    InputStream d0;
    i e0;
    c f0;
    long g0;

    public e0(InputStream inputStream, long l8, long l9, c c8, i i8) {
        super(inputStream);
        this.c0 = l8;
        this.e0 = i8;
        this.g0 = l9;
        this.f0 = c8;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() throws IOException {
        Object object = this.f0;
        if (object != null && object.isCancelled()) {
            throw new IOException(new a());
        }
        int n8 = super.read();
        if (n8 != -1) {
            long l8;
            this.c0 = l8 = this.c0 + 1L;
            object = this.e0;
            if (object != null) {
                object.a(l8, this.g0);
            }
        }
        return n8;
    }

    @Override
    public int read(byte[] object) throws IOException {
        c c8 = this.f0;
        if (c8 != null && c8.isCancelled()) {
            throw new IOException(new a());
        }
        int n8 = super.read((byte[])object);
        if (n8 != -1) {
            long l8;
            this.c0 = l8 = this.c0 + (long)n8;
            object = this.e0;
            if (object != null) {
                object.a(l8, this.g0);
            }
        }
        return n8;
    }

    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        c c8 = this.f0;
        if (c8 != null && c8.isCancelled()) {
            throw new IOException(new a());
        }
        if ((n8 = super.read((byte[])object, n8, n9)) != -1) {
            long l8;
            this.c0 = l8 = this.c0 + (long)n8;
            object = this.e0;
            if (object != null) {
                object.a(l8, this.g0);
            }
        }
        return n8;
    }

    @Override
    public long skip(long l8) throws IOException {
        Object object = this.f0;
        if (object != null && object.isCancelled()) {
            throw new IOException(new a());
        }
        long l9 = this.d0.skip(l8);
        if (l9 != -1L) {
            this.c0 = l8 = this.c0 + l9;
            object = this.e0;
            if (object != null) {
                object.a(l8, this.g0);
            }
        }
        return l9;
    }
}

