package ax.ke;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
final class H implements G {
    private static final G a = new H();

    H() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (I.l(annotationArr, G.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return G.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof G;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + G.class.getName() + "()";
    }
}
