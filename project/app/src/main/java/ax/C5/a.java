/*
 * Decompiled with CFR 0.152.
 */
package ax.C5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ax.C5.b;
import ax.C5.c;
import ax.J5.i;
import ax.J5.j;
import ax.J5.k;
import ax.M5.p;
import ax.V5.e;
import ax.V5.f;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class a {
    ax.J5.b a;
    f b;
    boolean c;
    final Object d = new Object();
    c e;
    private final Context f;
    final long g;

    @VisibleForTesting
    public a(Context context, long l8, boolean bl, boolean bl2) {
        p.l(context);
        Context context2 = context;
        if (bl) {
            Context context3 = context.getApplicationContext();
            context2 = context;
            if (context3 != null) {
                context2 = context3;
            }
        }
        this.f = context2;
        this.c = false;
        this.g = l8;
    }

    public static a a(Context object) throws IOException, IllegalStateException, j, k {
        object = new a((Context)object, -1L, true, false);
        try {
            long l8 = SystemClock.elapsedRealtime();
            ((a)object).d(false);
            a a8 = super.f(-1);
            ((a)object).e(a8, true, 0.0f, SystemClock.elapsedRealtime() - l8, "", null);
            ((a)object).c();
            return a8;
        }
        catch (Throwable throwable) {
            try {
                ((a)object).e(null, true, 0.0f, -1L, "", throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                ((a)object).c();
                throw throwable2;
            }
        }
    }

    public static void b(boolean bl) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final a f(int var1_1) throws IOException {
        p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            block17: {
                if (!this.c) {
                    var2_2 = this.d;
                    synchronized (var2_2) {
                    }
                }
                ** GOTO lbl31
                {
                    catch (Throwable var2_3) {
                        break block17;
                    }
                    {
                        block16: {
                            block18: {
                                try {
                                    var3_6 = this.e;
                                    if (var3_6 != null && var3_6.e0) {
                                        // MONITOREXIT @DISABLED, blocks:[1, 8, 9, 13, 14] lbl13 : MonitorExitStatement: MONITOREXIT : var2_2
                                    }
                                    ** GOTO lbl-1000
                                }
                                catch (Throwable var3_8) {
                                    break block18;
                                }
                                try {
                                    this.d(false);
                                    if (this.c) break block16;
                                    var2_2 = new IOException("AdvertisingIdClient cannot reconnect.");
                                    throw var2_2;
                                }
                                catch (Exception var3_7) {
                                    var2_2 = new IOException("AdvertisingIdClient cannot reconnect.", var3_7);
                                    throw var2_2;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var3_6 = new IOException("AdvertisingIdClient is not connected.");
                                    throw var3_6;
                                }
                            }
                            throw var3_8;
                        }
                        p.l(this.a);
                        p.l(this.b);
                        try {
                            var2_2 = new a(this.b.c(), this.b.d0(true));
                            // MONITOREXIT @DISABLED, blocks:[6, 8, 13] lbl35 : MonitorExitStatement: MONITOREXIT : this
                            this.g();
                            return var2_2;
                        }
                        catch (RemoteException var2_4) {}
                        {
                            Log.i((String)"AdvertisingIdClient", (String)"GMS remote exception ", (Throwable)var2_4);
                            var2_5 = new IOException("Remote exception");
                            throw var2_5;
                        }
                    }
                }
            }
            throw var2_3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void g() {
        Object object = this.d;
        synchronized (object) {
            try {
                long l8;
                c c8 = this.e;
                if (c8 != null) {
                    c8.d0.countDown();
                    try {
                        this.e.join();
                    }
                    catch (InterruptedException interruptedException) {}
                }
                if ((l8 = this.g) > 0L) {
                    this.e = c8 = new c(this, l8);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || (var1_1 = this.a) == null) {
            }
            ** GOTO lbl9
            {
                block8: {
                    block9: {
                        catch (Throwable var1_3) {
                            break block8;
                        }
lbl9:
                        // 1 sources

                        try {
                            if (this.c) {
                                ax.Q5.b.b().c(this.f, this.a);
                            }
                            break block9;
                        }
                        catch (Throwable var1_2) {}
                        Log.i((String)"AdvertisingIdClient", (String)"AdvertisingIdClient unbindService failed.", (Throwable)var1_2);
                    }
                    this.c = false;
                    this.b = null;
                    this.a = null;
                    return;
                }
                throw var1_3;
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @VisibleForTesting
    protected final void d(boolean bl) throws IOException, IllegalStateException, j, k {
        p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Throwable throwable2;
            block15: {
                Object object;
                block16: {
                    ax.J5.b b8;
                    Object object2;
                    try {
                        block14: {
                            if (this.c) {
                                this.c();
                            }
                            object2 = this.f;
                            try {
                                object2.getPackageManager().getPackageInfo("com.android.vending", 0);
                                int n8 = i.f().h((Context)object2, 12451000);
                                if (n8 == 0 || n8 == 2) break block14;
                                IOException iOException = new IOException("Google Play services not available");
                                throw iOException;
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                j j8 = new j(9);
                                throw j8;
                            }
                        }
                        b8 = new ax.J5.b();
                        object = new Intent("com.google.android.gms.ads.identifier.service.START");
                        object.setPackage("com.google.android.gms");
                    }
                    catch (Throwable throwable2) {
                        break block15;
                    }
                    {
                        boolean bl2 = ax.Q5.b.b().a((Context)object2, (Intent)object, b8, 1);
                        if (!bl2) break block16;
                    }
                    {
                        this.a = b8;
                    }
                    {
                        object = ax.V5.e.r(b8.b(10000L, TimeUnit.MILLISECONDS));
                    }
                    this.b = object;
                    this.c = true;
                    if (!bl) return;
                    this.g();
                    return;
                }
                object = new IOException("Connection failure");
                throw object;
            }
            throw throwable2;
        }
    }

    @VisibleForTesting
    final boolean e(a object, boolean bl, float f8, long l8, String string, Throwable throwable) {
        if (!(Math.random() > 0.0)) {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            string = "1";
            hashMap.put("app_context", "1");
            if (object != null) {
                if (!((a)object).b()) {
                    string = "0";
                }
                hashMap.put("limit_ad_tracking", string);
                object = ((a)object).a();
                if (object != null) {
                    hashMap.put("ad_id_size", Integer.toString(((String)object).length()));
                }
            }
            if (throwable != null) {
                hashMap.put("error", throwable.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(l8));
            new b(this, hashMap).start();
            return true;
        }
        return false;
    }

    protected final void finalize() throws Throwable {
        this.c();
        super.finalize();
    }

    public static final class a {
        private final String a;
        private final boolean b;

        @Deprecated
        public a(String string, boolean bl) {
            this.a = string;
            this.b = bl;
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public String toString() {
            String string = this.a;
            boolean bl = this.b;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(string).length() + 7);
            stringBuilder.append("{");
            stringBuilder.append(string);
            stringBuilder.append("}");
            stringBuilder.append(bl);
            return stringBuilder.toString();
        }
    }
}

