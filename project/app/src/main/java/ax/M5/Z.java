/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import ax.S5.d;
import ax.S5.e;

public final class Z {
    private static final Object a = new Object();
    private static boolean b;
    private static String c;
    private static int d;

    public static int a(Context context) {
        Z.b(context);
        return d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(Context object) {
        Object object2 = a;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                block8: {
                    try {
                        if (b) {
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    b = true;
                    String string = object.getPackageName();
                    object = e.a((Context)object);
                    object = ((d)object).b((String)string, (int)128).metaData;
                    if (object != null) break block8;
                    return;
                }
                try {
                    c = object.getString("com.google.app.id");
                    d = object.getInt("com.google.android.gms.version");
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    Log.wtf((String)"MetadataValueReader", (String)"This should never happen.", (Throwable)nameNotFoundException);
                }
                return;
            }
            throw throwable2;
        }
    }
}

