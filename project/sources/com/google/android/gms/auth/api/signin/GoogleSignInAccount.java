package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.M5.C0821p;
import ax.R5.h;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInAccount extends ax.N5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();
    public static final ax.R5.e o0 = h.c();
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

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.q = i;
        this.c0 = str;
        this.d0 = str2;
        this.e0 = str3;
        this.f0 = str4;
        this.g0 = uri;
        this.h0 = str5;
        this.i0 = j;
        this.j0 = str6;
        this.k0 = list;
        this.l0 = str7;
        this.m0 = str8;
    }

    public static GoogleSignInAccount J(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), C0821p.f(str7), new ArrayList((Collection) C0821p.l(set)), str5, str6);
    }

    public static GoogleSignInAccount K(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount J = J(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        J.h0 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return J;
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
        HashSet hashSet = new HashSet(this.k0);
        hashSet.addAll(this.n0);
        return hashSet;
    }

    public String I() {
        return this.h0;
    }

    public final String M() {
        return this.j0;
    }

    public final String N() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C() != null) {
                jSONObject.put("id", C());
            }
            if (D() != null) {
                jSONObject.put("tokenId", D());
            }
            if (y() != null) {
                jSONObject.put("email", y());
            }
            if (k() != null) {
                jSONObject.put("displayName", k());
            }
            if (B() != null) {
                jSONObject.put("givenName", B());
            }
            if (z() != null) {
                jSONObject.put("familyName", z());
            }
            Uri E = E();
            if (E != null) {
                jSONObject.put("photoUrl", E.toString());
            }
            if (I() != null) {
                jSONObject.put("serverAuthCode", I());
            }
            jSONObject.put("expirationTime", this.i0);
            jSONObject.put("obfuscatedIdentifier", this.j0);
            JSONArray jSONArray = new JSONArray();
            List list = this.k0;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: ax.G5.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).k().compareTo(((Scope) obj2).k());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.k());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j0.equals(this.j0) && googleSignInAccount.G().equals(G());
    }

    public int hashCode() {
        return ((this.j0.hashCode() + 527) * 31) + G().hashCode();
    }

    public Account i() {
        String str = this.e0;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String k() {
        return this.f0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.n(parcel, 2, C(), false);
        ax.N5.c.n(parcel, 3, D(), false);
        ax.N5.c.n(parcel, 4, y(), false);
        ax.N5.c.n(parcel, 5, k(), false);
        ax.N5.c.m(parcel, 6, E(), i, false);
        ax.N5.c.n(parcel, 7, I(), false);
        ax.N5.c.k(parcel, 8, this.i0);
        ax.N5.c.n(parcel, 9, this.j0, false);
        ax.N5.c.q(parcel, 10, this.k0, false);
        ax.N5.c.n(parcel, 11, B(), false);
        ax.N5.c.n(parcel, 12, z(), false);
        ax.N5.c.b(parcel, a);
    }

    public String y() {
        return this.e0;
    }

    public String z() {
        return this.m0;
    }
}
