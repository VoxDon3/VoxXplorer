/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import ax.C5.a;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.P4;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.l2;
import com.google.android.gms.measurement.internal.q5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class Q4
extends k5 {
    private final Map<String, P4> d = new HashMap<String, P4>();
    public final l2 e;
    public final l2 f;
    public final l2 g;
    public final l2 h;
    public final l2 i;

    Q4(q5 g32) {
        super((q5)g32);
        g32 = ((f3)this).h();
        j.Objects.requireNonNull((Object)g32);
        this.e = new l2((g2)g32, "last_delete_stale", 0L);
        g32 = ((f3)this).h();
        j.Objects.requireNonNull((Object)g32);
        this.f = new l2((g2)g32, "backoff", 0L);
        g32 = ((f3)this).h();
        j.Objects.requireNonNull((Object)g32);
        this.g = new l2((g2)g32, "last_upload", 0L);
        g32 = ((f3)this).h();
        j.Objects.requireNonNull((Object)g32);
        this.h = new l2((g2)g32, "last_upload_attempt", 0L);
        g32 = ((f3)this).h();
        j.Objects.requireNonNull((Object)g32);
        this.i = new l2((g2)g32, "midnight_offset", 0L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    private final Pair<String, Boolean> y(String string) {
        Object object;
        block8: {
            Exception exception2;
            long l8;
            block7: {
                ((f3)this).n();
                long l9 = ((f3)this).b().b();
                Object object2 = this.d.get(string);
                if (object2 != null && l9 < ((P4)object2).c) {
                    return new Pair((Object)((P4)object2).a, (Object)((P4)object2).b);
                }
                ax.C5.a.b(true);
                l8 = ((f3)this).d().B(string) + l9;
                try {
                    try {
                        object = ax.C5.a.a(((f3)this).a());
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        if (object2 != null && l9 < ((P4)object2).c + ((f3)this).d().z(string, F.c)) {
                            return new Pair((Object)((P4)object2).a, (Object)((P4)object2).b);
                        }
                        object = null;
                    }
                }
                catch (Exception exception2) {
                    break block7;
                }
                if (object == null) {
                    return new Pair((Object)"00000000-0000-0000-0000-000000000000", (Object)Boolean.FALSE);
                }
                object2 = ((a.a)object).a();
                object = object2 != null ? new P4((String)object2, ((a.a)object).b(), l8) : new P4("", ((a.a)object).b(), l8);
                break block8;
            }
            ((f3)this).k().F().b("Unable to get advertising id", exception2);
            object = new P4("", false, l8);
        }
        this.d.put(string, (P4)object);
        ax.C5.a.b(false);
        return new Pair((Object)((P4)object).a, (Object)((P4)object).b);
    }

    @Deprecated
    final String A(String string, boolean bl) {
        ((f3)this).n();
        string = bl ? (String)this.y((String)string).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigest = B5.V0();
        if (messageDigest == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest(string.getBytes())));
    }

    @Override
    protected final boolean x() {
        return false;
    }

    final Pair<String, Boolean> z(String string, h3 h32) {
        if (h32.A()) {
            return this.y(string);
        }
        return new Pair((Object)"", (Object)Boolean.FALSE);
    }
}

