/*
 * Decompiled with CFR 0.152.
 */
package ax.H8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b {
    private final List<String> a;

    public b(String string) {
        this.a = b.g(string);
    }

    public b(List<String> list) {
        this.a = list;
    }

    private b f(String object, List<String> list) {
        object = b.g((String)object);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(list);
        for (int i8 = object.size(); i8 < this.a.size(); ++i8) {
            arrayList.add(this.a.get(i8));
        }
        return new b(arrayList);
    }

    private static List<String> g(String string) {
        String string2 = string;
        if (string.charAt(0) == '\\') {
            string2 = string.charAt(1) == '\\' ? string.substring(2) : string.substring(1);
        }
        return Arrays.asList(string2.split("\\\\"));
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
        if (this.a.size() > 1) {
            String string = this.a.get(1);
            return "SYSVOL".equals(string) || "NETLOGON".equals(string);
            {
            }
        }
        return false;
    }

    public b e(String string, b b8) {
        return this.f(string, b8.a());
    }

    public String h() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : this.a) {
            stringBuilder.append("\\");
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DFSPath{");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

