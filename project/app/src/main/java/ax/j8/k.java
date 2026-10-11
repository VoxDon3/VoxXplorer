/*
 * Decompiled with CFR 0.152.
 */
package ax.j8;

import android.util.Log;
import ax.R5.d;
import ax.i8.l;
import ax.j8.j;
import ax.j8.n;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

public class k {
    public static final Charset e = Charset.forName("UTF-8");
    static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final Set<d<String, c>> a = new HashSet<d<String, c>>();
    private final Executor b;
    private final b c;
    private final b d;

    public k(Executor executor, b b8, b b9) {
        this.b = executor;
        this.c = b8;
        this.d = b9;
    }

    public static /* synthetic */ void a(d d8, String string, c c8) {
        d8.a(string, c8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c(String string, c c8) {
        if (c8 == null) {
            return;
        }
        Set<d<String, c>> set = this.a;
        synchronized (set) {
            try {
                Iterator<d<String, c>> iterator = this.a.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    d<String, c> d8 = iterator.next();
                    Executor executor = this.b;
                    j j8 = new j(d8, string, c8);
                    executor.execute(j8);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static c d(b b8) {
        return b8.f();
    }

    private static String e(b object, String string) {
        if ((object = k.d((b)object)) == null) {
            return null;
        }
        try {
            object = ((c)object).g().getString(string);
            return object;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    private static void g(String string, String string2) {
        Log.w((String)"FirebaseRemoteConfig", (String)String.format("No value of type '%s' exists for parameter key '%s'.", string2, string));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(d<String, c> d8) {
        Set<d<String, c>> set = this.a;
        synchronized (set) {
            this.a.add(d8);
            return;
        }
    }

    public l f(String string) {
        String string2 = k.e(this.c, string);
        if (string2 != null) {
            this.c(string, k.d(this.c));
            return new n(string2, 2);
        }
        string2 = k.e(this.d, string);
        if (string2 != null) {
            return new n(string2, 1);
        }
        k.g(string, "FirebaseRemoteConfigValue");
        return new n("", 0);
    }
}

