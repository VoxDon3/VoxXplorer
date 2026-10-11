.class Lax/o3/n$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/net/nsd/NsdManager$DiscoveryListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/o3/n;->F(Lax/o3/n$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/o3/n$i;

.field final synthetic b:Lax/o3/n;


# direct methods
.method constructor <init>(Lax/o3/n;Lax/o3/n$i;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 2
    .line 3
    iput-object p2, p0, Lax/o3/n$c;->a:Lax/o3/n$i;

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
.method public onDiscoveryStarted(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-static {}, Lax/o3/n;->b()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "on discovery started"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 11
    .line 12
    invoke-static {p1}, Lax/o3/n;->m(Lax/o3/n;)Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eq p1, p0, :cond_12

    .line 17
    .line 18
    goto :goto_33

    .line 19
    :cond_12
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 20
    .line 21
    invoke-static {p1}, Lax/o3/n;->n(Lax/o3/n;)Lax/o3/n$h;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object v0, Lax/o3/n$h;->e0:Lax/o3/n$h;

    .line 26
    .line 27
    if-ne p1, v0, :cond_22

    .line 28
    .line 29
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 30
    .line 31
    invoke-static {p1, p0}, Lax/o3/n;->p(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 36
    .line 37
    invoke-static {p1}, Lax/o3/n;->n(Lax/o3/n;)Lax/o3/n$h;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v0, Lax/o3/n$h;->c0:Lax/o3/n$h;

    .line 42
    .line 43
    if-ne p1, v0, :cond_33

    .line 44
    .line 45
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 46
    .line 47
    sget-object v0, Lax/o3/n$h;->d0:Lax/o3/n$h;

    .line 48
    .line 49
    invoke-static {p1, v0}, Lax/o3/n;->o(Lax/o3/n;Lax/o3/n$h;)Lax/o3/n$h;

    .line 50
    .line 51
    .line 52
    :cond_33
    :goto_33
    return-void
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

.method public onDiscoveryStopped(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-static {}, Lax/o3/n;->b()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "on discovery stopped"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lax/o3/n;->l(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onServiceFound(Landroid/net/nsd/NsdServiceInfo;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lax/o3/n;->r(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 11
    .line 12
    invoke-static {v0}, Lax/o3/n;->i(Lax/o3/n;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2b

    .line 17
    .line 18
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 19
    .line 20
    invoke-static {v0}, Lax/o3/n;->i(Lax/o3/n;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2b

    .line 33
    .line 34
    invoke-static {}, Lax/o3/n;->b()Ljava/util/logging/Logger;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "Ignore this device (same name)"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-static {}, Lax/o3/n;->b()Ljava/util/logging/Logger;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "onService Found :  "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lax/X2/Q;->p1()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_55

    .line 77
    .line 78
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 79
    .line 80
    iget-object v1, p0, Lax/o3/n$c;->a:Lax/o3/n$i;

    .line 81
    .line 82
    invoke-static {v0, p1, p0, v1}, Lax/o3/n;->c(Lax/o3/n;Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_55
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 87
    .line 88
    iget-object v1, p0, Lax/o3/n$c;->a:Lax/o3/n$i;

    .line 89
    .line 90
    invoke-static {v0, p1, p0, v1}, Lax/o3/n;->d(Lax/o3/n;Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V

    .line 91
    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public onServiceLost(Landroid/net/nsd/NsdServiceInfo;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lax/o3/n;->r(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 11
    .line 12
    invoke-static {v0}, Lax/o3/n;->i(Lax/o3/n;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2b

    .line 17
    .line 18
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 19
    .line 20
    invoke-static {v0}, Lax/o3/n;->i(Lax/o3/n;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2b

    .line 33
    .line 34
    invoke-static {}, Lax/o3/n;->b()Ljava/util/logging/Logger;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "Ignore this device on lost (same name)"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-static {}, Lax/o3/n;->b()Ljava/util/logging/Logger;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "onService Lost :  "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, ","

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v3, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 71
    .line 72
    invoke-static {v3, p1}, Lax/o3/n;->e(Lax/o3/n;Landroid/net/nsd/NsdServiceInfo;)Ljava/net/InetAddress;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getPort()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object v0, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 101
    .line 102
    invoke-static {v0}, Lax/o3/n;->m(Lax/o3/n;)Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 107
    .line 108
    invoke-static {v1, p1}, Lax/o3/n;->f(Lax/o3/n;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 112
    .line 113
    invoke-static {v1}, Lax/o3/n;->a(Lax/o3/n;)Landroid/os/Handler;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v2, Lax/o3/n$c$a;

    .line 118
    .line 119
    invoke-direct {v2, p0, v0, p1}, Lax/o3/n$c$a;-><init>(Lax/o3/n$c;Landroid/net/nsd/NsdManager$DiscoveryListener;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v1, v2}, Lax/u3/B;->Z(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 123
    .line 124
    .line 125
    return-void
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public onStartDiscoveryFailed(Ljava/lang/String;I)V
    .registers 5

    .line 1
    invoke-static {}, Lax/o3/n;->b()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "onStartDiscovery failed : "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 26
    .line 27
    invoke-static {p1, p0}, Lax/o3/n;->l(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public onStopDiscoveryFailed(Ljava/lang/String;I)V
    .registers 5

    .line 1
    invoke-static {}, Lax/o3/n;->b()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "onStopDiscovery failed : "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 26
    .line 27
    invoke-static {p1}, Lax/o3/n;->m(Lax/o3/n;)Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-ne p1, p0, :cond_37

    .line 32
    .line 33
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 34
    .line 35
    invoke-static {p1}, Lax/o3/n;->n(Lax/o3/n;)Lax/o3/n$h;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object p2, Lax/o3/n$h;->e0:Lax/o3/n$h;

    .line 40
    .line 41
    if-ne p1, p2, :cond_37

    .line 42
    .line 43
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 44
    .line 45
    sget-object p2, Lax/o3/n$h;->d0:Lax/o3/n$h;

    .line 46
    .line 47
    invoke-static {p1, p2}, Lax/o3/n;->o(Lax/o3/n;Lax/o3/n$h;)Lax/o3/n$h;

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lax/o3/n$c;->b:Lax/o3/n;

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    invoke-static {p1, p2}, Lax/o3/n;->q(Lax/o3/n;Lax/o3/n$j;)Lax/o3/n$j;

    .line 54
    .line 55
    .line 56
    :cond_37
    return-void
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method
