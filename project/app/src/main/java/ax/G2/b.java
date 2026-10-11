/*
 * Decompiled with CFR 0.152.
 */
package ax.G2;

public final class b {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public b(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.a = bl;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (this.a != ((b)object).a) {
            return false;
        }
        if (this.b != ((b)object).b) {
            return false;
        }
        if (this.c != ((b)object).c) {
            return false;
        }
        return this.d == ((b)object).d;
    }

    public int hashCode() {
        int n8;
        int n9;
        int n10 = this.a;
        int n11 = 1;
        int n12 = n10;
        if (n10 != 0) {
            n12 = 1;
        }
        n10 = n9 = this.b;
        if (n9 != 0) {
            n10 = 1;
        }
        n9 = n8 = this.c;
        if (n8 != 0) {
            n9 = 1;
        }
        if ((n8 = this.d) == 0) {
            n11 = n8;
        }
        return ((n12 * 31 + n10) * 31 + n9) * 31 + n11;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetworkState(isConnected=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isValidated=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isMetered=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isNotRoaming=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

