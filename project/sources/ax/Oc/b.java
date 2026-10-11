package ax.Oc;

import ax.Lc.d;

/* loaded from: classes3.dex */
public class b extends a<b> {
    public b() {
        this(1024);
    }

    @Override // ax.Oc.a
    public synchronized byte[] b() {
        return c();
    }

    @Override // ax.Oc.a, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        d.c(bArr, i, i2);
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            e(bArr, i, i2);
        }
    }

    public b(int i) {
        if (i >= 0) {
            synchronized (this) {
                a(i);
            }
        } else {
            throw new IllegalArgumentException("Negative initial size: " + i);
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        d(i);
    }
}
