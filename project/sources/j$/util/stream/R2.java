package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class R2 extends AbstractC3833c implements Iterable, j$.lang.a {
    public Object e;
    public Object[] f;

    public abstract Object[] E();

    public abstract Object c(int i);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public abstract void w(Object obj, int i, int i2, Object obj2);

    public abstract int x(Object obj);

    public R2(int i) {
        super(i);
        this.e = c(1 << this.a);
    }

    public R2() {
        this.e = c(16);
    }

    public final void B(long j) {
        long x;
        int i = this.c;
        if (i == 0) {
            x = x(this.e);
        } else {
            x = x(this.f[i]) + this.d[i];
        }
        if (j > x) {
            if (this.f == null) {
                Object[] E = E();
                this.f = E;
                this.d = new long[8];
                E[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > x) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int i3 = this.a;
                if (i2 != 0 && i2 != 1) {
                    i3 = Math.min((i3 + i2) - 1, 30);
                }
                int i4 = 1 << i3;
                this.f[i2] = c(i4);
                long[] jArr = this.d;
                jArr[i2] = jArr[i2 - 1] + x(this.f[r6]);
                x += i4;
                i2++;
            }
        }
    }

    public final int z(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.c; i++) {
            if (j < this.d[i] + x(this.f[i])) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public void v(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count > x(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, x(obj2));
            i += x(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    public Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c = c((int) count);
        v(0, c);
        return c;
    }

    public final void F() {
        long x;
        if (this.b == x(this.e)) {
            if (this.f == null) {
                Object[] E = E();
                this.f = E;
                this.d = new long[8];
                E[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    x = x(this.e);
                } else {
                    x = x(objArr[i]) + this.d[i];
                }
                B(x + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    @Override // j$.util.stream.AbstractC3833c
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void e(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            w(obj2, 0, x(obj2), obj);
        }
        w(this.e, 0, this.b, obj);
    }
}
