/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Bundle;
import ax.M5.a0;
import ax.M5.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class n {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            Object object = bundle.keySet();
            if (!object.containsAll(bundle2.keySet())) {
                return false;
            }
            object = object.iterator();
            while (object.hasNext()) {
                String string = (String)object.next();
                if (n.b(bundle.get(string), bundle2.get(string))) continue;
                return false;
            }
            return true;
        }
        return bundle == bundle2;
    }

    public static boolean b(Object object, Object object2) {
        if (object != object2) {
            return object != null && object.equals(object2);
        }
        return true;
    }

    public static int c(Object ... objectArray) {
        return Arrays.hashCode(objectArray);
    }

    public static a d(Object object) {
        return new a(object, null);
    }

    public static final class a {
        private final List a;
        private final Object b;

        /* synthetic */ a(Object object, a0 a02) {
            p.l(object);
            this.b = object;
            this.a = new ArrayList();
        }

        public a a(String string, Object object) {
            p.l(string);
            object = String.valueOf(object);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("=");
            stringBuilder.append((String)object);
            string = stringBuilder.toString();
            this.a.add(string);
            return this;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(100);
            stringBuilder.append(this.b.getClass().getSimpleName());
            stringBuilder.append('{');
            int n8 = this.a.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                stringBuilder.append((String)this.a.get(i8));
                if (i8 >= n8 - 1) continue;
                stringBuilder.append(", ");
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }
}

