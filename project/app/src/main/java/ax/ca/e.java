/*
 * Decompiled with CFR 0.152.
 */
package ax.ca;

public class e {
    private final int a;
    private final int b;

    public e(int n8, int n9) {
        this.a = n8;
        this.b = n9;
    }

    public e(int n8, int n9, int n10) {
        if (n10 % 180 == 0) {
            this.a = n8;
            this.b = n9;
            return;
        }
        this.a = n9;
        this.b = n8;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public e c(float f8) {
        return new e((int)((float)this.a * f8), (int)((float)this.b * f8));
    }

    public e d(int n8) {
        return new e(this.a / n8, this.b / n8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(9);
        stringBuilder.append(this.a);
        stringBuilder.append("x");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

