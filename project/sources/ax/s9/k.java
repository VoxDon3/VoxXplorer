package ax.s9;

/* loaded from: classes3.dex */
class k {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public k(int i) {
        this.a = new byte[i];
    }

    private void f(byte[] bArr, int i) {
        int i2 = this.c;
        int i3 = i2 + i;
        byte[] bArr2 = this.a;
        if (i3 <= bArr2.length) {
            System.arraycopy(bArr2, i2, bArr, 0, i);
            return;
        }
        int length = bArr2.length - i2;
        System.arraycopy(bArr2, i2, bArr, 0, length);
        System.arraycopy(this.a, 0, bArr, length, i - length);
    }

    private void j(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        int i4 = i3 + i2;
        byte[] bArr2 = this.a;
        if (i4 <= bArr2.length) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            return;
        }
        int length = bArr2.length - i3;
        System.arraycopy(bArr, i, bArr2, i3, length);
        System.arraycopy(bArr, i + length, this.a, 0, i2 - length);
    }

    public boolean a() {
        return this.d <= 0;
    }

    public boolean b() {
        return g() == this.a.length;
    }

    public boolean c(int i) {
        byte[] bArr = this.a;
        if (i <= bArr.length) {
            return this.d + i > bArr.length;
        }
        throw new IllegalArgumentException("RingBuffer of length " + this.a.length + " cannot accomodate " + i + " bytes.");
    }

    public int d() {
        return this.a.length;
    }

    public int e(byte[] bArr) {
        int i = this.d;
        if (i >= bArr.length) {
            i = bArr.length;
        }
        f(bArr, i);
        this.c = (this.c + i) % this.a.length;
        this.d -= i;
        return i;
    }

    public int g() {
        return this.d;
    }

    public void h(int i) {
        i(new byte[]{(byte) i}, 0, 1);
    }

    public void i(byte[] bArr, int i, int i2) {
        if (bArr.length - i < i2) {
            throw new IllegalArgumentException("Bytes to write do not exist in source");
        }
        if (i2 > this.a.length - this.d) {
            throw new IndexOutOfBoundsException("Size of bytes to be written is greater than available buffer space");
        }
        j(bArr, i, i2);
        this.b = (this.b + i2) % this.a.length;
        this.d += i2;
    }
}
