/*
 * Decompiled with CFR 0.152.
 */
package ax.z9;

import com.jcraft.jsch.jzlib.Compression;
import java.util.function.Supplier;

public final class c
implements Supplier {
    public final Compression a;

    public /* synthetic */ c(Compression compression) {
        this.a = compression;
    }

    public final Object get() {
        return Compression.g(this.a);
    }
}

