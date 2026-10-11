package ax.J3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import ax.g4.C2117f;
import java.util.Map;

@TargetApi(14)
/* loaded from: classes.dex */
public class e extends ContextWrapper {
    static final k<?, ?> h = new b();
    private final Handler a;
    private final h b;
    private final ax.h4.b c;
    private final C2117f d;
    private final Map<Class<?>, k<?, ?>> e;
    private final ax.P3.i f;
    private final int g;

    public e(Context context, h hVar, ax.h4.b bVar, C2117f c2117f, Map<Class<?>, k<?, ?>> map, ax.P3.i iVar, int i) {
        super(context.getApplicationContext());
        this.b = hVar;
        this.c = bVar;
        this.d = c2117f;
        this.e = map;
        this.f = iVar;
        this.g = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public C2117f a() {
        return this.d;
    }

    public <T> k<?, T> b(Class<T> cls) {
        k<?, T> kVar = (k) this.e.get(cls);
        if (kVar == null) {
            for (Map.Entry<Class<?>, k<?, ?>> entry : this.e.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    kVar = (k) entry.getValue();
                }
            }
        }
        return kVar == null ? (k<?, T>) h : kVar;
    }

    public ax.P3.i c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public Handler e() {
        return this.a;
    }

    public h f() {
        return this.b;
    }
}
