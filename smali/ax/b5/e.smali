.class public Lax/b5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/T4/o;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/b5/e$a;,
        Lax/b5/e$c;,
        Lax/b5/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/T4/o;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final i0:Lax/W4/l;


# instance fields
.field protected c0:Lax/b5/e$b;

.field protected final d0:Lax/T4/p;

.field protected e0:Z

.field protected transient f0:I

.field protected g0:Lax/b5/k;

.field protected h0:Ljava/lang/String;

.field protected q:Lax/b5/e$b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/W4/l;

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lax/W4/l;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/b5/e;->i0:Lax/W4/l;

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

.method public constructor <init>()V
    .registers 2

    .line 1
    sget-object v0, Lax/b5/e;->i0:Lax/W4/l;

    invoke-direct {p0, v0}, Lax/b5/e;-><init>(Lax/T4/p;)V

    return-void
.end method

.method public constructor <init>(Lax/T4/p;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lax/b5/e$a;->c0:Lax/b5/e$a;

    iput-object v0, p0, Lax/b5/e;->q:Lax/b5/e$b;

    .line 4
    sget-object v0, Lax/b5/d;->g0:Lax/b5/d;

    iput-object v0, p0, Lax/b5/e;->c0:Lax/b5/e$b;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/b5/e;->e0:Z

    .line 6
    iput-object p1, p0, Lax/b5/e;->d0:Lax/T4/p;

    .line 7
    sget-object p1, Lax/T4/o;->d:Lax/b5/k;

    invoke-virtual {p0, p1}, Lax/b5/e;->k(Lax/b5/k;)Lax/b5/e;

    return-void
.end method


# virtual methods
.method public a(Lax/T4/g;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/e;->c0:Lax/b5/e$b;

    .line 2
    .line 3
    iget v1, p0, Lax/b5/e;->f0:I

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, Lax/b5/e$b;->b(Lax/T4/g;I)V

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

.method public b(Lax/T4/g;I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/e;->q:Lax/b5/e$b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b5/e$b;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    iget v0, p0, Lax/b5/e;->f0:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    iput v0, p0, Lax/b5/e;->f0:I

    .line 14
    .line 15
    :cond_e
    if-lez p2, :cond_18

    .line 16
    .line 17
    iget-object p2, p0, Lax/b5/e;->q:Lax/b5/e$b;

    .line 18
    .line 19
    iget v0, p0, Lax/b5/e;->f0:I

    .line 20
    .line 21
    invoke-interface {p2, p1, v0}, Lax/b5/e$b;->b(Lax/T4/g;I)V

    .line 22
    .line 23
    .line 24
    goto :goto_1d

    .line 25
    :cond_18
    const/16 p2, 0x20

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lax/T4/g;->A(C)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    const/16 p2, 0x5d

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lax/T4/g;->A(C)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public c(Lax/T4/g;I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/e;->c0:Lax/b5/e$b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b5/e$b;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    iget v0, p0, Lax/b5/e;->f0:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    iput v0, p0, Lax/b5/e;->f0:I

    .line 14
    .line 15
    :cond_e
    if-lez p2, :cond_18

    .line 16
    .line 17
    iget-object p2, p0, Lax/b5/e;->c0:Lax/b5/e$b;

    .line 18
    .line 19
    iget v0, p0, Lax/b5/e;->f0:I

    .line 20
    .line 21
    invoke-interface {p2, p1, v0}, Lax/b5/e$b;->b(Lax/T4/g;I)V

    .line 22
    .line 23
    .line 24
    goto :goto_1d

    .line 25
    :cond_18
    const/16 p2, 0x20

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lax/T4/g;->A(C)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    const/16 p2, 0x7d

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lax/T4/g;->A(C)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public d(Lax/T4/g;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/b5/e;->e0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/b5/e;->h0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lax/T4/g;->H(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/b5/e;->g0:Lax/b5/k;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/b5/k;->d()C

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1, v0}, Lax/T4/g;->A(C)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method public e(Lax/T4/g;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/e;->q:Lax/b5/e$b;

    .line 2
    .line 3
    iget v1, p0, Lax/b5/e;->f0:I

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, Lax/b5/e$b;->b(Lax/T4/g;I)V

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

.method public f(Lax/T4/g;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/e;->q:Lax/b5/e$b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b5/e$b;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    iget v0, p0, Lax/b5/e;->f0:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lax/b5/e;->f0:I

    .line 14
    .line 15
    :cond_e
    const/16 v0, 0x5b

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lax/T4/g;->A(C)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method public g(Lax/T4/g;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/T4/g;->A(C)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/b5/e;->c0:Lax/b5/e$b;

    .line 7
    .line 8
    invoke-interface {p1}, Lax/b5/e$b;->a()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_13

    .line 13
    .line 14
    iget p1, p0, Lax/b5/e;->f0:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    iput p1, p0, Lax/b5/e;->f0:I

    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
    .line 22
.end method

.method public h(Lax/T4/g;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/e;->g0:Lax/b5/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/b5/k;->c()C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1, v0}, Lax/T4/g;->A(C)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/b5/e;->c0:Lax/b5/e$b;

    .line 11
    .line 12
    iget v1, p0, Lax/b5/e;->f0:I

    .line 13
    .line 14
    invoke-interface {v0, p1, v1}, Lax/b5/e$b;->b(Lax/T4/g;I)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public i(Lax/T4/g;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/e;->d0:Lax/T4/p;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lax/T4/g;->F(Lax/T4/p;)V

    .line 6
    .line 7
    .line 8
    :cond_7
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

.method public j(Lax/T4/g;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b5/e;->g0:Lax/b5/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/b5/k;->b()C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1, v0}, Lax/T4/g;->A(C)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/b5/e;->q:Lax/b5/e$b;

    .line 11
    .line 12
    iget v1, p0, Lax/b5/e;->f0:I

    .line 13
    .line 14
    invoke-interface {v0, p1, v1}, Lax/b5/e$b;->b(Lax/T4/g;I)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public k(Lax/b5/k;)Lax/b5/e;
    .registers 4

    .line 1
    iput-object p1, p0, Lax/b5/e;->g0:Lax/b5/k;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, " "

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lax/b5/k;->d()C

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lax/b5/e;->h0:Ljava/lang/String;

    .line 28
    .line 29
    return-object p0
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
