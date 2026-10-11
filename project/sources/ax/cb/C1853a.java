package ax.cb;

import java.util.ServiceConfigurationError;

/* renamed from: ax.cb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1853a {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Class<?> cls, Class<T> cls2) {
        try {
            return (T) cls.asSubclass(cls2).getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new ServiceConfigurationError("Provider " + cls.getName() + " could not be instantiated.", e);
        }
    }
}
