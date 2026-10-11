/*
 * Decompiled with CFR 0.152.
 */
package ax.i3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import ax.Ha.c;
import ax.g3.f;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {
    private static a f;
    private static int g = -1;
    private List<f> a;
    private List<String> b;
    private int c;
    private NetworkInfo.State d;
    private BroadcastReceiver e = new BroadcastReceiver(this){
        final a a;
        {
            this.a = a8;
        }

        public void onReceive(Context context, Intent intent) {
            int n8 = this.a.c();
            intent = this.a.b(context);
            this.a.q((NetworkInfo)intent);
            if (this.a.i() && !this.a.k() && !this.a.l(n8)) {
                this.a.n(context);
            }
        }
    };

    private a() {
        this.a = new ArrayList<f>();
        this.b = new ArrayList<String>();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String d() {
        int n8;
        int n9;
        ArrayList<NetworkInterface> arrayList;
        try {
            arrayList = Collections.list(NetworkInterface.getNetworkInterfaces());
            n9 = arrayList.size();
            n8 = 0;
        }
        catch (Exception exception) {
            return null;
        }
        block8: while (n8 < n9) {
            int n10;
            Object object;
            block11: {
                object = arrayList.get(n8);
                n10 = n8 + 1;
                if (((NetworkInterface)object).getName().startsWith("eth")) break block11;
                n8 = n10;
                continue;
            }
            object = Collections.list(((NetworkInterface)object).getInetAddresses());
            int n11 = ((ArrayList)object).size();
            int n12 = 0;
            while (true) {
                n8 = n10;
                if (n12 >= n11) continue block8;
                Object object2 = ((ArrayList)object).get(n12);
                n8 = n12 + 1;
                object2 = (InetAddress)object2;
                n12 = n8;
                if (((InetAddress)object2).isLoopbackAddress()) continue;
                object2 = ((InetAddress)object2).getHostAddress();
                int n13 = ((String)object2).indexOf(58);
                n12 = n8;
                if (n13 < 0) return object2;
                continue;
                break;
            }
        }
        return null;
    }

    public static a e(Context context) {
        if (f == null) {
            ax.i3.a.h(context);
        }
        return f;
    }

    public static byte[] f(Context object) {
        WifiManager wifiManager = (WifiManager)object.getApplicationContext().getSystemService("wifi");
        int n8 = wifiManager != null ? wifiManager.getConnectionInfo().getIpAddress() : 0;
        if (n8 == 0 && ax.i3.a.j(object) && (object = ax.i3.a.d()) != null) {
            try {
                object = InetAddress.getByName((String)object).getAddress();
                return object;
            }
            catch (UnknownHostException unknownHostException) {
                // empty catch block
            }
        }
        int n9 = n8;
        if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            n9 = Integer.reverseBytes(n8);
        }
        return BigInteger.valueOf(n9).toByteArray();
    }

    public static void h(Context context) {
        if (f == null) {
            a a8;
            f = a8 = new a();
            a8.g(context);
        }
    }

    public static boolean j(Context context) {
        return (context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && context.getType() == 9 && context.isConnected();
    }

    public void a(f f8) {
        this.a.add(f8);
    }

    public NetworkInfo b(Context context) {
        block3: {
            try {
                context = (ConnectivityManager)context.getSystemService("connectivity");
                if (context != null) break block3;
                return null;
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
        }
        context = context.getActiveNetworkInfo();
        return context;
    }

    public int c() {
        return this.c;
    }

    public void g(Context context) {
        Context context2 = context.getApplicationContext();
        this.q(this.b(context));
        context = new IntentFilter();
        context.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        context.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            context2.registerReceiver(this.e, (IntentFilter)context);
            return;
        }
        catch (SecurityException securityException) {
            ax.Ha.c.h().f().b("CONNECTION MANAGER ERROR").l(securityException).h();
            return;
        }
    }

    public boolean i() {
        NetworkInfo.State state;
        return this.c != g && ((state = this.d) == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING);
    }

    public boolean k() {
        return this.b.size() > 0;
    }

    public boolean l(int n8) {
        return this.c == n8;
    }

    public boolean m() {
        int n8 = this.c;
        if (n8 == 1 && this.d == NetworkInfo.State.CONNECTED) {
            return true;
        }
        return n8 == 9 && this.d == NetworkInfo.State.CONNECTED;
    }

    public void n(Context object2) {
        if (this.a.size() > 0) {
            this.b.clear();
            for (f f8 : this.a) {
                this.b.add(f8.V());
                f8.q();
            }
        }
    }

    public void o(f f8) {
        this.p(f8.V());
        this.a.remove(f8);
    }

    public void p(String string) {
        this.b.remove(string);
    }

    public void q(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            this.c = g;
            this.d = null;
            return;
        }
        this.c = networkInfo.getType();
        this.d = networkInfo.getState();
    }
}

