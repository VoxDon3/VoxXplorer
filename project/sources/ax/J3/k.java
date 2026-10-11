package ax.J3;

import ax.J3.k;
import ax.i4.C2268a;

/* loaded from: classes.dex */
public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private ax.i4.c<? super TranscodeType> q = C2268a.a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    final ax.i4.c<? super TranscodeType> c() {
        return this.q;
    }
}
