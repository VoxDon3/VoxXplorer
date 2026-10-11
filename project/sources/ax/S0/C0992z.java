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
import ax.S0.C0992z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: ax.S0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992z {
    private static C0992z f;
    private final Executor a;
    private final CopyOnWriteArrayList<d> b;
    private final Object c;
    private int d;
    private boolean e;

    /* renamed from: ax.S0.z$b */
    private static final class b {

        /* renamed from: ax.S0.z$b$a */
        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            private final C0992z a;

            public a(C0992z c0992z) {
                this.a = c0992z;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, C0992z c0992z) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C0968a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(c0992z);
                telephonyManager.registerTelephonyCallback(c0992z.a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                c0992z.m(5);
            }
        }
    }

    /* renamed from: ax.S0.z$c */
    public interface c {
        void a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.S0.z$d */
    final class d {
        private final WeakReference<c> a;
        private final Executor b;

        public d(c cVar, Executor executor) {
            this.a = new WeakReference<>(cVar);
            this.b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = dVar.a.get();
            if (cVar != null) {
                cVar.a(C0992z.this.g());
            }
        }

        public void b() {
            this.b.execute(new Runnable() { // from class: ax.S0.D
                @Override // java.lang.Runnable
                public final void run() {
                    C0992z.d.a(C0992z.d.this);
                }
            });
        }

        public boolean c() {
            return this.a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.S0.z$e */
    final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            C0992z.this.a.execute(new Runnable() { // from class: ax.S0.E
                @Override // java.lang.Runnable
                public final void run() {
                    C0992z.this.i(context);
                }
            });
        }
    }

    private C0992z(final Context context) {
        Executor a2 = C0969b.a();
        this.a = a2;
        this.b = new CopyOnWriteArrayList<>();
        this.c = new Object();
        this.d = 0;
        a2.execute(new Runnable() { // from class: ax.S0.y
            @Override // java.lang.Runnable
            public final void run() {
                C0992z.this.j(context);
            }
        });
    }

    public static synchronized C0992z e(Context context) {
        C0992z c0992z;
        synchronized (C0992z.class) {
            try {
                if (f == null) {
                    f = new C0992z(context);
                }
                c0992z = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0992z;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
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
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int h = h(context);
        if (Build.VERSION.SDK_INT < 31 || h != 5) {
            m(h);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnprotectedReceiver"})
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void l() {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.c()) {
                this.b.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i) {
        l();
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                Iterator<d> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int g() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public void k(c cVar, Executor executor) {
        boolean z;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.c) {
            this.b.add(dVar);
            z = this.e;
        }
        if (z) {
            dVar.b();
        }
    }
}
