.class public Lcom/voxdon/xplorer/file/r;
.super Lcom/voxdon/xplorer/file/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/r$c;,
        Lcom/voxdon/xplorer/file/r$e;,
        Lcom/voxdon/xplorer/file/r$d;,
        Lcom/voxdon/xplorer/file/r$f;
    }
.end annotation


# static fields
.field private static final n:Ljava/util/logging/Logger;

.field private static o:Lcom/voxdon/xplorer/file/r$c;


# instance fields
.field private h:Lax/o7/a;

.field private i:Ljava/lang/String;

.field private j:Z

.field private k:Lj$/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj$/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lj$/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj$/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/voxdon/xplorer/file/r$e;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.GoogleDriveFileHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/r;->n:Ljava/util/logging/Logger;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/m;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/file/r;->l:Lj$/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public static A0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/r$c;
    .registers 2

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/r;->o:Lcom/voxdon/xplorer/file/r$c;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    new-instance v0, Lcom/voxdon/xplorer/file/r$c;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/file/r$c;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/voxdon/xplorer/file/r;->o:Lcom/voxdon/xplorer/file/r$c;

    .line 15
    .line 16
    :cond_f
    sget-object p0, Lcom/voxdon/xplorer/file/r;->o:Lcom/voxdon/xplorer/file/r$c;

    .line 17
    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private B0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lax/c3/E;

    .line 3
    .line 4
    invoke-virtual {v0}, Lax/c3/E;->h0()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_1f

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/r;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lax/c3/E;

    .line 19
    .line 20
    invoke-virtual {p1}, Lax/c3/E;->n()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1b

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return-object p1

    .line 28
    :cond_1b
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1f
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/r;->r0(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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

.method private C0(Lax/p7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lax/c3/E;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/p7/c;->w()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_97

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/p7/c;->w()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_97

    .line 16
    .line 17
    invoke-virtual {p1}, Lax/p7/c;->w()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->E0(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_29

    .line 33
    .line 34
    new-instance p1, Lax/c3/E;

    .line 35
    .line 36
    const-string p2, "/"

    .line 37
    .line 38
    invoke-direct {p1, p0, p2}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_29
    if-eqz p4, :cond_34

    .line 43
    .line 44
    invoke-virtual {p4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_34

    .line 49
    .line 50
    move-object p1, p2

    .line 51
    move-object v0, p3

    .line 52
    goto :goto_3c

    .line 53
    :cond_34
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->l:Lj$/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    :goto_3c
    if-eqz v0, :cond_4f

    .line 62
    .line 63
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4f

    .line 70
    .line 71
    iget-object p1, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lax/c3/E;

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_4f
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 81
    .line 82
    invoke-virtual {v0}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, p1}, Lax/o7/a$c;->d(Ljava/lang/String;)Lax/o7/a$c$c;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const-string v0, "kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lax/o7/a$c$c;->H(Ljava/lang/String;)Lax/o7/a$c$c;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    move-object v4, p1

    .line 101
    check-cast v4, Lax/p7/c;

    .line 102
    .line 103
    invoke-direct {p0, v4, p2, p3, p4}, Lcom/voxdon/xplorer/file/r;->C0(Lax/p7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lax/c3/E;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {v4}, Lcom/voxdon/xplorer/file/r;->J0(Lax/p7/c;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-static {p2, p3}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    new-instance v0, Lax/c3/E;

    .line 120
    .line 121
    invoke-virtual {p1}, Lax/c3/E;->t()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    move-object v1, p0

    .line 130
    invoke-direct/range {v0 .. v5}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, v1, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 134
    .line 135
    invoke-virtual {p1, v5, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    iget-object p1, v1, Lcom/voxdon/xplorer/file/r;->l:Lj$/util/concurrent/ConcurrentHashMap;

    .line 139
    .line 140
    invoke-virtual {v0}, Lax/c3/E;->t()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    invoke-virtual {p1, p2, p3}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_97
    move-object v1, p0

    .line 153
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/r;->t0()Lax/c3/E;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    return-object p1
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private D0(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/voxdon/xplorer/file/r$d;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_5
    if-eqz p2, :cond_75

    .line 7
    .line 8
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_12

    .line 14
    .line 15
    invoke-virtual {p3, v1, p4}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    goto :goto_75

    .line 19
    :cond_12
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x0

    .line 24
    :cond_17
    const-string v3, "/"

    .line 25
    .line 26
    if-ge v2, v0, :cond_3e

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    check-cast v4, Lcom/voxdon/xplorer/file/r$d;

    .line 35
    .line 36
    iget-object v5, v4, Lcom/voxdon/xplorer/file/r$d;->a:Lax/p7/c;

    .line 37
    .line 38
    invoke-virtual {v5}, Lax/p7/c;->r()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_17

    .line 47
    .line 48
    iget-object v0, v4, Lcom/voxdon/xplorer/file/r$d;->b:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v2, v4, Lcom/voxdon/xplorer/file/r$d;->a:Lax/p7/c;

    .line 51
    .line 52
    invoke-virtual {v2}, Lax/p7/c;->v()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {p3, v1, v2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, v1, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    goto :goto_3f

    .line 63
    :cond_3e
    move-object v0, p2

    .line 64
    :goto_3f
    const-string v2, "what case is this?"

    .line 65
    .line 66
    if-nez v0, :cond_47

    .line 67
    .line 68
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_75

    .line 72
    :cond_47
    iget-object v4, p0, Lcom/voxdon/xplorer/file/r;->i:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_75

    .line 79
    .line 80
    const-string v4, "root"

    .line 81
    .line 82
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_58

    .line 87
    .line 88
    goto :goto_75

    .line 89
    :cond_58
    const-string v4, "no-parent-id"

    .line 90
    .line 91
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_69

    .line 96
    .line 97
    const-string p1, ".hidden-system-folder"

    .line 98
    .line 99
    invoke-virtual {p3, v1, p1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3, v1, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    goto :goto_75

    .line 106
    :cond_69
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_73

    .line 111
    .line 112
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_75

    .line 116
    :cond_73
    move-object p2, v0

    .line 117
    goto :goto_5

    .line 118
    :cond_75
    :goto_75
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_7d

    .line 123
    .line 124
    const/4 p1, 0x0

    .line 125
    return-object p1

    .line 126
    :cond_7d
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method private E0(Ljava/lang/String;)Z
    .registers 3

    .line 1
    const-string v0, "root"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_15

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->i:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_13

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_13

    .line 18
    .line 19
    goto :goto_15

    .line 20
    :cond_13
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_15
    :goto_15
    const/4 p1, 0x1

    .line 23
    return p1
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
    .line 42
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

.method public static F0(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_4
    const/16 v0, 0x2f

    .line 6
    .line 7
    const/16 v1, 0x5f

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private declared-synchronized H0(Ljava/lang/String;)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lax/p7/c;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lax/o7/a$c;->e()Lax/o7/a$c$d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "nextPageToken, files(kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed)"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lax/o7/a$c$d;->I(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, p1}, Lax/o7/a$c$d;->K(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_1a
    .catchall {:try_start_1 .. :try_end_1a} :catchall_38

    .line 27
    :cond_1a
    :try_start_1a
    invoke-virtual {p1}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lax/p7/d;

    .line 32
    .line 33
    invoke-virtual {v1}, Lax/p7/d;->n()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :goto_28
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_3c

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lax/p7/c;

    .line 52
    .line 53
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_28

    .line 57
    :catchall_38
    move-exception p1

    .line 58
    goto :goto_5d

    .line 59
    :catch_3a
    move-exception v1

    .line 60
    goto :goto_44

    .line 61
    :cond_3c
    invoke-virtual {v1}, Lax/p7/d;->o()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p1, v1}, Lax/o7/a$c$d;->J(Ljava/lang/String;)Lax/o7/a$c$d;
    :try_end_43
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_43} :catch_3a
    .catchall {:try_start_1a .. :try_end_43} :catchall_38

    .line 66
    .line 67
    .line 68
    goto :goto_4b

    .line 69
    :goto_44
    :try_start_44
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 70
    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-virtual {p1, v1}, Lax/o7/a$c$d;->J(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 74
    .line 75
    .line 76
    :goto_4b
    invoke-virtual {p1}, Lax/o7/a$c$d;->G()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-eqz v1, :cond_5b

    .line 81
    .line 82
    invoke-virtual {p1}, Lax/o7/a$c$d;->G()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v1
    :try_end_59
    .catchall {:try_start_44 .. :try_end_59} :catchall_38

    .line 90
    if-gtz v1, :cond_1a

    .line 91
    .line 92
    :cond_5b
    monitor-exit p0

    .line 93
    return-object v0

    .line 94
    :goto_5d
    :try_start_5d
    monitor-exit p0
    :try_end_5e
    .catchall {:try_start_5d .. :try_end_5e} :catchall_38

    .line 95
    throw p1
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method private I0(Ljava/lang/String;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_a
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_22

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_a

    .line 28
    .line 29
    iget-object v2, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_a

    .line 35
    :cond_22
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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

.method public static J0(Lax/p7/c;)Ljava/lang/String;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lax/p7/c;->v()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/voxdon/xplorer/file/r;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
.end method

.method private K0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;ZZLax/u3/c;Lax/g3/i;)V
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-wide v5, p4

    .line 2
    new-instance v1, Lax/p7/c;

    .line 3
    .line 4
    invoke-direct {v1}, Lax/p7/c;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Lax/p7/c;->G(Ljava/lang/String;)Lax/p7/c;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p3}, Lax/p7/c;->E(Ljava/lang/String;)Lax/p7/c;

    .line 15
    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    if-eqz p6, :cond_28

    .line 20
    .line 21
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long v4, v7, v2

    .line 26
    .line 27
    if-lez v4, :cond_28

    .line 28
    .line 29
    new-instance v4, Lax/m7/i;

    .line 30
    .line 31
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    invoke-direct {v4, v7, v8}, Lax/m7/i;-><init>(J)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v4}, Lax/p7/c;->F(Lax/m7/i;)Lax/p7/c;

    .line 39
    .line 40
    .line 41
    :cond_28
    const/4 v4, 0x0

    .line 42
    if-eqz p8, :cond_33

    .line 43
    .line 44
    invoke-interface {p1}, Lax/c3/b;->t()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    if-eqz v7, :cond_33

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    goto :goto_34

    .line 52
    :cond_33
    const/4 v7, 0x0

    .line 53
    :goto_34
    invoke-virtual {p2}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :try_start_38
    new-instance v8, Lax/i7/y;

    .line 58
    .line 59
    new-instance v9, Ljava/io/BufferedInputStream;

    .line 60
    .line 61
    invoke-direct {v9, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v8, p3, v9}, Lax/i7/y;-><init>(Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_42
    .catch Ljava/io/IOException; {:try_start_38 .. :try_end_42} :catch_f3
    .catch Ljava/lang/SecurityException; {:try_start_38 .. :try_end_42} :catch_f1
    .catch Ljava/lang/NullPointerException; {:try_start_38 .. :try_end_42} :catch_ef
    .catch Ljava/lang/IllegalArgumentException; {:try_start_38 .. :try_end_42} :catch_ec
    .catchall {:try_start_38 .. :try_end_42} :catchall_e9

    .line 65
    .line 66
    .line 67
    const-wide/16 v9, -0x1

    .line 68
    .line 69
    cmp-long v0, v5, v9

    .line 70
    .line 71
    if-eqz v0, :cond_5c

    .line 72
    .line 73
    :try_start_48
    invoke-virtual {v8, v5, v6}, Lax/i7/y;->i(J)Lax/i7/y;
    :try_end_4b
    .catch Ljava/io/IOException; {:try_start_48 .. :try_end_4b} :catch_5a
    .catch Ljava/lang/SecurityException; {:try_start_48 .. :try_end_4b} :catch_58
    .catch Ljava/lang/NullPointerException; {:try_start_48 .. :try_end_4b} :catch_56
    .catch Ljava/lang/IllegalArgumentException; {:try_start_48 .. :try_end_4b} :catch_51
    .catchall {:try_start_48 .. :try_end_4b} :catchall_4c

    .line 74
    .line 75
    .line 76
    goto :goto_5c

    .line 77
    :catchall_4c
    move-exception v0

    .line 78
    move-object p1, v0

    .line 79
    move-object v3, p2

    .line 80
    goto/16 :goto_113

    .line 81
    .line 82
    :catch_51
    move-exception v0

    .line 83
    :goto_52
    move-object p1, v0

    .line 84
    move-object v3, p2

    .line 85
    goto/16 :goto_fe

    .line 86
    .line 87
    :catch_56
    move-exception v0

    .line 88
    goto :goto_52

    .line 89
    :catch_58
    move-exception v0

    .line 90
    goto :goto_52

    .line 91
    :catch_5a
    move-exception v0

    .line 92
    goto :goto_52

    .line 93
    :cond_5c
    :goto_5c
    :try_start_5c
    invoke-virtual {v8, v4}, Lax/i7/y;->h(Z)Lax/i7/y;
    :try_end_5f
    .catch Ljava/io/IOException; {:try_start_5c .. :try_end_5f} :catch_f3
    .catch Ljava/lang/SecurityException; {:try_start_5c .. :try_end_5f} :catch_f1
    .catch Ljava/lang/NullPointerException; {:try_start_5c .. :try_end_5f} :catch_ef
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5c .. :try_end_5f} :catch_ec
    .catchall {:try_start_5c .. :try_end_5f} :catchall_e9

    .line 94
    .line 95
    .line 96
    if-eqz v7, :cond_72

    .line 97
    .line 98
    :try_start_61
    check-cast p1, Lax/c3/E;

    .line 99
    .line 100
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 105
    .line 106
    invoke-virtual {v0}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p1, v1, v8}, Lax/o7/a$c;->g(Ljava/lang/String;Lax/p7/c;Lax/i7/b;)Lax/o7/a$c$e;

    .line 111
    .line 112
    .line 113
    move-result-object p1
    :try_end_71
    .catch Ljava/io/IOException; {:try_start_61 .. :try_end_71} :catch_5a
    .catch Ljava/lang/SecurityException; {:try_start_61 .. :try_end_71} :catch_58
    .catch Ljava/lang/NullPointerException; {:try_start_61 .. :try_end_71} :catch_56
    .catch Ljava/lang/IllegalArgumentException; {:try_start_61 .. :try_end_71} :catch_51
    .catchall {:try_start_61 .. :try_end_71} :catchall_4c

    .line 114
    goto :goto_8d

    .line 115
    :cond_72
    :try_start_72
    invoke-direct/range {p0 .. p1}, Lcom/voxdon/xplorer/file/r;->B0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-eqz p1, :cond_f5

    .line 120
    .line 121
    filled-new-array {p1}, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {v1, p1}, Lax/p7/c;->H(Ljava/util/List;)Lax/p7/c;

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 133
    .line 134
    invoke-virtual {p1}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1, v1, v8}, Lax/o7/a$c;->c(Lax/p7/c;Lax/i7/b;)Lax/o7/a$c$b;

    .line 139
    .line 140
    .line 141
    move-result-object p1
    :try_end_8d
    .catch Ljava/io/IOException; {:try_start_72 .. :try_end_8d} :catch_f3
    .catch Ljava/lang/SecurityException; {:try_start_72 .. :try_end_8d} :catch_f1
    .catch Ljava/lang/NullPointerException; {:try_start_72 .. :try_end_8d} :catch_ef
    .catch Ljava/lang/IllegalArgumentException; {:try_start_72 .. :try_end_8d} :catch_ec
    .catchall {:try_start_72 .. :try_end_8d} :catchall_e9

    .line 142
    :goto_8d
    if-eqz p6, :cond_9e

    .line 143
    .line 144
    :try_start_8f
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    cmp-long v7, v0, v2

    .line 149
    .line 150
    if-lez v7, :cond_9e

    .line 151
    .line 152
    const-string v0, "setModifiedDate"

    .line 153
    .line 154
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {p1, v0, v1}, Lax/o7/b;->E(Ljava/lang/String;Ljava/lang/Object;)Lax/o7/b;
    :try_end_9e
    .catch Ljava/io/IOException; {:try_start_8f .. :try_end_9e} :catch_5a
    .catch Ljava/lang/SecurityException; {:try_start_8f .. :try_end_9e} :catch_58
    .catch Ljava/lang/NullPointerException; {:try_start_8f .. :try_end_9e} :catch_56
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8f .. :try_end_9e} :catch_51
    .catchall {:try_start_8f .. :try_end_9e} :catchall_4c

    .line 157
    .line 158
    .line 159
    :cond_9e
    :try_start_9e
    invoke-virtual {p1}, Lax/g7/b;->r()Lax/f7/b;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-virtual {v7, v4}, Lax/f7/b;->n(Z)Lax/f7/b;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x100000

    .line 167
    .line 168
    invoke-virtual {v7, v0}, Lax/f7/b;->m(I)Lax/f7/b;

    .line 169
    .line 170
    .line 171
    new-instance v0, Lcom/voxdon/xplorer/file/r$a;
    :try_end_ac
    .catch Ljava/io/IOException; {:try_start_9e .. :try_end_ac} :catch_f3
    .catch Ljava/lang/SecurityException; {:try_start_9e .. :try_end_ac} :catch_f1
    .catch Ljava/lang/NullPointerException; {:try_start_9e .. :try_end_ac} :catch_ef
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9e .. :try_end_ac} :catch_ec
    .catchall {:try_start_9e .. :try_end_ac} :catchall_e9

    .line 172
    .line 173
    move-object v1, p0

    .line 174
    move-object v3, p2

    .line 175
    move-object/from16 v2, p9

    .line 176
    .line 177
    move-object/from16 v4, p10

    .line 178
    .line 179
    :try_start_b2
    invoke-direct/range {v0 .. v6}, Lcom/voxdon/xplorer/file/r$a;-><init>(Lcom/voxdon/xplorer/file/r;Lax/u3/c;Ljava/io/InputStream;Lax/g3/i;J)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7, v0}, Lax/f7/b;->s(Lax/f7/c;)Lax/f7/b;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Lax/p7/c;

    .line 190
    .line 191
    if-eqz p9, :cond_d9

    .line 192
    .line 193
    invoke-interface/range {p9 .. p9}, Lax/u3/c;->isCancelled()Z

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    if-nez p2, :cond_c7

    .line 198
    .line 199
    goto :goto_d9

    .line 200
    :cond_c7
    new-instance p1, Lax/b3/a;

    .line 201
    .line 202
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 203
    .line 204
    .line 205
    throw p1
    :try_end_cd
    .catch Ljava/io/IOException; {:try_start_b2 .. :try_end_cd} :catch_d7
    .catch Ljava/lang/SecurityException; {:try_start_b2 .. :try_end_cd} :catch_d5
    .catch Ljava/lang/NullPointerException; {:try_start_b2 .. :try_end_cd} :catch_d3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b2 .. :try_end_cd} :catch_d0
    .catchall {:try_start_b2 .. :try_end_cd} :catchall_cd

    .line 206
    :catchall_cd
    move-exception v0

    .line 207
    :goto_ce
    move-object p1, v0

    .line 208
    goto :goto_113

    .line 209
    :catch_d0
    move-exception v0

    .line 210
    :goto_d1
    move-object p1, v0

    .line 211
    goto :goto_fe

    .line 212
    :catch_d3
    move-exception v0

    .line 213
    goto :goto_d1

    .line 214
    :catch_d5
    move-exception v0

    .line 215
    goto :goto_d1

    .line 216
    :catch_d7
    move-exception v0

    .line 217
    goto :goto_d1

    .line 218
    :cond_d9
    :goto_d9
    if-eqz p1, :cond_e1

    .line 219
    .line 220
    if-eqz v3, :cond_e0

    .line 221
    .line 222
    :try_start_dd
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_e0
    .catch Ljava/io/IOException; {:try_start_dd .. :try_end_e0} :catch_e0

    .line 223
    .line 224
    .line 225
    :catch_e0
    :cond_e0
    return-void

    .line 226
    :cond_e1
    :try_start_e1
    new-instance p1, Lax/b3/j;

    .line 227
    .line 228
    const-string p2, "GoogleDrive insert() returns null"

    .line 229
    .line 230
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw p1

    .line 234
    :catchall_e9
    move-exception v0

    .line 235
    move-object v3, p2

    .line 236
    goto :goto_ce

    .line 237
    :catch_ec
    move-exception v0

    .line 238
    :goto_ed
    move-object v3, p2

    .line 239
    goto :goto_d1

    .line 240
    :catch_ef
    move-exception v0

    .line 241
    goto :goto_ed

    .line 242
    :catch_f1
    move-exception v0

    .line 243
    goto :goto_ed

    .line 244
    :catch_f3
    move-exception v0

    .line 245
    goto :goto_ed

    .line 246
    :cond_f5
    move-object v3, p2

    .line 247
    new-instance p1, Lax/b3/j;

    .line 248
    .line 249
    const-string p2, "Dst parent not found"

    .line 250
    .line 251
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p1
    :try_end_fe
    .catch Ljava/io/IOException; {:try_start_e1 .. :try_end_fe} :catch_d7
    .catch Ljava/lang/SecurityException; {:try_start_e1 .. :try_end_fe} :catch_d5
    .catch Ljava/lang/NullPointerException; {:try_start_e1 .. :try_end_fe} :catch_d3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_e1 .. :try_end_fe} :catch_d0
    .catchall {:try_start_e1 .. :try_end_fe} :catchall_cd

    .line 255
    :goto_fe
    if-eqz p9, :cond_10c

    .line 256
    .line 257
    :try_start_100
    invoke-interface/range {p9 .. p9}, Lax/u3/c;->isCancelled()Z

    .line 258
    .line 259
    .line 260
    move-result p2

    .line 261
    if-eqz p2, :cond_10c

    .line 262
    .line 263
    new-instance p1, Lax/b3/a;

    .line 264
    .line 265
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 266
    .line 267
    .line 268
    throw p1

    .line 269
    :cond_10c
    const-string p2, "googledrive write file"

    .line 270
    .line 271
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    throw p1
    :try_end_113
    .catchall {:try_start_100 .. :try_end_113} :catchall_cd

    .line 276
    :goto_113
    if-eqz v3, :cond_118

    .line 277
    .line 278
    :try_start_115
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_118
    .catch Ljava/io/IOException; {:try_start_115 .. :try_end_118} :catch_118

    .line 279
    .line 280
    .line 281
    :catch_118
    :cond_118
    throw p1
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
.end method

.method static synthetic k0(Lcom/voxdon/xplorer/file/r;)Lax/o7/a;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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
.end method

.method static synthetic l0(Lcom/voxdon/xplorer/file/r;Lax/o7/a;)Lax/o7/a;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 2
    .line 3
    return-object p1
    .line 4
    .line 5
    .line 6
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

.method static synthetic m0(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/r;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
    .line 4
    .line 5
    .line 6
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

.method static synthetic n0()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/r;->n:Ljava/util/logging/Logger;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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

.method static synthetic o0(Lcom/voxdon/xplorer/file/r;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/r;->j:Z

    .line 2
    .line 3
    return p1
    .line 4
    .line 5
    .line 6
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

.method private p0()Ljava/util/ArrayList;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/voxdon/xplorer/file/r$d;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 7
    .line 8
    invoke-virtual {v1}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lax/o7/a$c;->e()Lax/o7/a$c$d;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "nextPageToken, files(id,name,parents)"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lax/o7/a$c$d;->I(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "trashed = false and mimeType = \'application/vnd.google-apps.folder\'"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lax/o7/a$c$d;->K(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_1b
    :try_start_1b
    invoke-virtual {v1}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lax/p7/d;

    .line 33
    .line 34
    invoke-virtual {v2}, Lax/p7/d;->n()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_29
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_8a

    .line 47
    .line 48
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lax/p7/c;

    .line 53
    .line 54
    invoke-virtual {v4}, Lax/p7/c;->w()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    if-eqz v5, :cond_72

    .line 59
    .line 60
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-nez v6, :cond_42

    .line 65
    .line 66
    goto :goto_72

    .line 67
    :cond_42
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/4 v7, 0x1

    .line 72
    const/4 v8, 0x0

    .line 73
    if-ne v6, v7, :cond_53

    .line 74
    .line 75
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Ljava/lang/String;

    .line 80
    .line 81
    goto :goto_74

    .line 82
    :catch_51
    move-exception v2

    .line 83
    goto :goto_92

    .line 84
    :cond_53
    new-instance v6, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v7, "parent:"

    .line 90
    .line 91
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {v6}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Ljava/lang/String;

    .line 113
    .line 114
    goto :goto_74

    .line 115
    :cond_72
    :goto_72
    const-string v5, "no-parent-id"

    .line 116
    .line 117
    :goto_74
    if-eqz v5, :cond_86

    .line 118
    .line 119
    invoke-virtual {v4}, Lax/p7/c;->r()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    if-nez v6, :cond_7d

    .line 124
    .line 125
    goto :goto_86

    .line 126
    :cond_7d
    new-instance v6, Lcom/voxdon/xplorer/file/r$d;

    .line 127
    .line 128
    invoke-direct {v6, v4, v5}, Lcom/voxdon/xplorer/file/r$d;-><init>(Lax/p7/c;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_29

    .line 135
    :cond_86
    :goto_86
    invoke-static {}, Lax/u3/b;->f()V

    .line 136
    .line 137
    .line 138
    goto :goto_29

    .line 139
    :cond_8a
    invoke-virtual {v2}, Lax/p7/d;->o()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v1, v2}, Lax/o7/a$c$d;->J(Ljava/lang/String;)Lax/o7/a$c$d;
    :try_end_91
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_91} :catch_51

    .line 144
    .line 145
    .line 146
    goto :goto_99

    .line 147
    :goto_92
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    invoke-virtual {v1, v2}, Lax/o7/a$c$d;->J(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 152
    .line 153
    .line 154
    :goto_99
    invoke-virtual {v1}, Lax/o7/a$c$d;->G()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-eqz v2, :cond_a9

    .line 159
    .line 160
    invoke-virtual {v1}, Lax/o7/a$c$d;->G()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-gtz v2, :cond_1b

    .line 169
    .line 170
    :cond_a9
    return-object v0
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

.method private q0(Lax/c3/E;)Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p1}, Lax/c3/E;->t()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->r0(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
.end method

.method private r0(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    return-object p1
.end method

.method private s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;
    .registers 7

    .line 1
    instance-of v0, p2, Lax/e7/b;

    .line 2
    .line 3
    const/16 v1, 0x194

    .line 4
    .line 5
    const/16 v2, 0x193

    .line 6
    .line 7
    if-eqz v0, :cond_9e

    .line 8
    .line 9
    move-object v0, p2

    .line 10
    check-cast v0, Lax/e7/b;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/i7/t;->b()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ne v3, v2, :cond_6a

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/e7/b;->e()Lax/e7/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_6a

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/e7/b;->e()Lax/e7/a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lax/e7/a;->n()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_cd

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_cd

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lax/e7/a$a;

    .line 49
    .line 50
    invoke-virtual {v1}, Lax/e7/a$a;->n()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "quotaExceeded"

    .line 55
    .line 56
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_64

    .line 61
    .line 62
    const-string v2, "storageQuotaExceeded"

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_46

    .line 69
    .line 70
    goto :goto_64

    .line 71
    :cond_46
    const-string v2, "forbidden"

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_5e

    .line 78
    .line 79
    const-string v2, "insufficientPermissions"

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_5e

    .line 86
    .line 87
    const-string v2, "insufficientParentPermissions"

    .line 88
    .line 89
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_25

    .line 94
    .line 95
    :cond_5e
    new-instance p1, Lax/b3/e;

    .line 96
    .line 97
    invoke-direct {p1, p2}, Lax/b3/e;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_64
    :goto_64
    new-instance p1, Lax/b3/s;

    .line 102
    .line 103
    invoke-direct {p1, p2}, Lax/b3/s;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    return-object p1

    .line 107
    :cond_6a
    if-ne v3, v1, :cond_cd

    .line 108
    .line 109
    invoke-virtual {v0}, Lax/e7/b;->e()Lax/e7/a;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-eqz v1, :cond_cd

    .line 114
    .line 115
    invoke-virtual {v0}, Lax/e7/b;->e()Lax/e7/a;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lax/e7/a;->n()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_cd

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :cond_80
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_cd

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Lax/e7/a$a;

    .line 140
    .line 141
    invoke-virtual {v1}, Lax/e7/a$a;->n()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v2, "notFound"

    .line 146
    .line 147
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_80

    .line 152
    .line 153
    new-instance p1, Lax/b3/t;

    .line 154
    .line 155
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_9e
    instance-of v0, p2, Lax/i7/t;

    .line 160
    .line 161
    if-eqz v0, :cond_cd

    .line 162
    .line 163
    move-object v0, p2

    .line 164
    check-cast v0, Lax/i7/t;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/i7/t;->c()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v0}, Lax/i7/t;->b()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-ne v0, v2, :cond_bd

    .line 175
    .line 176
    const-string v2, "Forbidden"

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_bd

    .line 183
    .line 184
    new-instance p1, Lax/b3/e;

    .line 185
    .line 186
    invoke-direct {p1, p2}, Lax/b3/e;-><init>(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    return-object p1

    .line 190
    :cond_bd
    if-ne v0, v1, :cond_cd

    .line 191
    .line 192
    const-string v0, "Not Found"

    .line 193
    .line 194
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_cd

    .line 199
    .line 200
    new-instance p1, Lax/b3/t;

    .line 201
    .line 202
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :cond_cd
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-eqz v0, :cond_e5

    .line 211
    .line 212
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    const-string v1, "NetworkError"

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_e5

    .line 223
    .line 224
    new-instance p1, Lax/b3/q;

    .line 225
    .line 226
    invoke-direct {p1, p2}, Lax/b3/q;-><init>(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    return-object p1

    .line 230
    :cond_e5
    invoke-static {p1, p2}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    return-object p1
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private t0()Lax/c3/E;
    .registers 4

    .line 1
    new-instance v0, Lax/c3/E;

    .line 2
    .line 3
    const-string v1, "/.hidden-system-folder"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, p0, v1, v2, v2}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;ZZ)V

    .line 7
    .line 8
    .line 9
    return-object v0
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

.method private u0(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    const-string v0, "\'"

    .line 2
    .line 3
    const-string v1, "\\\'"

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
.end method

.method private v0()Ljava/lang/String;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "GoogleDrivePrefs"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "account_name_"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private w0(Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/HashSet;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/voxdon/xplorer/file/r$d;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/Stack;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-lez p2, :cond_46

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x0

    .line 34
    :cond_21
    :goto_21
    if-ge v3, v2, :cond_10

    .line 35
    .line 36
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    check-cast v4, Lcom/voxdon/xplorer/file/r$d;

    .line 43
    .line 44
    iget-object v5, v4, Lcom/voxdon/xplorer/file/r$d;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_21

    .line 51
    .line 52
    iget-object v5, v4, Lcom/voxdon/xplorer/file/r$d;->a:Lax/p7/c;

    .line 53
    .line 54
    invoke-virtual {v5}, Lax/p7/c;->r()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    iget-object v4, v4, Lcom/voxdon/xplorer/file/r$d;->a:Lax/p7/c;

    .line 62
    .line 63
    invoke-virtual {v4}, Lax/p7/c;->r()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_21

    .line 71
    :cond_46
    return-object v1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method private y0(Lax/c3/E;)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p1}, Lax/c3/E;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1b

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/c3/E;->g0()Lax/p7/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1b

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/p7/c;->x()Lax/p7/c$f;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_1b

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/p7/c;->x()Lax/p7/c$f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lax/p7/c$f;->n()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 v0, 0x0

    .line 29
    :goto_1c
    if-nez v0, :cond_23

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/c3/E;->t()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_23
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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

.method private z0(Lax/p7/c;)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p1}, Lax/p7/c;->w()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "root"

    .line 6
    .line 7
    if-eqz v0, :cond_25

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/p7/c;->w()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_25

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/p7/c;->w()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->E0(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_24

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_24
    return-object p1

    .line 38
    :cond_25
    return-object v1
    .line 39
    .line 40
    .line 41
    .line 42
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


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 5

    .line 1
    const/4 p1, 0x0

    .line 2
    if-eqz p3, :cond_1a

    .line 3
    .line 4
    :try_start_3
    const-string v0, "url="

    .line 5
    .line 6
    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    goto :goto_1a

    .line 13
    :cond_c
    const/4 p2, 0x4

    .line 14
    invoke-virtual {p3, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    goto :goto_2b

    .line 23
    :catch_16
    move-exception p2

    .line 24
    goto :goto_50

    .line 25
    :catch_18
    move-exception p2

    .line 26
    goto :goto_50

    .line 27
    :cond_1a
    :goto_1a
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/r;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Lax/c3/E;

    .line 32
    .line 33
    invoke-virtual {p2}, Lax/c3/E;->i0()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    if-nez p3, :cond_27

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_27
    invoke-virtual {p2}, Lax/c3/E;->i0()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    :goto_2b
    iget-object p3, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 45
    .line 46
    invoke-virtual {p3}, Lax/g7/a;->e()Lax/i7/q;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    new-instance v0, Lax/i7/g;

    .line 51
    .line 52
    invoke-direct {v0, p2}, Lax/i7/g;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, v0}, Lax/i7/q;->a(Lax/i7/g;)Lax/i7/p;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, Lax/i7/p;->b()Lax/i7/s;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    new-instance p3, Ljava/io/ByteArrayOutputStream;

    .line 64
    .line 65
    invoke-direct {p3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p3}, Lax/i7/s;->b(Ljava/io/OutputStream;)V

    .line 69
    .line 70
    .line 71
    new-instance p2, Ljava/io/ByteArrayInputStream;

    .line 72
    .line 73
    invoke-virtual {p3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-direct {p2, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_4f
    .catch Lax/b3/j; {:try_start_3 .. :try_end_4f} :catch_18
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_4f} :catch_16

    .line 78
    .line 79
    .line 80
    return-object p2

    .line 81
    :goto_50
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 82
    .line 83
    .line 84
    return-object p1
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public B(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Lcom/voxdon/xplorer/file/m$f;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_53

    .line 6
    .line 7
    const-string p2, "/.hidden-system-folder"

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_4d

    .line 18
    .line 19
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-static {p2}, Lax/u3/b;->c(Z)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Lax/c3/E;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/r;->x0(Lax/c3/E;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :cond_23
    :goto_23
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4c

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 47
    .line 48
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_23

    .line 53
    .line 54
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->l:Lj$/util/concurrent/ConcurrentHashMap;

    .line 64
    .line 65
    invoke-interface {v0}, Lax/c3/b;->t()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v1, v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_23

    .line 77
    :cond_4c
    return-object p1

    .line 78
    :cond_4d
    new-instance p1, Lax/b3/e;

    .line 79
    .line 80
    invoke-direct {p1}, Lax/b3/e;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_53
    new-instance p1, Lax/b3/t;

    .line 85
    .line 86
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p1
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method public D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-wide/from16 v5, p4

    .line 14
    .line 15
    move-object/from16 v7, p6

    .line 16
    .line 17
    move/from16 v8, p8

    .line 18
    .line 19
    move-object/from16 v10, p9

    .line 20
    .line 21
    move-object/from16 v11, p10

    .line 22
    .line 23
    invoke-direct/range {v1 .. v11}, Lcom/voxdon/xplorer/file/r;->K0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;ZZLax/u3/c;Lax/g3/i;)V

    .line 24
    .line 25
    .line 26
    return-void
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
    .line 42
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
.end method

.method public E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-static {p3}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    if-eqz p3, :cond_9c

    .line 13
    .line 14
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    if-eqz p3, :cond_1a

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-direct {p0, p3}, Lcom/voxdon/xplorer/file/r;->I0(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    :try_start_1a
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    new-instance p3, Lax/p7/c;

    .line 32
    .line 33
    invoke-direct {p3}, Lax/p7/c;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lax/m7/i;

    .line 37
    .line 38
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-direct {v2, v3, v4}, Lax/m7/i;-><init>(J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, v2}, Lax/p7/c;->F(Lax/m7/i;)Lax/p7/c;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p3, v2}, Lax/p7/c;->G(Ljava/lang/String;)Lax/p7/c;

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 56
    .line 57
    invoke-virtual {v2}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v3, p1

    .line 62
    check-cast v3, Lax/c3/E;

    .line 63
    .line 64
    invoke-direct {p0, v3}, Lcom/voxdon/xplorer/file/r;->q0(Lax/c3/E;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v3, p3}, Lax/o7/a$c;->f(Ljava/lang/String;Lax/p7/c;)Lax/o7/a$c$e;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    const-string v2, "name"

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_7e

    .line 87
    .line 88
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->B0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/r;->B0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    if-eqz p2, :cond_76

    .line 97
    .line 98
    if-eqz p1, :cond_6e

    .line 99
    .line 100
    invoke-virtual {p3, p2}, Lax/o7/a$c$e;->H(Ljava/lang/String;)Lax/o7/a$c$e;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3, p1}, Lax/o7/a$c$e;->J(Ljava/lang/String;)Lax/o7/a$c$e;

    .line 104
    .line 105
    .line 106
    goto :goto_7e

    .line 107
    :catch_6a
    move-exception p1

    .line 108
    goto :goto_95

    .line 109
    :catch_6c
    move-exception p1

    .line 110
    goto :goto_95

    .line 111
    :cond_6e
    new-instance p1, Lax/b3/j;

    .line 112
    .line 113
    const-string p2, "Source parent does not exist"

    .line 114
    .line 115
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1

    .line 119
    :cond_76
    new-instance p1, Lax/b3/j;

    .line 120
    .line 121
    const-string p2, "Target parent does not exist"

    .line 122
    .line 123
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_7e
    :goto_7e
    invoke-virtual {p3, v2}, Lax/o7/a$c$e;->I(Ljava/lang/String;)Lax/o7/a$c$e;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p3}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-eqz p1, :cond_8d

    .line 135
    .line 136
    if-eqz p4, :cond_8c

    .line 137
    .line 138
    invoke-interface {p4, v0, v1, v0, v1}, Lax/g3/i;->a(JJ)V

    .line 139
    .line 140
    .line 141
    :cond_8c
    return-void

    .line 142
    :cond_8d
    new-instance p1, Lax/b3/j;

    .line 143
    .line 144
    const-string p2, "result is null"

    .line 145
    .line 146
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1
    :try_end_95
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_95} :catch_6c
    .catch Ljava/lang/SecurityException; {:try_start_1a .. :try_end_95} :catch_6a

    .line 150
    :goto_95
    const-string p2, "GD moveFile"

    .line 151
    .line 152
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    throw p1

    .line 157
    :cond_9c
    new-instance p1, Lax/b3/t;

    .line 158
    .line 159
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 160
    .line 161
    .line 162
    throw p1
.end method

.method public F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-static {p3}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    if-eqz p3, :cond_8a

    .line 13
    .line 14
    move-object p3, p1

    .line 15
    check-cast p3, Lax/c3/E;

    .line 16
    .line 17
    new-instance v0, Lax/p7/c;

    .line 18
    .line 19
    invoke-direct {v0}, Lax/p7/c;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    cmp-long v5, v1, v3

    .line 29
    .line 30
    if-ltz v5, :cond_27

    .line 31
    .line 32
    new-instance v3, Lax/m7/i;

    .line 33
    .line 34
    invoke-direct {v3, v1, v2}, Lax/m7/i;-><init>(J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Lax/p7/c;->F(Lax/m7/i;)Lax/p7/c;

    .line 38
    .line 39
    .line 40
    :cond_27
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Lax/p7/c;->G(Ljava/lang/String;)Lax/p7/c;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_56

    .line 60
    .line 61
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/r;->B0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-eqz p2, :cond_4e

    .line 66
    .line 67
    filled-new-array {p2}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {v0, p2}, Lax/p7/c;->H(Ljava/util/List;)Lax/p7/c;

    .line 76
    .line 77
    .line 78
    goto :goto_56

    .line 79
    :cond_4e
    new-instance p1, Lax/b3/j;

    .line 80
    .line 81
    const-string p2, "Dst parent not found"

    .line 82
    .line 83
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_56
    :goto_56
    :try_start_56
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 88
    .line 89
    .line 90
    move-result-wide p1

    .line 91
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 92
    .line 93
    invoke-virtual {v1}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-direct {p0, p3}, Lcom/voxdon/xplorer/file/r;->q0(Lax/c3/E;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-virtual {v1, p3, v0}, Lax/o7/a$c;->a(Ljava/lang/String;Lax/p7/c;)Lax/o7/a$c$a;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    invoke-virtual {p3}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    check-cast p3, Lax/p7/c;

    .line 110
    .line 111
    if-eqz p3, :cond_7b

    .line 112
    .line 113
    if-eqz p4, :cond_7a

    .line 114
    .line 115
    invoke-interface {p4, p1, p2, p1, p2}, Lax/g3/i;->a(JJ)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :catch_76
    move-exception p1

    .line 120
    goto :goto_83

    .line 121
    :catch_78
    move-exception p1

    .line 122
    goto :goto_83

    .line 123
    :cond_7a
    return-void

    .line 124
    :cond_7b
    new-instance p1, Lax/b3/j;

    .line 125
    .line 126
    const-string p2, "GoogleDrive copy returns null"

    .line 127
    .line 128
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1
    :try_end_83
    .catch Ljava/io/IOException; {:try_start_56 .. :try_end_83} :catch_78
    .catch Ljava/lang/SecurityException; {:try_start_56 .. :try_end_83} :catch_76

    .line 132
    :goto_83
    const-string p2, "GD copyFile"

    .line 133
    .line 134
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    throw p1

    .line 139
    :cond_8a
    new-instance p1, Lax/b3/t;

    .line 140
    .line 141
    const-string p2, "not existing source file"

    .line 142
    .line 143
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1
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
.end method

.method public G(Ljava/lang/String;Ljava/lang/String;)I
    .registers 3

    .line 1
    const/4 p1, -0x1

    return p1
.end method

.method public G0(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .registers 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/voxdon/xplorer/file/r$d;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    new-instance v7, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lax/o7/a$c;->e()Lax/o7/a$c$d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "nextPageToken, files(kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed)"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lax/o7/a$c$d;->I(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lax/o7/a$c$d;->K(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    :cond_1d
    const/4 v9, 0x0

    .line 31
    :try_start_1e
    invoke-virtual {v8}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v10, v0

    .line 36
    check-cast v10, Lax/p7/d;

    .line 37
    .line 38
    invoke-virtual {v10}, Lax/p7/d;->n()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v11

    .line 46
    :goto_2d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_92

    .line 51
    .line 52
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lax/p7/c;

    .line 57
    .line 58
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/r;->z0(Lax/p7/c;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v6, :cond_4e

    .line 63
    .line 64
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_4e

    .line 69
    .line 70
    move-object/from16 v12, p4

    .line 71
    .line 72
    goto :goto_4f

    .line 73
    :catch_48
    move-exception v0

    .line 74
    move-object/from16 v13, p3

    .line 75
    .line 76
    move-object/from16 v14, p4

    .line 77
    .line 78
    goto :goto_9e

    .line 79
    :cond_4e
    move-object v12, v9

    .line 80
    :goto_4f
    if-nez v12, :cond_68

    .line 81
    .line 82
    if-eqz p2, :cond_68

    .line 83
    .line 84
    move-object v1, p0

    .line 85
    move-object/from16 v4, p3

    .line 86
    .line 87
    move-object/from16 v5, p4

    .line 88
    .line 89
    move-object v3, v2

    .line 90
    move-object/from16 v2, p2

    .line 91
    .line 92
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/r;->D0(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    move-object v2, v3

    .line 97
    if-eqz v12, :cond_64

    .line 98
    .line 99
    const/4 v3, 0x1

    .line 100
    goto :goto_65

    .line 101
    :cond_64
    const/4 v3, 0x0

    .line 102
    :goto_65
    invoke-static {v3}, Lax/u3/b;->c(Z)V
    :try_end_68
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_68} :catch_48

    .line 103
    .line 104
    .line 105
    :cond_68
    if-nez v12, :cond_7a

    .line 106
    .line 107
    move-object/from16 v13, p3

    .line 108
    .line 109
    move-object/from16 v14, p4

    .line 110
    .line 111
    :try_start_6e
    invoke-direct {p0, v0, v13, v14, v6}, Lcom/voxdon/xplorer/file/r;->C0(Lax/p7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lax/c3/E;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    :goto_76
    move-object v4, v0

    .line 120
    goto :goto_7f

    .line 121
    :catch_78
    move-exception v0

    .line 122
    goto :goto_9e

    .line 123
    :cond_7a
    move-object/from16 v13, p3

    .line 124
    .line 125
    move-object/from16 v14, p4

    .line 126
    .line 127
    goto :goto_76

    .line 128
    :goto_7f
    new-instance v0, Lax/c3/E;

    .line 129
    .line 130
    invoke-static {v4}, Lcom/voxdon/xplorer/file/r;->J0(Lax/p7/c;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v12, v3}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    move-object v3, v2

    .line 139
    move-object v1, p0

    .line 140
    invoke-direct/range {v0 .. v5}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_2d

    .line 147
    :cond_92
    move-object/from16 v13, p3

    .line 148
    .line 149
    move-object/from16 v14, p4

    .line 150
    .line 151
    invoke-virtual {v10}, Lax/p7/d;->o()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v8, v0}, Lax/o7/a$c$d;->J(Ljava/lang/String;)Lax/o7/a$c$d;
    :try_end_9d
    .catch Ljava/io/IOException; {:try_start_6e .. :try_end_9d} :catch_78

    .line 156
    .line 157
    .line 158
    goto :goto_a4

    .line 159
    :goto_9e
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8, v9}, Lax/o7/a$c$d;->J(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 163
    .line 164
    .line 165
    :goto_a4
    invoke-virtual {v8}, Lax/o7/a$c$d;->G()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    if-eqz v0, :cond_b4

    .line 170
    .line 171
    invoke-virtual {v8}, Lax/o7/a$c$d;->G()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-gtz v0, :cond_1d

    .line 180
    .line 181
    :cond_b4
    return-object v7
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lax/c3/E;

    .line 3
    .line 4
    invoke-virtual {v0}, Lax/c3/E;->i0()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_b

    .line 10
    .line 11
    return-object v2

    .line 12
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "url="

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lax/c3/E;->i0()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1}, Lax/c3/A;->J(Lcom/voxdon/xplorer/file/n;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2f

    .line 42
    .line 43
    invoke-static {p1, v0}, Lax/c3/B;->a0(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_2f
    return-object v2
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

.method public I(Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_47

    .line 4
    .line 5
    :try_start_4
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_31

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/r;->I0(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lax/p7/c;

    .line 19
    .line 20
    invoke-direct {v0}, Lax/p7/c;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lax/p7/c;->I(Ljava/lang/Boolean;)Lax/p7/c;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 29
    .line 30
    invoke-virtual {v1}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {p1}, Lax/c3/b;->t()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v1, p1, v0}, Lax/o7/a$c;->f(Ljava/lang/String;Lax/p7/c;)Lax/o7/a$c$e;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_2d
    move-exception p1

    .line 47
    goto :goto_37

    .line 48
    :catch_2f
    move-exception p1

    .line 49
    goto :goto_3d

    .line 50
    :cond_31
    new-instance p1, Lax/b3/t;

    .line 51
    .line 52
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p1
    :try_end_37
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_37} :catch_2f
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_37} :catch_2d

    .line 56
    :goto_37
    new-instance v0, Lax/b3/j;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :goto_3d
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 63
    .line 64
    .line 65
    const-string v0, "GoogleDrive deleteFileRecursively"

    .line 66
    .line 67
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    throw p1

    .line 72
    :cond_47
    new-instance p1, Lax/b3/h;

    .line 73
    .line 74
    const-string v0, "Service is not connected!"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method public J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_74

    .line 4
    .line 5
    :try_start_4
    move-object v0, p1

    .line 6
    check-cast v0, Lax/c3/E;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/c3/E;->g0()Lax/p7/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_4c

    .line 13
    .line 14
    check-cast p1, Lax/c3/E;

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 21
    .line 22
    invoke-virtual {v0}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1}, Lax/o7/a$c;->d(Ljava/lang/String;)Lax/o7/a$c$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    cmp-long v2, p2, v0

    .line 33
    .line 34
    if-eqz v2, :cond_47

    .line 35
    .line 36
    invoke-virtual {p1}, Lax/g7/b;->s()Lax/i7/m;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "bytes="

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p2, "-"

    .line 54
    .line 55
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {v0, p2}, Lax/i7/m;->O(Ljava/lang/String;)Lax/i7/m;

    .line 63
    .line 64
    .line 65
    goto :goto_47

    .line 66
    :catch_41
    move-exception p1

    .line 67
    goto :goto_67

    .line 68
    :catch_43
    move-exception p1

    .line 69
    goto :goto_6d

    .line 70
    :catch_45
    move-exception p1

    .line 71
    goto :goto_6d

    .line 72
    :cond_47
    :goto_47
    invoke-virtual {p1}, Lax/o7/a$c$c;->l()Ljava/io/InputStream;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_4c
    new-instance p2, Lax/b3/j;

    .line 78
    .line 79
    new-instance p3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v0, "The file doesn\'t have any content stored on Drive : "

    .line 85
    .line 86
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p2
    :try_end_67
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_67} :catch_45
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_67} :catch_43
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_67} :catch_41

    .line 104
    :goto_67
    new-instance p2, Lax/b3/j;

    .line 105
    .line 106
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw p2

    .line 110
    :goto_6d
    const-string p2, "googledrive getInputstream"

    .line 111
    .line 112
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    throw p1

    .line 117
    :cond_74
    new-instance p1, Lax/b3/h;

    .line 118
    .line 119
    const-string p2, "Service is not connected!"

    .line 120
    .line 121
    invoke-direct {p1, p2}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method public K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 5

    .line 1
    invoke-interface {p3}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/voxdon/xplorer/file/r$e;

    .line 5
    .line 6
    check-cast p2, Lax/d3/L;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/r;->v0()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p1, p0, p2, v0, p3}, Lcom/voxdon/xplorer/file/r$e;-><init>(Lcom/voxdon/xplorer/file/r;Lax/d3/L;Ljava/lang/String;Lcom/voxdon/xplorer/file/c$a;)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    new-array p2, p2, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/voxdon/xplorer/file/r;->m:Lcom/voxdon/xplorer/file/r$e;

    .line 22
    .line 23
    return-void
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
    .line 42
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public L()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public M(Lcom/voxdon/xplorer/file/n;)Z
    .registers 11

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/r;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lax/c3/E;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/c3/E;->n()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_12

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_19

    .line 24
    .line 25
    return v1

    .line 26
    :cond_19
    new-instance v2, Lax/p7/c;

    .line 27
    .line 28
    invoke-direct {v2}, Lax/p7/c;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Lax/p7/c;->G(Ljava/lang/String;)Lax/p7/c;

    .line 36
    .line 37
    .line 38
    const-string v3, "application/vnd.google-apps.folder"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Lax/p7/c;->E(Ljava/lang/String;)Lax/p7/c;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    filled-new-array {v3}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v2, v3}, Lax/p7/c;->H(Ljava/util/List;)Lax/p7/c;

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 59
    .line 60
    invoke-virtual {v3}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3, v2}, Lax/o7/a$c;->b(Lax/p7/c;)Lax/o7/a$c$b;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    move-object v7, v2

    .line 73
    check-cast v7, Lax/p7/c;

    .line 74
    .line 75
    if-eqz v7, :cond_80

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    new-instance v3, Lax/c3/E;

    .line 82
    .line 83
    invoke-virtual {v0}, Lax/c3/E;->t()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6
    :try_end_5a
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_5a} :catch_7e
    .catch Lax/b3/j; {:try_start_1 .. :try_end_5a} :catch_7c
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_5a} :catch_79

    .line 91
    move-object v4, p0

    .line 92
    :try_start_5b
    invoke-direct/range {v3 .. v8}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v4, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 96
    .line 97
    invoke-virtual {p1, v8, v3}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    iget-object p1, v4, Lcom/voxdon/xplorer/file/r;->l:Lj$/util/concurrent/ConcurrentHashMap;

    .line 101
    .line 102
    invoke-interface {v3}, Lax/c3/b;->t()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {p1, v0, v2}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_70
    .catch Ljava/io/IOException; {:try_start_5b .. :try_end_70} :catch_77
    .catch Lax/b3/j; {:try_start_5b .. :try_end_70} :catch_75
    .catch Ljava/lang/SecurityException; {:try_start_5b .. :try_end_70} :catch_72

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    return p1

    .line 115
    :catch_72
    move-exception v0

    .line 116
    :goto_73
    move-object p1, v0

    .line 117
    goto :goto_82

    .line 118
    :catch_75
    move-exception v0

    .line 119
    goto :goto_73

    .line 120
    :catch_77
    move-exception v0

    .line 121
    goto :goto_73

    .line 122
    :catch_79
    move-exception v0

    .line 123
    :goto_7a
    move-object v4, p0

    .line 124
    goto :goto_73

    .line 125
    :catch_7c
    move-exception v0

    .line 126
    goto :goto_7a

    .line 127
    :catch_7e
    move-exception v0

    .line 128
    goto :goto_7a

    .line 129
    :cond_80
    move-object v4, p0

    .line 130
    return v1

    .line 131
    :goto_82
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 132
    .line 133
    .line 134
    return v1
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public N(Lcom/voxdon/xplorer/file/n;)Z
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/r;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lax/c3/E;

    .line 11
    .line 12
    invoke-virtual {v1}, Lax/c3/E;->n()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_12

    .line 17
    .line 18
    return v0

    .line 19
    :cond_12
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_19

    .line 24
    .line 25
    return v0

    .line 26
    :cond_19
    new-instance v2, Lax/p7/c;

    .line 27
    .line 28
    invoke-direct {v2}, Lax/p7/c;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Lax/p7/c;->G(Ljava/lang/String;)Lax/p7/c;

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v2, p1}, Lax/p7/c;->E(Ljava/lang/String;)Lax/p7/c;

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    filled-new-array {p1}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v2, p1}, Lax/p7/c;->H(Ljava/util/List;)Lax/p7/c;

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 61
    .line 62
    invoke-virtual {p1}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1, v2}, Lax/o7/a$c;->b(Lax/p7/c;)Lax/o7/a$c$b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_49
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_49} :catch_50
    .catch Lax/b3/j; {:try_start_1 .. :try_end_49} :catch_4e

    .line 74
    if-eqz p1, :cond_4d

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :cond_4d
    return v0

    .line 79
    :catch_4e
    move-exception p1

    .line 80
    goto :goto_51

    .line 81
    :catch_50
    move-exception p1

    .line 82
    :goto_51
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 83
    .line 84
    .line 85
    return v0
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method public O()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/r;->I(Lcom/voxdon/xplorer/file/n;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method public Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public Y()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public a()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/r;->j:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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

.method public b()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->l:Lj$/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public g0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public h0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public j0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const/4 v8, 0x1

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-wide v4, p4

    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    move/from16 v7, p8

    .line 10
    .line 11
    move-object/from16 v9, p9

    .line 12
    .line 13
    move-object/from16 v10, p10

    .line 14
    .line 15
    invoke-direct/range {v0 .. v10}, Lcom/voxdon/xplorer/file/r;->K0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;ZZLax/u3/c;Lax/g3/i;)V

    .line 16
    .line 17
    .line 18
    return-void
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
    .line 42
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
.end method

