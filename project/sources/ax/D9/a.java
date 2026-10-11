package ax.D9;

/* loaded from: classes3.dex */
public class a {
    private long a = System.nanoTime();
    private long b;
    private long c;
    private double d;
    private double e;

    protected a() {
    }

    public void a() {
        this.c = System.nanoTime();
    }

    public void b() {
        this.b = this.a;
        long nanoTime = System.nanoTime();
        this.a = nanoTime;
        long j = nanoTime - this.c;
        long j2 = nanoTime - this.b;
        if (j2 > 0) {
            this.e = (this.e * 0.99d) + (j * 0.01d);
            this.d = (this.d * 0.99d) + (j2 * 0.01d);
        }
    }
}
