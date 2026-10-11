package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum r {
    IMAGE,
    DOCUMENT,
    PDF,
    SPREADSHEET,
    PRESENTATION,
    AUDIO,
    VIDEO,
    FOLDER,
    PAPER,
    OTHERS,
    OTHER;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r.values().length];
            a = iArr;
            try {
                iArr[r.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[r.PDF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[r.SPREADSHEET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[r.PRESENTATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[r.AUDIO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[r.VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[r.FOLDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[r.PAPER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[r.OTHERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static class b extends ax.v4.f<r> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public r a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            if (jVar.j() == ax.T4.m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new ax.T4.i(jVar, "Required field missing: .tag");
            }
            r rVar = "image".equals(q) ? r.IMAGE : "document".equals(q) ? r.DOCUMENT : "pdf".equals(q) ? r.PDF : "spreadsheet".equals(q) ? r.SPREADSHEET : "presentation".equals(q) ? r.PRESENTATION : "audio".equals(q) ? r.AUDIO : "video".equals(q) ? r.VIDEO : "folder".equals(q) ? r.FOLDER : "paper".equals(q) ? r.PAPER : "others".equals(q) ? r.OTHERS : r.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return rVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(r rVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[rVar.ordinal()]) {
                case 1:
                    gVar.s0("image");
                    break;
                case 2:
                    gVar.s0("document");
                    break;
                case 3:
                    gVar.s0("pdf");
                    break;
                case 4:
                    gVar.s0("spreadsheet");
                    break;
                case 5:
                    gVar.s0("presentation");
                    break;
                case 6:
                    gVar.s0("audio");
                    break;
                case 7:
                    gVar.s0("video");
                    break;
                case 8:
                    gVar.s0("folder");
                    break;
                case 9:
                    gVar.s0("paper");
                    break;
                case 10:
                    gVar.s0("others");
                    break;
                default:
                    gVar.s0("other");
                    break;
            }
        }
    }
}
