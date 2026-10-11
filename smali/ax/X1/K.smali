.class public final Lax/X1/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X1/K$a;,
        Lax/X1/K$b;
    }
.end annotation


# static fields
.field public static final v:Lax/q1/x;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/S0/M;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lax/S0/G;

.field private final f:Landroid/util/SparseIntArray;

.field private final g:Lax/X1/L$c;

.field private final h:Lax/N1/t$a;

.field private final i:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lax/X1/L;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Landroid/util/SparseBooleanArray;

.field private final k:Landroid/util/SparseBooleanArray;

.field private final l:Lax/X1/I;

.field private m:Lax/X1/H;

.field private n:Lax/q1/t;

.field private o:I

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Lax/X1/L;

.field private t:I

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/X1/J;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/X1/J;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/X1/K;->v:Lax/q1/x;

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

.method public constructor <init>(IILax/N1/t$a;Lax/S0/M;Lax/X1/L$c;I)V
    .registers 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p5}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lax/X1/L$c;

    iput-object p5, p0, Lax/X1/K;->g:Lax/X1/L$c;

    .line 4
    iput p6, p0, Lax/X1/K;->c:I

    .line 5
    iput p1, p0, Lax/X1/K;->a:I

    .line 6
    iput p2, p0, Lax/X1/K;->b:I

    .line 7
    iput-object p3, p0, Lax/X1/K;->h:Lax/N1/t$a;

    const/4 p2, 0x1

    if-eq p1, p2, :cond_25

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1a

    goto :goto_25

    .line 8
    :cond_1a
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lax/X1/K;->d:Ljava/util/List;

    .line 9
    invoke-interface {p1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    .line 10
    :cond_25
    :goto_25
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lax/X1/K;->d:Ljava/util/List;

    .line 11
    :goto_2b
    new-instance p1, Lax/S0/G;

    const/16 p2, 0x24b8

    new-array p2, p2, [B

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lax/S0/G;-><init>([BI)V

    iput-object p1, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 12
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lax/X1/K;->j:Landroid/util/SparseBooleanArray;

    .line 13
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lax/X1/K;->k:Landroid/util/SparseBooleanArray;

    .line 14
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 15
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lax/X1/K;->f:Landroid/util/SparseIntArray;

    .line 16
    new-instance p1, Lax/X1/I;

    invoke-direct {p1, p6}, Lax/X1/I;-><init>(I)V

    iput-object p1, p0, Lax/X1/K;->l:Lax/X1/I;

    .line 17
    sget-object p1, Lax/q1/t;->a0:Lax/q1/t;

    iput-object p1, p0, Lax/X1/K;->n:Lax/q1/t;

    const/4 p1, -0x1

    .line 18
    iput p1, p0, Lax/X1/K;->u:I

    .line 19
    invoke-direct {p0}, Lax/X1/K;->A()V

    return-void
.end method

.method public constructor <init>(ILax/N1/t$a;)V
    .registers 10

    .line 1
    new-instance v4, Lax/S0/M;

    const-wide/16 v0, 0x0

    invoke-direct {v4, v0, v1}, Lax/S0/M;-><init>(J)V

    new-instance v5, Lax/X1/j;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lax/X1/j;-><init>(I)V

    const v6, 0x1b8a0

    const/4 v1, 0x1

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lax/X1/K;-><init>(IILax/N1/t$a;Lax/S0/M;Lax/X1/L$c;I)V

    return-void
.end method

.method private A()V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/X1/K;->j:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/X1/K;->g:Lax/X1/L$c;

    .line 12
    .line 13
    invoke-interface {v0}, Lax/X1/L$c;->a()Landroid/util/SparseArray;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_16
    if-ge v3, v1, :cond_2a

    .line 24
    .line 25
    iget-object v4, p0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Lax/X1/L;

    .line 36
    .line 37
    invoke-virtual {v4, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_16

    .line 43
    :cond_2a
    iget-object v0, p0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 44
    .line 45
    new-instance v1, Lax/X1/E;

    .line 46
    .line 47
    new-instance v3, Lax/X1/K$a;

    .line 48
    .line 49
    invoke-direct {v3, p0}, Lax/X1/K$a;-><init>(Lax/X1/K;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v3}, Lax/X1/E;-><init>(Lax/X1/D;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Lax/X1/K;->s:Lax/X1/L;

    .line 60
    .line 61
    return-void
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private B(I)Z
    .registers 4

    .line 1
    iget v0, p0, Lax/X1/K;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_14

    .line 5
    .line 6
    iget-boolean v0, p0, Lax/X1/K;->p:Z

    .line 7
    .line 8
    if-nez v0, :cond_14

    .line 9
    .line 10
    iget-object v0, p0, Lax/X1/K;->k:Landroid/util/SparseBooleanArray;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_13

    .line 18
    .line 19
    goto :goto_14

    .line 20
    :cond_13
    return v1

    .line 21
    :cond_14
    :goto_14
    const/4 p1, 0x1

    .line 22
    return p1
.end method

.method public static synthetic g()[Lax/q1/r;
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-instance v1, Lax/X1/K;

    .line 3
    .line 4
    sget-object v2, Lax/N1/t$a;->a:Lax/N1/t$a;

    .line 5
    .line 6
    invoke-direct {v1, v0, v2}, Lax/X1/K;-><init>(ILax/N1/t$a;)V

    .line 7
    .line 8
    .line 9
    new-array v0, v0, [Lax/q1/r;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic h(Lax/X1/K;)Landroid/util/SparseArray;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/X1/K;->i:Landroid/util/SparseArray;

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

.method static synthetic i(Lax/X1/K;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/X1/K;->o:I

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

.method static synthetic j(Lax/X1/K;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/X1/K;->p:Z

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

.method static synthetic l(Lax/X1/K;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/X1/K;->p:Z

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

.method static synthetic m(Lax/X1/K;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/X1/K;->o:I

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

.method static synthetic n(Lax/X1/K;)I
    .registers 3

    .line 1
    iget v0, p0, Lax/X1/K;->o:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lax/X1/K;->o:I

    .line 6
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
    .line 22
.end method

.method static synthetic o(Lax/X1/K;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/X1/K;->a:I

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

.method static synthetic p(Lax/X1/K;)Ljava/util/List;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/X1/K;->d:Ljava/util/List;

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

.method static synthetic q(Lax/X1/K;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/X1/K;->u:I

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

.method static synthetic r(Lax/X1/K;)Lax/X1/L;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/X1/K;->s:Lax/X1/L;

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

.method static synthetic s(Lax/X1/K;Lax/X1/L;)Lax/X1/L;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/X1/K;->s:Lax/X1/L;

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

.method static synthetic t(Lax/X1/K;)Lax/X1/L$c;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/X1/K;->g:Lax/X1/L$c;

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

.method static synthetic u(Lax/X1/K;)Lax/q1/t;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/X1/K;->n:Lax/q1/t;

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

.method static synthetic v(Lax/X1/K;)Landroid/util/SparseBooleanArray;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/X1/K;->j:Landroid/util/SparseBooleanArray;

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

.method static synthetic w(Lax/X1/K;)Landroid/util/SparseBooleanArray;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/X1/K;->k:Landroid/util/SparseBooleanArray;

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

.method private x(Lax/q1/s;)Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/S0/G;->g()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    rsub-int v1, v1, 0x24b8

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/16 v3, 0xbc

    .line 17
    .line 18
    if-ge v1, v3, :cond_29

    .line 19
    .line 20
    iget-object v1, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 21
    .line 22
    invoke-virtual {v1}, Lax/S0/G;->a()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-lez v1, :cond_24

    .line 27
    .line 28
    iget-object v4, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 29
    .line 30
    invoke-virtual {v4}, Lax/S0/G;->g()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-static {v0, v4, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    :cond_24
    iget-object v4, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 38
    .line 39
    invoke-virtual {v4, v0, v1}, Lax/S0/G;->Z([BI)V

    .line 40
    .line 41
    .line 42
    :cond_29
    :goto_29
    iget-object v1, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 43
    .line 44
    invoke-virtual {v1}, Lax/S0/G;->a()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-ge v1, v3, :cond_48

    .line 49
    .line 50
    iget-object v1, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 51
    .line 52
    invoke-virtual {v1}, Lax/S0/G;->j()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    rsub-int v4, v1, 0x24b8

    .line 57
    .line 58
    invoke-interface {p1, v0, v1, v4}, Lax/q1/s;->c([BII)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v5, -0x1

    .line 63
    if-ne v4, v5, :cond_41

    .line 64
    .line 65
    return v2

    .line 66
    :cond_41
    iget-object v5, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 67
    .line 68
    add-int/2addr v1, v4

    .line 69
    invoke-virtual {v5, v1}, Lax/S0/G;->a0(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_29

    .line 73
    :cond_48
    const/4 p1, 0x1

    .line 74
    return p1
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

.method private y()I
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/S0/G;->j()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 14
    .line 15
    invoke-virtual {v2}, Lax/S0/G;->f()[B

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2, v0, v1}, Lax/X1/M;->a([BII)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v3, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lax/S0/G;->b0(I)V

    .line 26
    .line 27
    .line 28
    add-int/lit16 v3, v2, 0xbc

    .line 29
    .line 30
    if-le v3, v1, :cond_38

    .line 31
    .line 32
    iget v1, p0, Lax/X1/K;->t:I

    .line 33
    .line 34
    sub-int/2addr v2, v0

    .line 35
    add-int/2addr v1, v2

    .line 36
    iput v1, p0, Lax/X1/K;->t:I

    .line 37
    .line 38
    iget v0, p0, Lax/X1/K;->a:I

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    if-ne v0, v2, :cond_37

    .line 42
    .line 43
    const/16 v0, 0x178

    .line 44
    .line 45
    if-gt v1, v0, :cond_2f

    .line 46
    .line 47
    goto :goto_37

    .line 48
    :cond_2f
    const-string v0, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-static {v0, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    throw v0

    .line 56
    :cond_37
    :goto_37
    return v3

    .line 57
    :cond_38
    const/4 v0, 0x0

    .line 58
    iput v0, p0, Lax/X1/K;->t:I

    .line 59
    .line 60
    return v3
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private z(J)V
    .registers 16

    .line 1
    iget-boolean v0, p0, Lax/X1/K;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_48

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lax/X1/K;->q:Z

    .line 7
    .line 8
    iget-object v0, p0, Lax/X1/K;->l:Lax/X1/I;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/X1/I;->b()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v4, v0, v2

    .line 20
    .line 21
    if-eqz v4, :cond_38

    .line 22
    .line 23
    new-instance v5, Lax/X1/H;

    .line 24
    .line 25
    iget-object v0, p0, Lax/X1/K;->l:Lax/X1/I;

    .line 26
    .line 27
    invoke-virtual {v0}, Lax/X1/I;->c()Lax/S0/M;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v0, p0, Lax/X1/K;->l:Lax/X1/I;

    .line 32
    .line 33
    invoke-virtual {v0}, Lax/X1/I;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v7

    .line 37
    iget v11, p0, Lax/X1/K;->u:I

    .line 38
    .line 39
    iget v12, p0, Lax/X1/K;->c:I

    .line 40
    .line 41
    move-wide v9, p1

    .line 42
    invoke-direct/range {v5 .. v12}, Lax/X1/H;-><init>(Lax/S0/M;JJII)V

    .line 43
    .line 44
    .line 45
    iput-object v5, p0, Lax/X1/K;->m:Lax/X1/H;

    .line 46
    .line 47
    iget-object p1, p0, Lax/X1/K;->n:Lax/q1/t;

    .line 48
    .line 49
    invoke-virtual {v5}, Lax/q1/e;->b()Lax/q1/N;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p1, p2}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_38
    iget-object p1, p0, Lax/X1/K;->n:Lax/q1/t;

    .line 58
    .line 59
    new-instance p2, Lax/q1/N$b;

    .line 60
    .line 61
    iget-object v0, p0, Lax/X1/K;->l:Lax/X1/I;

    .line 62
    .line 63
    invoke-virtual {v0}, Lax/X1/I;->b()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-direct {p2, v0, v1}, Lax/q1/N$b;-><init>(J)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, p2}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    return-void
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


# virtual methods
.method public a(Lax/q1/t;)V
    .registers 4

    .line 1
    iget v0, p0, Lax/X1/K;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_e

    .line 6
    .line 7
    new-instance v0, Lax/N1/u;

    .line 8
    .line 9
    iget-object v1, p0, Lax/X1/K;->h:Lax/N1/t$a;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lax/N1/u;-><init>(Lax/q1/t;Lax/N1/t$a;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_e
    iput-object p1, p0, Lax/X1/K;->n:Lax/q1/t;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b(JJ)V
    .registers 15

    .line 1
    iget p1, p0, Lax/X1/K;->a:I

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, p2, :cond_9

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 p1, 0x0

    .line 11
    :goto_a
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lax/X1/K;->d:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 p2, 0x0

    .line 21
    :goto_14
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    if-ge p2, p1, :cond_4d

    .line 24
    .line 25
    iget-object v4, p0, Lax/X1/K;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lax/S0/M;

    .line 32
    .line 33
    invoke-virtual {v4}, Lax/S0/M;->f()J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v9, v5, v7

    .line 43
    .line 44
    if-nez v9, :cond_2f

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    goto :goto_30

    .line 48
    :cond_2f
    const/4 v5, 0x0

    .line 49
    :goto_30
    if-nez v5, :cond_45

    .line 50
    .line 51
    invoke-virtual {v4}, Lax/S0/M;->d()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    cmp-long v9, v5, v7

    .line 56
    .line 57
    if-eqz v9, :cond_44

    .line 58
    .line 59
    cmp-long v7, v5, v2

    .line 60
    .line 61
    if-eqz v7, :cond_44

    .line 62
    .line 63
    cmp-long v2, v5, p3

    .line 64
    .line 65
    if-eqz v2, :cond_44

    .line 66
    .line 67
    const/4 v5, 0x1

    .line 68
    goto :goto_45

    .line 69
    :cond_44
    const/4 v5, 0x0

    .line 70
    :cond_45
    :goto_45
    if-eqz v5, :cond_4a

    .line 71
    .line 72
    invoke-virtual {v4, p3, p4}, Lax/S0/M;->i(J)V

    .line 73
    .line 74
    .line 75
    :cond_4a
    add-int/lit8 p2, p2, 0x1

    .line 76
    .line 77
    goto :goto_14

    .line 78
    :cond_4d
    cmp-long p1, p3, v2

    .line 79
    .line 80
    if-eqz p1, :cond_58

    .line 81
    .line 82
    iget-object p1, p0, Lax/X1/K;->m:Lax/X1/H;

    .line 83
    .line 84
    if-eqz p1, :cond_58

    .line 85
    .line 86
    invoke-virtual {p1, p3, p4}, Lax/q1/e;->h(J)V

    .line 87
    .line 88
    .line 89
    :cond_58
    iget-object p1, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Lax/S0/G;->X(I)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lax/X1/K;->f:Landroid/util/SparseIntArray;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    :goto_63
    iget-object p2, p0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 101
    .line 102
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-ge p1, p2, :cond_79

    .line 107
    .line 108
    iget-object p2, p0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 109
    .line 110
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    check-cast p2, Lax/X1/L;

    .line 115
    .line 116
    invoke-interface {p2}, Lax/X1/L;->b()V

    .line 117
    .line 118
    .line 119
    add-int/lit8 p1, p1, 0x1

    .line 120
    .line 121
    goto :goto_63

    .line 122
    :cond_79
    iput v1, p0, Lax/X1/K;->t:I

    .line 123
    .line 124
    return-void
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

.method public c(Lax/q1/s;)Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X1/K;->e:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x3ac

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {p1, v0, v2, v1}, Lax/q1/s;->p([BII)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_d
    const/16 v3, 0xbc

    .line 15
    .line 16
    if-ge v1, v3, :cond_29

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_12
    const/4 v4, 0x5

    .line 20
    if-ge v3, v4, :cond_24

    .line 21
    .line 22
    mul-int/lit16 v4, v3, 0xbc

    .line 23
    .line 24
    add-int/2addr v4, v1

    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    const/16 v5, 0x47

    .line 28
    .line 29
    if-eq v4, v5, :cond_21

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_d

    .line 34
    :cond_21
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_12

    .line 37
    :cond_24
    invoke-interface {p1, v1}, Lax/q1/s;->n(I)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_29
    return v2
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

.method public d()V
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

.method public synthetic e()Lax/q1/r;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->b(Lax/q1/r;)Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public f(Lax/q1/s;Lax/q1/M;)I
    .registers 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-interface {v1}, Lax/q1/s;->getLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget v5, v0, Lax/X1/K;->a:I

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x2

    .line 16
    if-ne v5, v8, :cond_13

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    goto :goto_14

    .line 20
    :cond_13
    const/4 v5, 0x0

    .line 21
    :goto_14
    iget-boolean v9, v0, Lax/X1/K;->p:Z

    .line 22
    .line 23
    const-wide/16 v10, -0x1

    .line 24
    .line 25
    if-eqz v9, :cond_5b

    .line 26
    .line 27
    cmp-long v9, v3, v10

    .line 28
    .line 29
    if-eqz v9, :cond_31

    .line 30
    .line 31
    if-nez v5, :cond_31

    .line 32
    .line 33
    iget-object v9, v0, Lax/X1/K;->l:Lax/X1/I;

    .line 34
    .line 35
    invoke-virtual {v9}, Lax/X1/I;->d()Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-nez v9, :cond_31

    .line 40
    .line 41
    iget-object v3, v0, Lax/X1/K;->l:Lax/X1/I;

    .line 42
    .line 43
    iget v4, v0, Lax/X1/K;->u:I

    .line 44
    .line 45
    invoke-virtual {v3, v1, v2, v4}, Lax/X1/I;->e(Lax/q1/s;Lax/q1/M;I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    return v1

    .line 50
    :cond_31
    invoke-direct {v0, v3, v4}, Lax/X1/K;->z(J)V

    .line 51
    .line 52
    .line 53
    iget-boolean v9, v0, Lax/X1/K;->r:Z

    .line 54
    .line 55
    if-eqz v9, :cond_4a

    .line 56
    .line 57
    iput-boolean v7, v0, Lax/X1/K;->r:Z

    .line 58
    .line 59
    const-wide/16 v12, 0x0

    .line 60
    .line 61
    invoke-virtual {v0, v12, v13, v12, v13}, Lax/X1/K;->b(JJ)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Lax/q1/s;->getPosition()J

    .line 65
    .line 66
    .line 67
    move-result-wide v14

    .line 68
    cmp-long v9, v14, v12

    .line 69
    .line 70
    if-eqz v9, :cond_4a

    .line 71
    .line 72
    iput-wide v12, v2, Lax/q1/M;->a:J

    .line 73
    .line 74
    return v6

    .line 75
    :cond_4a
    iget-object v9, v0, Lax/X1/K;->m:Lax/X1/H;

    .line 76
    .line 77
    if-eqz v9, :cond_5b

    .line 78
    .line 79
    invoke-virtual {v9}, Lax/q1/e;->d()Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_5b

    .line 84
    .line 85
    iget-object v3, v0, Lax/X1/K;->m:Lax/X1/H;

    .line 86
    .line 87
    invoke-virtual {v3, v1, v2}, Lax/q1/e;->c(Lax/q1/s;Lax/q1/M;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    return v1

    .line 92
    :cond_5b
    invoke-direct/range {p0 .. p1}, Lax/X1/K;->x(Lax/q1/s;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_8a

    .line 97
    .line 98
    :goto_61
    iget-object v1, v0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-ge v7, v1, :cond_88

    .line 105
    .line 106
    iget-object v1, v0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 107
    .line 108
    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lax/X1/L;

    .line 113
    .line 114
    instance-of v2, v1, Lax/X1/y;

    .line 115
    .line 116
    if-eqz v2, :cond_85

    .line 117
    .line 118
    check-cast v1, Lax/X1/y;

    .line 119
    .line 120
    invoke-virtual {v1, v5}, Lax/X1/y;->d(Z)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_85

    .line 125
    .line 126
    new-instance v2, Lax/S0/G;

    .line 127
    .line 128
    invoke-direct {v2}, Lax/S0/G;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2, v6}, Lax/X1/y;->c(Lax/S0/G;I)V

    .line 132
    .line 133
    .line 134
    :cond_85
    add-int/lit8 v7, v7, 0x1

    .line 135
    .line 136
    goto :goto_61

    .line 137
    :cond_88
    const/4 v1, -0x1

    .line 138
    return v1

    .line 139
    :cond_8a
    invoke-direct {v0}, Lax/X1/K;->y()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v2, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 144
    .line 145
    invoke-virtual {v2}, Lax/S0/G;->j()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-le v1, v2, :cond_97

    .line 150
    .line 151
    return v7

    .line 152
    :cond_97
    iget-object v5, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 153
    .line 154
    invoke-virtual {v5}, Lax/S0/G;->v()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    const/high16 v9, 0x800000

    .line 159
    .line 160
    and-int/2addr v9, v5

    .line 161
    if-eqz v9, :cond_a8

    .line 162
    .line 163
    iget-object v2, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 164
    .line 165
    invoke-virtual {v2, v1}, Lax/S0/G;->b0(I)V

    .line 166
    .line 167
    .line 168
    return v7

    .line 169
    :cond_a8
    const/high16 v9, 0x400000

    .line 170
    .line 171
    and-int/2addr v9, v5

    .line 172
    if-eqz v9, :cond_af

    .line 173
    .line 174
    const/4 v9, 0x1

    .line 175
    goto :goto_b0

    .line 176
    :cond_af
    const/4 v9, 0x0

    .line 177
    :goto_b0
    const v12, 0x1fff00

    .line 178
    .line 179
    .line 180
    and-int/2addr v12, v5

    .line 181
    shr-int/lit8 v12, v12, 0x8

    .line 182
    .line 183
    and-int/lit8 v13, v5, 0x20

    .line 184
    .line 185
    if-eqz v13, :cond_bc

    .line 186
    .line 187
    const/4 v13, 0x1

    .line 188
    goto :goto_bd

    .line 189
    :cond_bc
    const/4 v13, 0x0

    .line 190
    :goto_bd
    and-int/lit8 v14, v5, 0x10

    .line 191
    .line 192
    if-eqz v14, :cond_ca

    .line 193
    .line 194
    iget-object v14, v0, Lax/X1/K;->i:Landroid/util/SparseArray;

    .line 195
    .line 196
    invoke-virtual {v14, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    check-cast v14, Lax/X1/L;

    .line 201
    .line 202
    goto :goto_cb

    .line 203
    :cond_ca
    const/4 v14, 0x0

    .line 204
    :goto_cb
    if-nez v14, :cond_d3

    .line 205
    .line 206
    iget-object v2, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 207
    .line 208
    invoke-virtual {v2, v1}, Lax/S0/G;->b0(I)V

    .line 209
    .line 210
    .line 211
    return v7

    .line 212
    :cond_d3
    iget v15, v0, Lax/X1/K;->a:I

    .line 213
    .line 214
    if-eq v15, v8, :cond_f9

    .line 215
    .line 216
    and-int/lit8 v5, v5, 0xf

    .line 217
    .line 218
    iget-object v15, v0, Lax/X1/K;->f:Landroid/util/SparseIntArray;

    .line 219
    .line 220
    const/16 v16, 0x0

    .line 221
    .line 222
    add-int/lit8 v7, v5, -0x1

    .line 223
    .line 224
    invoke-virtual {v15, v12, v7}, Landroid/util/SparseIntArray;->get(II)I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    iget-object v15, v0, Lax/X1/K;->f:Landroid/util/SparseIntArray;

    .line 229
    .line 230
    invoke-virtual {v15, v12, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 231
    .line 232
    .line 233
    if-ne v7, v5, :cond_f0

    .line 234
    .line 235
    iget-object v2, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 236
    .line 237
    invoke-virtual {v2, v1}, Lax/S0/G;->b0(I)V

    .line 238
    .line 239
    .line 240
    return v16

    .line 241
    :cond_f0
    add-int/2addr v7, v6

    .line 242
    and-int/lit8 v7, v7, 0xf

    .line 243
    .line 244
    if-eq v5, v7, :cond_fb

    .line 245
    .line 246
    invoke-interface {v14}, Lax/X1/L;->b()V

    .line 247
    .line 248
    .line 249
    goto :goto_fb

    .line 250
    :cond_f9
    const/16 v16, 0x0

    .line 251
    .line 252
    :cond_fb
    :goto_fb
    if-eqz v13, :cond_117

    .line 253
    .line 254
    iget-object v5, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 255
    .line 256
    invoke-virtual {v5}, Lax/S0/G;->M()I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    iget-object v7, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 261
    .line 262
    invoke-virtual {v7}, Lax/S0/G;->M()I

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    and-int/lit8 v7, v7, 0x40

    .line 267
    .line 268
    if-eqz v7, :cond_10f

    .line 269
    .line 270
    const/4 v7, 0x2

    .line 271
    goto :goto_110

    .line 272
    :cond_10f
    const/4 v7, 0x0

    .line 273
    :goto_110
    or-int/2addr v9, v7

    .line 274
    iget-object v7, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 275
    .line 276
    sub-int/2addr v5, v6

    .line 277
    invoke-virtual {v7, v5}, Lax/S0/G;->c0(I)V

    .line 278
    .line 279
    .line 280
    :cond_117
    iget-boolean v5, v0, Lax/X1/K;->p:Z

    .line 281
    .line 282
    invoke-direct {v0, v12}, Lax/X1/K;->B(I)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_12e

    .line 287
    .line 288
    iget-object v7, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 289
    .line 290
    invoke-virtual {v7, v1}, Lax/S0/G;->a0(I)V

    .line 291
    .line 292
    .line 293
    iget-object v7, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 294
    .line 295
    invoke-interface {v14, v7, v9}, Lax/X1/L;->c(Lax/S0/G;I)V

    .line 296
    .line 297
    .line 298
    iget-object v7, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 299
    .line 300
    invoke-virtual {v7, v2}, Lax/S0/G;->a0(I)V

    .line 301
    .line 302
    .line 303
    :cond_12e
    iget v2, v0, Lax/X1/K;->a:I

    .line 304
    .line 305
    if-eq v2, v8, :cond_13e

    .line 306
    .line 307
    if-nez v5, :cond_13e

    .line 308
    .line 309
    iget-boolean v2, v0, Lax/X1/K;->p:Z

    .line 310
    .line 311
    if-eqz v2, :cond_13e

    .line 312
    .line 313
    cmp-long v2, v3, v10

    .line 314
    .line 315
    if-eqz v2, :cond_13e

    .line 316
    .line 317
    iput-boolean v6, v0, Lax/X1/K;->r:Z

    .line 318
    .line 319
    :cond_13e
    iget-object v2, v0, Lax/X1/K;->e:Lax/S0/G;

    .line 320
    .line 321
    invoke-virtual {v2, v1}, Lax/S0/G;->b0(I)V

    .line 322
    .line 323
    .line 324
    return v16
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

.method public synthetic k()Ljava/util/List;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->a(Lax/q1/r;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
