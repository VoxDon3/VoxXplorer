/*
 * Decompiled with CFR 0.152.
 */
package ax.hc;

import ax.fc.d;
import ax.hc.e;
import ax.kc.f;
import java.lang.reflect.InvocationTargetException;

public class i
extends e {
    public i(f f8) {
        super(f8);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void c(Object var1_1, Object var2_2, ax.cc.d var3_6) {
        var4_7 = this.b().a().f();
        try {
            var4_7.invoke(var1_1, new Object[]{var2_2});
            return;
        }
        catch (InvocationTargetException var2_4) {}
        catch (IllegalArgumentException var6_8) {}
        catch (IllegalAccessException var2_5) {}
        ** finally { 
lbl10:
        // 1 sources

        this.d(var3_6, new d(var2_3, "Error during invocation of message handler. The handler code threw an exception", var4_7, var1_1, var3_6));
    }
}

