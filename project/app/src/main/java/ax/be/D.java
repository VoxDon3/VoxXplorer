/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.P;

public class D
extends P {
    private final int c0;
    private final int q;

    public D(int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n8);
        stringBuilder.append(" KiB of memory would be needed; limit was ");
        stringBuilder.append(n9);
        stringBuilder.append(" KiB");
        super(stringBuilder.toString());
        this.q = n8;
        this.c0 = n9;
    }

    public int a() {
        return this.c0;
    }

    public int b() {
        return this.q;
    }
}

