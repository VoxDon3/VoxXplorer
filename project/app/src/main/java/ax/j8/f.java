/*
 * Decompiled with CFR 0.152.
 */
package ax.j8;

import ax.j6.b;
import ax.j6.j;
import com.google.firebase.remoteconfig.internal.d;
import java.util.Date;
import java.util.Map;

public final class f
implements b {
    public final d a;
    public final j b;
    public final j c;
    public final Date d;
    public final Map e;

    public /* synthetic */ f(d d8, j j8, j j9, Date date, Map map) {
        this.a = d8;
        this.b = j8;
        this.c = j9;
        this.d = date;
        this.e = map;
    }

    public final Object a(j j8) {
        return com.google.firebase.remoteconfig.internal.d.a(this.a, this.b, this.c, this.d, this.e, j8);
    }
}

