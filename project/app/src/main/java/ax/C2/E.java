/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.Context;
import ax.Gb.l;
import ax.L2.s;
import ax.l2.b;
import ax.o2.g;

public final class E
extends b {
    private final Context c;

    public E(Context context) {
        l.f(context, "context");
        super(9, 10);
        this.c = context;
    }

    @Override
    public void a(g g8) {
        l.f(g8, "db");
        g8.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        s.c(this.c, g8);
        ax.L2.l.c(this.c, g8);
    }
}

