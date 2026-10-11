/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import ax.O4.d;
import ax.O4.g;
import com.box.androidsdk.content.models.BoxBookmark;
import com.box.androidsdk.content.models.BoxCollaboration;
import com.box.androidsdk.content.models.BoxCollection;
import com.box.androidsdk.content.models.BoxComment;
import com.box.androidsdk.content.models.BoxEnterprise;
import com.box.androidsdk.content.models.BoxEvent;
import com.box.androidsdk.content.models.BoxFile;
import com.box.androidsdk.content.models.BoxFileVersion;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxGroup;
import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.models.BoxRealTimeServer;
import com.box.androidsdk.content.models.BoxUser;
import java.util.HashMap;

public class BoxEntity
extends BoxJsonObject {
    private static HashMap<String, n> q = new HashMap();
    private static final long serialVersionUID = 1626798809346520004L;

    static {
        BoxEntity.C("collection", new n(){

            @Override
            public BoxEntity a() {
                return new BoxCollection();
            }
        });
        BoxEntity.C("comment", new n(){

            @Override
            public BoxEntity a() {
                return new BoxComment();
            }
        });
        BoxEntity.C("collaboration", new n(){

            @Override
            public BoxEntity a() {
                return new BoxCollaboration();
            }
        });
        BoxEntity.C("enterprise", new n(){

            @Override
            public BoxEntity a() {
                return new BoxEnterprise();
            }
        });
        BoxEntity.C("file_version", new n(){

            @Override
            public BoxEntity a() {
                return new BoxFileVersion();
            }
        });
        BoxEntity.C("event", new n(){

            @Override
            public BoxEntity a() {
                return new BoxEvent();
            }
        });
        BoxEntity.C("file", new n(){

            @Override
            public BoxEntity a() {
                return new BoxFile();
            }
        });
        BoxEntity.C("folder", new n(){

            @Override
            public BoxEntity a() {
                return new BoxFolder();
            }
        });
        BoxEntity.C("web_link", new n(){

            @Override
            public BoxEntity a() {
                return new BoxBookmark();
            }
        });
        BoxEntity.C("user", new n(){

            @Override
            public BoxEntity a() {
                return new BoxUser();
            }
        });
        BoxEntity.C("group", new n(){

            @Override
            public BoxEntity a() {
                return new BoxGroup();
            }
        });
        BoxEntity.C("realtime_server", new n(){

            @Override
            public BoxEntity a() {
                return new BoxRealTimeServer();
            }
        });
    }

    public BoxEntity() {
    }

    public BoxEntity(d d8) {
        super(d8);
    }

    public static void C(String string, n n8) {
        q.put(string, n8);
    }

    public static BoxEntity D(d d8) {
        Object object = d8.D("type");
        if (!((g)object).r()) {
            return null;
        }
        object = ((g)object).k();
        object = (object = q.get(object)) == null ? new BoxEntity() : object.a();
        ((BoxJsonObject)object).i(d8);
        return object;
    }

    public static BoxJsonObject.b<BoxEntity> E() {
        return new BoxJsonObject.b<BoxEntity>(){

            public BoxEntity b(d d8) {
                return BoxEntity.D(d8);
            }
        };
    }

    public String G() {
        String string;
        String string2 = string = this.u("id");
        if (string == null) {
            string2 = this.u("item_id");
        }
        return string2;
    }

    public static interface n {
        public BoxEntity a();
    }
}

