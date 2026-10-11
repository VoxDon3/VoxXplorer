/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

public class Z0 {
    private String a;
    private int b;

    public Z0(String string) {
        this.a = string;
        this.b = 0;
    }

    public boolean a() {
        return this.b != -1;
    }

    public String b() {
        int n8 = this.b;
        if (n8 == -1) {
            return null;
        }
        if ((n8 = this.a.indexOf(46, n8)) == -1) {
            String string = this.a.substring(this.b);
            this.b = -1;
            return string;
        }
        String string = this.a.substring(this.b, n8);
        this.b = n8 + 1;
        return string;
    }
}

