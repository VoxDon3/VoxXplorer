/*
 * Decompiled with CFR 0.152.
 */
package ax.mc;

public class c {
    protected byte[] a;
    protected int b;
    protected String c;
    protected String d;
    protected byte[] e;

    public c(String string, String string2, byte[] byArray, int n8) {
        this(string, string2, byArray, n8, null);
    }

    public c(String string, String string2, byte[] byArray, int n8, byte[] byArray2) {
        this.c = string;
        this.d = string2;
        this.a = byArray;
        this.b = n8;
        this.e = byArray2;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public byte[] c() {
        return this.a;
    }
}

