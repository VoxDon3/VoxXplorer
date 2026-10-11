/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.V4.b;
import java.io.Serializable;

public class r
implements Serializable {
    private static final r e0 = new r(1000, 1000, 5000000);
    protected final int c0;
    protected final int d0;
    protected final int q;

    protected r(int n8, int n9, int n10) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = n10;
    }

    public static r a() {
        return e0;
    }

    public void b(int n8) throws b {
        if (n8 <= this.c0) {
            return;
        }
        throw new b(String.format("Number length (%d) exceeds the maximum length (%d)", n8, this.c0));
    }

    public void c(int n8) throws b {
        if (n8 <= this.c0) {
            return;
        }
        throw new b(String.format("Number length (%d) exceeds the maximum length (%d)", n8, this.c0));
    }

    public void d(int n8) throws b {
        if (n8 <= this.q) {
            return;
        }
        throw new b(String.format("Depth (%d) exceeds the maximum allowed nesting depth (%d)", n8, this.q));
    }

    public void e(int n8) throws b {
        if (n8 <= this.d0) {
            return;
        }
        throw new b(String.format("String length (%d) exceeds the maximum length (%d)", n8, this.d0));
    }
}

