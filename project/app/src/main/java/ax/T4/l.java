/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.W4.c;

public abstract class l {
    protected int a;
    protected int b;
    protected int c;

    protected l() {
    }

    public final int a() {
        int n8;
        int n9 = n8 = this.b;
        if (n8 < 0) {
            n9 = 0;
        }
        return n9;
    }

    public abstract String b();

    public final int c() {
        return this.b + 1;
    }

    public final int d() {
        return this.c;
    }

    public final boolean e() {
        return this.a == 1;
    }

    public final boolean f() {
        return this.a == 2;
    }

    public final boolean g() {
        return this.a == 0;
    }

    public String h() {
        int n8 = this.a;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return "?";
                }
                return "Object";
            }
            return "Array";
        }
        return "root";
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        int n8 = this.a;
        if (n8 != 0) {
            if (n8 != 1) {
                stringBuilder.append('{');
                String string = this.b();
                if (string != null) {
                    stringBuilder.append('\"');
                    ax.W4.c.a(stringBuilder, string);
                    stringBuilder.append('\"');
                } else {
                    stringBuilder.append('?');
                }
                stringBuilder.append('}');
            } else {
                stringBuilder.append('[');
                stringBuilder.append(this.a());
                stringBuilder.append(']');
            }
        } else {
            stringBuilder.append("/");
        }
        return stringBuilder.toString();
    }
}

