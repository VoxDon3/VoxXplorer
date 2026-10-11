/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.E;
import ax.ke.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
final class r
extends i.a {
    static final i.a a = new r();

    r() {
    }

    @Override
    public i<ResponseBody, ?> d(Type type, Annotation[] annotationArray, E e8) {
        if (i.a.b(type) != j.Optional.class) {
            return null;
        }
        return new a(e8.h(i.a.a(0, (ParameterizedType)type), annotationArray));
    }

    @IgnoreJRERequirement
    static final class a<T>
    implements i<ResponseBody, j.Optional<T>> {
        final i<ResponseBody, T> a;

        a(i<ResponseBody, T> i8) {
            this.a = i8;
        }

        public j.Optional<T> b(ResponseBody responseBody) throws IOException {
            return j.Optional.ofNullable(this.a.a(responseBody));
        }
    }
}

