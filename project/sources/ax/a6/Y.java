package ax.a6;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Y {
    private static final p0 d = p0.s("UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    private final Context b;
    private final Map a = new HashMap();
    private final Map c = new HashMap();

    public Y(Context context) {
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor f(String str) {
        Map map = this.c;
        if (!map.containsKey(str)) {
            map.put(str, this.b.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) map.get(str);
    }

    public final Map b() {
        return this.a;
    }

    public final void c() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).commit();
        }
    }

    public final void d() {
        this.a.clear();
    }

    public final boolean e(String str, Object obj) {
        X a = Z.a(this.b, str);
        if (a == null) {
            return false;
        }
        SharedPreferences.Editor f = f(a.a);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            String str2 = a.b;
            f.putInt(str2, num.intValue());
            if (!d.contains(str2)) {
                return true;
            }
            this.a.put(str2, num);
            return true;
        }
        if (obj instanceof Long) {
            f.putLong(a.b, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            f.putFloat(a.b, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            f.putFloat(a.b, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            f.putBoolean(a.b, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        f.putString(a.b, (String) obj);
        return true;
    }
}
