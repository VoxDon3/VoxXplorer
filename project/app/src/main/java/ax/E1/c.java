/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;
import java.util.Arrays;

public final class c
extends i {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    private final i[] g;

    public c(String string, int n8, int n9, long l8, long l9, i[] iArray) {
        super("CHAP");
        this.b = string;
        this.c = n8;
        this.d = n9;
        this.e = l8;
        this.f = l9;
        this.g = iArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            if (this.c == ((c)object).c && this.d == ((c)object).d && this.e == ((c)object).e && this.f == ((c)object).f && j.Objects.equals((Object)this.b, (Object)((c)object).b) && Arrays.equals(this.g, ((c)object).g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.c;
        int n9 = this.d;
        int n10 = (int)this.e;
        int n11 = (int)this.f;
        String string = this.b;
        int n12 = string != null ? string.hashCode() : 0;
        return ((((527 + n8) * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n12;
    }
}

