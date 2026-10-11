/*
 * Decompiled with CFR 0.152.
 */
package ax.O7;

import ax.O7.g;
import java.io.File;
import java.io.FilenameFilter;

public final class f
implements FilenameFilter {
    public final String q;

    public /* synthetic */ f(String string) {
        this.q = string;
    }

    @Override
    public final boolean accept(File file, String string) {
        return g.a(this.q, file, string);
    }
}

