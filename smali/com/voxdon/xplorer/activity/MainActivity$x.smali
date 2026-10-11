.class Lcom/voxdon/xplorer/activity/MainActivity$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/n$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/activity/MainActivity;->J2(ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/voxdon/xplorer/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/MainActivity;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$x;->b:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/activity/MainActivity$x;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public G(Lax/a3/n;)V
    .registers 2

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
    .line 22
.end method

.method public P(Lax/a3/n;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$x;->b:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/a;->s()Lax/n/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$x;->b:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/a;->s()Lax/n/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/voxdon/xplorer/activity/MainActivity;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/MainActivity;->I2()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "ads_rewarded_dialog"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lax/Q2/a;->o(Ljava/lang/String;)Lax/Q2/a$d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "unit"

    .line 32
    .line 33
    const-string v1, "desktop_reward"

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v0, "from"

    .line 40
    .line 41
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity$x;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v0, "result"

    .line 48
    .line 49
    const-string v1, "confirm"

    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lax/Q2/a$d;->c()V

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
.end method

.method public Z(Lax/a3/n;)V
    .registers 4

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "ads_rewarded_dialog"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lax/Q2/a;->o(Ljava/lang/String;)Lax/Q2/a$d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "unit"

    .line 12
    .line 13
    const-string v1, "desktop_reward"

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "from"

    .line 20
    .line 21
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MainActivity$x;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "result"

    .line 28
    .line 29
    const-string v1, "cancel"

    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lax/Q2/a$d;->c()V

    .line 36
    .line 37
    .line 38
    return-void
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
