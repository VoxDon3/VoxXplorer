/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.fragment.app.e;
import ax.Q2.f;
import ax.Q2.g;
import ax.W2.h;
import ax.W2.j;
import ax.X2.Q;
import ax.a3.j;
import ax.a3.y;
import ax.c3.K;
import ax.c3.u;
import ax.d3.n;
import ax.o3.a;
import ax.u3.B;
import ax.u3.C;
import ax.u3.D;
import ax.u3.b;
import com.voxdon.xplorer.activity.FileProgressActivity;
import com.voxdon.xplorer.activity.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class CommandService
extends Service {
    private static final Logger s = ax.Q2.g.a(CommandService.class);
    private static long t;
    private static long u;
    private static CommandService v;
    private HashMap<ax.W2.j, c> a;
    private FileProgressActivity b;
    private ArrayList<ax.W2.j> c;
    private ArrayList<ax.W2.j> d;
    private final IBinder e = new d(this);
    private int f;
    private long g;
    private final Object h = new Object();
    private Thread i;
    private D j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private boolean o;
    private Runnable p;
    private long q;
    private Handler r = new Handler(Looper.getMainLooper());

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void L(ax.R2.a a8, ax.W2.j j8, j j9) {
        c c8;
        block10: {
            IllegalStateException illegalStateException2;
            block9: {
                c8 = this.a.get(j8);
                if (c8 == null) {
                    return;
                }
                if (a8 == null && (a8 = this.b) == null) {
                    a8 = c8.a() != null ? c8.a() : null;
                }
                if (a8 != null) {
                    try {
                        FragmentManager fragmentManager;
                        if (!a8.n() && !(fragmentManager = a8.s().getSupportFragmentManager()).I0()) {
                            B.d0(fragmentManager, j9, "CommandDialog", true);
                            return;
                        }
                    }
                    catch (IllegalStateException illegalStateException2) {
                        break block9;
                    }
                }
                if (a8 != null && a8.n() && a8.s() instanceof MainActivity && !a8.s().getSupportFragmentManager().I0()) {
                    c8.e(j9);
                    this.d.add(j8);
                    this.startActivity(ax.c3.u.D((Context)this, true));
                    if (!Q.M()) return;
                    a8 = ax.s3.u.j((Context)this).b(this, j9.j3((Context)this), j9.i3((Context)this), true);
                    ax.s3.u.j((Context)this).l(102, (Notification)a8);
                    return;
                }
                break block10;
            }
            ax.Ha.c.h().f().d("STARTOP2").l(illegalStateException2).h();
        }
        c8.e(j9);
        this.d.add(j8);
        a8 = ax.c3.u.t((Context)this);
        try {
            this.startActivity((Intent)a8);
        }
        catch (Exception exception) {
            ax.Ha.c.h().f().b("COMMAND SERVICE FILE PROGRESS").l(exception).h();
        }
        if (!Q.M()) return;
        a8 = ax.s3.u.j((Context)this).b(this, j9.j3((Context)this), j9.i3((Context)this), false);
        ax.s3.u.j((Context)this).l(102, (Notification)a8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void M(androidx.fragment.app.f object, Fragment object2, h h8, boolean bl, boolean bl2) throws ax.b3.c {
        Throwable var1_4;
        Object object3;
        block6: {
            Object object4;
            block5: {
                if (h8.g() != h.c.c0) {
                    object = ax.Ha.c.h().b("INFO NOT FILLED!!!").j();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(h8.getClass().getName());
                    ((StringBuilder)object2).append(" : ");
                    ((StringBuilder)object2).append(h8.g().name());
                    ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
                    throw new ax.b3.c("Command is not filled");
                }
                object3 = h8.a();
                object4 = CommandService.l((Context)object, h8);
                try {
                    B.f0((Context)object, object4, true, bl2);
                    object4 = CommandService.q();
                    if (object4 == null) break block5;
                    object4.F(((ax.W2.j)object3).p());
                }
                catch (SecurityException securityException) {
                    break block6;
                }
                catch (IllegalStateException illegalStateException) {
                    break block6;
                }
            }
            object4 = new ServiceConnection(){
                final androidx.fragment.app.f c0;
                final Fragment d0;
                final boolean e0;
                final ax.W2.j q;
                {
                    this.q = j8;
                    this.c0 = f8;
                    this.d0 = fragment;
                    this.e0 = bl;
                }

                public void onServiceConnected(ComponentName object, IBinder object2) {
                    if (object2 instanceof d) {
                        object = ((d)((Object)object2)).a();
                        if (!object.w()) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("cmd:");
                            ((StringBuilder)object2).append(this.q.getClass().getName());
                            ((StringBuilder)object2).append(",");
                            ((StringBuilder)object2).append(this.q.p());
                            ((StringBuilder)object2).append(",");
                            ((StringBuilder)object2).append(object.s());
                            object2 = ((StringBuilder)object2).toString();
                            ax.Ha.c.h().f().b("COMMAND SERVICE IS NOT STARTED").g(object2).h();
                            ax.u3.b.g((String)object2);
                        }
                        object.N(this.c0, this.d0, this.q, this.e0);
                        this.c0.unbindService(this);
                        return;
                    }
                    object = new StringBuilder();
                    object.append("Invalid service binder:");
                    object.append(object2.getClass().getName());
                    ax.Q2.d.c("commandconnected", new Exception(object.toString()));
                }

                public void onServiceDisconnected(ComponentName componentName) {
                }
            };
            object.bindService(CommandService.j((Context)object, true), (ServiceConnection)object4, 1);
            return;
        }
        if (!(h8 instanceof ax.W2.B)) {
            object3 = ax.Ha.c.i((Context)object).f().b("START COMMAND SERVICE FOREGROUND").l((Throwable)var1_4);
            object = new StringBuilder();
            ((StringBuilder)object).append("command:");
            ((StringBuilder)object).append(h8.getClass().getName());
            ((ax.Ha.b)object3).g(((StringBuilder)object).toString()).h();
        }
        throw new ax.b3.c((Throwable)var1_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void O() {
        ax.W2.j j8;
        int n8;
        int n9 = 0;
        ArrayList<ax.W2.j> arrayList = this.c;
        if (arrayList == null) return;
        if (arrayList.size() <= 0) return;
        String string = this.getResources().getString(2131952555, new Object[]{this.c.size()});
        arrayList = this.h;
        // MONITORENTER : arrayList
        ArrayList<ax.W2.j> arrayList2 = this.c;
        int n10 = arrayList2.size();
        long l8 = 0L;
        long l9 = 0L;
        for (n8 = 0; n8 < n10; ++n8, l8 += (long)j8.w().u(), l9 += (long)j8.w().t()) {
            j8 = arrayList2.get(n8);
        }
        n8 = l8 == 0L ? n9 : (int)(l9 * 100L / l8);
        arrayList = this.k(string, n8, true);
        try {
            ax.s3.u.j(this.getApplicationContext()).l(100, (Notification)arrayList);
            return;
        }
        catch (NullPointerException nullPointerException) {
            ax.Q2.d.c("update_service_noti", nullPointerException);
            return;
        }
    }

    static /* synthetic */ long f(CommandService commandService, long l8) {
        commandService.n = l8;
        return l8;
    }

    private void g() {
        ax.s3.u.j(this.getApplicationContext()).a(100);
        this.g = 0L;
    }

    public static Intent j(Context context, boolean bl) {
        context = new Intent(context, CommandService.class);
        if (bl) {
            context.setAction("action.start_command");
        }
        return context;
    }

    private Notification k(String string, int n8, boolean bl) {
        return ax.s3.u.j(this.getApplicationContext()).c(this, string, n8, bl);
    }

    public static Intent l(Context context, h h8) {
        context = new Intent(context, CommandService.class);
        if (h8 != null) {
            context.putExtra("extra_command_class", h8.getClass().getName());
            context.putExtra("extra_command_id", h8.e());
        }
        return context;
    }

    private void m() {
        block3: {
            if (!this.m) {
                try {
                    this.startForeground(100, this.k(this.getString(2131952465), 0, false));
                    this.m = true;
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    if (this.o) break block3;
                    int n8 = B.r((Context)this);
                    ax.Ha.b b8 = ax.Ha.c.i((Context)this).f().b("Foreground not allowed : commandservice onbind");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("importance:");
                    stringBuilder.append(n8);
                    stringBuilder.append(",started;");
                    stringBuilder.append(this.k);
                    b8.g(stringBuilder.toString()).h();
                }
            }
        }
    }

    public static CommandService q() {
        return v;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int r(ax.W2.j j8) {
        Object object = this.h;
        synchronized (object) {
            return this.c.indexOf(j8);
        }
    }

    public static boolean x(f f8) {
        CommandService commandService = CommandService.q();
        if (commandService != null) {
            return commandService.u(f8);
        }
        return false;
    }

    public static boolean y(K k8) {
        CommandService commandService = CommandService.q();
        if (commandService != null) {
            return commandService.v(k8);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void z(ax.W2.j object, boolean bl) {
        y y8;
        Object object2 = this.a.get(object);
        if (object2 != null) {
            y8 = ((c)object2).c(true);
            object2 = ((c)object2).c(false);
        } else {
            ax.Ha.c.h().d("COMS4").j().g(((ax.W2.j)object).B()).h();
            y8 = null;
            object2 = null;
        }
        Object object3 = this.h;
        synchronized (object3) {
            this.c.remove(object);
        }
        this.a.remove(object);
        if (bl) {
            if (y8 != null) {
                y8.y3((ax.W2.j)object);
            }
            if (object2 != null) {
                ((y)object2).y3((ax.W2.j)object);
            }
        } else {
            if (y8 != null) {
                if (y8.e1()) {
                    y8.N2();
                } else {
                    y8.D3(true);
                }
            }
            if (object2 != null) {
                if (((Fragment)object2).e1()) {
                    ((e)object2).N2();
                } else {
                    ((y)object2).D3(true);
                }
            }
        }
        if ((object = this.b) != null) {
            ((FileProgressActivity)object).U();
        }
    }

    public void A(ax.W2.j j8) {
        this.z(j8, false);
    }

    public void B(ax.W2.j j8) {
        this.z(j8, true);
    }

    public void C(ax.W2.j j8) {
        y y8;
        Object object = this.a.get(j8);
        if (object != null) {
            y8 = ((c)object).c(true);
            object = ((c)object).c(false);
        } else {
            ax.Ha.c.h().d("COMS1:").j().g(j8.B()).h();
            y8 = null;
            object = null;
        }
        if (y8 != null) {
            y8.z3(j8);
        }
        if (object != null) {
            ((y)object).z3(j8);
        }
    }

    public void D(ax.W2.j object) {
        y y8;
        Object object2 = this.a.get(object);
        if (object2 != null) {
            y8 = ((c)object2).c(true);
            object2 = ((c)object2).c(false);
        } else {
            ax.Ha.c.h().d("COMS2:").j().g(((ax.W2.j)object).B()).h();
            y8 = null;
            object2 = null;
        }
        if (y8 != null) {
            y8.A3((ax.W2.j)object);
        }
        if (object2 != null) {
            ((y)object2).A3((ax.W2.j)object);
        }
        if ((object = this.b) != null) {
            ((FileProgressActivity)object).U();
        }
        this.O();
    }

    public void E(ax.W2.j j8, boolean bl) {
        y y8;
        Object object = this.a.get(j8);
        if (object != null) {
            y8 = ((c)object).c(true);
            object = ((c)object).c(false);
        } else {
            ax.Ha.c.h().d("COMS3").j().g(j8.B()).h();
            y8 = null;
            object = null;
        }
        if (y8 != null) {
            y8.B3(j8, bl);
        }
        if (object != null) {
            ((y)object).B3(j8, bl);
        }
        if ((object = this.b) != null) {
            ((FileProgressActivity)object).V(j8, this.r(j8), bl);
        }
        long l8 = SystemClock.uptimeMillis();
        if (!bl && l8 - this.g <= 2000L) {
            return;
        }
        this.g = l8;
        this.O();
    }

    public void F(long l8) {
        this.n = l8;
        Runnable runnable2 = this.p;
        if (runnable2 != null) {
            this.r.removeCallbacks(runnable2);
        }
        this.p = runnable2 = new Runnable(){
            final CommandService c0;
            final long q;
            {
                this.c0 = commandService;
                this.q = l8;
            }

            @Override
            public void run() {
                if (!this.c0.k) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("current service null=");
                    Object object = v;
                    boolean bl = false;
                    boolean bl2 = object == null;
                    stringBuilder.append(bl2);
                    stringBuilder.append(",diff=");
                    bl2 = v != this.c0;
                    stringBuilder.append(bl2);
                    stringBuilder.append(",this service destroyed=");
                    stringBuilder.append(this.c0.l);
                    stringBuilder.append(",not started?");
                    bl2 = t < this.q;
                    stringBuilder.append(bl2);
                    stringBuilder.append(":");
                    bl2 = bl;
                    if (t > this.q) {
                        bl2 = true;
                    }
                    stringBuilder.append(bl2);
                    object = stringBuilder.toString();
                    ax.Ha.c.h().f().b("!!! PENDING CHECK NOT STARTED !!!").g(object).h();
                    CommandService.f(this.c0, 0L);
                    return;
                }
                if (this.c0.l) {
                    ax.u3.b.g("CommandService started but destroyed");
                    return;
                }
                if (this.c0.n == this.q) {
                    CommandService.f(this.c0, 0L);
                    this.c0.h();
                }
            }
        };
        this.r.postDelayed(runnable2, 30000L);
    }

    public void G(ax.R2.a object) {
        Object object2;
        ArrayList<ax.W2.j> arrayList = new ArrayList<ax.W2.j>(this.d);
        this.d.clear();
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            object2 = arrayList.get(n9);
            ++n9;
            Object object3 = this.a.get(object2);
            if (object3 != null) {
                if (((c)object3).b() != null) {
                    this.L((ax.R2.a)object, (ax.W2.j)object2, ((c)object3).b());
                    ((c)object3).e(null);
                    continue;
                }
                object3 = ax.Ha.c.h().f().b("NULL PENDING DIALOG");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("command op:");
                stringBuilder.append(object2.getClass().getName());
                ((ax.Ha.b)object3).g(stringBuilder.toString()).h();
                continue;
            }
            if (object2 != null) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("op:");
                ((StringBuilder)object3).append(((ax.W2.j)object2).B());
                object2 = ((StringBuilder)object3).toString();
            } else {
                object2 = "null op";
            }
            ax.Ha.c.h().f().b("NULL PENDING OPERATOR").g(object2).h();
        }
        if (this.d.size() > 0) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("statesaved:");
            ((StringBuilder)object2).append(object.n());
            object = ((StringBuilder)object2).toString();
            ax.Ha.c.h().b("Command Operator repended!?").j().g(object).h();
        }
    }

    public void H(FileProgressActivity fileProgressActivity) {
        if (this.b == fileProgressActivity) {
            this.b = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void I(ax.R2.a object, ax.W2.j j8, boolean bl) {
        c c8 = this.a.get(j8);
        try {
            FragmentManager fragmentManager = object.s().getSupportFragmentManager();
            if (fragmentManager.I0()) return;
            if (object.n()) return;
            if (j8.z() != j.d.d0) return;
            object = y.x3();
            B.d0(fragmentManager, (e)object, "fileProgress", true);
            ((y)object).z3(j8);
            ((y)object).A3(j8);
            if (bl) {
                c8.f(true, (y)object);
                return;
            }
            c8.f(false, (y)object);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
    }

    public void J(FileProgressActivity fileProgressActivity) {
        this.b = fileProgressActivity;
    }

    public void K(ax.W2.j j8, j j9) {
        this.L(null, j8, j9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void N(androidx.fragment.app.f object, Fragment fragment, ax.W2.j object2, boolean bl) {
        block19: {
            if (((ax.W2.j)object2).T()) {
                ax.Ha.c.h().d("COMMAND SERVICE OPERATOR START TWICE!!!!").g(object2.getClass().getSimpleName()).h();
                return;
            }
            long l8 = ((ax.W2.j)object2).p();
            if (l8 >= this.n) {
                this.i();
            }
            t = l8;
            boolean bl2 = object instanceof ax.R2.a;
            y y8 = null;
            if (bl2) {
                object = (ax.R2.a)object;
            } else {
                if (object != null) {
                    ax.Ha.c.h().d("START OPERATOR FROM UNKNOWN ACTIVITY").g(object.getClass().getName()).h();
                }
                object = null;
            }
            boolean bl3 = object != null && bl;
            if (bl3) {
                y8 = y.x3();
            }
            Iterator<K> iterator = this.h;
            synchronized (iterator) {
                this.c.add((ax.W2.j)object2);
            }
            c c8 = new c((ax.R2.a)object, y8);
            this.a.put((ax.W2.j)object2, c8);
            if (!this.j.b()) {
                iterator = ((ax.W2.j)object2).y().iterator();
                while (iterator.hasNext()) {
                    if (!ax.Q2.f.n0(iterator.next().d())) continue;
                    this.j.a();
                    break;
                }
            }
            ((ax.W2.j)object2).p0(this);
            ((ax.W2.j)object2).u0(this.i);
            if (bl3) {
                IllegalStateException illegalStateException2;
                block20: {
                    block18: {
                        try {
                            object2 = object.s().getSupportFragmentManager();
                            if (((FragmentManager)object2).I0()) break block18;
                            if (!object.n()) {
                                B.d0((FragmentManager)object2, y8, "fileProgress", true);
                            }
                            break block19;
                        }
                        catch (IllegalStateException illegalStateException2) {
                            break block20;
                        }
                    }
                    c8.d(y8);
                    break block19;
                }
                c8.d(y8);
                object = object2 = "";
                if (fragment != null) {
                    object = object2;
                    if (fragment instanceof n) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("ActiveState :");
                        ((StringBuilder)object).append(((n)fragment).L3());
                        object = ((StringBuilder)object).toString();
                    }
                }
                ax.Ha.c.h().d("STARTOP").l(illegalStateException2).g(object).h();
            }
        }
        if ((object = this.b) != null) {
            ((FileProgressActivity)object).U();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h() {
        Object object = this.h;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block6: {
                    block3: {
                        block4: {
                            try {
                                if (this.c.size() != 0 || this.n != 0L) break block3;
                                FileProgressActivity fileProgressActivity = this.b;
                                if (fileProgressActivity == null || fileProgressActivity.isFinishing()) break block4;
                                this.b.finish();
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        this.stopForeground(true);
                        this.m = false;
                        this.g();
                        this.stopSelf();
                        this.k = false;
                        break block6;
                    }
                    this.O();
                }
                return;
            }
            throw throwable2;
        }
    }

    public void i() {
        this.n = 0L;
        this.r.removeCallbacks(this.p);
    }

    public List<ax.W2.j> n() {
        return this.c;
    }

    public List<ax.W2.j> o(K k8) {
        return this.p(k8, -1);
    }

    public IBinder onBind(Intent intent) {
        if (intent != null && "action.start_command".equals(intent.getAction())) {
            this.m();
        }
        return this.e;
    }

    public void onCreate() {
        this.c = new ArrayList();
        this.a = new HashMap();
        this.d = new ArrayList();
        this.f = C.a((Context)this, 0L, "CommandService");
        v = this;
        this.i = Thread.currentThread();
        this.j = new D((Context)this, 3, "COMMAND_SERVICE");
        this.q = System.currentTimeMillis();
    }

    public void onDestroy() {
        C.d(this.f);
        this.j.c();
        super.onDestroy();
        v = null;
        this.l = true;
    }

    public void onRebind(Intent intent) {
        if (intent != null && "action.start_command".equals(intent.getAction())) {
            this.m();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int onStartCommand(Intent object, int n8, int n9) {
        block5: {
            if (object != null) {
                long l8;
                block4: {
                    try {
                        l8 = object.getLongExtra("extra_command_id", -1L);
                        if (l8 > t) break block4;
                        String string = object.getStringExtra("extra_command_class");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("command cls:");
                        stringBuilder.append(string);
                        stringBuilder.append(",id:");
                        stringBuilder.append(l8);
                        stringBuilder.append(",lastop:");
                        stringBuilder.append(t);
                        stringBuilder.append(",lastsvc:");
                        stringBuilder.append(u);
                        Exception exception = new Exception(stringBuilder.toString());
                        ax.Q2.d.c("CommandServiceStartLater", exception);
                    }
                    catch (IllegalStateException illegalStateException) {
                        break block5;
                    }
                }
                u = l8;
            }
            this.o = false;
            this.k = true;
            this.startForeground(100, this.k(this.getString(2131952465), 0, false));
            this.m = true;
            return 2;
        }
        String string = object.getStringExtra("extra_command_class");
        if (string != null && string.equals(ax.W2.B.class.getName())) {
            this.o = true;
            return 2;
        }
        ax.Ha.b b8 = ax.Ha.c.i((Context)this).f().b("Foreground not allowed : command service");
        object = new StringBuilder();
        ((StringBuilder)object).append("command class:");
        ((StringBuilder)object).append(string);
        b8.g(((StringBuilder)object).toString()).h();
        return 2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onTimeout(int var1_1, int var2_2) {
        block12: {
            block10: {
                block9: {
                    super.onTimeout(var1_1, var2_2);
                    var1_1 = 1;
                    ax.o3.a.a(this, 1);
                    if (this.c == null) break block10;
                    var5_3 = new StringBuilder();
                    var4_5 = this.h;
                    synchronized (var4_5) {
                        block8: {
                            try {
                                var6_6 = this.c;
                                var3_7 = var6_6.size();
                                var2_2 = 0;
lbl12:
                                // 2 sources

                                while (var2_2 < var3_7) {
                                    var7_8 = var6_6.get(var2_2);
                                    ++var2_2;
                                    break block8;
                                }
                                break block9;
                            }
                            catch (Throwable var5_4) {
                                ** break block11
                            }
                        }
                        if (var1_1 != 0) {
                            var1_1 = 0;
                        } else {
                            var5_3.append(",");
                        }
                        var5_3.append(var7_8.B());
                        ** GOTO lbl12
                    }
                }
                var4_5 = var5_3.toString();
                break block12;
lbl-1000:
                // 1 sources

                {
                    throw var5_4;
                }
            }
            var4_5 = "null";
        }
        var5_3 = new StringBuilder();
        var5_3.append("CommandServiceTimeout : ");
        var5_3.append((String)var4_5);
        var5_3.append(":");
        var5_3.append(System.currentTimeMillis() - this.q);
        ax.Q2.d.c("Command service timeout", new Exception(var5_3.toString()));
    }

    public boolean onUnbind(Intent intent) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<ax.W2.j> p(K k8, int n8) {
        ArrayList<ax.W2.j> arrayList = new ArrayList<ax.W2.j>();
        Object object = this.h;
        synchronized (object) {
            int n9;
            int n10;
            ArrayList<ax.W2.j> arrayList2;
            try {
                arrayList2 = this.c;
                n10 = arrayList2.size();
                n9 = 0;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (n9 < n10) {
                ax.W2.j j8 = arrayList2.get(n9);
                int n11 = n9 + 1;
                if (n8 != -1) {
                    n9 = n11;
                    if (j8.B() != n8) continue;
                }
                n9 = n11;
                if (!j8.y().contains(k8)) continue;
                arrayList.add(j8);
                n9 = n11;
            }
            return arrayList;
        }
    }

    public long s() {
        return this.n;
    }

    public boolean t() {
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean u(f f8) {
        Object object = this.h;
        synchronized (object) {
            try {
                ArrayList<ax.W2.j> arrayList = this.c;
                int n8 = arrayList.size();
                int n9 = 0;
                block3: while (true) {
                    if (n9 >= n8) {
                        return false;
                    }
                    Object object2 = arrayList.get(n9);
                    int n10 = n9 + 1;
                    object2 = ((ax.W2.j)object2).y().iterator();
                    do {
                        n9 = n10;
                        if (!object2.hasNext()) continue block3;
                    } while (((K)object2.next()).d() != f8);
                    break;
                }
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean v(K k8) {
        Object object = this.h;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    ArrayList<ax.W2.j> arrayList = this.c;
                    int n8 = arrayList.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        ax.W2.j j8 = arrayList.get(i8);
                        if (!j8.y().contains(k8)) continue;
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public boolean w() {
        return this.k;
    }

    static class c {
        y a;
        y b;
        ax.R2.a c;
        j d;

        public c(ax.R2.a a8, y y8) {
            this.c = a8;
            this.a = y8;
        }

        public ax.R2.a a() {
            return this.c;
        }

        public j b() {
            return this.d;
        }

        public y c(boolean bl) {
            if (bl) {
                return this.a;
            }
            return this.b;
        }

        public void d(y y8) {
            if (this.a == y8) {
                this.a = null;
            }
            if (this.b == y8) {
                this.b = null;
            }
        }

        public void e(j j8) {
            this.d = j8;
        }

        public void f(boolean bl, y y8) {
            if (bl) {
                this.a = y8;
                return;
            }
            this.b = y8;
        }
    }

    public class d
    extends Binder {
        final CommandService e;

        public d(CommandService commandService) {
            this.e = commandService;
        }

        public CommandService a() {
            return this.e;
        }
    }
}

