/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;
import java.util.Arrays;

public final class m
extends i {
    public final String b;
    public final byte[] c;

    public m(String string, byte[] byArray) {
        super("PRIV");
        this.b = string;
        this.c = byArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && m.class == object.getClass()) {
            object = (m)object;
            if (j.Objects.equals((Object)this.b, (Object)((m)object).b) && Arrays.equals(this.c, ((m)object).c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String string = this.b;
        int n8 = string != null ? string.hashCode() : 0;
        return (527 + n8) * 31 + Arrays.hashCode(this.c);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(": owner=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

