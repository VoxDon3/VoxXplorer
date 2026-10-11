/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

class k {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public k(int n8) {
        this.a = new byte[n8];
    }

    private void f(byte[] byArray, int n8) {
        int n9 = this.c;
        byte[] byArray2 = this.a;
        if (n9 + n8 <= byArray2.length) {
            System.arraycopy(byArray2, n9, byArray, 0, n8);
            return;
        }
        int n10 = byArray2.length - n9;
        System.arraycopy(byArray2, n9, byArray, 0, n10);
        System.arraycopy(this.a, 0, byArray, n10, n8 - n10);
    }

    private void j(byte[] byArray, int n8, int n9) {
        int n10 = this.b;
        byte[] byArray2 = this.a;
        if (n10 + n9 <= byArray2.length) {
            System.arraycopy(byArray, n8, byArray2, n10, n9);
            return;
        }
        int n11 = byArray2.length - n10;
        System.arraycopy(byArray, n8, byArray2, n10, n11);
        System.arraycopy(byArray, n8 + n11, this.a, 0, n9 - n11);
    }

    public boolean a() {
        return this.d <= 0;
    }

    public boolean b() {
        return this.g() == this.a.length;
    }

    public boolean c(int n8) {
        Object object = this.a;
        if (n8 <= ((byte[])object).length) {
            return this.d + n8 > ((byte[])object).length;
        }
        object = new StringBuilder();
        object.append("RingBuffer of length ");
        object.append(this.a.length);
        object.append(" cannot accomodate ");
        object.append(n8);
        object.append(" bytes.");
        throw new IllegalArgumentException(object.toString());
    }

    public int d() {
        return this.a.length;
    }

    public int e(byte[] byArray) {
        int n8 = this.d;
        if (n8 >= byArray.length) {
            n8 = byArray.length;
        }
        this.f(byArray, n8);
        this.c = (this.c + n8) % this.a.length;
        this.d -= n8;
        return n8;
    }

    public int g() {
        return this.d;
    }

    public void h(int n8) {
        this.i(new byte[]{(byte)n8}, 0, 1);
    }

    public void i(byte[] byArray, int n8, int n9) {
        if (byArray.length - n8 >= n9) {
            if (n9 <= this.a.length - this.d) {
                this.j(byArray, n8, n9);
                this.b = (this.b + n9) % this.a.length;
                this.d += n9;
                return;
            }
            throw new IndexOutOfBoundsException("Size of bytes to be written is greater than available buffer space");
        }
        throw new IllegalArgumentException("Bytes to write do not exist in source");
    }
}

