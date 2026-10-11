/*
 * Decompiled with CFR 0.152.
 */
package ax.y9;

import com.jcraft.jsch.OpenSSHConfig;
import java.util.function.Function;

public final class d
implements Function {
    public /* synthetic */ Function andThen(Function function) {
        return j.Function._CC.$default$andThen((Function)this, (Function)function);
    }

    public final Object apply(Object object) {
        return OpenSSHConfig.b((String)object);
    }

    public /* synthetic */ Function compose(Function function) {
        return j.Function._CC.$default$compose((Function)this, (Function)function);
    }
}

