/*
 * Decompiled with CFR 0.152.
 */
package ax.U8;

import ax.U8.a;

public abstract class b<T> {
    protected a a;
    protected T b;

    public b(a a8) {
        this.a = a8;
    }

    public b(a a8, T t8) {
        this.a = a8;
        this.b = t8;
    }

    public a a() {
        return this.a;
    }

    public T b() {
        return this.b;
    }

    public abstract void c(ax.Z8.a<?> var1);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AvPair{avId=");
        stringBuilder.append(this.a.name());
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

