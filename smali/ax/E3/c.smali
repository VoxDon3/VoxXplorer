.class public Lax/E3/c;
.super Lax/E3/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/box/androidsdk/content/models/BoxSession;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/E3/a;-><init>(Lcom/box/androidsdk/content/models/BoxSession;)V

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


# virtual methods
.method public c(Ljava/lang/String;Ljava/lang/String;)Lcom/box/androidsdk/content/requests/BoxRequestsFolder$CreateFolder;
    .registers 6

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/requests/BoxRequestsFolder$CreateFolder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/E3/c;->g()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lax/E3/a;->a:Lcom/box/androidsdk/content/models/BoxSession;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, v1, v2}, Lcom/box/androidsdk/content/requests/BoxRequestsFolder$CreateFolder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public d(Ljava/lang/String;)Lcom/box/androidsdk/content/requests/BoxRequestsFolder$DeleteFolder;
    .registers 5

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/requests/BoxRequestsFolder$DeleteFolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/E3/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lax/E3/a;->a:Lcom/box/androidsdk/content/models/BoxSession;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2}, Lcom/box/androidsdk/content/requests/BoxRequestsFolder$DeleteFolder;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method protected e(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/E3/c;->g()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object v0, v1, v2

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    aput-object p1, v1, v0

    .line 13
    .line 14
    const-string p1, "%s/%s"

    .line 15
    .line 16
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
.end method

.method protected f(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lax/E3/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, "/items"

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method protected g()Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/E3/a;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object v0, v1, v2

    .line 10
    .line 11
    const-string v0, "%s/folders"

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public h(Ljava/lang/String;)Lcom/box/androidsdk/content/requests/BoxRequestsFolder$GetFolderItems;
    .registers 5

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/requests/BoxRequestsFolder$GetFolderItems;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/E3/c;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lax/E3/a;->a:Lcom/box/androidsdk/content/models/BoxSession;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2}, Lcom/box/androidsdk/content/requests/BoxRequestsFolder$GetFolderItems;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public i(Ljava/lang/String;)Lcom/box/androidsdk/content/requests/BoxRequestsFolder$UpdateFolder;
    .registers 5

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/requests/BoxRequestsFolder$UpdateFolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/E3/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lax/E3/a;->a:Lcom/box/androidsdk/content/models/BoxSession;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2}, Lcom/box/androidsdk/content/requests/BoxRequestsFolder$UpdateFolder;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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
