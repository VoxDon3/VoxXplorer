/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

class c {
    long a;
    long b;

    c() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BindPair binding input ");
        stringBuilder.append(this.a);
        stringBuilder.append(" to output ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

