/*
 * Decompiled with CFR 0.152.
 */
package ax.kc;

import ax.cc.b;
import ax.fc.a;
import ax.hc.c;
import ax.hc.d;
import ax.hc.h;
import ax.hc.j;
import ax.kc.e;
import ax.kc.f;
import java.lang.reflect.Modifier;
import java.util.Collection;

public class g {
    protected ax.hc.g a(f f8, ax.hc.f b8) {
        h h8 = new h(f8, (ax.hc.f)b8);
        b8 = h8;
        if (f8.a().j()) {
            b8 = new c(h8);
        }
        if (f8.a().k()) {
            return new d((ax.hc.g)b8);
        }
        return b8;
    }

    protected ax.hc.f b(f f8) throws Exception {
        ax.hc.f f9;
        ax.hc.f f10 = f9 = this.c(f8);
        if (f8.a().l()) {
            f10 = new j(f9);
        }
        if (f8.a().i()) {
            return new ax.hc.a(f10);
        }
        return f10;
    }

    protected ax.hc.f c(f object) throws ax.fc.b {
        NoSuchMethodException noSuchMethodException2;
        Class<? extends ax.hc.e> clazz;
        block4: {
            clazz = ((f)object).a().e();
            if (clazz.isMemberClass() && !Modifier.isStatic(clazz.getModifiers())) {
                throw new ax.fc.b("The handler invocation must be top level class or nested STATIC inner class");
            }
            try {
                object = clazz.getConstructor(f.class).newInstance(object);
                return object;
            }
            catch (Exception exception) {
            }
            catch (NoSuchMethodException noSuchMethodException2) {
                break block4;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Could not instantiate the provided handler invocation ");
            ((StringBuilder)object).append(clazz.getSimpleName());
            throw new ax.fc.b(((StringBuilder)object).toString(), exception);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The provided handler invocation did not specify the necessary constructor ");
        stringBuilder.append(clazz.getSimpleName());
        stringBuilder.append("(SubscriptionContext);");
        throw new ax.fc.b(stringBuilder.toString(), noSuchMethodException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e d(b object, ax.jc.g g8) throws ax.fc.b {
        f f8;
        Object object2;
        try {
            object2 = (Collection)((b)object).c("bus.handlers.error");
            f8 = new f((b)object, g8, (Collection<a>)object2);
            object2 = this.a(f8, this.b(f8));
            object = g8.m() ? new ax.gc.e() : new ax.gc.f();
        }
        catch (Exception exception) {
            throw new ax.fc.b(exception);
        }
        return new e(f8, (ax.hc.g)object2, (Collection<Object>)object);
    }
}

