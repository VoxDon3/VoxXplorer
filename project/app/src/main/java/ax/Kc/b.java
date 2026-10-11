/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import ax.Kc.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class b
implements Closeable,
AutoCloseable {
    private static final long[] f0 = new long[64];
    private final ByteOrder c0;
    private long d0;
    private int e0;
    private final j q;

    static {
        for (int i8 = 1; i8 <= 63; ++i8) {
            long[] lArray = f0;
            lArray[i8] = (lArray[i8 - 1] << 1) + 1L;
        }
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.q = new j(inputStream);
        this.c0 = byteOrder;
    }

    private boolean e(int n8) throws IOException {
        int n9;
        while ((n9 = this.e0) < n8 && n9 < 57) {
            long l8 = this.q.read();
            if (l8 < 0L) {
                return true;
            }
            if (this.c0 == ByteOrder.LITTLE_ENDIAN) {
                long l9 = this.d0;
                this.d0 = l8 << this.e0 | l9;
            } else {
                this.d0 = l8 | this.d0 << 8;
            }
            this.e0 += 8;
        }
        return false;
    }

    private long g(int n8) throws IOException {
        long l8;
        long l9;
        int n9 = n8 - this.e0;
        int n10 = 8 - n9;
        long l10 = this.q.read();
        if (l10 < 0L) {
            return l10;
        }
        if (this.c0 == ByteOrder.LITTLE_ENDIAN) {
            long[] lArray = f0;
            l9 = lArray[n9];
            l8 = this.d0;
            this.d0 = (l9 & l10) << this.e0 | l8;
            l10 = l10 >>> n9 & lArray[n10];
        } else {
            this.d0 = l9 = this.d0 << n9;
            long[] lArray = f0;
            this.d0 = l9 | l10 >>> n10 & lArray[n9];
            l10 &= lArray[n10];
        }
        l9 = this.d0;
        l8 = f0[n8];
        this.d0 = l10;
        this.e0 = n10;
        return l9 & l8;
    }

    private long m(int n8) {
        long l8;
        if (this.c0 == ByteOrder.LITTLE_ENDIAN) {
            long l9 = this.d0;
            l8 = f0[n8] & l9;
            this.d0 = l9 >>> n8;
        } else {
            l8 = this.d0;
            int n9 = this.e0;
            l8 = f0[n8] & l8 >> n9 - n8;
        }
        this.e0 -= n8;
        return l8;
    }

    public void a() {
        int n8 = this.e0 % 8;
        if (n8 > 0) {
            this.m(n8);
        }
    }

    public long b() throws IOException {
        return (long)this.e0 + (long)((InputStream)this.q).available() * 8L;
    }

    public int c() {
        return this.e0;
    }

    @Override
    public void close() throws IOException {
        ((InputStream)this.q).close();
    }

    public void d() {
        this.d0 = 0L;
        this.e0 = 0;
    }

    public long f() {
        return this.q.c();
    }

    public long j(int n8) throws IOException {
        if (n8 >= 0 && n8 <= 63) {
            if (this.e(n8)) {
                return -1L;
            }
            if (this.e0 < n8) {
                return this.g(n8);
            }
            return this.m(n8);
        }
        throw new IOException("count must not be negative or greater than 63");
    }
}

