/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import ax.E7.k;
import ax.i8.g;
import ax.i8.l;
import ax.j6.j;
import ax.j6.m;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import com.google.firebase.remoteconfig.internal.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    public static final byte[] n = new byte[0];
    private final Context a;
    private final ax.x7.f b;
    private final ax.y7.c c;
    private final Executor d;
    private final b e;
    private final b f;
    private final b g;
    private final d h;
    private final ax.j8.k i;
    private final e j;
    private final ax.b8.e k;
    private final f l;
    private final ax.k8.e m;

    a(Context context, ax.x7.f f8, ax.b8.e e8, ax.y7.c c8, Executor executor, b b8, b b9, b b10, d d8, ax.j8.k k8, e e9, f f9, ax.k8.e e10) {
        this.a = context;
        this.b = f8;
        this.k = e8;
        this.c = c8;
        this.d = executor;
        this.e = b8;
        this.f = b9;
        this.g = b10;
        this.h = d8;
        this.i = k8;
        this.j = e9;
        this.l = f9;
        this.m = e10;
    }

    public static /* synthetic */ boolean a(a a8, j j8) {
        return a8.m(j8);
    }

    public static /* synthetic */ j b(d.a a8) {
        return ax.j6.m.e(null);
    }

    public static /* synthetic */ j c(a a8, Void void_) {
        return a8.e();
    }

    public static /* synthetic */ j d(a a8, j object, j j8, j j9) {
        a8.getClass();
        if (((j)object).m() && ((j)object).j() != null) {
            object = (c)((j)object).j();
            if (j8.m() && !com.google.firebase.remoteconfig.a.l((c)object, (c)j8.j())) {
                return ax.j6.m.e(Boolean.FALSE);
            }
            return a8.f.i((c)object).g(a8.d, new g(a8));
        }
        return ax.j6.m.e(Boolean.FALSE);
    }

    public static a h() {
        return com.google.firebase.remoteconfig.a.i(ax.x7.f.l());
    }

    public static a i(ax.x7.f f8) {
        return f8.j(com.google.firebase.remoteconfig.c.class).g();
    }

    private static boolean l(c c8, c c9) {
        return c9 == null || !c8.h().equals(c9.h());
        {
        }
    }

    private boolean m(j<c> object) {
        if (((j)object).m()) {
            this.e.d();
            object = ((j)object).j();
            if (object != null) {
                this.q(((c)object).e());
                this.m.d((c)object);
            } else {
                Log.e((String)"FirebaseRemoteConfig", (String)"Activated configs written to disk are null.");
            }
            return true;
        }
        return false;
    }

    static List<Map<String, String>> p(JSONArray jSONArray) throws JSONException {
        ArrayList<Map<String, String>> arrayList = new ArrayList<Map<String, String>>();
        for (int i8 = 0; i8 < jSONArray.length(); ++i8) {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            JSONObject jSONObject = jSONArray.getJSONObject(i8);
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                hashMap.put(string, jSONObject.getString(string));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public j<Boolean> e() {
        j<c> j8 = this.e.e();
        j<c> j9 = this.f.e();
        return ax.j6.m.j(j8, j9).h(this.d, new ax.i8.e(this, j8, j9));
    }

    public j<Void> f() {
        return this.h.i().o(ax.E7.k.a(), new ax.i8.f());
    }

    public j<Boolean> g() {
        return this.f().o(this.d, new ax.i8.d(this));
    }

    ax.k8.e j() {
        return this.m;
    }

    public l k(String string) {
        return this.i.f(string);
    }

    void n(boolean bl) {
        this.l.b(bl);
    }

    void o() {
        this.f.e();
        this.g.e();
        this.e.e();
    }

    void q(JSONArray object) {
        block5: {
            if (this.c != null) {
                JSONException jSONException2;
                block4: {
                    try {
                        object = com.google.firebase.remoteconfig.a.p(object);
                        this.c.m((List<Map<String, String>>)object);
                        return;
                    }
                    catch (ax.y7.a a8) {
                    }
                    catch (JSONException jSONException2) {
                        break block4;
                    }
                    Log.w((String)"FirebaseRemoteConfig", (String)"Could not update ABT experiments.", (Throwable)a8);
                    break block5;
                }
                Log.e((String)"FirebaseRemoteConfig", (String)"Could not parse ABT experiments from the JSON response.", (Throwable)jSONException2);
            }
        }
    }
}

