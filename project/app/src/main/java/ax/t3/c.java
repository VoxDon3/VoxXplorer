/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;
import ax.Q2.g;
import ax.t3.k;
import ax.v3.b;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Logger;

public class c {
    private static final Logger d = g.a(c.class);
    private static c e;
    private b a;
    private HashMap<String, Object> b = new HashMap();
    private Context c;

    private void a() {
        Serializable serializable = this.b;
        Constable constable = 565L;
        serializable.put("enable_ads_screen_height", constable);
        Serializable serializable2 = this.b;
        serializable = 2L;
        serializable2.put("enable_ads_after", serializable);
        this.b.put("enable_ads_to_all_after", 5L);
        this.b.put("show_intensive_ads_after", 8L);
        HashMap<String, Object> hashMap = this.b;
        serializable2 = Boolean.TRUE;
        hashMap.put("show_desktop_ads_to_all_v2", serializable2);
        this.b.put("ads_to_all_screen_height", constable);
        hashMap = this.b;
        constable = 120000L;
        hashMap.put("desktop_native_refresh", constable);
        this.b.put("desktop_high_cpm_refresh", constable);
        hashMap = this.b;
        constable = Boolean.FALSE;
        hashMap.put("show_exit_app_ads2", constable);
        this.b.put("show_rewarded_ads", constable);
        this.b.put("show_app_open_ads", constable);
        this.b.put("desktop_ads_prevent_surprise", constable);
        hashMap = this.b;
        Long l8 = 0L;
        hashMap.put("exit_app_ads_style", l8);
        this.b.put("enable_in_app_billing", constable);
        this.b.put("enable_free_trial_v2", constable);
        this.b.put("enable_onetime_purchase", serializable2);
        this.b.put("show_premium_discount", constable);
        this.b.put("ads_cta_button_color", l8);
        this.b.put("ads_config", l8);
        this.b.put("ads_random", 50L);
        this.b.put("fb_native_banner", constable);
        this.b.put("ads_desktop_config", l8);
        this.b.put("ads_analysis_config", l8);
        this.b.put("ads_video_player_config", l8);
        this.b.put("ads_analysis_show_progress", constable);
        this.b.put("ads_show_when_bottom_menu_height", 590L);
        this.b.put("ads_rewarded_toolbar_after", 10000L);
        this.b.put("ads_rewarded_style", l8);
        this.b.put("ads_video_player_type", l8);
        this.b.put("exit_app_ads_type", serializable);
        this.b.put("exit_app_ads_min_time", 1500L);
        this.b.put("ads_desktop_type", 3L);
        this.b.put("ads_desktop_random", l8);
        this.b.put("ads_renew_ad_unit", l8);
        this.b.put("ads_ad_unit_map", "");
        this.b.put("show_gdpr_consent", constable);
        this.b.put("show_ump_consent", serializable2);
        this.b.put("show_ads_settings", serializable2);
        this.b.put("show_diagnostics_settings", serializable2);
        this.b.put("ui_upgrade_button", l8);
        this.b.put("ui_analysis_menu", l8);
        this.b.put("show_desktop_native_ads", constable);
        this.b.put("show_recyclebin_ads", constable);
        this.b.put("show_analysis_ads", constable);
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
        if (!this.b()) {
            return false;
        }
        return this.a.b("show_recyclebin_ads");
    }

    public boolean B() {
        if (!this.b()) {
            return false;
        }
        return this.a.b("show_rewarded_ads");
    }

    public boolean C() {
        if (ax.Q2.c.a()) {
            return true;
        }
        if (!this.b()) {
            return false;
        }
        long l8 = this.a.d("ads_rewarded_toolbar_after");
        long l9 = k.h();
        return System.currentTimeMillis() - l9 >= l8 * 86400000L;
    }

    public boolean D() {
        if (ax.Q2.c.a()) {
            return true;
        }
        return this.a.b("show_ump_consent");
    }

    public boolean c() {
        if (ax.Q2.c.a()) {
            return new Random().nextBoolean();
        }
        return this.a.b("ads_analysis_show_progress");
    }

    public int d() {
        return this.a.c("ads_desktop_random");
    }

    public int e() {
        if (ax.Q2.c.a()) {
            return 3;
        }
        if (!this.z()) {
            return 1;
        }
        return this.a.c("ads_desktop_type");
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

    public void t(Context context, boolean bl) {
        b b8;
        this.c = context;
        this.a();
        this.a = b8 = new b();
        b8.e(context, this.b, bl);
    }

    public boolean u() {
        if (!this.b()) {
            return false;
        }
        return this.a.b("show_analysis_ads");
    }

    public boolean v() {
        if (!this.b()) {
            return false;
        }
        if (!this.z()) {
            return false;
        }
        return this.a.b("show_app_open_ads");
    }

    public boolean w() {
        if (ax.Q2.c.a()) {
            return true;
        }
        long l8 = k.h();
        if (System.currentTimeMillis() - l8 < this.a.d("enable_ads_to_all_after") * 86400000L) {
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
        if (!this.b()) {
            return false;
        }
        if (!this.z()) {
            return false;
        }
        return this.a.b("show_exit_app_ads2");
    }

    public boolean z() {
        long l8 = k.h();
        return System.currentTimeMillis() - l8 >= this.a.d("show_intensive_ads_after") * 86400000L;
    }
}

