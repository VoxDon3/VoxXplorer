/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import ax.x5.a;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class e {
    static final e a = e.a().f(0xA00000L).d(200).b(10000).c(604800000L).e(81920).a();

    e() {
    }

    static a a() {
        return new a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();

    @AutoValue.Builder
    static abstract class a {
        a() {
        }

        abstract e a();

        abstract a b(int var1);

        abstract a c(long var1);

        abstract a d(int var1);

        abstract a e(int var1);

        abstract a f(long var1);
    }
}

