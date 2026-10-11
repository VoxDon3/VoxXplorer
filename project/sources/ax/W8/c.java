package ax.W8;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes3.dex */
class c extends f {
    protected static Set<e> c = EnumSet.of(e.NTLMSSP_NEGOTIATE_NTLM, e.NTLMSSP_NEGOTIATE_UNICODE);
    protected Set<e> a;
    protected i b;

    protected c(Set<e> set, i iVar) {
        EnumSet copyOf = EnumSet.copyOf((Collection) set);
        this.a = copyOf;
        copyOf.addAll(c);
        this.b = iVar;
    }
}
