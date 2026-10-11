/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.o;

public abstract class A {
    public final int a;

    public A(int n8) {
        this.a = n8;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Object)((Object)remoteException)).getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(19, stringBuilder.toString());
    }

    public abstract void a(Status var1);

    public abstract void b(Exception var1);

    public abstract void c(o var1) throws DeadObjectException;

    public abstract void d(g var1, boolean var2);
}

