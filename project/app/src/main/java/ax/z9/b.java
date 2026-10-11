/*
 * Decompiled with CFR 0.152.
 */
package ax.z9;

import com.jcraft.jsch.jzlib.Compression;
import java.util.function.Supplier;

public final class b
implements Supplier {
    public final int a;

    public /* synthetic */ b(int n8) {
        this.a = n8;
    }

    public final Object get() {
        return Compression.f(this.a);
    }
}

