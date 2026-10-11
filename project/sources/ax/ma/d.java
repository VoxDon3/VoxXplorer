package ax.ma;

import ax.Gb.l;
import ax.Lb.e;
import ax.Lb.f;
import ax.la.x;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d {
    private static final e a = new e(16, 2048);

    public static final int b(int i, int i2) {
        int i3 = i % i2;
        if (i3 == 0) {
            return 0;
        }
        int i4 = i2 - i3;
        return i4 >= i3 ? -i3 : i4;
    }

    public static final int c(int i, List<Integer> list) {
        l.f(list, "multiples");
        for (Number number : list) {
            if (i % number.intValue() == 0) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final int d(int i, int i2) {
        return i + b(i, i2);
    }

    public static final int e(ax.Lb.b<Integer> bVar, int i, int i2) {
        l.f(bVar, "<this>");
        int d = d(i, i2);
        return d > bVar.i().intValue() ? d - (((int) Math.ceil((d - bVar.i().intValue()) / i2)) * i2) : d < bVar.g().intValue() ? d + (((int) Math.ceil((bVar.g().intValue() - d) / i2)) * i2) : d;
    }

    public static final int f(ax.Lb.b<Integer> bVar, int i, Iterable<Integer> iterable) {
        l.f(bVar, "<this>");
        l.f(iterable, "divisors");
        Iterator<Integer> it = iterable.iterator();
        int i2 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        while (it.hasNext()) {
            int e = e(bVar, i, it.next().intValue()) - i;
            if (e == 0) {
                return i;
            }
            if (Math.abs(e) < Math.abs(i2)) {
                i2 = e;
            }
        }
        if (i2 < Integer.MAX_VALUE) {
            return i + i2;
        }
        throw new IllegalArgumentException("No divisors provided.");
    }

    public static final x g(C2546c c2546c, x xVar) {
        l.f(c2546c, "<this>");
        l.f(xVar, "resolution");
        int g = f.g(xVar.b(), c2546c);
        int g2 = f.g(xVar.a(), c2546c);
        int c = c(f(c2546c, f.d(g, g2) == g ? g : g2, c2546c.l()), c2546c.l());
        int e = e(c2546c, g, c);
        int e2 = e(c2546c, g2, c);
        return (e == xVar.b() && e2 == xVar.a()) ? xVar : new x(e, e2);
    }
}
