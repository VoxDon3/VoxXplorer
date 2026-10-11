/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import ax.k4.i;

public class g {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public g() {
    }

    public g(Class<?> clazz, Class<?> clazz2) {
        this.a(clazz, clazz2);
    }

    public g(Class<?> clazz, Class<?> clazz2, Class<?> clazz3) {
        this.b(clazz, clazz2, clazz3);
    }

    public void a(Class<?> clazz, Class<?> clazz2) {
        this.b(clazz, clazz2, null);
    }

    public void b(Class<?> clazz, Class<?> clazz2, Class<?> clazz3) {
        this.a = clazz;
        this.b = clazz2;
        this.c = clazz3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (g)object;
            if (!this.a.equals(((g)object).a)) {
                return false;
            }
            if (!this.b.equals(((g)object).b)) {
                return false;
            }
            return i.c(this.c, ((g)object).c);
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        Class<?> clazz = this.c;
        int n10 = clazz != null ? clazz.hashCode() : 0;
        return (n8 * 31 + n9) * 31 + n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiClassKey{first=");
        stringBuilder.append(this.a);
        stringBuilder.append(", second=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