.method declared-synchronized m(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    .registers 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v7, p3

    .line 8
    .line 9
    move-object/from16 v8, p5

    .line 10
    .line 11
    monitor-enter p0

    .line 12
    if-nez p4, :cond_15

    .line 13
    .line 14
    :try_start_d
    invoke-virtual/range {p0 .. p6}, Lcom/voxdon/xplorer/file/m;->o(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    :try_end_10
    .catchall {:try_start_d .. :try_end_10} :catchall_12

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_12
    move-exception v0

    .line 20
    goto/16 :goto_15e

    .line 21
    .line 22
    :cond_15
    :try_start_15
    invoke-direct {v1, v2}, Lcom/voxdon/xplorer/file/r;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    invoke-static {v0}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v12, 0x0

    .line 32
    if-eqz v3, :cond_49

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "name contains \'"

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, "\' and trashed = false"

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/file/r;->G0(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/16 p4, 0x1

    .line 65
    .line 66
    goto/16 :goto_149

    .line 67
    .line 68
    :catch_43
    move-exception v0

    .line 69
    goto/16 :goto_157

    .line 70
    .line 71
    :catch_46
    move-exception v0

    .line 72
    goto/16 :goto_157

    .line 73
    .line 74
    :cond_49
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3, v0}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v3, :cond_71

    .line 83
    .line 84
    new-instance v4, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 87
    .line 88
    .line 89
    const-string v3, "Search"

    .line 90
    .line 91
    invoke-static {v3}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v4, v3}, Lax/c3/q;->g(Ljava/util/List;Lax/c3/q;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v3, v2, v7, v12}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-eqz v2, :cond_71

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_71

    .line 110
    .line 111
    invoke-interface {v8, v2, v12}, Lax/g3/h;->Y(Ljava/util/List;Z)V

    .line 112
    .line 113
    .line 114
    :cond_71
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-interface {v0}, Lax/c3/b;->t()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v0, Lax/c3/E;

    .line 123
    .line 124
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-direct {v1}, Lcom/voxdon/xplorer/file/r;->p0()Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-direct {v1, v3, v6}, Lcom/voxdon/xplorer/file/r;->w0(Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/HashSet;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v13, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const/4 v2, 0x1

    .line 146
    const/4 v14, 0x0

    .line 147
    :goto_92
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v15
    :try_end_96
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_96} :catch_46
    .catch Ljava/lang/SecurityException; {:try_start_15 .. :try_end_96} :catch_43
    .catchall {:try_start_15 .. :try_end_96} :catchall_12

    .line 151
    if-eqz v15, :cond_10e

    .line 152
    .line 153
    :try_start_98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    check-cast v15, Ljava/lang/String;

    .line 158
    .line 159
    if-eqz v2, :cond_a4

    .line 160
    .line 161
    const/16 p4, 0x1

    .line 162
    .line 163
    const/4 v2, 0x0

    .line 164
    goto :goto_ab

    .line 165
    :cond_a4
    const/16 p4, 0x1

    .line 166
    .line 167
    const-string v11, " or "

    .line 168
    .line 169
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    :goto_ab
    const-string v11, "\'"

    .line 173
    .line 174
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v11, "\' in parents"

    .line 181
    .line 182
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    add-int/lit8 v14, v14, 0x1

    .line 186
    .line 187
    const/16 v11, 0x12c

    .line 188
    .line 189
    if-lt v14, v11, :cond_10b

    .line 190
    .line 191
    new-instance v2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v11, "name contains \'"

    .line 197
    .line 198
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v11, "\' and ("

    .line 205
    .line 206
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v11, ") and trashed = false"

    .line 217
    .line 218
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    new-instance v11, Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/file/r;->G0(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 235
    .line 236
    .line 237
    invoke-static {v11, v10, v7, v12}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    if-eqz v1, :cond_106

    .line 242
    .line 243
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-nez v2, :cond_106

    .line 248
    .line 249
    invoke-interface {v8, v1, v12}, Lax/g3/h;->Y(Ljava/util/List;Z)V

    .line 250
    .line 251
    .line 252
    goto :goto_106

    .line 253
    :catchall_fc
    move-exception v0

    .line 254
    move-object/from16 v1, p0

    .line 255
    .line 256
    goto :goto_15e

    .line 257
    :catch_100
    move-exception v0

    .line 258
    :goto_101
    move-object/from16 v1, p0

    .line 259
    .line 260
    goto :goto_157

    .line 261
    :catch_104
    move-exception v0

    .line 262
    goto :goto_101

    .line 263
    :cond_106
    :goto_106
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 264
    .line 265
    .line 266
    const/4 v2, 0x1

    .line 267
    const/4 v14, 0x0

    .line 268
    :cond_10b
    move-object/from16 v1, p0

    .line 269
    .line 270
    goto :goto_92

    .line 271
    :cond_10e
    const/16 p4, 0x1

    .line 272
    .line 273
    new-instance v0, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-lez v1, :cond_147

    .line 283
    .line 284
    new-instance v1, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 287
    .line 288
    .line 289
    const-string v2, "name contains \'"

    .line 290
    .line 291
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v2, "\' and ("

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    const-string v2, ") and trashed = false"

    .line 310
    .line 311
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v2
    :try_end_13d
    .catch Ljava/io/IOException; {:try_start_98 .. :try_end_13d} :catch_104
    .catch Ljava/lang/SecurityException; {:try_start_98 .. :try_end_13d} :catch_100
    .catchall {:try_start_98 .. :try_end_13d} :catchall_fc

    .line 318
    move-object/from16 v1, p0

    .line 319
    .line 320
    :try_start_13f
    invoke-virtual/range {v1 .. v6}, Lcom/voxdon/xplorer/file/r;->G0(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_146
    .catch Ljava/io/IOException; {:try_start_13f .. :try_end_146} :catch_46
    .catch Ljava/lang/SecurityException; {:try_start_13f .. :try_end_146} :catch_43
    .catchall {:try_start_13f .. :try_end_146} :catchall_12

    .line 325
    .line 326
    .line 327
    goto :goto_149

    .line 328
    :cond_147
    move-object/from16 v1, p0

    .line 329
    .line 330
    :goto_149
    if-nez v0, :cond_14d

    .line 331
    .line 332
    monitor-exit p0

    .line 333
    return-void

    .line 334
    :cond_14d
    :try_start_14d
    invoke-static {v0, v10, v7, v12}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    const/4 v2, 0x1

    .line 339
    invoke-interface {v8, v0, v2}, Lax/g3/h;->Y(Ljava/util/List;Z)V
    :try_end_155
    .catch Ljava/io/IOException; {:try_start_14d .. :try_end_155} :catch_46
    .catch Ljava/lang/SecurityException; {:try_start_14d .. :try_end_155} :catch_43
    .catchall {:try_start_14d .. :try_end_155} :catchall_12

    .line 340
    .line 341
    .line 342
    monitor-exit p0

    .line 343
    return-void

    .line 344
    :goto_157
    :try_start_157
    const-string v2, "do search"

    .line 345
    .line 346
    invoke-direct {v1, v2, v0}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    throw v0

    .line 351
    :goto_15e
    monitor-exit p0
    :try_end_15f
    .catchall {:try_start_157 .. :try_end_15f} :catchall_12

    .line 352
    throw v0
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method public n(Lcom/voxdon/xplorer/file/n;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/c3/E;

    .line 2
    .line 3
    if-eqz v0, :cond_56

    .line 4
    .line 5
    :try_start_4
    invoke-interface {p1}, Lax/c3/b;->l()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_4f

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lax/c3/E;

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/c3/E;->g0()Lax/p7/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_4f

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/p7/c;->x()Lax/p7/c$f;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_4f

    .line 25
    .line 26
    invoke-virtual {v0}, Lax/p7/c;->x()Lax/p7/c$f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lax/p7/c$f;->n()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 35
    .line 36
    invoke-virtual {v1}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, v0}, Lax/o7/a$c;->d(Ljava/lang/String;)Lax/o7/a$c$c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "size"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lax/o7/a$c$c;->H(Ljava/lang/String;)Lax/o7/a$c$c;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lax/p7/c;

    .line 55
    .line 56
    if-eqz v0, :cond_4f

    .line 57
    .line 58
    invoke-virtual {v0}, Lax/p7/c;->y()Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_4f

    .line 63
    .line 64
    check-cast p1, Lax/c3/E;

    .line 65
    .line 66
    invoke-virtual {v0}, Lax/p7/c;->y()Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    invoke-virtual {p1, v0, v1}, Lax/c3/E;->l0(J)V
    :try_end_4c
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4c} :catch_4d

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catch_4d
    move-exception p1

    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    return-void

    .line 81
    :goto_50
    new-instance v0, Lax/b3/j;

    .line 82
    .line 83
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_56
    new-instance v0, Lax/b3/j;

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v2, "Invalid File Type :"

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v0
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method public x0(Lax/c3/E;)Ljava/util/List;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c3/E;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/r;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_e2

    .line 15
    .line 16
    :try_start_f
    iget-object v2, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 17
    .line 18
    invoke-virtual {v2}, Lax/o7/a;->n()Lax/o7/a$c;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lax/o7/a$c;->e()Lax/o7/a$c$d;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "nextPageToken, files(kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed)"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Lax/o7/a$c$d;->I(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v4, "\'"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, "\' in parents and trashed = false"

    .line 46
    .line 47
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v2, v1}, Lax/o7/a$c$d;->K(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_39
    invoke-virtual {v1}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lax/p7/d;

    .line 63
    .line 64
    invoke-virtual {v2}, Lax/p7/d;->n()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    :goto_47
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_8c

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    move-object v9, v4

    .line 83
    check-cast v9, Lax/p7/c;

    .line 84
    .line 85
    new-instance v5, Lax/c3/E;

    .line 86
    .line 87
    invoke-virtual {p1}, Lax/c3/E;->t()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {v9}, Lcom/voxdon/xplorer/file/r;->J0(Lax/p7/c;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {v4, v6}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v10
    :try_end_6a
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_6a} :catch_8a
    .catch Ljava/lang/SecurityException; {:try_start_f .. :try_end_6a} :catch_87
    .catch Ljava/lang/IllegalArgumentException; {:try_start_f .. :try_end_6a} :catch_85
    .catch Ljava/lang/NullPointerException; {:try_start_f .. :try_end_6a} :catch_82
    .catch Ljava/lang/OutOfMemoryError; {:try_start_f .. :try_end_6a} :catch_7f

    .line 107
    move-object v6, p0

    .line 108
    :try_start_6b
    invoke-direct/range {v5 .. v10}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_47

    .line 115
    :catch_72
    move-exception v0

    .line 116
    :goto_73
    move-object p1, v0

    .line 117
    goto :goto_a5

    .line 118
    :catch_75
    move-exception v0

    .line 119
    :goto_76
    move-object p1, v0

    .line 120
    goto :goto_c0

    .line 121
    :catch_78
    move-exception v0

    .line 122
    goto :goto_76

    .line 123
    :catch_7a
    move-exception v0

    .line 124
    :goto_7b
    move-object p1, v0

    .line 125
    goto :goto_db

    .line 126
    :catch_7d
    move-exception v0

    .line 127
    goto :goto_7b

    .line 128
    :catch_7f
    move-exception v0

    .line 129
    move-object v6, p0

    .line 130
    goto :goto_73

    .line 131
    :catch_82
    move-exception v0

    .line 132
    :goto_83
    move-object v6, p0

    .line 133
    goto :goto_76

    .line 134
    :catch_85
    move-exception v0

    .line 135
    goto :goto_83

    .line 136
    :catch_87
    move-exception v0

    .line 137
    :goto_88
    move-object v6, p0

    .line 138
    goto :goto_7b

    .line 139
    :catch_8a
    move-exception v0

    .line 140
    goto :goto_88

    .line 141
    :cond_8c
    move-object v6, p0

    .line 142
    invoke-virtual {v2}, Lax/p7/d;->o()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v1, v2}, Lax/o7/a$c$d;->J(Ljava/lang/String;)Lax/o7/a$c$d;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Lax/o7/a$c$d;->G()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    if-eqz v2, :cond_e3

    .line 154
    .line 155
    invoke-virtual {v1}, Lax/o7/a$c$d;->G()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result v2
    :try_end_a2
    .catch Ljava/io/IOException; {:try_start_6b .. :try_end_a2} :catch_7d
    .catch Ljava/lang/SecurityException; {:try_start_6b .. :try_end_a2} :catch_7a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6b .. :try_end_a2} :catch_78
    .catch Ljava/lang/NullPointerException; {:try_start_6b .. :try_end_a2} :catch_75
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6b .. :try_end_a2} :catch_72

    .line 163
    if-gtz v2, :cond_39

    .line 164
    .line 165
    goto :goto_e3

    .line 166
    :goto_a5
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const-string v1, "GoogleDrive: getChildFileList : OOM"

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 185
    .line 186
    .line 187
    new-instance v0, Lax/b3/j;

    .line 188
    .line 189
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :goto_c0
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const-string v1, "GoogleDrive: getChildFileList"

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lax/b3/j;

    .line 215
    .line 216
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    throw v0

    .line 220
    :goto_db
    const-string v0, "GD getChildList"

    .line 221
    .line 222
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    throw p1

    .line 227
    :cond_e2
    move-object v6, p0

    .line 228
    :cond_e3
    :goto_e3
    return-object v0
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public y()Lax/c3/k0;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o7/a;->m()Lax/o7/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/o7/a$a;->a()Lax/o7/a$a$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "storageQuota"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/o7/a$a$a;->H(Ljava/lang/String;)Lax/o7/a$a$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/g7/b;->execute()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/p7/a;

    .line 22
    .line 23
    if-eqz v0, :cond_63

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/p7/a;->n()Lax/p7/a$b;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_63

    .line 30
    .line 31
    invoke-virtual {v0}, Lax/p7/a;->n()Lax/p7/a$b;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lax/p7/a$b;->n()Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0}, Lax/p7/a;->n()Lax/p7/a$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lax/p7/a$b;->o()Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v1, :cond_44

    .line 48
    .line 49
    if-eqz v0, :cond_44

    .line 50
    .line 51
    new-instance v2, Lax/c3/k0;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    invoke-direct {v2, v3, v4, v0, v1}, Lax/c3/k0;-><init>(JJ)V

    .line 62
    .line 63
    .line 64
    return-object v2

    .line 65
    :catch_40
    move-exception v0

    .line 66
    goto :goto_6b

    .line 67
    :catch_42
    move-exception v0

    .line 68
    goto :goto_6b

    .line 69
    :cond_44
    new-instance v2, Lax/b3/j;

    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v4, "no total :"

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ","

    .line 85
    .line 86
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {v2, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :cond_63
    new-instance v0, Lax/b3/j;

    .line 101
    .line 102
    const-string v1, "No storage Quota"

    .line 103
    .line 104
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v0
    :try_end_6b
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_6b} :catch_42
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_6b} :catch_40

    .line 108
    :goto_6b
    const-string v1, "GD getStorageSpace"

    .line 109
    .line 110
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    throw v0
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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

