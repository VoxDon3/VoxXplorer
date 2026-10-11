/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import ax.a6.X;
import ax.a6.Z;
import ax.a6.p0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class p {
    static final p0 d = p0.r("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final Application a;
    private final SharedPreferences b;
    private final Set c;

    p(Application application) {
        this.a = application;
        application = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.b = application;
        this.c = new HashSet(application.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final int a() {
        return this.b.getInt("consent_status", 0);
    }

    public final Map b() {
        Object object;
        Object object2 = object = this.b.getStringSet("stored_info", (Set)p0.q());
        if (object.isEmpty()) {
            object2 = d;
        }
        object = new HashMap();
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            String string;
            block10: {
                block8: {
                    block9: {
                        block7: {
                            object2 = this.a;
                            string = (String)iterator.next();
                            X x8 = Z.a((Context)object2, string);
                            if (x8 == null) {
                                Log.d((String)"UserMessagingPlatform", (String)"Fetching request info: failed for key: ".concat(String.valueOf(string)));
                                continue;
                            }
                            if ((object2 = object2.getSharedPreferences(x8.a, 0).getAll().get(x8.b)) == null) {
                                Log.d((String)"UserMessagingPlatform", (String)"Stored info not exists: ".concat(String.valueOf(string)));
                                continue;
                            }
                            if (!(object2 instanceof Boolean)) break block7;
                            object2 = !((Boolean)object2).booleanValue() ? "0" : "1";
                            break block8;
                        }
                        if (!(object2 instanceof Number)) break block9;
                        object2 = object2.toString();
                        break block8;
                    }
                    if (!(object2 instanceof String)) break block10;
                    object2 = (String)object2;
                }
                object.put(string, object2);
                continue;
            }
            Log.d((String)"UserMessagingPlatform", (String)"Failed to fetch stored info: ".concat(String.valueOf(string)));
        }
        return object;
    }

    public final Set c() {
        return this.c;
    }

    public final void d() {
        this.b.edit().putStringSet("written_values", this.c).commit();
    }

    public final void e(int n8) {
        this.b.edit().putInt("consent_status", n8).commit();
    }

    public final boolean f() {
        return this.b.getBoolean("is_pub_misconfigured", false);
    }
}

