/*
 * Decompiled with CFR 0.152.
 */
package ax.J9;

import ax.I9.y;

public abstract class g {
    private String a;
    private String[] b;

    public g(String string, String[] stringArray) {
        this.a = string;
        this.b = stringArray;
    }

    public abstract y a();

    public int b() {
        return this.b.length;
    }

    public String[] c() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("[");
        stringBuilder.append(this.b());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

