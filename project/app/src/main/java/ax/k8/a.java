/*
 * Decompiled with CFR 0.152.
 */
package ax.k8;

import android.util.Log;
import ax.i8.h;
import ax.m8.d;
import ax.m8.e;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    b a;
    b b;

    a(b b8, b b9) {
        this.a = b8;
        this.b = b9;
    }

    public static a a(b b8, b b9) {
        return new a(b8, b9);
    }

    private String c(String string) {
        String string2 = ax.k8.a.d(this.a, string);
        if (string2 != null) {
            return string2;
        }
        if ((string = ax.k8.a.d(this.b, string)) != null) {
            return string;
        }
        return "";
    }

    private static String d(b object, String string) {
        if ((object = ((b)object).f()) == null) {
            return null;
        }
        try {
            object = ((c)object).g().getString(string);
            return object;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    e b(c object) throws h {
        JSONArray jSONArray = ((c)object).j();
        long l8 = ((c)object).k();
        object = new HashSet();
        int n8 = 0;
        while (n8 < jSONArray.length()) {
            Object object2;
            String string;
            JSONObject jSONObject;
            try {
                jSONObject = jSONArray.getJSONObject(n8);
                string = jSONObject.getString("rolloutId");
                object2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (object2.length() > 1) {
                    Log.w((String)"FirebaseRemoteConfig", (String)String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, object2));
                }
            }
            catch (JSONException jSONException) {
                throw new h("Exception parsing rollouts metadata to create RolloutsState.", jSONException);
            }
            String string2 = object2.optString(0, "");
            object2 = this.c(string2);
            object.add(d.a().d(string).f(jSONObject.getString("variantId")).b(string2).c((String)object2).e(l8).a());
            ++n8;
        }
        return e.a((Set<d>)object);
    }
}

