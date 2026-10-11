/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import ax.Q.g;
import ax.W5.l;
import ax.W5.n;
import ax.W5.u;
import ax.W5.v;
import ax.W5.w;
import ax.W5.x;
import ax.W5.y;

final class z
implements w {
    private static z c;
    private final Context a;
    private final ContentObserver b;

    private z() {
        this.a = null;
        this.b = null;
    }

    private z(Context context) {
        this.a = context;
        y y8 = new y(this, null);
        this.b = y8;
        context.getContentResolver().registerContentObserver(l.a, true, (ContentObserver)y8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static z b(Context object) {
        synchronized (z.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (c != null) return c;
                            if (g.b(object, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) break block3;
                            z z8 = new z((Context)object);
                            object = z8;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = new z();
                }
                c = object;
                return c;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void e() {
        synchronized (z.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Context context;
                        z z8 = c;
                        if (z8 == null || (context = z8.a) == null || z8.b == null) break block4;
                        context.getContentResolver().unregisterContentObserver(z.c.b);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                c = null;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final String c(String string) {
        Object object = this.a;
        if (object != null && !n.a(object)) {
            Throwable var2_6;
            try {
                object = new x(this, string);
                object = (String)u.a((v)object);
                return object;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (SecurityException securityException) {
            }
            catch (IllegalStateException illegalStateException) {
                // empty catch block
            }
            Log.e((String)"GservicesLoader", (String)"Unable to read GServices for: ".concat(String.valueOf(string)), (Throwable)var2_6);
        }
        return null;
    }

    final /* synthetic */ String d(String string) {
        return l.a(this.a.getContentResolver(), string, null);
    }
}

