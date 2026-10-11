package ax.B9;

/* loaded from: classes3.dex */
public class d extends a {
    private short[] i;

    public d(int i, int i2) {
        e(i, i2);
    }

    @Override // ax.B9.b
    public double a(int i) {
        return ax.D9.b.o(this.i[i]);
    }

    public void e(int i, int i2) {
        this.i = new short[i * i2];
        this.f = i;
        this.g = i2;
    }

    public void f(int i, short[] sArr, int i2, int i3) {
        int i4 = this.g;
        int i5 = i * i4;
        System.arraycopy(sArr, i2, this.i, i5, i3 * i4);
    }

    public void g(short[] sArr) {
        f(0, sArr, 0, sArr.length);
    }

    public d(short[] sArr) {
        this(sArr.length, 1);
        g(sArr);
    }
}
