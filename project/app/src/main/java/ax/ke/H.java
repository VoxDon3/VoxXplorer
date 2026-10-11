/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.G;
import ax.ke.I;
import java.lang.annotation.Annotation;

final class H
implements G {
    private static final G a = new H();

    H() {
    }

    static Annotation[] a(Annotation[] annotationArray) {
        if (I.l(annotationArray, G.class)) {
            return annotationArray;
        }
        Annotation[] annotationArray2 = new Annotation[annotationArray.length + 1];
        annotationArray2[0] = a;
        System.arraycopy(annotationArray, 0, annotationArray2, 1, annotationArray.length);
        return annotationArray2;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return G.class;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof G;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        stringBuilder.append(G.class.getName());
        stringBuilder.append("()");
        return stringBuilder.toString();
    }
}

