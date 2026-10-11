package ax.ke;

import ax.ke.InterfaceC2437i;
import j$.util.Optional;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes3.dex */
final class r extends InterfaceC2437i.a {
    static final InterfaceC2437i.a a = new r();

    @IgnoreJRERequirement
    static final class a<T> implements InterfaceC2437i<ResponseBody, Optional<T>> {
        final InterfaceC2437i<ResponseBody, T> a;

        a(InterfaceC2437i<ResponseBody, T> interfaceC2437i) {
            this.a = interfaceC2437i;
        }

        @Override // ax.ke.InterfaceC2437i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.a.a(responseBody));
        }
    }

    r() {
    }

    @Override // ax.ke.InterfaceC2437i.a
    public InterfaceC2437i<ResponseBody, ?> d(Type type, Annotation[] annotationArr, E e) {
        if (InterfaceC2437i.a.b(type) != Optional.class) {
            return null;
        }
        return new a(e.h(InterfaceC2437i.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
