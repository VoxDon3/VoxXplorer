/*
 * Decompiled with CFR 0.152.
 */
package ax.ne;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import ax.bc.a;
import ax.bc.b;
import ax.ne.a;
import ax.ne.g;
import ax.ne.h;
import ax.ne.m;
import ax.ne.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class i {
    private static IBinder a;
    private static ax.bc.b b;
    private static int c = -1;
    private static int d = -1;
    private static int e = -1;
    private static String f;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static final ax.bc.a k;
    private static final IBinder.DeathRecipient l;
    private static final List<b<d>> m;
    private static final List<b<c>> n;
    private static final List<b<e>> o;
    private static final Handler p;

    static {
        k = new a.a(){

            @Override
            public void D(int n8, int n9, String string, int n10) {
            }

            @Override
            public void Q(int n8, Bundle bundle) {
                int n9 = 0;
                if (!bundle.getBoolean("shizuku:request-permission-reply-allowed", false)) {
                    n9 = -1;
                }
                ax.ne.i.O(n8, n9);
            }

            @Override
            public void e0(Bundle bundle) {
                ax.ne.i.g(bundle.getInt("shizuku:attach-reply-uid", -1));
                ax.ne.i.h(bundle.getInt("shizuku:attach-reply-version", -1));
                ax.ne.i.i(bundle.getInt("shizuku:attach-reply-patch-version", -1));
                ax.ne.i.j(bundle.getString("shizuku:attach-reply-secontext"));
                ax.ne.i.k(bundle.getBoolean("shizuku:attach-reply-permission-granted", false));
                ax.ne.i.l(bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false));
                ax.ne.i.N();
            }
        };
        l = new ax.ne.c();
        m = new ArrayList<b<d>>();
        n = new ArrayList<b<c>>();
        o = new ArrayList<b<e>>();
        p = new Handler(Looper.getMainLooper());
    }

    public static int A() {
        return e;
    }

    public static int B() {
        int n8 = c;
        if (n8 != -1) {
            return n8;
        }
        try {
            c = n8 = ax.ne.i.K().q();
            return n8;
        }
        catch (SecurityException securityException) {
            return -1;
        }
        catch (RemoteException remoteException) {
            throw ax.ne.i.L(remoteException);
        }
    }

    public static int C() {
        int n8 = d;
        if (n8 != -1) {
            return n8;
        }
        try {
            d = n8 = ax.ne.i.K().P1();
            return n8;
        }
        catch (SecurityException securityException) {
            return -1;
        }
        catch (RemoteException remoteException) {
            throw ax.ne.i.L(remoteException);
        }
    }

    public static boolean D() {
        return i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void E(IBinder iBinder, String string) {
        block9: {
            Throwable throwable3;
            block8: {
                block7: {
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
                        ax.ne.i.M();
                        return;
                    }
                    if (iBinder2 != null) {
                        iBinder2.unlinkToDeath(l, 0);
                    }
                    a = iBinder;
                    b = b.a.r(iBinder);
                    try {
                        a.linkToDeath(l, 0);
                    }
                    catch (Throwable throwable2) {
                        Log.i((String)"ShizukuApplication", (String)"attachApplication");
                    }
                    try {
                        if (ax.ne.i.w(a, string) || ax.ne.i.v(a, string)) break block7;
                        i = true;
                    }
                    catch (Throwable throwable3) {
                        break block8;
                    }
                }
                Log.i((String)"ShizukuApplication", (String)"attachApplication");
                break block9;
            }
            Log.w((String)"ShizukuApplication", (String)Log.getStackTraceString((Throwable)throwable3));
        }
        if (!i) return;
        j = true;
        ax.ne.i.N();
    }

    public static boolean F() {
        IBinder iBinder = a;
        return iBinder != null && iBinder.pingBinder();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean G(c c8) {
        List<b<d>> list = m;
        synchronized (list) {
            List<b<c>> list2 = n;
            ax.ne.b b8 = new ax.ne.b(c8);
            return j.Collection._EL.removeIf(list2, (Predicate)b8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean H(d d8) {
        List<b<d>> list = m;
        synchronized (list) {
            ax.ne.f f8 = new ax.ne.f(d8);
            return j.Collection._EL.removeIf(list, (Predicate)f8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean I(e e8) {
        List<b<d>> list = m;
        synchronized (list) {
            List<b<e>> list2 = o;
            ax.ne.e e9 = new ax.ne.e(e8);
            return j.Collection._EL.removeIf(list2, (Predicate)e9);
        }
    }

    public static void J(int n8) {
        try {
            ax.ne.i.K().i1(n8);
            return;
        }
        catch (RemoteException remoteException) {
            throw ax.ne.i.L(remoteException);
        }
    }

    protected static ax.bc.b K() {
        ax.bc.b b8 = b;
        if (b8 != null) {
            return b8;
        }
        throw new IllegalStateException("binder haven't been received");
    }

    private static RuntimeException L(RemoteException remoteException) {
        return new RuntimeException(remoteException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void M() {
        List<b<d>> list = m;
        synchronized (list) {
            Iterator<b<c>> iterator;
            try {
                iterator = n.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (iterator.hasNext()) {
                Object object;
                Handler handler;
                b<c> b8 = iterator.next();
                if (((b)b8).b != null) {
                    handler = ((b)b8).b;
                    b8 = (c)((b)b8).a;
                    j.Objects.requireNonNull((Object)b8);
                    object = new ax.ne.d((c)((Object)b8));
                    handler.post((Runnable)object);
                    continue;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((c)((b)b8).a).a();
                    continue;
                }
                handler = p;
                object = (c)((b)b8).a;
                j.Objects.requireNonNull((Object)object);
                b8 = new ax.ne.d((c)object);
                handler.post((Runnable)((Object)b8));
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void N() {
        List<b<d>> list = m;
        synchronized (list) {
            try {
                Iterator<b<d>> iterator = list.iterator();
                while (true) {
                    a a8;
                    Handler handler;
                    if (!iterator.hasNext()) {
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 4, 7] lbl7 : MonitorExitStatement: MONITOREXIT : var0
                        j = true;
                        return;
                    }
                    b<d> b8 = iterator.next();
                    if (((b)b8).b != null) {
                        handler = ((b)b8).b;
                        b8 = (d)((b)b8).a;
                        j.Objects.requireNonNull((Object)b8);
                        a8 = new a((d)((Object)b8));
                        handler.post((Runnable)a8);
                        continue;
                    }
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((d)((b)b8).a).a();
                        continue;
                    }
                    handler = p;
                    b8 = (d)((b)b8).a;
                    j.Objects.requireNonNull((Object)b8);
                    a8 = new a((d)((Object)b8));
                    handler.post((Runnable)a8);
                }
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
    private static void O(int n8, int n9) {
        List<b<d>> list = m;
        synchronized (list) {
            Iterator<b<e>> iterator;
            try {
                iterator = o.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (iterator.hasNext()) {
                g g8;
                Object object;
                b<e> b8 = iterator.next();
                if (((b)b8).b != null) {
                    object = ((b)b8).b;
                    g8 = new g(b8, n8, n9);
                    object.post((Runnable)g8);
                    continue;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((e)((b)b8).a).a(n8, n9);
                    continue;
                }
                g8 = p;
                object = new h(b8, n8, n9);
                g8.post((Runnable)object);
            }
            return;
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
            boolean bl;
            h = bl = ax.ne.i.K().N0();
            return bl;
        }
        catch (RemoteException remoteException) {
            throw ax.ne.i.L(remoteException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Q(f f8, ServiceConnection object, boolean bl) {
        if (bl) {
            try {
                ax.ne.i.K().r1(null, f8.f(true));
                return;
            }
            catch (RemoteException remoteException) {
                throw ax.ne.i.L(remoteException);
            }
        }
        object = ax.ne.n.a(f8);
        if (ax.ne.i.C() >= 14 || ax.ne.i.C() == 13 && ax.ne.i.A() >= 4) {
            try {
                ax.ne.i.K().r1((ax.bc.c)object, f8.f(false));
            }
            catch (RemoteException remoteException) {
                throw ax.ne.i.L(remoteException);
            }
        }
        ((m)object).a2();
        ax.ne.n.b((m)object);
    }

    public static /* synthetic */ boolean a(d d8, b b8) {
        return b8.a == d8;
    }

    public static /* synthetic */ void b() {
        j = false;
        ax.ne.i.E(null, null);
    }

    public static /* synthetic */ boolean c(e e8, b b8) {
        return b8.a == e8;
    }

    public static /* synthetic */ void d(b b8, int n8, int n9) {
        ((e)b8.a).a(n8, n9);
    }

    public static /* synthetic */ void e(b b8, int n8, int n9) {
        ((e)b8.a).a(n8, n9);
    }

    public static /* synthetic */ boolean f(c c8, b b8) {
        return b8.a == c8;
    }

    static /* synthetic */ int g(int n8) {
        c = n8;
        return n8;
    }

    static /* synthetic */ int h(int n8) {
        d = n8;
        return n8;
    }

    static /* synthetic */ int i(int n8) {
        e = n8;
        return n8;
    }

    static /* synthetic */ String j(String string) {
        f = string;
        return string;
    }

    static /* synthetic */ boolean k(boolean bl) {
        g = bl;
        return bl;
    }

    static /* synthetic */ boolean l(boolean bl) {
        h = bl;
        return bl;
    }

    public static void o(c c8) {
        ax.ne.i.p(c8, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void p(c c8, Handler handler) {
        List<b<d>> list = m;
        synchronized (list) {
            List<b<c>> list2 = n;
            b b8 = new b(c8, handler);
            list2.add(b8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void q(d d8, boolean bl, Handler handler) {
        Handler handler2;
        if (bl && j) {
            if (handler != null) {
                j.Objects.requireNonNull((Object)d8);
                handler.post((Runnable)new a(d8));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                d8.a();
            } else {
                handler2 = p;
                j.Objects.requireNonNull((Object)d8);
                handler2.post((Runnable)new a(d8));
            }
        }
        handler2 = m;
        synchronized (handler2) {
            b b8 = new b(d8, handler);
            handler2.add(b8);
            return;
        }
    }

    public static void r(d d8) {
        j.Objects.requireNonNull((Object)d8);
        ax.ne.i.s(d8, null);
    }

    public static void s(d d8, Handler handler) {
        j.Objects.requireNonNull((Object)d8);
        ax.ne.i.q(d8, true, handler);
    }

    public static void t(e e8) {
        ax.ne.i.u(e8, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void u(e e8, Handler handler) {
        List<b<d>> list = m;
        synchronized (list) {
            List<b<e>> list2 = o;
            b b8 = new b(e8, handler);
            list2.add(b8);
            return;
        }
    }

    private static boolean v(IBinder iBinder, String string) throws RemoteException {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            parcel.writeStrongBinder(k.asBinder());
            parcel.writeString(string);
            boolean bl = iBinder.transact(14, parcel, parcel2, 0);
            parcel2.readException();
            return bl;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    private static boolean w(IBinder iBinder, String string) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", string);
        string = Parcel.obtain();
        Parcel parcel = Parcel.obtain();
        try {
            string.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            string.writeStrongBinder(k.asBinder());
            string.writeInt(1);
            bundle.writeToParcel((Parcel)string, 0);
            boolean bl = iBinder.transact(18, (Parcel)string, parcel, 0);
            parcel.readException();
            return bl;
        }
        finally {
            parcel.recycle();
            string.recycle();
        }
    }

    public static void x(f f8, ServiceConnection serviceConnection) {
        m m8 = ax.ne.n.a(f8);
        m8.B(serviceConnection);
        try {
            ax.ne.i.K().q1(m8, f8.e());
            return;
        }
        catch (RemoteException remoteException) {
            throw ax.ne.i.L(remoteException);
        }
    }

    public static int y() {
        if (g) {
            return 0;
        }
        try {
            boolean bl;
            g = bl = ax.ne.i.K().H1();
            if (bl) {
                return 0;
            }
            return -1;
        }
        catch (RemoteException remoteException) {
            throw ax.ne.i.L(remoteException);
        }
    }

    public static IBinder z() {
        return a;
    }

    private static class b<T> {
        private final T a;
        private final Handler b;

        private b(T t8, Handler handler) {
            this.a = t8;
            this.b = handler;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && this.getClass() == object.getClass()) {
                object = (b)object;
                if (j.Objects.equals(this.a, ((b)object).a) && j.Objects.equals((Object)this.b, (Object)((b)object).b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return j.Objects.hash((Object[])new Object[]{this.a, this.b});
        }
    }

    public static interface c {
        public void a();
    }

    public static interface d {
        public void a();
    }

    public static interface e {
        public void a(int var1, int var2);
    }

    public static class f {
        final ComponentName a;
        int b = 1;
        String c;
        String d;
        boolean e = false;
        boolean f = true;
        boolean g = false;

        public f(ComponentName componentName) {
            this.a = componentName;
        }

        private Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", (Parcelable)this.a);
            bundle.putBoolean("shizuku:user-service-arg-debuggable", this.e);
            bundle.putInt("shizuku:user-service-arg-version-code", this.b);
            bundle.putBoolean("shizuku:user-service-arg-daemon", this.f);
            bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", this.g);
            String string = this.c;
            j.Objects.requireNonNull((Object)string, (String)"process name suffix must not be null");
            bundle.putString("shizuku:user-service-arg-process-name", string);
            string = this.d;
            if (string != null) {
                bundle.putString("shizuku:user-service-arg-tag", string);
            }
            return bundle;
        }

        private Bundle f(boolean bl) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", (Parcelable)this.a);
            String string = this.d;
            if (string != null) {
                bundle.putString("shizuku:user-service-arg-tag", string);
            }
            bundle.putBoolean("shizuku:user-service-remove", bl);
            return bundle;
        }

        public f c(boolean bl) {
            this.f = bl;
            return this;
        }

        public f d(boolean bl) {
            this.e = bl;
            return this;
        }

        public f g(String string) {
            this.c = string;
            return this;
        }

        public f h(int n8) {
            this.b = n8;
            return this;
        }
    }
}

