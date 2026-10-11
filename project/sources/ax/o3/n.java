package ax.o3;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;
import android.os.Looper;
import ax.X2.Q;
import ax.u3.C3180B;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class n {
    private static Logger l = Logger.getLogger("FileManager.TransferServiceDiscovery");
    private static int m;
    private static String n;
    private static int o;
    private Context a;
    private NsdManager b;
    private NsdManager.RegistrationListener c;
    private NsdManager.DiscoveryListener d;
    private j f;
    private InetAddress g;
    private String h;
    private h e = h.NO_DISCOVERY;
    private Handler i = new Handler(Looper.getMainLooper());
    private Executor j = new a();
    private ConcurrentHashMap<String, Object> k = new ConcurrentHashMap<>();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            n.this.i.post(runnable);
        }
    }

    class b implements NsdManager.RegistrationListener {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            n.l.fine("NSD Registraction failed :" + i);
            n.this.c = null;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            n.l.fine("service registered: " + this.a);
            n.this.h = nsdServiceInfo.getServiceName();
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            n.l.fine("service unregistered: " + this.a);
            n.this.c = null;
            n.this.h = null;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            n.l.fine("NSD Unregistraction failed :" + i);
        }
    }

    class c implements NsdManager.DiscoveryListener {
        final /* synthetic */ i a;

        class a implements Runnable {
            final /* synthetic */ String c0;
            final /* synthetic */ NsdManager.DiscoveryListener q;

            a(NsdManager.DiscoveryListener discoveryListener, String str) {
                this.q = discoveryListener;
                this.c0 = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (n.this.w(this.q)) {
                    c.this.a.a(this.c0);
                }
            }
        }

        c(i iVar) {
            this.a = iVar;
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String str) {
            n.l.fine("on discovery started");
            if (n.this.d != this) {
                return;
            }
            if (n.this.e == h.DISCOVERY_STOPPING) {
                n.this.G(this);
            } else if (n.this.e == h.DISCOVERY_STARTING) {
                n.this.e = h.DISCOVERY_STARTED;
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String str) {
            n.l.fine("on discovery stopped");
            n.this.t(this);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            if (n.this.w(this)) {
                if (n.this.h != null && n.this.h.equals(nsdServiceInfo.getServiceName())) {
                    n.l.fine("Ignore this device (same name)");
                    return;
                }
                n.l.fine("onService Found :  " + nsdServiceInfo.getServiceName());
                if (Q.p1()) {
                    n.this.B(nsdServiceInfo, this, this.a);
                } else {
                    n.this.D(nsdServiceInfo, this, this.a);
                }
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            if (n.this.w(this)) {
                if (n.this.h != null && n.this.h.equals(nsdServiceInfo.getServiceName())) {
                    n.l.fine("Ignore this device on lost (same name)");
                    return;
                }
                n.l.fine("onService Lost :  " + nsdServiceInfo.getServiceName() + "," + n.this.u(nsdServiceInfo) + "," + nsdServiceInfo.getPort());
                String serviceName = nsdServiceInfo.getServiceName();
                NsdManager.DiscoveryListener discoveryListener = n.this.d;
                n.this.K(serviceName);
                C3180B.Z(n.this.i, new a(discoveryListener, serviceName));
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String str, int i) {
            n.l.fine("onStartDiscovery failed : " + i);
            n.this.t(this);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String str, int i) {
            n.l.fine("onStopDiscovery failed : " + i);
            if (n.this.d == this && n.this.e == h.DISCOVERY_STOPPING) {
                n.this.e = h.DISCOVERY_STARTED;
                n.this.f = null;
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ j q;

        d(j jVar) {
            this.q = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.a();
        }
    }

    class e implements NsdManager.ServiceInfoCallback {
        final /* synthetic */ String a;
        final /* synthetic */ NsdManager.DiscoveryListener b;
        final /* synthetic */ NsdServiceInfo c;
        final /* synthetic */ i d;

        e(String str, NsdManager.DiscoveryListener discoveryListener, NsdServiceInfo nsdServiceInfo, i iVar) {
            this.a = str;
            this.b = discoveryListener;
            this.c = nsdServiceInfo;
            this.d = iVar;
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceInfoCallbackRegistrationFailed(int i) {
            n.l.fine("onService info callback registration failed :  " + this.a + ", error: " + i);
            n.this.C(this.a, this);
            if (n.this.w(this.b)) {
                n.this.D(this.c, this.b, this.d);
            }
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceInfoCallbackUnregistered() {
            n.this.C(this.a, this);
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceLost() {
            n.this.C(this.a, this);
            if (n.this.w(this.b)) {
                this.d.a(this.a);
            }
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceUpdated(NsdServiceInfo nsdServiceInfo) {
            n.this.z(nsdServiceInfo, this.b, this.d);
        }
    }

    class f implements NsdManager.ResolveListener {
        final /* synthetic */ NsdManager.DiscoveryListener a;
        final /* synthetic */ i b;

        f(NsdManager.DiscoveryListener discoveryListener, i iVar) {
            this.a = discoveryListener;
            this.b = iVar;
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
            n.l.fine("onService resolve failed :  " + nsdServiceInfo.getServiceName() + ", error: " + i);
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
            n.this.z(nsdServiceInfo, this.a, this.b);
        }
    }

    class g implements Runnable {
        final /* synthetic */ i c0;
        final /* synthetic */ o d0;
        final /* synthetic */ NsdManager.DiscoveryListener q;

        g(NsdManager.DiscoveryListener discoveryListener, i iVar, o oVar) {
            this.q = discoveryListener;
            this.c0 = iVar;
            this.d0 = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n.this.w(this.q)) {
                this.c0.b(this.d0);
            }
        }
    }

    private enum h {
        NO_DISCOVERY,
        DISCOVERY_STARTING,
        DISCOVERY_STARTED,
        DISCOVERY_STOPPING
    }

    public interface i {
        void a(String str);

        void b(o oVar);
    }

    public interface j {
        void a();
    }

    public n(Context context) {
        this.a = context;
        try {
            this.b = (NsdManager) context.getSystemService("servicediscovery");
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(NsdServiceInfo nsdServiceInfo, NsdManager.DiscoveryListener discoveryListener, i iVar) {
        String serviceName = nsdServiceInfo.getServiceName();
        if (this.k.containsKey(serviceName)) {
            return;
        }
        e eVar = new e(serviceName, discoveryListener, nsdServiceInfo, iVar);
        this.k.put(serviceName, eVar);
        try {
            this.b.registerServiceInfoCallback(nsdServiceInfo, this.j, eVar);
        } catch (LinkageError | RuntimeException unused) {
            this.k.remove(serviceName);
            if (w(discoveryListener)) {
                D(nsdServiceInfo, discoveryListener, iVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(String str, Object obj) {
        if (this.k.get(str) == obj) {
            this.k.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(NsdServiceInfo nsdServiceInfo, NsdManager.DiscoveryListener discoveryListener, i iVar) {
        this.b.resolveService(nsdServiceInfo, new f(discoveryListener, iVar));
    }

    private void E(NsdServiceInfo nsdServiceInfo, InetAddress inetAddress) {
        if (Q.p1()) {
            nsdServiceInfo.setHostAddresses(Collections.singletonList(inetAddress));
        } else {
            nsdServiceInfo.setHost(inetAddress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(NsdManager.DiscoveryListener discoveryListener) {
        NsdManager nsdManager = this.b;
        if (nsdManager == null || discoveryListener == null) {
            t(discoveryListener);
            return;
        }
        try {
            nsdManager.stopServiceDiscovery(discoveryListener);
        } catch (ArrayIndexOutOfBoundsException unused) {
            l.severe("DISCOVERY NOT STOPPED 2");
            t(discoveryListener);
        } catch (IllegalArgumentException unused2) {
            l.severe("DISCOVERY NOT STOPPED 1");
            t(discoveryListener);
        }
    }

    private void I() {
        if (this.k.isEmpty()) {
            return;
        }
        Object[] array = this.k.values().toArray();
        this.k.clear();
        if (Q.p1()) {
            for (Object obj : array) {
                try {
                    this.b.unregisterServiceInfoCallback(ax.o3.j.a(obj));
                } catch (ClassCastException | IllegalArgumentException | LinkageError unused) {
                    l.fine("unregister service info callback failed");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(String str) {
        Object remove = this.k.remove(str);
        if (remove != null && Q.p1()) {
            try {
                this.b.unregisterServiceInfoCallback(ax.o3.j.a(remove));
            } catch (ClassCastException | IllegalArgumentException | LinkageError unused) {
                l.fine("unregister service info callback failed : " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(NsdManager.DiscoveryListener discoveryListener) {
        if (discoveryListener == null || this.d == discoveryListener) {
            I();
            this.d = null;
            this.e = h.NO_DISCOVERY;
            j jVar = this.f;
            this.f = null;
            y(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InetAddress u(NsdServiceInfo nsdServiceInfo) {
        List hostAddresses;
        if (!Q.p1()) {
            return nsdServiceInfo.getHost();
        }
        hostAddresses = nsdServiceInfo.getHostAddresses();
        if (hostAddresses.isEmpty()) {
            return null;
        }
        return (InetAddress) hostAddresses.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w(NsdManager.DiscoveryListener discoveryListener) {
        return this.d == discoveryListener && this.e == h.DISCOVERY_STARTED;
    }

    private void y(j jVar) {
        if (jVar != null) {
            C3180B.Z(this.i, new d(jVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(NsdServiceInfo nsdServiceInfo, NsdManager.DiscoveryListener discoveryListener, i iVar) {
        if (w(discoveryListener)) {
            InetAddress u = u(nsdServiceInfo);
            if (u == null) {
                l.fine("onService resolved host is null :  " + nsdServiceInfo.getServiceName());
                return;
            }
            InetAddress inetAddress = this.g;
            if (inetAddress != null && inetAddress.equals(u)) {
                l.fine("Ignore this device (same ip)");
                return;
            }
            l.fine("onService resolved :  " + nsdServiceInfo.getServiceName() + "," + u + "," + nsdServiceInfo.getPort());
            o b2 = o.b(nsdServiceInfo.getServiceName(), u, nsdServiceInfo.getPort(), nsdServiceInfo.getAttributes());
            if (b2 != null) {
                this.i.post(new g(discoveryListener, iVar, b2));
            }
        }
    }

    public void A(String str, int i2) {
        if (this.c == null && this.b != null) {
            try {
                this.g = InetAddress.getByName(str);
                NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
                String a2 = o.a(this.a, v(str, i2));
                nsdServiceInfo.setServiceName(a2);
                nsdServiceInfo.setServiceType("_fmtransferftp._tcp.");
                E(nsdServiceInfo, this.g);
                nsdServiceInfo.setPort(i2);
                nsdServiceInfo.setAttribute("PROTOCOL", "FTPS");
                b bVar = new b(a2);
                this.c = bVar;
                this.b.registerService(nsdServiceInfo, 1, bVar);
            } catch (RuntimeException e2) {
                e2.printStackTrace();
                ax.Ha.c.h().f().b("TransferServiceDiscovery.registerService").l(e2).h();
            } catch (UnknownHostException e3) {
                e3.printStackTrace();
            }
        }
    }

    public void F(i iVar) {
        if (this.e != h.NO_DISCOVERY || iVar == null || this.b == null) {
            return;
        }
        this.e = h.DISCOVERY_STARTING;
        c cVar = new c(iVar);
        this.d = cVar;
        try {
            this.b.discoverServices("_fmtransferftp._tcp.", 1, cVar);
        } catch (RuntimeException unused) {
            l.severe("DISCOVERY START FAILED");
            t(this.d);
        }
    }

    public void H(j jVar) {
        if (this.b == null) {
            y(jVar);
            return;
        }
        h hVar = this.e;
        if (hVar == h.NO_DISCOVERY || this.d == null) {
            y(jVar);
            return;
        }
        h hVar2 = h.DISCOVERY_STOPPING;
        if (hVar == hVar2) {
            if (jVar != null) {
                this.f = jVar;
            }
        } else {
            this.e = hVar2;
            this.f = jVar;
            I();
            if (hVar == h.DISCOVERY_STARTED) {
                G(this.d);
            }
        }
    }

    public void J() {
        NsdManager.RegistrationListener registrationListener;
        NsdManager nsdManager = this.b;
        if (nsdManager == null || (registrationListener = this.c) == null) {
            return;
        }
        nsdManager.unregisterService(registrationListener);
    }

    public void s() {
        this.f = null;
    }

    public int v(String str, int i2) {
        if (m == 0 || i2 != o || !C3180B.j(str, n)) {
            m = new Random().nextInt(900000) + 100000;
            n = str;
            o = i2;
        }
        return m;
    }

    public boolean x() {
        return this.e != h.NO_DISCOVERY;
    }
}
