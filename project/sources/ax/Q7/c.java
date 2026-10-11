package ax.Q7;

import android.text.TextUtils;
import ax.J7.r;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class c implements k {
    private final String a;
    private final ax.N7.b b;
    private final ax.G7.g c;

    public c(String str, ax.N7.b bVar) {
        this(str, bVar, ax.G7.g.f());
    }

    private ax.N7.a b(ax.N7.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", r.i());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.e.a().c());
        return aVar;
    }

    private void c(ax.N7.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            this.c.l("Failed to parse settings JSON from " + this.a, e);
            this.c.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.h);
        hashMap.put("display_version", jVar.g);
        hashMap.put("source", Integer.toString(jVar.i));
        String str = jVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // ax.Q7.k
    public JSONObject a(j jVar, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> f = f(jVar);
            ax.N7.a b = b(d(f), jVar);
            this.c.b("Requesting settings from " + this.a);
            this.c.i("Settings query params were: " + f);
            return g(b.c());
        } catch (IOException e) {
            this.c.e("Settings request failed.", e);
            return null;
        }
    }

    protected ax.N7.a d(Map<String, String> map) {
        return this.b.a(this.a, map).d("User-Agent", "Crashlytics Android SDK/" + r.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(ax.N7.c cVar) {
        int b = cVar.b();
        this.c.i("Settings response code was: " + b);
        if (h(b)) {
            return e(cVar.a());
        }
        this.c.d("Settings request failed; (status: " + b + ") from " + this.a);
        return null;
    }

    boolean h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    c(String str, ax.N7.b bVar, ax.G7.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = gVar;
        this.b = bVar;
        this.a = str;
    }
}
