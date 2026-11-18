/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer;

import android.content.Context;
import androidx.annotation.Keep;
import ax.Q2.c;
import ax.t3.g;
import ax.t3.j;
import com.socialnmobile.commons.reporter.ReporterService;

@Keep
public class ApplicationReporter
implements ReporterService {
    static final String EVENT_COLLECTOR_URL = "";
    static Context sAppContext;
    static ax.Ha.c sReporter;

    private String getParentPackage(String string) {
        int n8 = string.lastIndexOf(".");
        if (n8 < 0) {
            return string;
        }
        return string.substring(0, n8);
    }

    public static void init(Context context) {
        ax.Ha.c c8;
        if (sReporter == null) {
            new ApplicationReporter().initializeService();
            if (c.a() && !ax.Ha.c.g()) {
                throw new RuntimeException("SERVICE LOADER DOES NOT WORK!!!");
            }
        }
        if (sAppContext == null && context != null) {
            sAppContext = context = context.getApplicationContext();
            ax.Ha.c.k(j.n(context));
        }
        if ((c8 = sReporter) != null && (context = sAppContext) != null) {
            c8.j(context);
        }
        ax.Ha.c.k(false);
    }

    @Override
    public void initializeService() {
        boolean bl = g.d();
        String string = "2.8.2";
        Object object = string;
        if (bl) {
            object = string;
            if (System.currentTimeMillis() > 0L) {
                object = "2.8.2-mod";
            }
        }
        sReporter = object = ax.Ha.c.f("voxxplorer", 278, (String)object, "voxfileApi21-release", EVENT_COLLECTOR_URL, false);
        ((ax.Ha.c)object).l("96SB");
    }
}

