.class public final Lax/o1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P0/Z$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o1/s$b;,
        Lax/o1/s$d;,
        Lax/o1/s$e;,
        Lax/o1/s$h;,
        Lax/o1/s$c;,
        Lax/o1/s$f;,
        Lax/o1/s$g;
    }
.end annotation


# static fields
.field private static final B:Ljava/util/concurrent/Executor;


# instance fields
.field private A:I

.field private final a:Landroid/content/Context;

.field private final b:Lax/P0/Z$a;

.field private final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lax/o1/s$d;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Z

.field private final e:Lax/o1/S;

.field private final f:Lax/o1/S$b;

.field private final g:Lax/S0/h;

.field private final h:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lax/o1/s$e;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lax/S0/L;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/S0/L<",
            "Lax/o1/s$h;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lax/P0/v;

.field private k:Lax/P0/W;

.field private l:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lax/S0/q;

.field private n:Lax/P0/Z;

.field private o:Lax/o1/z;

.field private p:Z

.field private q:Z

.field private r:J

.field private s:I

.field private t:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Landroid/view/Surface;",
            "Lax/S0/I;",
            ">;"
        }
    .end annotation
.end field

.field private u:I

.field private v:I

.field private w:J

.field private x:J

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/o1/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/o1/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/o1/s;->B:Ljava/util/concurrent/Executor;

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
.end method

