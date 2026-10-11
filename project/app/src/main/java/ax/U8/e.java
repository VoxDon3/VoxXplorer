/*
 * Decompiled with CFR 0.152.
 */
package ax.U8;

import ax.U8.b;
import ax.U8.c;
import ax.U8.d;
import ax.U8.f;
import ax.U8.g;
import ax.U8.h;
import ax.U8.i;
import ax.Y8.c;
import ax.Z8.a;

public class e {
    public static b<?> a(ax.Z8.a<?> object) throws a.b {
        int n8 = ((ax.Z8.a)object).J();
        ax.U8.a a8 = c.a.f(n8, ax.U8.a.class, null);
        if (a8 != null) {
            switch (a.a[a8.ordinal()]) {
                default: {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Encountered unhandled AvId: ");
                    ((StringBuilder)object).append(a8);
                    throw new IllegalStateException(((StringBuilder)object).toString());
                }
                case 11: {
                    return new c().d((ax.Z8.a<?>)object);
                }
                case 10: {
                    return new g().d((ax.Z8.a<?>)object);
                }
                case 9: {
                    return new i().d((ax.Z8.a<?>)object);
                }
                case 8: {
                    return new f().d((ax.Z8.a<?>)object);
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    return new h(a8).d((ax.Z8.a<?>)object);
                }
                case 1: 
            }
            return new d().d((ax.Z8.a<?>)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Encountered unknown AvId: ");
        ((StringBuilder)object).append(n8);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }
}

