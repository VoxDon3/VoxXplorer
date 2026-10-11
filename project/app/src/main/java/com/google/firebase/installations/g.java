/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.a;

@AutoValue
public abstract class g {
    public static a a() {
        return new a.b();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();

    @AutoValue.Builder
    public static abstract class a {
        public abstract g a();

        public abstract a b(String var1);

        public abstract a c(long var1);

        public abstract a d(long var1);
    }
}

