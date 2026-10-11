/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.UriPermission;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import ax.Q2.e;
import ax.Q2.o;
import ax.T2.h;
import ax.X2.H;
import ax.X2.J;
import ax.X2.O;
import ax.X2.Q;
import ax.X2.p;
import ax.X2.w;
import ax.Z2.r;
import ax.c3.B;
import ax.c3.F;
import ax.c3.K;
import ax.c3.L;
import ax.c3.d0;
import ax.c3.k0;
import ax.c3.l;
import ax.c3.x;
import ax.u3.b;
import com.alphainventor.filemanager.ApplicationReporter;
import com.alphainventor.filemanager.file.n;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class j {
    private static final Logger y = ax.Q2.g.a(j.class);
    private static j z;
    private Context a;
    private boolean b;
    private String c;
    private e.e d;
    private String e;
    private e.e f;
    private String g;
    private boolean h = true;
    private HashMap<String, Integer> i = new HashMap();
    private List<e.e> j = new ArrayList<e.e>();
    private HashMap<K, e.e> k = new HashMap();
    private HashSet<String> l = new HashSet();
    private boolean m;
    private boolean n;
    private boolean o = true;
    private Boolean p;
    private final ArrayList<K> q = new ArrayList();
    private final HashMap<K, r> r = new HashMap();
    private long s = -1L;
    private HashMap<K, e> t = new HashMap();
    private final ArrayList<K> u = new ArrayList();
    private final Object v = new Object();
    private final Object w = new Object();
    private HashMap<K, f> x = new HashMap();

    public j(Context context) {
        this.a = context;
        this.b = false;
    }

    private boolean A0(K k8) {
        if (!this.k.containsKey(k8)) {
            this.O0();
        }
        return this.D0(k8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<K> C() {
        ArrayList<K> arrayList = this.u;
        synchronized (arrayList) {
            this.e0();
            return this.u;
        }
    }

    private boolean C0(K object) {
        if ((object = this.k.get(object)) != null) {
            return ((e.e)object).f;
        }
        return false;
    }

    private boolean D0(K object) {
        if ((object = this.k.get(object)) != null) {
            return ((e.e)object).j;
        }
        return false;
    }

    public static j F() {
        if (z == null) {
            ApplicationReporter.init(null);
            ax.Ha.c.h().b("LocalManager not initialized").j().h();
        }
        return z;
    }

    private void G0(K k8) {
        switch (ax.Z2.j$d.a[k8.d().ordinal()]) {
            default: {
                ax.u3.b.f();
                return;
            }
            case 14: {
                this.F0();
                return;
            }
            case 13: {
                this.H0(k8);
                return;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                this.Q0();
                return;
            }
            case 6: {
                this.O0();
                return;
            }
            case 5: {
                this.O0();
                return;
            }
            case 4: {
                this.J0();
                return;
            }
            case 2: {
                this.N0();
            }
            case 3: {
                this.I0();
                return;
            }
            case 1: 
        }
        this.L0();
    }

    private int H(e.e object) {
        if (((e.e)object).g == null) {
            if (((e.e)object).a != ax.Q2.f.o0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("no uuid : ");
                stringBuilder.append((Object)((e.e)object).a);
                ax.u3.b.g(stringBuilder.toString());
            }
            return 0;
        }
        Object object2 = ((e.e)object).a;
        if (object2 != null && K.g(object2)) {
            return 0;
        }
        String string = ((e.e)object).g;
        object2 = ((e.e)object).i;
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append((String)object2);
        String string2 = ((StringBuilder)object).toString();
        object2 = this.i.get(string2);
        object = object2;
        if (object2 == null) {
            int n8;
            int n9 = n8 = Math.abs(string.hashCode());
            if (n8 > 2147483547) {
                n9 = n8 - 100;
            }
            n8 = n9;
            if (this.i.containsValue(n9)) {
                n8 = n9 = Math.abs(string2.hashCode());
                if (n9 > 2147483547) {
                    n8 = n9 - 100;
                }
            }
            while (true) {
                if (!this.i.containsValue(n8)) {
                    object = n8;
                    this.i.put(string2, (Integer)object);
                    break;
                }
                ++n8;
            }
        }
        return (Integer)object;
    }

    private void H0(K k8) {
        if (this.x.containsKey(k8)) {
            this.r(k8, ax.Z2.r.c0);
            return;
        }
        this.r(k8, ax.Z2.r.d0);
    }

    private K I(e.e e8) {
        int n8 = this.H(e8);
        return K.a(e8.a, n8);
    }

    private void I0() {
        String string;
        this.d = ax.Q2.e.u();
        this.c = string = ax.Q2.e.v();
        K k8 = K.e;
        k8.i(string);
        this.r(k8, this.d.e);
    }

    private void J0() {
        Object object = ax.Q2.e.x();
        this.f = object;
        object = ((e.e)object).b;
        if (object != null) {
            this.e = object = ((File)object).getAbsolutePath();
            K.f.i((String)object);
        }
        this.r(K.f, this.f.e);
    }

    private void L0() {
        if (ax.Q2.e.U()) {
            Object object = ax.Q2.e.i();
            if (object != null) {
                this.g = ((File)object).getAbsolutePath();
                K.a(ax.Q2.f.u0, 0).i(this.g);
                this.h = B.e0(this.g);
                K k8 = K.a(ax.Q2.f.v0, 0);
                object = K.a(ax.Q2.f.c1, 0);
                this.r(K.j, ax.Z2.r.c0);
                K k9 = K.k;
                r r8 = ax.Z2.r.d0;
                this.r(k9, r8);
                this.r(k8, r8);
                this.r((K)object, r8);
                this.n();
                return;
            }
            this.r(K.j, ax.Z2.r.d0);
            return;
        }
        this.r(K.j, ax.Z2.r.d0);
    }

    private void M0() {
        if (!this.o) {
            return;
        }
        this.o = false;
        if (!this.n && !this.m) {
            if (Q.w1()) {
                if (ax.Q2.o.i().f(this.a) != null) {
                    y.fine("USB RAW DETECTED");
                    this.r(K.k, ax.Z2.r.c0);
                    return;
                }
                this.r(K.k, ax.Z2.r.d0);
                return;
            }
            this.r(K.k, ax.Z2.r.d0);
            return;
        }
        this.r(K.k, ax.Z2.r.d0);
    }

    private void N0() {
        r r8;
        Enum enum_;
        block14: {
            block13: {
                if (Q.S1()) {
                    ax.u3.b.e("not reachable anymore");
                    this.P0();
                    this.M0();
                    return;
                }
                if (!this.o) break block13;
                this.o = false;
                enum_ = this.D(K.a(ax.Q2.f.u0, 0));
                if (enum_ != (r8 = ax.Z2.r.c0)) break block14;
            }
            return;
        }
        r r9 = ax.Z2.r.d0;
        boolean bl = Q.R1();
        enum_ = null;
        if (bl) {
            this.O0();
            if (this.a0()) {
                enum_ = ax.Z2.j$g.c0;
            } else if (ax.Q2.o.i().f(this.a) != null) {
                enum_ = ax.Z2.j$g.q;
            } else {
                y.fine("NO USB DETECTED");
            }
        } else if (ax.Q2.o.i().f(this.a) != null) {
            enum_ = ax.Z2.j$g.q;
        }
        if (enum_ == ax.Z2.j$g.q && !this.m && !this.n) {
            y.fine("USB RAW DETECTED");
            enum_ = r8;
        } else {
            enum_ = r9;
        }
        this.r(K.k, (r)enum_);
    }

    private void O0() {
        if (!Q.R1()) {
            ax.u3.b.f();
            return;
        }
        if (Q.S1()) {
            this.P0();
            return;
        }
        this.W0(ax.Q2.e.D());
    }

    private void P0() {
        this.W0(ax.Q2.e.H());
    }

    private void Q0() {
        if (Q.S1()) {
            this.P0();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void R0() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver(this){
            final j a;
            {
                this.a = j8;
            }

            public void onReceive(Context object, Intent object2) {
                ax.Q2.e.d();
                ax.Z2.j.a(this.a, true);
                this.a.K0();
                ax.u3.g.a().f("local.intent.action.MOUNT_CHANGED");
                String string = object2.getAction();
                if (object2.getData() == null || (object = object2.getData().getPath()) == null) {
                    return;
                }
                if ("android.intent.action.MEDIA_MOUNTED".equals(string)) {
                    if (this.a.l.contains(object)) {
                        y.fine("Usb Volume Mounted");
                    } else if (ax.Q2.e.O((String)object)) {
                        boolean bl = this.a.g == null;
                        ax.Z2.j.e(this.a, (String)object);
                        K.a(ax.Q2.f.u0, 0).i(this.a.g);
                        if (B.e0(this.a.g)) {
                            ax.Z2.j.f(this.a, true);
                        } else {
                            ax.Z2.j.f(this.a, false);
                        }
                        ax.Q2.e.S((String)object);
                        this.a.r(K.j, ax.Z2.r.c0);
                        this.a.r(K.k, ax.Z2.r.d0);
                        object2 = d0.r((String)object);
                        if (!"/storage".equals(object2) && !"/mnt".equals(object2) && bl) {
                            ax.Ha.c.h().f().c("UNKNOWN USB MOUNT!!").g(object).h();
                        }
                    } else if (((String)object).equals(ax.Q2.e.y())) {
                        ax.Z2.j.i(this.a, (String)object);
                        object2 = K.f;
                        ((K)object2).i((String)object);
                        this.a.r((K)object2, ax.Z2.r.c0);
                    } else if (((String)object).equals(ax.Q2.e.v())) {
                        this.a.r(K.e, ax.Z2.r.c0);
                    }
                } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(string)) {
                    if (((String)object).equals(this.a.e)) {
                        this.a.r(K.f, ax.Z2.r.d0);
                    } else if (((String)object).equals(this.a.c)) {
                        this.a.r(K.e, ax.Z2.r.d0);
                    } else if (this.a.l.contains(object)) {
                        y.fine("Usb Volume Unmounted");
                    } else if (((String)object).equals(this.a.g)) {
                        this.a.r(K.j, ax.Z2.r.d0);
                    }
                }
                this.a.n();
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        try {
            this.a.registerReceiver(broadcastReceiver, intentFilter);
            return;
        }
        catch (SecurityException securityException) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void S0() {
        Throwable var1_4;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver(this){
            final j a;
            {
                this.a = j8;
            }

            public void onReceive(Context object, Intent intent) {
                object = intent.getAction();
                if ((UsbDevice)intent.getParcelableExtra("device") != null) {
                    ax.Q2.o.i().c();
                }
                boolean bl = "android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(object);
                int n8 = 0;
                if (bl) {
                    ax.Z2.j.l(this.a, false);
                    n8 = 1;
                }
                if (!Q.R1() && !ax.Q2.e.U()) {
                    ax.Z2.j.a(this.a, true);
                    this.a.K0();
                    return;
                }
                if (n8 != 0) {
                    bl = Q.R1();
                    n8 = 15000;
                    if (bl) {
                        if (!Q.S1()) {
                            n8 = 6000;
                        }
                    } else if (!this.a.y0()) {
                        n8 = 4000;
                    }
                } else {
                    n8 = 1500;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
                    final c q;
                    {
                        this.q = c8;
                    }

                    @Override
                    public void run() {
                        ax.u3.g.a().f("local.intent.action.USB_DETECTING_ENDED");
                        ax.Q2.e.d();
                        this.q.a.t();
                        ax.Z2.j.a(this.q.a, true);
                        this.q.a.K0();
                    }
                }, (long)n8);
                ax.u3.g.a().f("local.intent.action.USB_DETECTING_STARTED");
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        try {
            this.a.registerReceiver(broadcastReceiver, intentFilter);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        ax.Ha.c.h().f().d("USB RECEIVER ERROR").l((Throwable)var1_4).h();
    }

    private void T0() {
        if (Q.R1()) {
            Q.l(37);
            StorageManager storageManager = (StorageManager)this.a.getSystemService("storage");
            p p8 = new p(this){
                final j b;
                {
                    this.b = j8;
                }

                @Override
                public void a(O o8, int n8, int n9, boolean bl) {
                    block10: {
                        block9: {
                            if (n9 == n8) break block9;
                            if (n9 == 2 || n9 == 3) break block10;
                            if (n9 == 5) {
                                Intent intent = new Intent("local.intent.action.USB_IS_EJECTING");
                                if (o8 != null) {
                                    intent.putExtra("uuid", o8.f());
                                    intent.putExtra("desc", o8.d());
                                }
                                ax.u3.g.a().e(intent);
                                return;
                            }
                            if (n9 == 1) {
                                if (bl) {
                                    ax.Q2.e.T();
                                    ax.Z2.j.a(this.b, true);
                                }
                                Intent intent = new Intent("local.intent.action.USB_IS_EJECTED");
                                if (o8 != null) {
                                    intent.putExtra("uuid", o8.f());
                                    intent.putExtra("desc", o8.d());
                                }
                                ax.u3.g.a().e(intent);
                                this.b.K0();
                            }
                        }
                        return;
                    }
                    if (bl) {
                        ax.Q2.e.T();
                        ax.Z2.j.a(this.b, true);
                    }
                    this.b.K0();
                }
            };
            if (!ax.X2.w.q(storageManager, p8) && Build.VERSION.SDK_INT >= 30) {
                Q.l(35);
                H.a(this.a, storageManager, p8);
            }
        }
    }

    private e.e V(List<e.e> object, e.e e8) {
        String string = e8.g;
        String string2 = e8.i;
        object = object.iterator();
        while (object.hasNext()) {
            e.e e9 = (e.e)object.next();
            if (!ax.u3.B.j(string, e9.g) || !ax.u3.B.j(string2, e9.i) || e8.a != e9.a) continue;
            return e9;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void W0(List<e.e> object) {
        Object object2;
        Object object3;
        Object object4;
        Object object52;
        Iterator<e.e> iterator;
        e.e e8 = this.S();
        if (e8.e == ax.Z2.r.c0) {
            iterator = object.iterator();
            int n8 = 0;
            while (iterator.hasNext()) {
                if (((e.e)iterator.next()).a != ax.Q2.f.p0) continue;
                ++n8;
            }
            if (n8 > 1) {
                try {
                    iterator = object.iterator();
                    while (iterator.hasNext()) {
                        object52 = iterator.next();
                        if (((e.e)object52).a != ax.Q2.f.p0 || TextUtils.isEmpty((CharSequence)e8.g) || TextUtils.isEmpty((CharSequence)((e.e)object52).g) || e8.g.equals(((e.e)object52).g)) continue;
                        object4 = y;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("multi sd card check!!");
                        ((StringBuilder)object3).append(e8.g);
                        ((StringBuilder)object3).append(" != ");
                        ((StringBuilder)object3).append(((e.e)object52).g);
                        ((Logger)object4).fine(((StringBuilder)object3).toString());
                        object2 = this.O();
                        object3 = ((e.e)object52).b;
                        if (object3 != null && object2 != null) {
                            if (((File)object3).getAbsolutePath().startsWith((String)object2) || e8.b == null || ((e.e)object52).b.getAbsolutePath().startsWith(e8.b.getAbsolutePath()) || ((e.e)object52).b.getCanonicalPath().equals(e8.b.getCanonicalPath())) continue;
                            ((Logger)object4).fine("multi sd card detected!!");
                            ((e.e)object52).a = ax.Q2.f.x0;
                            continue;
                        }
                        if (!Q.B1()) continue;
                        ((e.e)object52).a = ax.Q2.f.d1;
                    }
                }
                catch (IOException iOException) {}
            }
        }
        iterator = this.w;
        synchronized (iterator) {
            try {
                for (Object object52 : this.j) {
                    object4 = this.V((List<e.e>)object, (e.e)object52);
                    if (object4 == null) {
                        ((e.e)object52).e = ax.Z2.r.d0;
                        ((e.e)object52).d = "unknown";
                        continue;
                    }
                    ((e.e)object52).a((e.e)object4);
                    object.remove(object4);
                }
                this.j.addAll((Collection<e.e>)object);
                object52 = this.j.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (object52.hasNext()) {
                object4 = (e.e)object52.next();
                if (((e.e)object4).a == null) {
                    ax.u3.b.f();
                    continue;
                }
                object = this.I((e.e)object4);
                if (object == K.e || object == K.f) continue;
                this.r((K)object, ((e.e)object4).e);
                object2 = ((e.e)object4).a;
                object3 = ax.Q2.f.d1;
                if (object2 != object3 && object2 != ax.Q2.f.x0) {
                    if (object2 != ax.Q2.f.w0 && object2 != ax.Q2.f.v0) {
                        if (object2 == ax.Q2.f.c1) {
                            this.k.put((K)object, (e.e)object4);
                            continue;
                        }
                        if (!this.f0((ax.Q2.f)((Object)object2)) || !Q.K0() || ((e.e)object4).g == null) continue;
                        this.k.put((K)object, (e.e)object4);
                        continue;
                    }
                    object3 = ((e.e)object4).b.getAbsolutePath();
                    ((K)object).i((String)object3);
                    this.m((K)object);
                    this.k.put((K)object, (e.e)object4);
                    if (((e.e)object4).a != ax.Q2.f.v0) continue;
                    this.l.add((String)object3);
                    continue;
                }
                object2 = ((e.e)object4).g;
                if (object2 == null) continue;
                if (e8.e != ax.Z2.r.c0) {
                    if (!Q.B1() || ((e.e)object4).a != object3) continue;
                    this.k.put((K)object, (e.e)object4);
                    continue;
                }
                object3 = e8.g;
                if (object3 != null && object2 != null && !((String)object3).equals(object2)) {
                    object3 = y;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("multi sd card added : ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(",");
                    ((StringBuilder)object2).append(((e.e)object4).g);
                    ((Logger)object3).fine(((StringBuilder)object2).toString());
                    if (((e.e)object4).a == ax.Q2.f.x0) {
                        ((K)object).i(((e.e)object4).b.getAbsolutePath());
                        this.m((K)object);
                    }
                    this.k.put((K)object, (e.e)object4);
                    continue;
                }
                y.fine("sd card document or volume is ignored");
                this.k.remove(object);
            }
            return;
        }
    }

    static /* synthetic */ boolean a(j j8, boolean bl) {
        j8.o = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a0() {
        Object object = this.w;
        synchronized (object) {
            try {
                e.e e8;
                Iterator<e.e> iterator = this.j.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return false;
                    }
                    e8 = iterator.next();
                } while (!ax.Q2.f.y0(e8.a) || e8.e != ax.Z2.r.c0);
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private void c0() {
        if (!this.b) {
            this.b = true;
            this.R0();
            this.S0();
            this.T0();
            this.K0();
        }
    }

    public static void d0(Context object) {
        if (z == null) {
            object = new j((Context)object);
            z = object;
            super.c0();
        }
    }

    static /* synthetic */ String e(j j8, String string) {
        j8.g = string;
        return string;
    }

    private void e0() {
        if (this.u.size() == 0) {
            this.u.add(K.e);
            this.u.add(K.f);
            this.u.add(K.g);
            this.u.add(K.a(ax.Q2.f.u0, 0));
            this.u.add(K.a(ax.Q2.f.v0, 0));
        }
    }

    static /* synthetic */ boolean f(j j8, boolean bl) {
        j8.h = bl;
        return bl;
    }

    private boolean f0(ax.Q2.f f8) {
        return f8 == ax.Q2.f.e1 || f8 == ax.Q2.f.f1 || f8 == ax.Q2.f.g1;
        {
        }
    }

    private boolean g0(ax.Q2.f f8) {
        return f8 == ax.Q2.f.w0;
    }

    static /* synthetic */ String i(j j8, String string) {
        j8.e = string;
        return string;
    }

    static /* synthetic */ boolean l(j j8, boolean bl) {
        j8.m = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m(K k8) {
        ArrayList<K> arrayList = this.u;
        synchronized (arrayList) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.e0();
                        if (this.u.contains(k8)) break block3;
                        this.u.add(k8);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        ArrayList<K> arrayList = this.q;
        synchronized (arrayList) {
            Throwable throwable2;
            block6: {
                block5: {
                    Object object;
                    Object object2;
                    ArrayList<String> arrayList2;
                    try {
                        if (this.q.size() <= 0) break block5;
                        arrayList2 = new ArrayList<String>();
                        object2 = this.q;
                        int n8 = ((ArrayList)object2).size();
                        for (int i8 = 0; i8 < n8; ++i8) {
                            object = ((ArrayList)object2).get(i8);
                            arrayList2.add(((K)object).k());
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    this.q.clear();
                    object2 = new Intent("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED");
                    object2.putStringArrayListExtra("CHANGED_STORAGES", arrayList2);
                    ax.u3.g.a().e((Intent)object2);
                    object2 = y;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Local Storage Status Changed : Send Broadcast ");
                    ((StringBuilder)object).append(arrayList2.size());
                    ((StringBuilder)object).append(" locations");
                    ((Logger)object2).fine(((StringBuilder)object).toString());
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void p(K object) {
        Object object2 = this.v;
        synchronized (object2) {
            block12: {
                Throwable throwable2;
                block13: {
                    try {
                        if (!this.u((K)object)) {
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                    e e8 = this.G((K)object);
                    Object object3 = ((K)object).e();
                    long l8 = 0L;
                    if (object3 == null) {
                        e8.c = 0L;
                        e8.d = 0L;
                        e8.a = true;
                        return;
                    }
                    object = ax.c3.x.e(ax.T2.h.b0((K)object));
                    try {
                        object3 = ((com.alphainventor.filemanager.file.o)object).z(((com.alphainventor.filemanager.file.o)object).V());
                        if (object3.n()) {
                            long l9;
                            long l10;
                            if ((object = ((com.alphainventor.filemanager.file.o)object).f0((n)object3)) != null) {
                                object = object.iterator();
                                long l11 = 0L;
                                while (true) {
                                    l10 = l8;
                                    l9 = l11++;
                                    if (object.hasNext()) {
                                        l8 += ((n)object.next()).p();
                                        continue;
                                    }
                                    break;
                                }
                            } else {
                                l9 = 0L;
                                l10 = l8;
                            }
                            e8.c = l10;
                            e8.d = l9;
                            e8.a = true;
                        }
                        break block12;
                    }
                    catch (ax.b3.j j8) {}
                }
                throw throwable2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void r(K k8, r object) {
        int n8;
        r r8 = this.r.put(k8, (r)((Object)object));
        if (object == ax.Z2.r.c0 && ((n8 = ax.Z2.j$d.a[k8.d().ordinal()]) == 1 || n8 == 5 || n8 == 6)) {
            this.n = true;
        }
        if (r8 != object) {
            Logger logger = y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Local Storage Status Changed : ");
            stringBuilder.append(k8);
            stringBuilder.append(":");
            stringBuilder.append((Object)r8);
            stringBuilder.append(" -> ");
            stringBuilder.append(object);
            logger.fine(stringBuilder.toString());
            object = this.q;
            synchronized (object) {
                this.q.add(k8);
                return;
            }
        }
    }

    private void s(ax.Q2.f f8) {
        switch (ax.Z2.j$d.a[f8.ordinal()]) {
            default: {
                ax.u3.b.f();
            }
            case 1: 
            case 2: 
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
            case 13: 
            case 14: 
        }
    }

    private boolean s0() {
        if (this.f == null) {
            this.J0();
        }
        return this.f.f;
    }

    private boolean v(Uri uri) {
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        ContentResolver contentResolver3;
        block8: {
            block7: {
                contentResolver3 = this.a.getContentResolver();
                contentResolver2 = null;
                contentResolver = null;
                contentResolver3 = contentResolver3.query(DocumentsContract.buildDocumentUriUsingTree((Uri)uri, (String)DocumentsContract.getTreeDocumentId((Uri)uri)), ax.c3.l.g, null, null, null);
                if (contentResolver3 != null) break block7;
                F.a((AutoCloseable)contentResolver3);
                return false;
            }
            contentResolver = contentResolver3;
            contentResolver2 = contentResolver3;
            int n8 = contentResolver3.getCount();
            if (n8 > 0) break block8;
            F.a((AutoCloseable)contentResolver3);
            return false;
        }
        contentResolver = contentResolver3;
        contentResolver2 = contentResolver3;
        contentResolver3.moveToNext();
        contentResolver = contentResolver3;
        contentResolver2 = contentResolver3;
        String string = contentResolver3.getString(1);
        contentResolver = contentResolver3;
        contentResolver2 = contentResolver3;
        try {
            this.V0(L.q0(uri)).j(string);
        }
        catch (Throwable throwable) {
            F.a(contentResolver);
            throw throwable;
        }
        catch (Exception exception) {
            F.a(contentResolver2);
            return false;
        }
        F.a((AutoCloseable)contentResolver3);
        return true;
    }

    private boolean x0() {
        if (this.D(K.a(ax.Q2.f.u0, 0)) == null) {
            this.L0();
        }
        return this.h;
    }

    private boolean z0(K k8) {
        if (!this.k.containsKey(k8)) {
            this.O0();
        }
        return this.C0(k8);
    }

    public List<K> A() {
        Iterator<K> iterator = this.k.keySet().iterator();
        ArrayList<K> arrayList = null;
        while (iterator.hasNext()) {
            K k8 = iterator.next();
            if (k8.d() != ax.Q2.f.d1 && k8.d() != ax.Q2.f.x0 || this.D(k8) != ax.Z2.r.c0) continue;
            ArrayList<K> arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList<K>();
            }
            arrayList2.add(k8);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public List<K> B() {
        ArrayList<K> arrayList = K.a(ax.Q2.f.u0, 0);
        K k8 = K.a(ax.Q2.f.b1, 0);
        if (this.D((K)((Object)arrayList)) == ax.Z2.r.c0) {
            ArrayList<K> arrayList2 = new ArrayList<K>();
            arrayList2.add((K)((Object)arrayList));
            return arrayList2;
        }
        Iterator<K> iterator = this.k.keySet().iterator();
        arrayList = null;
        while (iterator.hasNext()) {
            K k9 = iterator.next();
            if (k9.d() != ax.Q2.f.v0 && k9.d() != ax.Q2.f.c1 || this.D(k9) != ax.Z2.r.c0) continue;
            ArrayList<K> arrayList3 = arrayList;
            if (arrayList == null) {
                arrayList3 = new ArrayList<K>();
            }
            arrayList3.add(k9);
            arrayList = arrayList3;
        }
        if (arrayList == null && this.D(k8) == ax.Z2.r.c0) {
            arrayList = new ArrayList();
            arrayList.add(k8);
            return arrayList;
        }
        return arrayList;
    }

    public boolean B0(K k8) {
        return this.k.containsKey(k8);
    }

    public r D(K k8) {
        this.s(k8.d());
        return this.r.get(k8);
    }

    public String E() {
        return ax.Q2.f.w();
    }

    public boolean E0(K k8) {
        if (!Q.h()) {
            return false;
        }
        return Q.m0();
    }

    public void F0() {
        r r8;
        if (ax.t3.j.w(this.a)) {
            String string = ax.Z2.j.F().E();
            if (string != null) {
                r8 = ax.Z2.r.c0;
                K.g.i(string);
            } else {
                r8 = ax.Z2.r.d0;
            }
        } else {
            r8 = ax.Z2.r.d0;
        }
        this.r(K.g, r8);
    }

    e G(K k8) {
        if (!this.t.containsKey(k8)) {
            this.t.put(k8, new e());
        }
        return this.t.get(k8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public K J(String string, K k8) {
        ax.u3.b.c(d0.B(string));
        ArrayList<K> arrayList = this.u;
        // MONITORENTER : arrayList
        for (K k9 : this.C()) {
            if (k9.e() == null || !d0.H(k9.e(), string)) continue;
            // MONITOREXIT : arrayList
            return k9;
        }
        if (k8 == null) return K.h;
        if (!ax.Q2.f.j0(k8.d())) return K.h;
        return k8;
    }

    public String K(K object) {
        if ((object = this.x.get(object)) == null) {
            return null;
        }
        return ((f)object).c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void K0() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (!Q.S1()) break block3;
                            this.I0();
                            this.J0();
                            this.P0();
                            this.M0();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.I0();
                    this.J0();
                    this.L0();
                    this.N0();
                }
                this.F0();
                this.n();
                return;
            }
            throw throwable2;
        }
    }

    public List<K> L() {
        ArrayList<K> arrayList = new ArrayList<K>();
        Iterator<K> iterator = this.x.keySet().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        return arrayList;
    }

    public f M(K k8) {
        return this.x.get(k8);
    }

    public Uri N(K object) {
        if ((object = this.x.get(object)) == null) {
            return null;
        }
        return ((f)object).a;
    }

    public String O() {
        if (this.c == null) {
            this.I0();
        }
        return this.c;
    }

    public float P() {
        return this.W(K.e);
    }

    public long Q() {
        long l8 = this.R(null);
        long l9 = this.s;
        if (l9 != -1L && l8 != -1L) {
            this.s = l8;
            return l8 - l9;
        }
        this.s = l8;
        return 0L;
    }

    public long R(K k8) {
        if (k8 == null) {
            K k9 = K.e;
            if (!this.G((K)k9).a) {
                return -1L;
            }
            if (!ax.Z2.j.F().t0()) {
                return this.G((K)k9).c;
            }
            k8 = K.f;
            if (!this.G((K)k8).a) {
                return -1L;
            }
            return this.G((K)k9).c + this.G((K)k8).c;
        }
        K k10 = K.e;
        if (k8 == k10) {
            if (!this.G((K)k10).a) {
                return -1L;
            }
            return this.G((K)k10).c;
        }
        k10 = K.f;
        if (k8 == k10) {
            if (!this.G((K)k10).a) {
                return -1L;
            }
            return this.G((K)k10).c;
        }
        ax.Ha.c.h().b("INVALID RECYCLE BIN LOCATION 2").g(k8.toString()).h();
        return -1L;
    }

    public e.e S() {
        if (this.f == null) {
            this.J0();
        }
        return this.f;
    }

    public String T() {
        if (this.f == null) {
            this.J0();
        }
        return this.e;
    }

    public float U() {
        return this.W(K.f);
    }

    public void U0(K object, Uri uri, String string) {
        if ((object = this.x.get(object)) == null) {
            return;
        }
        ((f)object).b = uri;
        ((f)object).c = string;
    }

    public K V0(Uri uri) {
        int n8;
        Object object = uri.getLastPathSegment();
        try {
            n8 = Integer.parseInt((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            n8 = Math.abs(((String)object).hashCode());
        }
        object = K.a(ax.Q2.f.h1, n8);
        this.r((K)object, ax.Z2.r.c0);
        f f8 = new f();
        f8.a = uri;
        this.x.put((K)object, f8);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float W(K object) {
        block6: {
            try {
                object = ax.c3.x.e((K)object);
                if (!((com.alphainventor.filemanager.file.o)object).a()) {
                    ((com.alphainventor.filemanager.file.o)object).h(null);
                }
                if ((object = ((com.alphainventor.filemanager.file.o)object).W()) == null) break block6;
            }
            catch (ax.b3.j j8) {
                return -1.0f;
            }
            long l8 = ((k0)object).b;
            if (l8 == 0L) break block6;
            long l9 = ((k0)object).a;
            return (float)((double)l9 * 100.0 / (double)l8);
        }
        return -1.0f;
    }

    public String X(K object) {
        if (((K)object).d() == ax.Q2.f.p0 ? (object = this.f) != null : (object = this.k.get(object)) != null) {
            return ((e.e)object).h;
        }
        return null;
    }

    public List<K> Y() {
        if (this.k.size() > 0) {
            return new ArrayList<K>(this.k.keySet());
        }
        return null;
    }

    public String Z(K object) {
        if (((K)object).d() == ax.Q2.f.p0) {
            object = this.f;
            if (object != null) {
                return ((e.e)object).g;
            }
        } else if (((K)object).d() == ax.Q2.f.o0) {
            object = this.d;
            if (object != null) {
                return ((e.e)object).g;
            }
        } else {
            if (((K)object).d() == ax.Q2.f.s0) {
                return null;
            }
            if ((object = this.k.get(object)) != null) {
                return ((e.e)object).g;
            }
        }
        return null;
    }

    public boolean b0() {
        r r8;
        K k8 = K.f;
        r r9 = r8 = this.D(k8);
        if (r8 == null) {
            this.J0();
            r9 = this.D(k8);
        }
        return r9 != ax.Z2.r.q;
    }

    public boolean h0() {
        return this.l0(K.g);
    }

    public boolean i0() {
        return ax.Z2.j.F().E() != null;
    }

    public boolean j0(K k8) {
        ax.Q2.f f8 = k8.d();
        if (f8 == ax.Q2.f.p0) {
            return this.s0();
        }
        if (f8 == ax.Q2.f.o0) {
            return true;
        }
        if (f8 != ax.Q2.f.x0 && f8 != ax.Q2.f.w0) {
            if (f8 == ax.Q2.f.v0) {
                return this.z0(k8);
            }
            if (f8 == ax.Q2.f.u0) {
                return this.x0();
            }
            return true;
        }
        return this.C0(k8);
    }

    public boolean k0(K k8) {
        if (k8.d() == ax.Q2.f.v0) {
            return this.A0(k8);
        }
        return false;
    }

    public boolean l0(K k8) {
        r r8;
        r r9 = r8 = this.D(k8);
        if (r8 == null) {
            this.G0(k8);
            r9 = r8 = this.D(k8);
            if (r8 == null) {
                this.r(k8, ax.Z2.r.d0);
                r9 = r8;
            }
        }
        return r9 == ax.Z2.r.c0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean m0() {
        try {
            Object object = (UsbManager)this.a.getSystemService("usb");
            try {
                object = object.getDeviceList();
            }
            catch (BadParcelableException badParcelableException) {
                return false;
            }
            if (object == null) {
                return false;
            }
            Iterator iterator = ((HashMap)object).values().iterator();
            block4: while (true) {
                if (!iterator.hasNext()) return false;
                object = (UsbDevice)iterator.next();
                int n8 = object.getInterfaceCount();
                int n9 = 0;
                while (true) {
                    int n10;
                    if (n9 >= n8) continue block4;
                    UsbInterface usbInterface = object.getInterface(n9);
                    if (usbInterface.getInterfaceClass() == 6 && usbInterface.getInterfaceSubclass() == 1 && (n10 = usbInterface.getInterfaceProtocol()) == 1) {
                        return true;
                    }
                    ++n9;
                }
                break;
            }
        }
        catch (NullPointerException | NoSuchElementException runtimeException) {
            return false;
        }
    }

    public boolean n0(Context context) {
        return this.P() >= (float)ax.Q2.e.m(context);
    }

    public long o(K k8) {
        if (k8 == null) {
            K k9 = K.e;
            this.p(k9);
            if (!ax.Z2.j.F().t0()) {
                return this.G((K)k9).c;
            }
            k8 = K.f;
            this.p(k8);
            return this.G((K)k9).c + this.G((K)k8).c;
        }
        if (k8.d() == ax.Q2.f.o0) {
            k8 = K.e;
            this.p(k8);
            return this.G((K)k8).c;
        }
        if (k8.d() == ax.Q2.f.p0) {
            k8 = K.f;
            this.p(k8);
            return this.G((K)k8).c;
        }
        ax.Ha.c.h().b("INVALID RECYCLE BIN LOCATION 1").g(k8.toString()).h();
        return -1L;
    }

    public boolean o0() {
        if (this.d == null) {
            this.I0();
        }
        return this.d.c;
    }

    public boolean p0() {
        return this.s <= 0L;
    }

    public boolean q() {
        return ax.t3.j.k(this.a) && this.q0();
    }

    public boolean q0() {
        if (this.p == null) {
            this.p = ax.u3.r.g();
        }
        return this.p;
    }

    public boolean r0() {
        return ax.Z2.j.F().o0() && !ax.Z2.j.F().b0() && !ax.Z2.j.F().w0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t() {
        boolean bl;
        Object object;
        if (!Q.k1()) {
            return;
        }
        if (!this.m0()) {
            if (this.x.size() <= 0) return;
            Iterator<K> iterator = this.x.keySet().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.x.clear();
                    return;
                }
                this.r(iterator.next(), ax.Z2.r.d0);
            }
        }
        try {
            object = this.a.getContentResolver().getPersistedUriPermissions();
            object = object.iterator();
            bl = false;
        }
        catch (Exception exception) {
            return;
        }
        while (true) {
            if (!object.hasNext()) {
                if (!bl) return;
                this.n();
                return;
            }
            UriPermission uriPermission = (UriPermission)object.next();
            if (!uriPermission.isReadPermission() && !uriPermission.isWritePermission() || (uriPermission = uriPermission.getUri()) == null || !"com.android.mtp.documents".equals(uriPermission.getAuthority()) || !this.v((Uri)uriPermission)) continue;
            bl = true;
        }
    }

    public boolean t0() {
        return this.l0(K.f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean u(K k8) {
        e e8 = this.G(k8);
        com.alphainventor.filemanager.file.o o8 = ax.c3.x.e(ax.T2.h.b0(k8));
        try {
            long l8 = k8.e() == null ? 0L : o8.z(com.alphainventor.filemanager.file.J.b2(k8)).q();
            if (l8 != e8.b) {
                e8.b = l8;
                return true;
            }
            return false;
        }
        catch (ax.b3.j j8) {
            return true;
        }
    }

    public boolean u0(Context context) {
        return this.U() >= (float)ax.Q2.e.m(context);
    }

    public boolean v0() {
        if (!Q.y0()) {
            return false;
        }
        if (ax.Z2.j.F().b0()) {
            return false;
        }
        return ax.Q2.e.N();
    }

    /*
     * Exception decompiling
     */
    public void w() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [10, 9 : 178->184)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean w0() {
        if (this.f == null) {
            this.J0();
        }
        return this.f.c;
    }

    public void x() {
        this.G((K)K.e).b = 0L;
        if (ax.Z2.j.F().t0()) {
            this.G((K)K.f).b = 0L;
        }
    }

    public void y() {
        if (ax.Q2.o.i().g()) {
            this.m = true;
            this.o = true;
            this.K0();
        }
    }

    boolean y0() {
        return J.B();
    }

    public List<K> z() {
        ArrayList<K> arrayList;
        K k8;
        Iterator<K> iterator = this.k.keySet().iterator();
        ArrayList<K> arrayList2 = null;
        while (iterator.hasNext()) {
            k8 = iterator.next();
            if (!Q.K0() || !this.f0(k8.d()) && !this.g0(k8.d()) || this.D(k8) != ax.Z2.r.c0) continue;
            arrayList = arrayList2;
            if (arrayList2 == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(k8);
            arrayList2 = arrayList;
        }
        iterator = this.L().iterator();
        arrayList = arrayList2;
        while (iterator.hasNext()) {
            k8 = iterator.next();
            arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList<K>();
            }
            arrayList2.add(k8);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    static class e {
        boolean a;
        long b;
        long c;
        long d;

        e() {
        }
    }

    public static class f {
        public Uri a;
        public Uri b;
        public String c;
    }

    public static final class g
    extends Enum<g> {
        public static final /* enum */ g c0;
        private static final g[] d0;
        public static final /* enum */ g q;

        static {
            q = new g();
            c0 = new g();
            d0 = ax.Z2.j$g.d();
        }

        private static /* synthetic */ g[] d() {
            return new g[]{q, c0};
        }

        public static g valueOf(String string) {
            return Enum.valueOf(g.class, string);
        }

        public static g[] values() {
            return (g[])d0.clone();
        }
    }
}

