package com.voxdon.xplorer.service;

import android.app.Notification;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import ax.Q2.g;
import ax.W2.B;
import ax.W2.h;
import ax.W2.j;
import ax.X2.Q;
import ax.a3.AbstractC1354j;
import ax.a3.y;
import ax.c3.C1832u;
import ax.c3.K;
import ax.d3.AbstractC1927n;
import ax.s3.u;
import ax.u3.C3180B;
import ax.u3.C3181C;
import ax.u3.C3182D;
import ax.u3.C3184b;
import com.voxdon.xplorer.activity.FileProgressActivity;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class CommandService extends Service {
    private static final Logger s = g.a(CommandService.class);
    private static long t;
    private static long u;
    private static CommandService v;
    private HashMap<j, c> a;
    private FileProgressActivity b;
    private ArrayList<j> c;
    private ArrayList<j> d;
    private int f;
    private long g;
    private Thread i;
    private C3182D j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private boolean o;
    private Runnable p;
    private long q;
    private final IBinder e = new d();
    private final Object h = new Object();
    private Handler r = new Handler(Looper.getMainLooper());

    class a implements ServiceConnection {
        final /* synthetic */ f c0;
        final /* synthetic */ Fragment d0;
        final /* synthetic */ boolean e0;
        final /* synthetic */ j q;

        a(j jVar, f fVar, Fragment fragment, boolean z) {
            this.q = jVar;
            this.c0 = fVar;
            this.d0 = fragment;
            this.e0 = z;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (!(iBinder instanceof d)) {
                ax.Q2.d.c("commandconnected", new Exception("Invalid service binder:" + iBinder.getClass().getName()));
                return;
            }
            CommandService a = ((d) iBinder).a();
            if (!a.w()) {
                String str = "cmd:" + this.q.getClass().getName() + "," + this.q.p() + "," + a.s();
                ax.Ha.c.h().f().b("COMMAND SERVICE IS NOT STARTED").g(str).h();
                C3184b.g(str);
            }
            a.N(this.c0, this.d0, this.q, this.e0);
            this.c0.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class b implements Runnable {
        final /* synthetic */ long q;

        b(long j) {
            this.q = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CommandService.this.k) {
                if (CommandService.this.l) {
                    C3184b.g("CommandService started but destroyed");
                    return;
                } else {
                    if (CommandService.this.n == this.q) {
                        CommandService.this.n = 0L;
                        CommandService.this.h();
                        return;
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("current service null=");
            sb.append(CommandService.v == null);
            sb.append(",diff=");
            sb.append(CommandService.v != CommandService.this);
            sb.append(",this service destroyed=");
            sb.append(CommandService.this.l);
            sb.append(",not started?");
            sb.append(CommandService.t < this.q);
            sb.append(":");
            sb.append(CommandService.t > this.q);
            ax.Ha.c.h().f().b("!!! PENDING CHECK NOT STARTED !!!").g(sb.toString()).h();
            CommandService.this.n = 0L;
        }
    }

    static class c {
        y a;
        y b;
        ax.R2.a c;
        AbstractC1354j d;

        public c(ax.R2.a aVar, y yVar) {
            this.c = aVar;
            this.a = yVar;
        }

        public ax.R2.a a() {
            return this.c;
        }

        public AbstractC1354j b() {
            return this.d;
        }

        public y c(boolean z) {
            return z ? this.a : this.b;
        }

        public void d(y yVar) {
            if (this.a == yVar) {
                this.a = null;
            }
            if (this.b == yVar) {
                this.b = null;
            }
        }

        public void e(AbstractC1354j abstractC1354j) {
            this.d = abstractC1354j;
        }

        public void f(boolean z, y yVar) {
            if (z) {
                this.a = yVar;
            } else {
                this.b = yVar;
            }
        }
    }

    public class d extends Binder {
        public d() {
        }

        public CommandService a() {
            return CommandService.this;
        }
    }

    private void L(ax.R2.a aVar, j jVar, AbstractC1354j abstractC1354j) {
        c cVar = this.a.get(jVar);
        if (cVar == null) {
            return;
        }
        if (aVar == null && (aVar = this.b) == null) {
            aVar = cVar.a() != null ? cVar.a() : null;
        }
        if (aVar != null) {
            try {
                if (!aVar.n()) {
                    FragmentManager supportFragmentManager = aVar.s().getSupportFragmentManager();
                    if (!supportFragmentManager.I0()) {
                        C3180B.d0(supportFragmentManager, abstractC1354j, "CommandDialog", true);
                        return;
                    }
                }
            } catch (IllegalStateException e) {
                ax.Ha.c.h().f().d("STARTOP2").l(e).h();
            }
        }
        if (aVar != null && aVar.n() && (aVar.s() instanceof MainActivity) && !aVar.s().getSupportFragmentManager().I0()) {
            cVar.e(abstractC1354j);
            this.d.add(jVar);
            startActivity(C1832u.D(this, true));
            if (Q.M()) {
                u.j(this).l(102, u.j(this).b(this, abstractC1354j.j3(this), abstractC1354j.i3(this), true));
                return;
            }
            return;
        }
        cVar.e(abstractC1354j);
        this.d.add(jVar);
        try {
            startActivity(C1832u.t(this));
        } catch (Exception e2) {
            ax.Ha.c.h().f().b("COMMAND SERVICE FILE PROGRESS").l(e2).h();
        }
        if (Q.M()) {
            u.j(this).l(102, u.j(this).b(this, abstractC1354j.j3(this), abstractC1354j.i3(this), false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(androidx.fragment.app.f r5, androidx.fragment.app.Fragment r6, ax.W2.h r7, boolean r8, boolean r9) throws ax.b3.C1488c {
        /*
            ax.W2.h$c r0 = r7.g()
            ax.W2.h$c r1 = ax.W2.h.c.FILLED
            if (r0 != r1) goto L6f
            ax.W2.j r0 = r7.a()
            android.content.Intent r1 = l(r5, r7)
            r2 = 1
            ax.u3.C3180B.f0(r5, r1, r2, r9)     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            com.voxdon.xplorer.service.CommandService r9 = q()     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            if (r9 == 0) goto L26
            long r3 = r0.p()     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            r9.F(r3)     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            goto L26
        L22:
            r6 = move-exception
            goto L33
        L24:
            r6 = move-exception
            goto L33
        L26:
            com.voxdon.xplorer.service.CommandService$a r9 = new com.voxdon.xplorer.service.CommandService$a     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            r9.<init>(r0, r5, r6, r8)     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            android.content.Intent r6 = j(r5, r2)     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            r5.bindService(r6, r9, r2)     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            return
        L33:
            boolean r8 = r7 instanceof ax.W2.B
            if (r8 != 0) goto L69
            ax.Ha.b r5 = ax.Ha.c.i(r5)
            ax.Ha.b r5 = r5.f()
            java.lang.String r8 = "START COMMAND SERVICE FOREGROUND"
            ax.Ha.b r5 = r5.b(r8)
            ax.Ha.b r5 = r5.l(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "command:"
            r8.append(r9)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            ax.Ha.b r5 = r5.g(r7)
            r5.h()
        L69:
            ax.b3.c r5 = new ax.b3.c
            r5.<init>(r6)
            throw r5
        L6f:
            ax.Ha.b r5 = ax.Ha.c.h()
            java.lang.String r6 = "INFO NOT FILLED!!!"
            ax.Ha.b r5 = r5.b(r6)
            ax.Ha.b r5 = r5.j()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getName()
            r6.append(r8)
            java.lang.String r8 = " : "
            r6.append(r8)
            ax.W2.h$c r7 = r7.g()
            java.lang.String r7 = r7.name()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            ax.Ha.b r5 = r5.g(r6)
            r5.h()
            ax.b3.c r5 = new ax.b3.c
            java.lang.String r6 = "Command is not filled"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.service.CommandService.M(androidx.fragment.app.f, androidx.fragment.app.Fragment, ax.W2.h, boolean, boolean):void");
    }

    private void O() {
        long j;
        long j2;
        ArrayList<j> arrayList = this.c;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String string = getResources().getString(R.string.running_progress_size, Integer.valueOf(this.c.size()));
        synchronized (this.h) {
            try {
                ArrayList<j> arrayList2 = this.c;
                int size = arrayList2.size();
                j = 0;
                j2 = 0;
                int i = 0;
                while (i < size) {
                    j jVar = arrayList2.get(i);
                    i++;
                    j jVar2 = jVar;
                    j += jVar2.w().u();
                    j2 += jVar2.w().t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            u.j(getApplicationContext()).l(100, k(string, j != 0 ? (int) ((j2 * 100) / j) : 0, true));
        } catch (NullPointerException e) {
            ax.Q2.d.c("update_service_noti", e);
        }
    }

    private void g() {
        u.j(getApplicationContext()).a(100);
        this.g = 0L;
    }

    public static Intent j(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) CommandService.class);
        if (z) {
            intent.setAction("action.start_command");
        }
        return intent;
    }

    private Notification k(String str, int i, boolean z) {
        return u.j(getApplicationContext()).c(this, str, i, z);
    }

    public static Intent l(Context context, h hVar) {
        Intent intent = new Intent(context, (Class<?>) CommandService.class);
        if (hVar != null) {
            intent.putExtra("extra_command_class", hVar.getClass().getName());
            intent.putExtra("extra_command_id", hVar.e());
        }
        return intent;
    }

    private void m() {
        if (this.m) {
            return;
        }
        try {
            startForeground(100, k(getString(R.string.ongoing), 0, false));
            this.m = true;
        } catch (IllegalStateException unused) {
            if (this.o) {
                return;
            }
            int r = C3180B.r(this);
            ax.Ha.c.i(this).f().b("Foreground not allowed : commandservice onbind").g("importance:" + r + ",started;" + this.k).h();
        }
    }

    public static CommandService q() {
        return v;
    }

    private int r(j jVar) {
        int indexOf;
        synchronized (this.h) {
            indexOf = this.c.indexOf(jVar);
        }
        return indexOf;
    }

    public static boolean x(ax.Q2.f fVar) {
        CommandService q = q();
        if (q != null) {
            return q.u(fVar);
        }
        return false;
    }

    public static boolean y(K k) {
        CommandService q = q();
        if (q != null) {
            return q.v(k);
        }
        return false;
    }

    private void z(j jVar, boolean z) {
        y yVar;
        y yVar2;
        c cVar = this.a.get(jVar);
        if (cVar != null) {
            yVar = cVar.c(true);
            yVar2 = cVar.c(false);
        } else {
            ax.Ha.c.h().d("COMS4").j().g(Integer.valueOf(jVar.B())).h();
            yVar = null;
            yVar2 = null;
        }
        synchronized (this.h) {
            this.c.remove(jVar);
        }
        this.a.remove(jVar);
        if (z) {
            if (yVar != null) {
                yVar.y3(jVar);
            }
            if (yVar2 != null) {
                yVar2.y3(jVar);
            }
        } else {
            if (yVar != null) {
                if (yVar.e1()) {
                    yVar.N2();
                } else {
                    yVar.D3(true);
                }
            }
            if (yVar2 != null) {
                if (yVar2.e1()) {
                    yVar2.N2();
                } else {
                    yVar2.D3(true);
                }
            }
        }
        FileProgressActivity fileProgressActivity = this.b;
        if (fileProgressActivity != null) {
            fileProgressActivity.U();
        }
    }

    public void A(j jVar) {
        z(jVar, false);
    }

    public void B(j jVar) {
        z(jVar, true);
    }

    public void C(j jVar) {
        y yVar;
        y yVar2;
        c cVar = this.a.get(jVar);
        if (cVar != null) {
            yVar = cVar.c(true);
            yVar2 = cVar.c(false);
        } else {
            ax.Ha.c.h().d("COMS1:").j().g(Integer.valueOf(jVar.B())).h();
            yVar = null;
            yVar2 = null;
        }
        if (yVar != null) {
            yVar.z3(jVar);
        }
        if (yVar2 != null) {
            yVar2.z3(jVar);
        }
    }

    public void D(j jVar) {
        y yVar;
        y yVar2;
        c cVar = this.a.get(jVar);
        if (cVar != null) {
            yVar = cVar.c(true);
            yVar2 = cVar.c(false);
        } else {
            ax.Ha.c.h().d("COMS2:").j().g(Integer.valueOf(jVar.B())).h();
            yVar = null;
            yVar2 = null;
        }
        if (yVar != null) {
            yVar.A3(jVar);
        }
        if (yVar2 != null) {
            yVar2.A3(jVar);
        }
        FileProgressActivity fileProgressActivity = this.b;
        if (fileProgressActivity != null) {
            fileProgressActivity.U();
        }
        O();
    }

    public void E(j jVar, boolean z) {
        y yVar;
        y yVar2;
        c cVar = this.a.get(jVar);
        if (cVar != null) {
            yVar = cVar.c(true);
            yVar2 = cVar.c(false);
        } else {
            ax.Ha.c.h().d("COMS3").j().g(Integer.valueOf(jVar.B())).h();
            yVar = null;
            yVar2 = null;
        }
        if (yVar != null) {
            yVar.B3(jVar, z);
        }
        if (yVar2 != null) {
            yVar2.B3(jVar, z);
        }
        FileProgressActivity fileProgressActivity = this.b;
        if (fileProgressActivity != null) {
            fileProgressActivity.V(jVar, r(jVar), z);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (z || uptimeMillis - this.g > 2000) {
            this.g = uptimeMillis;
            O();
        }
    }

    public void F(long j) {
        this.n = j;
        Runnable runnable = this.p;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
        }
        b bVar = new b(j);
        this.p = bVar;
        this.r.postDelayed(bVar, 30000L);
    }

    public void G(ax.R2.a aVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.d);
        this.d.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j jVar = (j) obj;
            c cVar = this.a.get(jVar);
            if (cVar == null) {
                if (jVar != null) {
                    str = "op:" + jVar.B();
                } else {
                    str = "null op";
                }
                ax.Ha.c.h().f().b("NULL PENDING OPERATOR").g(str).h();
            } else if (cVar.b() != null) {
                L(aVar, jVar, cVar.b());
                cVar.e(null);
            } else {
                ax.Ha.c.h().f().b("NULL PENDING DIALOG").g("command op:" + jVar.getClass().getName()).h();
            }
        }
        if (this.d.size() > 0) {
            ax.Ha.c.h().b("Command Operator repended!?").j().g("statesaved:" + aVar.n()).h();
        }
    }

    public void H(FileProgressActivity fileProgressActivity) {
        if (this.b == fileProgressActivity) {
            this.b = null;
        }
    }

    public void I(ax.R2.a aVar, j jVar, boolean z) {
        c cVar = this.a.get(jVar);
        try {
            FragmentManager supportFragmentManager = aVar.s().getSupportFragmentManager();
            if (supportFragmentManager.I0() || aVar.n() || jVar.z() != j.d.STARTED) {
                return;
            }
            y x3 = y.x3();
            C3180B.d0(supportFragmentManager, x3, "fileProgress", true);
            x3.z3(jVar);
            x3.A3(jVar);
            if (z) {
                cVar.f(true, x3);
            } else {
                cVar.f(false, x3);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public void J(FileProgressActivity fileProgressActivity) {
        this.b = fileProgressActivity;
    }

    public void K(j jVar, AbstractC1354j abstractC1354j) {
        L(null, jVar, abstractC1354j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void N(f fVar, Fragment fragment, j jVar, boolean z) {
        ax.R2.a aVar;
        if (jVar.T()) {
            ax.Ha.c.h().d("COMMAND SERVICE OPERATOR START TWICE!!!!").g(jVar.getClass().getSimpleName()).h();
            return;
        }
        long p = jVar.p();
        if (p >= this.n) {
            i();
        }
        t = p;
        if (fVar instanceof ax.R2.a) {
            aVar = (ax.R2.a) fVar;
        } else {
            if (fVar != 0) {
                ax.Ha.c.h().d("START OPERATOR FROM UNKNOWN ACTIVITY").g(fVar.getClass().getName()).h();
            }
            aVar = null;
        }
        boolean z2 = aVar != null && z;
        y x3 = z2 ? y.x3() : null;
        synchronized (this.h) {
            this.c.add(jVar);
        }
        c cVar = new c(aVar, x3);
        this.a.put(jVar, cVar);
        if (!this.j.b()) {
            Iterator<K> it = jVar.y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (ax.Q2.f.n0(it.next().d())) {
                    this.j.a();
                    break;
                }
            }
        }
        jVar.p0(this);
        jVar.u0(this.i);
        if (z2) {
            try {
                FragmentManager supportFragmentManager = aVar.s().getSupportFragmentManager();
                if (supportFragmentManager.I0()) {
                    cVar.d(x3);
                } else if (!aVar.n()) {
                    C3180B.d0(supportFragmentManager, x3, "fileProgress", true);
                }
            } catch (IllegalStateException e) {
                cVar.d(x3);
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (fragment != null && (fragment instanceof AbstractC1927n)) {
                    str = "ActiveState :" + ((AbstractC1927n) fragment).L3();
                }
                ax.Ha.c.h().d("STARTOP").l(e).g(str).h();
            }
        }
        FileProgressActivity fileProgressActivity = this.b;
        if (fileProgressActivity != null) {
            fileProgressActivity.U();
        }
    }

    public void h() {
        synchronized (this.h) {
            try {
                if (this.c.size() == 0 && this.n == 0) {
                    FileProgressActivity fileProgressActivity = this.b;
                    if (fileProgressActivity != null && !fileProgressActivity.isFinishing()) {
                        this.b.finish();
                    }
                    stopForeground(true);
                    this.m = false;
                    g();
                    stopSelf();
                    this.k = false;
                } else {
                    O();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        this.n = 0L;
        this.r.removeCallbacks(this.p);
    }

    public List<j> n() {
        return this.c;
    }

    public List<j> o(K k) {
        return p(k, -1);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent != null && "action.start_command".equals(intent.getAction())) {
            m();
        }
        return this.e;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.c = new ArrayList<>();
        this.a = new HashMap<>();
        this.d = new ArrayList<>();
        this.f = C3181C.a(this, 0L, "CommandService");
        v = this;
        this.i = Thread.currentThread();
        this.j = new C3182D(this, 3, "COMMAND_SERVICE");
        this.q = System.currentTimeMillis();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C3181C.d(this.f);
        this.j.c();
        super.onDestroy();
        v = null;
        this.l = true;
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        if (intent == null || !"action.start_command".equals(intent.getAction())) {
            return;
        }
        m();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                long longExtra = intent.getLongExtra("extra_command_id", -1L);
                if (longExtra <= t) {
                    ax.Q2.d.c("CommandServiceStartLater", new Exception("command cls:" + intent.getStringExtra("extra_command_class") + ",id:" + longExtra + ",lastop:" + t + ",lastsvc:" + u));
                }
                u = longExtra;
            } catch (IllegalStateException unused) {
                String stringExtra = intent.getStringExtra("extra_command_class");
                if (stringExtra != null && stringExtra.equals(B.class.getName())) {
                    this.o = true;
                    return 2;
                }
                ax.Ha.c.i(this).f().b("Foreground not allowed : command service").g("command class:" + stringExtra).h();
                return 2;
            }
        }
        this.o = false;
        this.k = true;
        startForeground(100, k(getString(R.string.ongoing), 0, false));
        this.m = true;
        return 2;
    }

    public void onTimeout(int i, int i2) {
        String str;
        super.onTimeout(i, i2);
        boolean z = true;
        stopForeground(1);
        if (this.c != null) {
            StringBuilder sb = new StringBuilder();
            synchronized (this.h) {
                try {
                    ArrayList<j> arrayList = this.c;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        j jVar = arrayList.get(i3);
                        i3++;
                        j jVar2 = jVar;
                        if (z) {
                            z = false;
                        } else {
                            sb.append(",");
                        }
                        sb.append(jVar2.B());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            str = sb.toString();
        } else {
            str = "null";
        }
        ax.Q2.d.c("Command service timeout", new Exception("CommandServiceTimeout : " + str + ":" + (System.currentTimeMillis() - this.q)));
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }

    public List<j> p(K k, int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.h) {
            try {
                ArrayList<j> arrayList2 = this.c;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    j jVar = arrayList2.get(i2);
                    i2++;
                    j jVar2 = jVar;
                    if (i != -1 && jVar2.B() != i) {
                    }
                    if (jVar2.y().contains(k)) {
                        arrayList.add(jVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public long s() {
        return this.n;
    }

    public boolean t() {
        return this.m;
    }

    public boolean u(ax.Q2.f fVar) {
        synchronized (this.h) {
            try {
                ArrayList<j> arrayList = this.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    j jVar = arrayList.get(i);
                    i++;
                    Iterator<K> it = jVar.y().iterator();
                    while (it.hasNext()) {
                        if (it.next().d() == fVar) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean v(K k) {
        synchronized (this.h) {
            try {
                ArrayList<j> arrayList = this.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    j jVar = arrayList.get(i);
                    i++;
                    if (jVar.y().contains(k)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean w() {
        return this.k;
    }
}
