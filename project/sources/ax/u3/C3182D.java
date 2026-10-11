package ax.u3;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: ax.u3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3182D {
    private WifiManager.WifiLock a;
    private int b;
    private String c;
    private Context d;

    public C3182D(Context context, int i, String str) {
        this.b = i;
        this.c = str;
        this.d = context.getApplicationContext();
    }

    public void a() {
        if (this.a == null) {
            try {
                WifiManager.WifiLock createWifiLock = ((WifiManager) this.d.getSystemService("wifi")).createWifiLock(this.b, this.c);
                this.a = createWifiLock;
                createWifiLock.setReferenceCounted(false);
                this.a.acquire();
            } catch (Exception unused) {
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
