/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;
import android.os.Looper;
import ax.X2.Q;
import ax.o3.k;
import ax.o3.l;
import ax.o3.m;
import ax.o3.o;
import ax.u3.B;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class n {
    private static Logger l = Logger.getLogger("FileManager.TransferServiceDiscovery");
    private static int m;
    private static String n;
    private static int o;
    private Context a;
    private NsdManager b;
    private NsdManager.RegistrationListener c;
    private NsdManager.DiscoveryListener d;
    private h e = ax.o3.n$h.q;
    private j f;
    private InetAddress g;
    private String h;
    private Handler i;
    private Executor j;
    private j.ConcurrentHashMap<String, Object> k;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public n(Context context) {
        this.a = context;
        this.i = new Handler(Looper.getMainLooper());
        this.j = new Executor(this){
            final n q;
            {
                this.q = n8;
            }

            @Override
            public void execute(Runnable runnable2) {
                this.q.i.post(runnable2);
            }
        };
        this.k = new j.ConcurrentHashMap();
        try {
            this.b = (NsdManager)context.getSystemService("servicediscovery");
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }

    private void B(NsdServiceInfo nsdServiceInfo, NsdManager.DiscoveryListener discoveryListener, i i8) {
        block3: {
            String string = nsdServiceInfo.getServiceName();
            if (!this.k.containsKey((Object)string)) {
                NsdManager.ServiceInfoCallback serviceInfoCallback = new NsdManager.ServiceInfoCallback(){
                    final String a;
                    final NsdManager.DiscoveryListener b;
                    final NsdServiceInfo c;
                    final i d;
                    final n e;
                    {
                        this.e = n8;
                        this.a = string;
                        this.b = discoveryListener;
                        this.c = nsdServiceInfo;
                        this.d = i8;
                    }

                    public void onServiceInfoCallbackRegistrationFailed(int n8) {
                        Logger logger = l;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onService info callback registration failed :  ");
                        stringBuilder.append(this.a);
                        stringBuilder.append(", error: ");
                        stringBuilder.append(n8);
                        logger.fine(stringBuilder.toString());
                        this.e.C(this.a, this);
                        if (this.e.w(this.b)) {
                            this.e.D(this.c, this.b, this.d);
                        }
                    }

                    public void onServiceInfoCallbackUnregistered() {
                        this.e.C(this.a, this);
                    }

                    public void onServiceLost() {
                        this.e.C(this.a, this);
                        if (this.e.w(this.b)) {
                            this.d.a(this.a);
                        }
                    }

                    public void onServiceUpdated(NsdServiceInfo nsdServiceInfo) {
                        this.e.z(nsdServiceInfo, this.b, this.d);
                    }
                };
                this.k.put((Object)string, (Object)serviceInfoCallback);
                try {
                    ax.o3.i.a(this.b, nsdServiceInfo, this.j, serviceInfoCallback);
                    return;
                }
                catch (LinkageError | RuntimeException throwable) {
                    this.k.remove((Object)string);
                    if (!this.w(discoveryListener)) break block3;
                    this.D(nsdServiceInfo, discoveryListener, i8);
                }
            }
        }
    }

    private void C(String string, Object object) {
        if (this.k.get((Object)string) == object) {
            this.k.remove((Object)string);
        }
    }

    private void D(NsdServiceInfo nsdServiceInfo, NsdManager.DiscoveryListener discoveryListener, i i8) {
        this.b.resolveService(nsdServiceInfo, new NsdManager.ResolveListener(){
            final NsdManager.DiscoveryListener a;
            final i b;
            final n c;
            {
                this.c = n8;
                this.a = discoveryListener;
                this.b = i8;
            }

            public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int n8) {
                Logger logger = l;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onService resolve failed :  ");
                stringBuilder.append(nsdServiceInfo.getServiceName());
                stringBuilder.append(", error: ");
                stringBuilder.append(n8);
                logger.fine(stringBuilder.toString());
            }

            public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
                this.c.z(nsdServiceInfo, this.a, this.b);
            }
        });
    }

    private void E(NsdServiceInfo nsdServiceInfo, InetAddress inetAddress) {
        if (Q.p1()) {
            ax.o3.l.a(nsdServiceInfo, Collections.singletonList(inetAddress));
            return;
        }
        nsdServiceInfo.setHost(inetAddress);
    }

    private void G(NsdManager.DiscoveryListener discoveryListener) {
        NsdManager nsdManager = this.b;
        if (nsdManager != null && discoveryListener != null) {
            try {
                nsdManager.stopServiceDiscovery(discoveryListener);
                return;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                l.severe("DISCOVERY NOT STOPPED 2");
                this.t(discoveryListener);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                l.severe("DISCOVERY NOT STOPPED 1");
                this.t(discoveryListener);
            }
            return;
        }
        this.t(discoveryListener);
    }

    private void I() {
        if (!this.k.isEmpty()) {
            Object[] objectArray = this.k.values().toArray();
            this.k.clear();
            if (Q.p1()) {
                for (Object object : objectArray) {
                    try {
                        ax.o3.k.a(this.b, ax.o3.j.a(object));
                    }
                    catch (ClassCastException | IllegalArgumentException | LinkageError throwable) {
                        l.fine("unregister service info callback failed");
                    }
                }
            }
        }
    }

    private void K(String string) {
        Object object = this.k.remove((Object)string);
        if (object != null && Q.p1()) {
            try {
                ax.o3.k.a(this.b, ax.o3.j.a(object));
                return;
            }
            catch (ClassCastException | IllegalArgumentException | LinkageError throwable) {
                Logger logger = l;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unregister service info callback failed : ");
                stringBuilder.append(string);
                logger.fine(stringBuilder.toString());
            }
        }
    }

    static /* synthetic */ String j(n n8, String string) {
        n8.h = string;
        return string;
    }

    static /* synthetic */ NsdManager.RegistrationListener k(n n8, NsdManager.RegistrationListener registrationListener) {
        n8.c = registrationListener;
        return registrationListener;
    }

    static /* synthetic */ h o(n n8, h h8) {
        n8.e = h8;
        return h8;
    }

    static /* synthetic */ j q(n n8, j j8) {
        n8.f = j8;
        return j8;
    }

    private void t(NsdManager.DiscoveryListener object) {
        if (object != null && this.d != object) {
            return;
        }
        this.I();
        this.d = null;
        this.e = ax.o3.n$h.q;
        object = this.f;
        this.f = null;
        this.y((j)object);
    }

    private InetAddress u(NsdServiceInfo object) {
        if (Q.p1()) {
            if (!(object = ax.o3.m.a((NsdServiceInfo)object)).isEmpty()) {
                return (InetAddress)object.get(0);
            }
            return null;
        }
        return object.getHost();
    }

    private boolean w(NsdManager.DiscoveryListener discoveryListener) {
        return this.d == discoveryListener && this.e == ax.o3.n$h.d0;
    }

    private void y(j j8) {
        if (j8 != null) {
            B.Z(this.i, new Runnable(){
                final n c0;
                final j q;
                {
                    this.c0 = n8;
                    this.q = j8;
                }

                @Override
                public void run() {
                    this.q.a();
                }
            });
        }
    }

    private void z(NsdServiceInfo object, NsdManager.DiscoveryListener object2, i object3) {
        if (this.w((NsdManager.DiscoveryListener)object2)) {
            InetAddress inetAddress = this.u((NsdServiceInfo)object);
            if (inetAddress == null) {
                object3 = l;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("onService resolved host is null :  ");
                ((StringBuilder)object2).append(object.getServiceName());
                ((Logger)object3).fine(((StringBuilder)object2).toString());
                return;
            }
            Serializable serializable = this.g;
            if (serializable != null && ((InetAddress)serializable).equals(inetAddress)) {
                l.fine("Ignore this device (same ip)");
                return;
            }
            Logger logger = l;
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("onService resolved :  ");
            ((StringBuilder)serializable).append(object.getServiceName());
            ((StringBuilder)serializable).append(",");
            ((StringBuilder)serializable).append(inetAddress);
            ((StringBuilder)serializable).append(",");
            ((StringBuilder)serializable).append(object.getPort());
            logger.fine(((StringBuilder)serializable).toString());
            object = ax.o3.o.b(object.getServiceName(), inetAddress, object.getPort(), object.getAttributes());
            if (object != null) {
                this.i.post(new Runnable(){
                    final i c0;
                    final o d0;
                    final n e0;
                    final NsdManager.DiscoveryListener q;
                    {
                        this.e0 = n8;
                        this.q = discoveryListener;
                        this.c0 = i8;
                        this.d0 = o8;
                    }

                    @Override
                    public void run() {
                        if (this.e0.w(this.q)) {
                            this.c0.b(this.d0);
                        }
                    }
                });
            }
        }
    }

    public void A(String registrationListener, int n8) {
        block5: {
            if (this.c == null && this.b != null) {
                UnknownHostException unknownHostException2;
                block4: {
                    try {
                        this.g = InetAddress.getByName((String)registrationListener);
                        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
                        int n9 = this.v((String)registrationListener, n8);
                        String string = ax.o3.o.a(this.a, n9);
                        nsdServiceInfo.setServiceName(string);
                        nsdServiceInfo.setServiceType("_fmtransferftp._tcp.");
                        this.E(nsdServiceInfo, this.g);
                        nsdServiceInfo.setPort(n8);
                        nsdServiceInfo.setAttribute("PROTOCOL", "FTPS");
                        this.c = registrationListener = new NsdManager.RegistrationListener(){
                            final String a;
                            final n b;
                            {
                                this.b = n8;
                                this.a = string;
                            }

                            public void onRegistrationFailed(NsdServiceInfo object, int n8) {
                                object = l;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("NSD Registraction failed :");
                                stringBuilder.append(n8);
                                ((Logger)object).fine(stringBuilder.toString());
                                ax.o3.n.k(this.b, null);
                            }

                            public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                                Logger logger = l;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("service registered: ");
                                stringBuilder.append(this.a);
                                logger.fine(stringBuilder.toString());
                                ax.o3.n.j(this.b, nsdServiceInfo.getServiceName());
                            }

                            public void onServiceUnregistered(NsdServiceInfo object) {
                                Logger logger = l;
                                object = new StringBuilder();
                                ((StringBuilder)object).append("service unregistered: ");
                                ((StringBuilder)object).append(this.a);
                                logger.fine(((StringBuilder)object).toString());
                                ax.o3.n.k(this.b, null);
                                ax.o3.n.j(this.b, null);
                            }

                            public void onUnregistrationFailed(NsdServiceInfo object, int n8) {
                                Logger logger = l;
                                object = new StringBuilder();
                                ((StringBuilder)object).append("NSD Unregistraction failed :");
                                ((StringBuilder)object).append(n8);
                                logger.fine(((StringBuilder)object).toString());
                            }
                        };
                        this.b.registerService(nsdServiceInfo, 1, registrationListener);
                        return;
                    }
                    catch (RuntimeException runtimeException) {
                    }
                    catch (UnknownHostException unknownHostException2) {
                        break block4;
                    }
                    runtimeException.printStackTrace();
                    ax.Ha.c.h().f().b("TransferServiceDiscovery.registerService").l(runtimeException).h();
                    break block5;
                }
                unknownHostException2.printStackTrace();
            }
        }
    }

    public void F(i object) {
        if (this.e == ax.o3.n$h.q && object != null && this.b != null) {
            this.e = ax.o3.n$h.c0;
            object = new NsdManager.DiscoveryListener(){
                final i a;
                final n b;
                {
                    this.b = n8;
                    this.a = i8;
                }

                public void onDiscoveryStarted(String string) {
                    l.fine("on discovery started");
                    if (this.b.d == this) {
                        if (this.b.e == ax.o3.n$h.e0) {
                            this.b.G(this);
                            return;
                        }
                        if (this.b.e == ax.o3.n$h.c0) {
                            ax.o3.n.o(this.b, ax.o3.n$h.d0);
                        }
                    }
                }

                public void onDiscoveryStopped(String string) {
                    l.fine("on discovery stopped");
                    this.b.t(this);
                }

                public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
                    if (!this.b.w(this)) {
                        return;
                    }
                    if (this.b.h != null && this.b.h.equals(nsdServiceInfo.getServiceName())) {
                        l.fine("Ignore this device (same name)");
                        return;
                    }
                    Logger logger = l;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onService Found :  ");
                    stringBuilder.append(nsdServiceInfo.getServiceName());
                    logger.fine(stringBuilder.toString());
                    if (Q.p1()) {
                        this.b.B(nsdServiceInfo, this, this.a);
                        return;
                    }
                    this.b.D(nsdServiceInfo, this, this.a);
                }

                public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
                    if (!this.b.w(this)) {
                        return;
                    }
                    if (this.b.h != null && this.b.h.equals(nsdServiceInfo.getServiceName())) {
                        l.fine("Ignore this device on lost (same name)");
                        return;
                    }
                    Logger logger = l;
                    CharSequence charSequence = new StringBuilder();
                    charSequence.append("onService Lost :  ");
                    charSequence.append(nsdServiceInfo.getServiceName());
                    charSequence.append(",");
                    charSequence.append(this.b.u(nsdServiceInfo));
                    charSequence.append(",");
                    charSequence.append(nsdServiceInfo.getPort());
                    logger.fine(charSequence.toString());
                    charSequence = nsdServiceInfo.getServiceName();
                    nsdServiceInfo = this.b.d;
                    this.b.K((String)charSequence);
                    B.Z(this.b.i, new Runnable(){
                        final String c0;
                        final c d0;
                        final NsdManager.DiscoveryListener q;
                        {
                            this.d0 = c8;
                            this.q = discoveryListener;
                            this.c0 = string;
                        }

                        @Override
                        public void run() {
                            if (this.d0.b.w(this.q)) {
                                this.d0.a.a(this.c0);
                            }
                        }
                    });
                }

                public void onStartDiscoveryFailed(String charSequence, int n8) {
                    Logger logger = l;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("onStartDiscovery failed : ");
                    ((StringBuilder)charSequence).append(n8);
                    logger.fine(((StringBuilder)charSequence).toString());
                    this.b.t(this);
                }

                public void onStopDiscoveryFailed(String charSequence, int n8) {
                    Logger logger = l;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("onStopDiscovery failed : ");
                    ((StringBuilder)charSequence).append(n8);
                    logger.fine(((StringBuilder)charSequence).toString());
                    if (this.b.d == this && this.b.e == ax.o3.n$h.e0) {
                        ax.o3.n.o(this.b, ax.o3.n$h.d0);
                        ax.o3.n.q(this.b, null);
                    }
                }
            };
            this.d = object;
            try {
                this.b.discoverServices("_fmtransferftp._tcp.", 1, (NsdManager.DiscoveryListener)object);
                return;
            }
            catch (RuntimeException runtimeException) {
                l.severe("DISCOVERY START FAILED");
                this.t(this.d);
            }
        }
    }

    public void H(j j8) {
        if (this.b == null) {
            this.y(j8);
            return;
        }
        h h8 = this.e;
        if (h8 != ax.o3.n$h.q && this.d != null) {
            h h9 = ax.o3.n$h.e0;
            if (h8 == h9) {
                if (j8 != null) {
                    this.f = j8;
                    return;
                }
            } else {
                this.e = h9;
                this.f = j8;
                this.I();
                if (h8 == ax.o3.n$h.d0) {
                    this.G(this.d);
                }
            }
            return;
        }
        this.y(j8);
    }

    public void J() {
        NsdManager.RegistrationListener registrationListener;
        NsdManager nsdManager = this.b;
        if (nsdManager != null && (registrationListener = this.c) != null) {
            nsdManager.unregisterService(registrationListener);
        }
    }

    public void s() {
        this.f = null;
    }

    public int v(String string, int n8) {
        if (m == 0 || n8 != o || !B.j(string, n)) {
            m = new Random().nextInt(900000) + 100000;
            n = string;
            o = n8;
        }
        return m;
    }

    public boolean x() {
        return this.e != ax.o3.n$h.q;
    }

    private static final class h
    extends Enum<h> {
        public static final /* enum */ h c0;
        public static final /* enum */ h d0;
        public static final /* enum */ h e0;
        private static final h[] f0;
        public static final /* enum */ h q;

        static {
            q = new h();
            c0 = new h();
            d0 = new h();
            e0 = new h();
            f0 = ax.o3.n$h.d();
        }

        private static /* synthetic */ h[] d() {
            return new h[]{q, c0, d0, e0};
        }

        public static h valueOf(String string) {
            return Enum.valueOf(h.class, string);
        }

        public static h[] values() {
            return (h[])f0.clone();
        }
    }

    public static interface i {
        public void a(String var1);

        public void b(o var1);
    }

    public static interface j {
        public void a();
    }
}

