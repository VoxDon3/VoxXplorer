package ax.Ob;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(Appendable appendable, T t, ax.Fb.l<? super T, ? extends CharSequence> lVar) {
        ax.Gb.l.f(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }
}
