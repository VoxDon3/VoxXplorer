package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.G4.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0700d0 {
    FILENAME,
    FILE_CONTENT,
    FILENAME_AND_CONTENT,
    IMAGE_CONTENT,
    OTHER;

    /* renamed from: ax.G4.d0$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0700d0.values().length];
            a = iArr;
            try {
                iArr[EnumC0700d0.FILENAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0700d0.FILE_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0700d0.FILENAME_AND_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC0700d0.IMAGE_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ax.G4.d0$b */
    static class b extends ax.v4.f<EnumC0700d0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public EnumC0700d0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
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
            EnumC0700d0 enumC0700d0 = "filename".equals(q) ? EnumC0700d0.FILENAME : "file_content".equals(q) ? EnumC0700d0.FILE_CONTENT : "filename_and_content".equals(q) ? EnumC0700d0.FILENAME_AND_CONTENT : "image_content".equals(q) ? EnumC0700d0.IMAGE_CONTENT : EnumC0700d0.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return enumC0700d0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(EnumC0700d0 enumC0700d0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[enumC0700d0.ordinal()];
            if (i == 1) {
                gVar.s0("filename");
                return;
            }
            if (i == 2) {
                gVar.s0("file_content");
                return;
            }
            if (i == 3) {
                gVar.s0("filename_and_content");
            } else if (i != 4) {
                gVar.s0("other");
            } else {
                gVar.s0("image_content");
            }
        }
    }
}
