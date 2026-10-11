/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import java.util.HashSet;

public class b {
    protected final Object a;
    protected String b;
    protected String c;
    protected HashSet<String> d;

    private b(Object object) {
        this.a = object;
    }

    public static b e(g g8) {
        return new b(g8);
    }

    public static b f(j j8) {
        return new b(j8);
    }

    public b a() {
        return new b(this.a);
    }

    public Object b() {
        return this.a;
    }

    public boolean c(String string) throws i {
        Object object = this.b;
        if (object == null) {
            this.b = string;
            return false;
        }
        if (string.equals(object)) {
            return true;
        }
        object = this.c;
        if (object == null) {
            this.c = string;
            return false;
        }
        if (string.equals(object)) {
            return true;
        }
        if (this.d == null) {
            this.d = object = new HashSet(16);
            ((HashSet)object).add(this.b);
            this.d.add(this.c);
        }
        return this.d.add(string) ^ true;
    }

    public void d() {
        this.b = null;
        this.c = null;
        this.d = null;
    }
}

