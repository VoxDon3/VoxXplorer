/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.H5.b;
import ax.K5.a;
import ax.M5.p;
import ax.N5.c;
import com.google.android.gms.auth.api.signin.d;
import com.google.android.gms.auth.api.signin.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInOptions
extends ax.N5.a
implements a.d,
ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions m0;
    public static final GoogleSignInOptions n0;
    public static final Scope o0;
    public static final Scope p0;
    public static final Scope q0;
    public static final Scope r0;
    public static final Scope s0;
    private static final Comparator t0;
    private final ArrayList c0;
    private Account d0;
    private boolean e0;
    private final boolean f0;
    private final boolean g0;
    private String h0;
    private String i0;
    private ArrayList j0;
    private String k0;
    private Map l0;
    final int q;

    static {
        Scope scope;
        o0 = new Scope("profile");
        p0 = new Scope("email");
        q0 = new Scope("openid");
        r0 = scope = new Scope("https://www.googleapis.com/auth/games_lite");
        s0 = new Scope("https://www.googleapis.com/auth/games");
        a a8 = new a();
        a8.b();
        a8.c();
        m0 = a8.a();
        a8 = new a();
        a8.d(scope, new Scope[0]);
        n0 = a8.a();
        CREATOR = new e();
        t0 = new d();
    }

    GoogleSignInOptions(int n8, ArrayList arrayList, Account account, boolean bl, boolean bl2, boolean bl3, String string, String string2, ArrayList arrayList2, String string3) {
        this(n8, arrayList, account, bl, bl2, bl3, string, string2, GoogleSignInOptions.U(arrayList2), string3);
    }

    private GoogleSignInOptions(int n8, ArrayList arrayList, Account account, boolean bl, boolean bl2, boolean bl3, String string, String string2, Map map, String string3) {
        this.q = n8;
        this.c0 = arrayList;
        this.d0 = account;
        this.e0 = bl;
        this.f0 = bl2;
        this.g0 = bl3;
        this.h0 = string;
        this.i0 = string2;
        this.j0 = new ArrayList(map.values());
        this.l0 = map;
        this.k0 = string3;
    }

    /* synthetic */ GoogleSignInOptions(int n8, ArrayList arrayList, Account account, boolean bl, boolean bl2, boolean bl3, String string, String string2, Map map, String string3, ax.G5.d d8) {
        this(3, arrayList, account, bl, bl2, bl3, string, string2, map, string3);
    }

    public static GoogleSignInOptions I(String string) throws JSONException {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        String string2 = null;
        if (bl) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(string);
        Object object = new HashSet<Scope>();
        string = jSONObject.getJSONArray("scopes");
        int n8 = string.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            object.add(new Scope(string.getString(i8)));
        }
        string = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        string = !TextUtils.isEmpty((CharSequence)string) ? new Account(string, "com.google") : null;
        ArrayList arrayList = new ArrayList(object);
        boolean bl2 = jSONObject.getBoolean("idTokenRequested");
        boolean bl3 = jSONObject.getBoolean("serverAuthRequested");
        bl = jSONObject.getBoolean("forceCodeForRefreshToken");
        object = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            string2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, (Account)string, bl2, bl3, bl, (String)object, string2, new HashMap(), null);
    }

    private static Map U(List object) {
        HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();
        if (object != null) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (ax.H5.a)iterator.next();
                hashMap.put(((ax.H5.a)object).k(), object);
            }
        }
        return hashMap;
    }

    public String B() {
        return this.h0;
    }

    public boolean C() {
        return this.g0;
    }

    public boolean D() {
        return this.e0;
    }

    public boolean E() {
        return this.f0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String N() {
        ArrayList arrayList;
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONArray = new JSONArray();
            Collections.sort(this.c0, t0);
            arrayList = this.c0;
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object e8 = arrayList.get(i8);
                jSONArray.put((Object)((Scope)e8).k());
            }
        }
        catch (JSONException jSONException) {
            throw new RuntimeException(jSONException);
        }
        jSONObject.put("scopes", (Object)jSONArray);
        arrayList = this.d0;
        if (arrayList != null) {
            jSONObject.put("accountName", (Object)((Account)arrayList).name);
        }
        jSONObject.put("idTokenRequested", this.e0);
        jSONObject.put("forceCodeForRefreshToken", this.g0);
        jSONObject.put("serverAuthRequested", this.f0);
        if (!TextUtils.isEmpty((CharSequence)this.h0)) {
            jSONObject.put("serverClientId", (Object)this.h0);
        }
        if (TextUtils.isEmpty((CharSequence)this.i0)) return jSONObject.toString();
        jSONObject.put("hostedDomain", (Object)this.i0);
        return jSONObject.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)object;
            if (!this.j0.isEmpty()) return false;
            if (!googleSignInOptions.j0.isEmpty()) {
                return false;
            }
            if (this.c0.size() != googleSignInOptions.z().size()) return false;
            if (!this.c0.containsAll(googleSignInOptions.z())) {
                return false;
            }
            object = this.d0;
            if (object == null) {
                if (googleSignInOptions.i() != null) return false;
            } else if (!object.equals((Object)googleSignInOptions.i())) return false;
            if (TextUtils.isEmpty((CharSequence)this.h0)) {
                if (!TextUtils.isEmpty((CharSequence)googleSignInOptions.B())) return false;
            } else if (!this.h0.equals(googleSignInOptions.B())) {
                return false;
            }
            if (this.g0 != googleSignInOptions.C()) return false;
            if (this.e0 != googleSignInOptions.D()) return false;
            if (this.f0 != googleSignInOptions.E()) return false;
            boolean bl = TextUtils.equals((CharSequence)this.k0, (CharSequence)googleSignInOptions.y());
            if (!bl) return false;
            return true;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public int hashCode() {
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = this.c0;
        int n8 = object.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add(((Scope)object.get(i8)).k());
        }
        Collections.sort(arrayList);
        object = new b();
        ((b)object).a(arrayList);
        ((b)object).a(this.d0);
        ((b)object).a(this.h0);
        ((b)object).c(this.g0);
        ((b)object).c(this.e0);
        ((b)object).c(this.f0);
        ((b)object).a(this.k0);
        return ((b)object).b();
    }

    public Account i() {
        return this.d0;
    }

    public ArrayList<ax.H5.a> k() {
        return this.j0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = this.q;
        int n10 = c.a(parcel);
        c.i(parcel, 1, n9);
        c.q(parcel, 2, this.z(), false);
        c.m(parcel, 3, (Parcelable)this.i(), n8, false);
        c.c(parcel, 4, this.D());
        c.c(parcel, 5, this.E());
        c.c(parcel, 6, this.C());
        c.n(parcel, 7, this.B(), false);
        c.n(parcel, 8, this.i0, false);
        c.q(parcel, 9, this.k(), false);
        c.n(parcel, 10, this.y(), false);
        c.b(parcel, n10);
    }

    public String y() {
        return this.k0;
    }

    public ArrayList<Scope> z() {
        return new ArrayList<Scope>(this.c0);
    }

    public static final class a {
        private Set a = new HashSet();
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;
        private Map h = new HashMap();
        private String i;

        public a() {
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            p.l(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.c0);
            this.b = googleSignInOptions.f0;
            this.c = googleSignInOptions.g0;
            this.d = googleSignInOptions.e0;
            this.e = googleSignInOptions.h0;
            this.f = googleSignInOptions.d0;
            this.g = googleSignInOptions.i0;
            this.h = GoogleSignInOptions.U(googleSignInOptions.j0);
            this.i = googleSignInOptions.k0;
        }

        public GoogleSignInOptions a() {
            Scope scope;
            Set set;
            if (this.a.contains(s0) && (set = this.a).contains(scope = r0)) {
                this.a.remove(scope);
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                this.b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i, null);
        }

        public a b() {
            this.a.add(q0);
            return this;
        }

        public a c() {
            this.a.add(o0);
            return this;
        }

        public a d(Scope scope, Scope ... scopeArray) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArray));
            return this;
        }

        public a e(String string) {
            this.i = string;
            return this;
        }
    }
}

