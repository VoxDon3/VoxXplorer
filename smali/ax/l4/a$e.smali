.class final Lax/l4/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b0/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/l4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lax/b0/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lax/l4/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/l4/a$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lax/l4/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/l4/a$g<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Lax/b0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/b0/d;Lax/l4/a$d;Lax/l4/a$g;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/b0/d<",
            "TT;>;",
            "Lax/l4/a$d<",
            "TT;>;",
            "Lax/l4/a$g<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/l4/a$e;->c:Lax/b0/d;

    .line 5
    .line 6
    iput-object p2, p0, Lax/l4/a$e;->a:Lax/l4/a$d;

    .line 7
    .line 8
    iput-object p3, p0, Lax/l4/a$e;->b:Lax/l4/a$g;

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


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/l4/a$f;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lax/l4/a$f;

    .line 7
    .line 8
    invoke-interface {v0}, Lax/l4/a$f;->l()Lax/l4/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Lax/l4/b;->b(Z)V

    .line 14
    .line 15
    .line 16
    :cond_f
    iget-object v0, p0, Lax/l4/a$e;->b:Lax/l4/a$g;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lax/l4/a$g;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/l4/a$e;->c:Lax/b0/d;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Lax/b0/d;->a(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
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

.method public b()Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/l4/a$e;->c:Lax/b0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b0/d;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_2f

    .line 8
    .line 9
    iget-object v0, p0, Lax/l4/a$e;->a:Lax/l4/a$d;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/l4/a$d;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x2

    .line 16
    const-string v2, "FactoryPools"

    .line 17
    .line 18
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2f

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "Created new "

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :cond_2f
    instance-of v1, v0, Lax/l4/a$f;

    .line 49
    .line 50
    if-eqz v1, :cond_3e

    .line 51
    .line 52
    move-object v1, v0

    .line 53
    check-cast v1, Lax/l4/a$f;

    .line 54
    .line 55
    invoke-interface {v1}, Lax/l4/a$f;->l()Lax/l4/b;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v1, v2}, Lax/l4/b;->b(Z)V

    .line 61
    .line 62
    .line 63
    :cond_3e
    return-object v0
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
