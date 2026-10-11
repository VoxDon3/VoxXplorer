package ax.H3;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements d {
    @Override // ax.H3.d
    public void a(String str, String str2, Throwable th) {
        if (g()) {
            Log.e(str, str2, th);
        }
    }

    @Override // ax.H3.d
    public void b(String str, String str2, Throwable th) {
        if (g()) {
            Log.e("NON_FATAL" + str, str2, th);
        }
    }

    @Override // ax.H3.d
    public void c(String str, Throwable th) {
        if (!g() || th == null) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        Log.e(str, stringWriter.toString());
    }

    @Override // ax.H3.d
    public void d(String str, String str2) {
        if (g()) {
            Log.e(str, str2);
        }
    }

    @Override // ax.H3.d
    public void e(String str, String str2, Map<String, String> map) {
        if (!g() || map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Log.i(str, String.format(Locale.ENGLISH, "%s:  %s:%s", str2, entry.getKey(), entry.getValue()));
        }
    }

    @Override // ax.H3.d
    public void f(String str, String str2) {
        if (g()) {
            Log.i(str, str2);
        }
    }

    public boolean g() {
        return ax.E3.g.a && ax.E3.g.b;
    }
}
