package com.box.androidsdk.content.models;

import com.box.androidsdk.content.models.BoxJsonObject;
import java.util.HashMap;

/* loaded from: classes.dex */
public class BoxEntity extends BoxJsonObject {
    private static HashMap<String, n> q = new HashMap<>();
    private static final long serialVersionUID = 1626798809346520004L;

    class a implements n {
        a() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxUser();
        }
    }

    class b implements n {
        b() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxGroup();
        }
    }

    class c implements n {
        c() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxRealTimeServer();
        }
    }

    class d implements BoxJsonObject.b<BoxEntity> {
        d() {
        }

        @Override // com.box.androidsdk.content.models.BoxJsonObject.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BoxEntity a(ax.O4.d dVar) {
            return BoxEntity.D(dVar);
        }
    }

    class e implements n {
        e() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxCollection();
        }
    }

    class f implements n {
        f() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxComment();
        }
    }

    class g implements n {
        g() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxCollaboration();
        }
    }

    class h implements n {
        h() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxEnterprise();
        }
    }

    class i implements n {
        i() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxFileVersion();
        }
    }

    class j implements n {
        j() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxEvent();
        }
    }

    class k implements n {
        k() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxFile();
        }
    }

    class l implements n {
        l() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxFolder();
        }
    }

    class m implements n {
        m() {
        }

        @Override // com.box.androidsdk.content.models.BoxEntity.n
        public BoxEntity a() {
            return new BoxBookmark();
        }
    }

    public interface n {
        BoxEntity a();
    }

    static {
        C("collection", new e());
        C("comment", new f());
        C("collaboration", new g());
        C("enterprise", new h());
        C("file_version", new i());
        C("event", new j());
        C("file", new k());
        C("folder", new l());
        C("web_link", new m());
        C("user", new a());
        C("group", new b());
        C("realtime_server", new c());
    }

    public BoxEntity() {
    }

    public static void C(String str, n nVar) {
        q.put(str, nVar);
    }

    public static BoxEntity D(ax.O4.d dVar) {
        ax.O4.g D = dVar.D("type");
        if (!D.r()) {
            return null;
        }
        n nVar = q.get(D.k());
        BoxEntity boxEntity = nVar == null ? new BoxEntity() : nVar.a();
        boxEntity.i(dVar);
        return boxEntity;
    }

    public static BoxJsonObject.b<BoxEntity> E() {
        return new d();
    }

    public String G() {
        String u = u("id");
        return u == null ? u("item_id") : u;
    }

    public BoxEntity(ax.O4.d dVar) {
        super(dVar);
    }
}
