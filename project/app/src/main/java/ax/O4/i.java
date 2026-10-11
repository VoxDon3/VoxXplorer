/*
 * Decompiled with CFR 0.152.
 */
package ax.O4;

public class i
extends RuntimeException {
    private final int c0;
    private final int d0;
    private final int q;

    i(String string, int n8, int n9, int n10) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" at ");
        stringBuilder.append(n9);
        stringBuilder.append(":");
        stringBuilder.append(n10);
        super(stringBuilder.toString());
        this.q = n8;
        this.c0 = n9;
        this.d0 = n10;
    }
}

