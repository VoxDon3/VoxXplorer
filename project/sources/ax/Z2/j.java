package ax.Z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.UriPermission;
import android.database.Cursor;
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
import ax.X2.C1170p;
import ax.X2.H;
import ax.X2.O;
import ax.X2.Q;
import ax.X2.w;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1824l;
import ax.c3.C1835x;
import ax.c3.F;
import ax.c3.K;
import ax.c3.L;
import ax.c3.d0;
import ax.c3.k0;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3189g;
import ax.u3.C3200r;
import com.voxdon.xplorer.ApplicationReporter;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.J;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class j {
    private static final Logger y = ax.Q2.g.a(j.class);
    private static j z;
    private Context a;
    private String c;
    private e.C0177e d;
    private String e;
    private e.C0177e f;
    private String g;
    private boolean m;
    private boolean n;
    private Boolean p;
    private boolean h = true;
    private HashMap<String, Integer> i = new HashMap<>();
    private List<e.C0177e> j = new ArrayList();
    private HashMap<K, e.C0177e> k = new HashMap<>();
    private HashSet<String> l = new HashSet<>();
    private boolean o = true;
    private final ArrayList<K> q = new ArrayList<>();
    private final HashMap<K, r> r = new HashMap<>();
    private long s = -1;
    private HashMap<K, e> t = new HashMap<>();
    private final ArrayList<K> u = new ArrayList<>();
    private final Object v = new Object();
    private final Object w = new Object();
    private HashMap<K, f> x = new HashMap<>();
    private boolean b = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String path;
            ax.Q2.e.d();
            j.this.o = true;
            j.this.K0();
            C3189g.a().f("local.intent.action.MOUNT_CHANGED");
            String action = intent.getAction();
            if (intent.getData() == null || (path = intent.getData().getPath()) == null) {
                return;
            }
            if ("android.intent.action.MEDIA_MOUNTED".equals(action)) {
                if (j.this.l.contains(path)) {
                    j.y.fine("Usb Volume Mounted");
                } else if (ax.Q2.e.O(path)) {
                    boolean z = j.this.g == null;
                    j.this.g = path;
                    K.a(ax.Q2.f.u0, 0).i(j.this.g);
                    if (C1809B.e0(j.this.g)) {
                        j.this.h = true;
                    } else {
                        j.this.h = false;
                    }
                    ax.Q2.e.S(path);
                    j.this.r(K.j, r.AVAILABLE);
                    j.this.r(K.k, r.NOT_AVAILABLE);
                    String r = d0.r(path);
                    if (!"/storage".equals(r) && !"/mnt".equals(r) && z) {
                        ax.Ha.c.h().f().c("UNKNOWN USB MOUNT!!").g(path).h();
                    }
                } else if (path.equals(ax.Q2.e.y())) {
                    j.this.e = path;
                    K k = K.f;
                    k.i(path);
                    j.this.r(k, r.AVAILABLE);
                } else if (path.equals(ax.Q2.e.v())) {
                    j.this.r(K.e, r.AVAILABLE);
                }
            } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(action)) {
                if (path.equals(j.this.e)) {
                    j.this.r(K.f, r.NOT_AVAILABLE);
                } else if (path.equals(j.this.c)) {
                    j.this.r(K.e, r.NOT_AVAILABLE);
                } else if (j.this.l.contains(path)) {
                    j.y.fine("Usb Volume Unmounted");
                } else if (path.equals(j.this.g)) {
                    j.this.r(K.j, r.NOT_AVAILABLE);
                }
            }
            j.this.n();
        }
    }

    class b extends C1170p {
        b() {
        }

        @Override // ax.X2.C1170p
        public void a(O o, int i, int i2, boolean z) {
            if (i2 == i) {
                return;
            }
            if (i2 == 2 || i2 == 3) {
                if (z) {
                    ax.Q2.e.T();
                    j.this.o = true;
                }
                j.this.K0();
                return;
            }
            if (i2 == 5) {
                Intent intent = new Intent("local.intent.action.USB_IS_EJECTING");
                if (o != null) {
                    intent.putExtra("uuid", o.f());
                    intent.putExtra("desc", o.d());
                }
                C3189g.a().e(intent);
                return;
            }
            if (i2 == 1) {
                if (z) {
                    ax.Q2.e.T();
                    j.this.o = true;
                }
                Intent intent2 = new Intent("local.intent.action.USB_IS_EJECTED");
                if (o != null) {
                    intent2.putExtra("uuid", o.f());
                    intent2.putExtra("desc", o.d());
                }
                C3189g.a().e(intent2);
                j.this.K0();
            }
        }
    }

    class c extends BroadcastReceiver {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3189g.a().f("local.intent.action.USB_DETECTING_ENDED");
                ax.Q2.e.d();
                j.this.t();
                j.this.o = true;
                j.this.K0();
            }
        }

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i;
            String action = intent.getAction();
            if (((UsbDevice) intent.getParcelableExtra("device")) != null) {
                ax.Q2.o.i().c();
            }
            boolean z = false;
            if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                j.this.m = false;
                z = true;
            }
            if (!Q.R1() && !ax.Q2.e.U()) {
                j.this.o = true;
                j.this.K0();
                return;
            }
            if (z) {
                i = 15000;
                if (Q.R1()) {
                    if (!Q.S1()) {
                        i = 6000;
                    }
                } else if (!j.this.y0()) {
                    i = 4000;
                }
            } else {
                i = 1500;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new a(), i);
            C3189g.a().f("local.intent.action.USB_DETECTING_STARTED");
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.u0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.b1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.Q2.f.o0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.Q2.f.p0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.Q2.f.v0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ax.Q2.f.c1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ax.Q2.f.x0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ax.Q2.f.d1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ax.Q2.f.e1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ax.Q2.f.w0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ax.Q2.f.f1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ax.Q2.f.g1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ax.Q2.f.h1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[ax.Q2.f.s0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
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

    public enum g {
        USB_RAW,
        USB_VOLUMEDOCUMENT
    }

    public j(Context context) {
        this.a = context;
    }

    private boolean A0(K k) {
        if (!this.k.containsKey(k)) {
            O0();
        }
        return D0(k);
    }

    private List<K> C() {
        ArrayList<K> arrayList;
        synchronized (this.u) {
            e0();
            arrayList = this.u;
        }
        return arrayList;
    }

    private boolean C0(K k) {
        e.C0177e c0177e = this.k.get(k);
        if (c0177e != null) {
            return c0177e.f;
        }
        return false;
    }

    private boolean D0(K k) {
        e.C0177e c0177e = this.k.get(k);
        if (c0177e != null) {
            return c0177e.j;
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

    private void G0(K k) {
        switch (d.a[k.d().ordinal()]) {
            case 1:
                L0();
                return;
            case 2:
                N0();
                break;
            case 3:
                break;
            case 4:
                J0();
                return;
            case 5:
                O0();
                return;
            case 6:
                O0();
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                Q0();
                return;
            case 13:
                H0(k);
                return;
            case 14:
                F0();
                return;
            default:
                C3184b.f();
                return;
        }
        I0();
    }

    private int H(e.C0177e c0177e) {
        if (c0177e.g == null) {
            if (c0177e.a != ax.Q2.f.o0) {
                C3184b.g("no uuid : " + c0177e.a);
            }
            return 0;
        }
        ax.Q2.f fVar = c0177e.a;
        if (fVar != null && K.g(fVar)) {
            return 0;
        }
        String str = c0177e.g;
        String str2 = str + ":" + c0177e.i;
        Integer num = this.i.get(str2);
        if (num == null) {
            int abs = Math.abs(str.hashCode());
            if (abs > 2147483547) {
                abs -= 100;
            }
            if (this.i.containsValue(Integer.valueOf(abs)) && (abs = Math.abs(str2.hashCode())) > 2147483547) {
                abs -= 100;
            }
            while (this.i.containsValue(Integer.valueOf(abs))) {
                abs++;
            }
            num = Integer.valueOf(abs);
            this.i.put(str2, num);
        }
        return num.intValue();
    }

    private void H0(K k) {
        if (this.x.containsKey(k)) {
            r(k, r.AVAILABLE);
        } else {
            r(k, r.NOT_AVAILABLE);
        }
    }

    private K I(e.C0177e c0177e) {
        return K.a(c0177e.a, H(c0177e));
    }

    private void I0() {
        this.d = ax.Q2.e.u();
        String v = ax.Q2.e.v();
        this.c = v;
        K k = K.e;
        k.i(v);
        r(k, this.d.e);
    }

    private void J0() {
        e.C0177e x = ax.Q2.e.x();
        this.f = x;
        File file = x.b;
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            this.e = absolutePath;
            K.f.i(absolutePath);
        }
        r(K.f, this.f.e);
    }

    private void L0() {
        if (!ax.Q2.e.U()) {
            r(K.j, r.NOT_AVAILABLE);
            return;
        }
        File i = ax.Q2.e.i();
        if (i == null) {
            r(K.j, r.NOT_AVAILABLE);
            return;
        }
        this.g = i.getAbsolutePath();
        K.a(ax.Q2.f.u0, 0).i(this.g);
        if (C1809B.e0(this.g)) {
            this.h = true;
        } else {
            this.h = false;
        }
        K a2 = K.a(ax.Q2.f.v0, 0);
        K a3 = K.a(ax.Q2.f.c1, 0);
        r(K.j, r.AVAILABLE);
        K k = K.k;
        r rVar = r.NOT_AVAILABLE;
        r(k, rVar);
        r(a2, rVar);
        r(a3, rVar);
        n();
    }

    private void M0() {
        if (this.o) {
            this.o = false;
            if (this.n || this.m) {
                r(K.k, r.NOT_AVAILABLE);
                return;
            }
            if (!Q.w1()) {
                r(K.k, r.NOT_AVAILABLE);
            } else if (ax.Q2.o.i().f(this.a) == null) {
                r(K.k, r.NOT_AVAILABLE);
            } else {
                y.fine("USB RAW DETECTED");
                r(K.k, r.AVAILABLE);
            }
        }
    }

    private void N0() {
        if (Q.S1()) {
            C3184b.e("not reachable anymore");
            P0();
            M0();
            return;
        }
        if (this.o) {
            this.o = false;
            r D = D(K.a(ax.Q2.f.u0, 0));
            r rVar = r.AVAILABLE;
            if (D == rVar) {
                return;
            }
            r rVar2 = r.NOT_AVAILABLE;
            g gVar = null;
            if (Q.R1()) {
                O0();
                if (a0()) {
                    gVar = g.USB_VOLUMEDOCUMENT;
                } else if (ax.Q2.o.i().f(this.a) != null) {
                    gVar = g.USB_RAW;
                } else {
                    y.fine("NO USB DETECTED");
                }
            } else if (ax.Q2.o.i().f(this.a) != null) {
                gVar = g.USB_RAW;
            }
            if (gVar != g.USB_RAW || this.m || this.n) {
                rVar = rVar2;
            } else {
                y.fine("USB RAW DETECTED");
            }
            r(K.k, rVar);
        }
    }

    private void O0() {
        if (!Q.R1()) {
            C3184b.f();
        } else if (Q.S1()) {
            P0();
        } else {
            W0(ax.Q2.e.D());
        }
    }

    private void P0() {
        W0(ax.Q2.e.H());
    }

    private void Q0() {
        if (Q.S1()) {
            P0();
        }
    }

    private void R0() {
        a aVar = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        try {
            this.a.registerReceiver(aVar, intentFilter);
        } catch (SecurityException unused) {
        }
    }

    private void S0() {
        c cVar = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        try {
            this.a.registerReceiver(cVar, intentFilter);
        } catch (IllegalArgumentException | SecurityException e2) {
            ax.Ha.c.h().f().d("USB RECEIVER ERROR").l(e2).h();
        }
    }

    private void T0() {
        if (Q.R1()) {
            Q.l(37);
            StorageManager storageManager = (StorageManager) this.a.getSystemService("storage");
            b bVar = new b();
            if (w.q(storageManager, bVar) || Build.VERSION.SDK_INT < 30) {
                return;
            }
            Q.l(35);
            H.a(this.a, storageManager, bVar);
        }
    }

    private e.C0177e V(List<e.C0177e> list, e.C0177e c0177e) {
        String str = c0177e.g;
        String str2 = c0177e.i;
        for (e.C0177e c0177e2 : list) {
            if (C3180B.j(str, c0177e2.g) && C3180B.j(str2, c0177e2.i) && c0177e.a == c0177e2.a) {
                return c0177e2;
            }
        }
        return null;
    }

    private void W0(List<e.C0177e> list) {
        e.C0177e S = S();
        if (S.e == r.AVAILABLE) {
            Iterator<e.C0177e> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().a == ax.Q2.f.p0) {
                    i++;
                }
            }
            if (i > 1) {
                try {
                    for (e.C0177e c0177e : list) {
                        if (c0177e.a == ax.Q2.f.p0 && !TextUtils.isEmpty(S.g) && !TextUtils.isEmpty(c0177e.g) && !S.g.equals(c0177e.g)) {
                            Logger logger = y;
                            logger.fine("multi sd card check!!" + S.g + " != " + c0177e.g);
                            String O = O();
                            File file = c0177e.b;
                            if (file == null || O == null) {
                                if (Q.B1()) {
                                    c0177e.a = ax.Q2.f.d1;
                                }
                            } else if (!file.getAbsolutePath().startsWith(O) && S.b != null && !c0177e.b.getAbsolutePath().startsWith(S.b.getAbsolutePath()) && !c0177e.b.getCanonicalPath().equals(S.b.getCanonicalPath())) {
                                logger.fine("multi sd card detected!!");
                                c0177e.a = ax.Q2.f.x0;
                            }
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        synchronized (this.w) {
            try {
                for (e.C0177e c0177e2 : this.j) {
                    e.C0177e V = V(list, c0177e2);
                    if (V == null) {
                        c0177e2.e = r.NOT_AVAILABLE;
                        c0177e2.d = "unknown";
                    } else {
                        c0177e2.a(V);
                        list.remove(V);
                    }
                }
                this.j.addAll(list);
                for (e.C0177e c0177e3 : this.j) {
                    if (c0177e3.a == null) {
                        C3184b.f();
                    } else {
                        K I = I(c0177e3);
                        if (I != K.e && I != K.f) {
                            r(I, c0177e3.e);
                            ax.Q2.f fVar = c0177e3.a;
                            ax.Q2.f fVar2 = ax.Q2.f.d1;
                            if (fVar != fVar2 && fVar != ax.Q2.f.x0) {
                                if (fVar != ax.Q2.f.w0 && fVar != ax.Q2.f.v0) {
                                    if (fVar == ax.Q2.f.c1) {
                                        this.k.put(I, c0177e3);
                                    } else if (f0(fVar) && Q.K0() && c0177e3.g != null) {
                                        this.k.put(I, c0177e3);
                                    }
                                }
                                String absolutePath = c0177e3.b.getAbsolutePath();
                                I.i(absolutePath);
                                m(I);
                                this.k.put(I, c0177e3);
                                if (c0177e3.a == ax.Q2.f.v0) {
                                    this.l.add(absolutePath);
                                }
                            }
                            String str = c0177e3.g;
                            if (str != null) {
                                if (S.e == r.AVAILABLE) {
                                    String str2 = S.g;
                                    if (str2 == null || str == null || str2.equals(str)) {
                                        y.fine("sd card document or volume is ignored");
                                        this.k.remove(I);
                                    } else {
                                        y.fine("multi sd card added : " + I + "," + c0177e3.g);
                                        if (c0177e3.a == ax.Q2.f.x0) {
                                            I.i(c0177e3.b.getAbsolutePath());
                                            m(I);
                                        }
                                        this.k.put(I, c0177e3);
                                    }
                                } else if (Q.B1() && c0177e3.a == fVar2) {
                                    this.k.put(I, c0177e3);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean a0() {
        synchronized (this.w) {
            try {
                for (e.C0177e c0177e : this.j) {
                    if (ax.Q2.f.y0(c0177e.a) && c0177e.e == r.AVAILABLE) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c0() {
        if (this.b) {
            return;
        }
        this.b = true;
        R0();
        S0();
        T0();
        K0();
    }

    public static void d0(Context context) {
        if (z == null) {
            j jVar = new j(context);
            z = jVar;
            jVar.c0();
        }
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

    private boolean f0(ax.Q2.f fVar) {
        return fVar == ax.Q2.f.e1 || fVar == ax.Q2.f.f1 || fVar == ax.Q2.f.g1;
    }

    private boolean g0(ax.Q2.f fVar) {
        return fVar == ax.Q2.f.w0;
    }

    private void m(K k) {
        synchronized (this.u) {
            try {
                e0();
                if (!this.u.contains(k)) {
                    this.u.add(k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.q) {
            try {
                if (this.q.size() > 0) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    ArrayList<K> arrayList2 = this.q;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        K k = arrayList2.get(i);
                        i++;
                        arrayList.add(k.k());
                    }
                    this.q.clear();
                    Intent intent = new Intent("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED");
                    intent.putStringArrayListExtra("CHANGED_STORAGES", arrayList);
                    C3189g.a().e(intent);
                    y.fine("Local Storage Status Changed : Send Broadcast " + arrayList.size() + " locations");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void p(K k) {
        long j;
        synchronized (this.v) {
            try {
                if (u(k)) {
                    e G = G(k);
                    long j2 = 0;
                    if (k.e() == null) {
                        G.c = 0L;
                        G.d = 0L;
                        G.a = true;
                        return;
                    }
                    C3596o e2 = C1835x.e(ax.T2.h.b0(k));
                    try {
                        AbstractC3595n z2 = e2.z(e2.V());
                        if (z2.n()) {
                            List<AbstractC3595n> f0 = e2.f0(z2);
                            if (f0 != null) {
                                Iterator<AbstractC3595n> it = f0.iterator();
                                j = 0;
                                while (it.hasNext()) {
                                    j2 += it.next().p();
                                    j++;
                                }
                            } else {
                                j = 0;
                            }
                            G.c = j2;
                            G.d = j;
                            G.a = true;
                        }
                    } catch (C1495j unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(K k, r rVar) {
        int i;
        r put = this.r.put(k, rVar);
        if (rVar == r.AVAILABLE && ((i = d.a[k.d().ordinal()]) == 1 || i == 5 || i == 6)) {
            this.n = true;
        }
        if (put != rVar) {
            y.fine("Local Storage Status Changed : " + k + ":" + put + " -> " + rVar);
            synchronized (this.q) {
                this.q.add(k);
            }
        }
    }

    private void s(ax.Q2.f fVar) {
        switch (d.a[fVar.ordinal()]) {
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
                break;
            default:
                C3184b.f();
                break;
        }
    }

    private boolean s0() {
        if (this.f == null) {
            J0();
        }
        return this.f.f;
    }

    private boolean v(Uri uri) {
        try {
            Cursor query = this.a.getContentResolver().query(DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)), C1824l.g, null, null, null);
            if (query == null) {
                F.a(query);
                return false;
            }
            if (query.getCount() <= 0) {
                F.a(query);
                return false;
            }
            query.moveToNext();
            V0(L.q0(uri)).j(query.getString(1));
            F.a(query);
            return true;
        } catch (Exception unused) {
            F.a(null);
            return false;
        } catch (Throwable th) {
            F.a(null);
            throw th;
        }
    }

    private boolean x0() {
        if (D(K.a(ax.Q2.f.u0, 0)) == null) {
            L0();
        }
        return this.h;
    }

    private boolean z0(K k) {
        if (!this.k.containsKey(k)) {
            O0();
        }
        return C0(k);
    }

    public List<K> A() {
        ArrayList arrayList = null;
        for (K k : this.k.keySet()) {
            if (k.d() == ax.Q2.f.d1 || k.d() == ax.Q2.f.x0) {
                if (D(k) == r.AVAILABLE) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(k);
                }
            }
        }
        return arrayList;
    }

    public List<K> B() {
        K a2 = K.a(ax.Q2.f.u0, 0);
        K a3 = K.a(ax.Q2.f.b1, 0);
        if (D(a2) == r.AVAILABLE) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            return arrayList;
        }
        ArrayList arrayList2 = null;
        for (K k : this.k.keySet()) {
            if (k.d() == ax.Q2.f.v0 || k.d() == ax.Q2.f.c1) {
                if (D(k) == r.AVAILABLE) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(k);
                }
            }
        }
        if (arrayList2 != null || D(a3) != r.AVAILABLE) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(a3);
        return arrayList3;
    }

    public boolean B0(K k) {
        return this.k.containsKey(k);
    }

    public r D(K k) {
        s(k.d());
        return this.r.get(k);
    }

    public String E() {
        return ax.Q2.f.w();
    }

    public boolean E0(K k) {
        return Q.h() && Q.m0();
    }

    public void F0() {
        r rVar;
        if (ax.t3.j.w(this.a)) {
            String E = F().E();
            if (E != null) {
                rVar = r.AVAILABLE;
                K.g.i(E);
            } else {
                rVar = r.NOT_AVAILABLE;
            }
        } else {
            rVar = r.NOT_AVAILABLE;
        }
        r(K.g, rVar);
    }

    e G(K k) {
        if (!this.t.containsKey(k)) {
            this.t.put(k, new e());
        }
        return this.t.get(k);
    }

    public K J(String str, K k) {
        C3184b.c(d0.B(str));
        synchronized (this.u) {
            try {
                for (K k2 : C()) {
                    if (k2.e() != null && d0.H(k2.e(), str)) {
                        return k2;
                    }
                }
                return (k == null || !ax.Q2.f.j0(k.d())) ? K.h : k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String K(K k) {
        f fVar = this.x.get(k);
        if (fVar == null) {
            return null;
        }
        return fVar.c;
    }

    public synchronized void K0() {
        try {
            if (Q.S1()) {
                I0();
                J0();
                P0();
                M0();
            } else {
                I0();
                J0();
                L0();
                N0();
            }
            F0();
            n();
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<K> L() {
        ArrayList arrayList = new ArrayList();
        Iterator<K> it = this.x.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public f M(K k) {
        return this.x.get(k);
    }

    public Uri N(K k) {
        f fVar = this.x.get(k);
        if (fVar == null) {
            return null;
        }
        return fVar.a;
    }

    public String O() {
        if (this.c == null) {
            I0();
        }
        return this.c;
    }

    public float P() {
        return W(K.e);
    }

    public long Q() {
        long R = R(null);
        long j = this.s;
        if (j == -1 || R == -1) {
            this.s = R;
            return 0L;
        }
        long j2 = R - j;
        this.s = R;
        return j2;
    }

    public long R(K k) {
        if (k == null) {
            K k2 = K.e;
            if (!G(k2).a) {
                return -1L;
            }
            if (!F().t0()) {
                return G(k2).c;
            }
            K k3 = K.f;
            if (G(k3).a) {
                return G(k2).c + G(k3).c;
            }
            return -1L;
        }
        K k4 = K.e;
        if (k == k4) {
            if (G(k4).a) {
                return G(k4).c;
            }
            return -1L;
        }
        K k5 = K.f;
        if (k != k5) {
            ax.Ha.c.h().b("INVALID RECYCLE BIN LOCATION 2").g(k.toString()).h();
            return -1L;
        }
        if (G(k5).a) {
            return G(k5).c;
        }
        return -1L;
    }

    public e.C0177e S() {
        if (this.f == null) {
            J0();
        }
        return this.f;
    }

    public String T() {
        if (this.f == null) {
            J0();
        }
        return this.e;
    }

    public float U() {
        return W(K.f);
    }

    public void U0(K k, Uri uri, String str) {
        f fVar = this.x.get(k);
        if (fVar == null) {
            return;
        }
        fVar.b = uri;
        fVar.c = str;
    }

    public K V0(Uri uri) {
        int abs;
        String lastPathSegment = uri.getLastPathSegment();
        try {
            abs = Integer.parseInt(lastPathSegment);
        } catch (NumberFormatException unused) {
            abs = Math.abs(lastPathSegment.hashCode());
        }
        K a2 = K.a(ax.Q2.f.h1, abs);
        r(a2, r.AVAILABLE);
        f fVar = new f();
        fVar.a = uri;
        this.x.put(a2, fVar);
        return a2;
    }

    public float W(K k) {
        try {
            C3596o e2 = C1835x.e(k);
            if (!e2.a()) {
                e2.h(null);
            }
            k0 W = e2.W();
            if (W != null) {
                long j = W.b;
                if (j != 0) {
                    return (float) ((W.a * 100.0d) / j);
                }
            }
        } catch (C1495j unused) {
        }
        return -1.0f;
    }

    public String X(K k) {
        if (k.d() == ax.Q2.f.p0) {
            e.C0177e c0177e = this.f;
            if (c0177e != null) {
                return c0177e.h;
            }
            return null;
        }
        e.C0177e c0177e2 = this.k.get(k);
        if (c0177e2 != null) {
            return c0177e2.h;
        }
        return null;
    }

    public List<K> Y() {
        if (this.k.size() > 0) {
            return new ArrayList(this.k.keySet());
        }
        return null;
    }

    public String Z(K k) {
        e.C0177e c0177e;
        if (k.d() == ax.Q2.f.p0) {
            e.C0177e c0177e2 = this.f;
            if (c0177e2 != null) {
                return c0177e2.g;
            }
        } else if (k.d() == ax.Q2.f.o0) {
            e.C0177e c0177e3 = this.d;
            if (c0177e3 != null) {
                return c0177e3.g;
            }
        } else if (k.d() != ax.Q2.f.s0 && (c0177e = this.k.get(k)) != null) {
            return c0177e.g;
        }
        return null;
    }

    public boolean b0() {
        K k = K.f;
        r D = D(k);
        if (D == null) {
            J0();
            D = D(k);
        }
        return D != r.NO_DEVICE;
    }

    public boolean h0() {
        return l0(K.g);
    }

    public boolean i0() {
        return F().E() != null;
    }

    public boolean j0(K k) {
        ax.Q2.f d2 = k.d();
        if (d2 == ax.Q2.f.p0) {
            return s0();
        }
        if (d2 == ax.Q2.f.o0) {
            return true;
        }
        if (d2 == ax.Q2.f.x0 || d2 == ax.Q2.f.w0) {
            return C0(k);
        }
        if (d2 == ax.Q2.f.v0) {
            return z0(k);
        }
        if (d2 == ax.Q2.f.u0) {
            return x0();
        }
        return true;
    }

    public boolean k0(K k) {
        if (k.d() == ax.Q2.f.v0) {
            return A0(k);
        }
        return false;
    }

    public boolean l0(K k) {
        r D = D(k);
        if (D == null) {
            G0(k);
            D = D(k);
            if (D == null) {
                r(k, r.NOT_AVAILABLE);
            }
        }
        return D == r.AVAILABLE;
    }

    public boolean m0() {
        HashMap<String, UsbDevice> hashMap;
        try {
            try {
                hashMap = ((UsbManager) this.a.getSystemService("usb")).getDeviceList();
            } catch (BadParcelableException unused) {
                hashMap = null;
            }
        } catch (NullPointerException | NoSuchElementException unused2) {
        }
        if (hashMap == null) {
            return false;
        }
        for (UsbDevice usbDevice : hashMap.values()) {
            int interfaceCount = usbDevice.getInterfaceCount();
            for (int i = 0; i < interfaceCount; i++) {
                UsbInterface usbInterface = usbDevice.getInterface(i);
                if (usbInterface.getInterfaceClass() == 6 && usbInterface.getInterfaceSubclass() == 1 && usbInterface.getInterfaceProtocol() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean n0(Context context) {
        return P() >= ((float) ax.Q2.e.m(context));
    }

    public long o(K k) {
        if (k == null) {
            K k2 = K.e;
            p(k2);
            if (!F().t0()) {
                return G(k2).c;
            }
            K k3 = K.f;
            p(k3);
            return G(k2).c + G(k3).c;
        }
        if (k.d() == ax.Q2.f.o0) {
            K k4 = K.e;
            p(k4);
            return G(k4).c;
        }
        if (k.d() != ax.Q2.f.p0) {
            ax.Ha.c.h().b("INVALID RECYCLE BIN LOCATION 1").g(k.toString()).h();
            return -1L;
        }
        K k5 = K.f;
        p(k5);
        return G(k5).c;
    }

    public boolean o0() {
        if (this.d == null) {
            I0();
        }
        return this.d.c;
    }

    public boolean p0() {
        return this.s <= 0;
    }

    public boolean q() {
        return ax.t3.j.k(this.a) && q0();
    }

    public boolean q0() {
        if (this.p == null) {
            this.p = Boolean.valueOf(C3200r.g());
        }
        return this.p.booleanValue();
    }

    public boolean r0() {
        return (!F().o0() || F().b0() || F().w0()) ? false : true;
    }

    public void t() {
        if (Q.k1()) {
            if (!m0()) {
                if (this.x.size() > 0) {
                    Iterator<K> it = this.x.keySet().iterator();
                    while (it.hasNext()) {
                        r(it.next(), r.NOT_AVAILABLE);
                    }
                    this.x.clear();
                    return;
                }
                return;
            }
            try {
                boolean z2 = false;
                for (UriPermission uriPermission : this.a.getContentResolver().getPersistedUriPermissions()) {
                    if (uriPermission.isReadPermission() || uriPermission.isWritePermission()) {
                        Uri uri = uriPermission.getUri();
                        if (uri != null && "com.android.mtp.documents".equals(uri.getAuthority()) && v(uri)) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    n();
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean t0() {
        return l0(K.f);
    }

    boolean u(K k) {
        e G = G(k);
        try {
            long q = k.e() == null ? 0L : C1835x.e(ax.T2.h.b0(k)).z(J.b2(k)).q();
            if (q == G.b) {
                return false;
            }
            G.b = q;
            return true;
        } catch (C1495j unused) {
            return true;
        }
    }

    public boolean u0(Context context) {
        return U() >= ((float) ax.Q2.e.m(context));
    }

    public boolean v0() {
        if (Q.y0() && !F().b0()) {
            return ax.Q2.e.N();
        }
        return false;
    }

    public void w() {
        synchronized (this.v) {
            try {
                C3596o e2 = C1835x.e(ax.T2.h.b0(null));
                try {
                    ArrayList arrayList = new ArrayList();
                    AbstractC3595n z2 = e2.z(e2.V());
                    if (z2.n()) {
                        List<AbstractC3595n> f0 = e2.f0(z2);
                        long j = 0;
                        if (f0 != null) {
                            for (AbstractC3595n abstractC3595n : f0) {
                                if (abstractC3595n instanceof com.voxdon.xplorer.file.K) {
                                    com.voxdon.xplorer.file.K k = (com.voxdon.xplorer.file.K) abstractC3595n;
                                    j += k.p();
                                    if (System.currentTimeMillis() - k.q() > 5184000000L) {
                                        k.p();
                                        arrayList.add(k);
                                    }
                                } else {
                                    C3184b.f();
                                }
                            }
                        }
                        if (j < 2147483648L) {
                            return;
                        }
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            com.voxdon.xplorer.file.K k2 = (com.voxdon.xplorer.file.K) obj;
                            AbstractC3595n z3 = e2.z(k2.B1());
                            AbstractC3595n z4 = e2.z(k2.z1());
                            e2.m(z3);
                            e2.P(z4);
                        }
                    }
                } catch (C1495j e3) {
                    e3.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean w0() {
        if (this.f == null) {
            J0();
        }
        return this.f.c;
    }

    public void x() {
        G(K.e).b = 0L;
        if (F().t0()) {
            G(K.f).b = 0L;
        }
    }

    public void y() {
        if (ax.Q2.o.i().g()) {
            this.m = true;
            this.o = true;
            K0();
        }
    }

    boolean y0() {
        return ax.X2.J.B();
    }

    public List<K> z() {
        ArrayList arrayList = null;
        for (K k : this.k.keySet()) {
            if (Q.K0() && (f0(k.d()) || g0(k.d()))) {
                if (D(k) == r.AVAILABLE) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(k);
                }
            }
        }
        for (K k2 : L()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(k2);
        }
        return arrayList;
    }
}
