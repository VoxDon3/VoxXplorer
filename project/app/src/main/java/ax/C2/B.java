/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.B2.i;
import ax.Gb.l;

public final class B {
    private static final String a;
    private static final String[] b;

    static {
        String string = i.i("WrkDbPathHelper");
        l.e(string, "tagWithPrefix(\"WrkDbPathHelper\")");
        a = string;
        b = new String[]{"-journal", "-shm", "-wal"};
    }

    public static final /* synthetic */ String[] a() {
        return b;
    }

    public static final /* synthetic */ String b() {
        return a;
    }
}

