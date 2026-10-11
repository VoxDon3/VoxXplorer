/*
 * Decompiled with CFR 0.152.
 */
package ax.D9;

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
        long l8;
        this.b = this.a;
        this.a = l8 = System.nanoTime();
        long l9 = this.c;
        long l10 = l8 - this.b;
        if (l10 > 0L) {
            this.e = this.e * 0.99 + (double)(l8 - l9) * 0.01;
            this.d = this.d * 0.99 + (double)l10 * 0.01;
        }
    }
}

