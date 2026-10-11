package ax.D7;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class s extends t {
    private final List<C0661c<?>> q;

    public s(List<C0661c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.q = list;
    }
}
