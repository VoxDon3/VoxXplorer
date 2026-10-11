/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import ax.Gb.l;
import ax.k2.j;
import ax.k2.k;
import ax.k2.o;
import ax.k2.p;
import ax.k2.q;
import ax.k2.s;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class r {
    private final String a;
    private final o b;
    private final Executor c;
    private final Context d;
    private int e;
    public o.c f;
    private k g;
    private final j h;
    private final AtomicBoolean i;
    private final ServiceConnection j;
    private final Runnable k;
    private final Runnable l;

    public r(Context object, String string, Intent intent, o stringArray, Executor executor) {
        ax.Gb.l.f(object, "context");
        ax.Gb.l.f(string, "name");
        ax.Gb.l.f(intent, "serviceIntent");
        ax.Gb.l.f(stringArray, "invalidationTracker");
        ax.Gb.l.f(executor, "executor");
        this.a = string;
        this.b = stringArray;
        this.c = executor;
        string = object.getApplicationContext();
        this.d = string;
        this.h = new j.a(this){
            final r e;
            {
                this.e = r8;
            }

            private static final void B(r r8, String[] stringArray) {
                ax.Gb.l.f(r8, "this$0");
                ax.Gb.l.f(stringArray, "$tables");
                r8.e().j(Arrays.copyOf(stringArray, stringArray.length));
            }

            public static /* synthetic */ void w(r r8, String[] stringArray) {
                ax.k2.r$b.B(r8, stringArray);
            }

            @Override
            public void b0(String[] stringArray) {
                ax.Gb.l.f(stringArray, "tables");
                this.e.d().execute(new s(this.e, stringArray));
            }
        };
        this.i = new AtomicBoolean(false);
        object = new ServiceConnection(this){
            final r q;
            {
                this.q = r8;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                ax.Gb.l.f(componentName, "name");
                ax.Gb.l.f(iBinder, "service");
                this.q.m(k.a.r(iBinder));
                this.q.d().execute(this.q.i());
            }

            public void onServiceDisconnected(ComponentName componentName) {
                ax.Gb.l.f(componentName, "name");
                this.q.d().execute(this.q.g());
                this.q.m(null);
            }
        };
        this.j = object;
        this.k = new p(this);
        this.l = new q(this);
        stringArray = stringArray.h().keySet().toArray(new String[0]);
        ax.Gb.l.d(stringArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.l(new o.c(this, stringArray){
            final r b;
            {
                this.b = r8;
                super(stringArray);
            }

            @Override
            public boolean b() {
                return true;
            }

            @Override
            public void c(Set<String> stringArray) {
                block4: {
                    ax.Gb.l.f(stringArray, "tables");
                    if (!this.b.j().get()) {
                        k k8 = this.b.h();
                        if (k8 == null) break block4;
                        try {
                            int n8 = this.b.c();
                            stringArray = stringArray.toArray(new String[0]);
                            ax.Gb.l.d(stringArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            k8.N1(n8, stringArray);
                            return;
                        }
                        catch (RemoteException remoteException) {
                            Log.w((String)"ROOM", (String)"Cannot broadcast invalidation", (Throwable)remoteException);
                        }
                    }
                }
            }
        });
        string.bindService(intent, (ServiceConnection)object, 1);
    }

    public static /* synthetic */ void a(r r8) {
        r.k(r8);
    }

    public static /* synthetic */ void b(r r8) {
        r.n(r8);
    }

    private static final void k(r r8) {
        ax.Gb.l.f(r8, "this$0");
        r8.b.m(r8.f());
    }

    private static final void n(r r8) {
        block3: {
            ax.Gb.l.f(r8, "this$0");
            k k8 = r8.g;
            if (k8 == null) break block3;
            try {
                r8.e = k8.E(r8.h, r8.a);
                r8.b.b(r8.f());
                return;
            }
            catch (RemoteException remoteException) {
                Log.w((String)"ROOM", (String)"Cannot register multi-instance invalidation callback", (Throwable)remoteException);
            }
        }
    }

    public final int c() {
        return this.e;
    }

    public final Executor d() {
        return this.c;
    }

    public final o e() {
        return this.b;
    }

    public final o.c f() {
        o.c c8 = this.f;
        if (c8 != null) {
            return c8;
        }
        ax.Gb.l.t("observer");
        return null;
    }

    public final Runnable g() {
        return this.l;
    }

    public final k h() {
        return this.g;
    }

    public final Runnable i() {
        return this.k;
    }

    public final AtomicBoolean j() {
        return this.i;
    }

    public final void l(o.c c8) {
        ax.Gb.l.f(c8, "<set-?>");
        this.f = c8;
    }

    public final void m(k k8) {
        this.g = k8;
    }
}

