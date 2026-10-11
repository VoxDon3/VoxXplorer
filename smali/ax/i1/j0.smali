.class public final Lax/i1/j0;
.super Lax/i1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i1/j0$b;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final h:Lax/U0/k;

.field private final i:Lax/U0/g$a;

.field private final j:Lax/P0/v;

.field private final k:J

.field private final l:Lax/m1/m;

.field private final m:Z

.field private final n:Lax/P0/N;

.field private final o:Lax/P0/y;

.field private final p:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Lax/n1/c;",
            ">;"
        }
    .end annotation
.end field

.field private q:Lax/U0/z;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lax/P0/y$k;Lax/U0/g$a;JLax/m1/m;ZLjava/lang/Object;Lax/q7/u;)V
    .registers 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lax/P0/y$k;",
            "Lax/U0/g$a;",
            "J",
            "Lax/m1/m;",
            "Z",
            "Ljava/lang/Object;",
            "Lax/q7/u<",
            "Lax/n1/c;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lax/i1/a;-><init>()V

    .line 3
    iput-object p3, p0, Lax/i1/j0;->i:Lax/U0/g$a;

    .line 4
    iput-wide p4, p0, Lax/i1/j0;->k:J

    .line 5
    iput-object p6, p0, Lax/i1/j0;->l:Lax/m1/m;

    .line 6
    iput-boolean p7, p0, Lax/i1/j0;->m:Z

    .line 7
    new-instance p3, Lax/P0/y$c;

    invoke-direct {p3}, Lax/P0/y$c;-><init>()V

    sget-object p6, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 8
    invoke-virtual {p3, p6}, Lax/P0/y$c;->f(Landroid/net/Uri;)Lax/P0/y$c;

    move-result-object p3

    iget-object p6, p2, Lax/P0/y$k;->a:Landroid/net/Uri;

    .line 9
    invoke-virtual {p6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p3, p6}, Lax/P0/y$c;->c(Ljava/lang/String;)Lax/P0/y$c;

    move-result-object p3

    .line 10
    invoke-static {p2}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object p6

    invoke-virtual {p3, p6}, Lax/P0/y$c;->d(Ljava/util/List;)Lax/P0/y$c;

    move-result-object p3

    move-object/from16 p6, p8

    .line 11
    invoke-virtual {p3, p6}, Lax/P0/y$c;->e(Ljava/lang/Object;)Lax/P0/y$c;

    move-result-object p3

    .line 12
    invoke-virtual {p3}, Lax/P0/y$c;->a()Lax/P0/y;

    move-result-object v7

    iput-object v7, p0, Lax/i1/j0;->o:Lax/P0/y;

    .line 13
    new-instance p3, Lax/P0/v$b;

    invoke-direct {p3}, Lax/P0/v$b;-><init>()V

    iget-object p6, p2, Lax/P0/y$k;->b:Ljava/lang/String;

    const-string p7, "text/x-unknown"

    .line 14
    invoke-static {p6, p7}, Lax/q7/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/String;

    invoke-virtual {p3, p6}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object p3

    iget-object p6, p2, Lax/P0/y$k;->c:Ljava/lang/String;

    .line 15
    invoke-virtual {p3, p6}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object p3

    iget p6, p2, Lax/P0/y$k;->d:I

    .line 16
    invoke-virtual {p3, p6}, Lax/P0/v$b;->A0(I)Lax/P0/v$b;

    move-result-object p3

    iget p6, p2, Lax/P0/y$k;->e:I

    .line 17
    invoke-virtual {p3, p6}, Lax/P0/v$b;->w0(I)Lax/P0/v$b;

    move-result-object p3

    iget-object p6, p2, Lax/P0/y$k;->f:Ljava/lang/String;

    .line 18
    invoke-virtual {p3, p6}, Lax/P0/v$b;->l0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object p3

    .line 19
    iget-object p6, p2, Lax/P0/y$k;->g:Ljava/lang/String;

    if-eqz p6, :cond_64

    move-object p1, p6

    :cond_64
    invoke-virtual {p3, p1}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    move-result-object p1

    iput-object p1, p0, Lax/i1/j0;->j:Lax/P0/v;

    .line 21
    new-instance p1, Lax/U0/k$b;

    invoke-direct {p1}, Lax/U0/k$b;-><init>()V

    iget-object p2, p2, Lax/P0/y$k;->a:Landroid/net/Uri;

    .line 22
    invoke-virtual {p1, p2}, Lax/U0/k$b;->i(Landroid/net/Uri;)Lax/U0/k$b;

    move-result-object p1

    const/4 p2, 0x1

    .line 23
    invoke-virtual {p1, p2}, Lax/U0/k$b;->b(I)Lax/U0/k$b;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lax/U0/k$b;->a()Lax/U0/k;

    move-result-object p1

    iput-object p1, p0, Lax/i1/j0;->h:Lax/U0/k;

    .line 25
    new-instance v0, Lax/i1/h0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-wide v1, p4

    invoke-direct/range {v0 .. v7}, Lax/i1/h0;-><init>(JZZZLjava/lang/Object;Lax/P0/y;)V

    iput-object v0, p0, Lax/i1/j0;->n:Lax/P0/N;

    move-object/from16 p1, p9

    .line 26
    iput-object p1, p0, Lax/i1/j0;->p:Lax/q7/u;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lax/P0/y$k;Lax/U0/g$a;JLax/m1/m;ZLjava/lang/Object;Lax/q7/u;Lax/i1/j0$a;)V
    .registers 11

    .line 1
    invoke-direct/range {p0 .. p9}, Lax/i1/j0;-><init>(Ljava/lang/String;Lax/P0/y$k;Lax/U0/g$a;JLax/m1/m;ZLjava/lang/Object;Lax/q7/u;)V

    return-void
