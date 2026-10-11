/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.D0;
import ax.W5.I1;
import ax.W5.J0;
import ax.W5.O0;
import ax.W5.c2;
import ax.W5.d2;
import ax.W5.j1;
import ax.W5.t0;
import ax.W5.y1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class E0 {
    private static final E0 d = new E0(true);
    final I1 a;
    private boolean b;
    private boolean c;

    private E0() {
        this.a = new y1(16);
    }

    private E0(boolean bl) {
        y1 y12 = new y1(0);
        this.a = y12;
        this.b();
        this.b();
    }

    public static E0 a() {
        throw null;
    }

    private static final void d(D0 d02, Object object) {
        block15: {
            boolean bl;
            c2 c22 = d02.b();
            Object object2 = O0.d;
            object.getClass();
            object2 = (Object)c2.c0;
            object2 = (Object)d2.c0;
            switch (c22.d().ordinal()) {
                default: {
                    break block15;
                }
                case 8: {
                    if (object instanceof j1) {
                        return;
                    }
                    break block15;
                }
                case 7: {
                    if (object instanceof Integer) {
                        return;
                    }
                    break block15;
                }
                case 6: {
                    if (object instanceof t0 || object instanceof byte[]) {
                        return;
                    }
                    break block15;
                }
                case 5: {
                    bl = object instanceof String;
                    break;
                }
                case 4: {
                    bl = object instanceof Boolean;
                    break;
                }
                case 3: {
                    bl = object instanceof Double;
                    break;
                }
                case 2: {
                    bl = object instanceof Float;
                    break;
                }
                case 1: {
                    bl = object instanceof Long;
                    break;
                }
                case 0: {
                    bl = object instanceof Integer;
                }
            }
            if (bl) {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{d02.a(), d02.b().d(), object.getClass().getName()}));
    }

    public final void b() {
        if (!this.b) {
            for (int i8 = 0; i8 < this.a.b(); ++i8) {
                Map.Entry entry = this.a.g(i8);
                if (!(entry.getValue() instanceof J0)) continue;
                ((J0)entry.getValue()).j();
            }
            this.a.a();
            this.b = true;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c(D0 d02, Object arrayList) {
        if (d02.c()) {
            if (!(arrayList instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            int n8 = arrayList2.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                E0.d(d02, arrayList2.get(i8));
            }
            arrayList = arrayList2;
        } else {
            E0.d(d02, arrayList);
        }
        this.a.e(d02, arrayList);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof E0)) {
            return false;
        }
        object = (E0)object;
        return this.a.equals(((E0)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

