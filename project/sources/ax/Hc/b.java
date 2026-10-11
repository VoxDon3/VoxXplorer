package ax.Hc;

/* loaded from: classes3.dex */
public class b {
    private long b;
    private String c;
    private String d;
    private int a = -1;
    private int e = 255;
    private int f = 512;

    public long a() {
        return this.b;
    }

    public void b(String str) {
        this.d = str;
    }

    public void c(int i) {
        if (i >= -1 && i <= 9) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("Invalid gzip compression level: " + i);
    }

    public void d(String str) {
        this.c = str;
    }

    public void e(long j) {
        this.b = j;
    }

    public void f(int i) {
        this.e = i;
    }
}
