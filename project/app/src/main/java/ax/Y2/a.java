/*
 * Decompiled with CFR 0.152.
 */
package ax.Y2;

import android.content.Context;
import ax.Q2.b;
import ax.Q2.f;
import ax.c3.g;
import java.util.HashMap;

public class a {
    private static a c;
    private HashMap<f, String> a = new HashMap();
    private HashMap<f, String> b = new HashMap();

    public static a a() {
        if (c == null) {
            a a8;
            c = a8 = new a();
            a8.d();
        }
        return c;
    }

    private void d() {
        this.e(ax.Q2.b.h().g());
        this.b.put(f.Q0, "webdav.yandex.com");
        this.b.put(f.J0, "File Manager SFTPHelper Cipher");
        this.b.put(f.H0, "File Manager SFTPHelper Cipher");
        this.b.put(f.I0, "File Manager SFTPHelper Cipher");
        this.b.put(f.K0, "File Manager WebDAV Cipher");
        this.b.put(f.N0, "www.dropbox.com");
        this.b.put(f.P0, "onedrive.microsoft.com");
        this.b.put(f.T0, "www.nextcloud.com");
        this.b.put(f.R0, "www.pcloud.com");
        this.b.put(f.M0, g.c);
    }

    private void e(Context context) {
        if (context != null) {
            context = context.getSharedPreferences("KeyManager", 0);
            this.a.put(f.Q0, context.getString("YANDEX", null));
            this.a.put(f.N0, context.getString("DROPBOX", null));
            this.a.put(f.P0, context.getString("ONEDRIVE", null));
            this.a.put(f.T0, context.getString("NEXTCLOUD", null));
            this.a.put(f.R0, context.getString("PCLOUD", null));
            this.a.put(f.M0, context.getString("CLOUD", null));
        }
    }

    public String b(f f8) {
        String string = this.a.get((Object)f8);
        if (string == null) {
            return this.b.get((Object)f8);
        }
        return string;
    }

    public String c(f f8) {
        return this.b.get((Object)f8);
    }
}

