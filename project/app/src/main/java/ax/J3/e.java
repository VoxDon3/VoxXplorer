/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import ax.J3.b;
import ax.J3.h;
import ax.J3.k;
import ax.P3.i;
import ax.g4.f;
import java.util.Iterator;
import java.util.Map;

@TargetApi(value=14)
public class e
extends ContextWrapper {
    static final k<?, ?> h = new b();
    private final Handler a;
    private final h b;
    private final ax.h4.b c;
    private final f d;
    private final Map<Class<?>, k<?, ?>> e;
    private final i f;
    private final int g;

    public e(Context context, h h8, ax.h4.b b8, f f8, Map<Class<?>, k<?, ?>> map, i i8, int n8) {
        super(context.getApplicationContext());
        this.b = h8;
        this.c = b8;
        this.d = f8;
        this.e = map;
        this.f = i8;
        this.g = n8;
        this.a = new Handler(Looper.getMainLooper());
    }

    public f a() {
        return this.d;
    }

    public <T> k<?, T> b(Class<T> clazz) {
        k k8 = this.e.get(clazz);
        Map.Entry<Class<?>, k<?, ?>> entry = k8;
        if (k8 == null) {
            Iterator<Map.Entry<Class<?>, k<?, ?>>> iterator = this.e.entrySet().iterator();
            while (true) {
                entry = k8;
                if (!iterator.hasNext()) break;
                entry = iterator.next();
                if (!((Class)entry.getKey()).isAssignableFrom(clazz)) continue;
                k8 = (k)entry.getValue();
            }
        }
        if (entry == null) {
            return h;
        }
        return entry;
    }

    public i c() {
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