.method private constructor <init>(Lax/o1/s$b;)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/o1/s$b;->a(Lax/o1/s$b;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lax/o1/s;->a:Landroid/content/Context;

    .line 4
    new-instance v0, Lax/S0/L;

    invoke-direct {v0}, Lax/S0/L;-><init>()V

    iput-object v0, p0, Lax/o1/s;->i:Lax/S0/L;

    .line 5
    invoke-static {p1}, Lax/o1/s$b;->b(Lax/o1/s$b;)Lax/P0/Z$a;

    move-result-object v0

    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lax/P0/Z$a;

    iput-object v0, p0, Lax/o1/s;->b:Lax/P0/Z$a;

    .line 6
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lax/o1/s;->c:Landroid/util/SparseArray;

    .line 7
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    move-result-object v0

    iput-object v0, p0, Lax/o1/s;->l:Lax/r7/z;

    .line 8
    sget-object v0, Lax/P0/W;->a:Lax/P0/W;

    iput-object v0, p0, Lax/o1/s;->k:Lax/P0/W;

    .line 9
    invoke-static {p1}, Lax/o1/s$b;->c(Lax/o1/s$b;)Z

    move-result v0

    iput-boolean v0, p0, Lax/o1/s;->d:Z

    .line 10
    invoke-static {p1}, Lax/o1/s$b;->d(Lax/o1/s$b;)Lax/S0/h;

    move-result-object v0

    iput-object v0, p0, Lax/o1/s;->g:Lax/S0/h;

    .line 11
    new-instance v1, Lax/o1/e;

    invoke-static {p1}, Lax/o1/s$b;->e(Lax/o1/s$b;)Lax/o1/A;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lax/o1/e;-><init>(Lax/o1/A;Lax/S0/h;)V

    iput-object v1, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 12
    new-instance p1, Lax/o1/s$a;

    invoke-direct {p1, p0}, Lax/o1/s$a;-><init>(Lax/o1/s;)V

    iput-object p1, p0, Lax/o1/s;->f:Lax/o1/S$b;

    .line 13
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lax/o1/s;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    new-instance p1, Lax/P0/v$b;

    invoke-direct {p1}, Lax/P0/v$b;-><init>()V

    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    move-result-object p1

    iput-object p1, p0, Lax/o1/s;->j:Lax/P0/v;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    iput-wide v0, p0, Lax/o1/s;->r:J

    .line 16
    iput-wide v0, p0, Lax/o1/s;->w:J

    .line 17
    iput-wide v0, p0, Lax/o1/s;->x:J

    const/4 p1, -0x1

    .line 18
    iput p1, p0, Lax/o1/s;->z:I

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lax/o1/s;->v:I

    return-void
.end method

.method synthetic constructor <init>(Lax/o1/s$b;Lax/o1/s$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/o1/s;-><init>(Lax/o1/s$b;)V

    return-void
.end method

.method private B()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/o1/S;->A()V

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

.method private D(Z)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/o1/s;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget v0, p0, Lax/o1/s;->u:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    add-int/2addr v0, v1

    .line 12
    iput v0, p0, Lax/o1/s;->u:I

    .line 13
    .line 14
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lax/o1/S;->v(Z)V

    .line 17
    .line 18
    .line 19
    :goto_12
    iget-object p1, p0, Lax/o1/s;->i:Lax/S0/L;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/S0/L;->l()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-le p1, v1, :cond_20

    .line 26
    .line 27
    iget-object p1, p0, Lax/o1/s;->i:Lax/S0/L;

    .line 28
    .line 29
    invoke-virtual {p1}, Lax/S0/L;->i()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_12

    .line 33
    :cond_20
    iget-object p1, p0, Lax/o1/s;->i:Lax/S0/L;

    .line 34
    .line 35
    invoke-virtual {p1}, Lax/S0/L;->l()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p1, v1, :cond_41

    .line 40
    .line 41
    iget-object p1, p0, Lax/o1/s;->i:Lax/S0/L;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/S0/L;->i()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lax/o1/s$h;

    .line 48
    .line 49
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lax/o1/s$h;

    .line 54
    .line 55
    iget-wide v0, p1, Lax/o1/s$h;->a:J

    .line 56
    .line 57
    iput-wide v0, p0, Lax/o1/s;->r:J

    .line 58
    .line 59
    iget p1, p1, Lax/o1/s$h;->b:I

    .line 60
    .line 61
    iput p1, p0, Lax/o1/s;->s:I

    .line 62
    .line 63
    invoke-direct {p0}, Lax/o1/s;->L()V

    .line 64
    .line 65
    .line 66
    :cond_41
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    iput-wide v0, p0, Lax/o1/s;->w:J

    .line 72
    .line 73
    iput-wide v0, p0, Lax/o1/s;->x:J

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    iput-boolean p1, p0, Lax/o1/s;->y:Z

    .line 77
    .line 78
    iget-object p1, p0, Lax/o1/s;->m:Lax/S0/q;

    .line 79
    .line 80
    invoke-static {p1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lax/S0/q;

    .line 85
    .line 86
    new-instance v0, Lax/o1/p;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lax/o1/p;-><init>(Lax/o1/s;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v0}, Lax/S0/q;->c(Ljava/lang/Runnable;)Z

    .line 92
    .line 93
    .line 94
    return-void
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

.method private E(Lax/P0/j;)Lax/P0/j;
    .registers 3

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/P0/j;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    iget-boolean v0, p0, Lax/o1/s;->q:Z

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_e

    .line 14
    :cond_d
    return-object p1

    .line 15
    :cond_e
    :goto_e
    sget-object p1, Lax/P0/j;->h:Lax/P0/j;

    .line 16
    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private G()Z
    .registers 2

    .line 1
    iget v0, p0, Lax/o1/s;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/o1/s;->y:Z

    .line 6
    .line 7
    if-eqz v0, :cond_12

    .line 8
    .line 9
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/o1/S;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method private H()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/o1/s;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method private I(Z)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    if-eqz p1, :cond_a

    .line 4
    .line 5
    iget p1, p0, Lax/o1/s;->u:I

    .line 6
    .line 7
    if-nez p1, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 p1, 0x0

    .line 12
    :goto_b
    invoke-interface {v0, p1}, Lax/o1/S;->y(Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private J(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/o1/S;->x(Z)V

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

.method private K(Landroid/view/Surface;II)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/o1/s;->n:Lax/P0/Z;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    if-eqz p1, :cond_1a

    .line 7
    .line 8
    new-instance v1, Lax/P0/M;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2, p3}, Lax/P0/M;-><init>(Landroid/view/Surface;II)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lax/P0/Z;->o(Lax/P0/M;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 17
    .line 18
    new-instance v1, Lax/S0/I;

    .line 19
    .line 20
    invoke-direct {v1, p2, p3}, Lax/S0/I;-><init>(II)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1, v1}, Lax/o1/S;->t(Landroid/view/Surface;Lax/S0/I;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    const/4 p1, 0x0

    .line 28
    invoke-interface {v0, p1}, Lax/P0/Z;->o(Lax/P0/M;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 32
    .line 33
    invoke-interface {p1}, Lax/o1/S;->u()V

    .line 34
    .line 35
    .line 36
    return-void
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

.method private L()V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    iget-object v2, p0, Lax/o1/s;->j:Lax/P0/v;

    .line 4
    .line 5
    iget-wide v3, p0, Lax/o1/s;->r:J

    .line 6
    .line 7
    iget v5, p0, Lax/o1/s;->s:I

    .line 8
    .line 9
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-interface/range {v0 .. v6}, Lax/o1/S;->r(ILax/P0/v;JILjava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private M(Lax/P0/v;I)Z
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o1/S$c;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p2, :cond_de

    .line 4
    .line 5
    iget v2, p0, Lax/o1/s;->v:I

    .line 6
    .line 7
    if-nez v2, :cond_a

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 v2, 0x0

    .line 12
    :goto_b
    invoke-static {v2}, Lax/S0/a;->g(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p1, Lax/P0/v;->E:Lax/P0/j;

    .line 16
    .line 17
    invoke-direct {p0, v2}, Lax/o1/s;->E(Lax/P0/j;)Lax/P0/j;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :try_start_14
    iget-boolean v3, p0, Lax/o1/s;->p:Z
    :try_end_16
    .catch Lax/S0/p$a; {:try_start_14 .. :try_end_16} :catch_d5

    .line 22
    .line 23
    if-eqz v3, :cond_21

    .line 24
    .line 25
    :try_start_18
    sget-object v2, Lax/P0/j;->h:Lax/P0/j;
    :try_end_1a
    .catch Lax/S0/p$a; {:try_start_18 .. :try_end_1a} :catch_1c

    .line 26
    .line 27
    :cond_1a
    :goto_1a
    move-object v4, v2

    .line 28
    goto :goto_66

    .line 29
    :catch_1c
    move-exception v0

    .line 30
    move-object p2, v0

    .line 31
    move-object v6, p0

    .line 32
    goto/16 :goto_d8

    .line 33
    .line 34
    :cond_21
    :try_start_21
    iget v3, v2, Lax/P0/j;->c:I
    :try_end_23
    .catch Lax/S0/p$a; {:try_start_21 .. :try_end_23} :catch_d5

    .line 35
    .line 36
    const/4 v4, 0x7

    .line 37
    if-ne v3, v4, :cond_40

    .line 38
    .line 39
    :try_start_26
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v4, 0x22

    .line 42
    .line 43
    if-ge v3, v4, :cond_40

    .line 44
    .line 45
    invoke-static {}, Lax/S0/p;->j()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_40

    .line 50
    .line 51
    invoke-virtual {v2}, Lax/P0/j;->a()Lax/P0/j$b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const/4 v2, 0x6

    .line 56
    invoke-virtual {v0, v2}, Lax/P0/j$b;->e(I)Lax/P0/j$b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 61
    .line 62
    .line 63
    move-result-object v2
    :try_end_3f
    .catch Lax/S0/p$a; {:try_start_26 .. :try_end_3f} :catch_1c

    .line 64
    goto :goto_1a

    .line 65
    :cond_40
    :try_start_40
    iget v3, v2, Lax/P0/j;->c:I

    .line 66
    .line 67
    invoke-static {v3}, Lax/S0/p;->k(I)Z

    .line 68
    .line 69
    .line 70
    move-result v3
    :try_end_46
    .catch Lax/S0/p$a; {:try_start_40 .. :try_end_46} :catch_d5

    .line 71
    if-nez v3, :cond_1a

    .line 72
    .line 73
    :try_start_48
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    const/16 v4, 0x1d

    .line 76
    .line 77
    if-lt v3, v4, :cond_1a

    .line 78
    .line 79
    const-string v3, "PlaybackVidGraphWrapper"

    .line 80
    .line 81
    const-string v4, "Color transfer %d is not supported. Falling back to OpenGl tone mapping."

    .line 82
    .line 83
    iget v2, v2, Lax/P0/j;->c:I

    .line 84
    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-array v5, v1, [Ljava/lang/Object;

    .line 90
    .line 91
    aput-object v2, v5, v0

    .line 92
    .line 93
    invoke-static {v4, v5}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v3, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sget-object v2, Lax/P0/j;->h:Lax/P0/j;
    :try_end_65
    .catch Lax/S0/p$a; {:try_start_48 .. :try_end_65} :catch_1c

    .line 101
    .line 102
    goto :goto_1a

    .line 103
    :goto_66
    iget-object v0, p0, Lax/o1/s;->g:Lax/S0/h;

    .line 104
    .line 105
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {v2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Landroid/os/Looper;

    .line 114
    .line 115
    const/4 v11, 0x0

    .line 116
    invoke-interface {v0, v2, v11}, Lax/S0/h;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lax/S0/q;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, p0, Lax/o1/s;->m:Lax/S0/q;

    .line 121
    .line 122
    iget-object v2, p0, Lax/o1/s;->b:Lax/P0/Z$a;

    .line 123
    .line 124
    iget-object v3, p0, Lax/o1/s;->a:Landroid/content/Context;

    .line 125
    .line 126
    sget-object v5, Lax/P0/m;->a:Lax/P0/m;

    .line 127
    .line 128
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    new-instance v7, Lax/o1/r;

    .line 132
    .line 133
    invoke-direct {v7, v0}, Lax/o1/r;-><init>(Lax/S0/q;)V

    .line 134
    .line 135
    .line 136
    const-wide/16 v8, 0x0

    .line 137
    .line 138
    const/4 v10, 0x0

    .line 139
    move-object v6, p0

    .line 140
    invoke-interface/range {v2 .. v10}, Lax/P0/Z$a;->a(Landroid/content/Context;Lax/P0/j;Lax/P0/m;Lax/P0/Z$b;Ljava/util/concurrent/Executor;JZ)Lax/P0/Z;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, v6, Lax/o1/s;->n:Lax/P0/Z;

    .line 145
    .line 146
    iget-object v2, v6, Lax/o1/s;->l:Lax/r7/z;

    .line 147
    .line 148
    invoke-interface {v0, v2}, Lax/P0/Z;->k(Ljava/util/List;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v6, Lax/o1/s;->n:Lax/P0/Z;

    .line 152
    .line 153
    iget-object v2, v6, Lax/o1/s;->k:Lax/P0/W;

    .line 154
    .line 155
    invoke-interface {v0, v2}, Lax/P0/Z;->q(Lax/P0/W;)V

    .line 156
    .line 157
    .line 158
    iget-object v0, v6, Lax/o1/s;->n:Lax/P0/Z;

    .line 159
    .line 160
    invoke-interface {v0}, Lax/P0/Z;->a()V

    .line 161
    .line 162
    .line 163
    iget-object v0, v6, Lax/o1/s;->t:Landroid/util/Pair;

    .line 164
    .line 165
    if-eqz v0, :cond_b9

    .line 166
    .line 167
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Landroid/view/Surface;

    .line 170
    .line 171
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lax/S0/I;

    .line 174
    .line 175
    invoke-virtual {v0}, Lax/S0/I;->b()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-virtual {v0}, Lax/S0/I;->a()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    invoke-direct {p0, v2, v3, v0}, Lax/o1/s;->K(Landroid/view/Surface;II)V

    .line 184
    .line 185
    .line 186
    :cond_b9
    iget-object v0, v6, Lax/o1/s;->e:Lax/o1/S;

    .line 187
    .line 188
    invoke-interface {v0, p1}, Lax/o1/S;->z(Lax/P0/v;)Z

    .line 189
    .line 190
    .line 191
    iget-object p1, v6, Lax/o1/s;->e:Lax/o1/S;

    .line 192
    .line 193
    new-instance v0, Lax/o1/s$c;

    .line 194
    .line 195
    invoke-direct {v0, p0, v11}, Lax/o1/s$c;-><init>(Lax/o1/s;Lax/o1/s$a;)V

    .line 196
    .line 197
    .line 198
    iget-object v2, v6, Lax/o1/s;->m:Lax/S0/q;

    .line 199
    .line 200
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    new-instance v3, Lax/o1/r;

    .line 204
    .line 205
    invoke-direct {v3, v2}, Lax/o1/r;-><init>(Lax/S0/q;)V

    .line 206
    .line 207
    .line 208
    invoke-interface {p1, v0, v3}, Lax/o1/S;->m(Lax/o1/S$a;Ljava/util/concurrent/Executor;)V

    .line 209
    .line 210
    .line 211
    iput v1, v6, Lax/o1/s;->v:I

    .line 212
    .line 213
    goto :goto_e6

    .line 214
    :catch_d5
    move-exception v0

    .line 215
    move-object v6, p0

    .line 216
    move-object p2, v0

    .line 217
    :goto_d8
    new-instance v0, Lax/o1/S$c;

    .line 218
    .line 219
    invoke-direct {v0, p2, p1}, Lax/o1/S$c;-><init>(Ljava/lang/Throwable;Lax/P0/v;)V

    .line 220
    .line 221
    .line 222
    throw v0

    .line 223
    :cond_de
    move-object v6, p0

    .line 224
    invoke-direct {p0}, Lax/o1/s;->H()Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-nez p1, :cond_e6

    .line 229
    .line 230
    return v0

    .line 231
    :cond_e6
    :goto_e6
    iget-object p1, v6, Lax/o1/s;->n:Lax/P0/Z;

    .line 232
    .line 233
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    check-cast p1, Lax/P0/Z;

    .line 238
    .line 239
    invoke-interface {p1, p2}, Lax/P0/Z;->l(I)V

    .line 240
    .line 241
    .line 242
    iget p1, v6, Lax/o1/s;->A:I

    .line 243
    .line 244
    add-int/2addr p1, v1

    .line 245
    iput p1, v6, Lax/o1/s;->A:I

    .line 246
    .line 247
    return v1
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

.method private O(JJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o1/S$c;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lax/o1/S;->i(JJ)V

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

.method private P(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/o1/S;->s(I)V

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

.method private R(F)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/o1/S;->g(F)V

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

.method private T(Lax/o1/z;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/o1/s;->o:Lax/o1/z;

    .line 2
    .line 3
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lax/o1/S;->p(Lax/o1/z;)V

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

.method private U()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/o1/s;->z:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_b

    .line 5
    .line 6
    iget v1, p0, Lax/o1/s;->A:I

    .line 7
    .line 8
    if-ne v0, v1, :cond_b

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private V()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/o1/S;->q()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lax/o1/s;->y:Z

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

.method public static synthetic a(Ljava/lang/Runnable;)V
    .registers 1

    .line 1
    return-void
.end method

.method public static synthetic b(Lax/o1/s;)V
    .registers 2

    .line 1
    iget v0, p0, Lax/o1/s;->u:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lax/o1/s;->u:I

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
    .line 22
.end method

.method static synthetic c(Lax/o1/s;Lax/P0/v;I)Z
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o1/S$c;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lax/o1/s;->M(Lax/P0/v;I)Z

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

.method static synthetic d(Lax/o1/s;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/o1/s;->w:J

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
    .line 22
.end method

.method static synthetic e(Lax/o1/s;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/o1/s;->w:J

    .line 2
    .line 3
    return-wide p1
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

.method static synthetic f(Lax/o1/s;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o1/s;->D(Z)V

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

.method static synthetic g(Lax/o1/s;Z)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o1/s;->I(Z)Z

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

.method static synthetic h(Lax/o1/s;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/o1/s;->x:J

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
    .line 22
.end method

.method static synthetic i(Lax/o1/s;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/o1/s;->x:J

    .line 2
    .line 3
    return-wide p1
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

.method static synthetic j(Lax/o1/s;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o1/s;->V()V

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

.method static synthetic k(Lax/o1/s;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o1/s;->G()Z

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
.end method

.method static synthetic l(Lax/o1/s;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/o1/s;->y:Z

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

.method static synthetic m(Lax/o1/s;)Lax/S0/L;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/s;->i:Lax/S0/L;

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

.method static synthetic n(Lax/o1/s;Lax/S0/L;)Lax/S0/L;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o1/s;->i:Lax/S0/L;

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

.method static synthetic o(Lax/o1/s;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o1/s;->B()V

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

.method static synthetic p(Lax/o1/s;Lax/o1/z;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o1/s;->T(Lax/o1/z;)V

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

.method static synthetic q(Lax/o1/s;F)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o1/s;->R(F)V

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

.method static synthetic r(Lax/o1/s;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o1/s;->P(I)V

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

.method static synthetic s(Lax/o1/s;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o1/s;->U()Z

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
.end method

.method static synthetic t(Lax/o1/s;JJ)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o1/S$c;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/o1/s;->O(JJ)V

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

.method static synthetic u(Lax/o1/s;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o1/s;->J(Z)V

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

.method static synthetic v(Lax/o1/s;Lax/P0/j;)Lax/P0/j;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o1/s;->E(Lax/P0/j;)Lax/P0/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method static synthetic w(Lax/o1/s;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/s;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

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

.method static synthetic x(Lax/o1/s;)Lax/P0/Z;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/s;->n:Lax/P0/Z;

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

.method static synthetic y()Ljava/util/concurrent/Executor;
    .registers 1

    .line 1
    sget-object v0, Lax/o1/s;->B:Ljava/util/concurrent/Executor;

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

.method static synthetic z(Lax/o1/s;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/o1/s;->d:Z

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


# virtual methods
.method public A(Lax/o1/s$e;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/s;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

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

.method public C()V
    .registers 4

    .line 1
    sget-object v0, Lax/S0/I;->c:Lax/S0/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/I;->b()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lax/S0/I;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {p0, v2, v1, v0}, Lax/o1/s;->K(Landroid/view/Surface;II)V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, Lax/o1/s;->t:Landroid/util/Pair;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public F(I)Lax/o1/S;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/s;->c:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/S0/d0;->r(Landroid/util/SparseArray;I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    iget-object v0, p0, Lax/o1/s;->c:Landroid/util/SparseArray;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lax/o1/S;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    new-instance v0, Lax/o1/s$d;

    .line 19
    .line 20
    iget-object v1, p0, Lax/o1/s;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-direct {v0, p0, v1, p1}, Lax/o1/s$d;-><init>(Lax/o1/s;Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    if-nez p1, :cond_1d

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lax/o1/s;->A(Lax/o1/s$e;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    iget-object v1, p0, Lax/o1/s;->c:Landroid/util/SparseArray;

    .line 31
    .line 32
    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0
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

.method public N()V
    .registers 4

    .line 1
    iget v0, p0, Lax/o1/s;->v:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_6

    .line 5
    .line 6
    return-void

    .line 7
    :cond_6
    iget-object v0, p0, Lax/o1/s;->m:Lax/S0/q;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-interface {v0, v2}, Lax/S0/q;->k(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/o1/s;->n:Lax/P0/Z;

    .line 16
    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    invoke-interface {v0}, Lax/P0/Z;->d()V

    .line 20
    .line 21
    .line 22
    :cond_15
    iput-object v2, p0, Lax/o1/s;->t:Landroid/util/Pair;

    .line 23
    .line 24
    iput v1, p0, Lax/o1/s;->v:I

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
.end method

.method public Q(Landroid/view/Surface;Lax/S0/I;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/s;->t:Landroid/util/Pair;

    .line 2
    .line 3
    if-eqz v0, :cond_1b

    .line 4
    .line 5
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/view/Surface;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1b

    .line 14
    .line 15
    iget-object v0, p0, Lax/o1/s;->t:Landroid/util/Pair;

    .line 16
    .line 17
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lax/S0/I;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lax/S0/I;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1b

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lax/o1/s;->t:Landroid/util/Pair;

    .line 33
    .line 34
    invoke-virtual {p2}, Lax/S0/I;->b()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p2}, Lax/S0/I;->a()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-direct {p0, p1, v0, p2}, Lax/o1/s;->K(Landroid/view/Surface;II)V

    .line 43
    .line 44
    .line 45
    return-void
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

.method public S(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/o1/s;->z:I

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

.method public W()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/o1/S;->n()V

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

.method public X()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/s;->e:Lax/o1/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/o1/S;->l()V

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
