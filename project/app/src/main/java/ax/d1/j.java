/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

import ax.h1.a;
import java.util.List;

public abstract class j
implements a<j> {
    public final String a;
    public final List<String> b;
    public final boolean c;

    protected j(String string, List<String> list, boolean bl) {
        this.a = string;
        this.b = java.util.DesugarCollections.unmodifiableList(list);
        this.c = bl;
    }
}

