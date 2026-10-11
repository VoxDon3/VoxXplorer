/*
 * Decompiled with CFR 0.152.
 */
package ax.Va;

import ax.Va.e;
import ax.s8.c;
import java.util.List;

public class f {
    @c(value="sort")
    String a;
    @c(value="public_key")
    String b;
    @c(value="items")
    List<e> c;
    @c(value="path")
    String d;
    @c(value="limit")
    int e;
    @c(value="offset")
    int f;
    @c(value="total")
    int g;

    public List<e> a() {
        return this.c;
    }

    public int b() {
        return this.g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResourceList{sort='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", publicKey='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append(", items=");
        stringBuilder.append(this.c);
        stringBuilder.append(", path='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", limit=");
        stringBuilder.append(this.e);
        stringBuilder.append(", offset=");
        stringBuilder.append(this.f);
        stringBuilder.append(", total=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

