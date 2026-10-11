/*
 * Decompiled with CFR 0.152.
 */
package ax.la;

import ax.Gb.g;

public final class x {
    public static final a c = new a(null);
    private static final x d = new x(0, 0);
    private final int a;
    private final int b;

    public x(int n8, int n9) {
        this.a = n8;
        this.b = n9;
        if (n8 >= 0) {
            if (n9 >= 0) {
                return;
            }
            throw new IllegalArgumentException("Height must be a positive number.");
        }
        throw new IllegalArgumentException("Width must be a positive number.");
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x)) {
            return false;
        }
        object = (x)object;
        if (this.a != ((x)object).a) {
            return false;
        }
        return this.b == ((x)object).b;
    }

    public int hashCode() {
        return this.a * 31 + this.b;
    }

    public String toString() {
        int n8 = this.a;
        int n9 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resolution(");
        stringBuilder.append(n8);
        stringBuilder.append("x");
        stringBuilder.append(n9);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

