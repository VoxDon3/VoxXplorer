package ax.Y2;

import android.content.Context;
import android.content.SharedPreferences;
import ax.Q2.b;
import ax.Q2.f;
import ax.c3.C1819g;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a {
    private static a c;
    private HashMap<f, String> a = new HashMap<>();
    private HashMap<f, String> b = new HashMap<>();

    public static a a() {
        if (c == null) {
            a aVar = new a();
            c = aVar;
            aVar.d();
        }
        return c;
    }

    private void d() {
        e(b.h().g());
        this.b.put(f.Q0, "webdav.yandex.com");
        this.b.put(f.J0, "File Manager SFTPHelper Cipher");
        this.b.put(f.H0, "File Manager SFTPHelper Cipher");
        this.b.put(f.I0, "File Manager SFTPHelper Cipher");
        this.b.put(f.K0, "File Manager WebDAV Cipher");
        this.b.put(f.N0, "www.dropbox.com");
        this.b.put(f.P0, "onedrive.microsoft.com");
        this.b.put(f.T0, "www.nextcloud.com");
        this.b.put(f.R0, "www.pcloud.com");
        this.b.put(f.M0, C1819g.c);
    }

    private void e(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("KeyManager", 0);
            this.a.put(f.Q0, sharedPreferences.getString("YANDEX", null));
            this.a.put(f.N0, sharedPreferences.getString("DROPBOX", null));
            this.a.put(f.P0, sharedPreferences.getString("ONEDRIVE", null));
            this.a.put(f.T0, sharedPreferences.getString("NEXTCLOUD", null));
            this.a.put(f.R0, sharedPreferences.getString("PCLOUD", null));
            this.a.put(f.M0, sharedPreferences.getString("CLOUD", null));
        }
    }

    public String b(f fVar) {
        String str = this.a.get(fVar);
        return str == null ? this.b.get(fVar) : str;
    }

    public String c(f fVar) {
        return this.b.get(fVar);
    }
}
