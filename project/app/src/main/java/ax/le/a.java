/*
 * Decompiled with CFR 0.152.
 */
package ax.le;

import ax.ke.E;
import ax.ke.i;
import ax.le.b;
import ax.le.c;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public final class a
extends i.a {
    private final Gson a;

    private a(Gson gson) {
        this.a = gson;
    }

    public static a f() {
        return ax.le.a.g(new Gson());
    }

    public static a g(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override
    public i<?, RequestBody> c(Type object, Annotation[] annotationArray, Annotation[] annotationArray2, E e8) {
        object = this.a.m(ax.x8.a.b((Type)object));
        return new b(this.a, object);
    }

    @Override
    public i<ResponseBody, ?> d(Type object, Annotation[] annotationArray, E e8) {
        object = this.a.m(ax.x8.a.b((Type)object));
        return new c(this.a, object);
    }
}

