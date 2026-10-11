package ax.j8;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class o {
    private final ax.a8.b<ax.A7.a> a;
    private final Map<String, String> b = DesugarCollections.synchronizedMap(new HashMap());

    public o(ax.a8.b<ax.A7.a> bVar) {
        this.a = bVar;
    }

    public void a(String str, com.google.firebase.remoteconfig.internal.c cVar) {
        JSONObject optJSONObject;
        ax.A7.a aVar = this.a.get();
        if (aVar == null) {
            return;
        }
        JSONObject i = cVar.i();
        if (i.length() < 1) {
            return;
        }
        JSONObject g = cVar.g();
        if (g.length() >= 1 && (optJSONObject = i.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.b) {
                try {
                    if (optString.equals(this.b.get(str))) {
                        return;
                    }
                    this.b.put(str, optString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", g.optString(str));
                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", optJSONObject.optString("group"));
                    aVar.d("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", optString);
                    aVar.d("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
