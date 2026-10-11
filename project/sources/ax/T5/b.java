package ax.T5;

import android.os.IBinder;
import ax.M5.C0821p;
import ax.T5.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class b<T> extends a.AbstractBinderC0196a {
    private final Object e;

    private b(Object obj) {
        this.e = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T B(a aVar) {
        if (aVar instanceof b) {
            return (T) ((b) aVar).e;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        C0821p.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static <T> a a2(T t) {
        return new b(t);
    }
}
