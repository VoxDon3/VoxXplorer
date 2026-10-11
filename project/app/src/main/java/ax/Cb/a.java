/*
 * Decompiled with CFR 0.152.
 */
package ax.Cb;

import ax.Jb.c;

public class a
extends ax.Bb.a {
    private final boolean c(int n8) {
        Integer n9 = a.b;
        return n9 == null || n9 >= n8;
        {
        }
    }

    @Override
    public c b() {
        if (this.c(34)) {
            return new ax.Kb.a();
        }
        return super.b();
    }

    private static final class a {
        public static final a a;
        public static final Integer b;

        static {
            Object object;
            Object object2;
            block5: {
                block4: {
                    a = new a();
                    object2 = null;
                    try {
                        object = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                        if (!(object instanceof Integer)) break block4;
                        object = (Integer)object;
                        break block5;
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                object = null;
            }
            Object object3 = object2;
            if (object != null) {
                object3 = object2;
                if (((Number)object).intValue() > 0) {
                    object3 = object;
                }
            }
            b = object3;
        }

        private a() {
        }
    }
}

