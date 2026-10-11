package ax.J9;

import java.util.Random;

/* loaded from: classes3.dex */
public class d {
    private long a;

    public d() {
        this(new Random().nextInt());
    }

    public double a() {
        return b() * 4.6566128730773926E-10d;
    }

    public int b() {
        long j = (this.a * 6364136223846793005L) + 1442695040888963407L;
        this.a = j;
        return (int) (j >> 32);
    }

    public void c(int i) {
        this.a = i;
    }

    public d(int i) {
        this.a = 99887766L;
        c(i);
    }
}
