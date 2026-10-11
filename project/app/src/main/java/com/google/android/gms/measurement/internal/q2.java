/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import ax.B.a;
import ax.M5.p;
import ax.b6.A1;
import ax.b6.C;
import ax.b6.G7;
import ax.b6.I1;
import ax.b6.K1;
import ax.b6.L1;
import ax.b6.O1;
import ax.b6.e0;
import ax.b6.k4;
import ax.b6.p2;
import ax.b6.s4;
import ax.f6.o;
import ax.f6.q;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.l5;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.q5;
import com.google.android.gms.measurement.internal.r2;
import com.google.android.gms.measurement.internal.t2;
import com.google.android.gms.measurement.internal.u2;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.x2;
import com.google.android.gms.measurement.internal.x5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public final class q2
extends k5
implements j {
    private final Map<String, Map<String, String>> d = new a<String, Map<String, String>>();
    private final Map<String, Set<String>> e = new a<String, Set<String>>();
    private final Map<String, Map<String, Boolean>> f = new a<String, Map<String, Boolean>>();
    private final Map<String, Map<String, Boolean>> g = new a<String, Map<String, Boolean>>();
    private final Map<String, L1> h = new a<String, L1>();
    private final Map<String, Map<String, Integer>> i;
    final ax.B.j<String, C> j;
    final G7 k;
    private final Map<String, String> l = new a<String, String>();
    private final Map<String, String> m = new a<String, String>();
    private final Map<String, String> n = new a<String, String>();

    q2(q5 q52) {
        super(q52);
        this.i = new a<String, Map<String, Integer>>();
        this.j = new v2(this, 20);
        this.k = new u2(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final L1 A(String string, byte[] object) {
        s4 s422;
        block6: {
            RuntimeException runtimeException2;
            block5: {
                String string2;
                X1 x12;
                L1 l12;
                if (object == null) {
                    return L1.R();
                }
                try {
                    l12 = (L1)((k4)x5.G(L1.P(), object).q());
                    x12 = ((f3)this).k().K();
                    boolean bl = l12.e0();
                    string2 = null;
                    object = bl ? (Object)l12.N() : null;
                }
                catch (RuntimeException runtimeException2) {
                    break block5;
                }
                catch (s4 s422) {
                    break block6;
                }
                if (l12.c0()) {
                    string2 = l12.T();
                }
                x12.c("Parsed config. version, gmp_app_id", object, string2);
                return l12;
            }
            ((f3)this).k().L().c("Unable to merge remote config. appId", V1.v(string), runtimeException2);
            return L1.R();
        }
        ((f3)this).k().L().c("Unable to merge remote config. appId", V1.v(string), s422);
        return L1.R();
    }

    private static h3.a C(I1.e e8) {
        int n8 = x2.b[e8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return null;
                    }
                    return h3.a.f0;
                }
                return h3.a.e0;
            }
            return h3.a.d0;
        }
        return h3.a.c0;
    }

    private static Map<String, String> D(L1 object) {
        a<String, String> a8 = new a<String, String>();
        if (object != null) {
            for (O1 o12 : ((L1)object).Z()) {
                a8.put(o12.J(), o12.K());
            }
        }
        return a8;
    }

    static /* bridge */ /* synthetic */ Map E(q2 q22) {
        return q22.d;
    }

    private final void F(String string, L1.a a8) {
        HashSet<String> hashSet = new HashSet<String>();
        a<String, Boolean> a9 = new a<String, Boolean>();
        a<String, Boolean> a10 = new a<String, Boolean>();
        a<String, Integer> a11 = new a<String, Integer>();
        if (a8 != null) {
            Object object = a8.D().iterator();
            while (object.hasNext()) {
                hashSet.add(object.next().J());
            }
            for (int i8 = 0; i8 < a8.w(); ++i8) {
                K1.a a12 = (K1.a)a8.x(i8).A();
                if (a12.y().isEmpty()) {
                    ((f3)this).k().L().a("EventConfig contained null event name");
                    continue;
                }
                String string2 = a12.y();
                String string3 = q.b(a12.y());
                object = a12;
                if (!TextUtils.isEmpty((CharSequence)string3)) {
                    object = a12.x(string3);
                    a8.y(i8, (K1.a)object);
                }
                if (((K1.a)object).C() && ((K1.a)object).z()) {
                    a9.put(string2, Boolean.TRUE);
                }
                if (((K1.a)object).D() && ((K1.a)object).B()) {
                    a10.put(((K1.a)object).y(), Boolean.TRUE);
                }
                if (!((K1.a)object).E()) continue;
                if (((K1.a)object).w() >= 2 && ((K1.a)object).w() <= 65535) {
                    a11.put(((K1.a)object).y(), ((K1.a)object).w());
                    continue;
                }
                ((f3)this).k().L().c("Invalid sampling rate. Event name, sample rate", ((K1.a)object).y(), ((K1.a)object).w());
            }
        }
        this.e.put(string, hashSet);
        this.f.put(string, a9);
        this.g.put(string, a10);
        this.i.put(string, a11);
    }

    private final void G(String string, L1 k422) {
        if (((L1)k422).n() == 0) {
            this.j.e(string);
            return;
        }
        ((f3)this).k().K().b("EES programs found", ((L1)k422).n());
        ax.b6.q2 e02 = ((L1)k422).Y().get(0);
        try {
            Object object = new C();
            Callable callable = new r2(this, string);
            ((C)object).c("internal.remoteConfig", callable);
            callable = new ax.f6.l(this, string);
            ((C)object).c("internal.appMetadata", callable);
            callable = new t2(this);
            ((C)object).c("internal.logger", callable);
            ((C)object).b(e02);
            this.j.d(string, (C)object);
            ((f3)this).k().K().c("EES program loaded for appId, activities", string, e02.I().n());
            for (p2 p22 : e02.I().K()) {
                ((f3)this).k().K().b("EES program activity", p22.J());
            }
            return;
        }
        catch (e0 e03) {
            ((f3)this).k().G().b("Failed to load EES program. appId", string);
            return;
        }
    }

    private final void h0(String string) {
        this.u();
        ((f3)this).n();
        p.f(string);
        if (this.h.get(string) == null) {
            m m8 = ((l5)this).q().J0(string);
            if (m8 == null) {
                this.d.put(string, null);
                this.f.put(string, null);
                this.e.put(string, null);
                this.g.put(string, null);
                this.h.put(string, null);
                this.l.put(string, null);
                this.m.put(string, null);
                this.n.put(string, null);
                this.i.put(string, null);
                return;
            }
            L1.a a8 = (L1.a)this.A(string, m8.a).A();
            this.F(string, a8);
            this.d.put(string, q2.D((L1)((k4)a8.q())));
            this.h.put(string, (L1)((k4)a8.q()));
            this.G(string, (L1)((k4)a8.q()));
            this.l.put(string, a8.B());
            this.m.put(string, m8.b);
            this.n.put(string, m8.c);
        }
    }

    static /* synthetic */ C z(q2 q22, String string) {
        q22.u();
        p.f(string);
        if (!q22.X(string)) {
            return null;
        }
        if (q22.h.containsKey(string) && q22.h.get(string) != null) {
            q22.G(string, q22.h.get(string));
        } else {
            q22.h0(string);
        }
        return q22.j.h().get(string);
    }

    /*
     * WARNING - void declaration
     */
    final o B(String object2, h3.a a8) {
        ((f3)this).n();
        this.h0((String)object2);
        I1 i12 = this.J((String)object2);
        if (i12 == null) {
            return o.c0;
        }
        for (I1.a a9 : i12.N()) {
            Object var2_5;
            if (q2.C(a9.K()) != var2_5) continue;
            int n8 = x2.c[a9.J().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return o.c0;
                }
                return o.f0;
            }
            return o.e0;
        }
        return o.c0;
    }

    protected final boolean H(String string, byte[] byArray, String string2, String string3) {
        Object object;
        this.u();
        ((f3)this).n();
        p.f(string);
        L1.a a8 = (L1.a)this.A(string, byArray).A();
        if (a8 == null) {
            return false;
        }
        this.F(string, a8);
        this.G(string, (L1)((k4)a8.q()));
        this.h.put(string, (L1)((k4)a8.q()));
        this.l.put(string, a8.B());
        this.m.put(string, string2);
        this.n.put(string, string3);
        this.d.put(string, q2.D((L1)((k4)a8.q())));
        ((l5)this).q().a0(string, new ArrayList<A1>(a8.C()));
        try {
            a8.z();
            object = ((L1)((k4)a8.q())).l();
            byArray = object;
        }
        catch (RuntimeException runtimeException) {
            ((f3)this).k().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", V1.v(string), runtimeException);
        }
        object = ((l5)this).q();
        p.f(string);
        ((f3)object).n();
        ((k5)object).u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", byArray);
        contentValues.put("config_last_modified_time", string2);
        contentValues.put("e_tag", string3);
        try {
            if ((long)((l)object).B().update("apps", contentValues, "app_id = ?", new String[]{string}) == 0L) {
                ((f3)object).k().G().b("Failed to update remote config (got 0). appId", V1.v(string));
            }
        }
        catch (SQLiteException sQLiteException) {
            ((f3)object).k().G().c("Error storing remote config. appId", V1.v(string), (Object)sQLiteException);
        }
        this.h.put(string, (L1)((k4)a8.q()));
        return true;
    }

    final int I(String object, String string) {
        ((f3)this).n();
        this.h0((String)object);
        object = this.i.get(object);
        if (object != null) {
            if ((object = (Integer)object.get(string)) == null) {
                return 1;
            }
            return (Integer)object;
        }
        return 1;
    }

    final I1 J(String object) {
        ((f3)this).n();
        this.h0((String)object);
        object = this.L((String)object);
        if (object != null && ((L1)object).b0()) {
            return ((L1)object).O();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    final h3.a K(String object2, h3.a a8) {
        ((f3)this).n();
        this.h0((String)object2);
        I1 i12 = this.J((String)object2);
        if (i12 == null) {
            return null;
        }
        for (I1.c c8 : i12.M()) {
            Object var2_5;
            if (var2_5 != q2.C(c8.K())) continue;
            return q2.C(c8.J());
        }
        return null;
    }

    protected final L1 L(String string) {
        this.u();
        ((f3)this).n();
        p.f(string);
        this.h0(string);
        return this.h.get(string);
    }

    /*
     * WARNING - void declaration
     */
    final boolean M(String object2, h3.a a8) {
        ((f3)this).n();
        this.h0((String)object2);
        I1 i12 = this.J((String)object2);
        if (i12 == null) {
            return false;
        }
        for (I1.a a9 : i12.L()) {
            Object var2_5;
            if (var2_5 != q2.C(a9.K())) continue;
            if (a9.J() != I1.d.d0) break;
            return true;
        }
        return false;
    }

    final boolean N(String object, String string) {
        ((f3)this).n();
        this.h0((String)object);
        if ("ecommerce_purchase".equals(string)) {
            return true;
        }
        if (!"purchase".equals(string) && !"refund".equals(string)) {
            if ((object = this.g.get(object)) != null) {
                if ((object = (Boolean)object.get(string)) == null) {
                    return false;
                }
                return (Boolean)object;
            }
            return false;
        }
        return true;
    }

    protected final String O(String string) {
        ((f3)this).n();
        return this.n.get(string);
    }

    final boolean P(String object, String string) {
        ((f3)this).n();
        this.h0((String)object);
        if (this.Y((String)object) && B5.J0(string)) {
            return true;
        }
        if (this.a0((String)object) && B5.L0(string)) {
            return true;
        }
        if ((object = this.f.get(object)) != null) {
            if ((object = (Boolean)object.get(string)) == null) {
                return false;
            }
            return (Boolean)object;
        }
        return false;
    }

    protected final String Q(String string) {
        ((f3)this).n();
        return this.m.get(string);
    }

    final String R(String string) {
        ((f3)this).n();
        this.h0(string);
        return this.l.get(string);
    }

    final Set<String> S(String string) {
        ((f3)this).n();
        this.h0(string);
        return this.e.get(string);
    }

    final SortedSet<String> T(String iterator) {
        ((f3)this).n();
        this.h0((String)((Object)iterator));
        TreeSet<String> treeSet = new TreeSet<String>();
        iterator = this.J((String)((Object)iterator));
        if (iterator != null) {
            iterator = ((I1)((Object)iterator)).K().iterator();
            while (iterator.hasNext()) {
                treeSet.add(iterator.next().J());
            }
        }
        return treeSet;
    }

    protected final void U(String string) {
        ((f3)this).n();
        this.m.put(string, null);
    }

    final void V(String string) {
        ((f3)this).n();
        this.h.remove(string);
    }

    final boolean W(String object) {
        ((f3)this).n();
        object = this.L((String)object);
        if (object == null) {
            return false;
        }
        return ((L1)object).a0();
    }

    public final boolean X(String object) {
        if (TextUtils.isEmpty((CharSequence)object)) {
            return false;
        }
        if ((object = this.h.get(object)) == null) {
            return false;
        }
        return ((L1)object).n() != 0;
    }

    final boolean Y(String string) {
        return "1".equals(this.c(string, "measurement.upload.blacklist_internal"));
    }

    final boolean Z(String object) {
        ((f3)this).n();
        this.h0((String)object);
        object = this.J((String)object);
        if (object == null) {
            return true;
        }
        return !((I1)object).P() || ((I1)object).O();
        {
        }
    }

    final boolean a0(String string) {
        return "1".equals(this.c(string, "measurement.upload.blacklist_public"));
    }

    final boolean b0(String string) {
        ((f3)this).n();
        this.h0(string);
        return this.e.get(string) != null && this.e.get(string).contains("app_instance_id");
    }

    @Override
    public final String c(String object, String string) {
        ((f3)this).n();
        this.h0((String)object);
        object = this.d.get(object);
        if (object != null) {
            return (String)object.get(string);
        }
        return null;
    }

    final boolean c0(String string) {
        ((f3)this).n();
        this.h0(string);
        return this.e.get(string) != null && (this.e.get(string).contains("device_model") || this.e.get(string).contains("device_info"));
    }

    final boolean d0(String string) {
        ((f3)this).n();
        this.h0(string);
        return this.e.get(string) != null && this.e.get(string).contains("enhanced_user_id");
    }

    final boolean e0(String string) {
        ((f3)this).n();
        this.h0(string);
        return this.e.get(string) != null && this.e.get(string).contains("google_signals");
    }

    final boolean f0(String string) {
        ((f3)this).n();
        this.h0(string);
        return this.e.get(string) != null && (this.e.get(string).contains("os_version") || this.e.get(string).contains("device_info"));
    }

    final boolean g0(String string) {
        ((f3)this).n();
        this.h0(string);
        return this.e.get(string) != null && this.e.get(string).contains("user_id");
    }

    @Override
    protected final boolean x() {
        return false;
    }

    final long y(String string) {
        String string2 = this.c(string, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            try {
                long l8 = Long.parseLong(string2);
                return l8;
            }
            catch (NumberFormatException numberFormatException) {
                ((f3)this).k().L().c("Unable to parse timezone offset. appId", V1.v(string), numberFormatException);
            }
        }
        return 0L;
    }
}

