/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import ax.Q.g;
import ax.b6.H2;
import ax.b6.M2;
import ax.b6.P2;
import ax.b6.Q2;
import ax.b6.T2;
import ax.b6.t2;
import ax.b6.w2;

final class R2
implements M2 {
    private static R2 c;
    private final Context a;
    private final ContentObserver b;

    private R2() {
        this.a = null;
        this.b = null;
    }

    private R2(Context context) {
        this.a = context;
        T2 t22 = new T2(this, null);
        this.b = t22;
        context.getContentResolver().registerContentObserver(w2.a, true, (ContentObserver)t22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static R2 a(Context object) {
        synchronized (R2.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (c != null) return c;
                            if (g.b(object, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) break block3;
                            R2 r22 = new R2((Context)object);
                            object = r22;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = new R2();
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
    static void b() {
        synchronized (R2.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Context context;
                        R2 r22 = c;
                        if (r22 == null || (context = r22.a) == null || r22.b == null) break block4;
                        context.getContentResolver().unregisterContentObserver(R2.c.b);
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
    private final String d(String string) {
        Object object = this.a;
        if (object != null && !H2.b(object)) {
            Throwable var2_6;
            try {
                object = new Q2(this, string);
                object = (String)P2.a(object);
                return object;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (SecurityException securityException) {
            }
            catch (IllegalStateException illegalStateException) {
                // empty catch block
            }
            StringBuilder stringBuilder = new StringBuilder("Unable to read GServices for: ");
            stringBuilder.append(string);
            Log.e((String)"GservicesLoader", (String)stringBuilder.toString(), (Throwable)var2_6);
        }
        return null;
    }

    final /* synthetic */ String c(String string) {
        return t2.a(this.a.getContentResolver(), string, null);
    }

    @Override
    public final /* synthetic */ Object h(String string) {
        return this.d(string);
    }
}

