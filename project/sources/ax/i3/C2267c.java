package ax.i3;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.util.Log;
import ax.X2.Q;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* renamed from: ax.i3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2267c {
    private final WifiManager a;
    private Context b;

    public C2267c(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = (WifiManager) applicationContext.getSystemService("wifi");
    }

    public static EnumC2266b a(int i) {
        try {
            if (i < 0) {
                return EnumC2266b.WIFI_AP_STATE_FAILED;
            }
            if (i >= 10) {
                i -= 10;
            }
            return ((EnumC2266b[]) EnumC2266b.class.getEnumConstants())[i];
        } catch (Exception unused) {
            return EnumC2266b.WIFI_AP_STATE_FAILED;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String c() {
        /*
            r6 = this;
            r0 = 0
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L52
            r2 = r0
        L6:
            boolean r3 = r1.hasMoreElements()     // Catch: java.lang.Exception -> L4c
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.nextElement()     // Catch: java.lang.Exception -> L4c
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3     // Catch: java.lang.Exception -> L4c
            boolean r4 = r3.isLoopback()     // Catch: java.lang.Exception -> L4c
            if (r4 != 0) goto L6
            boolean r4 = r3.isUp()     // Catch: java.lang.Exception -> L4c
            if (r4 == 0) goto L6
            java.util.Enumeration r3 = r3.getInetAddresses()     // Catch: java.lang.Exception -> L4c
        L22:
            boolean r4 = r3.hasMoreElements()     // Catch: java.lang.Exception -> L4c
            if (r4 == 0) goto L6
            java.lang.Object r4 = r3.nextElement()     // Catch: java.lang.Exception -> L4c
            java.net.InetAddress r4 = (java.net.InetAddress) r4     // Catch: java.lang.Exception -> L4c
            boolean r5 = r4.isSiteLocalAddress()     // Catch: java.lang.Exception -> L4c
            if (r5 == 0) goto L22
            java.lang.String r4 = r4.getHostAddress()     // Catch: java.lang.Exception -> L4c
            if (r4 == 0) goto L22
            java.lang.String r5 = "192.168.43."
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Exception -> L4c
            if (r5 == 0) goto L43
            return r4
        L43:
            if (r2 != 0) goto L4e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4c
            r5.<init>()     // Catch: java.lang.Exception -> L4c
            r2 = r5
            goto L4e
        L4c:
            r1 = move-exception
            goto L54
        L4e:
            r2.add(r4)     // Catch: java.lang.Exception -> L4c
            goto L22
        L52:
            r1 = move-exception
            r2 = r0
        L54:
            r1.printStackTrace()
        L57:
            if (r2 == 0) goto L69
            java.lang.String r1 = "192.168."
            java.lang.String r1 = r6.e(r2, r1)
            if (r1 == 0) goto L62
            return r1
        L62:
            java.lang.String r1 = r6.d(r2)
            if (r1 == 0) goto L69
            return r1
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.i3.C2267c.c():java.lang.String");
    }

    private String d(ArrayList<String> arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            String str2 = str;
            if (str2 != null && !str2.contains(":") && str2.contains(".")) {
                return str2;
            }
        }
        return null;
    }

    private String e(ArrayList<String> arrayList, String str) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str2 = arrayList.get(i);
            i++;
            String str3 = str2;
            if (str3 != null && str3.startsWith(str)) {
                return str3;
            }
        }
        return null;
    }

    private boolean h() {
        return c() != null;
    }

    public String b() {
        String c;
        return (!Q.s() || (c = c()) == null) ? "192.168.43.1" : c;
    }

    public WifiConfiguration f() {
        try {
            return (WifiConfiguration) this.a.getClass().getMethod("getWifiApConfiguration", null).invoke(this.a, null);
        } catch (Exception e) {
            Log.e(getClass().toString(), HttpUrl.FRAGMENT_ENCODE_SET, e);
            return null;
        }
    }

    public EnumC2266b g() {
        if (Q.Q()) {
            return h() ? EnumC2266b.WIFI_AP_STATE_ENABLED : EnumC2266b.WIFI_AP_STATE_FAILED;
        }
        try {
            int intValue = ((Integer) this.a.getClass().getMethod("getWifiApState", null).invoke(this.a, null)).intValue();
            if (intValue >= 10) {
                intValue -= 10;
            }
            return ((EnumC2266b[]) EnumC2266b.class.getEnumConstants())[intValue];
        } catch (Exception e) {
            Log.e(getClass().toString(), HttpUrl.FRAGMENT_ENCODE_SET, e);
            return EnumC2266b.WIFI_AP_STATE_FAILED;
        }
    }
}
