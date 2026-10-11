package ax.P5;

import android.util.Log;
import ax.M5.C0814i;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class a {
    private final String a;
    private final String b;
    private final C0814i c;
    private final int d;

    public a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.b = sb;
        this.a = str;
        this.c = new C0814i(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.d = i;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public boolean d(int i) {
        return this.d <= i;
    }

    public void e(String str, Object... objArr) {
        Log.w(this.a, c(str, objArr));
    }
}
