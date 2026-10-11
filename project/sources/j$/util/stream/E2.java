package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class E2 extends AbstractC3935w2 {
    public ArrayList d;

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public final void l() {
        List.EL.sort(this.d, this.b);
        long size = this.d.size();
        InterfaceC3866i2 interfaceC3866i2 = this.a;
        interfaceC3866i2.m(size);
        if (!this.c) {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(interfaceC3866i2);
            Collection.EL.a(arrayList, new j$.desugar.sun.nio.fs.g(11, interfaceC3866i2));
        } else {
            ArrayList arrayList2 = this.d;
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (interfaceC3866i2.q()) {
                    break;
                } else {
                    interfaceC3866i2.s((InterfaceC3866i2) obj);
                }
            }
        }
        interfaceC3866i2.l();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        this.d.add(obj);
    }
}
