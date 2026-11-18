package com.voxdon.xplorer.service;

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
import ax.u3.AbstractC3199q;
import ax.u3.C3181C;
import ax.u3.C3184b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class ScanService extends Service {
    private static final Logger e = g.a(ScanService.class);
    private int a;
    private HashMap<Integer, Boolean> b = new HashMap<>();
    private Handler c = new Handler();
    private long d;

    static class a {
        String a;
        boolean b;
        boolean c;

        a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }
    }

    class b extends AbstractC3199q<Void, Void, Void> {
        f[] h;
        Context i;
        int j;
        final CountDownLatch k;
        final CountDownLatch l;
        long m;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                ScanService.this.stopSelf(bVar.j);
            }
        }

        /* renamed from: com.voxdon.xplorer.service.ScanService$b$b, reason: collision with other inner class name */
        class C0526b implements MediaScannerConnection.MediaScannerConnectionClient {
            final List<a> a;
            MediaScannerConnection b;
            int c;
            a d;

            C0526b(List<a> list) {
                this.a = list;
            }

            void a() {
                if (this.c >= this.a.size()) {
                    this.b.disconnect();
                    b.this.l.countDown();
                } else {
                    a aVar = this.a.get(this.c);
                    this.d = aVar;
                    this.b.scanFile(aVar.a, null);
                    this.c++;
                }
            }

            @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
            public void onMediaScannerConnected() {
                if (this.b.isConnected()) {
                    if (b.this.l.getCount() == 0) {
                        long uptimeMillis = (SystemClock.uptimeMillis() - b.this.m) / 1000;
                        c.h().f().b("MediaScanner connected after timeout").g("delay:" + uptimeMillis).h();
                    }
                    b.this.k.countDown();
                    a();
                }
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                a aVar;
                if (Q.g0() && str != null && uri != null && (aVar = this.d) != null && aVar.b && str.equals(aVar.a)) {
                    M.l(b.this.i, uri);
                }
                a();
            }
        }

        b(Context context, f[] fVarArr, int i) {
            super(AbstractC3199q.e.FILE_SCAN);
            this.k = new CountDownLatch(1);
            this.l = new CountDownLatch(1);
            this.i = context;
            this.h = fVarArr;
            this.j = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.h));
            M.b(this.i, arrayList, null);
            int i = 0;
            M.c(this.i, arrayList, false, null);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                f fVar = (f) obj;
                if (!fVar.q && fVar.m0) {
                    arrayList2.add(new a(fVar.c0, fVar.d0, fVar.e0));
                }
            }
            if (arrayList2.size() > 0) {
                C0526b c0526b = new C0526b(arrayList2);
                MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(ScanService.this.getApplicationContext(), c0526b);
                c0526b.b = mediaScannerConnection;
                mediaScannerConnection.connect();
                this.m = SystemClock.uptimeMillis();
                try {
                    if (!this.k.await(Q.S() ? 7L : 25L, TimeUnit.SECONDS)) {
                        this.l.countDown();
                    }
                } catch (InterruptedException unused) {
                }
            } else {
                this.l.countDown();
            }
            try {
                this.l.await(300L, TimeUnit.SECONDS);
            } catch (InterruptedException unused2) {
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Void r4) {
            Boolean bool = (Boolean) ScanService.this.b.get(Integer.valueOf(this.j));
            if (bool == null || bool.booleanValue()) {
                ScanService.this.c.postDelayed(new a(), 1000L);
            } else {
                ScanService.this.stopSelf(this.j);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        ax.Q2.b.f(this, true);
        super.onCreate();
        this.a = C3181C.a(this, 600000L, "ScanService");
        this.d = System.currentTimeMillis();
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
        u.j(this).a(401);
        C3181C.d(this.a);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            startForeground(401, u.j(this).g(this));
        } catch (IllegalStateException unused) {
        }
        if (intent == null) {
            stopSelf();
            return 2;
        }
        try {
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("PENDING_SCAN_ARRAY");
            if (parcelableArrayExtra == null) {
                stopSelf();
                return 2;
            }
            f[] fVarArr = (f[]) Arrays.copyOf(parcelableArrayExtra, parcelableArrayExtra.length, f[].class);
            this.b.put(Integer.valueOf(i2), Boolean.valueOf(intent.getBooleanExtra("HAS_FOLLOWING_LIST", false)));
            new b(this, fVarArr, i2).h(new Void[0]);
            return 3;
        } catch (Exception e2) {
            C3184b.e("pending scan array parcelable error");
            e2.printStackTrace();
            stopSelf();
            return 2;
        }
    }

    public void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        d.c("Scan service timeout", new Exception("ScanServiceTimeout :" + (System.currentTimeMillis() - this.d)));
        stopForeground(1);
    }
}
