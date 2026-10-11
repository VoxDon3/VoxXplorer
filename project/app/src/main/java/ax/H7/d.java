/*
 * Decompiled with CFR 0.152.
 */
package ax.H7;

import android.os.Bundle;
import ax.G7.g;
import ax.H7.b;
import ax.I7.a;
import org.json.JSONException;
import org.json.JSONObject;

public class d
implements b,
ax.I7.b {
    private a a;

    private static String b(String string, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String string2 : bundle.keySet()) {
            jSONObject2.put(string2, bundle.get(string2));
        }
        jSONObject.put("name", (Object)string);
        jSONObject.put("parameters", (Object)jSONObject2);
        return jSONObject.toString();
    }

    @Override
    public void A(String string, Bundle bundle) {
        a a8 = this.a;
        if (a8 != null) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("$A$:");
                stringBuilder.append(d.b(string, bundle));
                a8.a(stringBuilder.toString());
                return;
            }
            catch (JSONException jSONException) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override
    public void a(a a8) {
        this.a = a8;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}

