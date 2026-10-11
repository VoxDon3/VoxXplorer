/*
 * Decompiled with CFR 0.152.
 */
package ax.j8;

import android.os.Bundle;
import ax.A7.a;
import ax.a8.b;
import com.google.firebase.remoteconfig.internal.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class o {
    private final b<a> a;
    private final Map<String, String> b = java.util.DesugarCollections.synchronizedMap(new HashMap());

    public o(b<a> b8) {
        this.a = b8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(String string, c object) {
        a a8 = this.a.get();
        if (a8 == null) {
            return;
        }
        Object object2 = ((c)object).i();
        if (object2.length() < 1) {
            return;
        }
        JSONObject jSONObject = ((c)object).g();
        if (jSONObject.length() < 1) {
            return;
        }
        JSONObject jSONObject2 = object2.optJSONObject(string);
        if (jSONObject2 == null) {
            return;
        }
        object = jSONObject2.optString("choiceId");
        if (((String)object).isEmpty()) {
            return;
        }
        object2 = this.b;
        // MONITORENTER : object2
        if (((String)object).equals(this.b.get(string))) {
            // MONITOREXIT : object2
            return;
        }
        this.b.put(string, (String)object);
        // MONITOREXIT : object2
        object2 = new Bundle();
        object2.putString("arm_key", string);
        object2.putString("arm_value", jSONObject.optString(string));
        object2.putString("personalization_id", jSONObject2.optString("personalizationId"));
        object2.putInt("arm_index", jSONObject2.optInt("armIndex", -1));
        object2.putString("group", jSONObject2.optString("group"));
        a8.d("fp", "personalization_assignment", (Bundle)object2);
        string = new Bundle();
        string.putString("_fpid", (String)object);
        a8.d("fp", "_fpc", (Bundle)string);
    }
}

