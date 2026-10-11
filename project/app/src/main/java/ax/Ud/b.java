/*
 * Decompiled with CFR 0.152.
 */
package ax.Ud;

public abstract class b {
    private int a;
    private int b;
    protected int[] c;
    protected float d;

    public b() {
        this.e();
    }

    public float a() {
        int n8;
        int n9 = this.b;
        if (n9 > 0 && (n8 = this.a) > 4) {
            float f8;
            if (n9 != n8 && (f8 = (float)n8 / ((float)(n9 - n8) * this.d)) < 0.99f) {
                return f8;
            }
            return 0.99f;
        }
        return 0.01f;
    }

    protected abstract int b(byte[] var1, int var2);

    public boolean c() {
        return this.b > 1024;
    }

    public void d(byte[] objectArray, int n8, int n9) {
        n8 = n9 == 2 ? this.b((byte[])objectArray, n8) : -1;
        if (n8 >= 0) {
            ++this.b;
            objectArray = this.c;
            if (n8 < objectArray.length && 512 > objectArray[n8]) {
                ++this.a;
            }
        }
    }

    public final void e() {
        this.b = 0;
        this.a = 0;
    }
}

