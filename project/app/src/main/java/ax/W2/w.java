/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.c3.K;
import java.util.Set;

public class w {
    private static w d;
    public String a;
    public K b;
    public Set<String> c;

    public static w c() {
        if (d == null) {
            d = new w();
        }
        return d;
    }

    public void a() {
        this.a = null;
        this.c = null;
    }

    public Set<String> b() {
        return this.c;
    }

    public K d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public boolean f() {
        return this.a != null && this.c != null;
    }

    public void g(K k8, String string, Set<String> set) {
        if (string == null) {
            return;
        }
        this.b = k8;
        this.a = string;
        this.c = set;
    }
}

