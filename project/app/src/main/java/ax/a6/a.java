/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import android.content.Context;
import ax.a6.G;
import ax.a6.G0;
import ax.a6.h;

public abstract class a {
    private static a a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(Context object) {
        synchronized (a.class) {
            try {
                if (a != null) return a;
                h h8 = new h(null);
                h8.b((Application)object.getApplicationContext());
                a = h8.a();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract G0 b();

    public abstract G c();
}

