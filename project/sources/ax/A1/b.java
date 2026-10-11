package ax.A1;

import ax.P0.C;
import ax.S0.F;
import ax.z1.c;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends c {
    private static C c(F f) {
        f.r(12);
        int d = (f.d() + f.h(12)) - 4;
        f.r(44);
        f.s(f.h(12));
        f.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (f.d() >= d) {
                break;
            }
            f.r(48);
            int h = f.h(8);
            f.r(4);
            int d2 = f.d() + f.h(12);
            String str2 = null;
            while (f.d() < d2) {
                int h2 = f.h(8);
                int h3 = f.h(8);
                int d3 = f.d() + h3;
                if (h2 == 2) {
                    int h4 = f.h(16);
                    f.r(8);
                    if (h4 == 3) {
                        while (f.d() < d3) {
                            str = f.l(f.h(8), StandardCharsets.US_ASCII);
                            int h5 = f.h(8);
                            for (int i = 0; i < h5; i++) {
                                f.s(f.h(8));
                            }
                        }
                    }
                } else if (h2 == 21) {
                    str2 = f.l(h3, StandardCharsets.US_ASCII);
                }
                f.p(d3 * 8);
            }
            f.p(d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C(arrayList);
    }

    @Override // ax.z1.c
    protected C b(ax.z1.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new F(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
