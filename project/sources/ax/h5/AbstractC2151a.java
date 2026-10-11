package ax.h5;

import android.util.Log;
import java.io.IOException;

/* renamed from: ax.h5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2151a implements InterfaceC2155e {
    private static final String q = "a";

    private InterfaceC2155e a(String str) throws IOException {
        for (InterfaceC2155e interfaceC2155e : B0()) {
            if (interfaceC2155e.getName().equalsIgnoreCase(str)) {
                return interfaceC2155e;
            }
        }
        return null;
    }

    @Override // ax.h5.InterfaceC2155e
    public InterfaceC2155e H0(String str) throws IOException {
        String str2 = q;
        Log.d(str2, "search file: " + str);
        if (q0() && str.equals("/")) {
            return this;
        }
        if (q0() && str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int indexOf = str.indexOf("/");
        if (indexOf < 0) {
            Log.d(str2, "search entry: " + str);
            return a(str);
        }
        String substring = str.substring(indexOf + 1);
        String substring2 = str.substring(0, indexOf);
        Log.d(str2, "search recursively " + substring + " in " + substring2);
        InterfaceC2155e a = a(substring2);
        if (a == null || !a.isDirectory()) {
            Log.d(str2, "not found " + str);
            return null;
        }
        Log.d(str2, "found directory " + substring2);
        return a.H0(substring);
    }

    @Override // ax.h5.InterfaceC2155e
    public String K() {
        if (getParent().q0()) {
            return "/" + getName();
        }
        return getParent().K() + "/" + getName();
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC2155e) && K().equals(((InterfaceC2155e) obj).K());
    }

    public int hashCode() {
        return K().hashCode();
    }

    public String toString() {
        return getName();
    }
}
