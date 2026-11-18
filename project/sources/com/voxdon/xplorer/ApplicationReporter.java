package com.voxdon.xplorer;

import android.content.Context;
import androidx.annotation.Keep;
import ax.Ha.c;
import ax.t3.g;
import ax.t3.j;
import com.socialnmobile.commons.reporter.ReporterService;

@Keep
/* loaded from: classes.dex */
public class ApplicationReporter implements ReporterService {
    static final String EVENT_COLLECTOR_URL = "";
    static Context sAppContext;
    static c sReporter;

    private String getParentPackage(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf < 0 ? str : str.substring(0, lastIndexOf);
    }

    public static void init(Context context) {
        Context context2;
        if (sReporter == null) {
            new ApplicationReporter().initializeService();
            if (ax.Q2.c.a() && !c.g()) {
                throw new RuntimeException("SERVICE LOADER DOES NOT WORK!!!");
            }
        }
        if (sAppContext == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            sAppContext = applicationContext;
            c.k(j.n(applicationContext));
        }
        c cVar = sReporter;
        if (cVar != null && (context2 = sAppContext) != null) {
            cVar.j(context2);
        }
        c.k(false);
    }

    @Override // com.socialnmobile.commons.reporter.ReporterService
    public void initializeService() {
        String str = "2.8.2";
        if (g.d() && System.currentTimeMillis() > 0) {
            str = "2.8.2-mod";
        }
        c f = c.f("voxxplorer", 278, str, "voxfileApi21-release", "", false);
        sReporter = f;
        f.l("96SB");
    }
}
