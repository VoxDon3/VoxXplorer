/*
 * Decompiled with CFR 0.152.
 */
package ax.e9;

import ax.d9.g;
import ax.e9.a;
import ax.e9.b;
import ax.e9.c;
import ax.e9.d;
import ax.e9.e;

public class f
implements g {
    @Override
    public ax.d9.b a(String string) {
        return b.a(string);
    }

    @Override
    public ax.d9.e b(String string) {
        return new e(string);
    }

    @Override
    public ax.d9.d c(String string) {
        if (j.Objects.equals((Object)string, (Object)"HMACT64")) {
            return new ax.g9.a(this.b("MD5"));
        }
        return new d(string);
    }

    @Override
    public ax.d9.a d(String string) {
        return a.a(string);
    }

    @Override
    public ax.d9.c e(String string) {
        return c.a(string);
    }
}

