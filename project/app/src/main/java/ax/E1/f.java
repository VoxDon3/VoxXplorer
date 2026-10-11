/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;
import java.util.Arrays;

public final class f
extends i {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public f(String string, String string2, String string3, byte[] byArray) {
        super("GEOB");
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = byArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && f.class == object.getClass()) {
            object = (f)object;
            if (j.Objects.equals((Object)this.b, (Object)((f)object).b) && j.Objects.equals((Object)this.c, (Object)((f)object).c) && j.Objects.equals((Object)this.d, (Object)((f)object).d) && Arrays.equals(this.e, ((f)object).e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String string = this.b;
        int n8 = 0;
        int n9 = string != null ? string.hashCode() : 0;
        string = this.c;
        int n10 = string != null ? string.hashCode() : 0;
        string = this.d;
        if (string != null) {
            n8 = string.hashCode();
        }
        return (((527 + n9) * 31 + n10) * 31 + n8) * 31 + Arrays.hashCode(this.e);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", filename=");
        stringBuilder.append(this.c);
        stringBuilder.append(", description=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }
}

