/*
 * Decompiled with CFR 0.152.
 */
package ax.O3;

import java.io.File;

class a {
    a() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public File b(String string) {
        return new File(string);
    }

    public long c(File file) {
        return file.length();
    }
}

