package ax.i3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import ax.g3.f;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ax.i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2265a {
    private static C2265a f = null;
    private static int g = -1;
    private int c;
    private NetworkInfo.State d;
    private BroadcastReceiver e = new C0335a();
    private List<f> a = new ArrayList();
    private List<String> b = new ArrayList();

    /* renamed from: ax.i3.a$a, reason: collision with other inner class name */
    class C0335a extends BroadcastReceiver {
        C0335a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int c = C2265a.this.c();
            C2265a.this.q(C2265a.this.b(context));
            if (!C2265a.this.i() || C2265a.this.k() || C2265a.this.l(c)) {
                return;
            }
            C2265a.this.n(context);
        }
    }

    private C2265a() {
    }

    public static String d() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = list.get(i);
                i++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.getName().startsWith("eth")) {
                    ArrayList list2 = Collections.list(networkInterface.getInetAddresses());
                    int size2 = list2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = list2.get(i2);
                        i2++;
                        InetAddress inetAddress = (InetAddress) obj2;
                        if (!inetAddress.isLoopbackAddress()) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(58) < 0) {
                                return hostAddress;
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static C2265a e(Context context) {
        if (f == null) {
            h(context);
        }
        return f;
    }

    public static byte[] f(Context context) {
        String d;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        int ipAddress = wifiManager != null ? wifiManager.getConnectionInfo().getIpAddress() : 0;
        if (ipAddress == 0 && j(context) && (d = d()) != null) {
            try {
                return InetAddress.getByName(d).getAddress();
            } catch (UnknownHostException unused) {
            }
        }
        if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            ipAddress = Integer.reverseBytes(ipAddress);
        }
        return BigInteger.valueOf(ipAddress).toByteArray();
    }

    public static void h(Context context) {
        if (f == null) {
            C2265a c2265a = new C2265a();
            f = c2265a;
            c2265a.g(context);
        }
    }

    public static boolean j(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 9 && activeNetworkInfo.isConnected();
    }

    public void a(f fVar) {
        this.a.add(fVar);
    }

    public NetworkInfo b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public int c() {
        return this.c;
    }

    public void g(Context context) {
        Context applicationContext = context.getApplicationContext();
        q(b(context));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            applicationContext.registerReceiver(this.e, intentFilter);
        } catch (SecurityException e) {
            ax.Ha.c.h().f().b("CONNECTION MANAGER ERROR").l(e).h();
        }
    }

    public boolean i() {
        if (this.c == g) {
            return false;
        }
        NetworkInfo.State state = this.d;
        return state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING;
    }

    public boolean k() {
        return this.b.size() > 0;
    }

    public boolean l(int i) {
        return this.c == i;
    }

    public boolean m() {
        int i = this.c;
        if (i == 1 && this.d == NetworkInfo.State.CONNECTED) {
            return true;
        }
        return i == 9 && this.d == NetworkInfo.State.CONNECTED;
    }

    public void n(Context context) {
        if (this.a.size() > 0) {
            this.b.clear();
            for (f fVar : this.a) {
                this.b.add(fVar.V());
                fVar.q();
            }
        }
    }

    public void o(f fVar) {
        p(fVar.V());
        this.a.remove(fVar);
    }

    public void p(String str) {
        this.b.remove(str);
    }

    public void q(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            this.c = g;
            this.d = null;
        } else {
            this.c = networkInfo.getType();
            this.d = networkInfo.getState();
        }
    }
}
