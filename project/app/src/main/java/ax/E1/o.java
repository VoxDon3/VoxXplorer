/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;

public final class o
extends i {
    public final String b;
    public final String c;

    public o(String string, String string2, String string3) {
        super(string);
        this.b = string2;
        this.c = string3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && o.class == object.getClass()) {
            object = (o)object;
            if (this.a.equals(((i)object).a) && j.Objects.equals((Object)this.b, (Object)((o)object).b) && j.Objects.equals((Object)this.c, (Object)((o)object).c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        String string = this.b;
        int n9 = 0;
        int n10 = string != null ? string.hashCode() : 0;
        string = this.c;
        if (string != null) {
            n9 = string.hashCode();
        }
        return ((527 + n8) * 31 + n10) * 31 + n9;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(": url=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

