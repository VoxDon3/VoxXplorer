/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import ax.Ga.a;
import ax.Q2.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class g {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static Logger a(Class clazz) {
        g.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FileManager.");
        stringBuilder.append(clazz.getSimpleName());
        return Logger.getLogger(stringBuilder.toString());
    }

    public static Logger b(String string) {
        g.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FileManager.");
        stringBuilder.append(string);
        return Logger.getLogger(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c() {
        if (a.getAndSet(true)) return;
        try {
            ax.Ga.a.a("FileManager", 25, 30);
            Logger logger = LogManager.getLogManager().getLogger("");
            if (c.a()) {
                logger.setLevel(Level.FINEST);
                return;
            }
            logger.setLevel(Level.WARNING);
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }
}

