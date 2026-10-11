/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.content.res.Configuration;
import ax.Gb.l;

public final class i {
    private final boolean a;
    private Configuration b;

    public i(boolean bl) {
        this.a = bl;
    }

    public i(boolean bl, Configuration configuration) {
        l.f(configuration, "newConfig");
        this(bl);
        this.b = configuration;
    }

    public final boolean a() {
        return this.a;
    }
}

