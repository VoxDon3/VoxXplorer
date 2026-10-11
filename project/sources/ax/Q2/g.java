package ax.Q2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class g {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static Logger a(Class cls) {
        c();
        return Logger.getLogger("FileManager." + cls.getSimpleName());
    }

    public static Logger b(String str) {
        c();
        return Logger.getLogger("FileManager." + str);
    }

    public static void c() {
        if (a.getAndSet(true)) {
            return;
        }
        try {
            ax.Ga.a.a("FileManager", 25, 30);
            Logger logger = LogManager.getLogManager().getLogger(HttpUrl.FRAGMENT_ENCODE_SET);
            if (c.a()) {
                logger.setLevel(Level.FINEST);
            } else {
                logger.setLevel(Level.WARNING);
            }
        } catch (RuntimeException unused) {
        }
    }
}
