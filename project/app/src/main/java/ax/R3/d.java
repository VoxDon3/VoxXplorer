/*
 * Decompiled with CFR 0.152.
 */
package ax.R3;

import ax.R3.a;
import ax.R3.e;
import java.io.File;

public class d
implements a.a {
    private final int a;
    private final a b;

    public d(a a8, int n8) {
        this.a = n8;
        this.b = a8;
    }

    @Override
    public ax.R3.a g() {
        File file = this.b.a();
        if (file == null) {
            return null;
        }
        if (!(file.mkdirs() || file.exists() && file.isDirectory())) {
            return null;
        }
        return e.c(file, this.a);
    }

    public static interface a {
        public File a();
    }
}

