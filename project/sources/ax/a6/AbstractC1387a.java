package ax.a6;

import android.app.Application;
import android.content.Context;

/* renamed from: ax.a6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1387a {
    private static AbstractC1387a a;

    public static AbstractC1387a a(Context context) {
        AbstractC1387a abstractC1387a;
        synchronized (AbstractC1387a.class) {
            try {
                if (a == null) {
                    C1401h c1401h = new C1401h(null);
                    c1401h.b((Application) context.getApplicationContext());
                    a = c1401h.a();
                }
                abstractC1387a = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC1387a;
    }

    public abstract G0 b();

    public abstract C1377G c();
}
