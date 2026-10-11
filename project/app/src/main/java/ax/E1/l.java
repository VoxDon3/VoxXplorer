/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;
import java.util.Arrays;

public final class l
extends i {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public l(int n8, int n9, int n10, int[] nArray, int[] nArray2) {
        super("MLLT");
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = nArray;
        this.f = nArray2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && l.class == object.getClass()) {
            object = (l)object;
            if (this.b == ((l)object).b && this.c == ((l)object).c && this.d == ((l)object).d && Arrays.equals(this.e, ((l)object).e) && Arrays.equals(this.f, ((l)object).f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.b) * 31 + this.c) * 31 + this.d) * 31 + Arrays.hashCode(this.e)) * 31 + Arrays.hashCode(this.f);
    }
}

