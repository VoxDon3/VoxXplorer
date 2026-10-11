/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import ax.M5.p;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.Z;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.e4;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g4;
import com.google.android.gms.measurement.internal.h4;
import com.google.android.gms.measurement.internal.i4;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.z2;
import java.util.Map;

public final class f4
extends b1 {
    private volatile d4 c;
    private volatile d4 d;
    protected d4 e;
    private final Map<Activity, d4> f;
    private Activity g;
    private volatile boolean h;
    private volatile d4 i;
    private d4 j;
    private boolean k;
    private final Object l = new Object();

    public f4(E2 e22) {
        super(e22);
        this.f = new j.ConcurrentHashMap();
    }

    static /* bridge */ /* synthetic */ d4 B(f4 f42) {
        return f42.j;
    }

    private final String D(Class<?> object, String object2) {
        if ((object = ((Class)object).getCanonicalName()) == null) {
            return object2;
        }
        object = ((String[])(object = ((String)object).split("\\."))).length > 0 ? object[((String[])object).length - 1] : "";
        object2 = object;
        if (((String)object).length() > ((f3)this).d().r(null, false)) {
            object2 = ((String)object).substring(0, ((f3)this).d().r(null, false));
        }
        return object2;
    }

    private final void G(Activity object, d4 d42, boolean bl) {
        d4 d43 = this.c == null ? this.d : this.c;
        if (d42.b == null) {
            object = object != null ? this.D(object.getClass(), "Activity") : null;
            object = new d4(d42.a, (String)object, d42.c, d42.e, d42.f);
        } else {
            object = d42;
        }
        this.d = this.c;
        this.c = object;
        long l8 = ((f3)this).b().b();
        ((f3)this).l().D(new h4(this, (d4)object, d43, l8, bl));
    }

    private final void J(d4 d42, d4 object, long l8, boolean bl, Bundle object2) {
        ((f3)this).n();
        boolean bl2 = false;
        boolean bl3 = object == null || ((d4)object).c != d42.c || !j.Objects.equals((Object)((d4)object).b, (Object)d42.b) || !j.Objects.equals((Object)((d4)object).a, (Object)d42.a);
        boolean bl4 = bl2;
        if (bl) {
            bl4 = bl2;
            if (this.e != null) {
                bl4 = true;
            }
        }
        if (bl3) {
            long l9;
            long l10;
            Bundle bundle = object2 != null ? new Bundle(object2) : new Bundle();
            B5.X(d42, bundle, true);
            if (object != null) {
                object2 = ((d4)object).a;
                if (object2 != null) {
                    bundle.putString("_pn", (String)object2);
                }
                if ((object2 = ((d4)object).b) != null) {
                    bundle.putString("_pc", (String)object2);
                }
                bundle.putLong("_pi", ((d4)object).c);
            }
            if (bl4 && (l10 = ((C1)this).u().f.a(l8)) > 0L) {
                ((f3)this).i().M(bundle, l10);
            }
            if (!((f3)this).d().T()) {
                bundle.putLong("_mst", 1L);
            }
            object = d42.e ? "app" : "auto";
            l10 = ((f3)this).b().a();
            if (d42.e && (l9 = d42.f) != 0L) {
                l10 = l9;
            }
            ((C1)this).r().d0((String)object, "_vs", l10, bundle);
        }
        if (bl4) {
            this.K(this.e, true, l8);
        }
        this.e = d42;
        if (d42.e) {
            this.j = d42;
        }
        ((C1)this).t().L(d42);
    }

    private final void K(d4 d42, boolean bl, long l8) {
        ((C1)this).o().v(((f3)this).b().b());
        boolean bl2 = d42 != null && d42.d;
        if (((C1)this).u().E(bl2, bl, l8) && d42 != null) {
            d42.d = false;
        }
    }

    static /* synthetic */ void L(f4 f42, Bundle bundle, d4 d42, d4 d43, long l8) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        f42.J(d42, d43, l8, true, ((f3)f42).i().F(null, "screen_view", bundle, null, false));
    }

    static /* bridge */ /* synthetic */ void M(f4 f42, d4 d42) {
        f42.j = null;
    }

    static /* bridge */ /* synthetic */ void N(f4 f42, d4 d42, d4 d43, long l8, boolean bl, Bundle bundle) {
        f42.J(d42, d43, l8, bl, null);
    }

    static /* bridge */ /* synthetic */ void O(f4 f42, d4 d42, boolean bl, long l8) {
        f42.K(d42, false, l8);
    }

    private final d4 T(Activity activity) {
        d4 d42;
        p.l(activity);
        d4 d43 = d42 = this.f.get(activity);
        if (d42 == null) {
            d43 = new d4(null, this.D(activity.getClass(), "Activity"), ((f3)this).i().R0());
            this.f.put(activity, d43);
        }
        if (this.i != null) {
            return this.i;
        }
        return d43;
    }

    @Override
    protected final boolean A() {
        return false;
    }

    public final d4 C(boolean bl) {
        this.v();
        ((f3)this).n();
        if (!bl) {
            return this.e;
        }
        d4 d42 = this.e;
        if (d42 != null) {
            return d42;
        }
        return this.j;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void E(Activity activity) {
        Object object = this.l;
        // MONITORENTER : object
        if (activity == this.g) {
            this.g = null;
        }
        if (!((f3)this).d().T()) {
            return;
        }
        this.f.remove(activity);
    }

    public final void F(Activity activity, Bundle object) {
        if (!((f3)this).d().T() || object == null || (object = object.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        object = new d4(object.getString("name"), object.getString("referrer_name"), object.getLong("id"));
        this.f.put(activity, (d4)object);
    }

    @Deprecated
    public final void H(Activity activity, String object, String object2) {
        if (!((f3)this).d().T()) {
            ((f3)this).k().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        Object object3 = this.c;
        if (object3 == null) {
            ((f3)this).k().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get(activity) == null) {
            ((f3)this).k().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        String string = object2;
        if (object2 == null) {
            string = this.D(activity.getClass(), "Activity");
        }
        boolean bl = j.Objects.equals((Object)((d4)object3).b, (Object)string);
        boolean bl2 = j.Objects.equals((Object)((d4)object3).a, (Object)object);
        if (bl && bl2) {
            ((f3)this).k().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (object != null && (((String)object).length() <= 0 || ((String)object).length() > ((f3)this).d().r(null, false))) {
            ((f3)this).k().M().b("Invalid screen name length in setCurrentScreen. Length", ((String)object).length());
            return;
        }
        if (string != null && (string.length() <= 0 || string.length() > ((f3)this).d().r(null, false))) {
            ((f3)this).k().M().b("Invalid class name length in setCurrentScreen. Length", string.length());
            return;
        }
        object3 = ((f3)this).k().K();
        object2 = object == null ? "null" : object;
        ((X1)object3).c("Setting current screen to name, class", object2, string);
        object = new d4((String)object, string, ((f3)this).i().R0());
        this.f.put(activity, (d4)object);
        this.G(activity, (d4)object, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void I(Bundle bundle, long l8) {
        String string;
        Object object3 = this.l;
        // MONITORENTER : object3
        if (!this.k) {
            ((f3)this).k().M().a("Cannot log screen view event when the app is in the background.");
            // MONITOREXIT : object3
            return;
        }
        Object object2 = null;
        if (bundle != null) {
            string = bundle.getString("screen_name");
            if (string != null && (string.length() <= 0 || string.length() > ((f3)this).d().r(null, false))) {
                ((f3)this).k().M().b("Invalid screen name length for screen view. Length", string.length());
                // MONITOREXIT : object3
                return;
            }
            object2 = bundle.getString("screen_class");
            if (object2 != null && (((String)object2).length() <= 0 || ((String)object2).length() > ((f3)this).d().r(null, false))) {
                ((f3)this).k().M().b("Invalid screen class length for screen view. Length", ((String)object2).length());
                // MONITOREXIT : object3
                return;
            }
        } else {
            string = null;
        }
        Object object = object2;
        if (object2 == null) {
            object = this.g;
            object = object != null ? this.D(object.getClass(), "Activity") : "Activity";
        }
        object2 = this.c;
        if (this.h && object2 != null) {
            this.h = false;
            boolean bl = j.Objects.equals((Object)((d4)object2).b, (Object)object);
            boolean bl2 = j.Objects.equals((Object)((d4)object2).a, (Object)string);
            if (bl && bl2) {
                ((f3)this).k().M().a("Ignoring call to log screen view event with duplicate parameters.");
                // MONITOREXIT : object3
                return;
            }
        }
        // MONITOREXIT : object3
        X1 x12 = ((f3)this).k().K();
        object2 = string == null ? "null" : string;
        object3 = object == null ? "null" : object;
        x12.c("Logging screen view with name, class", object2, object3);
        object2 = this.c == null ? this.d : this.c;
        object = new d4(string, (String)object, ((f3)this).i().R0(), true, l8);
        this.c = object;
        this.d = object2;
        this.i = object;
        l8 = ((f3)this).b().b();
        ((f3)this).l().D(new e4(this, bundle, (d4)object, (d4)object2, l8));
    }

    public final d4 P() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Q(Activity object) {
        Object object2 = this.l;
        synchronized (object2) {
            this.k = false;
            this.h = true;
        }
        long l8 = ((f3)this).b().b();
        if (!((f3)this).d().T()) {
            this.c = null;
            ((f3)this).l().D(new j4(this, l8));
            return;
        }
        object = this.T((Activity)object);
        this.d = this.c;
        this.c = null;
        ((f3)this).l().D(new i4(this, (d4)object, l8));
    }

    public final void R(Activity activity, Bundle bundle) {
        d4 d42;
        if (!((f3)this).d().T() || bundle == null || (d42 = this.f.get(activity)) == null) {
            return;
        }
        activity = new Bundle();
        activity.putLong("id", d42.c);
        activity.putString("name", d42.a);
        activity.putString("referrer_name", d42.b);
        bundle.putBundle("com.google.app_measurement.screen_service", (Bundle)activity);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void S(Activity object) {
        block11: {
            Object object2 = this.l;
            // MONITORENTER : object2
            this.k = true;
            if (object == this.g) break block11;
            Object object3 = this.l;
            // MONITORENTER : object3
            this.g = object;
            this.h = false;
            if (((f3)this).d().T()) {
                this.i = null;
                z2 z22 = ((f3)this).l();
                object3 = new l4(this);
                z22.D((Runnable)object3);
            }
        }
        if (!((f3)this).d().T()) {
            this.c = this.i;
            ((f3)this).l().D(new g4(this));
            return;
        }
        this.G((Activity)object, this.T((Activity)object), false);
        object = ((C1)this).o();
        long l8 = ((f3)object).b().b();
        ((f3)object).l().D(new Z((z)object, l8));
    }
}

