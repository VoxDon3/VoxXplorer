package ax.Y;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public final class e {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, h hVar) {
            configuration.setLocales((LocaleList) hVar.i());
        }
    }

    public static h a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? h.j(a.a(configuration)) : h.a(configuration.locale);
    }
}
