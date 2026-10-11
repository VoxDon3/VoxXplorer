/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

public final class h {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable object) {
        if (charSequence != null) {
            StringBuilder stringBuilder = new StringBuilder();
            if ((object = object.iterator()).hasNext()) {
                while (true) {
                    stringBuilder.append((CharSequence)object.next());
                    if (!object.hasNext()) break;
                    stringBuilder.append(charSequence);
                }
            }
            return stringBuilder.toString();
        }
        throw new NullPointerException("delimiter");
    }
}

