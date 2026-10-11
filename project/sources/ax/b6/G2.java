package ax.b6;

import android.content.Context;
import ax.q7.AbstractC2884k;

/* loaded from: classes3.dex */
final class G2 extends AbstractC1562g3 {
    private final Context a;
    private final ax.q7.u<AbstractC2884k<S2>> b;

    G2(Context context, ax.q7.u<AbstractC2884k<S2>> uVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.a = context;
        this.b = uVar;
    }

    @Override // ax.b6.AbstractC1562g3
    final Context a() {
        return this.a;
    }

    @Override // ax.b6.AbstractC1562g3
    final ax.q7.u<AbstractC2884k<S2>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ax.q7.u<AbstractC2884k<S2>> uVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1562g3) {
            AbstractC1562g3 abstractC1562g3 = (AbstractC1562g3) obj;
            if (this.a.equals(abstractC1562g3.a()) && ((uVar = this.b) != null ? uVar.equals(abstractC1562g3.b()) : abstractC1562g3.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ax.q7.u<AbstractC2884k<S2>> uVar = this.b;
        return hashCode ^ (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.a) + ", hermeticFileOverrides=" + String.valueOf(this.b) + "}";
    }
}
