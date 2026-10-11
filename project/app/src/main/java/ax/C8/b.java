/*
 * Decompiled with CFR 0.152.
 */
package ax.C8;

import ax.C8.c;

public abstract class b<T> {
    protected c q;

    protected b(c c8) {
        this.q = c8;
    }

    public c e() {
        return this.q;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (b)object;
            if (this.q != ((b)object).q) {
                return false;
            }
            if (this.g() != null) {
                return this.g().equals(((b)object).g());
            }
            if (((b)object).g() == null) {
                return true;
            }
        }
        return false;
    }

    public abstract T g();

    protected String h() {
        if (this.g() != null) {
            return this.g().toString();
        }
        return null;
    }

    public int hashCode() {
        return this.q.h();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("[");
        stringBuilder.append(this.h());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

