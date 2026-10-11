.class Lax/o3/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o3/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/o3/b;->k()Lax/o3/b$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/o3/b;


# direct methods
.method constructor <init>(Lax/o3/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o3/b$a;->a:Lax/o3/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public a(Ljava/io/File;Ljava/io/IOException;)V
    .registers 4

    .line 1
    iget-object p2, p0, Lax/o3/b$a;->a:Lax/o3/b;

    .line 2
    .line 3
    const-string v0, "file descriptor closed"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lax/o3/b;->a(Lax/o3/b;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lax/o3/b$a;->a:Lax/o3/b;

    .line 9
    .line 10
    invoke-static {p2, p1}, Lax/o3/b;->c(Lax/o3/b;Ljava/io/File;)Lax/o3/b$c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_19

    .line 15
    .line 16
    const/4 p2, 0x2

    .line 17
    invoke-static {p1, p2}, Lax/o3/b$c;->j(Lax/o3/b$c;I)I

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lax/o3/b$a;->a:Lax/o3/b;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-static {p2, p1, v0}, Lax/o3/b;->d(Lax/o3/b;Lax/o3/b$c;Z)V

    .line 24
    .line 25
    .line 26
    :cond_19
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
.end method

.method public b(Ljava/io/File;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o3/b$a;->a:Lax/o3/b;

    .line 2
    .line 3
    const-string v1, "file descriptor opened"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lax/o3/b;->a(Lax/o3/b;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/o3/b$a;->a:Lax/o3/b;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lax/o3/b;->c(Lax/o3/b;Ljava/io/File;)Lax/o3/b$c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_13

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-static {p1, v0}, Lax/o3/b$c;->j(Lax/o3/b$c;I)I

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
    .line 22
.end method