.end method


# virtual methods
.method protected A(Lax/U0/z;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/i1/j0;->q:Lax/U0/z;

    .line 2
    .line 3
    iget-object p1, p0, Lax/i1/j0;->n:Lax/P0/N;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lax/i1/a;->B(Lax/P0/N;)V

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

.method protected C()V
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

.method public e(Lax/i1/C;)V
    .registers 2

    .line 1
    check-cast p1, Lax/i1/i0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/i1/i0;->w()V

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

.method public i(Lax/i1/F$b;Lax/m1/b;J)Lax/i1/C;
    .registers 16

    .line 1
    new-instance v0, Lax/i1/i0;

    .line 2
    .line 3
    iget-object v1, p0, Lax/i1/j0;->h:Lax/U0/k;

    .line 4
    .line 5
    iget-object v2, p0, Lax/i1/j0;->i:Lax/U0/g$a;

    .line 6
    .line 7
    iget-object v3, p0, Lax/i1/j0;->q:Lax/U0/z;

    .line 8
    .line 9
    iget-object v4, p0, Lax/i1/j0;->j:Lax/P0/v;

    .line 10
    .line 11
    iget-wide v5, p0, Lax/i1/j0;->k:J

    .line 12
    .line 13
    iget-object v7, p0, Lax/i1/j0;->l:Lax/m1/m;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lax/i1/a;->u(Lax/i1/F$b;)Lax/i1/N$a;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    iget-boolean v9, p0, Lax/i1/j0;->m:Z

    .line 20
    .line 21
    iget-object p1, p0, Lax/i1/j0;->p:Lax/q7/u;

    .line 22
    .line 23
    if-eqz p1, :cond_20

    .line 24
    .line 25
    invoke-interface {p1}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lax/n1/c;

    .line 30
    .line 31
    :goto_1e
    move-object v10, p1

    .line 32
    goto :goto_22

    .line 33
    :cond_20
    const/4 p1, 0x0

    .line 34
    goto :goto_1e

    .line 35
    :goto_22
    invoke-direct/range {v0 .. v10}, Lax/i1/i0;-><init>(Lax/U0/k;Lax/U0/g$a;Lax/U0/z;Lax/P0/v;JLax/m1/m;Lax/i1/N$a;ZLax/n1/c;)V

    .line 36
    .line 37
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

.method public j()Lax/P0/y;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i1/j0;->o:Lax/P0/y;

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

.method public k()V
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
