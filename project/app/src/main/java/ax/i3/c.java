/*
 * Decompiled with CFR 0.152.
 */
package ax.i3;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.util.Log;
import ax.X2.Q;
import ax.i3.b;
import java.net.NetworkInterface;
import java.util.ArrayList;

public class c {
    private final WifiManager a;
    private Context b;

    public c(Context context) {
        this.b = context = context.getApplicationContext();
        this.a = (WifiManager)context.getSystemService("wifi");
    }

    public static b a(int n8) {
        if (n8 < 0) {
            return ax.i3.b.f0;
        }
        int n9 = n8;
        if (n8 >= 10) {
            n9 = n8 - 10;
        }
        try {
            b b8 = ((b[])b.class.getEnumConstants())[n9];
            return b8;
        }
        catch (Exception exception) {
            return ax.i3.b.f0;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String c() {
        try {
            var4_1 = NetworkInterface.getNetworkInterfaces();
            var2_2 = null;
        }
        catch (Exception var2_4) {
            var1_6 = null;
            ** GOTO lbl24
        }
        block4: while (true) {
            block12: {
                block11: {
                    var1_6 = var2_2;
                    var3_7 = var2_2;
                    try {
                        if (!var4_1.hasMoreElements()) break block11;
                        var1_6 = var2_2;
                        var3_7 = var4_1.nextElement();
                        var1_6 = var2_2;
                        if (var3_7.isLoopback()) continue;
                        var1_6 = var2_2;
                        if (!var3_7.isUp()) continue;
                        var1_6 = var2_2;
                        var5_8 = var3_7.getInetAddresses();
                        var3_7 = var2_2;
                        break block12;
                    }
                    catch (Exception var2_3) {}
lbl24:
                    // 2 sources

                    var2_5.printStackTrace();
                    var3_7 = var1_6;
                }
                if (var3_7 != null) {
                    var1_6 = this.e(var3_7, "192.168.");
                    if (var1_6 != null) {
                        return var1_6;
                    }
                    var1_6 = this.d(var3_7);
                    if (var1_6 != null) {
                        return var1_6;
                    }
                }
                return null;
            }
            while (true) {
                var2_2 = var3_7;
                var1_6 = var3_7;
                if (var5_8.hasMoreElements()) ** break;
                continue block4;
                var1_6 = var3_7;
                var2_2 = var5_8.nextElement();
                var1_6 = var3_7;
                if (!var2_2.isSiteLocalAddress()) continue;
                var1_6 = var3_7;
                var6_9 = var2_2.getHostAddress();
                if (var6_9 == null) continue;
                var1_6 = var3_7;
                if (var6_9.startsWith("192.168.43.")) {
                    return var6_9;
                }
                var2_2 = var3_7;
                if (var3_7 == null) {
                    var1_6 = var3_7;
                    var1_6 = var3_7;
                    var2_2 = new ArrayList<String>();
                }
                var1_6 = var2_2;
                var2_2.add(var6_9);
                var3_7 = var2_2;
            }
            break;
        }
    }

    private String d(ArrayList<String> arrayList) {
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            int n10;
            String string = arrayList.get(n9);
            n9 = n10 = n9 + 1;
            if (string == null) continue;
            n9 = n10;
            if (string.contains(":")) continue;
            n9 = n10;
            if (!string.contains(".")) continue;
            return string;
        }
        return null;
    }

    private String e(ArrayList<String> arrayList, String string) {
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            int n10;
            String string2 = arrayList.get(n9);
            n9 = n10 = n9 + 1;
            if (string2 == null) continue;
            n9 = n10;
            if (!string2.startsWith(string)) continue;
            return string2;
        }
        return null;
    }

    private boolean h() {
        return this.c() != null;
    }

    public String b() {
        String string;
        if (Q.s() && (string = this.c()) != null) {
            return string;
        }
        return "192.168.43.1";
    }

    public WifiConfiguration f() {
        try {
            WifiConfiguration wifiConfiguration = (WifiConfiguration)this.a.getClass().getMethod("getWifiApConfiguration", null).invoke(this.a, null);
            return wifiConfiguration;
        }
        catch (Exception exception) {
            Log.e((String)this.getClass().toString(), (String)"", (Throwable)exception);
            return null;
        }
    }

    public b g() {
        int n8;
        block5: {
            if (Q.Q()) {
                if (this.h()) {
                    return ax.i3.b.e0;
                }
                return ax.i3.b.f0;
            }
            try {
                int n9;
                n8 = n9 = ((Integer)this.a.getClass().getMethod("getWifiApState", null).invoke(this.a, null)).intValue();
                if (n9 < 10) break block5;
                n8 = n9 - 10;
            }
            catch (Exception exception) {
                Log.e((String)this.getClass().toString(), (String)"", (Throwable)exception);
                return ax.i3.b.f0;
            }
        }
        b b8 = ((b[])b.class.getEnumConstants())[n8];
        return b8;
    }
}

