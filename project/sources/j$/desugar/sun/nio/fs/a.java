package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class a {
    public HashSet a;
    public HashMap b;
    public boolean c;

    public final boolean b(String str) {
        return this.c || this.a.contains(str);
    }

    public final void a(Object obj, String str) {
        this.b.put(str, obj);
    }
}
