/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Lb.f;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class A<T> {
    private volatile AtomicReferenceArray<T> array;

    public A(int n8) {
        this.array = new AtomicReferenceArray(n8);
    }

    public final int a() {
        return this.array.length();
    }

    public final T b(int n8) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (n8 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(n8);
        }
        return null;
    }

    public final void c(int n8, T t8) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int n9 = atomicReferenceArray.length();
        if (n8 < n9) {
            atomicReferenceArray.set(n8, t8);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<T>(f.b(n8 + 1, n9 * 2));
        for (int i8 = 0; i8 < n9; ++i8) {
            atomicReferenceArray2.set(i8, atomicReferenceArray.get(i8));
        }
        atomicReferenceArray2.set(n8, t8);
        this.array = atomicReferenceArray2;
    }
}

