/*
 * Decompiled with CFR 0.152.
 */
package ax.Vd;

public abstract class l {
    protected short[] a;
    protected byte[] b;
    protected float c;
    protected boolean d;
    protected String e;

    public l(short[] sArray, byte[] byArray, float f8, boolean bl, String string) {
        this.a = (short[])sArray.clone();
        this.b = (byte[])byArray.clone();
        this.c = f8;
        this.d = bl;
        this.e = string;
    }

    public String a() {
        return this.e;
    }

    public short b(byte by) {
        return this.a[by & 0xFF];
    }

    public byte c(int n8) {
        return this.b[n8];
    }

    public float d() {
        return this.c;
    }
}

