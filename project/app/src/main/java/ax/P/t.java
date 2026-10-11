/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.content.res.Configuration;
import ax.Gb.l;

public final class t {
    private final boolean a;
    private Configuration b;

    public t(boolean bl) {
        this.a = bl;
    }

    public t(boolean bl, Configuration configuration) {
        l.f(configuration, "newConfig");
        this(bl);
        this.b = configuration;
    }

    public final boolean a() {
        return this.a;
    }
}

