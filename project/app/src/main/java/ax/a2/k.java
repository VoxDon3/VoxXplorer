/*
 * Decompiled with CFR 0.152.
 */
package ax.a2;

import androidx.media3.ui.PlayerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class k
implements InvocationHandler {
    public final PlayerView a;

    public /* synthetic */ k(PlayerView playerView) {
        this.a = playerView;
    }

    @Override
    public final Object invoke(Object object, Method method, Object[] objectArray) {
        return PlayerView.b(this.a, object, method, objectArray);
    }
}

