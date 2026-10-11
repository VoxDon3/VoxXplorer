package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.K5.a;
import ax.M5.C0821p;
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
/* loaded from: classes3.dex */
public class GoogleSignInOptions extends ax.N5.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions m0;
    public static final GoogleSignInOptions n0;
    public static final Scope o0 = new Scope("profile");
    public static final Scope p0 = new Scope("email");
    public static final Scope q0 = new Scope("openid");
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
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        r0 = scope;
        s0 = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        m0 = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        n0 = aVar2.a();
        CREATOR = new e();
        t0 = new d();
    }

    public static GoogleSignInOptions I(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map U(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ax.H5.a aVar = (ax.H5.a) it.next();
                hashMap.put(Integer.valueOf(aVar.k()), aVar);
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

    public final String N() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.c0, t0);
            ArrayList arrayList = this.c0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).k());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.d0;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.e0);
            jSONObject.put("forceCodeForRefreshToken", this.g0);
            jSONObject.put("serverAuthRequested", this.f0);
            if (!TextUtils.isEmpty(this.h0)) {
                jSONObject.put("serverClientId", this.h0);
            }
            if (!TextUtils.isEmpty(this.i0)) {
                jSONObject.put("hostedDomain", this.i0);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.i()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.j0     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.j0     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.c0     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.c0     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.d0     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.h0     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.B()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.h0     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.B()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.g0     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.C()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.e0     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.D()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f0     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.E()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.k0     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.y()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.c0;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).k());
        }
        Collections.sort(arrayList);
        ax.H5.b bVar = new ax.H5.b();
        bVar.a(arrayList);
        bVar.a(this.d0);
        bVar.a(this.h0);
        bVar.c(this.g0);
        bVar.c(this.e0);
        bVar.c(this.f0);
        bVar.a(this.k0);
        return bVar.b();
    }

    public Account i() {
        return this.d0;
    }

    public ArrayList<ax.H5.a> k() {
        return this.j0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.q;
        int a2 = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, i2);
        ax.N5.c.q(parcel, 2, z(), false);
        ax.N5.c.m(parcel, 3, i(), i, false);
        ax.N5.c.c(parcel, 4, D());
        ax.N5.c.c(parcel, 5, E());
        ax.N5.c.c(parcel, 6, C());
        ax.N5.c.n(parcel, 7, B(), false);
        ax.N5.c.n(parcel, 8, this.i0, false);
        ax.N5.c.q(parcel, 9, k(), false);
        ax.N5.c.n(parcel, 10, y(), false);
        ax.N5.c.b(parcel, a2);
    }

    public String y() {
        return this.k0;
    }

    public ArrayList<Scope> z() {
        return new ArrayList<>(this.c0);
    }

    public static final class a {
        private Set a;
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;
        private Map h;
        private String i;

        public a() {
            this.a = new HashSet();
            this.h = new HashMap();
        }

        public GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.s0)) {
                Set set = this.a;
                Scope scope = GoogleSignInOptions.r0;
                if (set.contains(scope)) {
                    this.a.remove(scope);
                }
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }

        public a b() {
            this.a.add(GoogleSignInOptions.q0);
            return this;
        }

        public a c() {
            this.a.add(GoogleSignInOptions.o0);
            return this;
        }

        public a d(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a e(String str) {
            this.i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet();
            this.h = new HashMap();
            C0821p.l(googleSignInOptions);
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
    }

    GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, U(arrayList2), str3);
    }

    private GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.q = i;
        this.c0 = arrayList;
        this.d0 = account;
        this.e0 = z;
        this.f0 = z2;
        this.g0 = z3;
        this.h0 = str;
        this.i0 = str2;
        this.j0 = new ArrayList(map.values());
        this.l0 = map;
        this.k0 = str3;
    }
}
