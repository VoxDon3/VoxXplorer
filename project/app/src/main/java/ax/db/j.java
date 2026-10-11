/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.cb.b;
import ax.db.a;
import ax.db.n;
import ax.db.o;
import ax.db.p;
import ax.db.q;
import ax.db.s;
import java.util.Map;

public final class j
extends q {
    public static final j e = new j();

    private j() {
        super(s.f, null);
    }

    @Override
    public void b(String string, Map<String, a> map) {
        b.b(string, "description");
        b.b(map, "attributes");
    }

    @Override
    public void d(o o8) {
        b.b(o8, "messageEvent");
    }

    @Override
    @Deprecated
    public void e(p p8) {
    }

    @Override
    public void g(n n8) {
        b.b(n8, "options");
    }

    @Override
    public void i(String string, a a8) {
        b.b(string, "key");
        b.b(a8, "value");
    }

    @Override
    public void j(Map<String, a> map) {
        b.b(map, "attributes");
    }

    public String toString() {
        return "BlankSpan";
    }
}

