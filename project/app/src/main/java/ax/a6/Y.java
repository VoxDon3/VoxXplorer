/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.content.Context;
import android.content.SharedPreferences;
import ax.a6.X;
import ax.a6.Z;
import ax.a6.p0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Y {
    private static final p0 d = p0.s("UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    private final Map a = new HashMap();
    private final Context b;
    private final Map c = new HashMap();

    public Y(Context context) {
        this.b = context;
    }

    static /* bridge */ /* synthetic */ SharedPreferences.Editor a(Y y8, String string) {
        return y8.f(string);
    }

    private final SharedPreferences.Editor f(String string) {
        Map map = this.c;
        if (!map.containsKey(string)) {
            map.put(string, this.b.getSharedPreferences(string, 0).edit());
        }
        return (SharedPreferences.Editor)map.get(string);
    }

    public final Map b() {
        return this.a;
    }

    public final void c() {
        Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((SharedPreferences.Editor)iterator.next()).commit();
        }
    }

    public final void d() {
        this.a.clear();
    }

    public final boolean e(String string, Object object) {
        block12: {
            block7: {
                Object object2;
                block11: {
                    block10: {
                        block9: {
                            block8: {
                                block6: {
                                    object2 = Z.a(this.b, string);
                                    if (object2 == null) {
                                        return false;
                                    }
                                    string = this.f(((X)object2).a);
                                    if (!(object instanceof Integer)) break block6;
                                    object = (Integer)object;
                                    object2 = ((X)object2).b;
                                    string.putInt((String)object2, ((Integer)object).intValue());
                                    if (d.contains(object2)) {
                                        this.a.put(object2, object);
                                    }
                                    break block7;
                                }
                                if (!(object instanceof Long)) break block8;
                                object = (Long)object;
                                string.putLong(((X)object2).b, ((Long)object).longValue());
                                break block7;
                            }
                            if (!(object instanceof Double)) break block9;
                            object = (Double)object;
                            string.putFloat(((X)object2).b, ((Double)object).floatValue());
                            break block7;
                        }
                        if (!(object instanceof Float)) break block10;
                        object = (Float)object;
                        string.putFloat(((X)object2).b, ((Float)object).floatValue());
                        break block7;
                    }
                    if (!(object instanceof Boolean)) break block11;
                    object = (Boolean)object;
                    string.putBoolean(((X)object2).b, ((Boolean)object).booleanValue());
                    break block7;
                }
                if (!(object instanceof String)) break block12;
                object = (String)object;
                string.putString(((X)object2).b, (String)object);
            }
            return true;
        }
        return false;
    }
}

