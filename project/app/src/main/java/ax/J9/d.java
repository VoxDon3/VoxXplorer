/*
 * Decompiled with CFR 0.152.
 */
package ax.J9;

import java.util.Random;

public class d {
    private long a = 99887766L;

    public d() {
        this(new Random().nextInt());
    }

    public d(int n8) {
        this.c(n8);
    }

    public double a() {
        return (double)this.b() * (double)4.656613E-10f;
    }

    public int b() {
        long l8;
        this.a = l8 = this.a * 6364136223846793005L + 1442695040888963407L;
        return (int)(l8 >> 32);
    }

    public void c(int n8) {
        this.a = n8;
    }
}

