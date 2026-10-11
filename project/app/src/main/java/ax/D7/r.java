/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.E;
import ax.D7.F;

public final class r {
    private final F<?> a;
    private final int b;
    private final int c;

    private r(F<?> f8, int n8, int n9) {
        this.a = E.c(f8, "Null dependency anInterface.");
        this.b = n8;
        this.c = n9;
    }

    private r(Class<?> clazz, int n8, int n9) {
        this(F.b(clazz), n8, n9);
    }

    public static r a(Class<?> clazz) {
        return new r(clazz, 0, 2);
    }

    private static String b(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    return "deferred";
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported injection: ");
                stringBuilder.append(n8);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            return "provider";
        }
        return "direct";
    }

    public static r h(Class<?> clazz) {
        return new r(clazz, 0, 1);
    }

    public static r i(F<?> f8) {
        return new r(f8, 1, 0);
    }

    public static r j(Class<?> clazz) {
        return new r(clazz, 1, 0);
    }

    public static r k(F<?> f8) {
        return new r(f8, 1, 1);
    }

    public static r l(Class<?> clazz) {
        return new r(clazz, 1, 1);
    }

    public static r m(Class<?> clazz) {
        return new r(clazz, 2, 0);
    }

    public F<?> c() {
        return this.a;
    }

    public boolean d() {
        return this.c == 2;
    }

    public boolean e() {
        return this.c == 0;
    }

    public boolean equals(Object object) {
        if (object instanceof r) {
            object = (r)object;
            if (this.a.equals(((r)object).a) && this.b == ((r)object).b && this.c == ((r)object).c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.b == 1;
    }

    public boolean g() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        stringBuilder.append(this.a);
        stringBuilder.append(", type=");
        int n8 = this.b;
        String string = n8 == 1 ? "required" : (n8 == 0 ? "optional" : "set");
        stringBuilder.append(string);
        stringBuilder.append(", injection=");
        stringBuilder.append(r.b(this.c));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

