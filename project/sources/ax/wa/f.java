package ax.wa;

import ax.c.C1750a;
import ax.qa.EnumC2891a;
import ax.qa.InterfaceC2892b;
import ax.wa.e;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class f<T extends e> implements InterfaceC2892b {
    private T[] a;

    public static class a extends f<d> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.wa.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d[] d(int i) {
            return new d[i];
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.wa.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public d e() {
            return new d();
        }
    }

    private int g(String str, ax.pa.c cVar) throws IOException {
        long h = cVar.h();
        if (h <= 2147483647L) {
            return (int) h;
        }
        throw new C1750a(String.format("%s %d > %d", str, Long.valueOf(h), Integer.valueOf(SubsamplingScaleImageView.TILE_SIZE_AUTO)));
    }

    @Override // ax.qa.InterfaceC2892b
    public void a(ax.pa.c cVar) throws IOException {
        T[] tArr;
        if (this.a != null) {
            cVar.a(EnumC2891a.FOUR);
            cVar.b(4);
            int i = 0;
            while (true) {
                tArr = this.a;
                if (i >= tArr.length) {
                    break;
                }
                tArr[i] = e();
                this.a[i].b(cVar);
                i++;
            }
            for (T t : tArr) {
                t.c(cVar);
            }
            for (T t2 : this.a) {
                t2.a(cVar);
            }
        }
    }

    @Override // ax.qa.InterfaceC2892b
    public void c(ax.pa.c cVar) throws IOException {
        cVar.a(EnumC2891a.FOUR);
        int g = g("EntriesRead", cVar);
        if (cVar.j() == 0) {
            this.a = null;
        } else {
            if (g < 0) {
                throw new C1750a(String.format("Expected entriesRead >= 0, got: %d", Integer.valueOf(g)));
            }
            this.a = d(g);
        }
    }

    abstract T[] d(int i);

    abstract T e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return Arrays.equals(this.a, ((f) obj).a);
        }
        return false;
    }

    public T[] f() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // ax.qa.InterfaceC2892b
    public void b(ax.pa.c cVar) throws IOException {
    }
}
