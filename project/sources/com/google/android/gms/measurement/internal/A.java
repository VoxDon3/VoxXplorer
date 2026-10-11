package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import ax.M5.C0821p;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class A {
    final String a;
    final String b;
    private final String c;
    final long d;
    final long e;
    final C f;

    A(E2 e2, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C c;
        C0821p.f(str2);
        C0821p.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            e2.k().L().b("Event created with reverse previous/current timestamps. appId", V1.v(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c = new C(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    e2.k().G().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s0 = e2.L().s0(next, bundle2.get(next));
                    if (s0 == null) {
                        e2.k().L().b("Param value can't be null", e2.D().f(next));
                        it.remove();
                    } else {
                        e2.L().O(bundle2, next, s0);
                    }
                }
            }
            c = new C(bundle2);
        }
        this.f = c;
    }

    final A a(E2 e2, long j) {
        return new A(e2, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        return "Event{appId='" + this.a + "', name='" + this.b + "', params=" + String.valueOf(this.f) + "}";
    }

    private A(E2 e2, String str, String str2, String str3, long j, long j2, C c) {
        C0821p.f(str2);
        C0821p.f(str3);
        C0821p.l(c);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            e2.k().L().c("Event created with reverse previous/current timestamps. appId, name", V1.v(str2), V1.v(str3));
        }
        this.f = c;
    }
}
