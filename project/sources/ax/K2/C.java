package ax.K2;

import android.net.Uri;
import android.os.Build;
import ax.B2.b;
import ax.sb.C3080l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class C {
    public static final C a = new C();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ax.B2.r.values().length];
            try {
                iArr[ax.B2.r.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ax.B2.r.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ax.B2.r.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ax.B2.r.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ax.B2.r.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ax.B2.r.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
            int[] iArr2 = new int[ax.B2.a.values().length];
            try {
                iArr2[ax.B2.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ax.B2.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[ax.B2.j.values().length];
            try {
                iArr3[ax.B2.j.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ax.B2.j.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ax.B2.j.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ax.B2.j.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ax.B2.j.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            c = iArr3;
            int[] iArr4 = new int[ax.B2.m.values().length];
            try {
                iArr4[ax.B2.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ax.B2.m.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            d = iArr4;
        }
    }

    private C() {
    }

    public static final int a(ax.B2.a aVar) {
        ax.Gb.l.f(aVar, "backoffPolicy");
        int i = a.b[aVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new C3080l();
    }

    public static final Set<b.C0054b> b(byte[] bArr) {
        ObjectInputStream objectInputStream;
        ax.Gb.l.f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i = 0; i < readInt; i++) {
                    Uri parse = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    ax.Gb.l.e(parse, "uri");
                    linkedHashSet.add(new b.C0054b(parse, readBoolean));
                }
                ax.sb.t tVar = ax.sb.t.a;
                ax.Db.a.a(objectInputStream, null);
                ax.sb.t tVar2 = ax.sb.t.a;
                ax.Db.a.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final ax.B2.a c(int i) {
        if (i == 0) {
            return ax.B2.a.EXPONENTIAL;
        }
        if (i == 1) {
            return ax.B2.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    public static final ax.B2.j d(int i) {
        if (i == 0) {
            return ax.B2.j.NOT_REQUIRED;
        }
        if (i == 1) {
            return ax.B2.j.CONNECTED;
        }
        if (i == 2) {
            return ax.B2.j.UNMETERED;
        }
        if (i == 3) {
            return ax.B2.j.NOT_ROAMING;
        }
        if (i == 4) {
            return ax.B2.j.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return ax.B2.j.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    public static final ax.B2.m e(int i) {
        if (i == 0) {
            return ax.B2.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return ax.B2.m.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    public static final ax.B2.r f(int i) {
        if (i == 0) {
            return ax.B2.r.ENQUEUED;
        }
        if (i == 1) {
            return ax.B2.r.RUNNING;
        }
        if (i == 2) {
            return ax.B2.r.SUCCEEDED;
        }
        if (i == 3) {
            return ax.B2.r.FAILED;
        }
        if (i == 4) {
            return ax.B2.r.BLOCKED;
        }
        if (i == 5) {
            return ax.B2.r.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    public static final int g(ax.B2.j jVar) {
        ax.Gb.l.f(jVar, "networkType");
        int i = a.c[jVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && jVar == ax.B2.j.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + jVar + " to int");
    }

    public static final int h(ax.B2.m mVar) {
        ax.Gb.l.f(mVar, "policy");
        int i = a.d[mVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new C3080l();
    }

    public static final byte[] i(Set<b.C0054b> set) {
        ax.Gb.l.f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                for (b.C0054b c0054b : set) {
                    objectOutputStream.writeUTF(c0054b.a().toString());
                    objectOutputStream.writeBoolean(c0054b.b());
                }
                ax.sb.t tVar = ax.sb.t.a;
                ax.Db.a.a(objectOutputStream, null);
                ax.Db.a.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ax.Gb.l.e(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int j(ax.B2.r rVar) {
        ax.Gb.l.f(rVar, "state");
        switch (a.a[rVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new C3080l();
        }
    }
}
