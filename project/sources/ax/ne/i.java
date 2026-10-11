package ax.ne;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import ax.bc.InterfaceC1729a;
import ax.bc.InterfaceC1730b;
import ax.ne.i;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class i {
    private static IBinder a = null;
    private static InterfaceC1730b b = null;
    private static int c = -1;
    private static int d = -1;
    private static int e = -1;
    private static String f = null;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static final InterfaceC1729a k = new a();
    private static final IBinder.DeathRecipient l = new IBinder.DeathRecipient() { // from class: ax.ne.c
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            i.b();
        }
    };
    private static final List<b<d>> m = new ArrayList();
    private static final List<b<c>> n = new ArrayList();
    private static final List<b<e>> o = new ArrayList();
    private static final Handler p = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    static class b<T> {
        private final T a;
        private final Handler b;

        /* synthetic */ b(Object obj, Handler handler, a aVar) {
            this(obj, handler);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                if (Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        private b(T t, Handler handler) {
            this.a = t;
            this.b = handler;
        }
    }

    public interface c {
        void a();
    }

    public interface d {
        void a();
    }

    public interface e {
        void a(int i, int i2);
    }

    public static class f {
        final ComponentName a;
        String c;
        String d;
        int b = 1;
        boolean e = false;
        boolean f = true;
        boolean g = false;

        public f(ComponentName componentName) {
            this.a = componentName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", this.a);
            bundle.putBoolean("shizuku:user-service-arg-debuggable", this.e);
            bundle.putInt("shizuku:user-service-arg-version-code", this.b);
            bundle.putBoolean("shizuku:user-service-arg-daemon", this.f);
            bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", this.g);
            String str = this.c;
            Objects.requireNonNull(str, "process name suffix must not be null");
            bundle.putString("shizuku:user-service-arg-process-name", str);
            String str2 = this.d;
            if (str2 != null) {
                bundle.putString("shizuku:user-service-arg-tag", str2);
            }
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Bundle f(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", this.a);
            String str = this.d;
            if (str != null) {
                bundle.putString("shizuku:user-service-arg-tag", str);
            }
            bundle.putBoolean("shizuku:user-service-remove", z);
            return bundle;
        }

        public f c(boolean z) {
            this.f = z;
            return this;
        }

        public f d(boolean z) {
            this.e = z;
            return this;
        }

        public f g(String str) {
            this.c = str;
            return this;
        }

        public f h(int i) {
            this.b = i;
            return this;
        }
    }

    public static int A() {
        return e;
    }

    public static int B() {
        int i2 = c;
        if (i2 != -1) {
            return i2;
        }
        try {
            int q = K().q();
            c = q;
            return q;
        } catch (RemoteException e2) {
            throw L(e2);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    public static int C() {
        int i2 = d;
        if (i2 != -1) {
            return i2;
        }
        try {
            int P1 = K().P1();
            d = P1;
            return P1;
        } catch (RemoteException e2) {
            throw L(e2);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    public static boolean D() {
        return i;
    }

    public static void E(IBinder iBinder, String str) {
        IBinder iBinder2 = a;
        if (iBinder2 == iBinder) {
            return;
        }
        if (iBinder == null) {
            a = null;
            b = null;
            c = -1;
            d = -1;
            f = null;
            M();
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(l, 0);
        }
        a = iBinder;
        b = InterfaceC1730b.a.r(iBinder);
        try {
            a.linkToDeath(l, 0);
        } catch (Throwable unused) {
            Log.i("ShizukuApplication", "attachApplication");
        }
        try {
            if (!w(a, str) && !v(a, str)) {
                i = true;
            }
            Log.i("ShizukuApplication", "attachApplication");
        } catch (Throwable th) {
            Log.w("ShizukuApplication", Log.getStackTraceString(th));
        }
        if (i) {
            j = true;
            N();
        }
    }

    public static boolean F() {
        IBinder iBinder = a;
        return iBinder != null && iBinder.pingBinder();
    }

    public static boolean G(final c cVar) {
        boolean removeIf;
        synchronized (m) {
            removeIf = Collection.EL.removeIf(n, new Predicate() { // from class: ax.ne.b
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return i.f(i.c.this, (i.b) obj);
                }
            });
        }
        return removeIf;
    }

    public static boolean H(final d dVar) {
        boolean removeIf;
        List<b<d>> list = m;
        synchronized (list) {
            removeIf = Collection.EL.removeIf(list, new Predicate() { // from class: ax.ne.f
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return i.a(i.d.this, (i.b) obj);
                }
            });
        }
        return removeIf;
    }

    public static boolean I(final e eVar) {
        boolean removeIf;
        synchronized (m) {
            removeIf = Collection.EL.removeIf(o, new Predicate() { // from class: ax.ne.e
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return i.c(i.e.this, (i.b) obj);
                }
            });
        }
        return removeIf;
    }

    public static void J(int i2) {
        try {
            K().i1(i2);
        } catch (RemoteException e2) {
            throw L(e2);
        }
    }

    protected static InterfaceC1730b K() {
        InterfaceC1730b interfaceC1730b = b;
        if (interfaceC1730b != null) {
            return interfaceC1730b;
        }
        throw new IllegalStateException("binder haven't been received");
    }

    private static RuntimeException L(RemoteException remoteException) {
        return new RuntimeException(remoteException);
    }

    private static void M() {
        synchronized (m) {
            try {
                for (b<c> bVar : n) {
                    if (((b) bVar).b != null) {
                        Handler handler = ((b) bVar).b;
                        final c cVar = (c) ((b) bVar).a;
                        Objects.requireNonNull(cVar);
                        handler.post(new Runnable() { // from class: ax.ne.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                i.c.this.a();
                            }
                        });
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((c) ((b) bVar).a).a();
                    } else {
                        Handler handler2 = p;
                        final c cVar2 = (c) ((b) bVar).a;
                        Objects.requireNonNull(cVar2);
                        handler2.post(new Runnable() { // from class: ax.ne.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                i.c.this.a();
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N() {
        List<b<d>> list = m;
        synchronized (list) {
            try {
                for (b<d> bVar : list) {
                    if (((b) bVar).b != null) {
                        Handler handler = ((b) bVar).b;
                        d dVar = (d) ((b) bVar).a;
                        Objects.requireNonNull(dVar);
                        handler.post(new ax.ne.a(dVar));
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((d) ((b) bVar).a).a();
                    } else {
                        Handler handler2 = p;
                        d dVar2 = (d) ((b) bVar).a;
                        Objects.requireNonNull(dVar2);
                        handler2.post(new ax.ne.a(dVar2));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(final int i2, final int i3) {
        synchronized (m) {
            try {
                for (final b<e> bVar : o) {
                    if (((b) bVar).b != null) {
                        ((b) bVar).b.post(new Runnable() { // from class: ax.ne.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((i.e) i.b.this.a).a(i2, i3);
                            }
                        });
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((e) ((b) bVar).a).a(i2, i3);
                    } else {
                        p.post(new Runnable() { // from class: ax.ne.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((i.e) i.b.this.a).a(i2, i3);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean P() {
        if (g) {
            return false;
        }
        if (h) {
            return true;
        }
        try {
            boolean N0 = K().N0();
            h = N0;
            return N0;
        } catch (RemoteException e2) {
            throw L(e2);
        }
    }

    public static void Q(f fVar, ServiceConnection serviceConnection, boolean z) {
        if (z) {
            try {
                K().r1(null, fVar.f(true));
                return;
            } catch (RemoteException e2) {
                throw L(e2);
            }
        }
        m a2 = n.a(fVar);
        if (C() >= 14 || (C() == 13 && A() >= 4)) {
            try {
                K().r1(a2, fVar.f(false));
            } catch (RemoteException e3) {
                throw L(e3);
            }
        }
        a2.a2();
        n.b(a2);
    }

    public static /* synthetic */ boolean a(d dVar, b bVar) {
        return bVar.a == dVar;
    }

    public static /* synthetic */ void b() {
        j = false;
        E(null, null);
    }

    public static /* synthetic */ boolean c(e eVar, b bVar) {
        return bVar.a == eVar;
    }

    public static /* synthetic */ boolean f(c cVar, b bVar) {
        return bVar.a == cVar;
    }

    public static void o(c cVar) {
        p(cVar, null);
    }

    public static void p(c cVar, Handler handler) {
        synchronized (m) {
            n.add(new b<>(cVar, handler, null));
        }
    }

    private static void q(d dVar, boolean z, Handler handler) {
        if (z && j) {
            if (handler != null) {
                Objects.requireNonNull(dVar);
                handler.post(new ax.ne.a(dVar));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                dVar.a();
            } else {
                Handler handler2 = p;
                Objects.requireNonNull(dVar);
                handler2.post(new ax.ne.a(dVar));
            }
        }
        List<b<d>> list = m;
        synchronized (list) {
            list.add(new b<>(dVar, handler, null));
        }
    }

    public static void r(d dVar) {
        Objects.requireNonNull(dVar);
        s(dVar, null);
    }

    public static void s(d dVar, Handler handler) {
        Objects.requireNonNull(dVar);
        q(dVar, true, handler);
    }

    public static void t(e eVar) {
        u(eVar, null);
    }

    public static void u(e eVar, Handler handler) {
        synchronized (m) {
            o.add(new b<>(eVar, handler, null));
        }
    }

    private static boolean v(IBinder iBinder, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            obtain.writeStrongBinder(k.asBinder());
            obtain.writeString(str);
            boolean transact = iBinder.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return transact;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    private static boolean w(IBinder iBinder, String str) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", str);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            obtain.writeStrongBinder(k.asBinder());
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            boolean transact = iBinder.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            return transact;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void x(f fVar, ServiceConnection serviceConnection) {
        m a2 = n.a(fVar);
        a2.B(serviceConnection);
        try {
            K().q1(a2, fVar.e());
        } catch (RemoteException e2) {
            throw L(e2);
        }
    }

    public static int y() {
        if (g) {
            return 0;
        }
        try {
            boolean H1 = K().H1();
            g = H1;
            return H1 ? 0 : -1;
        } catch (RemoteException e2) {
            throw L(e2);
        }
    }

    public static IBinder z() {
        return a;
    }

    class a extends InterfaceC1729a.AbstractBinderC0262a {
        a() {
        }

        @Override // ax.bc.InterfaceC1729a
        public void Q(int i, Bundle bundle) {
            i.O(i, bundle.getBoolean("shizuku:request-permission-reply-allowed", false) ? 0 : -1);
        }

        @Override // ax.bc.InterfaceC1729a
        public void e0(Bundle bundle) {
            int unused = i.c = bundle.getInt("shizuku:attach-reply-uid", -1);
            int unused2 = i.d = bundle.getInt("shizuku:attach-reply-version", -1);
            int unused3 = i.e = bundle.getInt("shizuku:attach-reply-patch-version", -1);
            String unused4 = i.f = bundle.getString("shizuku:attach-reply-secontext");
            boolean unused5 = i.g = bundle.getBoolean("shizuku:attach-reply-permission-granted", false);
            boolean unused6 = i.h = bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false);
            i.N();
        }

        @Override // ax.bc.InterfaceC1729a
        public void D(int i, int i2, String str, int i3) {
        }
    }
}
