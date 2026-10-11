package ax.ic;

import ax.fc.C2093d;
import ax.jc.d;
import ax.kc.C2424f;
import javax.el.ExpressionFactory;

/* renamed from: ax.ic.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2297a implements d {

    /* renamed from: ax.ic.a$a, reason: collision with other inner class name */
    public static final class C0338a {
        public static final ExpressionFactory a = a();

        private static final ExpressionFactory a() {
            try {
                return ExpressionFactory.newInstance();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    public static final ExpressionFactory b() {
        return C0338a.a;
    }

    private boolean c(String str, b bVar, C2424f c2424f, Object obj) {
        try {
            return ((Boolean) b().createValueExpression(bVar, str, Boolean.class).getValue(bVar)).booleanValue();
        } catch (Throwable th) {
            c2424f.c(new C2093d(th, "Error while evaluating EL expression on message", c2424f).f(obj));
            return false;
        }
    }

    public static final boolean d() {
        return C0338a.a != null;
    }

    @Override // ax.jc.d
    public boolean a(Object obj, C2424f c2424f) {
        return c(c2424f.a().b(), new b(obj), c2424f, obj);
    }
}
