/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import ax.M5.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class c {
    private static final Lock c = new ReentrantLock();
    private static c d;
    private final Lock a = new ReentrantLock();
    private final SharedPreferences b;

    c(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context object) {
        p.l(object);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                c c8;
                d = c8 = new c(object.getApplicationContext());
            }
            object = d;
            lock.unlock();
            return object;
        }
        catch (Throwable throwable) {
            c.unlock();
            throw throwable;
        }
    }

    private static final String i(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
            return;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public GoogleSignInAccount c() {
        Object object = this.g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty((CharSequence)object)) {
            return null;
        }
        if ((object = this.g(ax.H5.c.i("googleSignInAccount", (String)object))) == null) return null;
        try {
            return GoogleSignInAccount.K((String)object);
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public GoogleSignInOptions d() {
        Object object = this.g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty((CharSequence)object)) {
            return null;
        }
        if ((object = this.g(ax.H5.c.i("googleSignInOptions", (String)object))) == null) return null;
        try {
            return GoogleSignInOptions.I((String)object);
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public String e() {
        return this.g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        p.l(googleSignInAccount);
        p.l(googleSignInOptions);
        this.h("defaultGoogleSignInAccount", googleSignInAccount.M());
        p.l(googleSignInAccount);
        p.l(googleSignInOptions);
        String string = googleSignInAccount.M();
        this.h(ax.H5.c.i("googleSignInAccount", string), googleSignInAccount.N());
        this.h(ax.H5.c.i("googleSignInOptions", string), googleSignInOptions.N());
    }

    protected final String g(String string) {
        this.a.lock();
        try {
            string = this.b.getString(string, null);
            return string;
        }
        finally {
            this.a.unlock();
        }
    }

    protected final void h(String string, String string2) {
        this.a.lock();
        try {
            this.b.edit().putString(string, string2).apply();
            return;
        }
        finally {
            this.a.unlock();
        }
    }
}

