/*
 * Decompiled with CFR 0.152.
 */
package ax.Va;

import ax.s8.c;

public class a {
    @c(value="description")
    String a;
    @c(value="error")
    String b;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiError{description='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", error='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

