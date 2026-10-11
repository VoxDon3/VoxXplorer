.class final Landroidx/media3/exoplayer/hls/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/m1/o$b;
.implements Lax/m1/o$f;
.implements Lax/i1/f0;
.implements Lax/q1/t;
.implements Lax/i1/d0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/hls/l$b;,
        Landroidx/media3/exoplayer/hls/l$d;,
        Landroidx/media3/exoplayer/hls/l$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/m1/o$b<",
        "Lax/j1/b;",
        ">;",
        "Lax/m1/o$f;",
        "Lax/i1/f0;",
        "Lax/q1/t;",
        "Lax/i1/d0$d;"
    }
.end annotation


# static fields
.field private static final Z0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A0:Lax/q1/U;

.field private B0:I

.field private C0:I

.field private D0:Z

.field private E0:Z

.field private F0:I

.field private G0:Lax/P0/v;

.field private H0:Lax/P0/v;

.field private I0:Z

.field private J0:Lax/i1/q0;

.field private K0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lax/P0/P;",
            ">;"
        }
    .end annotation
.end field

.field private L0:[I

.field private M0:I

.field private N0:Z

.field private O0:[Z

.field private P0:[Z

.field private Q0:J

.field private R0:J

.field private S0:Z

.field private T0:Z

.field private U0:Z

.field private V0:Z

.field private W0:J

.field private X0:Lax/P0/o;

.field private Y0:Landroidx/media3/exoplayer/hls/e;

.field private final c0:I

.field private final d0:Landroidx/media3/exoplayer/hls/l$b;

.field private final e0:Landroidx/media3/exoplayer/hls/c;

.field private final f0:Lax/m1/b;

.field private final g0:Lax/P0/v;

.field private final h0:Lax/b1/w;

.field private final i0:Lax/b1/u$a;

.field private final j0:Lax/m1/m;

.field private final k0:Lax/m1/o;

.field private final l0:Lax/i1/N$a;

.field private final m0:I

.field private final n0:Landroidx/media3/exoplayer/hls/c$b;

.field private final o0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/hls/e;",
            ">;"
        }
    .end annotation
.end field

.field private final p0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/hls/e;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/lang/String;

.field private final q0:Ljava/lang/Runnable;

.field private final r0:Ljava/lang/Runnable;

.field private final s0:Landroid/os/Handler;

.field private final t0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/hls/h;",
            ">;"
        }
    .end annotation
.end field

.field private final u0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lax/P0/o;",
            ">;"
        }
    .end annotation
.end field

.field private v0:Lax/j1/b;

