/*
 * Decompiled with CFR 0.152.
 */
package ax.Ha;

import ax.Ha.a;
import java.util.HashSet;
import java.util.Set;

public class b {
    static Set<String> k = new HashSet<String>();
    String a = "DEBUG";
    String b = "UNNAMED";
    Object c = "";
    Object d = null;
    Throwable e = null;
    int f = 0;
    boolean g = false;
    boolean h = true;
    boolean i = false;
    boolean j = true;

    public b(a a8) {
        this.k();
    }

    private b k() {
        return this;
    }

    public b a(String string) {
        this.c = string;
        return this;
    }

    public b b(String object) {
        try {
            object = this.e((String)object).m("CRITICAL");
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return this;
        }
    }

    public b c(String object) {
        try {
            object = this.e((String)object).m("DEBUG");
            return object;
        }
        catch (Exception exception) {
            return this;
        }
    }

    public b d(String object) {
        try {
            object = this.e((String)object).m("ERROR");
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return this;
        }
    }

    public b e(String string) {
        this.b = string;
        return this;
    }

    public b f() {
        this.g = true;
        return this;
    }

    public b g(Object object) {
        this.d = object;
        return this;
    }

    public void h() {
    }

    public void i(boolean bl) {
        this.j = bl;
    }

    public b j() {
        this.e = new Throwable("STACKTRACE");
        this.f = 1;
        return this;
    }

    public b l(Throwable throwable) {
        this.e = throwable;
        this.f = 0;
        return this;
    }

    public b m(String string) {
        this.a = string;
        return this;
    }

    public b n(String object) {
        try {
            object = this.e((String)object).m("WARNING");
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return this;
        }
    }
}