.method public z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v0, "\'"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->h:Lax/o7/a;

    .line 4
    .line 5
    if-eqz v1, :cond_17b

    .line 6
    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_17

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_17
    sget-object v1, Lax/c3/d0;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_25

    .line 31
    .line 32
    new-instance v0, Lax/c3/E;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_25
    const-string v1, "/.hidden-system-folder"

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_32

    .line 45
    .line 46
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/r;->t0()Lax/c3/E;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_32
    :try_start_32
    invoke-static {p1}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/r;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lax/c3/E;

    .line 60
    .line 61
    invoke-static {p1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/file/r;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v1}, Lax/c3/E;->n()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_14d

    .line 74
    .line 75
    invoke-virtual {v1}, Lax/c3/E;->isDirectory()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_14d

    .line 80
    .line 81
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    new-instance v5, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v6, "\' in parents and name = \'"

    .line 97
    .line 98
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v3, "\' and trashed = false"

    .line 105
    .line 106
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-direct {p0, v3}, Lcom/voxdon/xplorer/file/r;->H0(Ljava/lang/String;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    if-eqz v3, :cond_c3

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-lez v5, :cond_c3

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    move-object v6, v0

    .line 131
    check-cast v6, Lax/p7/c;

    .line 132
    .line 133
    new-instance v2, Lax/c3/E;

    .line 134
    .line 135
    invoke-virtual {v1}, Lax/c3/E;->t()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5
    :try_end_8e
    .catch Ljava/lang/NullPointerException; {:try_start_32 .. :try_end_8e} :catch_c0
    .catch Ljava/io/IOException; {:try_start_32 .. :try_end_8e} :catch_be
    .catch Ljava/lang/SecurityException; {:try_start_32 .. :try_end_8e} :catch_bc
    .catch Ljava/lang/IllegalArgumentException; {:try_start_32 .. :try_end_8e} :catch_b9

    .line 143
    move-object v3, p0

    .line 144
    move-object v7, p1

    .line 145
    :try_start_90
    invoke-direct/range {v2 .. v7}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v2}, Lax/c3/b;->isDirectory()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_b8

    .line 153
    .line 154
    iget-object p1, v3, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 155
    .line 156
    invoke-virtual {p1, v7, v2}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    iget-object p1, v3, Lcom/voxdon/xplorer/file/r;->l:Lj$/util/concurrent/ConcurrentHashMap;

    .line 160
    .line 161
    invoke-interface {v2}, Lax/c3/b;->t()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {p1, v0, v1}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    return-object v2

    .line 173
    :catch_ac
    move-exception v0

    .line 174
    :goto_ad
    move-object p1, v0

    .line 175
    goto/16 :goto_155

    .line 176
    .line 177
    :catch_b0
    move-exception v0

    .line 178
    goto :goto_ad

    .line 179
    :catch_b2
    move-exception v0

    .line 180
    goto :goto_ad

    .line 181
    :catch_b4
    move-exception v0

    .line 182
    :goto_b5
    move-object p1, v0

    .line 183
    goto/16 :goto_15f

    .line 184
    .line 185
    :cond_b8
    return-object v2

    .line 186
    :catch_b9
    move-exception v0

    .line 187
    :goto_ba
    move-object v3, p0

    .line 188
    goto :goto_ad

    .line 189
    :catch_bc
    move-exception v0

    .line 190
    goto :goto_ba

    .line 191
    :catch_be
    move-exception v0

    .line 192
    goto :goto_ba

    .line 193
    :catch_c0
    move-exception v0

    .line 194
    move-object v3, p0

    .line 195
    goto :goto_b5

    .line 196
    :cond_c3
    move-object v3, p0

    .line 197
    move-object v7, p1

    .line 198
    const-string p1, "_"

    .line 199
    .line 200
    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_13f

    .line 205
    .line 206
    new-instance p1, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v0, "\' in parents and trashed = false"

    .line 218
    .line 219
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/r;->H0(Ljava/lang/String;)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    if-eqz p1, :cond_13f

    .line 231
    .line 232
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-lez v0, :cond_13f

    .line 237
    .line 238
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    :cond_f1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_13f

    .line 247
    .line 248
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    move-object v11, v0

    .line 253
    check-cast v11, Lax/p7/c;

    .line 254
    .line 255
    invoke-static {v11}, Lcom/voxdon/xplorer/file/r;->J0(Lax/p7/c;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_f1

    .line 264
    .line 265
    move-object v12, v7

    .line 266
    new-instance v7, Lax/c3/E;

    .line 267
    .line 268
    invoke-virtual {v1}, Lax/c3/E;->t()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v10
    :try_end_113
    .catch Ljava/lang/NullPointerException; {:try_start_90 .. :try_end_113} :catch_b4
    .catch Ljava/io/IOException; {:try_start_90 .. :try_end_113} :catch_b2
    .catch Ljava/lang/SecurityException; {:try_start_90 .. :try_end_113} :catch_b0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_90 .. :try_end_113} :catch_ac

    .line 276
    move-object v8, v3

    .line 277
    :try_start_114
    invoke-direct/range {v7 .. v12}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V
    :try_end_117
    .catch Ljava/lang/NullPointerException; {:try_start_114 .. :try_end_117} :catch_13b
    .catch Ljava/io/IOException; {:try_start_114 .. :try_end_117} :catch_139
    .catch Ljava/lang/SecurityException; {:try_start_114 .. :try_end_117} :catch_137
    .catch Ljava/lang/IllegalArgumentException; {:try_start_114 .. :try_end_117} :catch_133

    .line 278
    .line 279
    .line 280
    move-object p1, v7

    .line 281
    move-object v3, v8

    .line 282
    move-object v7, v12

    .line 283
    :try_start_11a
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_132

    .line 288
    .line 289
    iget-object v0, v3, Lcom/voxdon/xplorer/file/r;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 290
    .line 291
    invoke-virtual {v0, v7, p1}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    iget-object v0, v3, Lcom/voxdon/xplorer/file/r;->l:Lj$/util/concurrent/ConcurrentHashMap;

    .line 295
    .line 296
    invoke-interface {p1}, Lax/c3/b;->t()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {v0, v1, v2}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    :cond_132
    return-object p1

    .line 308
    :catch_133
    move-exception v0

    .line 309
    :goto_134
    move-object v3, v8

    .line 310
    goto/16 :goto_ad

    .line 311
    .line 312
    :catch_137
    move-exception v0

    .line 313
    goto :goto_134

    .line 314
    :catch_139
    move-exception v0

    .line 315
    goto :goto_134

    .line 316
    :catch_13b
    move-exception v0

    .line 317
    move-object v3, v8

    .line 318
    goto/16 :goto_b5

    .line 319
    .line 320
    :cond_13f
    new-instance p1, Lax/c3/E;

    .line 321
    .line 322
    invoke-virtual {v1}, Lax/c3/E;->t()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/file/r;->y0(Lax/c3/E;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-direct {p1, p0, v0, v1, v7}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    return-object p1

    .line 334
    :cond_14d
    move-object v3, p0

    .line 335
    move-object v7, p1

    .line 336
    new-instance p1, Lax/c3/E;

    .line 337
    .line 338
    invoke-direct {p1, p0, v7}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;)V
    :try_end_154
    .catch Ljava/lang/NullPointerException; {:try_start_11a .. :try_end_154} :catch_b4
    .catch Ljava/io/IOException; {:try_start_11a .. :try_end_154} :catch_b2
    .catch Ljava/lang/SecurityException; {:try_start_11a .. :try_end_154} :catch_b0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_11a .. :try_end_154} :catch_ac

    .line 339
    .line 340
    .line 341
    return-object p1

    .line 342
    :goto_155
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 343
    .line 344
    .line 345
    const-string v0, "GoogleDrive getFileInfo"

    .line 346
    .line 347
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    throw p1

    .line 352
    :goto_15f
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    const-string v1, "GoogleDrive queryFiles null"

    .line 361
    .line 362
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 371
    .line 372
    .line 373
    const-string v0, "GoogleDrive getFileInfo null"

    .line 374
    .line 375
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/r;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    throw p1

    .line 380
    :cond_17b
    move-object v3, p0

    .line 381
    new-instance p1, Lax/b3/h;

    .line 382
    .line 383
    const-string v0, "Service is not connected!"

    .line 384
    .line 385
    invoke-direct {p1, v0}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    throw p1
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method
