package ax.le;

import ax.ke.E;
import ax.ke.InterfaceC2437i;
import ax.x8.C3475a;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class a extends InterfaceC2437i.a {
    private final Gson a;

    private a(Gson gson) {
        this.a = gson;
    }

    public static a f() {
        return g(new Gson());
    }

    public static a g(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // ax.ke.InterfaceC2437i.a
    public InterfaceC2437i<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, E e) {
        return new b(this.a, this.a.m(C3475a.b(type)));
    }

    @Override // ax.ke.InterfaceC2437i.a
    public InterfaceC2437i<ResponseBody, ?> d(Type type, Annotation[] annotationArr, E e) {
        return new c(this.a, this.a.m(C3475a.b(type)));
    }
}
