/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ax.a3.Q;
import java.util.function.Consumer;

public final class P
implements Consumer {
    public final Fragment a;

    public /* synthetic */ P(Fragment fragment) {
        this.a = fragment;
    }

    public final void accept(Object object) {
        Q.i3(this.a, (Bundle)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j.Consumer._CC.$default$andThen((Consumer)this, (Consumer)consumer);
    }
}

