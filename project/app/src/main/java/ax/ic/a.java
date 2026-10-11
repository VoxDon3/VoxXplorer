/*
 * Decompiled with CFR 0.152.
 */
package ax.ic;

import ax.fc.d;
import ax.ic.b;
import ax.kc.f;
import javax.el.ELContext;
import javax.el.ExpressionFactory;

public class a
implements ax.jc.d {
    public static final ExpressionFactory b() {
        return a.a;
    }

    private boolean c(String string, b b8, f f8, Object object) {
        string = a.b().createValueExpression((ELContext)b8, string, Boolean.class);
        try {
            boolean bl = (Boolean)string.getValue((ELContext)b8);
            return bl;
        }
        catch (Throwable throwable) {
            f8.c(new d(throwable, "Error while evaluating EL expression on message", f8).f(object));
            return false;
        }
    }

    public static final boolean d() {
        return a.a != null;
    }

    public boolean a(Object object, f f8) {
        return this.c(f8.a().b(), new b(object), f8, object);
    }

    public static final class a {
        public static final ExpressionFactory a = ax.ic.a$a.a();

        private static final ExpressionFactory a() {
            try {
                ExpressionFactory expressionFactory = ExpressionFactory.newInstance();
                return expressionFactory;
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
        }
    }
}

