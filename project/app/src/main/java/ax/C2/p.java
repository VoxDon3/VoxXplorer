/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.C2.r;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class p
implements Callable {
    public final r a;
    public final ArrayList b;
    public final String c;

    public /* synthetic */ p(r r8, ArrayList arrayList, String string) {
        this.a = r8;
        this.b = arrayList;
        this.c = string;
    }

    public final Object call() {
        return r.f(this.a, this.b, this.c);
    }
}

