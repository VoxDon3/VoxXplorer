package ax.H7;

import android.os.Bundle;
import ax.G7.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements b, ax.I7.b {
    private ax.I7.a a;

    private static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // ax.H7.b
    public void A(String str, Bundle bundle) {
        ax.I7.a aVar = this.a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // ax.I7.b
    public void a(ax.I7.a aVar) {
        this.a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
