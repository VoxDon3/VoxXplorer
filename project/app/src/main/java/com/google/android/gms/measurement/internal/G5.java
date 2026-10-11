/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.f3;

public final class G5 {
    private final E2 a;

    public G5(E2 e22) {
        this.a = e22;
    }

    private final boolean d() {
        return this.a.F().z.a() > 0L;
    }

    private final boolean e() {
        if (!this.d()) {
            return false;
        }
        return this.a.b().a() - this.a.F().z.a() > this.a.z().z(null, F.U);
    }

    final void a() {
        ((f3)this.a.l()).n();
        if (!this.d()) {
            return;
        }
        if (this.e()) {
            this.a.F().y.b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.a.H().Y0("auto", "_cmpx", bundle);
        } else {
            Object object2 = this.a.F().y.a();
            if (TextUtils.isEmpty((CharSequence)object2)) {
                this.a.k().I().a("Cache still valid but referrer not found");
            } else {
                long l8 = this.a.F().z.a() / 3600000L;
                Uri uri = Uri.parse((String)object2);
                Bundle bundle = new Bundle();
                Pair pair = new Pair((Object)uri.getPath(), (Object)bundle);
                for (Object object2 : uri.getQueryParameterNames()) {
                    bundle.putString((String)object2, uri.getQueryParameter((String)object2));
                }
                ((Bundle)pair.second).putLong("_cc", (l8 - 1L) * 3600000L);
                object2 = pair.first;
                object2 = object2 == null ? "app" : (String)object2;
                this.a.H().Y0((String)object2, "_cmp", (Bundle)pair.second);
            }
            this.a.F().y.b(null);
        }
        this.a.F().z.b(0L);
    }

    final void b(String string, Bundle bundle) {
        block5: {
            block9: {
                block6: {
                    Object object;
                    block8: {
                        block7: {
                            ((f3)this.a.l()).n();
                            if (this.a.p()) break block5;
                            if (bundle == null || bundle.isEmpty()) break block6;
                            if (string == null) break block7;
                            object = string;
                            if (!string.isEmpty()) break block8;
                        }
                        object = "auto";
                    }
                    string = new Uri.Builder();
                    string.path((String)object);
                    for (String string2 : bundle.keySet()) {
                        string.appendQueryParameter(string2, bundle.getString(string2));
                    }
                    string = string.build().toString();
                    break block9;
                }
                string = null;
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.a.F().y.b(string);
                this.a.F().z.b(this.a.b().a());
            }
        }
    }

    final void c() {
        if (this.d() && this.e()) {
            this.a.F().y.b(null);
        }
    }
}

