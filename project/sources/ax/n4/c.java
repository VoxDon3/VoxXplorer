package ax.n4;

/* loaded from: classes.dex */
public class c {
    public static final c a = new c();

    protected void a(StringBuilder sb, String str, boolean z) {
        if (!z) {
            for (int i = 0; i < str.length() && !z; i++) {
                z = c(str.charAt(i));
            }
        }
        if (z) {
            sb.append('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (d(charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        if (z) {
            sb.append('\"');
        }
    }

    public StringBuilder b(StringBuilder sb, k kVar, boolean z) {
        sb.append(kVar.getName());
        String value = kVar.getValue();
        if (value != null) {
            sb.append('=');
            a(sb, value, z);
        }
        return sb;
    }

    protected boolean c(char c) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= 0;
    }

    protected boolean d(char c) {
        return "\"\\".indexOf(c) >= 0;
    }
}
