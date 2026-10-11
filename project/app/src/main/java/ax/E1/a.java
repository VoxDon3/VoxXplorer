/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;
import ax.P0.A;
import java.util.Arrays;

public final class a
extends i {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public a(String string, String string2, int n8, byte[] byArray) {
        super("APIC");
        this.b = string;
        this.c = string2;
        this.d = n8;
        this.e = byArray;
    }

    @Override
    public void b(A.b b8) {
        b8.K(this.e, this.d);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && a.class == object.getClass()) {
            object = (a)object;
            if (this.d == ((a)object).d && j.Objects.equals((Object)this.b, (Object)((a)object).b) && j.Objects.equals((Object)this.c, (Object)((a)object).c) && Arrays.equals(this.e, ((a)object).e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.d;
        String string = this.b;
        int n9 = 0;
        int n10 = string != null ? string.hashCode() : 0;
        string = this.c;
        if (string != null) {
            n9 = string.hashCode();
        }
        return (((527 + n8) * 31 + n10) * 31 + n9) * 31 + Arrays.hashCode(this.e);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", description=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

