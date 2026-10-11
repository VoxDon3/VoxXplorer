package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3951z3 extends X2 {
    @Override // j$.util.stream.X2
    public final X2 e(Spliterator spliterator) {
        return new C3951z3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.X2
    public final void d() {
        S2 s2 = new S2();
        this.h = s2;
        Objects.requireNonNull(s2);
        this.e = this.b.R(new C3946y3(s2, 0));
        this.f = new j$.desugar.sun.nio.fs.g(17, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a = a();
        if (!a) {
            return a;
        }
        S2 s2 = (S2) this.h;
        long j = this.g;
        if (s2.c != 0) {
            if (j >= s2.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= s2.c; i++) {
                long j2 = s2.d[i];
                Object[] objArr = s2.f[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < s2.b) {
            obj = s2.e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.s(obj);
        return a;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            C3946y3 c3946y3 = new C3946y3(consumer, 1);
            this.b.Q(this.d, c3946y3);
            this.i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
