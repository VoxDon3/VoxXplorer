.class Lax/L2/b$a;
.super Lax/L2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/L2/b;->b(Ljava/util/UUID;Lax/C2/D;)Lax/L2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lax/C2/D;

.field final synthetic d0:Ljava/util/UUID;


# direct methods
.method constructor <init>(Lax/C2/D;Ljava/util/UUID;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/L2/b$a;->c0:Lax/C2/D;

    .line 2
    .line 3
    iput-object p2, p0, Lax/L2/b$a;->d0:Ljava/util/UUID;

    .line 4
    .line 5
    invoke-direct {p0}, Lax/L2/b;-><init>()V

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


# virtual methods
.method g()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/L2/b$a;->c0:Lax/C2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/C2/D;->o()Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/k2/u;->e()V

    .line 8
    .line 9
    .line 10
    :try_start_9
    iget-object v1, p0, Lax/L2/b$a;->c0:Lax/C2/D;

    .line 11
    .line 12
    iget-object v2, p0, Lax/L2/b$a;->d0:Ljava/util/UUID;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p0, v1, v2}, Lax/L2/b;->a(Lax/C2/D;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lax/k2/u;->A()V
    :try_end_17
    .catchall {:try_start_9 .. :try_end_17} :catchall_20

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lax/k2/u;->i()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lax/L2/b$a;->c0:Lax/C2/D;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lax/L2/b;->f(Lax/C2/D;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_20
    move-exception v1

    .line 34
    invoke-virtual {v0}, Lax/k2/u;->i()V

    .line 35
    .line 36
    .line 37
    throw v1
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
