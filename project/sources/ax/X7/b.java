package ax.X7;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class b extends OutputStream {
    private long q = 0;

    b() {
    }

    long getLength() {
        return this.q;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.q++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.q += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.q += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
