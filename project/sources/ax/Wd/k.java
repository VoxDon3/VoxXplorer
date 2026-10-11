package ax.Wd;

/* loaded from: classes3.dex */
public class k {
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] e;

    public k(int i, int i2, int i3, int i4, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = (int[]) iArr.clone();
    }

    public static int a(int i, int i2) {
        return i | (i2 << 16);
    }

    public static int b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return c(i | (i2 << 4), (i4 << 4) | i3, (i6 << 4) | i5, (i8 << 4) | i7);
    }

    public static int c(int i, int i2, int i3, int i4) {
        return a(i | (i2 << 8), (i4 << 8) | i3);
    }

    public int d(int i) {
        return (this.e[i >> this.a] >> ((i & this.b) << this.c)) & this.d;
    }
}
