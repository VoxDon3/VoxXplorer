/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

public final class F {
    public final String a;

    public F(String string) {
        this.a = string;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');
        stringBuilder.append(this.a);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

