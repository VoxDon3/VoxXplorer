package ax.Kc;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class b implements Closeable, AutoCloseable {
    private static final long[] f0 = new long[64];
    private final ByteOrder c0;
    private long d0;
    private int e0;
    private final j q;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f0;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.q = new j(inputStream);
        this.c0 = byteOrder;
    }

    private boolean e(int i) throws IOException {
        while (true) {
            int i2 = this.e0;
            if (i2 >= i || i2 >= 57) {
                return false;
            }
            long read = this.q.read();
            if (read < 0) {
                return true;
            }
            if (this.c0 == ByteOrder.LITTLE_ENDIAN) {
                this.d0 = (read << this.e0) | this.d0;
            } else {
                this.d0 = read | (this.d0 << 8);
            }
            this.e0 += 8;
        }
    }

    private long g(int i) throws IOException {
        long j;
        int i2 = i - this.e0;
        int i3 = 8 - i2;
        long read = this.q.read();
        if (read < 0) {
            return read;
        }
        if (this.c0 == ByteOrder.LITTLE_ENDIAN) {
            long[] jArr = f0;
            this.d0 = ((jArr[i2] & read) << this.e0) | this.d0;
            j = (read >>> i2) & jArr[i3];
        } else {
            long j2 = this.d0 << i2;
            this.d0 = j2;
            long[] jArr2 = f0;
            this.d0 = j2 | ((read >>> i3) & jArr2[i2]);
            j = read & jArr2[i3];
        }
        long j3 = this.d0 & f0[i];
        this.d0 = j;
        this.e0 = i3;
        return j3;
    }

    private long m(int i) {
        long j;
        if (this.c0 == ByteOrder.LITTLE_ENDIAN) {
            long j2 = this.d0;
            j = f0[i] & j2;
            this.d0 = j2 >>> i;
        } else {
            j = f0[i] & (this.d0 >> (this.e0 - i));
        }
        this.e0 -= i;
        return j;
    }

    public void a() {
        int i = this.e0 % 8;
        if (i > 0) {
            m(i);
        }
    }

    public long b() throws IOException {
        return this.e0 + (this.q.available() * 8);
    }

    public int c() {
        return this.e0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    public void d() {
        this.d0 = 0L;
        this.e0 = 0;
    }

    public long f() {
        return this.q.c();
    }

    public long j(int i) throws IOException {
        if (i < 0 || i > 63) {
            throw new IOException("count must not be negative or greater than 63");
        }
        if (e(i)) {
            return -1L;
        }
        return this.e0 < i ? g(i) : m(i);
    }
}
