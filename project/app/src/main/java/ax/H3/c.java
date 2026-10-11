/*
 * Decompiled with CFR 0.152.
 */
package ax.H3;

import android.util.Log;
import ax.E3.g;
import ax.H3.d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;

public class c
implements d {
    @Override
    public void a(String string, String string2, Throwable throwable) {
        if (this.g()) {
            Log.e((String)string, (String)string2, (Throwable)throwable);
        }
    }

    @Override
    public void b(String string, String string2, Throwable throwable) {
        if (this.g()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NON_FATAL");
            stringBuilder.append(string);
            Log.e((String)stringBuilder.toString(), (String)string2, (Throwable)throwable);
        }
    }

    @Override
    public void c(String string, Throwable throwable) {
        if (this.g() && throwable != null) {
            StringWriter stringWriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringWriter));
            Log.e((String)string, (String)stringWriter.toString());
        }
    }

    @Override
    public void d(String string, String string2) {
        if (this.g()) {
            Log.e((String)string, (String)string2);
        }
    }

    @Override
    public void e(String string, String string2, Map<String, String> object) {
        if (this.g() && object != null) {
            for (Map.Entry entry : object.entrySet()) {
                Log.i((String)string, (String)String.format(Locale.ENGLISH, "%s:  %s:%s", string2, entry.getKey(), entry.getValue()));
            }
        }
    }

    @Override
    public void f(String string, String string2) {
        if (this.g()) {
            Log.i((String)string, (String)string2);
        }
    }

    public boolean g() {
        return g.a && g.b;
    }
}

