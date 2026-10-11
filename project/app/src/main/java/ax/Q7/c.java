/*
 * Decompiled with CFR 0.152.
 */
package ax.Q7;

import android.text.TextUtils;
import ax.G7.g;
import ax.J7.r;
import ax.N7.a;
import ax.N7.b;
import ax.Q7.j;
import ax.Q7.k;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class c
implements k {
    private final String a;
    private final b b;
    private final g c;

    public c(String string, b b8) {
        this(string, b8, g.f());
    }

    c(String string, b b8, g g8) {
        if (string != null) {
            this.c = g8;
            this.b = b8;
            this.a = string;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    private a b(a a8, j j8) {
        this.c(a8, "X-CRASHLYTICS-GOOGLE-APP-ID", j8.a);
        this.c(a8, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.c(a8, "X-CRASHLYTICS-API-CLIENT-VERSION", r.i());
        this.c(a8, "Accept", "application/json");
        this.c(a8, "X-CRASHLYTICS-DEVICE-MODEL", j8.b);
        this.c(a8, "X-CRASHLYTICS-OS-BUILD-VERSION", j8.c);
        this.c(a8, "X-CRASHLYTICS-OS-DISPLAY-VERSION", j8.d);
        this.c(a8, "X-CRASHLYTICS-INSTALLATION-ID", j8.e.a().c());
        return a8;
    }

    private void c(a a8, String string, String string2) {
        if (string2 != null) {
            a8.d(string, string2);
        }
    }

    private JSONObject e(String string) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            return jSONObject;
        }
        catch (Exception exception) {
            g g8 = this.c;
            Object object = new StringBuilder();
            ((StringBuilder)object).append("Failed to parse settings JSON from ");
            ((StringBuilder)object).append(this.a);
            g8.l(((StringBuilder)object).toString(), exception);
            object = this.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Settings response ");
            stringBuilder.append(string);
            ((g)object).k(stringBuilder.toString());
            return null;
        }
    }

    private Map<String, String> f(j object) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("build_version", ((j)object).h);
        hashMap.put("display_version", ((j)object).g);
        hashMap.put("source", Integer.toString(((j)object).i));
        object = ((j)object).f;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            hashMap.put("instance", (String)object);
        }
        return hashMap;
    }

    @Override
    public JSONObject a(j object, boolean bl) {
        if (bl) {
            try {
                Map<String, String> map = this.f((j)object);
                object = this.b(this.d(map), (j)object);
                Object object2 = this.c;
                Object object3 = new StringBuilder();
                ((StringBuilder)object3).append("Requesting settings from ");
                ((StringBuilder)object3).append(this.a);
                ((g)object2).b(((StringBuilder)object3).toString());
                object3 = this.c;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Settings query params were: ");
                ((StringBuilder)object2).append(map);
                ((g)object3).i(((StringBuilder)object2).toString());
                object = this.g(((a)object).c());
                return object;
            }
            catch (IOException iOException) {
                this.c.e("Settings request failed.", iOException);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected a d(Map<String, String> object) {
        a a8 = this.b.a(this.a, (Map<String, String>)object);
        object = new StringBuilder();
        ((StringBuilder)object).append("Crashlytics Android SDK/");
        ((StringBuilder)object).append(r.i());
        return a8.d("User-Agent", ((StringBuilder)object).toString()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(ax.N7.c object) {
        int n8 = ((ax.N7.c)object).b();
        g g8 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Settings response code was: ");
        stringBuilder.append(n8);
        g8.i(stringBuilder.toString());
        if (this.h(n8)) {
            return this.e(((ax.N7.c)object).a());
        }
        g8 = this.c;
        object = new StringBuilder();
        ((StringBuilder)object).append("Settings request failed; (status: ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(") from ");
        ((StringBuilder)object).append(this.a);
        g8.d(((StringBuilder)object).toString());
        return null;
    }

    boolean h(int n8) {
        return n8 == 200 || n8 == 201 || n8 == 202 || n8 == 203;
        {
        }
    }
}

