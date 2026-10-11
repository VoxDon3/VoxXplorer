package ax.a6;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.a6.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1417p {
    static final p0 d = p0.r("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final Application a;
    private final SharedPreferences b;
    private final Set c;

    C1417p(Application application) {
        this.a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.b = sharedPreferences;
        this.c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final int a() {
        return this.b.getInt("consent_status", 0);
    }

    public final Map b() {
        String str;
        Set<String> stringSet = this.b.getStringSet("stored_info", p0.q());
        if (stringSet.isEmpty()) {
            stringSet = d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.a;
            X a = Z.a(application, str2);
            if (a == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str2)));
            } else {
                Object obj = application.getSharedPreferences(a.a, 0).getAll().get(a.b);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str2)));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str2)));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }

    public final Set c() {
        return this.c;
    }

    public final void d() {
        this.b.edit().putStringSet("written_values", this.c).commit();
    }

    public final void e(int i) {
        this.b.edit().putInt("consent_status", i).commit();
    }

    public final boolean f() {
        return this.b.getBoolean("is_pub_misconfigured", false);
    }
}
