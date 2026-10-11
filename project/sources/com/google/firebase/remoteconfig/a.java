package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import ax.i8.l;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2319b;
import ax.j6.InterfaceC2326i;
import ax.j6.m;
import ax.j8.k;
import ax.x7.C3471f;
import ax.y7.C3509a;
import ax.y7.C3511c;
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

/* loaded from: classes3.dex */
public class a {
    public static final byte[] n = new byte[0];
    private final Context a;
    private final C3471f b;
    private final C3511c c;
    private final Executor d;
    private final com.google.firebase.remoteconfig.internal.b e;
    private final com.google.firebase.remoteconfig.internal.b f;
    private final com.google.firebase.remoteconfig.internal.b g;
    private final d h;
    private final k i;
    private final e j;
    private final ax.b8.e k;
    private final f l;
    private final ax.k8.e m;

    a(Context context, C3471f c3471f, ax.b8.e eVar, C3511c c3511c, Executor executor, com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2, com.google.firebase.remoteconfig.internal.b bVar3, d dVar, k kVar, e eVar2, f fVar, ax.k8.e eVar3) {
        this.a = context;
        this.b = c3471f;
        this.k = eVar;
        this.c = c3511c;
        this.d = executor;
        this.e = bVar;
        this.f = bVar2;
        this.g = bVar3;
        this.h = dVar;
        this.i = kVar;
        this.j = eVar2;
        this.l = fVar;
        this.m = eVar3;
    }

    public static /* synthetic */ AbstractC2327j d(final a aVar, AbstractC2327j abstractC2327j, AbstractC2327j abstractC2327j2, AbstractC2327j abstractC2327j3) {
        aVar.getClass();
        if (!abstractC2327j.m() || abstractC2327j.j() == null) {
            return m.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.c cVar = (com.google.firebase.remoteconfig.internal.c) abstractC2327j.j();
        return (!abstractC2327j2.m() || l(cVar, (com.google.firebase.remoteconfig.internal.c) abstractC2327j2.j())) ? aVar.f.i(cVar).g(aVar.d, new InterfaceC2319b() { // from class: ax.i8.g
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j4) {
                boolean m;
                m = com.google.firebase.remoteconfig.a.this.m(abstractC2327j4);
                return Boolean.valueOf(m);
            }
        }) : m.e(Boolean.FALSE);
    }

    public static a h() {
        return i(C3471f.l());
    }

    public static a i(C3471f c3471f) {
        return ((c) c3471f.j(c.class)).g();
    }

    private static boolean l(com.google.firebase.remoteconfig.internal.c cVar, com.google.firebase.remoteconfig.internal.c cVar2) {
        return cVar2 == null || !cVar.h().equals(cVar2.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(AbstractC2327j<com.google.firebase.remoteconfig.internal.c> abstractC2327j) {
        if (!abstractC2327j.m()) {
            return false;
        }
        this.e.d();
        com.google.firebase.remoteconfig.internal.c j = abstractC2327j.j();
        if (j == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        q(j.e());
        this.m.d(j);
        return true;
    }

    static List<Map<String, String>> p(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public AbstractC2327j<Boolean> e() {
        final AbstractC2327j<com.google.firebase.remoteconfig.internal.c> e = this.e.e();
        final AbstractC2327j<com.google.firebase.remoteconfig.internal.c> e2 = this.f.e();
        return m.j(e, e2).h(this.d, new InterfaceC2319b() { // from class: ax.i8.e
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j) {
                return com.google.firebase.remoteconfig.a.d(com.google.firebase.remoteconfig.a.this, e, e2, abstractC2327j);
            }
        });
    }

    public AbstractC2327j<Void> f() {
        return this.h.i().o(ax.E7.k.a(), new InterfaceC2326i() { // from class: ax.i8.f
            @Override // ax.j6.InterfaceC2326i
            public final AbstractC2327j a(Object obj) {
                AbstractC2327j e;
                e = ax.j6.m.e(null);
                return e;
            }
        });
    }

    public AbstractC2327j<Boolean> g() {
        return f().o(this.d, new InterfaceC2326i() { // from class: ax.i8.d
            @Override // ax.j6.InterfaceC2326i
            public final AbstractC2327j a(Object obj) {
                AbstractC2327j e;
                e = com.google.firebase.remoteconfig.a.this.e();
                return e;
            }
        });
    }

    ax.k8.e j() {
        return this.m;
    }

    public l k(String str) {
        return this.i.f(str);
    }

    void n(boolean z) {
        this.l.b(z);
    }

    void o() {
        this.f.e();
        this.g.e();
        this.e.e();
    }

    void q(JSONArray jSONArray) {
        if (this.c == null) {
            return;
        }
        try {
            this.c.m(p(jSONArray));
        } catch (C3509a e) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
        }
    }
}
