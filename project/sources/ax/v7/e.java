package ax.v7;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public interface e<V> extends Future<V> {
    void h(Runnable runnable, Executor executor);
}
