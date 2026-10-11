package ax.T4;

import java.io.Serializable;

/* loaded from: classes.dex */
public class r implements Serializable {
    private static final r e0 = new r(1000, 1000, 5000000);
    protected final int c0;
    protected final int d0;
    protected final int q;

    protected r(int i, int i2, int i3) {
        this.q = i;
        this.c0 = i2;
        this.d0 = i3;
    }

    public static r a() {
        return e0;
    }

    public void b(int i) throws ax.V4.b {
        if (i > this.c0) {
            throw new ax.V4.b(String.format("Number length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(this.c0)));
        }
    }

    public void c(int i) throws ax.V4.b {
        if (i > this.c0) {
            throw new ax.V4.b(String.format("Number length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(this.c0)));
        }
    }

    public void d(int i) throws ax.V4.b {
        if (i > this.q) {
            throw new ax.V4.b(String.format("Depth (%d) exceeds the maximum allowed nesting depth (%d)", Integer.valueOf(i), Integer.valueOf(this.q)));
        }
    }

    public void e(int i) throws ax.V4.b {
        if (i > this.d0) {
            throw new ax.V4.b(String.format("String length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(this.d0)));
        }
    }
}
