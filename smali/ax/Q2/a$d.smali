.class public Lax/Q2/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Q2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Z

.field c:Landroid/os/Bundle;

.field final synthetic d:Lax/Q2/a;


# direct methods
.method constructor <init>(Lax/Q2/a;Ljava/lang/String;Z)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/Q2/a$d;->d:Lax/Q2/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/Q2/a$d;->a:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p1, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/Q2/a$d;->c:Landroid/os/Bundle;

    .line 14
    .line 15
    iput-boolean p3, p0, Lax/Q2/a$d;->b:Z

    .line 16
    .line 17
    return-void
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
.method public a(Ljava/lang/String;J)Lax/Q2/a$d;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Q2/a$d;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/Q2/a$d;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public c()V
    .registers 4

    .line 1
    invoke-static {}, Lax/Q2/c;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    goto :goto_39

    .line 8
    :cond_7
    iget-object v0, p0, Lax/Q2/a$d;->d:Lax/Q2/a;

    .line 9
    .line 10
    invoke-static {v0}, Lax/Q2/a;->a(Lax/Q2/a;)Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lax/t3/j;->n(Landroid/content/Context;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_14

    .line 19
    .line 20
    goto :goto_39

    .line 21
    :cond_14
    iget-boolean v0, p0, Lax/Q2/a$d;->b:Z

    .line 22
    .line 23
    if-nez v0, :cond_19

    .line 24
    .line 25
    goto :goto_39

    .line 26
    :cond_19
    iget-object v0, p0, Lax/Q2/a$d;->d:Lax/Q2/a;

    .line 27
    .line 28
    invoke-static {v0}, Lax/Q2/a;->b(Lax/Q2/a;)Lax/v3/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_22

    .line 33
    .line 34
    goto :goto_39

    .line 35
    :cond_22
    :try_start_22
    iget-object v0, p0, Lax/Q2/a$d;->d:Lax/Q2/a;

    .line 36
    .line 37
    invoke-static {v0}, Lax/Q2/a;->b(Lax/Q2/a;)Lax/v3/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lax/Q2/a$d;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v2, p0, Lax/Q2/a$d;->c:Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lax/v3/a;->c(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_2f} :catch_30

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_30
    invoke-static {}, Lax/Q2/a;->c()Ljava/util/logging/Logger;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "ERROR SEND APP EVENT"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_39
    return-void
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
