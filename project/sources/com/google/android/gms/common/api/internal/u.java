package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import ax.J5.C0744e;
import ax.K5.a;
import ax.L5.InterfaceC0798j;
import ax.j6.C2328k;
import com.google.android.gms.common.api.internal.AbstractC3610d;

/* loaded from: classes3.dex */
final class u extends AbstractC3610d {
    final /* synthetic */ AbstractC3610d.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(AbstractC3610d.a aVar, C0744e[] c0744eArr, boolean z, int i) {
        super(c0744eArr, z, i);
        this.d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3610d
    protected final void b(a.b bVar, C2328k c2328k) throws RemoteException {
        InterfaceC0798j interfaceC0798j;
        interfaceC0798j = this.d.a;
        interfaceC0798j.a(bVar, c2328k);
    }
}
