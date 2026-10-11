package ax.Tc;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class c implements d {
    private static final Pattern a = Pattern.compile("(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*");

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ax.Sc.j c(java.lang.String r5, ax.Sc.f r6) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Tc.c.c(java.lang.String, ax.Sc.f):ax.Sc.j");
    }

    private ax.Sc.j d(ax.Sc.f fVar) {
        if (fVar != null && "WINDOWS".equals(fVar.e())) {
            return new j(fVar);
        }
        ax.Sc.f fVar2 = fVar != null ? new ax.Sc.f(fVar) : null;
        return new a(new ax.Sc.j[]{new j(fVar), new q(fVar2, fVar2 != null && "UNIX_LTRIM".equals(fVar2.e()))});
    }

    private ax.Sc.j e(ax.Sc.f fVar) {
        if (fVar != null && "OS/400".equals(fVar.e())) {
            return new m(fVar);
        }
        ax.Sc.f fVar2 = fVar != null ? new ax.Sc.f(fVar) : null;
        return new a(new ax.Sc.j[]{new m(fVar), new q(fVar2, fVar2 != null && "UNIX_LTRIM".equals(fVar2.e()))});
    }

    @Override // ax.Tc.d
    public ax.Sc.j a(String str) {
        if (str != null) {
            return c(str, null);
        }
        throw new n("Parser key cannot be null");
    }

    @Override // ax.Tc.d
    public ax.Sc.j b(ax.Sc.f fVar) throws n {
        return c(fVar.e(), fVar);
    }
}
