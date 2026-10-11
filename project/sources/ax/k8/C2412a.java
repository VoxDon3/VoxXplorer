package ax.k8;

import android.util.Log;
import ax.i8.h;
import java.util.HashSet;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ax.k8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2412a {
    com.google.firebase.remoteconfig.internal.b a;
    com.google.firebase.remoteconfig.internal.b b;

    C2412a(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public static C2412a a(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return new C2412a(bVar, bVar2);
    }

    private String c(String str) {
        String d = d(this.a, str);
        if (d != null) {
            return d;
        }
        String d2 = d(this.b, str);
        return d2 != null ? d2 : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    private static String d(com.google.firebase.remoteconfig.internal.b bVar, String str) {
        com.google.firebase.remoteconfig.internal.c f = bVar.f();
        if (f == null) {
            return null;
        }
        try {
            return f.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    ax.m8.e b(com.google.firebase.remoteconfig.internal.c cVar) throws h {
        JSONArray j = cVar.j();
        long k = cVar.k();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < j.length(); i++) {
            try {
                JSONObject jSONObject = j.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String optString = jSONArray.optString(0, HttpUrl.FRAGMENT_ENCODE_SET);
                hashSet.add(ax.m8.d.a().d(string).f(jSONObject.getString("variantId")).b(optString).c(c(optString)).e(k).a());
            } catch (JSONException e) {
                throw new h("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return ax.m8.e.a(hashSet);
    }
}
