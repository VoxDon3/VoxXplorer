/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.G;

final class E
extends G.c {
    private final String a;
    private final String b;
    private final boolean c;

    E(String string, String string2, boolean bl) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                this.c = bl;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override
    public boolean b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof G.c && this.a.equals(((G.c)(object = (G.c)object)).d()) && this.b.equals(((G.c)object).c()) && this.c == ((G.c)object).b();
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        int n10 = this.c ? 1231 : 1237;
        return ((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OsData{osRelease=");
        stringBuilder.append(this.a);
        stringBuilder.append(", osCodeName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isRooted=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

