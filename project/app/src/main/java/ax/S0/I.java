/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.a;

public final class I {
    public static final I c = new I(-1, -1);
    public static final I d = new I(0, 0);
    private final int a;
    private final int b;

    public I(int n8, int n9) {
        boolean bl = !(n8 != -1 && n8 < 0 || n9 != -1 && n9 < 0);
        ax.S0.a.a(bl);
        this.a = n8;
        this.b = n9;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (object instanceof I) {
            object = (I)object;
            if (this.a == ((I)object).a && this.b == ((I)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.b;
        int n9 = this.a;
        return n8 ^ (n9 >>> 16 | n9 << 16);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("x");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

