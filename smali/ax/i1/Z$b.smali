.class public final Lax/i1/Z$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/i1/O;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i1/Z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lax/U0/g$a;

.field private b:Lax/i1/T$a;

.field private c:Lax/b1/z;

.field private d:Lax/m1/m;

.field private e:I

.field private f:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Lax/n1/c;",
            ">;"
        }
    .end annotation
.end field

.field private g:I

.field private h:Lax/P0/v;


# direct methods
.method public constructor <init>(Lax/U0/g$a;)V
    .registers 3

    .line 1
    new-instance v0, Lax/q1/n;

    invoke-direct {v0}, Lax/q1/n;-><init>()V

    invoke-direct {p0, p1, v0}, Lax/i1/Z$b;-><init>(Lax/U0/g$a;Lax/q1/x;)V

    return-void
.end method

.method public constructor <init>(Lax/U0/g$a;Lax/i1/T$a;)V
    .registers 9

    .line 3
    new-instance v3, Lax/b1/l;

    invoke-direct {v3}, Lax/b1/l;-><init>()V

    new-instance v4, Lax/m1/k;

    invoke-direct {v4}, Lax/m1/k;-><init>()V

    const/high16 v5, 0x100000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lax/i1/Z$b;-><init>(Lax/U0/g$a;Lax/i1/T$a;Lax/b1/z;Lax/m1/m;I)V

    return-void
.end method

.method public constructor <init>(Lax/U0/g$a;Lax/i1/T$a;Lax/b1/z;Lax/m1/m;I)V
    .registers 6

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lax/i1/Z$b;->a:Lax/U0/g$a;

    .line 6
    iput-object p2, p0, Lax/i1/Z$b;->b:Lax/i1/T$a;

    .line 7
    iput-object p3, p0, Lax/i1/Z$b;->c:Lax/b1/z;

    .line 8
    iput-object p4, p0, Lax/i1/Z$b;->d:Lax/m1/m;

    .line 9
    iput p5, p0, Lax/i1/Z$b;->e:I

    return-void
.end method

.method public constructor <init>(Lax/U0/g$a;Lax/q1/x;)V
    .registers 4

    .line 2
    new-instance v0, Lax/i1/a0;

    invoke-direct {v0, p2}, Lax/i1/a0;-><init>(Lax/q1/x;)V

    invoke-direct {p0, p1, v0}, Lax/i1/Z$b;-><init>(Lax/U0/g$a;Lax/i1/T$a;)V

    return-void
.end method

.method public static synthetic h(Lax/q1/x;Lax/Z0/I1;)Lax/i1/T;
    .registers 2

    .line 1
    new-instance p1, Lax/i1/d;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Lax/i1/d;-><init>(Lax/q1/x;)V

    .line 4
    .line 5
    .line 6
    return-object p1
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


# virtual methods
.method public synthetic a(Lax/N1/t$a;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/i1/E;->d(Lax/i1/F$a;Lax/N1/t$a;)Lax/i1/F$a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(I)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/i1/E;->b(Lax/i1/F$a;I)Lax/i1/F$a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Z)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/i1/E;->a(Lax/i1/F$a;Z)Lax/i1/F$a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lax/m1/f$a;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/i1/E;->c(Lax/i1/F$a;Lax/m1/f$a;)Lax/i1/F$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lax/P0/y;)Lax/i1/F;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/Z$b;->i(Lax/P0/y;)Lax/i1/Z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public bridge synthetic f(Lax/b1/z;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/Z$b;->k(Lax/b1/z;)Lax/i1/Z$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public bridge synthetic g(Lax/m1/m;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/Z$b;->l(Lax/m1/m;)Lax/i1/Z$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public i(Lax/P0/y;)Lax/i1/Z;
    .registers 14

    .line 1
    iget-object v0, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/i1/Z;

    .line 7
    .line 8
    iget-object v3, p0, Lax/i1/Z$b;->a:Lax/U0/g$a;

    .line 9
    .line 10
    iget-object v4, p0, Lax/i1/Z$b;->b:Lax/i1/T$a;

    .line 11
    .line 12
    iget-object v0, p0, Lax/i1/Z$b;->c:Lax/b1/z;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lax/b1/z;->a(Lax/P0/y;)Lax/b1/w;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    iget-object v6, p0, Lax/i1/Z$b;->d:Lax/m1/m;

    .line 19
    .line 20
    iget v7, p0, Lax/i1/Z$b;->e:I

    .line 21
    .line 22
    iget v8, p0, Lax/i1/Z$b;->g:I

    .line 23
    .line 24
    iget-object v9, p0, Lax/i1/Z$b;->h:Lax/P0/v;

    .line 25
    .line 26
    iget-object v10, p0, Lax/i1/Z$b;->f:Lax/q7/u;

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    move-object v2, p1

    .line 30
    invoke-direct/range {v1 .. v11}, Lax/i1/Z;-><init>(Lax/P0/y;Lax/U0/g$a;Lax/i1/T$a;Lax/b1/w;Lax/m1/m;IILax/P0/v;Lax/q7/u;Lax/i1/Z$a;)V

    .line 31
    .line 32
    .line 33
    return-object v1
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

.method j(ILax/P0/v;)Lax/i1/Z$b;
    .registers 3

    .line 1
    iput p1, p0, Lax/i1/Z$b;->g:I

    .line 2
    .line 3
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/P0/v;

    .line 8
    .line 9
    iput-object p1, p0, Lax/i1/Z$b;->h:Lax/P0/v;

    .line 10
    .line 11
    return-object p0
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

.method public k(Lax/b1/z;)Lax/i1/Z$b;
    .registers 3

    .line 1
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/S0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/b1/z;

    .line 8
    .line 9
    iput-object p1, p0, Lax/i1/Z$b;->c:Lax/b1/z;

    .line 10
    .line 11
    return-object p0
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

.method public l(Lax/m1/m;)Lax/i1/Z$b;
    .registers 3

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/S0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/m1/m;

    .line 8
    .line 9
    iput-object p1, p0, Lax/i1/Z$b;->d:Lax/m1/m;

    .line 10
    .line 11
    return-object p0
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
