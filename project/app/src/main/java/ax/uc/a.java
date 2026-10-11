/*
 * Decompiled with CFR 0.152.
 */
package ax.uc;

import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

public final class a
implements EventListener.Factory {
    public final EventListener a;

    public /* synthetic */ a(EventListener eventListener) {
        this.a = eventListener;
    }

    @Override
    public final EventListener create(Call call) {
        return Util.a(this.a, call);
    }
}

