/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.content.Context;
import android.net.wifi.WifiManager;

public class D {
    private WifiManager.WifiLock a;
    private int b;
    private String c;
    private Context d;

    public D(Context context, int n8, String string) {
        this.b = n8;
        this.c = string;
        this.d = context.getApplicationContext();
    }

    public void a() {
        if (this.a == null) {
            WifiManager wifiManager = (WifiManager)this.d.getSystemService("wifi");
            try {
                wifiManager = wifiManager.createWifiLock(this.b, this.c);
                this.a = wifiManager;
                wifiManager.setReferenceCounted(false);
                this.a.acquire();
                return;
            }
            catch (Exception exception) {
                this.a = null;
            }
        }
    }

    public boolean b() {
        return this.a != null;
    }

    public void c() {
        WifiManager.WifiLock wifiLock = this.a;
        if (wifiLock != null) {
            wifiLock.release();
            this.a = null;
        }
    }
}

