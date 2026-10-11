/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import android.util.SparseArray;
import ax.o5.f;
import ax.o5.s;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class p {
    public static a a() {
        return new f.b();
    }

    public abstract s b();

    public abstract b c();

    @AutoValue.Builder
    public static abstract class a {
        public abstract p a();

        public abstract a b(s var1);

        public abstract a c(b var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        private static final SparseArray<b> e0;
        private static final b[] f0;
        private final int q;

        static {
            SparseArray sparseArray;
            b b8;
            b b9;
            c0 = b9 = new b(0);
            d0 = b8 = new b(5);
            f0 = new b[]{b9, b8};
            e0 = sparseArray = new SparseArray();
            sparseArray.put(0, (Object)b9);
            sparseArray.put(5, (Object)b8);
        }

        private b(int n9) {
            this.q = n9;
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }
    }
}

