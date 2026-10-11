package ax.l;

import android.content.Context;
import android.content.Intent;
import ax.Gb.l;

/* renamed from: ax.l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2438a<I, O> {

    /* renamed from: ax.l.a$a, reason: collision with other inner class name */
    public static final class C0356a<T> {
        private final T a;

        public C0356a(T t) {
            this.a = t;
        }

        public final T a() {
            return this.a;
        }
    }

    public abstract Intent a(Context context, I i);

    public C0356a<O> b(Context context, I i) {
        l.f(context, "context");
        return null;
    }

    public abstract O c(int i, Intent intent);
}
