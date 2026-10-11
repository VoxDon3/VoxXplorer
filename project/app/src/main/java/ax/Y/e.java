/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import ax.Y.h;

public final class e {
    public static h a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return h.j(a.a(configuration));
        }
        return h.a(configuration.locale);
    }

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, h h8) {
            configuration.setLocales((LocaleList)h8.i());
        }
    }
}

