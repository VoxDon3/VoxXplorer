/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;
import java.util.Arrays;

public final class d
extends i {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    private final i[] f;

    public d(String string, boolean bl, boolean bl2, String[] stringArray, i[] iArray) {
        super("CTOC");
        this.b = string;
        this.c = bl;
        this.d = bl2;
        this.e = stringArray;
        this.f = iArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && d.class == object.getClass()) {
            object = (d)object;
            if (this.c == ((d)object).c && this.d == ((d)object).d && j.Objects.equals((Object)this.b, (Object)((d)object).b) && Arrays.equals(this.e, ((d)object).e) && Arrays.equals(this.f, ((d)object).f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.c;
        int n9 = this.d;
        String string = this.b;
        int n10 = string != null ? string.hashCode() : 0;
        return ((527 + n8) * 31 + n9) * 31 + n10;
    }
}

