.class Lcom/alphainventor/filemanager/shizuku/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alphainventor/filemanager/shizuku/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/alphainventor/filemanager/shizuku/c;


# direct methods
.method constructor <init>(Lcom/alphainventor/filemanager/shizuku/c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/alphainventor/filemanager/shizuku/c$c;->q:Lcom/alphainventor/filemanager/shizuku/c;

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
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 3

    .line 1
    if-eqz p2, :cond_28

    .line 2
    .line 3
    invoke-interface {p2}, Landroid/os/IBinder;->pingBinder()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_28

    .line 8
    .line 9
    invoke-static {p2}, Lcom/alphainventor/filemanager/shizuku/a$a;->r(Landroid/os/IBinder;)Lcom/alphainventor/filemanager/shizuku/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p2, p0, Lcom/alphainventor/filemanager/shizuku/c$c;->q:Lcom/alphainventor/filemanager/shizuku/c;

    .line 14
    .line 15
    invoke-static {p2, p1}, Lcom/alphainventor/filemanager/shizuku/c;->h(Lcom/alphainventor/filemanager/shizuku/c;Lcom/alphainventor/filemanager/shizuku/a;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/alphainventor/filemanager/shizuku/c$c;->q:Lcom/alphainventor/filemanager/shizuku/c;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/alphainventor/filemanager/shizuku/c;->e(Lcom/alphainventor/filemanager/shizuku/c;)Lax/Q2/i$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_28

    .line 25
    .line 26
    iget-object p1, p0, Lcom/alphainventor/filemanager/shizuku/c$c;->q:Lcom/alphainventor/filemanager/shizuku/c;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/alphainventor/filemanager/shizuku/c;->e(Lcom/alphainventor/filemanager/shizuku/c;)Lax/Q2/i$a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Lax/Q2/i$a;->b()V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/alphainventor/filemanager/shizuku/c$c;->q:Lcom/alphainventor/filemanager/shizuku/c;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-static {p1, p2}, Lcom/alphainventor/filemanager/shizuku/c;->f(Lcom/alphainventor/filemanager/shizuku/c;Lax/Q2/i$a;)Lax/Q2/i$a;

    .line 39
    .line 40
    .line 41
    :cond_28
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lcom/alphainventor/filemanager/shizuku/c$c;->q:Lcom/alphainventor/filemanager/shizuku/c;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/alphainventor/filemanager/shizuku/c;->i(Lcom/alphainventor/filemanager/shizuku/c;)V

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
