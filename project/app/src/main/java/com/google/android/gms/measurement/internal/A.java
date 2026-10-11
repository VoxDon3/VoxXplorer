/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import ax.M5.p;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.V1;

public final class A {
    final String a;
    final String b;
    private final String c;
    final long d;
    final long e;
    final C f;

    A(E2 object, String string, String object2, String object3, long l8, long l9, Bundle object4) {
        p.f((String)object2);
        p.f((String)object3);
        this.a = object2;
        this.b = object3;
        object3 = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            object3 = null;
        }
        this.c = object3;
        this.d = l8;
        this.e = l9;
        if (l9 != 0L && l9 > l8) {
            ((E2)object).k().L().b("Event created with reverse previous/current timestamps. appId", V1.v((String)object2));
        }
        if (object4 != null && !object4.isEmpty()) {
            string = new Bundle(object4);
            object2 = string.keySet().iterator();
            while (object2.hasNext()) {
                object4 = (String)object2.next();
                if (object4 == null) {
                    ((E2)object).k().G().a("Param name can't be null");
                    object2.remove();
                    continue;
                }
                object3 = ((E2)object).L().s0((String)object4, string.get((String)object4));
                if (object3 == null) {
                    ((E2)object).k().L().b("Param value can't be null", ((E2)object).D().f((String)object4));
                    object2.remove();
                    continue;
                }
                ((E2)object).L().O((Bundle)string, (String)object4, object3);
            }
            object = new C((Bundle)string);
        } else {
            object = new C(new Bundle());
        }
        this.f = object;
    }

    private A(E2 e22, String string, String string2, String string3, long l8, long l9, C c8) {
        p.f(string2);
        p.f(string3);
        p.l(c8);
        this.a = string2;
        this.b = string3;
        String string4 = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string4 = null;
        }
        this.c = string4;
        this.d = l8;
        this.e = l9;
        if (l9 != 0L && l9 > l8) {
            e22.k().L().c("Event created with reverse previous/current timestamps. appId, name", V1.v(string2), V1.v(string3));
        }
        this.f = c8;
    }

    final A a(E2 e22, long l8) {
        return new A(e22, this.c, this.a, this.b, this.d, l8, this.f);
    }

    public final String toString() {
        String string = this.a;
        String string2 = this.b;
        String string3 = String.valueOf(this.f);
        StringBuilder stringBuilder = new StringBuilder("Event{appId='");
        stringBuilder.append(string);
        stringBuilder.append("', name='");
        stringBuilder.append(string2);
        stringBuilder.append("', params=");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

