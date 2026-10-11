/*
 * Decompiled with CFR 0.152.
 */
package ax.P5;

import android.util.Log;
import ax.M5.i;
import java.util.Locale;

public class a {
    private final String a;
    private final String b;
    private final i c;
    private final int d;

    public a(String string, String ... object) {
        int n8;
        int n9 = ((String[])object).length;
        if (n9 == 0) {
            object = "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('[');
            for (n8 = 0; n8 < n9; ++n8) {
                String string2 = object[n8];
                if (stringBuilder.length() > 1) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(string2);
            }
            stringBuilder.append("] ");
            object = stringBuilder.toString();
        }
        this.b = object;
        this.a = string;
        this.c = new i(string);
        for (n8 = 2; n8 <= 7 && !Log.isLoggable((String)this.a, (int)n8); ++n8) {
        }
        this.d = n8;
    }

    public void a(String string, Object ... objectArray) {
        if (this.d(3)) {
            Log.d((String)this.a, (String)this.c(string, objectArray));
        }
    }

    public void b(String string, Object ... objectArray) {
        Log.e((String)this.a, (String)this.c(string, objectArray));
    }

    protected String c(String string, Object ... objectArray) {
        String string2 = string;
        if (objectArray != null) {
            string2 = string;
            if (objectArray.length > 0) {
                string2 = String.format(Locale.US, string, objectArray);
            }
        }
        return this.b.concat(string2);
    }

    public boolean d(int n8) {
        return this.d <= n8;
    }

    public void e(String string, Object ... objectArray) {
        Log.w((String)this.a, (String)this.c(string, objectArray));
    }
}

