/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.os.Bundle;
import ax.d3.E;
import java.util.function.Consumer;

public final class B
implements Consumer {
    public final E a;
    public final boolean b;

    public /* synthetic */ B(E e8, boolean bl) {
        this.a = e8;
        this.b = bl;
    }

    public final void accept(Object object) {
        E.R4(this.a, this.b, (Bundle)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j.Consumer._CC.$default$andThen((Consumer)this, (Consumer)consumer);
    }
}

