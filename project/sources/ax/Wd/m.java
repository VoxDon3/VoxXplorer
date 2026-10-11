package ax.Wd;

/* loaded from: classes3.dex */
public abstract class m {
    protected k a;
    protected int b;
    protected k c;
    protected int[] d;
    protected String e;

    public m(k kVar, int i, k kVar2, int[] iArr, String str) {
        this.a = kVar;
        this.b = i;
        this.c = kVar2;
        this.d = (int[]) iArr.clone();
        this.e = str;
    }

    public int a(int i) {
        return this.d[i];
    }

    public int b(byte b) {
        return this.a.d(b & 255);
    }

    public String c() {
        return this.e;
    }

    public int d(int i, int i2) {
        return this.c.d((i2 * this.b) + i);
    }
}
