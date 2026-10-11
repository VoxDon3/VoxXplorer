package ax.v4;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.v4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3275b {
    public static Map<Class<?>, a> a = new HashMap();

    /* renamed from: ax.v4.b$a */
    public interface a {
        void a(Object obj, String str);
    }

    public static void a(Object obj, String str) {
        Class<?> cls = obj.getClass();
        if (a.containsKey(cls)) {
            a.get(cls).a(obj, str);
        }
    }
}
