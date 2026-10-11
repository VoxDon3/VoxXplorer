.class public abstract Lax/W2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/W2/j$d;,
        Lax/W2/j$e;,
        Lax/W2/j$c;,
        Lax/W2/j$f;
    }
.end annotation


# static fields
.field private static final v:Ljava/util/logging/Logger;


# instance fields
.field final a:Lax/W2/v;

.field final b:Lax/W2/h$a;

.field private c:Lcom/voxdon/xplorer/service/CommandService;

.field private d:Lax/W2/h$b;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/c3/K;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lax/W2/j$d;

.field private o:I

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/Thread;

.field private final s:Ljava/lang/Object;

.field private t:J

.field u:Lax/g3/i;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.CommandOperator"

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->b(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/W2/j;->v:Ljava/util/logging/Logger;

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

.method public constructor <init>(Lax/W2/h$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lax/W2/h$b;->q:Lax/W2/h$b;

    .line 5
    .line 6
    iput-object v0, p0, Lax/W2/j;->d:Lax/W2/h$b;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lax/W2/j;->e:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lax/W2/j;->f:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lax/W2/j;->g:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lax/W2/j;->h:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lax/W2/j;->i:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lax/W2/j;->j:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lax/W2/j;->k:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lax/W2/j;->l:Z

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lax/W2/j;->m:Ljava/util/ArrayList;

    .line 31
    .line 32
    sget-object v0, Lax/W2/j$d;->q:Lax/W2/j$d;

    .line 33
    .line 34
    iput-object v0, p0, Lax/W2/j;->n:Lax/W2/j$d;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/Object;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lax/W2/j;->s:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance v0, Lax/W2/j$b;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Lax/W2/j$b;-><init>(Lax/W2/j;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lax/W2/j;->u:Lax/g3/i;

    .line 49
    .line 50
    new-instance v0, Lax/W2/v;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lax/W2/v;-><init>(Lax/W2/j;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lax/W2/j;->a:Lax/W2/v;

    .line 56
    .line 57
    iput-object p1, p0, Lax/W2/j;->b:Lax/W2/h$a;

    .line 58
    .line 59
    return-void
    .line 60
    .line 61
.end method

.method private N(I)I
    .registers 2

    .line 1
    sparse-switch p1, :sswitch_data_4a

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :sswitch_5
    const p1, 0x7f130163

    .line 7
    .line 8
    .line 9
    return p1

    .line 10
    :sswitch_9
    const p1, 0x7f1301af

    .line 11
    .line 12
    .line 13
    return p1

    .line 14
    :sswitch_d
    const p1, 0x7f13015d

    .line 15
    .line 16
    .line 17
    return p1

    .line 18
    :sswitch_11
    const p1, 0x7f1302cb

    .line 19
    .line 20
    .line 21
    return p1

    .line 22
    :sswitch_15
    const p1, 0x7f1302cf

    .line 23
    .line 24
    .line 25
    return p1

    .line 26
    :sswitch_19
    const p1, 0x7f13014b

    .line 27
    .line 28
    .line 29
    return p1

    .line 30
    :sswitch_1d
    const p1, 0x7f13013d

    .line 31
    .line 32
    .line 33
    return p1

    .line 34
    :sswitch_21
    const p1, 0x7f13015c

    .line 35
    .line 36
    .line 37
    return p1

    .line 38
    :sswitch_25
    const p1, 0x7f13015b

    .line 39
    .line 40
    .line 41
    return p1

    .line 42
    :sswitch_29
    const p1, 0x7f130161

    .line 43
    .line 44
    .line 45
    return p1

    .line 46
    :sswitch_2d
    const p1, 0x7f130142

    .line 47
    .line 48
    .line 49
    return p1

    .line 50
    :sswitch_31
    const p1, 0x7f130162

    .line 51
    .line 52
    .line 53
    return p1

    .line 54
    :sswitch_35
    const p1, 0x7f13014c

    .line 55
    .line 56
    .line 57
    return p1

    .line 58
    :sswitch_39
    const p1, 0x7f130145

    .line 59
    .line 60
    .line 61
    return p1

    .line 62
    :sswitch_3d
    const p1, 0x7f130139

    .line 63
    .line 64
    .line 65
    return p1

    .line 66
    :sswitch_41
    const p1, 0x7f13013f

    .line 67
    .line 68
    .line 69
    return p1

    .line 70
    :sswitch_45
    const p1, 0x7f130150

    .line 71
    .line 72
    .line 73
    return p1

    .line 74
    nop

    .line 75
    :sswitch_data_4a
    .sparse-switch
        0xa -> :sswitch_45
        0x14 -> :sswitch_41
        0x1e -> :sswitch_3d
        0x28 -> :sswitch_39
        0x32 -> :sswitch_35
        0x3c -> :sswitch_31
        0x46 -> :sswitch_2d
        0x50 -> :sswitch_29
        0x5a -> :sswitch_25
        0x64 -> :sswitch_21
        0x6e -> :sswitch_1d
        0x78 -> :sswitch_19
        0x82 -> :sswitch_15
        0x8c -> :sswitch_11
        0x96 -> :sswitch_d
        0x9b -> :sswitch_9
        0xa0 -> :sswitch_5
    .end sparse-switch
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
.end method

.method private O(IZ)I
    .registers 5

    .line 1
    invoke-direct {p0, p1}, Lax/W2/j;->N(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Lax/X2/Q;->P()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1f

    .line 10
    .line 11
    if-eqz p2, :cond_1f

    .line 12
    .line 13
    const/16 p2, 0x1e

    .line 14
    .line 15
    if-eq p1, p2, :cond_1b

    .line 16
    .line 17
    const/16 p2, 0x64

    .line 18
    .line 19
    if-eq p1, p2, :cond_1b

    .line 20
    .line 21
    const/16 p2, 0x5a

    .line 22
    .line 23
    if-eq p1, p2, :cond_1b

    .line 24
    .line 25
    if-eqz v0, :cond_1b

    .line 26
    .line 27
    goto :goto_1f

    .line 28
    :cond_1b
    const p1, 0x7f130148

    .line 29
    .line 30
    .line 31
    return p1

    .line 32
    :cond_1f
    :goto_1f
    return v0
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

.method static synthetic a(Lax/W2/j;)Lax/W2/h$b;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/j;->d:Lax/W2/h$b;

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

.method static synthetic b(Lax/W2/j;)Lax/W2/j$d;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/j;->n:Lax/W2/j$d;

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

.method static synthetic c(Lax/W2/j;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/W2/j;->g:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic d(Lax/W2/j;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/W2/j;->f:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic e(Lax/W2/j;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/W2/j;->h:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic f(Lax/W2/j;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/j;->m()V

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

.method static synthetic g(Lax/W2/j;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/j;->n()V

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

.method private l(Lax/b3/j;)I
    .registers 3

    .line 1
    instance-of v0, p1, Lax/b3/s;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const/16 p1, 0xa

    .line 6
    .line 7
    return p1

    .line 8
    :cond_7
    instance-of v0, p1, Lax/b3/e;

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    const/16 p1, 0x1e

    .line 13
    .line 14
    return p1

    .line 15
    :cond_e
    instance-of v0, p1, Lax/b3/t;

    .line 16
    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    const/16 p1, 0x14

    .line 20
    .line 21
    return p1

    .line 22
    :cond_15
    instance-of v0, p1, Lax/b3/n;

    .line 23
    .line 24
    if-eqz v0, :cond_1c

    .line 25
    .line 26
    const/16 p1, 0x28

    .line 27
    .line 28
    return p1

    .line 29
    :cond_1c
    instance-of v0, p1, Lax/b3/o;

    .line 30
    .line 31
    if-eqz v0, :cond_23

    .line 32
    .line 33
    const/16 p1, 0x78

    .line 34
    .line 35
    return p1

    .line 36
    :cond_23
    instance-of v0, p1, Lax/b3/q;

    .line 37
    .line 38
    if-eqz v0, :cond_2a

    .line 39
    .line 40
    const/16 p1, 0x32

    .line 41
    .line 42
    return p1

    .line 43
    :cond_2a
    instance-of v0, p1, Lax/b3/H;

    .line 44
    .line 45
    if-eqz v0, :cond_31

    .line 46
    .line 47
    const/16 p1, 0x3c

    .line 48
    .line 49
    return p1

    .line 50
    :cond_31
    instance-of v0, p1, Lax/b3/D;

    .line 51
    .line 52
    if-eqz v0, :cond_38

    .line 53
    .line 54
    const/16 p1, 0x46

    .line 55
    .line 56
    return p1

    .line 57
    :cond_38
    instance-of v0, p1, Lax/b3/F;

    .line 58
    .line 59
    if-eqz v0, :cond_3f

    .line 60
    .line 61
    const/16 p1, 0x50

    .line 62
    .line 63
    return p1

    .line 64
    :cond_3f
    instance-of v0, p1, Lax/b3/I;

    .line 65
    .line 66
    if-eqz v0, :cond_46

    .line 67
    .line 68
    const/16 p1, 0xa0

    .line 69
    .line 70
    return p1

    .line 71
    :cond_46
    instance-of v0, p1, Lax/b3/w;

    .line 72
    .line 73
    if-eqz v0, :cond_4d

    .line 74
    .line 75
    const/16 p1, 0x5a

    .line 76
    .line 77
    return p1

    .line 78
    :cond_4d
    instance-of v0, p1, Lax/b3/x;

    .line 79
    .line 80
    if-eqz v0, :cond_54

    .line 81
    .line 82
    const/16 p1, 0x64

    .line 83
    .line 84
    return p1

    .line 85
    :cond_54
    instance-of v0, p1, Lax/b3/l;

    .line 86
    .line 87
    if-eqz v0, :cond_5b

    .line 88
    .line 89
    const/16 p1, 0x6e

    .line 90
    .line 91
    return p1

    .line 92
    :cond_5b
    instance-of v0, p1, Lax/b3/B;

    .line 93
    .line 94
    if-eqz v0, :cond_62

    .line 95
    .line 96
    const/16 p1, 0x96

    .line 97
    .line 98
    return p1

    .line 99
    :cond_62
    instance-of v0, p1, Lax/b3/z;

    .line 100
    .line 101
    if-eqz v0, :cond_69

    .line 102
    .line 103
    const/16 p1, 0xaa

    .line 104
    .line 105
    return p1

    .line 106
    :cond_69
    instance-of p1, p1, Lax/b3/g;

    .line 107
    .line 108
    if-eqz p1, :cond_70

    .line 109
    .line 110
    const/16 p1, 0x9b

    .line 111
    .line 112
    return p1

    .line 113
    :cond_70
    const/4 p1, 0x0

    .line 114
    return p1
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

.method private m()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/W2/v;->R()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget-object v0, p0, Lax/W2/j;->s:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_e
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lax/W2/v;->R()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1c

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_1a
    move-exception v1

    .line 28
    goto :goto_29

    .line 29
    :cond_1c
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v1, v2}, Lax/W2/v;->X(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lax/W2/j;->Y()V

    .line 38
    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_29
    monitor-exit v0
    :try_end_2a
    .catchall {:try_start_e .. :try_end_2a} :catchall_1a

    .line 43
    throw v1
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

.method private n()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/W2/j;->i0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lax/W2/j;->e0()V

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
.end method

.method private s()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->q:Ljava/lang/String;

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


# virtual methods
.method public abstract A()Ljava/lang/String;
.end method

.method public abstract B()I
.end method

.method public abstract C()Ljava/lang/String;
.end method

.method public D()Lax/W2/h$b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->d:Lax/W2/h$b;

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

.method protected E()Ljava/lang/Object;
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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

.method protected abstract F()Ljava/lang/String;
.end method

.method protected abstract G()Ljava/lang/String;
.end method

.method public abstract H()Lax/c3/K;
.end method

.method public I()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->J()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/W2/j;->J()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_13
    const-string v0, ""

    .line 21
    .line 22
    return-object v0
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
.end method

.method public abstract J()Ljava/lang/String;
.end method

.method public abstract K()Lax/c3/K;
.end method

.method public L()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->M()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/W2/j;->M()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_13
    const-string v0, ""

    .line 21
    .line 22
    return-object v0
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
.end method

.method public abstract M()Ljava/lang/String;
.end method

.method protected abstract P()Z
.end method

.method public Q()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/W2/j;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/W2/j;->f:Z

    .line 6
    .line 7
    if-nez v0, :cond_f

    .line 8
    .line 9
    iget-boolean v0, p0, Lax/W2/j;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_f
    :goto_f
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public R()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/W2/j;->g:Z

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

.method protected S(Lax/u3/q;)Z
    .registers 3

    .line 1
    if-eqz p1, :cond_12

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/u3/q;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_12

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/u3/q;->m()Lax/u3/q$f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lax/u3/q$f;->c0:Lax/u3/q$f;

    .line 14
    .line 15
    if-ne p1, v0, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method public T()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/W2/j;->e:Z

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

.method public U(I)Lax/W2/j$c;
    .registers 5

    .line 1
    new-instance v0, Lax/W2/j$c;

    .line 2
    .line 3
    int-to-long v1, p1

    .line 4
    invoke-direct {v0, p0, v1, v2}, Lax/W2/j$c;-><init>(Lax/W2/j;J)V

    .line 5
    .line 6
    .line 7
    return-object v0
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

.method public V()Lax/g3/i;
    .registers 4

    .line 1
    new-instance v0, Lax/W2/j$c;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, v2}, Lax/W2/j$c;-><init>(Lax/W2/j;J)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method protected abstract W()V
.end method

.method protected abstract X()Z
.end method

.method protected abstract Y()V
.end method

.method protected abstract Z()V
.end method

.method protected a0()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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

.method protected b0()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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

.method public abstract c0()V
.end method

.method public final d0()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->Q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    goto :goto_b

    .line 8
    :cond_7
    iget-boolean v0, p0, Lax/W2/j;->l:Z

    .line 9
    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    :goto_b
    return-void

    .line 13
    :cond_c
    sget-object v0, Lax/W2/j$d;->e0:Lax/W2/j$d;

    .line 14
    .line 15
    iput-object v0, p0, Lax/W2/j;->n:Lax/W2/j$d;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lax/W2/j;->l:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lax/W2/j;->a0()V

    .line 21
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
.end method

.method protected e0()V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/W2/j;->d:Lax/W2/h$b;

    .line 2
    .line 3
    sget-object v1, Lax/W2/h$b;->q:Lax/W2/h$b;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_9

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    :goto_a
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lax/W2/j;->k:Z

    .line 15
    .line 16
    if-eqz v0, :cond_23

    .line 17
    .line 18
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "COMOP CALL AGAIN"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    invoke-virtual {p0}, Lax/W2/j;->n0()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lax/W2/j;->b:Lax/W2/h$a;

    .line 40
    .line 41
    if-eqz v0, :cond_5a

    .line 42
    .line 43
    invoke-virtual {p0}, Lax/W2/j;->D()Lax/W2/h$b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Lax/W2/h$b;->c0:Lax/W2/h$b;

    .line 48
    .line 49
    if-ne v0, v1, :cond_3c

    .line 50
    .line 51
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lax/W2/v;->I()Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_3a
    move-object v7, v0

    .line 60
    goto :goto_45

    .line 61
    :cond_3c
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lax/W2/v;->m()Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_3a

    .line 70
    :goto_45
    iget-object v3, p0, Lax/W2/j;->b:Lax/W2/h$a;

    .line 71
    .line 72
    invoke-virtual {p0}, Lax/W2/j;->D()Lax/W2/h$b;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {p0}, Lax/W2/j;->F()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {p0}, Lax/W2/j;->G()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {p0}, Lax/W2/j;->E()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-interface/range {v3 .. v8}, Lax/W2/h$a;->a(Lax/W2/h$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_5a
    invoke-virtual {p0}, Lax/W2/j;->k()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lax/W2/j;->j()V

    .line 95
    .line 96
    .line 97
    iput-boolean v2, p0, Lax/W2/j;->k:Z

    .line 98
    .line 99
    return-void
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
.end method

.method public final f0(Z)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/W2/j;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_d

    .line 5
    .line 6
    iput-boolean v1, p0, Lax/W2/j;->i:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/W2/j;->W()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lax/W2/j;->h0()V

    .line 12
    .line 13
    .line 14
    :cond_d
    if-nez p1, :cond_30

    .line 15
    .line 16
    iget-boolean p1, p0, Lax/W2/j;->j:Z

    .line 17
    .line 18
    if-nez p1, :cond_30

    .line 19
    .line 20
    iput-boolean v1, p0, Lax/W2/j;->j:Z

    .line 21
    .line 22
    invoke-static {}, Lax/X2/Q;->X1()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_2d

    .line 27
    .line 28
    invoke-virtual {p0}, Lax/W2/j;->P()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2d

    .line 33
    .line 34
    new-instance p1, Lax/W2/j$e;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-direct {p1, p0, v0, v1}, Lax/W2/j$e;-><init>(Lax/W2/j;ZZ)V

    .line 38
    .line 39
    .line 40
    new-array v0, v0, [Ljava/lang/Void;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    invoke-virtual {p0}, Lax/W2/j;->e0()V

    .line 47
    .line 48
    .line 49
    :cond_30
    return-void
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

.method public final g0()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lax/W2/j;->f0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public h(Lax/c3/K;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/j;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
.end method

.method public h0()V
    .registers 2

    .line 1
    sget-object v0, Lax/W2/j$d;->g0:Lax/W2/j$d;

    .line 2
    .line 3
    iput-object v0, p0, Lax/W2/j;->n:Lax/W2/j$d;

    .line 4
    .line 5
    iget-object v0, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/service/CommandService;->A(Lax/W2/j;)V

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
.end method

.method public final i()V
    .registers 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongThread"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->Q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lax/W2/j;->h:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/W2/j;->X()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v1, Lax/W2/h$b;->e0:Lax/W2/h$b;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lax/W2/j;->t0(Lax/W2/h$b;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lax/W2/j;->r:Ljava/lang/Thread;

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eq v1, v2, :cond_2d

    .line 27
    .line 28
    new-instance v1, Landroid/os/Handler;

    .line 29
    .line 30
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lax/W2/j$a;

    .line 38
    .line 39
    invoke-direct {v2, p0, v0}, Lax/W2/j$a;-><init>(Lax/W2/j;Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    invoke-virtual {p0, v0}, Lax/W2/j;->f0(Z)V

    .line 47
    .line 48
    .line 49
    return-void
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

.method public i0()V
    .registers 2

    .line 1
    sget-object v0, Lax/W2/j$d;->f0:Lax/W2/j$d;

    .line 2
    .line 3
    iput-object v0, p0, Lax/W2/j;->n:Lax/W2/j$d;

    .line 4
    .line 5
    iget-object v0, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/service/CommandService;->B(Lax/W2/j;)V

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
.end method

.method public j()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/CommandService;->h()V

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

.method public j0()V
    .registers 2

    .line 1
    sget-object v0, Lax/W2/j$d;->c0:Lax/W2/j$d;

    .line 2
    .line 3
    iput-object v0, p0, Lax/W2/j;->n:Lax/W2/j$d;

    .line 4
    .line 5
    iget-object v0, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/service/CommandService;->C(Lax/W2/j;)V

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
.end method

.method public abstract k()V
.end method

.method public k0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->a:Lax/W2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/W2/v;->b0()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lax/W2/j$d;->d0:Lax/W2/j$d;

    .line 7
    .line 8
    iput-object v0, p0, Lax/W2/j;->n:Lax/W2/j$d;

    .line 9
    .line 10
    iget-object v0, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/service/CommandService;->D(Lax/W2/j;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public declared-synchronized l0(Z)V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Lax/W2/j;->R()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_10

    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_9
    :try_start_9
    iget-object v0, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

    .line 11
    .line 12
    invoke-virtual {v0, p0, p1}, Lcom/voxdon/xplorer/service/CommandService;->E(Lax/W2/j;Z)V
    :try_end_e
    .catchall {:try_start_9 .. :try_end_e} :catchall_10

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_10
    move-exception p1

    .line 18
    :try_start_11
    monitor-exit p0
    :try_end_12
    .catchall {:try_start_11 .. :try_end_12} :catchall_10

    .line 19
    throw p1
    .line 20
    .line 21
    .line 22
.end method

.method public final m0()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->Q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    goto :goto_b

    .line 8
    :cond_7
    iget-boolean v0, p0, Lax/W2/j;->l:Z

    .line 9
    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    :goto_b
    return-void

    .line 13
    :cond_c
    sget-object v0, Lax/W2/j$d;->d0:Lax/W2/j$d;

    .line 14
    .line 15
    iput-object v0, p0, Lax/W2/j;->n:Lax/W2/j$d;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lax/W2/j;->l:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lax/W2/j;->b0()V

    .line 21
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
.end method

.method public abstract n0()V
.end method

.method public final o()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->Q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lax/W2/j;->f:Z

    .line 10
    .line 11
    invoke-static {}, Lax/X2/Q;->X1()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_22

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/W2/j;->P()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_22

    .line 22
    .line 23
    new-instance v1, Lax/W2/j$e;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v0, v2}, Lax/W2/j$e;-><init>(Lax/W2/j;ZZ)V

    .line 27
    .line 28
    .line 29
    new-array v0, v2, [Ljava/lang/Void;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    invoke-direct {p0}, Lax/W2/j;->n()V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public o0(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/W2/j;->t:J

    .line 2
    .line 3
    return-void
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

.method public p()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/W2/j;->t:J

    .line 2
    .line 3
    return-wide v0
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

.method public p0(Lcom/voxdon/xplorer/service/CommandService;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

    .line 2
    .line 3
    return-void
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

.method public q()Lcom/voxdon/xplorer/service/CommandService;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

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

.method protected q0(Lax/b3/j;)I
    .registers 6

    .line 1
    invoke-direct {p0, p1}, Lax/W2/j;->l(Lax/b3/j;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lax/W2/j;->r0(I)V

    .line 8
    .line 9
    .line 10
    :cond_9
    instance-of v1, p1, Lax/b3/A;

    .line 11
    .line 12
    if-eqz v1, :cond_17

    .line 13
    .line 14
    move-object v1, p1

    .line 15
    check-cast v1, Lax/b3/A;

    .line 16
    .line 17
    invoke-interface {v1}, Lax/b3/A;->e()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0, v1}, Lax/W2/j;->s0(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, ":"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput-object v1, p0, Lax/W2/j;->q:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_6f

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    if-eqz v3, :cond_6f

    .line 77
    .line 78
    if-eqz v1, :cond_6f

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_6f

    .line 89
    .line 90
    new-instance p1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v3, p0, Lax/W2/j;->q:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, Lax/W2/j;->q:Ljava/lang/String;

    .line 111
    .line 112
    :cond_6f
    return v0
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

.method public r()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->c:Lcom/voxdon/xplorer/service/CommandService;

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

.method protected r0(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/W2/j;->o:I

    .line 2
    .line 3
    return-void
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

.method protected s0(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/j;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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

.method protected t()I
    .registers 2

    .line 1
    iget v0, p0, Lax/W2/j;->o:I

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

.method public declared-synchronized t0(Lax/W2/h$b;)V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput-object p1, p0, Lax/W2/j;->d:Lax/W2/h$b;

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lax/W2/j;->g:Z
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_8
    move-exception p1

    .line 10
    :try_start_9
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_9 .. :try_end_a} :catchall_8

    .line 11
    throw p1
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

.method protected u()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->p:Ljava/lang/String;

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

.method public u0(Ljava/lang/Thread;)V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/W2/j;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/W2/j;->b:Lax/W2/h$a;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-interface {v0}, Lax/W2/h$a;->b()V

    .line 9
    .line 10
    .line 11
    :cond_a
    invoke-virtual {p0}, Lax/W2/j;->c0()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lax/W2/j;->r:Ljava/lang/Thread;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected v(Z)Ljava/lang/String;
    .registers 3

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/W2/j;->t()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0, p1}, Lax/W2/j;->O(IZ)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    goto :goto_13

    .line 12
    :cond_b
    invoke-virtual {p0}, Lax/W2/j;->t()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-direct {p0, p1}, Lax/W2/j;->N(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :goto_13
    if-eqz p1, :cond_22

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_33

    .line 35
    :cond_22
    invoke-virtual {p0}, Lax/W2/j;->u()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_31

    .line 44
    .line 45
    invoke-virtual {p0}, Lax/W2/j;->u()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_33

    .line 50
    :cond_31
    const-string p1, ""

    .line 51
    .line 52
    :goto_33
    invoke-direct {p0}, Lax/W2/j;->s()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_66

    .line 57
    .line 58
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lax/t3/j;->o(Landroid/content/Context;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_66

    .line 67
    .line 68
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4e

    .line 73
    .line 74
    invoke-direct {p0}, Lax/W2/j;->s()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_4e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p1, "\n"

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-direct {p0}, Lax/W2/j;->s()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :cond_66
    return-object p1
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

.method protected v0()V
    .registers 3

    .line 1
    :goto_0
    invoke-virtual {p0}, Lax/W2/j;->z()Lax/W2/j$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/W2/j$d;->e0:Lax/W2/j$d;

    .line 6
    .line 7
    if-ne v0, v1, :cond_10

    .line 8
    .line 9
    const-wide/16 v0, 0x64

    .line 10
    .line 11
    :try_start_a
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_d} :catch_e

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_e
    nop

    .line 16
    goto :goto_0

    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public w()Lax/W2/v;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->a:Lax/W2/v;

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

.method protected x()Lax/g3/i;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->u:Lax/g3/i;

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

.method public y()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/c3/K;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/W2/j;->m:Ljava/util/ArrayList;

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

.method public z()Lax/W2/j$d;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/j;->n:Lax/W2/j$d;

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
