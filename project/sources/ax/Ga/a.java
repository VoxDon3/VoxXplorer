package ax.Ga;

import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class a {
    public static void a(String str, int i, int i2) {
        Logger logger = LogManager.getLogManager().getLogger(HttpUrl.FRAGMENT_ENCODE_SET);
        for (Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
        }
        c cVar = new c(str);
        logger.addHandler(cVar);
        cVar.setFormatter(new b(i, i2));
    }
}
