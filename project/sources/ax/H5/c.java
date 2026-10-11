package ax.H5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import ax.M5.C0821p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class c {
    private static final Lock c = new ReentrantLock();
    private static c d;
    private final Lock a = new ReentrantLock();
    private final SharedPreferences b;

    c(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        C0821p.l(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new c(context.getApplicationContext());
            }
            c cVar = d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g2) && (g = g(i("googleSignInAccount", g2))) != null) {
            try {
                return GoogleSignInAccount.K(g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions d() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g2) && (g = g(i("googleSignInOptions", g2))) != null) {
            try {
                return GoogleSignInOptions.I(g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C0821p.l(googleSignInAccount);
        C0821p.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.M());
        C0821p.l(googleSignInAccount);
        C0821p.l(googleSignInOptions);
        String M = googleSignInAccount.M();
        h(i("googleSignInAccount", M), googleSignInAccount.N());
        h(i("googleSignInOptions", M), googleSignInOptions.N());
    }

    protected final String g(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
