/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

public class b {
    private int a = 1;

    public b a(Object object) {
        int n8 = this.a;
        int n9 = object == null ? 0 : object.hashCode();
        this.a = n8 * 31 + n9;
        return this;
    }

    public int b() {
        return this.a;
    }

    public final b c(boolean bl) {
        this.a = this.a * 31 + bl;
        return this;
    }
}

