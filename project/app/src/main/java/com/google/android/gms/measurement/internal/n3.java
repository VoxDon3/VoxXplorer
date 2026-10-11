/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.k3;
import java.util.function.Function;

public final class n3
implements Function {
    public /* synthetic */ Function andThen(Function function) {
        return j.Function._CC.$default$andThen((Function)this, (Function)function);
    }

    public final Object apply(Object object) {
        return k3.E((h5)object);
    }

    public /* synthetic */ Function compose(Function function) {
        return j.Function._CC.$default$compose((Function)this, (Function)function);
    }
}

