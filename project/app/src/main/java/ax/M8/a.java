/*
 * Decompiled with CFR 0.152.
 */
package ax.M8;

import ax.L8.c;
import ax.Y8.b;
import ax.Y8.c;
import ax.Z8.a;

public class a {
    private int a;
    private c b;
    private String c;

    public int a() {
        return this.a;
    }

    public void b(ax.Z8.a<?> a8) throws a.b {
        this.a = a8.P();
        this.b = c.a.f(a8.N(), c.class, null);
        long l8 = a8.N();
        this.c = a8.H(ax.Y8.b.c, (int)l8 / 2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FileNotifyInformation{action=");
        stringBuilder.append(this.b);
        stringBuilder.append(", fileName='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

