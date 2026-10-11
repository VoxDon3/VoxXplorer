package ax.k2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import ax.k2.C2384o;
import ax.k2.C2387r;
import ax.k2.InterfaceC2379j;
import ax.k2.InterfaceC2380k;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.k2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2387r {
    private final String a;
    private final C2384o b;
    private final Executor c;
    private final Context d;
    private int e;
    public C2384o.c f;
    private InterfaceC2380k g;
    private final InterfaceC2379j h;
    private final AtomicBoolean i;
    private final ServiceConnection j;
    private final Runnable k;
    private final Runnable l;

    /* renamed from: ax.k2.r$a */
    public static final class a extends C2384o.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // ax.k2.C2384o.c
        public boolean b() {
            return true;
        }

        @Override // ax.k2.C2384o.c
        public void c(Set<String> set) {
            ax.Gb.l.f(set, "tables");
            if (C2387r.this.j().get()) {
                return;
            }
            try {
                InterfaceC2380k h = C2387r.this.h();
                if (h != null) {
                    int c = C2387r.this.c();
                    Object[] array = set.toArray(new String[0]);
                    ax.Gb.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    h.N1(c, (String[]) array);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    /* renamed from: ax.k2.r$b */
    public static final class b extends InterfaceC2379j.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(C2387r c2387r, String[] strArr) {
            ax.Gb.l.f(c2387r, "this$0");
            ax.Gb.l.f(strArr, "$tables");
            c2387r.e().j((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // ax.k2.InterfaceC2379j
        public void b0(final String[] strArr) {
            ax.Gb.l.f(strArr, "tables");
            Executor d = C2387r.this.d();
            final C2387r c2387r = C2387r.this;
            d.execute(new Runnable() { // from class: ax.k2.s
                @Override // java.lang.Runnable
                public final void run() {
                    C2387r.b.B(C2387r.this, strArr);
                }
            });
        }
    }

    /* renamed from: ax.k2.r$c */
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ax.Gb.l.f(componentName, "name");
            ax.Gb.l.f(iBinder, "service");
            C2387r.this.m(InterfaceC2380k.a.r(iBinder));
            C2387r.this.d().execute(C2387r.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ax.Gb.l.f(componentName, "name");
            C2387r.this.d().execute(C2387r.this.g());
            C2387r.this.m(null);
        }
    }

    public C2387r(Context context, String str, Intent intent, C2384o c2384o, Executor executor) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(str, "name");
        ax.Gb.l.f(intent, "serviceIntent");
        ax.Gb.l.f(c2384o, "invalidationTracker");
        ax.Gb.l.f(executor, "executor");
        this.a = str;
        this.b = c2384o;
        this.c = executor;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.h = new b();
        this.i = new AtomicBoolean(false);
        c cVar = new c();
        this.j = cVar;
        this.k = new Runnable() { // from class: ax.k2.p
            @Override // java.lang.Runnable
            public final void run() {
                C2387r.n(C2387r.this);
            }
        };
        this.l = new Runnable() { // from class: ax.k2.q
            @Override // java.lang.Runnable
            public final void run() {
                C2387r.k(C2387r.this);
            }
        };
        Object[] array = c2384o.h().keySet().toArray(new String[0]);
        ax.Gb.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a((String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(C2387r c2387r) {
        ax.Gb.l.f(c2387r, "this$0");
        c2387r.b.m(c2387r.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(C2387r c2387r) {
        ax.Gb.l.f(c2387r, "this$0");
        try {
            InterfaceC2380k interfaceC2380k = c2387r.g;
            if (interfaceC2380k != null) {
                c2387r.e = interfaceC2380k.E(c2387r.h, c2387r.a);
                c2387r.b.b(c2387r.f());
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    public final int c() {
        return this.e;
    }

    public final Executor d() {
        return this.c;
    }

    public final C2384o e() {
        return this.b;
    }

    public final C2384o.c f() {
        C2384o.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        ax.Gb.l.t("observer");
        return null;
    }

    public final Runnable g() {
        return this.l;
    }

    public final InterfaceC2380k h() {
        return this.g;
    }

    public final Runnable i() {
        return this.k;
    }

    public final AtomicBoolean j() {
        return this.i;
    }

    public final void l(C2384o.c cVar) {
        ax.Gb.l.f(cVar, "<set-?>");
        this.f = cVar;
    }

    public final void m(InterfaceC2380k interfaceC2380k) {
        this.g = interfaceC2380k;
    }
}
