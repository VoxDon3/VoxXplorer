/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.Q8.g;

public class c {
    private g a;
    private int b;
    private int c;
    private int d;

    public c(g g8, int n8, int n9, int n10, boolean bl) {
        this.a = g8;
        if (!bl) {
            n8 = Math.max(n8, 65536);
        }
        this.b = n8;
        if (!bl) {
            n9 = Math.max(n9, 65536);
        }
        this.c = n9;
        if (!bl) {
            n10 = Math.max(n10, 65536);
        }
        this.d = n10;
    }

    public g a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NegotiatedProtocol{");
        stringBuilder.append("dialect=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", maxTransactSize=");
        stringBuilder.append(this.b);
        stringBuilder.append(", maxReadSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", maxWriteSize=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

