package ax.Gb;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class w {
    private static final x a;
    private static final ax.Mb.b[] b;

    static {
        x xVar = null;
        try {
            xVar = (x) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (xVar == null) {
            xVar = new x();
        }
        a = xVar;
        b = new ax.Mb.b[0];
    }

    public static ax.Mb.d a(i iVar) {
        return a.a(iVar);
    }

    public static ax.Mb.b b(Class cls) {
        return a.b(cls);
    }

    public static ax.Mb.c c(Class cls) {
        return a.c(cls, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static ax.Mb.e d(o oVar) {
        return a.d(oVar);
    }

    public static ax.Mb.f e(q qVar) {
        return a.e(qVar);
    }

    public static String f(h hVar) {
        return a.f(hVar);
    }

    public static String g(m mVar) {
        return a.g(mVar);
    }
}
