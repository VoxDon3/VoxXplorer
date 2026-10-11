/*
 * Decompiled with CFR 0.152.
 */
package ax.Va;

import ax.s8.c;

public class d {
    @c(value="status")
    String a;

    public String a() {
        return this.a;
    }

    public boolean b() {
        return "in-progress".equals(this.a);
    }

    public boolean c() {
        return "success".equals(this.a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Operation{status='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

