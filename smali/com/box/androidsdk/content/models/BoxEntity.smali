.class public Lcom/box/androidsdk/content/models/BoxEntity;
.super Lcom/box/androidsdk/content/models/BoxJsonObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/models/BoxEntity$n;
    }
.end annotation


# static fields
.field private static q:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/box/androidsdk/content/models/BoxEntity$n;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x16938ce5e020b3c4L


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/box/androidsdk/content/models/BoxEntity;->q:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$e;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$e;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "collection"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$f;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$f;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "comment"

    .line 24
    .line 25
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$g;

    .line 29
    .line 30
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$g;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "collaboration"

    .line 34
    .line 35
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$h;

    .line 39
    .line 40
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$h;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v1, "enterprise"

    .line 44
    .line 45
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$i;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$i;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v1, "file_version"

    .line 54
    .line 55
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$j;

    .line 59
    .line 60
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$j;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v1, "event"

    .line 64
    .line 65
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$k;

    .line 69
    .line 70
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$k;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v1, "file"

    .line 74
    .line 75
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$l;

    .line 79
    .line 80
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$l;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "folder"

    .line 84
    .line 85
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$m;

    .line 89
    .line 90
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$m;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v1, "web_link"

    .line 94
    .line 95
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$a;

    .line 99
    .line 100
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$a;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v1, "user"

    .line 104
    .line 105
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$b;

    .line 109
    .line 110
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$b;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v1, "group"

    .line 114
    .line 115
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$c;

    .line 119
    .line 120
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$c;-><init>()V

    .line 121
    .line 122
    .line 123
    const-string v1, "realtime_server"

    .line 124
    .line 125
    invoke-static {v1, v0}, Lcom/box/androidsdk/content/models/BoxEntity;->C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V

    .line 126
    .line 127
    .line 128
    return-void
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxJsonObject;-><init>()V

    return-void
.end method

.method public constructor <init>(Lax/O4/d;)V
    .registers 2

    .line 2
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject;-><init>(Lax/O4/d;)V

    return-void
.end method

.method public static C(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxEntity$n;)V
    .registers 3

    .line 1
    sget-object v0, Lcom/box/androidsdk/content/models/BoxEntity;->q:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static D(Lax/O4/d;)Lcom/box/androidsdk/content/models/BoxEntity;
    .registers 3

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/O4/d;->D(Ljava/lang/String;)Lax/O4/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/O4/g;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_e

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_e
    invoke-virtual {v0}, Lax/O4/g;->k()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lcom/box/androidsdk/content/models/BoxEntity;->q:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/box/androidsdk/content/models/BoxEntity$n;

    .line 26
    .line 27
    if-nez v0, :cond_22

    .line 28
    .line 29
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity;-><init>()V

    .line 32
    .line 33
    .line 34
    goto :goto_26

    .line 35
    :cond_22
    invoke-interface {v0}, Lcom/box/androidsdk/content/models/BoxEntity$n;->a()Lcom/box/androidsdk/content/models/BoxEntity;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_26
    invoke-virtual {v0, p0}, Lcom/box/androidsdk/content/models/BoxJsonObject;->i(Lax/O4/d;)V

    .line 40
    .line 41
    .line 42
    return-object v0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public static E()Lcom/box/androidsdk/content/models/BoxJsonObject$b;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/box/androidsdk/content/models/BoxJsonObject$b<",
            "Lcom/box/androidsdk/content/models/BoxEntity;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/models/BoxEntity$d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxEntity$d;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public G()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    const-string v0, "item_id"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_e
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
