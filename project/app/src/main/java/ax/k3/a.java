/*
 * Decompiled with CFR 0.152.
 */
package ax.k3;

public class a
implements Comparable<a> {
    public String c0;
    public String q;

    public a(String string, String string2) {
        this.q = string;
        this.c0 = string2;
    }

    public int d(a a8) {
        return this.q.compareTo(a8.q);
    }
}

