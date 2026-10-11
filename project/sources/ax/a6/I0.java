package ax.a6;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class I0 {
    private final C1409l a;
    private final Context b;

    I0(Application application, C1409l c1409l) {
        this.a = c1409l;
        this.b = application.getApplicationContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(Map map) {
        char c;
        String str;
        String str2;
        C1409l c1409l = this.a;
        if (c1409l.d()) {
            c1409l.b(this.b);
            Integer num = (Integer) map.get("IABTCF_gdprApplies");
            HashMap hashMap = new HashMap();
            for (String str3 : map.keySet()) {
                if (!str3.equals("IABTCF_gdprApplies")) {
                    switch (str3.hashCode()) {
                        case -1926457382:
                            if (str3.equals("UMP_CoMoAdPersonalizationPurposeConsentStatus")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -142866440:
                            if (str3.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1068702385:
                            if (str3.equals("UMP_CoMoAdStoragePurposeConsentStatus")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1479307131:
                            if (str3.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        str = "google_analytics_default_allow_ad_storage";
                        str2 = "AD_STORAGE";
                    } else if (c == 1) {
                        str = "google_analytics_default_allow_ad_user_data";
                        str2 = "AD_USER_DATA";
                    } else if (c == 2) {
                        str = "google_analytics_default_allow_ad_personalization_signals";
                        str2 = "AD_PERSONALIZATION";
                    } else if (c == 3) {
                        str = "google_analytics_default_allow_analytics_storage";
                        str2 = "ANALYTICS_STORAGE";
                    }
                    int intValue = ((Integer) map.get(str3)).intValue();
                    if (intValue != -1) {
                        if (intValue == 1) {
                            hashMap.put(str2, "GRANTED");
                        } else if (intValue == 2) {
                            hashMap.put(str2, "DENIED");
                        } else if (intValue != 4) {
                            if (intValue != 5) {
                                Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + intValue);
                            } else {
                                Object a = c1409l.a(str);
                                if (a == null) {
                                    Log.w("UserMessagingPlatform", "No default metadata");
                                } else if (a instanceof Boolean) {
                                    hashMap.put(str2, true != ((Boolean) a).booleanValue() ? "DENIED" : "GRANTED");
                                } else if ((a instanceof String) && a.equals("eu_consent_policy") && ((str2.equals("AD_PERSONALIZATION") || str2.equals("AD_USER_DATA")) && num != null)) {
                                    hashMap.put(str2, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                } else {
                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                }
                            }
                        }
                    }
                }
            }
            c1409l.c(hashMap);
        }
    }
}
