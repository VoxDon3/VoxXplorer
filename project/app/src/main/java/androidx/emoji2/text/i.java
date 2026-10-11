/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

class i {
    static Set<int[]> a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a();
        }
        return b.a();
    }

    private static class a {
        static Set<int[]> a() {
            return b.a();
        }
    }

    private static class b {
        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SuppressLint(value={"BanUncheckedReflection"})
        static Set<int[]> a() {
            try {
                Object object = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (object == null) {
                    return Collections.EMPTY_SET;
                }
                Set set = (Set)object;
                Iterator iterator = set.iterator();
                do {
                    object = set;
                    if (!iterator.hasNext()) return object;
                } while (iterator.next() instanceof int[]);
                return Collections.EMPTY_SET;
            }
            catch (Throwable throwable) {
                return Collections.EMPTY_SET;
            }
        }
    }
}

