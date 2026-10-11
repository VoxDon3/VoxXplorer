/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;

public final class e
extends i {
    public final String b;
    public final String c;
    public final String d;

    public e(String string, String string2, String string3) {
        super("COMM");
        this.b = string;
        this.c = string2;
        this.d = string3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && e.class == object.getClass()) {
            object = (e)object;
            if (j.Objects.equals((Object)this.c, (Object)((e)object).c) && j.Objects.equals((Object)this.b, (Object)((e)object).b) && j.Objects.equals((Object)this.d, (Object)((e)object).d)) {
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
        stringBuilder.append(": language=");
        stringBuilder.append(this.b);
        stringBuilder.append(", description=");
        stringBuilder.append(this.c);
        stringBuilder.append(", text=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }
}

