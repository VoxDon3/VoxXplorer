/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.os.Bundle;
import ax.d3.E;
import java.util.function.Consumer;

public final class D
implements Consumer {
    public final E a;

    public /* synthetic */ D(E e8) {
        this.a = e8;
    }

    public final void accept(Object object) {
        E.Q4(this.a, (Bundle)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j.Consumer._CC.$default$andThen((Consumer)this, (Consumer)consumer);
    }
}

