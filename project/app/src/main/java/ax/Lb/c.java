/*
 * Decompiled with CFR 0.152.
 */
package ax.Lb;

import ax.Gb.g;
import ax.Lb.d;
import ax.tb.D;

public class c
implements Iterable<Integer>,
ax.Hb.a {
    public static final a e0 = new a(null);
    private final int c0;
    private final int d0;
    private final int q;

    public c(int n8, int n9, int n10) {
        if (n10 != 0) {
            if (n10 != Integer.MIN_VALUE) {
                this.q = n8;
                this.c0 = ax.Ab.c.b(n8, n9, n10);
                this.d0 = n10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object object) {
        block2: {
            block3: {
                if (!(object instanceof c)) break block2;
                if (this.isEmpty() && ((c)object).isEmpty()) break block3;
                int n8 = this.q;
                object = (c)object;
                if (n8 != ((c)object).q || this.c0 != ((c)object).c0 || this.d0 != ((c)object).d0) break block2;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return (this.q * 31 + this.c0) * 31 + this.d0;
    }

    public boolean isEmpty() {
        if (this.d0 > 0) {
            return this.q > this.c0;
        }
        return this.q < this.c0;
    }

    public final int k() {
        return this.q;
    }

    public final int l() {
        return this.c0;
    }

    public final int n() {
        return this.d0;
    }

    public D p() {
        return new d(this.q, this.c0, this.d0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        int n8;
        StringBuilder stringBuilder;
        if (this.d0 > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.q);
            stringBuilder.append("..");
            stringBuilder.append(this.c0);
            stringBuilder.append(" step ");
            n8 = this.d0;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.q);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.c0);
            stringBuilder.append(" step ");
            n8 = -this.d0;
        }
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final c a(int n8, int n9, int n10) {
            return new c(n8, n9, n10);
        }
    }
}

