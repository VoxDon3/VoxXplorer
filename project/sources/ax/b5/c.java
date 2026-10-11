package ax.b5;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class c extends OutputStream implements AutoCloseable {
    public static final byte[] g0 = new byte[0];
    private final LinkedList<byte[]> c0;
    private int d0;
    private byte[] e0;
    private int f0;
    private final C1500a q;

    public c() {
        this(null);
    }

    private void a() {
        int length = this.d0 + this.e0.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.d0 = length;
        int max = Math.max(length >> 1, 1000);
        if (max > 131072) {
            max = 131072;
        }
        this.c0.add(this.e0);
        this.e0 = new byte[max];
        this.f0 = 0;
    }

    public static c g(byte[] bArr, int i) {
        return new c(null, bArr, i);
    }

    public void b(int i) {
        if (this.f0 >= this.e0.length) {
            a();
        }
        byte[] bArr = this.e0;
        int i2 = this.f0;
        this.f0 = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void c(int i) {
        int i2 = this.f0;
        int i3 = i2 + 2;
        byte[] bArr = this.e0;
        if (i3 >= bArr.length) {
            b(i >> 16);
            b(i >> 8);
            b(i);
            return;
        }
        int i4 = i2 + 1;
        this.f0 = i4;
        bArr[i2] = (byte) (i >> 16);
        int i5 = i2 + 2;
        this.f0 = i5;
        bArr[i4] = (byte) (i >> 8);
        this.f0 = i2 + 3;
        bArr[i5] = (byte) i;
    }

    public void d(int i) {
        int i2 = this.f0;
        int i3 = i2 + 1;
        byte[] bArr = this.e0;
        if (i3 >= bArr.length) {
            b(i >> 8);
            b(i);
            return;
        }
        int i4 = i2 + 1;
        this.f0 = i4;
        bArr[i2] = (byte) (i >> 8);
        this.f0 = i2 + 2;
        bArr[i4] = (byte) i;
    }

    public byte[] e(int i) {
        this.f0 = i;
        return m();
    }

    public byte[] f() {
        a();
        return this.e0;
    }

    public void j() {
        this.d0 = 0;
        this.f0 = 0;
        if (this.c0.isEmpty()) {
            return;
        }
        this.c0.clear();
    }

    public byte[] m() {
        int i = this.d0 + this.f0;
        if (i == 0) {
            return g0;
        }
        byte[] bArr = new byte[i];
        Iterator<byte[]> it = this.c0.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.e0, 0, bArr, i2, this.f0);
        int i3 = i2 + this.f0;
        if (i3 == i) {
            if (!this.c0.isEmpty()) {
                j();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public c(C1500a c1500a) {
        this(c1500a, 500);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.e0.length - this.f0, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.e0, this.f0, min);
                i += min;
                this.f0 += min;
                i2 -= min;
            }
            if (i2 <= 0) {
                return;
            } else {
                a();
            }
        }
    }

    public c(C1500a c1500a, int i) {
        this.c0 = new LinkedList<>();
        this.q = c1500a;
        this.e0 = c1500a == null ? new byte[i > 131072 ? 131072 : i] : c1500a.a(2);
    }

    private c(C1500a c1500a, byte[] bArr, int i) {
        this.c0 = new LinkedList<>();
        this.q = null;
        this.e0 = bArr;
        this.f0 = i;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        b(i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
