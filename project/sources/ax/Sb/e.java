package ax.Sb;

import ax.sb.t;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
public final class e {
    public static final <E> d<E> a(int i, a aVar, ax.Fb.l<? super E, t> lVar) {
        if (i == -2) {
            return aVar == a.SUSPEND ? new b(d.a.a(), lVar) : new k(1, aVar, lVar);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i, lVar) : new k(i, aVar, lVar) : new b(SubsamplingScaleImageView.TILE_SIZE_AUTO, lVar) : aVar == a.SUSPEND ? new b(0, lVar) : new k(1, aVar, lVar);
        }
        if (aVar == a.SUSPEND) {
            return new k(1, a.DROP_OLDEST, lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ d b(int i, a aVar, ax.Fb.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return a(i, aVar, lVar);
    }
}
