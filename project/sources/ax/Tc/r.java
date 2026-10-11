package ax.Tc;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public class r extends b {
    public r() {
        this(null);
    }

    @Override // ax.Sc.k, ax.Sc.j
    public String a(BufferedReader bufferedReader) throws IOException {
        String readLine = bufferedReader.readLine();
        StringBuilder sb = new StringBuilder();
        while (readLine != null) {
            if (readLine.startsWith("Directory") || readLine.startsWith("Total")) {
                readLine = bufferedReader.readLine();
            } else {
                sb.append(readLine);
                if (readLine.trim().endsWith(")")) {
                    break;
                }
                readLine = bufferedReader.readLine();
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    @Override // ax.Sc.j
    public ax.Sc.i c(String str) {
        String nextToken;
        String str2 = null;
        if (!g(str)) {
            return null;
        }
        ax.Sc.i iVar = new ax.Sc.i();
        iVar.n(str);
        String e = e(1);
        String e2 = e(2);
        String str3 = e(3) + " " + e(4);
        String e3 = e(5);
        String[] strArr = {e(9), e(10), e(11)};
        try {
            iVar.p(super.j(str3));
        } catch (ParseException unused) {
        }
        StringTokenizer stringTokenizer = new StringTokenizer(e3, ",");
        int countTokens = stringTokenizer.countTokens();
        if (countTokens == 1) {
            nextToken = stringTokenizer.nextToken();
        } else if (countTokens != 2) {
            nextToken = null;
        } else {
            str2 = stringTokenizer.nextToken();
            nextToken = stringTokenizer.nextToken();
        }
        if (e.lastIndexOf(".DIR") != -1) {
            iVar.q(1);
        } else {
            iVar.q(0);
        }
        if (!k()) {
            e = e.substring(0, e.lastIndexOf(59));
        }
        iVar.l(e);
        iVar.o(Long.parseLong(e2) * 512);
        iVar.i(str2);
        iVar.r(nextToken);
        for (int i = 0; i < 3; i++) {
            String str4 = strArr[i];
            iVar.m(i, 0, str4.indexOf(82) >= 0);
            iVar.m(i, 1, str4.indexOf(87) >= 0);
            iVar.m(i, 2, str4.indexOf(69) >= 0);
        }
        return iVar;
    }

    @Override // ax.Tc.b
    protected ax.Sc.f i() {
        return new ax.Sc.f("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }

    protected boolean k() {
        throw null;
    }

    public r(ax.Sc.f fVar) {
        super("(.*?;[0-9]+)\\s*(\\d+)(?:/\\d+)?\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)");
        f(fVar);
    }
}
