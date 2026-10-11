/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import ax.S0.A;
import ax.S0.B;
import ax.S0.C;
import ax.S0.D;
import ax.S0.E;
import ax.S0.a;
import ax.S0.y;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class z {
    private static z f;
    private final Executor a;
    private final CopyOnWriteArrayList<d> b;
    private final Object c;
    private int d;
    private boolean e;

    private z(Context context) {
        Executor executor;
        this.a = executor = ax.S0.b.a();
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executor.execute(new y(this, context));
    }

    public static /* synthetic */ void a(z z8, Context context) {
        z8.j(context);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static z e(Context object) {
        synchronized (z.class) {
            try {
                z z8;
                if (f != null) return f;
                f = z8 = new z((Context)object);
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            default: {
                return 6;
            }
            case 20: {
                if (Build.VERSION.SDK_INT >= 29) {
                    return 9;
                }
                return 0;
            }
            case 18: {
                return 2;
            }
            case 13: {
                return 5;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 14: 
            case 15: 
            case 17: {
                return 4;
            }
            case 1: 
            case 2: 
        }
        return 3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int h(Context context) {
        int n8;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        int n9 = 0;
        if (context == null) {
            return 0;
        }
        try {
            context = context.getActiveNetworkInfo();
            n9 = n8 = 1;
            if (context == null) return n9;
        }
        catch (SecurityException securityException) {
            return n9;
        }
        if (!context.isConnected()) {
            return n8;
        }
        n9 = context.getType();
        if (n9 == 0) return z.f((NetworkInfo)context);
        if (n9 == 1) return 2;
        if (n9 == 4) return z.f((NetworkInfo)context);
        if (n9 == 5) return z.f((NetworkInfo)context);
        if (n9 == 6) return 5;
        if (n9 == 9) return 7;
        return 8;
    }

    private void i(Context context) {
        int n8 = z.h(context);
        if (Build.VERSION.SDK_INT >= 31 && n8 == 5) {
            ax.S0.z$b.a(context, this);
            return;
        }
        this.m(n8);
    }

    @SuppressLint(value={"UnprotectedReceiver"})
    private void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver((BroadcastReceiver)new e(this), intentFilter);
    }

    private void l() {
        for (d d8 : this.b) {
            if (!d8.c()) continue;
            this.b.remove(d8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void m(int n8) {
        this.l();
        Object object = this.c;
        // MONITORENTER : object
        if (this.e && this.d == n8) {
            // MONITOREXIT : object
            return;
        }
        this.e = true;
        this.d = n8;
        Iterator<d> iterator = this.b.iterator();
        // MONITOREXIT : object
        while (iterator.hasNext()) {
            iterator.next().b();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int g() {
        Object object = this.c;
        synchronized (object) {
            return this.d;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void k(c object, Executor object2) {
        this.l();
        object2 = new d(this, (c)object, (Executor)object2);
        object = this.c;
        // MONITORENTER : object
        this.b.add((d)object2);
        boolean bl = this.e;
        // MONITOREXIT : object
        if (!bl) return;
        ((d)object2).b();
    }

    private static final class b {
        public static void a(Context object, z z8) {
            try {
                TelephonyManager telephonyManager = ax.S0.a.e((TelephonyManager)object.getSystemService("phone"));
                object = new a(z8);
                A.a(telephonyManager, z8.a, (TelephonyCallback)object);
                B.a(telephonyManager, (TelephonyCallback)object);
                return;
            }
            catch (RuntimeException runtimeException) {
                z8.m(5);
                return;
            }
        }

        private static final class a
        extends TelephonyCallback
        implements TelephonyCallback.DisplayInfoListener {
            private final z a;

            public a(z z8) {
                this.a = z8;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo object) {
                int n8 = C.a(object);
                int n9 = 5;
                n8 = n8 != 3 && n8 != 4 && n8 != 5 ? 0 : 1;
                object = this.a;
                if (n8 != 0) {
                    n9 = 10;
                }
                ((z)object).m(n9);
            }
        }
    }

    public static interface c {
        public void a(int var1);
    }

    private final class d {
        private final WeakReference<c> a;
        private final Executor b;
        final z c;

        public d(z z8, c c8, Executor executor) {
            this.c = z8;
            this.a = new WeakReference<c>(c8);
            this.b = executor;
        }

        public static /* synthetic */ void a(d d8) {
            c c8 = (c)d8.a.get();
            if (c8 != null) {
                c8.a(d8.c.g());
            }
        }

        public void b() {
            this.b.execute(new D(this));
        }

        public boolean c() {
            return this.a.get() == null;
        }
    }

    private final class e
    extends BroadcastReceiver {
        final z a;

        private e(z z8) {
            this.a = z8;
        }

        public static /* synthetic */ void a(e e8, Context context) {
            e8.a.i(context);
        }

        public void onReceive(Context context, Intent intent) {
            this.a.a.execute(new E(this, context));
        }
    }
}

