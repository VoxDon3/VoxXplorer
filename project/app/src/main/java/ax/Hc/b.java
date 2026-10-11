/*
 * Decompiled with CFR 0.152.
 */
package ax.Hc;

public class b {
    private int a = -1;
    private long b;
    private String c;
    private String d;
    private int e = 255;
    private int f = 512;

    public long a() {
        return this.b;
    }

    public void b(String string) {
        this.d = string;
    }

    public void c(int n8) {
        if (n8 >= -1 && n8 <= 9) {
            this.a = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid gzip compression level: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void d(String string) {
        this.c = string;
    }

    public void e(long l8) {
        this.b = l8;
    }

    public void f(int n8) {
        this.e = n8;
    }
}

