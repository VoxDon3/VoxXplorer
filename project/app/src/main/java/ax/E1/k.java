/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;

public final class k
extends i {
    public final String b;
    public final String c;
    public final String d;

    public k(String string, String string2, String string3) {
        super("----");
        this.b = string;
        this.c = string2;
        this.d = string3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && k.class == object.getClass()) {
            object = (k)object;
            if (j.Objects.equals((Object)this.c, (Object)((k)object).c) && j.Objects.equals((Object)this.b, (Object)((k)object).b) && j.Objects.equals((Object)this.d, (Object)((k)object).d)) {
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
        return ((527 + n9) * 31 + n10) * 31 + n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(": domain=");
        stringBuilder.append(this.b);
        stringBuilder.append(", description=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

