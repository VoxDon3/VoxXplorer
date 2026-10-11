package ax.ic;

import javax.el.BeanELResolver;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.FunctionMapper;
import javax.el.ValueExpression;
import javax.el.VariableMapper;

/* loaded from: classes3.dex */
public class b extends ELContext {
    private final ELResolver a = new BeanELResolver(true);
    private final FunctionMapper b;
    private final VariableMapper c;
    private final Object d;

    /* renamed from: ax.ic.b$b, reason: collision with other inner class name */
    private class C0339b extends VariableMapper {
        private final ValueExpression a;

        private C0339b() {
            this.a = C2297a.b().createValueExpression(b.this.d, b.this.d.getClass());
        }
    }

    private class c extends FunctionMapper {
        private c() {
        }
    }

    public b(Object obj) {
        this.d = obj;
        this.b = new c();
        this.c = new C0339b();
    }
}
