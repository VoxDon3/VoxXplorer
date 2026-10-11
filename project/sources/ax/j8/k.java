package ax.j8;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class k {
    public static final Charset e = Charset.forName("UTF-8");
    static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final Set<ax.R5.d<String, com.google.firebase.remoteconfig.internal.c>> a = new HashSet();
    private final Executor b;
    private final com.google.firebase.remoteconfig.internal.b c;
    private final com.google.firebase.remoteconfig.internal.b d;

    public k(Executor executor, com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        this.b = executor;
        this.c = bVar;
        this.d = bVar2;
    }

    private void c(final String str, final com.google.firebase.remoteconfig.internal.c cVar) {
        if (cVar == null) {
            return;
        }
        synchronized (this.a) {
            try {
                for (final ax.R5.d<String, com.google.firebase.remoteconfig.internal.c> dVar : this.a) {
                    this.b.execute(new Runnable() { // from class: ax.j8.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            ax.R5.d.this.a(str, cVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static com.google.firebase.remoteconfig.internal.c d(com.google.firebase.remoteconfig.internal.b bVar) {
        return bVar.f();
    }

    private static String e(com.google.firebase.remoteconfig.internal.b bVar, String str) {
        com.google.firebase.remoteconfig.internal.c d = d(bVar);
        if (d == null) {
            return null;
        }
        try {
            return d.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void g(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(ax.R5.d<String, com.google.firebase.remoteconfig.internal.c> dVar) {
        synchronized (this.a) {
            this.a.add(dVar);
        }
    }

    public ax.i8.l f(String str) {
        String e2 = e(this.c, str);
        if (e2 != null) {
            c(str, d(this.c));
            return new n(e2, 2);
        }
        String e3 = e(this.d, str);
        if (e3 != null) {
            return new n(e3, 1);
        }
        g(str, "FirebaseRemoteConfigValue");
        return new n(HttpUrl.FRAGMENT_ENCODE_SET, 0);
    }
}
