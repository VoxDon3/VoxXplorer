package ax.q7;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class r {
    private final AbstractC2877d a;
    private final boolean b;
    private final c c;
    private final int d;

    class a implements c {
        final /* synthetic */ AbstractC2877d a;

        /* renamed from: ax.q7.r$a$a, reason: collision with other inner class name */
        class C0431a extends b {
            C0431a(r rVar, CharSequence charSequence) {
                super(rVar, charSequence);
            }

            @Override // ax.q7.r.b
            int g(int i) {
                return i + 1;
            }

            @Override // ax.q7.r.b
            int h(int i) {
                return a.this.a.c(this.d0, i);
            }
        }

        a(AbstractC2877d abstractC2877d) {
            this.a = abstractC2877d;
        }

        @Override // ax.q7.r.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(r rVar, CharSequence charSequence) {
            return new C0431a(rVar, charSequence);
        }
    }

    private static abstract class b extends AbstractC2875b<String> {
        final CharSequence d0;
        final AbstractC2877d e0;
        final boolean f0;
        int g0 = 0;
        int h0;

        protected b(r rVar, CharSequence charSequence) {
            this.e0 = rVar.a;
            this.f0 = rVar.b;
            this.h0 = rVar.d;
            this.d0 = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.q7.AbstractC2875b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String b() {
            int h;
            int i = this.g0;
            while (true) {
                int i2 = this.g0;
                if (i2 == -1) {
                    return c();
                }
                h = h(i2);
                if (h == -1) {
                    h = this.d0.length();
                    this.g0 = -1;
                } else {
                    this.g0 = g(h);
                }
                int i3 = this.g0;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.g0 = i4;
                    if (i4 > this.d0.length()) {
                        this.g0 = -1;
                    }
                } else {
                    while (i < h && this.e0.e(this.d0.charAt(i))) {
                        i++;
                    }
                    while (h > i && this.e0.e(this.d0.charAt(h - 1))) {
                        h--;
                    }
                    if (!this.f0 || i != h) {
                        break;
                    }
                    i = this.g0;
                }
            }
            int i5 = this.h0;
            if (i5 == 1) {
                h = this.d0.length();
                this.g0 = -1;
                while (h > i && this.e0.e(this.d0.charAt(h - 1))) {
                    h--;
                }
            } else {
                this.h0 = i5 - 1;
            }
            return this.d0.subSequence(i, h).toString();
        }

        abstract int g(int i);

        abstract int h(int i);
    }

    private interface c {
        Iterator<String> a(r rVar, CharSequence charSequence);
    }

    private r(c cVar) {
        this(cVar, false, AbstractC2877d.f(), SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    public static r d(char c2) {
        return e(AbstractC2877d.d(c2));
    }

    public static r e(AbstractC2877d abstractC2877d) {
        n.n(abstractC2877d);
        return new r(new a(abstractC2877d));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        n.n(charSequence);
        Iterator<String> g = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private r(c cVar, boolean z, AbstractC2877d abstractC2877d, int i) {
        this.c = cVar;
        this.b = z;
        this.a = abstractC2877d;
        this.d = i;
    }
}
