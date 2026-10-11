package ax.v2;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class x {

    @SuppressLint({"UnknownNullness"})
    public View b;
    public final Map<String, Object> a = new HashMap();
    final ArrayList<AbstractC3268k> c = new ArrayList<>();

    @Deprecated
    public x() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.b == xVar.b && this.a.equals(xVar.a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }

    public x(View view) {
        this.b = view;
    }
}
