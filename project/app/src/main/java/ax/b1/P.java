/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.net.Uri;
import android.text.TextUtils;
import ax.P0.i;
import ax.S0.a;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.k;
import ax.b1.A;
import ax.b1.E;
import ax.b1.S;
import ax.b1.T;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class P
implements S {
    private final g.a a;
    private final String b;
    private final boolean c;
    private final Map<String, String> d;

    public P(String string, boolean bl, g.a a8) {
        boolean bl2 = !bl || !TextUtils.isEmpty((CharSequence)string);
        ax.S0.a.a(bl2);
        this.a = a8;
        this.b = string;
        this.c = bl;
        this.d = new HashMap<String, String>();
    }

    @Override
    public byte[] a(UUID object, E.d d8) throws T {
        object = new StringBuilder();
        ((StringBuilder)object).append(d8.b());
        ((StringBuilder)object).append("&signedRequest=");
        ((StringBuilder)object).append(d0.H(d8.a()));
        object = ((StringBuilder)object).toString();
        return A.a(this.a.a(), (String)object, null, Collections.EMPTY_MAP);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] b(UUID map, E.a a8) throws T {
        String string;
        String string2;
        block9: {
            block8: {
                string2 = a8.b();
                if (this.c) break block8;
                string = string2;
                if (!TextUtils.isEmpty((CharSequence)string2)) break block9;
            }
            string = this.b;
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            map = new k.b();
            a8 = Uri.EMPTY;
            throw new T(((k.b)((Object)map)).i((Uri)a8).a(), (Uri)a8, ax.r7.A.<String, List<String>>k(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        UUID uUID = i.e;
        string2 = uUID.equals(map) ? "text/xml" : (i.c.equals(map) ? "application/json" : "application/octet-stream");
        hashMap.put("Content-Type", string2);
        if (uUID.equals(map)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        map = this.d;
        synchronized (map) {
            hashMap.putAll(this.d);
            return A.a(this.a.a(), string, a8.a(), hashMap);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(String string, String string2) {
        ax.S0.a.e(string);
        ax.S0.a.e(string2);
        Map<String, String> map = this.d;
        synchronized (map) {
            this.d.put(string, string2);
            return;
        }
    }
}

