/*
 * Decompiled with CFR 0.152.
 */
package ax.Ga;

import ax.Ga.b;
import ax.Ga.c;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class a {
    public static void a(String object, int n8, int n9) {
        Logger logger = LogManager.getLogManager().getLogger("");
        Handler[] handlerArray = logger.getHandlers();
        int n10 = handlerArray.length;
        for (int i8 = 0; i8 < n10; ++i8) {
            logger.removeHandler(handlerArray[i8]);
        }
        object = new c((String)object);
        logger.addHandler((Handler)object);
        ((Handler)object).setFormatter(new b(n8, n9));
    }
}

