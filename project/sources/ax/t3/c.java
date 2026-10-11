package ax.t3;

import android.content.Context;
import ax.v3.C3273b;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class c {
    private static final Logger d = ax.Q2.g.a(c.class);
    private static c e;
    private C3273b a;
    private HashMap<String, Object> b = new HashMap<>();
    private Context c;

    private void a() {
        this.b.put("enable_ads_screen_height", 565L);
        this.b.put("enable_ads_after", 2L);
        this.b.put("enable_ads_to_all_after", 5L);
        this.b.put("show_intensive_ads_after", 8L);
        HashMap<String, Object> hashMap = this.b;
        Boolean bool = Boolean.TRUE;
        hashMap.put("show_desktop_ads_to_all_v2", bool);
        this.b.put("ads_to_all_screen_height", 565L);
        this.b.put("desktop_native_refresh", 120000L);
        this.b.put("desktop_high_cpm_refresh", 120000L);
        HashMap<String, Object> hashMap2 = this.b;
        Boolean bool2 = Boolean.FALSE;
        hashMap2.put("show_exit_app_ads2", bool2);
        this.b.put("show_rewarded_ads", bool2);
        this.b.put("show_app_open_ads", bool2);
        this.b.put("desktop_ads_prevent_surprise", bool2);
        this.b.put("exit_app_ads_style", 0L);
        this.b.put("enable_in_app_billing", bool2);
        this.b.put("enable_free_trial_v2", bool2);
        this.b.put("enable_onetime_purchase", bool);
        this.b.put("show_premium_discount", bool2);
        this.b.put("ads_cta_button_color", 0L);
        this.b.put("ads_config", 0L);
        this.b.put("ads_random", 50L);
        this.b.put("fb_native_banner", bool2);
        this.b.put("ads_desktop_config", 0L);
        this.b.put("ads_analysis_config", 0L);
        this.b.put("ads_video_player_config", 0L);
        this.b.put("ads_analysis_show_progress", bool2);
        this.b.put("ads_show_when_bottom_menu_height", 590L);
        this.b.put("ads_rewarded_toolbar_after", 10000L);
        this.b.put("ads_rewarded_style", 0L);
        this.b.put("ads_video_player_type", 0L);
        this.b.put("exit_app_ads_type", 2L);
        this.b.put("exit_app_ads_min_time", 1500L);
        this.b.put("ads_desktop_type", 3L);
        this.b.put("ads_desktop_random", 0L);
        this.b.put("ads_renew_ad_unit", 0L);
        this.b.put("ads_ad_unit_map", HttpUrl.FRAGMENT_ENCODE_SET);
        this.b.put("show_gdpr_consent", bool2);
        this.b.put("show_ump_consent", bool);
        this.b.put("show_ads_settings", bool);
        this.b.put("show_diagnostics_settings", bool);
        this.b.put("ui_upgrade_button", 0L);
        this.b.put("ui_analysis_menu", 0L);
        this.b.put("show_desktop_native_ads", bool2);
        this.b.put("show_recyclebin_ads", bool2);
        this.b.put("show_analysis_ads", bool2);
    }

    private boolean b() {
        return false;
    }

    public static c n() {
        if (e == null) {
            e = new c();
        }
        return e;
    }

    public boolean A() {
        if (b()) {
            return this.a.b("show_recyclebin_ads");
        }
        return false;
    }

    public boolean B() {
        if (b()) {
            return this.a.b("show_rewarded_ads");
        }
        return false;
    }

    public boolean C() {
        if (ax.Q2.c.a()) {
            return true;
        }
        if (!b()) {
            return false;
        }
        return System.currentTimeMillis() - k.h() >= this.a.d("ads_rewarded_toolbar_after") * 86400000;
    }

    public boolean D() {
        if (ax.Q2.c.a()) {
            return true;
        }
        return this.a.b("show_ump_consent");
    }

    public boolean c() {
        return ax.Q2.c.a() ? new Random().nextBoolean() : this.a.b("ads_analysis_show_progress");
    }

    public int d() {
        return this.a.c("ads_desktop_random");
    }

    public int e() {
        if (ax.Q2.c.a()) {
            return 3;
        }
        if (z()) {
            return this.a.c("ads_desktop_type");
        }
        return 1;
    }

    public int f() {
        return this.a.c("ui_analysis_menu");
    }

    public long g() {
        return this.a.d("desktop_native_refresh");
    }

    public int h() {
        return this.a.c("enable_ads_screen_height");
    }

    public int i() {
        return this.a.c("ads_to_all_screen_height");
    }

    public long j() {
        return this.a.d("exit_app_ads_min_time");
    }

    public int k() {
        return this.a.c("exit_app_ads_type");
    }

    public int l() {
        return this.a.c("exit_app_ads_style");
    }

    public boolean m() {
        return false;
    }

    public boolean o() {
        return this.a.b("enable_free_trial_v2");
    }

    public int p() {
        if (ax.Q2.c.a()) {
            return 1;
        }
        return this.a.c("ads_rewarded_style");
    }

    public int q() {
        return this.a.c("ads_show_when_bottom_menu_height");
    }

    public int r() {
        return this.a.c("ui_upgrade_button");
    }

    public int s() {
        return 0;
    }

    public void t(Context context, boolean z) {
        this.c = context;
        a();
        C3273b c3273b = new C3273b();
        this.a = c3273b;
        c3273b.e(context, this.b, z);
    }

    public boolean u() {
        if (b()) {
            return this.a.b("show_analysis_ads");
        }
        return false;
    }

    public boolean v() {
        if (b() && z()) {
            return this.a.b("show_app_open_ads");
        }
        return false;
    }

    public boolean w() {
        if (ax.Q2.c.a()) {
            return true;
        }
        if (System.currentTimeMillis() - k.h() < this.a.d("enable_ads_to_all_after") * 86400000) {
            return false;
        }
        return this.a.b("show_desktop_ads_to_all_v2");
    }

    public boolean x() {
        if (ax.Q2.c.a()) {
            return true;
        }
        return this.a.b("show_diagnostics_settings");
    }

    public boolean y() {
        if (b() && z()) {
            return this.a.b("show_exit_app_ads2");
        }
        return false;
    }

    public boolean z() {
        return System.currentTimeMillis() - k.h() >= this.a.d("show_intensive_ads_after") * 86400000;
    }
}
