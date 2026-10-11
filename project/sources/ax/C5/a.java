package ax.C5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ax.J5.C0748i;
import ax.J5.C0749j;
import ax.J5.C0750k;
import ax.J5.C0752m;
import ax.J5.ServiceConnectionC0741b;
import ax.M5.C0821p;
import ax.V5.e;
import ax.V5.f;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class a {
    ServiceConnectionC0741b a;
    f b;
    boolean c;
    final Object d = new Object();
    c e;
    private final Context f;
    final long g;

    /* renamed from: ax.C5.a$a, reason: collision with other inner class name */
    public static final class C0061a {
        private final String a;
        private final boolean b;

        @Deprecated
        public C0061a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @VisibleForTesting
    public a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C0821p.l(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }

    public static C0061a a(Context context) throws IOException, IllegalStateException, C0749j, C0750k {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0061a f = aVar.f(-1);
            aVar.e(f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, HttpUrl.FRAGMENT_ENCODE_SET, null);
            return f;
        } finally {
        }
    }

    private final C0061a f(int i) throws IOException {
        C0061a c0061a;
        C0821p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        c cVar = this.e;
                        if (cVar == null || !cVar.e0) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                C0821p.l(this.a);
                C0821p.l(this.b);
                try {
                    c0061a = new C0061a(this.b.c(), this.b.d0(true));
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0061a;
    }

    private final void g() {
        synchronized (this.d) {
            c cVar = this.e;
            if (cVar != null) {
                cVar.d0.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new c(this, j);
            }
        }
    }

    public final void c() {
        C0821p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        ax.Q5.b.b().c(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    protected final void d(boolean z) throws IOException, IllegalStateException, C0749j, C0750k {
        C0821p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    c();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int h = C0748i.f().h(context, C0752m.a);
                    if (h != 0 && h != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0741b serviceConnectionC0741b = new ServiceConnectionC0741b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ax.Q5.b.b().a(context, intent, serviceConnectionC0741b, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = serviceConnectionC0741b;
                        try {
                            this.b = e.r(serviceConnectionC0741b.b(10000L, TimeUnit.MILLISECONDS));
                            this.c = true;
                            if (z) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C0749j(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    final boolean e(C0061a c0061a, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (c0061a != null) {
            hashMap.put("limit_ad_tracking", true != c0061a.b() ? "0" : "1");
            String a = c0061a.a();
            if (a != null) {
                hashMap.put("ad_id_size", Integer.toString(a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new b(this, hashMap).start();
        return true;
    }

    protected final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public static void b(boolean z) {
    }
}
