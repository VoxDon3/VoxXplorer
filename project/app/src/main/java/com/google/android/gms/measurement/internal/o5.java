/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import ax.b6.L1;
import ax.b6.r7;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.Z1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.l5;
import com.google.android.gms.measurement.internal.m5;
import com.google.android.gms.measurement.internal.q5;
import java.util.HashMap;
import java.util.Map;

public final class o5
extends l5 {
    o5(q5 q52) {
        super(q52);
    }

    private final String v(String string) {
        string = ((l5)this).r().R(string);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            Object object = Uri.parse((String)F.r.a(null));
            Uri.Builder builder = object.buildUpon();
            object = object.getAuthority();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(".");
            stringBuilder.append((String)object);
            builder.authority(stringBuilder.toString());
            return builder.build().toString();
        }
        return F.r.a(null);
    }

    public final m5 u(String string) {
        if (r7.a() && ((f3)this).d().t(F.t0)) {
            ((f3)this).i();
            if (B5.H0(string)) {
                Object object;
                ((f3)this).k().K().a("sgtm feature flag enabled.");
                Z1 z12 = ((l5)this).q().H0(string);
                if (z12 == null) {
                    return new m5(this.v(string), 1);
                }
                Object object2 = z12.m();
                Object object3 = ((l5)this).r().L(string);
                if (object3 != null && (object = ((l5)this).q().H0(string)) != null && (((L1)object3).d0() && ((L1)object3).S().n() == 100 || ((f3)this).i().E0(string, ((Z1)object).v()) || !TextUtils.isEmpty((CharSequence)object2) && ((String)object2).hashCode() % 100 < ((L1)object3).S().n())) {
                    boolean bl = z12.C();
                    object3 = null;
                    if (!bl) {
                        object2 = object3;
                    } else {
                        ((f3)this).k().K().a("sgtm upload enabled in manifest.");
                        Object object4 = ((l5)this).r().L(z12.l());
                        object2 = object3;
                        if (object4 != null) {
                            if (!((L1)object4).d0()) {
                                object2 = object3;
                            } else {
                                object = ((L1)object4).S().L();
                                if (TextUtils.isEmpty((CharSequence)object)) {
                                    object2 = object3;
                                } else {
                                    object3 = ((L1)object4).S().K();
                                    object4 = ((f3)this).k().K();
                                    object2 = TextUtils.isEmpty((CharSequence)object3) ? "Y" : "N";
                                    ((X1)object4).c("sgtm configured with upload_url, server_info", object, object2);
                                    if (TextUtils.isEmpty((CharSequence)object3)) {
                                        object2 = new m5((String)object, 3);
                                    } else {
                                        object2 = new HashMap<String, Object>();
                                        object2.put("x-sgtm-server-info", object3);
                                        if (!TextUtils.isEmpty((CharSequence)z12.v())) {
                                            object2.put("x-gtm-server-preview", z12.v());
                                        }
                                        object2 = new m5((String)object, (Map)object2, 3);
                                    }
                                }
                            }
                        }
                    }
                    if (object2 != null) {
                        return object2;
                    }
                } else {
                    return new m5(this.v(string), 1);
                }
            }
        }
        return new m5(this.v(string), 1);
    }
}

