package ax.H8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class b {
    private final List<String> a;

    public b(String str) {
        this.a = g(str);
    }

    private b f(String str, List<String> list) {
        List<String> g = g(str);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        for (int size = g.size(); size < this.a.size(); size++) {
            arrayList.add(this.a.get(size));
        }
        return new b(arrayList);
    }

    private static List<String> g(String str) {
        if (str.charAt(0) == '\\') {
            str = str.charAt(1) == '\\' ? str.substring(2) : str.substring(1);
        }
        return Arrays.asList(str.split("\\\\"));
    }

    public List<String> a() {
        return this.a;
    }

    public boolean b() {
        return this.a.size() == 1;
    }

    public boolean c() {
        if (this.a.size() > 1) {
            return "IPC$".equals(this.a.get(1));
        }
        return false;
    }

    public boolean d() {
        if (this.a.size() <= 1) {
            return false;
        }
        String str = this.a.get(1);
        return "SYSVOL".equals(str) || "NETLOGON".equals(str);
    }

    public b e(String str, b bVar) {
        return f(str, bVar.a());
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.a) {
            sb.append("\\");
            sb.append(str);
        }
        return sb.toString();
    }

    public String toString() {
        return "DFSPath{" + this.a + "}";
    }

    public b(List<String> list) {
        this.a = list;
    }
}
