/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import ax.a6.l;
import java.util.HashMap;
import java.util.Map;

public final class I0 {
    private final l a;
    private final Context b;

    I0(Application application, l l8) {
        this.a = l8;
        this.b = application.getApplicationContext();
    }

    public final void a(Map map) {
        l l8 = this.a;
        if (!l8.d()) {
            return;
        }
        l8.b(this.b);
        Integer n8 = (Integer)map.get("IABTCF_gdprApplies");
        HashMap<CharSequence, String> hashMap = new HashMap<CharSequence, String>();
        for (String string : map.keySet()) {
            CharSequence charSequence;
            Object object;
            int n9;
            block22: {
                if (string.equals("IABTCF_gdprApplies")) continue;
                switch (string.hashCode()) {
                    default: {
                        break;
                    }
                    case 1479307131: {
                        if (!string.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) break;
                        n9 = 1;
                        break block22;
                    }
                    case 1068702385: {
                        if (!string.equals("UMP_CoMoAdStoragePurposeConsentStatus")) break;
                        n9 = 0;
                        break block22;
                    }
                    case -142866440: {
                        if (!string.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) break;
                        n9 = 3;
                        break block22;
                    }
                    case -1926457382: {
                        if (!string.equals("UMP_CoMoAdPersonalizationPurposeConsentStatus")) break;
                        n9 = 2;
                        break block22;
                    }
                }
                n9 = -1;
            }
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) continue;
                        object = "google_analytics_default_allow_analytics_storage";
                        charSequence = "ANALYTICS_STORAGE";
                    } else {
                        object = "google_analytics_default_allow_ad_personalization_signals";
                        charSequence = "AD_PERSONALIZATION";
                    }
                } else {
                    object = "google_analytics_default_allow_ad_user_data";
                    charSequence = "AD_USER_DATA";
                }
            } else {
                object = "google_analytics_default_allow_ad_storage";
                charSequence = "AD_STORAGE";
            }
            if ((n9 = ((Integer)map.get(string)).intValue()) == -1) continue;
            string = "GRANTED";
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 == 4) continue;
                    if (n9 != 5) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("Invalid CoMo consent status: ");
                        ((StringBuilder)charSequence).append(n9);
                        Log.w((String)"UserMessagingPlatform", (String)((StringBuilder)charSequence).toString());
                        continue;
                    }
                    if ((object = l8.a((String)object)) == null) {
                        Log.w((String)"UserMessagingPlatform", (String)"No default metadata");
                        continue;
                    }
                    if (object instanceof Boolean) {
                        if (!((Boolean)object).booleanValue()) {
                            string = "DENIED";
                        }
                        hashMap.put(charSequence, string);
                        continue;
                    }
                    if (object instanceof String && object.equals("eu_consent_policy") && (((String)charSequence).equals("AD_PERSONALIZATION") || ((String)charSequence).equals("AD_USER_DATA")) && n8 != null) {
                        if (n8 == 1) {
                            string = "DENIED";
                        }
                        hashMap.put(charSequence, string);
                        continue;
                    }
                    Log.w((String)"UserMessagingPlatform", (String)"Failed to get the default eu_consent_policy value.");
                    continue;
                }
                hashMap.put(charSequence, "DENIED");
                continue;
            }
            hashMap.put(charSequence, "GRANTED");
        }
        l8.c(hashMap);
    }
}

