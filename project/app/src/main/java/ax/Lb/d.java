/*
 * Decompiled with CFR 0.152.
 */
package ax.Lb;

import ax.tb.D;
import java.util.NoSuchElementException;

public final class d
extends D {
    private final int c0;
    private boolean d0;
    private int e0;
    private final int q;

    /*
     * Enabled aggressive block sorting
     */
    public d(int n8, int n9, int n10) {
        this.q = n10;
        this.c0 = n9;
        boolean bl = false;
        if (n10 > 0 ? n8 <= n9 : n8 >= n9) {
            bl = true;
        }
        this.d0 = bl;
        if (!bl) {
            n8 = n9;
        }
        this.e0 = n8;
    }

    @Override
    public int b() {
        int n8 = this.e0;
        if (n8 == this.c0) {
            if (this.d0) {
                this.d0 = false;
                return n8;
            }
            throw new NoSuchElementException();
        }
        this.e0 = this.q + n8;
        return n8;
    }

    @Override
    public boolean hasNext() {
        return this.d0;
    }
}

