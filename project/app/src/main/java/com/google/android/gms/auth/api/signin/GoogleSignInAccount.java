/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.M5.p;
import ax.N5.a;
import ax.R5.e;
import ax.R5.h;
import com.google.android.gms.auth.api.signin.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInAccount
extends a
implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();
    public static final e o0 = h.c();
    private final String c0;
    private final String d0;
    private final String e0;
    private final String f0;
    private final Uri g0;
    private String h0;
    private final long i0;
    private final String j0;
    final List k0;
    private final String l0;
    private final String m0;
    private final Set n0 = new HashSet();
    final int q;

    GoogleSignInAccount(int n8, String string, String string2, String string3, String string4, Uri uri, String string5, long l8, String string6, List list, String string7, String string8) {
        this.q = n8;
        this.c0 = string;
        this.d0 = string2;
        this.e0 = string3;
        this.f0 = string4;
        this.g0 = uri;
        this.h0 = string5;
        this.i0 = l8;
        this.j0 = string6;
        this.k0 = list;
        this.l0 = string7;
        this.m0 = string8;
    }

    public static GoogleSignInAccount J(String string, String string2, String string3, String string4, String string5, String string6, Uri uri, Long l8, String string7, Set set) {
        return new GoogleSignInAccount(3, string, string2, string3, string4, uri, null, l8, p.f(string7), new ArrayList(p.l(set)), string5, string6);
    }

    public static GoogleSignInAccount K(String string) throws JSONException {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        Object var11_2 = null;
        if (bl) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(string);
        string = !TextUtils.isEmpty((CharSequence)(string = jSONObject.optString("photoUrl"))) ? Uri.parse((String)string) : null;
        long l8 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet<Scope> hashSet = new HashSet<Scope>();
        Object object = jSONObject.getJSONArray("grantedScopes");
        int n8 = object.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            hashSet.add(new Scope(object.getString(i8)));
        }
        String string2 = jSONObject.optString("id");
        object = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String string3 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String string4 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String string5 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String string6 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        object = GoogleSignInAccount.J(string2, (String)object, string3, string4, string5, string6, (Uri)string, l8, jSONObject.getString("obfuscatedIdentifier"), hashSet);
        string = var11_2;
        if (jSONObject.has("serverAuthCode")) {
            string = jSONObject.optString("serverAuthCode");
        }
        object.h0 = string;
        return object;
    }

    public String B() {
        return this.l0;
    }

    public String C() {
        return this.c0;
    }

    public String D() {
        return this.d0;
    }

    public Uri E() {
        return this.g0;
    }

    public Set<Scope> G() {
        HashSet<Scope> hashSet = new HashSet<Scope>(this.k0);
        hashSet.addAll(this.n0);
        return hashSet;
    }

    public String I() {
        return this.h0;
    }

    public final String M() {
        return this.j0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String N() {
        Object object;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.C() != null) {
                jSONObject.put("id", (Object)this.C());
            }
        }
        catch (JSONException jSONException) {
            throw new RuntimeException(jSONException);
        }
        if (this.D() != null) {
            jSONObject.put("tokenId", (Object)this.D());
        }
        if (this.y() != null) {
            jSONObject.put("email", (Object)this.y());
        }
        if (this.k() != null) {
            jSONObject.put("displayName", (Object)this.k());
        }
        if (this.B() != null) {
            jSONObject.put("givenName", (Object)this.B());
        }
        if (this.z() != null) {
            jSONObject.put("familyName", (Object)this.z());
        }
        if ((object = this.E()) != null) {
            jSONObject.put("photoUrl", (Object)object.toString());
        }
        if ((object = this.I()) != null) {
            jSONObject.put("serverAuthCode", (Object)this.I());
        }
        jSONObject.put("expirationTime", this.i0);
        jSONObject.put("obfuscatedIdentifier", (Object)this.j0);
        object = new JSONArray();
        Scope[] scopeArray = this.k0;
        scopeArray = scopeArray.toArray(new Scope[scopeArray.size()]);
        Arrays.sort(scopeArray, ax.G5.c.q);
        int n8 = scopeArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            object.put((Object)scopeArray[i8].k());
        }
        jSONObject.put("grantedScopes", object);
        jSONObject.remove("serverAuthCode");
        return jSONObject.toString();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof GoogleSignInAccount)) {
            return false;
        }
        object = (GoogleSignInAccount)object;
        return ((GoogleSignInAccount)object).j0.equals(this.j0) && ((Object)((GoogleSignInAccount)object).G()).equals(this.G());
    }

    public int hashCode() {
        return (this.j0.hashCode() + 527) * 31 + ((Object)this.G()).hashCode();
    }

    public Account i() {
        String string = this.e0;
        if (string == null) {
            return null;
        }
        return new Account(string, "com.google");
    }

    public String k() {
        return this.f0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.n(parcel, 2, this.C(), false);
        ax.N5.c.n(parcel, 3, this.D(), false);
        ax.N5.c.n(parcel, 4, this.y(), false);
        ax.N5.c.n(parcel, 5, this.k(), false);
        ax.N5.c.m(parcel, 6, (Parcelable)this.E(), n8, false);
        ax.N5.c.n(parcel, 7, this.I(), false);
        ax.N5.c.k(parcel, 8, this.i0);
        ax.N5.c.n(parcel, 9, this.j0, false);
        ax.N5.c.q(parcel, 10, this.k0, false);
        ax.N5.c.n(parcel, 11, this.B(), false);
        ax.N5.c.n(parcel, 12, this.z(), false);
        ax.N5.c.b(parcel, n9);
    }

    public String y() {
        return this.e0;
    }

    public String z() {
        return this.m0;
    }
}

