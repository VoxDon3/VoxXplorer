package ax.Ud;

/* loaded from: classes3.dex */
public abstract class b {
    private int a;
    private int b;
    protected int[] c;
    protected float d;

    public b() {
        e();
    }

    public float a() {
        int i;
        int i2 = this.b;
        if (i2 <= 0 || (i = this.a) <= 4) {
            return 0.01f;
        }
        if (i2 != i) {
            float f = i / ((i2 - i) * this.d);
            if (f < 0.99f) {
                return f;
            }
        }
        return 0.99f;
    }

    protected abstract int b(byte[] bArr, int i);

    public boolean c() {
        return this.b > 1024;
    }

    public void d(byte[] bArr, int i, int i2) {
        int b = i2 == 2 ? b(bArr, i) : -1;
        if (b >= 0) {
            this.b++;
            int[] iArr = this.c;
            if (b >= iArr.length || 512 <= iArr[b]) {
                return;
            }
            this.a++;
        }
    }

    public final void e() {
        this.b = 0;
        this.a = 0;
    }
}
