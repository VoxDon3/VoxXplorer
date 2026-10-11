/*
 * Decompiled with CFR 0.152.
 */
package ax.cc;

import ax.cc.b;
import ax.cc.d;
import ax.dc.c;
import ax.ec.c;
import ax.fc.a;
import ax.kc.e;
import ax.kc.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public abstract class a<T>
implements c<T> {
    private final List<ax.fc.a> a;
    private final d.a b;
    private final h c;
    private final b d;

    public a(ax.ec.d object) {
        Object object2 = new ArrayList<ax.fc.a>();
        this.a = object2;
        object2.addAll(object.b());
        if (object2.isEmpty()) {
            object2.add((ax.fc.a)new a.a());
            System.out.println("INFO: No error handler has been configured to handle exceptions during publication.\nPublication error handlers can be added by IBusConfiguration.addPublicationErrorHandler()\nFalling back to console logger.");
        }
        this.d = object2 = new b(this).a("bus.handlers.error", object.b()).a("bus.id", object.c("bus.id", UUID.randomUUID().toString()));
        if ((object = object.a(c.a.class)) != null) {
            this.c = ((c.a)object).e().a(((c.a)object).b(), ((c.a)object).d(), (b)object2);
            this.b = ((c.a)object).c();
            return;
        }
        throw ax.ec.b.a(c.a.class);
    }

    @Override
    public void b(Object object) {
        this.c.c(object);
    }

    protected d c(T t8) {
        Collection<e> collection = this.e(t8.getClass());
        if ((collection == null || collection.isEmpty()) && !t8.getClass().equals(ax.dc.a.class)) {
            collection = this.e(ax.dc.a.class);
            return this.d().a(this.d, collection, new ax.dc.a(t8));
        }
        return this.d().a(this.d, collection, t8);
    }

    protected d.a d() {
        return this.b;
    }

    protected Collection<e> e(Class clazz) {
        return this.c.b(clazz);
    }

    protected void f(ax.fc.d d8) {
        for (ax.fc.a a8 : this.a) {
            try {
                a8.a(d8);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.d.c("bus.id"));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

