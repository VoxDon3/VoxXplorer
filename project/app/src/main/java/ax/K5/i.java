/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import ax.K5.g;
import ax.K5.h;
import ax.K5.l;
import ax.K5.q;
import ax.L5.m;
import ax.M5.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class i {
    public static <R extends l> h<R> a(R r8, g object) {
        p.m(r8, "Result must not be null");
        p.b(r8.e().C() ^ true, "Status code must not be SUCCESS");
        object = new q((g)object, r8);
        ((BasePendingResult)object).f(r8);
        return object;
    }

    public static h<Status> b(Status status, g object) {
        p.m(status, "Result must not be null");
        object = new m((g)object);
        ((BasePendingResult)object).f(status);
        return object;
    }
}

