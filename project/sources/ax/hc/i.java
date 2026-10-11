package ax.hc;

import ax.cc.C1857d;
import ax.fc.C2093d;
import ax.kc.C2424f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class i extends e {
    public i(C2424f c2424f) {
        super(c2424f);
    }

    @Override // ax.hc.f
    public void c(Object obj, Object obj2, C1857d c1857d) {
        Object obj3;
        InvocationTargetException invocationTargetException;
        Object obj4;
        Object obj5;
        IllegalAccessException illegalAccessException;
        Object[] objArr;
        Method f = b().a().f();
        try {
            try {
                objArr = new Object[1];
                try {
                    objArr[0] = obj2;
                } catch (IllegalAccessException e) {
                    illegalAccessException = e;
                    obj5 = obj;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    obj4 = obj;
                } catch (InvocationTargetException e3) {
                    invocationTargetException = e3;
                    obj3 = obj;
                }
            } catch (Throwable th) {
                d(c1857d, new C2093d(th, "Error during invocation of message handler. The handler code threw an exception", f, obj, c1857d));
                return;
            }
        } catch (IllegalAccessException e4) {
            obj5 = obj;
            illegalAccessException = e4;
        } catch (IllegalArgumentException e5) {
            e = e5;
            obj4 = obj;
        } catch (InvocationTargetException e6) {
            obj3 = obj;
            invocationTargetException = e6;
        }
        try {
            f.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            illegalAccessException = e7;
            obj5 = obj;
            d(c1857d, new C2093d(illegalAccessException, "Error during invocation of message handler. The class or method is not accessible", f, obj5, c1857d));
        } catch (IllegalArgumentException e8) {
            e = e8;
            obj4 = obj;
            d(c1857d, new C2093d(e, "Error during invocation of message handler. Wrong arguments passed to method. Was: " + obj2.getClass() + "Expected: " + f.getParameterTypes()[0], f, obj4, c1857d));
        } catch (InvocationTargetException e9) {
            invocationTargetException = e9;
            obj3 = obj;
            d(c1857d, new C2093d(invocationTargetException, "Error during invocation of message handler. There might be an access rights problem. Do you use non public inner classes?", f, obj3, c1857d));
        }
    }
}
