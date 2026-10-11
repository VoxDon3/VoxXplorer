package ax.a6;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ax.a6.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1413n implements InterfaceC1406j0 {
    private final Application a;
    private final C1417p b;
    private final I0 c;
    private final Executor d;

    public C1413n(Application application, C1417p c1417p, I0 i0, Executor executor) {
        this.a = application;
        this.b = c1417p;
        this.d = executor;
        this.c = i0;
    }

    @Override // ax.a6.InterfaceC1406j0
    public final Executor a() {
        return this.d;
    }

    @Override // ax.a6.InterfaceC1406j0
    public final boolean b(String str, JSONObject jSONObject) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("clear")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return false;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
            } else {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (TextUtils.isEmpty(optString)) {
                        Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
                    } else {
                        hashSet.add(optString);
                    }
                }
                Z.b(this.a, hashSet);
            }
            return true;
        }
        Y y = new Y(this.a);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
            if (y.e(next, opt)) {
                this.b.c().add(next);
            } else {
                Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
            }
        }
        this.b.d();
        y.c();
        Map b = y.b();
        if (b.size() > 1) {
            this.c.a(b);
            y.d();
        }
        return true;
    }
}
