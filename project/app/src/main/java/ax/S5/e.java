/*
 * Decompiled with CFR 0.152.
 */
package ax.S5;

import android.content.Context;
import ax.S5.d;

public class e {
    private static final e b = new e();
    private d a = null;

    public static d a(Context context) {
        return b.b(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d b(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Context context;
                block3: {
                    try {
                        if (this.a != null) return this.a;
                        context = object;
                        if (object.getApplicationContext() == null) break block3;
                        context = object.getApplicationContext();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = new d(context);
                this.a = object;
                return this.a;
            }
            throw throwable2;
        }
    }
}

