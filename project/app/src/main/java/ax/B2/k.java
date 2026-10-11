/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import android.os.Build;
import androidx.work.OverwritingInputMerger;
import androidx.work.c;
import ax.B2.t;
import ax.Gb.g;
import ax.Gb.l;

public final class k
extends t {
    public static final b e = new b(null);

    public k(a a8) {
        l.f(a8, "builder");
        super(a8.d(), a8.g(), a8.e());
    }

    public static final k e(Class<? extends c> clazz) {
        return e.a(clazz);
    }

    public static final class a
    extends t.a<a, k> {
        public a(Class<? extends c> clazz) {
            l.f(clazz, "workerClass");
            super(clazz);
            this.g().d = OverwritingInputMerger.class.getName();
        }

        public k i() {
            if (this.c() && Build.VERSION.SDK_INT >= 23 && this.g().j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new k(this);
        }

        public a j() {
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final k a(Class<? extends c> clazz) {
            l.f(clazz, "workerClass");
            return (k)new a(clazz).a();
        }
    }
}

