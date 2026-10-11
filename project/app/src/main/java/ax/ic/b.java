/*
 * Decompiled with CFR 0.152.
 */
package ax.ic;

import ax.ic.a;
import javax.el.BeanELResolver;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.FunctionMapper;
import javax.el.ValueExpression;
import javax.el.VariableMapper;

public class b
extends ELContext {
    private final ELResolver a;
    private final FunctionMapper b;
    private final VariableMapper c;
    private final Object d;

    public b(Object object) {
        this.d = object;
        this.b = new c(this);
        this.c = new b(this);
        this.a = new BeanELResolver(true);
    }

    private class b
    extends VariableMapper {
        private final ValueExpression a;
        final b b;

        private b(b b8) {
            this.b = b8;
            this.a = ax.ic.a.b().createValueExpression(b8.d, b8.d.getClass());
        }
    }

    private class c
    extends FunctionMapper {
        final b a;

        private c(b b8) {
            this.a = b8;
        }
    }
}

