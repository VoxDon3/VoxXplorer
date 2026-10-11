/*
 * Decompiled with CFR 0.152.
 */
package ax.Db;

import java.io.Closeable;

public final class a {
    public static final void a(Closeable closeable, Throwable throwable) {
        if (closeable != null) {
            if (throwable == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
                return;
            }
            catch (Throwable throwable2) {
                ax.sb.a.a(throwable, throwable2);
            }
        }
    }
}

