package ax.Oc;

import ax.Lc.d;
import ax.Oc.a;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a<T extends a<T>> extends OutputStream implements AutoCloseable {
    protected int c0;
    private byte[] d0;
    private int f0;
    private final List<byte[]> q = new ArrayList();
    private int e0 = -1;
    private boolean g0 = true;

    protected void a(int i) {
        if (this.e0 < this.q.size() - 1) {
            this.f0 += this.d0.length;
            int i2 = this.e0 + 1;
            this.e0 = i2;
            this.d0 = this.q.get(i2);
            return;
        }
        byte[] bArr = this.d0;
        if (bArr == null) {
            if (i <= 0) {
                i = 1024;
            }
            this.f0 = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f0);
            this.f0 += this.d0.length;
        }
        this.e0++;
        byte[] a = d.a(i);
        this.d0 = a;
        this.q.add(a);
    }

    public abstract byte[] b();

    protected byte[] c() {
        int i = this.c0;
        if (i == 0) {
            return d.b;
        }
        byte[] a = d.a(i);
        int i2 = 0;
        for (byte[] bArr : this.q) {
            int min = Math.min(bArr.length, i);
            System.arraycopy(bArr, 0, a, i2, min);
            i2 += min;
            i -= min;
            if (i == 0) {
                break;
            }
        }
        return a;
    }

    protected void d(int i) {
        int i2 = this.c0;
        int i3 = i2 - this.f0;
        if (i3 == this.d0.length) {
            a(i2 + 1);
            i3 = 0;
        }
        this.d0[i3] = (byte) i;
        this.c0++;
    }

    protected void e(byte[] bArr, int i, int i2) {
        int i3 = this.c0;
        int i4 = i3 + i2;
        int i5 = i3 - this.f0;
        int i6 = i2;
        while (i6 > 0) {
            int min = Math.min(i6, this.d0.length - i5);
            System.arraycopy(bArr, (i + i2) - i6, this.d0, i5, min);
            i6 -= min;
            if (i6 > 0) {
                a(i4);
                i5 = 0;
            }
        }
        this.c0 = i4;
    }

    @Deprecated
    public String toString() {
        return new String(b(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i, int i2);

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
