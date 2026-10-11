/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import ax.Ha.c;
import ax.Q2.d;
import ax.Q2.g;
import ax.X2.Q;
import ax.c3.M;
import ax.o3.f;
import ax.s3.u;
import ax.u3.C;
import ax.u3.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ScanService
extends Service {
    private static final Logger e = g.a(ScanService.class);
    private int a;
    private HashMap<Integer, Boolean> b = new HashMap();
    private Handler c = new Handler();
    private long d;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        ax.Q2.b.f((Context)this, true);
        super.onCreate();
        this.a = C.a((Context)this, 600000L, "ScanService");
        this.d = System.currentTimeMillis();
    }

    public void onDestroy() {
        this.stopForeground(true);
        u.j((Context)this).a(401);
        C.d(this.a);
        super.onDestroy();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int onStartCommand(Intent intent, int n8, int n9) {
        Exception exception2;
        block6: {
            Parcelable[] parcelableArray;
            try {
                this.startForeground(401, u.j((Context)this).g(this));
            }
            catch (IllegalStateException illegalStateException) {
                // empty catch block
            }
            if (intent == null) {
                this.stopSelf();
                return 2;
            }
            try {
                parcelableArray = intent.getParcelableArrayExtra("PENDING_SCAN_ARRAY");
                if (parcelableArray == null) {
                    this.stopSelf();
                    return 2;
                }
            }
            catch (Exception exception2) {
                break block6;
            }
            parcelableArray = (f[])Arrays.copyOf(parcelableArray, parcelableArray.length, f[].class);
            boolean bl = intent.getBooleanExtra("HAS_FOLLOWING_LIST", false);
            this.b.put(n9, bl);
            new b(this, (Context)this, (f[])parcelableArray, n9).h(new Void[0]);
            return 3;
        }
        ax.u3.b.e("pending scan array parcelable error");
        exception2.printStackTrace();
        this.stopSelf();
        return 2;
    }

    public void onTimeout(int n8, int n9) {
        super.onTimeout(n8, n9);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ScanServiceTimeout :");
        stringBuilder.append(System.currentTimeMillis() - this.d);
        ax.Q2.d.c("Scan service timeout", new Exception(stringBuilder.toString()));
        ax.o3.g.a(this, 1);
    }

    static class a {
        String a;
        boolean b;
        boolean c;

        a(String string, boolean bl, boolean bl2) {
            this.a = string;
            this.b = bl;
            this.c = bl2;
        }
    }

    class com.alphainventor.filemanager.service.ScanService$b
    extends q<Void, Void, Void> {
        f[] h;
        Context i;
        int j;
        final CountDownLatch k;
        final CountDownLatch l;
        long m;
        final ScanService n;

        com.alphainventor.filemanager.service.ScanService$b(ScanService scanService, Context context, f[] fArray, int n8) {
            this.n = scanService;
            super(q.e.j0);
            this.k = new CountDownLatch(1);
            this.l = new CountDownLatch(1);
            this.i = context;
            this.h = fArray;
            this.j = n8;
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        protected Void w(Void ... var1_1) {
            var1_1 = new ArrayList<f>(Arrays.asList(this.h));
            M.b(this.i, (List<f>)var1_1, null);
            var7_4 = this.i;
            var2_5 = 0;
            M.c((Context)var7_4, (List<f>)var1_1, false, null);
            var7_4 = new ArrayList<E>();
            var4_6 = var1_1.size();
            while (var2_5 < var4_6) {
                var8_8 /* !! */  = var1_1.get(var2_5);
                var3_7 = var2_5 + 1;
                var8_8 /* !! */  = (f)var8_8 /* !! */ ;
                var2_5 = var3_7;
                if (var8_8 /* !! */ .q) continue;
                var2_5 = var3_7;
                if (!var8_8 /* !! */ .m0) continue;
                var7_4.add(new a(var8_8 /* !! */ .c0, var8_8 /* !! */ .d0, var8_8 /* !! */ .e0));
                var2_5 = var3_7;
            }
            if (var7_4.size() > 0) {
                var7_4 = new b(this, (List<a>)var7_4);
                var1_1 = new MediaScannerConnection(this.n.getApplicationContext(), (MediaScannerConnection.MediaScannerConnectionClient)var7_4);
                var7_4.b = var1_1;
                var1_1.connect();
                this.m = SystemClock.uptimeMillis();
                var5_9 = Q.S() != false ? 7L : 25L;
                if (!this.k.await(var5_9, TimeUnit.SECONDS)) {
                    this.l.countDown();
                }
            } else {
                this.l.countDown();
            }
lbl35:
            // 3 sources

            while (true) {
                this.l.await(300L, TimeUnit.SECONDS);
lbl39:
                // 2 sources

                return null;
                break;
            }
            catch (InterruptedException var1_2) {}
            ** while (true)
            catch (InterruptedException var1_3) {
                ** continue;
            }
        }

        protected void x(Void object) {
            object = (Boolean)this.n.b.get(this.j);
            if (object != null && !((Boolean)object).booleanValue()) {
                this.n.stopSelf(this.j);
                return;
            }
            this.n.c.postDelayed(new Runnable(this){
                final com.alphainventor.filemanager.service.ScanService$b q;
                {
                    this.q = b8;
                }

                @Override
                public void run() {
                    com.alphainventor.filemanager.service.ScanService$b b8 = this.q;
                    b8.n.stopSelf(b8.j);
                }
            }, 1000L);
        }

        class b
        implements MediaScannerConnection.MediaScannerConnectionClient {
            final List<a> a;
            MediaScannerConnection b;
            int c;
            a d;
            final com.alphainventor.filemanager.service.ScanService$b e;

            b(com.alphainventor.filemanager.service.ScanService$b b8, List<a> list) {
                this.e = b8;
                this.a = list;
            }

            void a() {
                a a8;
                if (this.c >= this.a.size()) {
                    this.b.disconnect();
                    this.e.l.countDown();
                    return;
                }
                this.d = a8 = this.a.get(this.c);
                this.b.scanFile(a8.a, null);
                ++this.c;
            }

            public void onMediaScannerConnected() {
                if (!this.b.isConnected()) {
                    return;
                }
                if (this.e.l.getCount() == 0L) {
                    long l8 = (SystemClock.uptimeMillis() - this.e.m) / 1000L;
                    ax.Ha.b b8 = ax.Ha.c.h().f().b("MediaScanner connected after timeout");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("delay:");
                    stringBuilder.append(l8);
                    b8.g(stringBuilder.toString()).h();
                }
                this.e.k.countDown();
                this.a();
            }

            public void onScanCompleted(String string, Uri uri) {
                a a8;
                if (Q.g0() && string != null && uri != null && (a8 = this.d) != null && a8.b && string.equals(a8.a)) {
                    M.l(this.e.i, uri);
                }
                this.a();
            }
        }
    }
}