.field private w0:[Landroidx/media3/exoplayer/hls/l$d;

.field private x0:[I

.field private y0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private z0:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .registers 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 v3, 0x2

    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v5, 0x5

    .line 14
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    const/4 v6, 0x3

    .line 19
    new-array v6, v6, [Ljava/lang/Integer;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    aput-object v2, v6, v7

    .line 23
    .line 24
    aput-object v4, v6, v1

    .line 25
    .line 26
    aput-object v5, v6, v3

    .line 27
    .line 28
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Landroidx/media3/exoplayer/hls/l;->Z0:Ljava/util/Set;

    .line 40
    .line 41
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILandroidx/media3/exoplayer/hls/l$b;Landroidx/media3/exoplayer/hls/c;Ljava/util/Map;Lax/m1/b;JLax/P0/v;Lax/b1/w;Lax/b1/u$a;Lax/m1/m;Lax/i1/N$a;I)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Landroidx/media3/exoplayer/hls/l$b;",
            "Landroidx/media3/exoplayer/hls/c;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lax/P0/o;",
            ">;",
            "Lax/m1/b;",
            "J",
            "Lax/P0/v;",
            "Lax/b1/w;",
            "Lax/b1/u$a;",
            "Lax/m1/m;",
            "Lax/i1/N$a;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->q:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/hls/l;->c0:I

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/l;->d0:Landroidx/media3/exoplayer/hls/l$b;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/media3/exoplayer/hls/l;->u0:Ljava/util/Map;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/media3/exoplayer/hls/l;->f0:Lax/m1/b;

    .line 15
    .line 16
    iput-object p9, p0, Landroidx/media3/exoplayer/hls/l;->g0:Lax/P0/v;

    .line 17
    .line 18
    iput-object p10, p0, Landroidx/media3/exoplayer/hls/l;->h0:Lax/b1/w;

    .line 19
    .line 20
    iput-object p11, p0, Landroidx/media3/exoplayer/hls/l;->i0:Lax/b1/u$a;

    .line 21
    .line 22
    iput-object p12, p0, Landroidx/media3/exoplayer/hls/l;->j0:Lax/m1/m;

    .line 23
    .line 24
    iput-object p13, p0, Landroidx/media3/exoplayer/hls/l;->l0:Lax/i1/N$a;

    .line 25
    .line 26
    iput p14, p0, Landroidx/media3/exoplayer/hls/l;->m0:I

    .line 27
    .line 28
    new-instance p1, Lax/m1/o;

    .line 29
    .line 30
    const-string p2, "Loader:HlsSampleStreamWrapper"

    .line 31
    .line 32
    invoke-direct {p1, p2}, Lax/m1/o;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 36
    .line 37
    new-instance p1, Landroidx/media3/exoplayer/hls/c$b;

    .line 38
    .line 39
    invoke-direct {p1}, Landroidx/media3/exoplayer/hls/c$b;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n0:Landroidx/media3/exoplayer/hls/c$b;

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    new-array p2, p1, [I

    .line 46
    .line 47
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->x0:[I

    .line 48
    .line 49
    new-instance p2, Ljava/util/HashSet;

    .line 50
    .line 51
    sget-object p3, Landroidx/media3/exoplayer/hls/l;->Z0:Ljava/util/Set;

    .line 52
    .line 53
    invoke-interface {p3}, Ljava/util/Set;->size()I

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    invoke-direct {p2, p4}, Ljava/util/HashSet;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->y0:Ljava/util/Set;

    .line 61
    .line 62
    new-instance p2, Landroid/util/SparseIntArray;

    .line 63
    .line 64
    invoke-interface {p3}, Ljava/util/Set;->size()I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    invoke-direct {p2, p3}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->z0:Landroid/util/SparseIntArray;

    .line 72
    .line 73
    new-array p2, p1, [Landroidx/media3/exoplayer/hls/l$d;

    .line 74
    .line 75
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 76
    .line 77
    new-array p2, p1, [Z

    .line 78
    .line 79
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->P0:[Z

    .line 80
    .line 81
    new-array p1, p1, [Z

    .line 82
    .line 83
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->O0:[Z

    .line 84
    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->p0:Ljava/util/List;

    .line 97
    .line 98
    new-instance p1, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->t0:Ljava/util/ArrayList;

    .line 104
    .line 105
    new-instance p1, Landroidx/media3/exoplayer/hls/j;

    .line 106
    .line 107
    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/hls/j;-><init>(Landroidx/media3/exoplayer/hls/l;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->q0:Ljava/lang/Runnable;

    .line 111
    .line 112
    new-instance p1, Landroidx/media3/exoplayer/hls/k;

    .line 113
    .line 114
    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/hls/k;-><init>(Landroidx/media3/exoplayer/hls/l;)V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->r0:Ljava/lang/Runnable;

    .line 118
    .line 119
    invoke-static {}, Lax/S0/d0;->A()Landroid/os/Handler;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->s0:Landroid/os/Handler;

    .line 124
    .line 125
    iput-wide p7, p0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 126
    .line 127
    iput-wide p7, p0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 128
    .line 129
    return-void
.end method

.method private B()V
    .registers 16

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    const/4 v2, -0x2

    .line 6
    const/4 v3, -0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, -0x2

    .line 10
    const/4 v7, -0x1

    .line 11
    :goto_a
    const/4 v8, 0x2

    .line 12
    if-ge v5, v1, :cond_49

    .line 13
    .line 14
    iget-object v9, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 15
    .line 16
    aget-object v9, v9, v5

    .line 17
    .line 18
    invoke-virtual {v9}, Lax/i1/d0;->D()Lax/P0/v;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    invoke-static {v9}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    check-cast v9, Lax/P0/v;

    .line 27
    .line 28
    iget-object v9, v9, Lax/P0/v;->o:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v9}, Lax/P0/D;->s(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    if-eqz v10, :cond_24

    .line 35
    .line 36
    goto :goto_35

    .line 37
    :cond_24
    invoke-static {v9}, Lax/P0/D;->o(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_2c

    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    goto :goto_35

    .line 45
    :cond_2c
    invoke-static {v9}, Lax/P0/D;->r(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-eqz v8, :cond_34

    .line 50
    .line 51
    const/4 v8, 0x3

    .line 52
    goto :goto_35

    .line 53
    :cond_34
    const/4 v8, -0x2

    .line 54
    :goto_35
    invoke-static {v8}, Landroidx/media3/exoplayer/hls/l;->O(I)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    invoke-static {v6}, Landroidx/media3/exoplayer/hls/l;->O(I)I

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-le v9, v10, :cond_42

    .line 63
    .line 64
    move v7, v5

    .line 65
    move v6, v8

    .line 66
    goto :goto_47

    .line 67
    :cond_42
    if-ne v8, v6, :cond_47

    .line 68
    .line 69
    if-eq v7, v3, :cond_47

    .line 70
    .line 71
    const/4 v7, -0x1

    .line 72
    :cond_47
    :goto_47
    add-int/2addr v5, v0

    .line 73
    goto :goto_a

    .line 74
    :cond_49
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 75
    .line 76
    invoke-virtual {v2}, Landroidx/media3/exoplayer/hls/c;->l()Lax/P0/P;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget v5, v2, Lax/P0/P;->a:I

    .line 81
    .line 82
    iput v3, p0, Landroidx/media3/exoplayer/hls/l;->M0:I

    .line 83
    .line 84
    new-array v3, v1, [I

    .line 85
    .line 86
    iput-object v3, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    :goto_58
    if-ge v3, v1, :cond_60

    .line 90
    .line 91
    iget-object v9, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 92
    .line 93
    aput v3, v9, v3

    .line 94
    .line 95
    add-int/2addr v3, v0

    .line 96
    goto :goto_58

    .line 97
    :cond_60
    new-array v3, v1, [Lax/P0/P;

    .line 98
    .line 99
    const/4 v9, 0x0

    .line 100
    :goto_63
    if-ge v9, v1, :cond_de

    .line 101
    .line 102
    iget-object v10, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 103
    .line 104
    aget-object v10, v10, v9

    .line 105
    .line 106
    invoke-virtual {v10}, Lax/i1/d0;->D()Lax/P0/v;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    invoke-static {v10}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    check-cast v10, Lax/P0/v;

    .line 115
    .line 116
    if-ne v9, v7, :cond_a3

    .line 117
    .line 118
    new-array v11, v5, [Lax/P0/v;

    .line 119
    .line 120
    const/4 v12, 0x0

    .line 121
    :goto_78
    if-ge v12, v5, :cond_97

    .line 122
    .line 123
    invoke-virtual {v2, v12}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    if-ne v6, v0, :cond_88

    .line 128
    .line 129
    iget-object v14, p0, Landroidx/media3/exoplayer/hls/l;->g0:Lax/P0/v;

    .line 130
    .line 131
    if-eqz v14, :cond_88

    .line 132
    .line 133
    invoke-virtual {v13, v14}, Lax/P0/v;->m(Lax/P0/v;)Lax/P0/v;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    :cond_88
    if-ne v5, v0, :cond_8f

    .line 138
    .line 139
    invoke-virtual {v10, v13}, Lax/P0/v;->m(Lax/P0/v;)Lax/P0/v;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    goto :goto_93

    .line 144
    :cond_8f
    invoke-static {v13, v10, v0}, Landroidx/media3/exoplayer/hls/l;->H(Lax/P0/v;Lax/P0/v;Z)Lax/P0/v;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    :goto_93
    aput-object v13, v11, v12

    .line 149
    .line 150
    add-int/2addr v12, v0

    .line 151
    goto :goto_78

    .line 152
    :cond_97
    new-instance v10, Lax/P0/P;

    .line 153
    .line 154
    iget-object v12, p0, Landroidx/media3/exoplayer/hls/l;->q:Ljava/lang/String;

    .line 155
    .line 156
    invoke-direct {v10, v12, v11}, Lax/P0/P;-><init>(Ljava/lang/String;[Lax/P0/v;)V

    .line 157
    .line 158
    .line 159
    aput-object v10, v3, v9

    .line 160
    .line 161
    iput v9, p0, Landroidx/media3/exoplayer/hls/l;->M0:I

    .line 162
    .line 163
    goto :goto_dc

    .line 164
    :cond_a3
    if-ne v6, v8, :cond_b0

    .line 165
    .line 166
    iget-object v11, v10, Lax/P0/v;->o:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v11}, Lax/P0/D;->o(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    if-eqz v11, :cond_b0

    .line 173
    .line 174
    iget-object v11, p0, Landroidx/media3/exoplayer/hls/l;->g0:Lax/P0/v;

    .line 175
    .line 176
    goto :goto_b1

    .line 177
    :cond_b0
    const/4 v11, 0x0

    .line 178
    :goto_b1
    new-instance v12, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    iget-object v13, p0, Landroidx/media3/exoplayer/hls/l;->q:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string v13, ":muxed:"

    .line 189
    .line 190
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    if-ge v9, v7, :cond_c4

    .line 194
    .line 195
    move v13, v9

    .line 196
    goto :goto_c6

    .line 197
    :cond_c4
    add-int/lit8 v13, v9, -0x1

    .line 198
    .line 199
    :goto_c6
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    new-instance v13, Lax/P0/P;

    .line 207
    .line 208
    invoke-static {v11, v10, v4}, Landroidx/media3/exoplayer/hls/l;->H(Lax/P0/v;Lax/P0/v;Z)Lax/P0/v;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    new-array v11, v0, [Lax/P0/v;

    .line 213
    .line 214
    aput-object v10, v11, v4

    .line 215
    .line 216
    invoke-direct {v13, v12, v11}, Lax/P0/P;-><init>(Ljava/lang/String;[Lax/P0/v;)V

    .line 217
    .line 218
    .line 219
    aput-object v13, v3, v9

    .line 220
    .line 221
    :goto_dc
    add-int/2addr v9, v0

    .line 222
    goto :goto_63

    .line 223
    :cond_de
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/hls/l;->G([Lax/P0/P;)Lax/i1/q0;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iput-object v1, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 228
    .line 229
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->K0:Ljava/util/Set;

    .line 230
    .line 231
    if-nez v1, :cond_e9

    .line 232
    .line 233
    goto :goto_ea

    .line 234
    :cond_e9
    const/4 v0, 0x0

    .line 235
    :goto_ea
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 236
    .line 237
    .line 238
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 239
    .line 240
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->K0:Ljava/util/Set;

    .line 241
    .line 242
    return-void
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
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private C(I)Z
    .registers 6

    .line 1
    move v0, p1

    .line 2
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-ge v0, v1, :cond_1c

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/media3/exoplayer/hls/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/media3/exoplayer/hls/e;->x()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_19

    .line 24
    .line 25
    return v2

    .line 26
    :cond_19
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1c
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroidx/media3/exoplayer/hls/e;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    :goto_25
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 39
    .line 40
    array-length v1, v1

    .line 41
    if-ge v0, v1, :cond_3c

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/hls/e;->m(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 48
    .line 49
    aget-object v3, v3, v0

    .line 50
    .line 51
    invoke-virtual {v3}, Lax/i1/d0;->A()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-le v3, v1, :cond_39

    .line 56
    .line 57
    return v2

    .line 58
    :cond_39
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_25

    .line 61
    :cond_3c
    const/4 p1, 0x1

    .line 62
    return p1
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
.end method

.method private static E(II)Lax/q1/o;
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Unmapped track with id "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p0, " of type "

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "HlsSampleStreamWrapper"

    .line 27
    .line 28
    invoke-static {p1, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Lax/q1/o;

    .line 32
    .line 33
    invoke-direct {p0}, Lax/q1/o;-><init>()V

    .line 34
    .line 35
    .line 36
    return-object p0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private F(II)Lax/i1/d0;
    .registers 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p2, v1, :cond_b

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-ne p2, v2, :cond_a

    .line 9
    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 v1, 0x0

    .line 12
    :cond_b
    :goto_b
    new-instance v2, Landroidx/media3/exoplayer/hls/l$d;

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->f0:Lax/m1/b;

    .line 15
    .line 16
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->h0:Lax/b1/w;

    .line 17
    .line 18
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/l;->i0:Lax/b1/u$a;

    .line 19
    .line 20
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/l;->u0:Ljava/util/Map;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    invoke-direct/range {v2 .. v7}, Landroidx/media3/exoplayer/hls/l$d;-><init>(Lax/m1/b;Lax/b1/w;Lax/b1/u$a;Ljava/util/Map;Landroidx/media3/exoplayer/hls/l$a;)V

    .line 24
    .line 25
    .line 26
    iget-wide v3, p0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 27
    .line 28
    invoke-virtual {v2, v3, v4}, Lax/i1/d0;->Y(J)V

    .line 29
    .line 30
    .line 31
    if-eqz v1, :cond_25

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->X0:Lax/P0/o;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/hls/l$d;->f0(Lax/P0/o;)V

    .line 36
    .line 37
    .line 38
    :cond_25
    iget-wide v3, p0, Landroidx/media3/exoplayer/hls/l;->W0:J

    .line 39
    .line 40
    invoke-virtual {v2, v3, v4}, Lax/i1/d0;->X(J)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->Y0:Landroidx/media3/exoplayer/hls/e;

    .line 44
    .line 45
    if-eqz v3, :cond_31

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/hls/l$d;->g0(Landroidx/media3/exoplayer/hls/e;)V

    .line 48
    .line 49
    .line 50
    :cond_31
    invoke-virtual {v2, p0}, Lax/i1/d0;->a0(Lax/i1/d0$d;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->x0:[I

    .line 54
    .line 55
    add-int/lit8 v4, v0, 0x1

    .line 56
    .line 57
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iput-object v3, p0, Landroidx/media3/exoplayer/hls/l;->x0:[I

    .line 62
    .line 63
    aput p1, v3, v0

    .line 64
    .line 65
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 66
    .line 67
    invoke-static {p1, v2}, Lax/S0/d0;->e1([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, [Landroidx/media3/exoplayer/hls/l$d;

    .line 72
    .line 73
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->P0:[Z

    .line 76
    .line 77
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->P0:[Z

    .line 82
    .line 83
    aput-boolean v1, p1, v0

    .line 84
    .line 85
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->N0:Z

    .line 86
    .line 87
    or-int/2addr p1, v1

    .line 88
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->N0:Z

    .line 89
    .line 90
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->y0:Ljava/util/Set;

    .line 91
    .line 92
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->z0:Landroid/util/SparseIntArray;

    .line 100
    .line 101
    invoke-virtual {p1, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    .line 102
    .line 103
    .line 104
    invoke-static {p2}, Landroidx/media3/exoplayer/hls/l;->O(I)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iget v1, p0, Landroidx/media3/exoplayer/hls/l;->B0:I

    .line 109
    .line 110
    invoke-static {v1}, Landroidx/media3/exoplayer/hls/l;->O(I)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-le p1, v1, :cond_77

    .line 115
    .line 116
    iput v0, p0, Landroidx/media3/exoplayer/hls/l;->C0:I

    .line 117
    .line 118
    iput p2, p0, Landroidx/media3/exoplayer/hls/l;->B0:I

    .line 119
    .line 120
    :cond_77
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->O0:[Z

    .line 121
    .line 122
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->O0:[Z

    .line 127
    .line 128
    return-object v2
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

.method private G([Lax/P0/P;)Lax/i1/q0;
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_2f

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget v3, v2, Lax/P0/P;->a:I

    .line 9
    .line 10
    new-array v3, v3, [Lax/P0/v;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    :goto_c
    iget v5, v2, Lax/P0/P;->a:I

    .line 14
    .line 15
    if-ge v4, v5, :cond_23

    .line 16
    .line 17
    invoke-virtual {v2, v4}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/l;->h0:Lax/b1/w;

    .line 22
    .line 23
    invoke-interface {v6, v5}, Lax/b1/w;->a(Lax/P0/v;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5, v6}, Lax/P0/v;->c(I)Lax/P0/v;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    aput-object v5, v3, v4

    .line 32
    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_c

    .line 36
    :cond_23
    new-instance v4, Lax/P0/P;

    .line 37
    .line 38
    iget-object v2, v2, Lax/P0/P;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {v4, v2, v3}, Lax/P0/P;-><init>(Ljava/lang/String;[Lax/P0/v;)V

    .line 41
    .line 42
    .line 43
    aput-object v4, p1, v1

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2f
    new-instance v0, Lax/i1/q0;

    .line 49
    .line 50
    invoke-direct {v0, p1}, Lax/i1/q0;-><init>([Lax/P0/P;)V

    .line 51
    .line 52
    .line 53
    return-object v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static H(Lax/P0/v;Lax/P0/v;Z)Lax/P0/v;
    .registers 10

    .line 1
    if-nez p0, :cond_3

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_3
    iget-object v0, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lax/P0/D;->k(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lax/P0/v;->k:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1, v0}, Lax/S0/d0;->R(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v1, v2, :cond_1d

    .line 18
    .line 19
    iget-object v1, p0, Lax/P0/v;->k:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lax/S0/d0;->S(Ljava/lang/String;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lax/P0/D;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    goto :goto_27

    .line 30
    :cond_1d
    iget-object v1, p0, Lax/P0/v;->k:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v1, v3}, Lax/P0/D;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v3, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 39
    .line 40
    :goto_27
    invoke-virtual {p1}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v5, p0, Lax/P0/v;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v5, p0, Lax/P0/v;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v4, v5}, Lax/P0/v$b;->l0(Ljava/lang/String;)Lax/P0/v$b;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v5, p0, Lax/P0/v;->c:Ljava/util/List;

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Lax/P0/v$b;->m0(Ljava/util/List;)Lax/P0/v$b;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget-object v5, p0, Lax/P0/v;->d:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iget v5, p0, Lax/P0/v;->e:I

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Lax/P0/v$b;->A0(I)Lax/P0/v$b;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget v5, p0, Lax/P0/v;->f:I

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Lax/P0/v$b;->w0(I)Lax/P0/v$b;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const/4 v5, -0x1

    .line 81
    if-eqz p2, :cond_55

    .line 82
    .line 83
    iget v6, p0, Lax/P0/v;->h:I

    .line 84
    .line 85
    goto :goto_56

    .line 86
    :cond_55
    const/4 v6, -0x1

    .line 87
    :goto_56
    invoke-virtual {v4, v6}, Lax/P0/v$b;->S(I)Lax/P0/v$b;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-eqz p2, :cond_5f

    .line 92
    .line 93
    iget p2, p0, Lax/P0/v;->i:I

    .line 94
    .line 95
    goto :goto_60

    .line 96
    :cond_5f
    const/4 p2, -0x1

    .line 97
    :goto_60
    invoke-virtual {v4, p2}, Lax/P0/v$b;->t0(I)Lax/P0/v$b;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2, v1}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    const/4 v1, 0x2

    .line 106
    if-ne v0, v1, :cond_7c

    .line 107
    .line 108
    iget v1, p0, Lax/P0/v;->v:I

    .line 109
    .line 110
    invoke-virtual {p2, v1}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget v4, p0, Lax/P0/v;->w:I

    .line 115
    .line 116
    invoke-virtual {v1, v4}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget v4, p0, Lax/P0/v;->z:F

    .line 121
    .line 122
    invoke-virtual {v1, v4}, Lax/P0/v$b;->f0(F)Lax/P0/v$b;

    .line 123
    .line 124
    .line 125
    :cond_7c
    if-eqz v3, :cond_81

    .line 126
    .line 127
    invoke-virtual {p2, v3}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 128
    .line 129
    .line 130
    :cond_81
    iget v1, p0, Lax/P0/v;->G:I

    .line 131
    .line 132
    if-eq v1, v5, :cond_8a

    .line 133
    .line 134
    if-ne v0, v2, :cond_8a

    .line 135
    .line 136
    invoke-virtual {p2, v1}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    .line 137
    .line 138
    .line 139
    :cond_8a
    iget-object p0, p0, Lax/P0/v;->l:Lax/P0/C;

    .line 140
    .line 141
    if-eqz p0, :cond_99

    .line 142
    .line 143
    iget-object p1, p1, Lax/P0/v;->l:Lax/P0/C;

    .line 144
    .line 145
    if-eqz p1, :cond_96

    .line 146
    .line 147
    invoke-virtual {p1, p0}, Lax/P0/C;->b(Lax/P0/C;)Lax/P0/C;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    :cond_96
    invoke-virtual {p2, p0}, Lax/P0/v$b;->r0(Lax/P0/C;)Lax/P0/v$b;

    .line 152
    .line 153
    .line 154
    :cond_99
    invoke-virtual {p2}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0
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
.end method

.method private I(I)V
    .registers 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/m1/o;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 10
    .line 11
    .line 12
    :goto_b
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, -0x1

    .line 19
    if-ge p1, v0, :cond_1e

    .line 20
    .line 21
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/l;->C(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1b

    .line 26
    .line 27
    goto :goto_1f

    .line 28
    :cond_1b
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_b

    .line 31
    :cond_1e
    const/4 p1, -0x1

    .line 32
    :goto_1f
    if-ne p1, v1, :cond_22

    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-wide v5, v0, Lax/j1/b;->h:J

    .line 40
    .line 41
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/l;->J(I)Landroidx/media3/exoplayer/hls/e;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_39

    .line 52
    .line 53
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 54
    .line 55
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 56
    .line 57
    goto :goto_44

    .line 58
    :cond_39
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static {v0}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/e;->p()V

    .line 67
    .line 68
    .line 69
    :goto_44
    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->l0:Lax/i1/N$a;

    .line 73
    .line 74
    iget v2, p0, Landroidx/media3/exoplayer/hls/l;->B0:I

    .line 75
    .line 76
    iget-wide v3, p1, Lax/j1/b;->g:J

    .line 77
    .line 78
    invoke-virtual/range {v1 .. v6}, Lax/i1/N$a;->y(IJJ)V

    .line 79
    .line 80
    .line 81
    return-void
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

.method private J(I)Landroidx/media3/exoplayer/hls/e;
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, p1, v2}, Lax/S0/d0;->l1(Ljava/util/List;II)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    :goto_12
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 20
    .line 21
    array-length v1, v1

    .line 22
    if-ge p1, v1, :cond_25

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/e;->m(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 29
    .line 30
    aget-object v2, v2, p1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Lax/i1/d0;->s(I)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    goto :goto_12

    .line 38
    :cond_25
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
.end method

.method private K(Landroidx/media3/exoplayer/hls/e;)Z
    .registers 10

    .line 1
    iget p1, p1, Landroidx/media3/exoplayer/hls/e;->k:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_7
    if-ge v2, v0, :cond_20

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->O0:[Z

    .line 11
    .line 12
    aget-boolean v3, v3, v2

    .line 13
    .line 14
    if-eqz v3, :cond_1d

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 17
    .line 18
    aget-object v3, v3, v2

    .line 19
    .line 20
    invoke-virtual {v3}, Lax/i1/d0;->N()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    int-to-long v5, p1

    .line 25
    cmp-long v7, v3, v5

    .line 26
    .line 27
    if-nez v7, :cond_1d

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1d
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_7

    .line 33
    :cond_20
    const/4 p1, 0x1

    .line 34
    return p1
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

.method private static L(Lax/P0/v;Lax/P0/v;)Z
    .registers 8

    .line 1
    iget-object v0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lax/P0/D;->k(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eq v2, v3, :cond_15

    .line 13
    .line 14
    invoke-static {v1}, Lax/P0/D;->k(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-ne v2, p0, :cond_14

    .line 19
    .line 20
    return v5

    .line 21
    :cond_14
    return v4

    .line 22
    :cond_15
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1c

    .line 27
    .line 28
    return v4

    .line 29
    :cond_1c
    const-string v1, "application/cea-608"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2e

    .line 36
    .line 37
    const-string v1, "application/cea-708"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2d

    .line 44
    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    return v5

    .line 47
    :cond_2e
    :goto_2e
    iget p0, p0, Lax/P0/v;->L:I

    .line 48
    .line 49
    iget p1, p1, Lax/P0/v;->L:I

    .line 50
    .line 51
    if-ne p0, p1, :cond_35

    .line 52
    .line 53
    return v5

    .line 54
    :cond_35
    return v4
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

.method private M()Landroidx/media3/exoplayer/hls/e;
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private N(II)Lax/q1/U;
    .registers 6

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/l;->Z0:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->z0:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne v0, v1, :cond_18

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_18
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->y0:Ljava/util/Set;

    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_28

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->x0:[I

    .line 38
    .line 39
    aput p1, v1, v0

    .line 40
    .line 41
    :cond_28
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->x0:[I

    .line 42
    .line 43
    aget v1, v1, v0

    .line 44
    .line 45
    if-ne v1, p1, :cond_33

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 48
    .line 49
    aget-object p1, p1, v0

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_33
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/hls/l;->E(II)Lax/q1/o;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
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

.method private static O(I)I
    .registers 4

    .line 1
    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_d

    const/4 v2, 0x3

    if-eq p0, v0, :cond_c

    if-eq p0, v2, :cond_b

    const/4 p0, 0x0

    return p0

    :cond_b
    return v1

    :cond_c
    return v2

    :cond_d
    return v0
.end method

.method private P(Landroidx/media3/exoplayer/hls/e;)V
    .registers 8

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->Y0:Landroidx/media3/exoplayer/hls/e;

    .line 2
    .line 3
    iget-object v0, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 4
    .line 5
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->G0:Lax/P0/v;

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 24
    .line 25
    array-length v2, v1

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    :goto_1b
    if-ge v4, v2, :cond_2d

    .line 29
    .line 30
    aget-object v5, v1, v4

    .line 31
    .line 32
    invoke-virtual {v5}, Lax/i1/d0;->E()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v0, v5}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_1b

    .line 46
    :cond_2d
    invoke-virtual {v0}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, p0, v0}, Landroidx/media3/exoplayer/hls/e;->o(Landroidx/media3/exoplayer/hls/l;Lax/r7/z;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 54
    .line 55
    array-length v1, v0

    .line 56
    :goto_37
    if-ge v3, v1, :cond_4a

    .line 57
    .line 58
    aget-object v2, v0, v3

    .line 59
    .line 60
    invoke-virtual {v2, p1}, Landroidx/media3/exoplayer/hls/l$d;->g0(Landroidx/media3/exoplayer/hls/e;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/e;->x()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_47

    .line 68
    .line 69
    invoke-virtual {v2}, Lax/i1/d0;->d0()V

    .line 70
    .line 71
    .line 72
    :cond_47
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_37

    .line 75
    :cond_4a
    return-void
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

.method private static Q(Lax/j1/b;)Z
    .registers 1

    .line 1
    instance-of p0, p0, Landroidx/media3/exoplayer/hls/e;

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

.method private R()Z
    .registers 6

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private U()V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 2
    .line 3
    iget v0, v0, Lax/i1/q0;->a:I

    .line 4
    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_e
    if-ge v2, v0, :cond_3d

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_11
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    if-ge v3, v5, :cond_3a

    .line 22
    .line 23
    aget-object v4, v4, v3

    .line 24
    .line 25
    invoke-virtual {v4}, Lax/i1/d0;->D()Lax/P0/v;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lax/P0/v;

    .line 34
    .line 35
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 36
    .line 37
    invoke-virtual {v5, v2}, Lax/i1/q0;->c(I)Lax/P0/P;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5, v1}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v4, v5}, Landroidx/media3/exoplayer/hls/l;->L(Lax/P0/v;Lax/P0/v;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_37

    .line 50
    .line 51
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 52
    .line 53
    aput v3, v4, v2

    .line 54
    .line 55
    goto :goto_3a

    .line 56
    :cond_37
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_11

    .line 59
    :cond_3a
    :goto_3a
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_e

    .line 62
    :cond_3d
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->t0:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    :goto_43
    if-ge v1, v2, :cond_51

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    check-cast v3, Landroidx/media3/exoplayer/hls/h;

    .line 77
    .line 78
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/h;->d()V

    .line 79
    .line 80
    .line 81
    goto :goto_43

    .line 82
    :cond_51
    return-void
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
.end method

.method private V(Landroidx/media3/exoplayer/hls/e;)V
    .registers 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    goto :goto_57

    .line 10
    :cond_9
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1e

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->I(I)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iget-boolean v0, p1, Landroidx/media3/exoplayer/hls/e;->n:Z

    .line 32
    .line 33
    if-eqz v0, :cond_57

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/e;->x()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_57

    .line 40
    .line 41
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/lit8 v0, v0, -0x1

    .line 48
    .line 49
    :goto_30
    if-ltz v0, :cond_57

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Landroidx/media3/exoplayer/hls/e;

    .line 58
    .line 59
    iget-wide v1, v1, Lax/j1/b;->g:J

    .line 60
    .line 61
    iget-wide v3, p1, Lax/j1/b;->g:J

    .line 62
    .line 63
    cmp-long v5, v1, v3

    .line 64
    .line 65
    if-gez v5, :cond_43

    .line 66
    .line 67
    goto :goto_57

    .line 68
    :cond_43
    cmp-long v5, v1, v3

    .line 69
    .line 70
    if-nez v5, :cond_54

    .line 71
    .line 72
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->C(I)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_54

    .line 77
    .line 78
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->I(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/e;->i()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_54
    add-int/lit8 v0, v0, -0x1

    .line 86
    .line 87
    goto :goto_30

    .line 88
    :cond_57
    :goto_57
    return-void
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

.method private W()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->I0:Z

    .line 2
    .line 3
    if-nez v0, :cond_32

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 6
    .line 7
    if-nez v0, :cond_32

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D0:Z

    .line 10
    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_32

    .line 14
    :cond_d
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 15
    .line 16
    array-length v1, v0

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_11
    if-ge v2, v1, :cond_1f

    .line 19
    .line 20
    aget-object v3, v0, v2

    .line 21
    .line 22
    invoke-virtual {v3}, Lax/i1/d0;->D()Lax/P0/v;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-nez v3, :cond_1c

    .line 27
    .line 28
    goto :goto_32

    .line 29
    :cond_1c
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_11

    .line 32
    :cond_1f
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 33
    .line 34
    if-eqz v0, :cond_27

    .line 35
    .line 36
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->U()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->B()V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->p0()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d0:Landroidx/media3/exoplayer/hls/l$b;

    .line 47
    .line 48
    invoke-interface {v0}, Landroidx/media3/exoplayer/hls/l$b;->h()V

    .line 49
    .line 50
    .line 51
    :cond_32
    :goto_32
    return-void
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

.method private g0()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D0:Z

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->W()V

    .line 5
    .line 6
    .line 7
    return-void
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

.method private k0()V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_5
    if-ge v3, v1, :cond_11

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-boolean v5, p0, Landroidx/media3/exoplayer/hls/l;->S0:Z

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Lax/i1/d0;->T(Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_5

    .line 18
    :cond_11
    iput-boolean v2, p0, Landroidx/media3/exoplayer/hls/l;->S0:Z

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method private l0(JLandroidx/media3/exoplayer/hls/e;)Z
    .registers 14

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_5
    const/4 v3, 0x1

    .line 7
    if-ge v2, v0, :cond_3b

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 10
    .line 11
    aget-object v4, v4, v2

    .line 12
    .line 13
    if-eqz p3, :cond_17

    .line 14
    .line 15
    invoke-virtual {p3, v2}, Landroidx/media3/exoplayer/hls/e;->m(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v4, v3}, Lax/i1/d0;->V(I)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_2b

    .line 24
    :cond_17
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/l;->b()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    const-wide/high16 v7, -0x8000000000000000L

    .line 29
    .line 30
    cmp-long v9, v5, v7

    .line 31
    .line 32
    if-eqz v9, :cond_27

    .line 33
    .line 34
    cmp-long v7, p1, v5

    .line 35
    .line 36
    if-gez v7, :cond_26

    .line 37
    .line 38
    goto :goto_27

    .line 39
    :cond_26
    const/4 v3, 0x0

    .line 40
    :cond_27
    :goto_27
    invoke-virtual {v4, p1, p2, v3}, Lax/i1/d0;->W(JZ)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    :goto_2b
    if-nez v3, :cond_38

    .line 45
    .line 46
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->P0:[Z

    .line 47
    .line 48
    aget-boolean v3, v3, v2

    .line 49
    .line 50
    if-nez v3, :cond_37

    .line 51
    .line 52
    iget-boolean v3, p0, Landroidx/media3/exoplayer/hls/l;->N0:Z

    .line 53
    .line 54
    if-nez v3, :cond_38

    .line 55
    .line 56
    :cond_37
    return v1

    .line 57
    :cond_38
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_5

    .line 60
    :cond_3b
    return v3
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

.method private p0()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->E0:Z

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
.end method

.method private u0([Lax/i1/e0;)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->t0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_7
    if-ge v1, v0, :cond_17

    .line 9
    .line 10
    aget-object v2, p1, v1

    .line 11
    .line 12
    if-eqz v2, :cond_14

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->t0:Ljava/util/ArrayList;

    .line 15
    .line 16
    check-cast v2, Landroidx/media3/exoplayer/hls/h;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_14
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_7

    .line 24
    :cond_17
    return-void
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

.method public static synthetic w(Landroidx/media3/exoplayer/hls/l;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->g0()V

    return-void
.end method

.method public static synthetic x(Landroidx/media3/exoplayer/hls/l;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->W()V

    return-void
.end method

.method public static synthetic y(Landroidx/media3/exoplayer/hls/l;Landroidx/media3/exoplayer/hls/e;)V
    .registers 2

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/l;->d0:Landroidx/media3/exoplayer/hls/l$b;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/media3/exoplayer/hls/e;->m:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Landroidx/media3/exoplayer/hls/l$b;->k(Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method private z()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->E0:Z

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 7
    .line 8
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->K0:Ljava/util/Set;

    .line 12
    .line 13
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public A(I)I
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 5
    .line 6
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 10
    .line 11
    aget v0, v0, p1

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const/4 v2, -0x2

    .line 15
    if-ne v0, v1, :cond_21

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->K0:Ljava/util/Set;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lax/i1/q0;->c(I)Lax/P0/P;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_20

    .line 30
    .line 31
    const/4 p1, -0x3

    .line 32
    return p1

    .line 33
    :cond_20
    return v2

    .line 34
    :cond_21
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->O0:[Z

    .line 35
    .line 36
    aget-boolean v1, p1, v0

    .line 37
    .line 38
    if-eqz v1, :cond_28

    .line 39
    .line 40
    return v2

    .line 41
    :cond_28
    const/4 v1, 0x1

    .line 42
    aput-boolean v1, p1, v0

    .line 43
    .line 44
    return v0
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

.method public D()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->E0:Z

    .line 2
    .line 3
    if-nez v0, :cond_16

    .line 4
    .line 5
    new-instance v0, Landroidx/media3/exoplayer/p0$b;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/media3/exoplayer/p0$b;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/p0$b;->f(J)Landroidx/media3/exoplayer/p0$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroidx/media3/exoplayer/p0$b;->d()Landroidx/media3/exoplayer/p0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/hls/l;->a(Landroidx/media3/exoplayer/p0;)Z

    .line 21
    .line 22
    .line 23
    :cond_16
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

.method public S(I)Z
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_14

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lax/i1/d0;->I(Z)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_14

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_14
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public T()Z
    .registers 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/hls/l;->B0:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    return v0
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

.method public X()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/m1/o;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/c;->r()V

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

.method public Y(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/l;->X()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 5
    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    invoke-virtual {p1}, Lax/i1/d0;->K()V

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
    .line 22
.end method

.method public Z(Lax/j1/b;JJZ)V
    .registers 20

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v0:Lax/j1/b;

    .line 3
    .line 4
    new-instance v1, Lax/i1/y;

    .line 5
    .line 6
    iget-wide v2, p1, Lax/j1/b;->a:J

    .line 7
    .line 8
    iget-object v4, p1, Lax/j1/b;->b:Lax/U0/k;

    .line 9
    .line 10
    invoke-virtual {p1}, Lax/j1/b;->f()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    invoke-virtual {p1}, Lax/j1/b;->e()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    invoke-virtual {p1}, Lax/j1/b;->b()J

    .line 19
    .line 20
    .line 21
    move-result-wide v11

    .line 22
    move-wide v7, p2

    .line 23
    move-wide/from16 v9, p4

    .line 24
    .line 25
    invoke-direct/range {v1 .. v12}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j0:Lax/m1/m;

    .line 29
    .line 30
    iget-wide v2, p1, Lax/j1/b;->a:J

    .line 31
    .line 32
    invoke-interface {v0, v2, v3}, Lax/m1/m;->a(J)V

    .line 33
    .line 34
    .line 35
    move-object v2, v1

    .line 36
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->l0:Lax/i1/N$a;

    .line 37
    .line 38
    iget v3, p1, Lax/j1/b;->c:I

    .line 39
    .line 40
    iget v4, p0, Landroidx/media3/exoplayer/hls/l;->c0:I

    .line 41
    .line 42
    iget-object v5, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 43
    .line 44
    iget v6, p1, Lax/j1/b;->e:I

    .line 45
    .line 46
    iget-object v7, p1, Lax/j1/b;->f:Ljava/lang/Object;

    .line 47
    .line 48
    iget-wide v8, p1, Lax/j1/b;->g:J

    .line 49
    .line 50
    iget-wide v10, p1, Lax/j1/b;->h:J

    .line 51
    .line 52
    invoke-virtual/range {v1 .. v11}, Lax/i1/N$a;->m(Lax/i1/y;IILax/P0/v;ILjava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    if-nez p6, :cond_4e

    .line 56
    .line 57
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_42

    .line 62
    .line 63
    iget p1, p0, Landroidx/media3/exoplayer/hls/l;->F0:I

    .line 64
    .line 65
    if-nez p1, :cond_45

    .line 66
    .line 67
    :cond_42
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->k0()V

    .line 68
    .line 69
    .line 70
    :cond_45
    iget p1, p0, Landroidx/media3/exoplayer/hls/l;->F0:I

    .line 71
    .line 72
    if-lez p1, :cond_4e

    .line 73
    .line 74
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->d0:Landroidx/media3/exoplayer/hls/l$b;

    .line 75
    .line 76
    invoke-interface {p1, p0}, Lax/i1/f0$a;->i(Lax/i1/f0;)V

    .line 77
    .line 78
    .line 79
    :cond_4e
    return-void
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

.method public a(Landroidx/media3/exoplayer/p0;)Z
    .registers 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_d3

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 9
    .line 10
    invoke-virtual {v1}, Lax/m1/o;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_d3

    .line 15
    .line 16
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 17
    .line 18
    invoke-virtual {v1}, Lax/m1/o;->h()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_19

    .line 23
    .line 24
    goto/16 :goto_d3

    .line 25
    .line 26
    :cond_19
    invoke-direct {v0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_38

    .line 31
    .line 32
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iget-wide v3, v0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 35
    .line 36
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 37
    .line 38
    array-length v6, v5

    .line 39
    const/4 v7, 0x0

    .line 40
    :goto_27
    if-ge v7, v6, :cond_33

    .line 41
    .line 42
    aget-object v8, v5, v7

    .line 43
    .line 44
    iget-wide v9, v0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 45
    .line 46
    invoke-virtual {v8, v9, v10}, Lax/i1/d0;->Y(J)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v7, v7, 0x1

    .line 50
    .line 51
    goto :goto_27

    .line 52
    :cond_33
    move-object/from16 v16, v1

    .line 53
    .line 54
    move-wide v12, v3

    .line 55
    move-wide v14, v12

    .line 56
    goto :goto_75

    .line 57
    :cond_38
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->p0:Ljava/util/List;

    .line 58
    .line 59
    invoke-direct {v0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/e;->q()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_50

    .line 68
    .line 69
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_4b

    .line 74
    .line 75
    goto :goto_50

    .line 76
    :cond_4b
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/e;->n()J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    goto :goto_58

    .line 81
    :cond_50
    :goto_50
    iget-wide v4, v0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 82
    .line 83
    iget-wide v6, v3, Lax/j1/b;->g:J

    .line 84
    .line 85
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    :goto_58
    iget-wide v5, v0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 90
    .line 91
    iget-boolean v7, v0, Landroidx/media3/exoplayer/hls/l;->D0:Z

    .line 92
    .line 93
    if-eqz v7, :cond_71

    .line 94
    .line 95
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 96
    .line 97
    array-length v8, v7

    .line 98
    const/4 v9, 0x0

    .line 99
    :goto_62
    if-ge v9, v8, :cond_71

    .line 100
    .line 101
    aget-object v10, v7, v9

    .line 102
    .line 103
    invoke-virtual {v10}, Lax/i1/d0;->y()J

    .line 104
    .line 105
    .line 106
    move-result-wide v10

    .line 107
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    add-int/lit8 v9, v9, 0x1

    .line 112
    .line 113
    goto :goto_62

    .line 114
    :cond_71
    move-object/from16 v16, v1

    .line 115
    .line 116
    move-wide v12, v3

    .line 117
    move-wide v14, v5

    .line 118
    :goto_75
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->n0:Landroidx/media3/exoplayer/hls/c$b;

    .line 119
    .line 120
    invoke-virtual {v1}, Landroidx/media3/exoplayer/hls/c$b;->a()V

    .line 121
    .line 122
    .line 123
    iget-object v10, v0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 124
    .line 125
    iget-boolean v1, v0, Landroidx/media3/exoplayer/hls/l;->E0:Z

    .line 126
    .line 127
    const/4 v3, 0x1

    .line 128
    if-nez v1, :cond_8b

    .line 129
    .line 130
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_88

    .line 135
    .line 136
    goto :goto_8b

    .line 137
    :cond_88
    const/16 v17, 0x0

    .line 138
    .line 139
    goto :goto_8d

    .line 140
    :cond_8b
    :goto_8b
    const/16 v17, 0x1

    .line 141
    .line 142
    :goto_8d
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->n0:Landroidx/media3/exoplayer/hls/c$b;

    .line 143
    .line 144
    move-object/from16 v11, p1

    .line 145
    .line 146
    move-object/from16 v18, v1

    .line 147
    .line 148
    invoke-virtual/range {v10 .. v18}, Landroidx/media3/exoplayer/hls/c;->f(Landroidx/media3/exoplayer/p0;JJLjava/util/List;ZLandroidx/media3/exoplayer/hls/c$b;)V

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->n0:Landroidx/media3/exoplayer/hls/c$b;

    .line 152
    .line 153
    iget-boolean v4, v1, Landroidx/media3/exoplayer/hls/c$b;->b:Z

    .line 154
    .line 155
    iget-object v5, v1, Landroidx/media3/exoplayer/hls/c$b;->a:Lax/j1/b;

    .line 156
    .line 157
    iget-object v1, v1, Landroidx/media3/exoplayer/hls/c$b;->c:Landroid/net/Uri;

    .line 158
    .line 159
    if-eqz v4, :cond_aa

    .line 160
    .line 161
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    iput-wide v1, v0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 167
    .line 168
    iput-boolean v3, v0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 169
    .line 170
    return v3

    .line 171
    :cond_aa
    if-nez v5, :cond_b4

    .line 172
    .line 173
    if-eqz v1, :cond_b3

    .line 174
    .line 175
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/l;->d0:Landroidx/media3/exoplayer/hls/l$b;

    .line 176
    .line 177
    invoke-interface {v3, v1}, Landroidx/media3/exoplayer/hls/l$b;->k(Landroid/net/Uri;)V

    .line 178
    .line 179
    .line 180
    :cond_b3
    return v2

    .line 181
    :cond_b4
    invoke-static {v5}, Landroidx/media3/exoplayer/hls/l;->Q(Lax/j1/b;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_c3

    .line 186
    .line 187
    move-object v1, v5

    .line 188
    check-cast v1, Landroidx/media3/exoplayer/hls/e;

    .line 189
    .line 190
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/hls/l;->V(Landroidx/media3/exoplayer/hls/e;)V

    .line 191
    .line 192
    .line 193
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/hls/l;->P(Landroidx/media3/exoplayer/hls/e;)V

    .line 194
    .line 195
    .line 196
    :cond_c3
    iput-object v5, v0, Landroidx/media3/exoplayer/hls/l;->v0:Lax/j1/b;

    .line 197
    .line 198
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 199
    .line 200
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->j0:Lax/m1/m;

    .line 201
    .line 202
    iget v4, v5, Lax/j1/b;->c:I

    .line 203
    .line 204
    invoke-interface {v2, v4}, Lax/m1/m;->c(I)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-virtual {v1, v5, v0, v2}, Lax/m1/o;->n(Lax/m1/o$e;Lax/m1/o$b;I)J

    .line 209
    .line 210
    .line 211
    return v3

    .line 212
    :cond_d3
    :goto_d3
    return v2
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

.method public a0(Lax/j1/b;JJ)V
    .registers 19

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v0:Lax/j1/b;

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/c;->t(Lax/j1/b;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lax/i1/y;

    .line 10
    .line 11
    iget-wide v2, p1, Lax/j1/b;->a:J

    .line 12
    .line 13
    iget-object v4, p1, Lax/j1/b;->b:Lax/U0/k;

    .line 14
    .line 15
    invoke-virtual {p1}, Lax/j1/b;->f()Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {p1}, Lax/j1/b;->e()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {p1}, Lax/j1/b;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v11

    .line 27
    move-wide v7, p2

    .line 28
    move-wide/from16 v9, p4

    .line 29
    .line 30
    invoke-direct/range {v1 .. v12}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j0:Lax/m1/m;

    .line 34
    .line 35
    iget-wide v2, p1, Lax/j1/b;->a:J

    .line 36
    .line 37
    invoke-interface {v0, v2, v3}, Lax/m1/m;->a(J)V

    .line 38
    .line 39
    .line 40
    move-object v2, v1

    .line 41
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->l0:Lax/i1/N$a;

    .line 42
    .line 43
    iget v3, p1, Lax/j1/b;->c:I

    .line 44
    .line 45
    iget v4, p0, Landroidx/media3/exoplayer/hls/l;->c0:I

    .line 46
    .line 47
    iget-object v5, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 48
    .line 49
    iget v6, p1, Lax/j1/b;->e:I

    .line 50
    .line 51
    iget-object v7, p1, Lax/j1/b;->f:Ljava/lang/Object;

    .line 52
    .line 53
    iget-wide v8, p1, Lax/j1/b;->g:J

    .line 54
    .line 55
    iget-wide v10, p1, Lax/j1/b;->h:J

    .line 56
    .line 57
    invoke-virtual/range {v1 .. v11}, Lax/i1/N$a;->p(Lax/i1/y;IILax/P0/v;ILjava/lang/Object;JJ)V

    .line 58
    .line 59
    .line 60
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->E0:Z

    .line 61
    .line 62
    if-nez p1, :cond_52

    .line 63
    .line 64
    new-instance p1, Landroidx/media3/exoplayer/p0$b;

    .line 65
    .line 66
    invoke-direct {p1}, Landroidx/media3/exoplayer/p0$b;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 70
    .line 71
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/p0$b;->f(J)Landroidx/media3/exoplayer/p0$b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroidx/media3/exoplayer/p0$b;->d()Landroidx/media3/exoplayer/p0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/l;->a(Landroidx/media3/exoplayer/p0;)Z

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_52
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->d0:Landroidx/media3/exoplayer/hls/l$b;

    .line 84
    .line 85
    invoke-interface {p1, p0}, Lax/i1/f0$a;->i(Lax/i1/f0;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public b()J
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_9
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    const-wide/high16 v0, -0x8000000000000000L

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_10
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v0, v0, Lax/j1/b;->h:J

    .line 22
    .line 23
    return-wide v0
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

.method public b0(Lax/j1/b;JJLjava/io/IOException;I)Lax/m1/o$c;
    .registers 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v13, p6

    .line 6
    .line 7
    invoke-static {v1}, Landroidx/media3/exoplayer/hls/l;->Q(Lax/j1/b;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_29

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, Landroidx/media3/exoplayer/hls/e;

    .line 15
    .line 16
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_29

    .line 21
    .line 22
    instance-of v3, v13, Lax/U0/u;

    .line 23
    .line 24
    if-eqz v3, :cond_29

    .line 25
    .line 26
    move-object v3, v13

    .line 27
    check-cast v3, Lax/U0/u;

    .line 28
    .line 29
    iget v3, v3, Lax/U0/u;->e0:I

    .line 30
    .line 31
    const/16 v4, 0x19a

    .line 32
    .line 33
    if-eq v3, v4, :cond_26

    .line 34
    .line 35
    const/16 v4, 0x194

    .line 36
    .line 37
    if-ne v3, v4, :cond_29

    .line 38
    .line 39
    :cond_26
    sget-object v1, Lax/m1/o;->d:Lax/m1/o$c;

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_29
    invoke-virtual {v1}, Lax/j1/b;->b()J

    .line 43
    .line 44
    .line 45
    move-result-wide v24

    .line 46
    new-instance v14, Lax/i1/y;

    .line 47
    .line 48
    iget-wide v3, v1, Lax/j1/b;->a:J

    .line 49
    .line 50
    iget-object v5, v1, Lax/j1/b;->b:Lax/U0/k;

    .line 51
    .line 52
    invoke-virtual {v1}, Lax/j1/b;->f()Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v18

    .line 56
    invoke-virtual {v1}, Lax/j1/b;->e()Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v19

    .line 60
    move-wide/from16 v20, p2

    .line 61
    .line 62
    move-wide/from16 v22, p4

    .line 63
    .line 64
    move-wide v15, v3

    .line 65
    move-object/from16 v17, v5

    .line 66
    .line 67
    invoke-direct/range {v14 .. v25}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 68
    .line 69
    .line 70
    new-instance v3, Lax/i1/B;

    .line 71
    .line 72
    iget v4, v1, Lax/j1/b;->c:I

    .line 73
    .line 74
    iget v5, v0, Landroidx/media3/exoplayer/hls/l;->c0:I

    .line 75
    .line 76
    iget-object v6, v1, Lax/j1/b;->d:Lax/P0/v;

    .line 77
    .line 78
    iget v7, v1, Lax/j1/b;->e:I

    .line 79
    .line 80
    iget-object v8, v1, Lax/j1/b;->f:Ljava/lang/Object;

    .line 81
    .line 82
    iget-wide v9, v1, Lax/j1/b;->g:J

    .line 83
    .line 84
    invoke-static {v9, v10}, Lax/S0/d0;->E1(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    iget-wide v11, v1, Lax/j1/b;->h:J

    .line 89
    .line 90
    invoke-static {v11, v12}, Lax/S0/d0;->E1(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v11

    .line 94
    invoke-direct/range {v3 .. v12}, Lax/i1/B;-><init>(IILax/P0/v;ILjava/lang/Object;JJ)V

    .line 95
    .line 96
    .line 97
    new-instance v4, Lax/m1/m$c;

    .line 98
    .line 99
    move/from16 v5, p7

    .line 100
    .line 101
    invoke-direct {v4, v14, v3, v13, v5}, Lax/m1/m$c;-><init>(Lax/i1/y;Lax/i1/B;Ljava/io/IOException;I)V

    .line 102
    .line 103
    .line 104
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/l;->j0:Lax/m1/m;

    .line 105
    .line 106
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 107
    .line 108
    invoke-virtual {v5}, Landroidx/media3/exoplayer/hls/c;->m()Lax/l1/D;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-static {v5}, Lax/l1/I;->c(Lax/l1/D;)Lax/m1/m$a;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-interface {v3, v5, v4}, Lax/m1/m;->d(Lax/m1/m$a;Lax/m1/m$c;)Lax/m1/m$b;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const/4 v5, 0x0

    .line 121
    if-eqz v3, :cond_89

    .line 122
    .line 123
    iget v6, v3, Lax/m1/m$b;->a:I

    .line 124
    .line 125
    const/4 v7, 0x2

    .line 126
    if-ne v6, v7, :cond_89

    .line 127
    .line 128
    iget-object v6, v0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 129
    .line 130
    iget-wide v7, v3, Lax/m1/m$b;->b:J

    .line 131
    .line 132
    invoke-virtual {v6, v1, v7, v8}, Landroidx/media3/exoplayer/hls/c;->q(Lax/j1/b;J)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    move v15, v3

    .line 137
    goto :goto_8a

    .line 138
    :cond_89
    const/4 v15, 0x0

    .line 139
    :goto_8a
    if-eqz v15, :cond_c5

    .line 140
    .line 141
    if-eqz v2, :cond_c0

    .line 142
    .line 143
    const-wide/16 v2, 0x0

    .line 144
    .line 145
    cmp-long v4, v24, v2

    .line 146
    .line 147
    if-nez v4, :cond_c0

    .line 148
    .line 149
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    const/4 v4, 0x1

    .line 156
    sub-int/2addr v3, v4

    .line 157
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Landroidx/media3/exoplayer/hls/e;

    .line 162
    .line 163
    if-ne v2, v1, :cond_a5

    .line 164
    .line 165
    const/4 v5, 0x1

    .line 166
    :cond_a5
    invoke-static {v5}, Lax/S0/a;->g(Z)V

    .line 167
    .line 168
    .line 169
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_b5

    .line 176
    .line 177
    iget-wide v2, v0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 178
    .line 179
    iput-wide v2, v0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 180
    .line 181
    goto :goto_c0

    .line 182
    :cond_b5
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-static {v2}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Landroidx/media3/exoplayer/hls/e;

    .line 189
    .line 190
    invoke-virtual {v2}, Landroidx/media3/exoplayer/hls/e;->p()V

    .line 191
    .line 192
    .line 193
    :cond_c0
    :goto_c0
    sget-object v2, Lax/m1/o;->f:Lax/m1/o$c;

    .line 194
    .line 195
    :goto_c2
    move-object/from16 v16, v2

    .line 196
    .line 197
    goto :goto_dc

    .line 198
    :cond_c5
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->j0:Lax/m1/m;

    .line 199
    .line 200
    invoke-interface {v2, v4}, Lax/m1/m;->b(Lax/m1/m$c;)J

    .line 201
    .line 202
    .line 203
    move-result-wide v2

    .line 204
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    cmp-long v4, v2, v6

    .line 210
    .line 211
    if-eqz v4, :cond_d9

    .line 212
    .line 213
    invoke-static {v5, v2, v3}, Lax/m1/o;->g(ZJ)Lax/m1/o$c;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    goto :goto_c2

    .line 218
    :cond_d9
    sget-object v2, Lax/m1/o;->g:Lax/m1/o$c;

    .line 219
    .line 220
    goto :goto_c2

    .line 221
    :goto_dc
    invoke-virtual/range {v16 .. v16}, Lax/m1/o$c;->c()Z

    .line 222
    .line 223
    .line 224
    move-result v17

    .line 225
    move-object v3, v14

    .line 226
    xor-int/lit8 v14, v17, 0x1

    .line 227
    .line 228
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->l0:Lax/i1/N$a;

    .line 229
    .line 230
    iget v4, v1, Lax/j1/b;->c:I

    .line 231
    .line 232
    iget v5, v0, Landroidx/media3/exoplayer/hls/l;->c0:I

    .line 233
    .line 234
    iget-object v6, v1, Lax/j1/b;->d:Lax/P0/v;

    .line 235
    .line 236
    iget v7, v1, Lax/j1/b;->e:I

    .line 237
    .line 238
    iget-object v8, v1, Lax/j1/b;->f:Ljava/lang/Object;

    .line 239
    .line 240
    iget-wide v9, v1, Lax/j1/b;->g:J

    .line 241
    .line 242
    iget-wide v11, v1, Lax/j1/b;->h:J

    .line 243
    .line 244
    invoke-virtual/range {v2 .. v14}, Lax/i1/N$a;->r(Lax/i1/y;IILax/P0/v;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 245
    .line 246
    .line 247
    if-nez v17, :cond_102

    .line 248
    .line 249
    const/4 v2, 0x0

    .line 250
    iput-object v2, v0, Landroidx/media3/exoplayer/hls/l;->v0:Lax/j1/b;

    .line 251
    .line 252
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->j0:Lax/m1/m;

    .line 253
    .line 254
    iget-wide v3, v1, Lax/j1/b;->a:J

    .line 255
    .line 256
    invoke-interface {v2, v3, v4}, Lax/m1/m;->a(J)V

    .line 257
    .line 258
    .line 259
    :cond_102
    if-eqz v15, :cond_120

    .line 260
    .line 261
    iget-boolean v1, v0, Landroidx/media3/exoplayer/hls/l;->E0:Z

    .line 262
    .line 263
    if-nez v1, :cond_11b

    .line 264
    .line 265
    new-instance v1, Landroidx/media3/exoplayer/p0$b;

    .line 266
    .line 267
    invoke-direct {v1}, Landroidx/media3/exoplayer/p0$b;-><init>()V

    .line 268
    .line 269
    .line 270
    iget-wide v2, v0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 271
    .line 272
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/p0$b;->f(J)Landroidx/media3/exoplayer/p0$b;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v1}, Landroidx/media3/exoplayer/p0$b;->d()Landroidx/media3/exoplayer/p0;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/hls/l;->a(Landroidx/media3/exoplayer/p0;)Z

    .line 281
    .line 282
    .line 283
    return-object v16

    .line 284
    :cond_11b
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->d0:Landroidx/media3/exoplayer/hls/l$b;

    .line 285
    .line 286
    invoke-interface {v1, v0}, Lax/i1/f0$a;->i(Lax/i1/f0;)V

    .line 287
    .line 288
    .line 289
    :cond_120
    return-object v16
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

.method public c()Z
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/m1/o;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public c0(Lax/j1/b;JJI)V
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez p6, :cond_13

    .line 6
    .line 7
    new-instance v2, Lax/i1/y;

    .line 8
    .line 9
    iget-wide v3, v1, Lax/j1/b;->a:J

    .line 10
    .line 11
    iget-object v5, v1, Lax/j1/b;->b:Lax/U0/k;

    .line 12
    .line 13
    move-wide/from16 v6, p2

    .line 14
    .line 15
    invoke-direct/range {v2 .. v7}, Lax/i1/y;-><init>(JLax/U0/k;J)V

    .line 16
    .line 17
    .line 18
    move-object v5, v2

    .line 19
    goto :goto_2d

    .line 20
    :cond_13
    new-instance v3, Lax/i1/y;

    .line 21
    .line 22
    iget-wide v4, v1, Lax/j1/b;->a:J

    .line 23
    .line 24
    iget-object v6, v1, Lax/j1/b;->b:Lax/U0/k;

    .line 25
    .line 26
    invoke-virtual {v1}, Lax/j1/b;->f()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v1}, Lax/j1/b;->e()Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v1}, Lax/j1/b;->b()J

    .line 35
    .line 36
    .line 37
    move-result-wide v13

    .line 38
    move-wide/from16 v9, p2

    .line 39
    .line 40
    move-wide/from16 v11, p4

    .line 41
    .line 42
    invoke-direct/range {v3 .. v14}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 43
    .line 44
    .line 45
    move-object v5, v3

    .line 46
    :goto_2d
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/l;->l0:Lax/i1/N$a;

    .line 47
    .line 48
    iget v6, v1, Lax/j1/b;->c:I

    .line 49
    .line 50
    iget v7, v0, Landroidx/media3/exoplayer/hls/l;->c0:I

    .line 51
    .line 52
    iget-object v8, v1, Lax/j1/b;->d:Lax/P0/v;

    .line 53
    .line 54
    iget v9, v1, Lax/j1/b;->e:I

    .line 55
    .line 56
    iget-object v10, v1, Lax/j1/b;->f:Ljava/lang/Object;

    .line 57
    .line 58
    iget-wide v11, v1, Lax/j1/b;->g:J

    .line 59
    .line 60
    iget-wide v13, v1, Lax/j1/b;->h:J

    .line 61
    .line 62
    move/from16 v15, p6

    .line 63
    .line 64
    invoke-virtual/range {v4 .. v15}, Lax/i1/N$a;->v(Lax/i1/y;IILax/P0/v;ILjava/lang/Object;JJI)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public d()J
    .registers 8

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_7
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_10
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 18
    .line 19
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroidx/media3/exoplayer/hls/e;->q()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1d

    .line 28
    .line 29
    goto :goto_36

    .line 30
    :cond_1d
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-le v2, v3, :cond_35

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/lit8 v3, v3, -0x2

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroidx/media3/exoplayer/hls/e;

    .line 52
    .line 53
    goto :goto_36

    .line 54
    :cond_35
    const/4 v2, 0x0

    .line 55
    :goto_36
    if-eqz v2, :cond_3e

    .line 56
    .line 57
    iget-wide v2, v2, Lax/j1/b;->h:J

    .line 58
    .line 59
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    :cond_3e
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/l;->D0:Z

    .line 64
    .line 65
    if-eqz v2, :cond_55

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 68
    .line 69
    array-length v3, v2

    .line 70
    const/4 v4, 0x0

    .line 71
    :goto_46
    if-ge v4, v3, :cond_55

    .line 72
    .line 73
    aget-object v5, v2, v4

    .line 74
    .line 75
    invoke-virtual {v5}, Lax/i1/d0;->x()J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_46

    .line 86
    :cond_55
    return-wide v0
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
.end method

.method public d0()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->y0:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

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

.method public e(J)V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/m1/o;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_6a

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    goto :goto_6a

    .line 16
    :cond_f
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/m1/o;->i()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2e

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v0:Lax/j1/b;

    .line 25
    .line 26
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->v0:Lax/j1/b;

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->p0:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/media3/exoplayer/hls/c;->z(JLax/j1/b;Ljava/util/List;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_6a

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/m1/o;->e()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->p0:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    :goto_34
    if-lez v0, :cond_4c

    .line 54
    .line 55
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 56
    .line 57
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->p0:Ljava/util/List;

    .line 58
    .line 59
    add-int/lit8 v3, v0, -0x1

    .line 60
    .line 61
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Landroidx/media3/exoplayer/hls/e;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/hls/c;->d(Landroidx/media3/exoplayer/hls/e;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x2

    .line 72
    if-ne v1, v2, :cond_4c

    .line 73
    .line 74
    add-int/lit8 v0, v0, -0x1

    .line 75
    .line 76
    goto :goto_34

    .line 77
    :cond_4c
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->p0:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-ge v0, v1, :cond_57

    .line 84
    .line 85
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->I(I)V

    .line 86
    .line 87
    .line 88
    :cond_57
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 89
    .line 90
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->p0:Ljava/util/List;

    .line 91
    .line 92
    invoke-virtual {v0, p1, p2, v1}, Landroidx/media3/exoplayer/hls/c;->i(JLjava/util/List;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-ge p1, p2, :cond_6a

    .line 103
    .line 104
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/l;->I(I)V

    .line 105
    .line 106
    .line 107
    :cond_6a
    :goto_6a
    return-void
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

.method public e0(Landroid/net/Uri;Lax/m1/m$c;Z)Z
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/c;->s(Landroid/net/Uri;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_a
    if-nez p3, :cond_26

    .line 12
    .line 13
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/l;->j0:Lax/m1/m;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/c;->m()Lax/l1/D;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lax/l1/I;->c(Lax/l1/D;)Lax/m1/m$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p3, v0, p2}, Lax/m1/m;->d(Lax/m1/m$a;Lax/m1/m$c;)Lax/m1/m$b;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-eqz p2, :cond_26

    .line 30
    .line 31
    iget p3, p2, Lax/m1/m$b;->a:I

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    if-ne p3, v0, :cond_26

    .line 35
    .line 36
    iget-wide p2, p2, Lax/m1/m$b;->b:J

    .line 37
    .line 38
    goto :goto_2b

    .line 39
    :cond_26
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    :goto_2b
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/hls/c;->u(Landroid/net/Uri;J)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1
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

.method public f()V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_4
    if-ge v2, v1, :cond_e

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lax/i1/d0;->Q()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_4

    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public f0()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    goto :goto_4b

    .line 10
    :cond_9
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {v0}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/hls/c;->d(Landroidx/media3/exoplayer/hls/e;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v1, v2, :cond_2a

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_4b

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/hls/c;->j(Landroidx/media3/exoplayer/hls/e;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/hls/e;->w(J)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    if-nez v1, :cond_37

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->s0:Landroid/os/Handler;

    .line 46
    .line 47
    new-instance v2, Landroidx/media3/exoplayer/hls/i;

    .line 48
    .line 49
    invoke-direct {v2, p0, v0}, Landroidx/media3/exoplayer/hls/i;-><init>(Landroidx/media3/exoplayer/hls/l;Landroidx/media3/exoplayer/hls/e;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    const/4 v0, 0x2

    .line 57
    if-ne v1, v0, :cond_4b

    .line 58
    .line 59
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 60
    .line 61
    if-nez v0, :cond_4b

    .line 62
    .line 63
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 64
    .line 65
    invoke-virtual {v0}, Lax/m1/o;->i()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4b

    .line 70
    .line 71
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 72
    .line 73
    invoke-virtual {v0}, Lax/m1/o;->e()V

    .line 74
    .line 75
    .line 76
    :cond_4b
    :goto_4b
    return-void
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
.end method

.method public h(Lax/q1/N;)V
    .registers 2

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
    .line 22
.end method

.method public varargs h0([Lax/P0/P;I[I)V
    .registers 8

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/l;->G([Lax/P0/P;)Lax/i1/q0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->K0:Ljava/util/Set;

    .line 13
    .line 14
    array-length p1, p3

    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_f
    if-ge v0, p1, :cond_21

    .line 17
    .line 18
    aget v1, p3, v0

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->K0:Ljava/util/Set;

    .line 21
    .line 22
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 23
    .line 24
    invoke-virtual {v3, v1}, Lax/i1/q0;->c(I)Lax/P0/P;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_f

    .line 34
    :cond_21
    iput p2, p0, Landroidx/media3/exoplayer/hls/l;->M0:I

    .line 35
    .line 36
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->s0:Landroid/os/Handler;

    .line 37
    .line 38
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/l;->d0:Landroidx/media3/exoplayer/hls/l$b;

    .line 39
    .line 40
    invoke-static {p2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    new-instance p3, Lax/c1/g;

    .line 44
    .line 45
    invoke-direct {p3, p2}, Lax/c1/g;-><init>(Landroidx/media3/exoplayer/hls/l$b;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->p0()V

    .line 52
    .line 53
    .line 54
    return-void
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

.method public i(Lax/P0/v;)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->s0:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->q0:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
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

.method public i0(ILax/Y0/O;Lax/V0/i;I)I
    .registers 15

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x3

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_53

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_12
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    add-int/lit8 v3, v3, -0x1

    .line 26
    .line 27
    if-ge v0, v3, :cond_2d

    .line 28
    .line 29
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroidx/media3/exoplayer/hls/e;

    .line 36
    .line 37
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/hls/l;->K(Landroidx/media3/exoplayer/hls/e;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2d

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_12

    .line 46
    :cond_2d
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v3, v2, v0}, Lax/S0/d0;->l1(Ljava/util/List;II)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 58
    .line 59
    iget-object v5, v0, Lax/j1/b;->d:Lax/P0/v;

    .line 60
    .line 61
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->H0:Lax/P0/v;

    .line 62
    .line 63
    invoke-virtual {v5, v3}, Lax/P0/v;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_51

    .line 68
    .line 69
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->l0:Lax/i1/N$a;

    .line 70
    .line 71
    iget v4, p0, Landroidx/media3/exoplayer/hls/l;->c0:I

    .line 72
    .line 73
    iget v6, v0, Lax/j1/b;->e:I

    .line 74
    .line 75
    iget-object v7, v0, Lax/j1/b;->f:Ljava/lang/Object;

    .line 76
    .line 77
    iget-wide v8, v0, Lax/j1/b;->g:J

    .line 78
    .line 79
    invoke-virtual/range {v3 .. v9}, Lax/i1/N$a;->j(ILax/P0/v;ILjava/lang/Object;J)V

    .line 80
    .line 81
    .line 82
    :cond_51
    iput-object v5, p0, Landroidx/media3/exoplayer/hls/l;->H0:Lax/P0/v;

    .line 83
    .line 84
    :cond_53
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_6a

    .line 91
    .line 92
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_6a

    .line 105
    .line 106
    return v1

    .line 107
    :cond_6a
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 108
    .line 109
    aget-object v0, v0, p1

    .line 110
    .line 111
    iget-boolean v1, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 112
    .line 113
    invoke-virtual {v0, p2, p3, p4, v1}, Lax/i1/d0;->P(Lax/Y0/O;Lax/V0/i;IZ)I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    const/4 p4, -0x5

    .line 118
    if-ne p3, p4, :cond_c7

    .line 119
    .line 120
    iget-object p4, p2, Lax/Y0/O;->b:Lax/P0/v;

    .line 121
    .line 122
    invoke-static {p4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    check-cast p4, Lax/P0/v;

    .line 127
    .line 128
    iget v0, p0, Landroidx/media3/exoplayer/hls/l;->C0:I

    .line 129
    .line 130
    if-ne p1, v0, :cond_c5

    .line 131
    .line 132
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 133
    .line 134
    aget-object p1, v0, p1

    .line 135
    .line 136
    invoke-virtual {p1}, Lax/i1/d0;->N()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    invoke-static {v0, v1}, Lax/u7/f;->e(J)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    :goto_8f
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-ge v2, v0, :cond_a6

    .line 151
    .line 152
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 159
    .line 160
    iget v0, v0, Landroidx/media3/exoplayer/hls/e;->k:I

    .line 161
    .line 162
    if-eq v0, p1, :cond_a6

    .line 163
    .line 164
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    goto :goto_8f

    .line 167
    :cond_a6
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-ge v2, p1, :cond_b9

    .line 174
    .line 175
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    check-cast p1, Landroidx/media3/exoplayer/hls/e;

    .line 182
    .line 183
    iget-object p1, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 184
    .line 185
    goto :goto_c1

    .line 186
    :cond_b9
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->G0:Lax/P0/v;

    .line 187
    .line 188
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lax/P0/v;

    .line 193
    .line 194
    :goto_c1
    invoke-virtual {p4, p1}, Lax/P0/v;->m(Lax/P0/v;)Lax/P0/v;

    .line 195
    .line 196
    .line 197
    move-result-object p4

    .line 198
    :cond_c5
    iput-object p4, p2, Lax/Y0/O;->b:Lax/P0/v;

    .line 199
    .line 200
    :cond_c7
    return p3
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
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method public bridge synthetic j(Lax/m1/o$e;JJLjava/io/IOException;I)Lax/m1/o$c;
    .registers 8

    .line 1
    check-cast p1, Lax/j1/b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Landroidx/media3/exoplayer/hls/l;->b0(Lax/j1/b;JJLjava/io/IOException;I)Lax/m1/o$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public j0()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->E0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_12

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_8
    if-ge v2, v1, :cond_12

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3}, Lax/i1/d0;->O()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_8

    .line 19
    :cond_12
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/c;->v()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lax/m1/o;->m(Lax/m1/o$f;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->s0:Landroid/os/Handler;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->I0:Z

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->t0:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public bridge synthetic k(Lax/m1/o$e;JJI)V
    .registers 7

    .line 1
    check-cast p1, Lax/j1/b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/hls/l;->c0(Lax/j1/b;JJI)V

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

.method public l()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/l;->X()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_14

    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->E0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    goto :goto_14

    .line 13
    :cond_c
    const-string v0, "Loading finished before preparation is complete."

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v0, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    throw v0

    .line 21
    :cond_14
    :goto_14
    return-void
.end method

.method public m0(JZ)Z
    .registers 11

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_c

    .line 9
    .line 10
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/c;->n()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_30

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_16
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-ge v0, v3, :cond_30

    .line 30
    .line 31
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Landroidx/media3/exoplayer/hls/e;

    .line 38
    .line 39
    iget-wide v4, v3, Lax/j1/b;->g:J

    .line 40
    .line 41
    cmp-long v6, v4, p1

    .line 42
    .line 43
    if-nez v6, :cond_2d

    .line 44
    .line 45
    goto :goto_31

    .line 46
    :cond_2d
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_16

    .line 49
    :cond_30
    const/4 v3, 0x0

    .line 50
    :goto_31
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_46

    .line 53
    .line 54
    if-nez p3, :cond_46

    .line 55
    .line 56
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    if-nez p3, :cond_46

    .line 63
    .line 64
    invoke-direct {p0, p1, p2, v3}, Landroidx/media3/exoplayer/hls/l;->l0(JLandroidx/media3/exoplayer/hls/e;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-eqz p3, :cond_46

    .line 69
    .line 70
    return v2

    .line 71
    :cond_46
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/l;->R0:J

    .line 72
    .line 73
    iput-boolean v2, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 81
    .line 82
    invoke-virtual {p1}, Lax/m1/o;->i()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_6e

    .line 87
    .line 88
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->D0:Z

    .line 89
    .line 90
    if-eqz p1, :cond_68

    .line 91
    .line 92
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 93
    .line 94
    array-length p2, p1

    .line 95
    :goto_5e
    if-ge v2, p2, :cond_68

    .line 96
    .line 97
    aget-object p3, p1, v2

    .line 98
    .line 99
    invoke-virtual {p3}, Lax/i1/d0;->q()V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_5e

    .line 105
    :cond_68
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 106
    .line 107
    invoke-virtual {p1}, Lax/m1/o;->e()V

    .line 108
    .line 109
    .line 110
    goto :goto_76

    .line 111
    :cond_6e
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 112
    .line 113
    invoke-virtual {p1}, Lax/m1/o;->f()V

    .line 114
    .line 115
    .line 116
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->k0()V

    .line 117
    .line 118
    .line 119
    :goto_76
    return v1
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

.method public n0([Lax/l1/D;[Z[Lax/i1/e0;[ZJZ)Z
    .registers 21

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-wide/from16 v2, p5

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->z()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/media3/exoplayer/hls/l;->F0:I

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_b
    array-length v5, p1

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v11, 0x1

    .line 15
    if-ge v4, v5, :cond_2b

    .line 16
    .line 17
    aget-object v5, v0, v4

    .line 18
    .line 19
    check-cast v5, Landroidx/media3/exoplayer/hls/h;

    .line 20
    .line 21
    if-eqz v5, :cond_28

    .line 22
    .line 23
    aget-object v7, p1, v4

    .line 24
    .line 25
    if-eqz v7, :cond_1e

    .line 26
    .line 27
    aget-boolean v7, p2, v4

    .line 28
    .line 29
    if-nez v7, :cond_28

    .line 30
    .line 31
    :cond_1e
    iget v7, p0, Landroidx/media3/exoplayer/hls/l;->F0:I

    .line 32
    .line 33
    sub-int/2addr v7, v11

    .line 34
    iput v7, p0, Landroidx/media3/exoplayer/hls/l;->F0:I

    .line 35
    .line 36
    invoke-virtual {v5}, Landroidx/media3/exoplayer/hls/h;->f()V

    .line 37
    .line 38
    .line 39
    aput-object v6, v0, v4

    .line 40
    .line 41
    :cond_28
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_b

    .line 44
    :cond_2b
    if-nez p7, :cond_3d

    .line 45
    .line 46
    iget-boolean v4, p0, Landroidx/media3/exoplayer/hls/l;->T0:Z

    .line 47
    .line 48
    if-eqz v4, :cond_34

    .line 49
    .line 50
    if-nez v1, :cond_3b

    .line 51
    .line 52
    goto :goto_3d

    .line 53
    :cond_34
    iget-wide v4, p0, Landroidx/media3/exoplayer/hls/l;->Q0:J

    .line 54
    .line 55
    cmp-long v1, v2, v4

    .line 56
    .line 57
    if-eqz v1, :cond_3b

    .line 58
    .line 59
    goto :goto_3d

    .line 60
    :cond_3b
    const/4 v1, 0x0

    .line 61
    goto :goto_3e

    .line 62
    :cond_3d
    :goto_3d
    const/4 v1, 0x1

    .line 63
    :goto_3e
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 64
    .line 65
    invoke-virtual {v4}, Landroidx/media3/exoplayer/hls/c;->m()Lax/l1/D;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    move v12, v1

    .line 70
    move-object v5, v4

    .line 71
    const/4 v1, 0x0

    .line 72
    :goto_47
    array-length v7, p1

    .line 73
    if-ge v1, v7, :cond_99

    .line 74
    .line 75
    aget-object v7, p1, v1

    .line 76
    .line 77
    if-nez v7, :cond_4f

    .line 78
    .line 79
    goto :goto_96

    .line 80
    :cond_4f
    iget-object v8, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

    .line 81
    .line 82
    invoke-interface {v7}, Lax/l1/H;->b()Lax/P0/P;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v8, v9}, Lax/i1/q0;->e(Lax/P0/P;)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    iget v9, p0, Landroidx/media3/exoplayer/hls/l;->M0:I

    .line 91
    .line 92
    if-ne v8, v9, :cond_63

    .line 93
    .line 94
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 95
    .line 96
    invoke-virtual {v5, v7}, Landroidx/media3/exoplayer/hls/c;->y(Lax/l1/D;)V

    .line 97
    .line 98
    .line 99
    move-object v5, v7

    .line 100
    :cond_63
    aget-object v7, v0, v1

    .line 101
    .line 102
    if-nez v7, :cond_96

    .line 103
    .line 104
    iget v7, p0, Landroidx/media3/exoplayer/hls/l;->F0:I

    .line 105
    .line 106
    add-int/2addr v7, v11

    .line 107
    iput v7, p0, Landroidx/media3/exoplayer/hls/l;->F0:I

    .line 108
    .line 109
    new-instance v7, Landroidx/media3/exoplayer/hls/h;

    .line 110
    .line 111
    invoke-direct {v7, p0, v8}, Landroidx/media3/exoplayer/hls/h;-><init>(Landroidx/media3/exoplayer/hls/l;I)V

    .line 112
    .line 113
    .line 114
    aput-object v7, v0, v1

    .line 115
    .line 116
    aput-boolean v11, p4, v1

    .line 117
    .line 118
    iget-object v9, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 119
    .line 120
    if-eqz v9, :cond_96

    .line 121
    .line 122
    invoke-virtual {v7}, Landroidx/media3/exoplayer/hls/h;->d()V

    .line 123
    .line 124
    .line 125
    if-nez v12, :cond_96

    .line 126
    .line 127
    iget-object v7, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 128
    .line 129
    iget-object v9, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 130
    .line 131
    aget v8, v9, v8

    .line 132
    .line 133
    aget-object v7, v7, v8

    .line 134
    .line 135
    invoke-virtual {v7}, Lax/i1/d0;->A()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_94

    .line 140
    .line 141
    invoke-virtual {v7, v2, v3, v11}, Lax/i1/d0;->W(JZ)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_94

    .line 146
    .line 147
    const/4 v7, 0x1

    .line 148
    goto :goto_95

    .line 149
    :cond_94
    const/4 v7, 0x0

    .line 150
    :goto_95
    move v12, v7

    .line 151
    :cond_96
    :goto_96
    add-int/lit8 v1, v1, 0x1

    .line 152
    .line 153
    goto :goto_47

    .line 154
    :cond_99
    iget p1, p0, Landroidx/media3/exoplayer/hls/l;->F0:I

    .line 155
    .line 156
    if-nez p1, :cond_ce

    .line 157
    .line 158
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 159
    .line 160
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/c;->v()V

    .line 161
    .line 162
    .line 163
    iput-object v6, p0, Landroidx/media3/exoplayer/hls/l;->H0:Lax/P0/v;

    .line 164
    .line 165
    iput-boolean v11, p0, Landroidx/media3/exoplayer/hls/l;->S0:Z

    .line 166
    .line 167
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 173
    .line 174
    invoke-virtual {p1}, Lax/m1/o;->i()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_ca

    .line 179
    .line 180
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->D0:Z

    .line 181
    .line 182
    if-eqz p1, :cond_c4

    .line 183
    .line 184
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 185
    .line 186
    array-length v1, p1

    .line 187
    :goto_ba
    if-ge v10, v1, :cond_c4

    .line 188
    .line 189
    aget-object v2, p1, v10

    .line 190
    .line 191
    invoke-virtual {v2}, Lax/i1/d0;->q()V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v10, v10, 0x1

    .line 195
    .line 196
    goto :goto_ba

    .line 197
    :cond_c4
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->k0:Lax/m1/o;

    .line 198
    .line 199
    invoke-virtual {p1}, Lax/m1/o;->e()V

    .line 200
    .line 201
    .line 202
    goto :goto_127

    .line 203
    :cond_ca
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->k0()V

    .line 204
    .line 205
    .line 206
    goto :goto_127

    .line 207
    :cond_ce
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-nez p1, :cond_114

    .line 214
    .line 215
    invoke-static {v5, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-nez p1, :cond_114

    .line 220
    .line 221
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->T0:Z

    .line 222
    .line 223
    if-nez p1, :cond_10f

    .line 224
    .line 225
    const-wide/16 v6, 0x0

    .line 226
    .line 227
    cmp-long p1, v2, v6

    .line 228
    .line 229
    if-gez p1, :cond_e7

    .line 230
    .line 231
    neg-long v6, v2

    .line 232
    :cond_e7
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 237
    .line 238
    invoke-virtual {v1, p1, v2, v3}, Landroidx/media3/exoplayer/hls/c;->a(Landroidx/media3/exoplayer/hls/e;J)[Lax/j1/e;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    move-object v1, v5

    .line 243
    move-wide v4, v6

    .line 244
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    iget-object v8, p0, Landroidx/media3/exoplayer/hls/l;->p0:Ljava/util/List;

    .line 250
    .line 251
    invoke-interface/range {v1 .. v9}, Lax/l1/D;->c(JJJLjava/util/List;[Lax/j1/e;)V

    .line 252
    .line 253
    .line 254
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 255
    .line 256
    invoke-virtual {v4}, Landroidx/media3/exoplayer/hls/c;->l()Lax/P0/P;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    iget-object p1, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 261
    .line 262
    invoke-virtual {v4, p1}, Lax/P0/P;->c(Lax/P0/v;)I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    invoke-interface {v1}, Lax/l1/D;->l()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eq v1, p1, :cond_114

    .line 271
    .line 272
    :cond_10f
    iput-boolean v11, p0, Landroidx/media3/exoplayer/hls/l;->S0:Z

    .line 273
    .line 274
    const/4 p1, 0x1

    .line 275
    const/4 v12, 0x1

    .line 276
    goto :goto_116

    .line 277
    :cond_114
    move/from16 p1, p7

    .line 278
    .line 279
    :goto_116
    if-eqz v12, :cond_127

    .line 280
    .line 281
    invoke-virtual {p0, v2, v3, p1}, Landroidx/media3/exoplayer/hls/l;->m0(JZ)Z

    .line 282
    .line 283
    .line 284
    :goto_11b
    array-length p1, v0

    .line 285
    if-ge v10, p1, :cond_127

    .line 286
    .line 287
    aget-object p1, v0, v10

    .line 288
    .line 289
    if-eqz p1, :cond_124

    .line 290
    .line 291
    aput-boolean v11, p4, v10

    .line 292
    .line 293
    :cond_124
    add-int/lit8 v10, v10, 0x1

    .line 294
    .line 295
    goto :goto_11b

    .line 296
    :cond_127
    :goto_127
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->u0([Lax/i1/e0;)V

    .line 297
    .line 298
    .line 299
    iput-boolean v11, p0, Landroidx/media3/exoplayer/hls/l;->T0:Z

    .line 300
    .line 301
    return v12
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
.end method

.method public o()V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->V0:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->s0:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->r0:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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

.method public o0(Lax/P0/o;)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->X0:Lax/P0/o;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1e

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->X0:Lax/P0/o;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_b
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    if-ge v0, v2, :cond_1e

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->P0:[Z

    .line 18
    .line 19
    aget-boolean v2, v2, v0

    .line 20
    .line 21
    if-eqz v2, :cond_1b

    .line 22
    .line 23
    aget-object v1, v1, v0

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroidx/media3/exoplayer/hls/l$d;->f0(Lax/P0/o;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_b

    .line 31
    :cond_1e
    return-void
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

.method public bridge synthetic p(Lax/m1/o$e;JJZ)V
    .registers 7

    .line 1
    check-cast p1, Lax/j1/b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/hls/l;->Z(Lax/j1/b;JJZ)V

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

.method public q(JLax/Y0/Z;)J
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/hls/c;->c(JLax/Y0/Z;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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

.method public q0(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->e0:Landroidx/media3/exoplayer/hls/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/c;->x(Z)V

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

.method public bridge synthetic r(Lax/m1/o$e;JJ)V
    .registers 6

    .line 1
    check-cast p1, Lax/j1/b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Landroidx/media3/exoplayer/hls/l;->a0(Lax/j1/b;JJ)V

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

.method public r0(J)V
    .registers 7

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->W0:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-eqz v2, :cond_16

    .line 6
    .line 7
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/l;->W0:J

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_c
    if-ge v2, v1, :cond_16

    .line 14
    .line 15
    aget-object v3, v0, v2

    .line 16
    .line 17
    invoke-virtual {v3, p1, p2}, Lax/i1/d0;->X(J)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_c

    .line 23
    :cond_16
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
.end method

.method public s0(IJ)I
    .registers 6

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_8
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 10
    .line 11
    aget-object v0, v0, p1

    .line 12
    .line 13
    iget-boolean v1, p0, Landroidx/media3/exoplayer/hls/l;->U0:Z

    .line 14
    .line 15
    invoke-virtual {v0, p2, p3, v1}, Lax/i1/d0;->C(JZ)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/l;->o0:Ljava/util/ArrayList;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {p3, v1}, Lax/r7/F;->f(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    check-cast p3, Landroidx/media3/exoplayer/hls/e;

    .line 27
    .line 28
    if-eqz p3, :cond_30

    .line 29
    .line 30
    invoke-virtual {p3}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_30

    .line 35
    .line 36
    invoke-virtual {v0}, Lax/i1/d0;->A()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p3, p1}, Landroidx/media3/exoplayer/hls/e;->m(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    sub-int/2addr p1, v1

    .line 45
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    :cond_30
    invoke-virtual {v0, p2}, Lax/i1/d0;->b0(I)V

    .line 50
    .line 51
    .line 52
    return p2
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

.method public t()Lax/i1/q0;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->J0:Lax/i1/q0;

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

.method public t0(I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 5
    .line 6
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->L0:[I

    .line 10
    .line 11
    aget p1, v0, p1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->O0:[Z

    .line 14
    .line 15
    aget-boolean v0, v0, p1

    .line 16
    .line 17
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->O0:[Z

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aput-boolean v1, v0, p1

    .line 24
    .line 25
    return-void
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

.method public u(II)Lax/q1/U;
    .registers 6

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/l;->Z0:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_11

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/hls/l;->N(II)Lax/q1/U;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_24

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    :goto_12
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 20
    .line 21
    array-length v2, v1

    .line 22
    if-ge v0, v2, :cond_23

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->x0:[I

    .line 25
    .line 26
    aget v2, v2, v0

    .line 27
    .line 28
    if-ne v2, p1, :cond_20

    .line 29
    .line 30
    aget-object v0, v1, v0

    .line 31
    .line 32
    goto :goto_24

    .line 33
    :cond_20
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_12

    .line 36
    :cond_23
    const/4 v0, 0x0

    .line 37
    :goto_24
    if-nez v0, :cond_33

    .line 38
    .line 39
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->V0:Z

    .line 40
    .line 41
    if-eqz v0, :cond_2f

    .line 42
    .line 43
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/hls/l;->E(II)Lax/q1/o;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_2f
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/hls/l;->F(II)Lax/i1/d0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_33
    const/4 p1, 0x5

    .line 53
    if-ne p2, p1, :cond_46

    .line 54
    .line 55
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->A0:Lax/q1/U;

    .line 56
    .line 57
    if-nez p1, :cond_43

    .line 58
    .line 59
    new-instance p1, Landroidx/media3/exoplayer/hls/l$c;

    .line 60
    .line 61
    iget p2, p0, Landroidx/media3/exoplayer/hls/l;->m0:I

    .line 62
    .line 63
    invoke-direct {p1, v0, p2}, Landroidx/media3/exoplayer/hls/l$c;-><init>(Lax/q1/U;I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->A0:Lax/q1/U;

    .line 67
    .line 68
    :cond_43
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->A0:Lax/q1/U;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_46
    return-object v0
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

.method public v(JZ)V
    .registers 8

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1f

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_1f

    .line 12
    :cond_b
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 13
    .line 14
    array-length v0, v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_f
    if-ge v1, v0, :cond_1f

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->w0:[Landroidx/media3/exoplayer/hls/l$d;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->O0:[Z

    .line 23
    .line 24
    aget-boolean v3, v3, v1

    .line 25
    .line 26
    invoke-virtual {v2, p1, p2, p3, v3}, Lax/i1/d0;->p(JZZ)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_f

    .line 32
    :cond_1f
    :goto_1f
    return-void
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
