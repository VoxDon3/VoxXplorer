.class public Lax/R4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/R4/h$b;,
        Lax/R4/h$c;
    }
.end annotation


# static fields
.field private static final m:Ljava/lang/String;

.field private static final n:[Ljava/lang/String;


# instance fields
.field private a:Lax/Q4/b;

.field private b:Lax/R4/h$b;

.field private c:Landroid/content/res/Resources;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end field

.field private g:I

.field private h:I

.field private i:Landroid/content/Context;

.field private j:I

.field private k:I

.field private l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const-class v0, Lax/R4/h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S4/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/R4/h;->m:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "android.media.metadata.ALBUM_ART"

    .line 10
    .line 11
    const-string v1, "android.media.metadata.DISPLAY_ICON"

    .line 12
    .line 13
    const-string v2, "android.media.metadata.ART"

    .line 14
    .line 15
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lax/R4/h;->n:[Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lax/Q4/b;Landroid/content/res/Resources;Lax/R4/h$b;)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lax/R4/h;->j:I

    .line 6
    .line 7
    iput-object p1, p0, Lax/R4/h;->i:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lax/R4/h;->a:Lax/Q4/b;

    .line 10
    .line 11
    iput-object p4, p0, Lax/R4/h;->b:Lax/R4/h$b;

    .line 12
    .line 13
    iput-object p3, p0, Lax/R4/h;->c:Landroid/content/res/Resources;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lj$/util/DesugarCollections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lj$/util/DesugarCollections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lax/R4/h;->e:Ljava/util/List;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput p1, p0, Lax/R4/h;->g:I

    .line 39
    .line 40
    return-void
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
.end method

.method private A(Ljava/lang/String;)V
    .registers 4

    .line 1
    iget v0, p0, Lax/R4/h;->k:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_a

    .line 5
    .line 6
    iget-object v0, p0, Lax/R4/h;->e:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 9
    .line 10
    goto :goto_e

    .line 11
    :cond_a
    iget-object v0, p0, Lax/R4/h;->f:Ljava/util/List;

    .line 12
    .line 13
    iput-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 14
    .line 15
    :goto_e
    iget-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 16
    .line 17
    if-eqz v0, :cond_19

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Lax/R4/h;->j:I

    .line 24
    .line 25
    goto :goto_1d

    .line 26
    :cond_19
    const/16 v0, -0x64

    .line 27
    .line 28
    iput v0, p0, Lax/R4/h;->j:I

    .line 29
    .line 30
    :goto_1d
    const/4 v0, 0x0

    .line 31
    if-eqz p1, :cond_29

    .line 32
    .line 33
    iget-object v1, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {v1, p1}, Lax/S4/d;->c(Ljava/lang/Iterable;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p0, Lax/R4/h;->h:I

    .line 40
    .line 41
    goto :goto_2a

    .line 42
    :cond_29
    const/4 p1, 0x0

    .line 43
    :goto_2a
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lax/R4/h;->g:I

    .line 48
    .line 49
    iget-object p1, p0, Lax/R4/h;->b:Lax/R4/h$b;

    .line 50
    .line 51
    iget-object v0, p0, Lax/R4/h;->l:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {p1, v0, v1}, Lax/R4/h$b;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic a(Lax/R4/h;)Landroid/content/Context;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/R4/h;->i:Landroid/content/Context;

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

.method static synthetic b(Lax/R4/h;)Lax/Q4/b;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/R4/h;->a:Lax/Q4/b;

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

.method static synthetic c(Lax/R4/h;)Lax/R4/h$b;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/R4/h;->b:Lax/R4/h$b;

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

.method static synthetic d(Lax/R4/h;Landroid/graphics/Bitmap;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/R4/h;->m(Landroid/graphics/Bitmap;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private e(Ljava/lang/String;Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;
    .registers 10

    .line 1
    invoke-virtual {p2}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move-object v3, v2

    .line 15
    :cond_e
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_35

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    instance-of v6, v5, Landroid/graphics/Bitmap;

    .line 32
    .line 33
    if-eqz v6, :cond_e

    .line 34
    .line 35
    check-cast v5, Landroid/graphics/Bitmap;

    .line 36
    .line 37
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_e

    .line 42
    .line 43
    if-nez v3, :cond_31

    .line 44
    .line 45
    new-instance v3, Lax/B/b;

    .line 46
    .line 47
    invoke-direct {v3}, Lax/B/b;-><init>()V

    .line 48
    .line 49
    .line 50
    :cond_31
    invoke-virtual {v3, v4}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_e

    .line 54
    :cond_35
    invoke-virtual {p2}, Landroid/support/v4/media/MediaMetadataCompat;->g()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    instance-of v0, v0, Landroid/media/MediaMetadata;

    .line 59
    .line 60
    if-eqz v0, :cond_48

    .line 61
    .line 62
    invoke-virtual {p2}, Landroid/support/v4/media/MediaMetadataCompat;->g()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Landroid/media/MediaMetadata;

    .line 67
    .line 68
    invoke-direct {p0, v0}, Lax/R4/h;->l(Landroid/media/MediaMetadata;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    goto :goto_49

    .line 73
    :cond_48
    const/4 v0, 0x0

    .line 74
    :goto_49
    if-eqz v3, :cond_51

    .line 75
    .line 76
    invoke-virtual {v3}, Lax/B/b;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_53

    .line 81
    .line 82
    :cond_51
    if-eqz v0, :cond_77

    .line 83
    .line 84
    :cond_53
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 85
    .line 86
    invoke-direct {v0, p2}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 87
    .line 88
    .line 89
    if-eqz v3, :cond_6e

    .line 90
    .line 91
    invoke-virtual {v3}, Lax/B/b;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    :goto_5e
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_6e

    .line 100
    .line 101
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 108
    .line 109
    .line 110
    goto :goto_5e

    .line 111
    :cond_6e
    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    iget-object v0, p0, Lax/R4/h;->a:Lax/Q4/b;

    .line 116
    .line 117
    invoke-virtual {v0, p1, p2}, Lax/Q4/b;->s(Ljava/lang/String;Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 118
    .line 119
    .line 120
    :cond_77
    return-object p2
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

.method private k(Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1e

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_1e

    .line 18
    :cond_11
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lax/S4/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1e
    :goto_1e
    const/4 p1, 0x0

    .line 32
    return-object p1
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

.method private l(Landroid/media/MediaMetadata;)Z
    .registers 8

    .line 1
    sget-object v0, Lax/R4/h;->n:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_5
    if-ge v3, v1, :cond_20

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {p1, v4}, Landroid/media/MediaMetadata;->containsKey(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    if-eqz v5, :cond_1d

    .line 15
    .line 16
    invoke-virtual {p1, v4}, Landroid/media/MediaMetadata;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_1d

    .line 21
    .line 22
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1d

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1d
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_5

    .line 33
    :cond_20
    return v2
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

.method private m(Landroid/graphics/Bitmap;)Z
    .registers 3

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_10

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-lez p1, :cond_10

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_10
    const/4 p1, 0x0

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private r(I)V
    .registers 3

    .line 1
    if-ltz p1, :cond_11

    .line 2
    .line 3
    iget-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_11

    .line 10
    .line 11
    iput p1, p0, Lax/R4/h;->g:I

    .line 12
    .line 13
    iget-object v0, p0, Lax/R4/h;->b:Lax/R4/h$b;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lax/R4/h$b;->b(I)V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public f()I
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/R4/h;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    iget v0, p0, Lax/R4/h;->g:I

    .line 10
    .line 11
    iget v1, p0, Lax/R4/h;->h:I

    .line 12
    .line 13
    if-lt v0, v1, :cond_12

    .line 14
    .line 15
    :goto_e
    sub-int/2addr v0, v1

    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_12
    iget-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget v1, p0, Lax/R4/h;->g:I

    .line 26
    .line 27
    add-int/2addr v0, v1

    .line 28
    iget v1, p0, Lax/R4/h;->h:I

    .line 29
    .line 30
    goto :goto_e
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
.end method

.method public g()I
    .registers 2

    .line 1
    iget v0, p0, Lax/R4/h;->g:I

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

.method public h()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/R4/h;->i()Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_8
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i()Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
    .registers 3

    .line 1
    iget v0, p0, Lax/R4/h;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lax/S4/d;->e(ILjava/util/List;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_c
    iget-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 14
    .line 15
    iget v1, p0, Lax/R4/h;->g:I

    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 22
    .line 23
    return-object v0
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
.end method

.method public j()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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

.method public n()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public o(Ljava/lang/String;)Z
    .registers 3

    .line 1
    invoke-static {p1}, Lax/S4/c;->c(Ljava/lang/String;)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lax/R4/h;->i()Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_c
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lax/S4/c;->c(Ljava/lang/String;)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
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

.method public p()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/R4/h;->i:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/example/android/uamp/MusicService;->L(Landroid/content/Context;)V

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
.end method

.method protected q(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lax/R4/h;->f:Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lax/R4/h;->e:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/R4/h;->l:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {p0, p3}, Lax/R4/h;->A(Ljava/lang/String;)V

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
.end method

.method public s(J)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lax/S4/d;->b(Ljava/lang/Iterable;J)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-direct {p0, p1}, Lax/R4/h;->r(I)V

    .line 8
    .line 9
    .line 10
    if-ltz p1, :cond_d

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_d
    const/4 p1, 0x0

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public t(Ljava/lang/String;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/S4/d;->c(Ljava/lang/Iterable;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-direct {p0, p1}, Lax/R4/h;->r(I)V

    .line 8
    .line 9
    .line 10
    if-ltz p1, :cond_d

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_d
    const/4 p1, 0x0

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public u(Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/R4/h;->a:Lax/Q4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/Q4/b;->f()Ljava/lang/Iterable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lax/S4/d;->a(Ljava/lang/Iterable;[Ljava/lang/String;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "musics"

    .line 15
    .line 16
    invoke-virtual {p0, v1, v0, p1}, Lax/R4/h;->q(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lax/R4/h;->y()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public v(Ljava/lang/String;)V
    .registers 6

    .line 1
    sget-object v0, Lax/R4/h;->m:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "setQueueFromMusic"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object p1, v1, v2

    .line 13
    .line 14
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lax/R4/h;->o(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1a

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lax/R4/h;->t(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :cond_1a
    if-nez v3, :cond_27

    .line 28
    .line 29
    iget-object v0, p0, Lax/R4/h;->a:Lax/Q4/b;

    .line 30
    .line 31
    invoke-static {p1, v0}, Lax/S4/d;->d(Ljava/lang/String;Lax/Q4/b;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "musics"

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, p1}, Lax/R4/h;->q(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_27
    invoke-virtual {p0}, Lax/R4/h;->y()V

    .line 41
    .line 42
    .line 43
    return-void
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

.method public w(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/R4/h;->k:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/R4/h;->h()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lax/R4/h;->A(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public x(I)Z
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lax/R4/h;->g:I

    .line 3
    .line 4
    add-int/2addr v1, p1

    .line 5
    invoke-virtual {p0}, Lax/R4/h;->j()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_40

    .line 11
    .line 12
    iget-object p1, p0, Lax/R4/h;->i:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {p1}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "MUSICPLAYER-QUEUESIZE0"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lax/Ha/b;->n(Ljava/lang/String;)Lax/Ha/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "mCurrentIndex="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lax/R4/h;->g:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ",queueset="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lax/R4/h;->j:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 62
    .line 63
    .line 64
    return v3

    .line 65
    :cond_40
    if-gez p1, :cond_49

    .line 66
    .line 67
    iget v2, p0, Lax/R4/h;->h:I

    .line 68
    .line 69
    iget v4, p0, Lax/R4/h;->g:I

    .line 70
    .line 71
    if-ne v2, v4, :cond_49

    .line 72
    .line 73
    goto :goto_5c

    .line 74
    :cond_49
    if-gez v1, :cond_54

    .line 75
    .line 76
    iget-object v1, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/lit8 v4, v1, -0x1

    .line 83
    .line 84
    goto :goto_5c

    .line 85
    :cond_54
    iget-object v2, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    rem-int v4, v1, v2

    .line 92
    .line 93
    :goto_5c
    iget-object v1, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {v4, v1}, Lax/S4/d;->e(ILjava/util/List;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_97

    .line 100
    .line 101
    sget-object v1, Lax/R4/h;->m:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget v2, p0, Lax/R4/h;->g:I

    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    iget-object v4, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    const/4 v5, 0x6

    .line 124
    new-array v5, v5, [Ljava/lang/Object;

    .line 125
    .line 126
    const-string v6, "Cannot increment queue index by "

    .line 127
    .line 128
    aput-object v6, v5, v3

    .line 129
    .line 130
    aput-object p1, v5, v0

    .line 131
    .line 132
    const-string p1, ". Current="

    .line 133
    .line 134
    const/4 v0, 0x2

    .line 135
    aput-object p1, v5, v0

    .line 136
    .line 137
    const/4 p1, 0x3

    .line 138
    aput-object v2, v5, p1

    .line 139
    .line 140
    const-string p1, " queue length="

    .line 141
    .line 142
    const/4 v0, 0x4

    .line 143
    aput-object p1, v5, v0

    .line 144
    .line 145
    const/4 p1, 0x5

    .line 146
    aput-object v4, v5, p1

    .line 147
    .line 148
    invoke-static {v1, v5}, Lax/S4/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return v3

    .line 152
    :cond_97
    iput v4, p0, Lax/R4/h;->g:I

    .line 153
    .line 154
    iget-object p1, p0, Lax/R4/h;->i:Landroid/content/Context;

    .line 155
    .line 156
    iget-object v1, p0, Lax/R4/h;->a:Lax/Q4/b;

    .line 157
    .line 158
    invoke-virtual {v1}, Lax/Q4/b;->d()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v2, p0, Lax/R4/h;->d:Ljava/util/List;

    .line 163
    .line 164
    iget v4, p0, Lax/R4/h;->g:I

    .line 165
    .line 166
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 171
    .line 172
    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {p1, v1, v2, v3}, Lcom/example/android/uamp/MusicService;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    return v0
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
.end method

.method public y()V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/R4/h;->i()Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_c

    .line 6
    .line 7
    iget-object v0, p0, Lax/R4/h;->b:Lax/R4/h$b;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/R4/h$b;->a()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    invoke-direct {p0, v0}, Lax/R4/h;->k(Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lax/R4/h;->a:Lax/Q4/b;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lax/Q4/b;->e(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_65

    .line 24
    .line 25
    invoke-direct {p0, v0, v1}, Lax/R4/h;->e(Ljava/lang/String;Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Lax/R4/h;->a:Lax/Q4/b;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Lax/Q4/b;->n(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_31

    .line 36
    .line 37
    new-instance v2, Lax/R4/h$c;

    .line 38
    .line 39
    invoke-direct {v2, p0, v0}, Lax/R4/h$c;-><init>(Lax/R4/h;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sget-object v3, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    new-array v4, v4, [Ljava/lang/Void;

    .line 46
    .line 47
    invoke-virtual {v2, v3, v4}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 48
    .line 49
    .line 50
    :cond_31
    invoke-direct {p0, v0, v1}, Lax/R4/h;->e(Ljava/lang/String;Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, p0, Lax/R4/h;->b:Lax/R4/h$b;

    .line 55
    .line 56
    invoke-interface {v2, v1}, Lax/R4/h$b;->u(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Lax/P4/k;->b(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Landroid/support/v4/media/MediaDescriptionCompat;->c()Landroid/graphics/Bitmap;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-nez v2, :cond_64

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_64

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {}, Lax/P4/a;->i()Lax/P4/a;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget-object v3, p0, Lax/R4/h;->i:Landroid/content/Context;

    .line 88
    .line 89
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    new-instance v4, Lax/R4/h$a;

    .line 94
    .line 95
    invoke-direct {v4, p0, v0}, Lax/R4/h$a;-><init>(Lax/R4/h;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v3, v1, v4}, Lax/P4/a;->f(Landroid/content/Context;Ljava/lang/String;Lax/P4/a$a;)V

    .line 99
    .line 100
    .line 101
    :cond_64
    return-void

    .line 102
    :cond_65
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v3, "Invalid musicId "

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1
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

.method public z(Ljava/lang/String;J)V
    .registers 5

    .line 1
    invoke-static {p1}, Lax/S4/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_7

    .line 6
    .line 7
    goto :goto_29

    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/R4/h;->i()Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    goto :goto_29

    .line 15
    :cond_e
    invoke-direct {p0, v0}, Lax/R4/h;->k(Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_15

    .line 20
    .line 21
    goto :goto_29

    .line 22
    :cond_15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1c

    .line 27
    .line 28
    goto :goto_29

    .line 29
    :cond_1c
    iget-object p1, p0, Lax/R4/h;->a:Lax/Q4/b;

    .line 30
    .line 31
    invoke-virtual {p1, v0, p2, p3}, Lax/Q4/b;->t(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_29

    .line 36
    .line 37
    iget-object p2, p0, Lax/R4/h;->b:Lax/R4/h$b;

    .line 38
    .line 39
    invoke-interface {p2, p1}, Lax/R4/h$b;->u(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    :goto_29
    return-void
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
.end method
