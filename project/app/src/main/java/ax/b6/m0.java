/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.n0;
import ax.b6.o0;
import ax.b6.p0;
import java.io.File;

final class m0
implements n0 {
    m0() {
    }

    @Override
    public final String a(String string, o0 o02, p0 p02) {
        return string;
    }

    @Override
    public final /* synthetic */ String b(File file, String string) {
        return this.c(file, string, o0.a);
    }

    @Override
    public final /* synthetic */ String c(File file, String string, o0 o02) {
        return this.d(new File(file, string).getPath(), o02);
    }

    @Override
    public final /* synthetic */ String d(String string, o0 o02) {
        return this.a(string, o02, p0.d0);
    }

    @Override
    public final /* synthetic */ String h(String string) {
        return this.d(string, o0.a);
    }
}

